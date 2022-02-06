package com.netflix.app.common.util.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * mybatis mapper 자동 감지 후 자동으로 서버 재시작이 필요 없이 반영
 *
 * @author sbcoba
 */
public class RefreshableSqlSessionFactoryBean extends SqlSessionFactoryBean implements DisposableBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(RefreshableSqlSessionFactoryBean.class);

    private SqlSessionFactory proxy;
    private int interval = 500;

    private Timer timer;
    private TimerTask task;

    private Resource[] mapperLocations;

    /**
     * 파일 감시 쓰레드가 실행중인지 여부.
     */
    private boolean running = false;

    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r = rwl.readLock();
    private final Lock w = rwl.writeLock();

    @Override
    public void setMapperLocations(Resource[] mapperLocations) {
        super.setMapperLocations(mapperLocations);
        this.mapperLocations = mapperLocations;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    /**
     * @throws Exception
     */
    public void refresh() throws Exception {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("refreshing sqlMapClient.");
        }
        w.lock();
        try {
            super.afterPropertiesSet();

        } finally {
            w.unlock();
        }
    }

    /**
     * 싱글톤 멤버로 SqlMapClient 원본 대신 프록시로 설정하도록 오버라이드.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        super.afterPropertiesSet();

        setRefreshable();
    }

    private void setRefreshable() {
        proxy = (SqlSessionFactory) Proxy.newProxyInstance(
                SqlSessionFactory.class.getClassLoader(),
                new Class[] { SqlSessionFactory.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method,
                            Object[] args) throws Throwable {
                        return method.invoke(getParentObject(), args);
                    }
                });

        task = new RefreshTimer(this);
        timer = new Timer(true);
        resetInterval();

    }

    protected Object getParentObject() throws Exception {
        r.lock();
        try {
            return super.getObject();

        } finally {
            r.unlock();
        }
    }

    @Override
    public SqlSessionFactory getObject() {
        return this.proxy;
    }

    @Override
    public Class<? extends SqlSessionFactory> getObjectType() {
        return this.proxy != null ? this.proxy.getClass() : SqlSessionFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setCheckInterval(int ms) {
        interval = ms;

        if (timer != null) {
            resetInterval();
        }
    }

    private void resetInterval() {
        if (running) {
            timer.cancel();
            running = false;
        }
        if (interval > 0) {
            timer.schedule(task, 0, interval);
            running = true;
        }
    }

    @Override
    public void destroy() throws Exception {
        timer.cancel();
    }
    
    private static class RefreshTimer extends TimerTask{
        private Map<Resource, Long> map = new HashMap<>();
        
        RefreshableSqlSessionFactoryBean bean;
        
        RefreshTimer(RefreshableSqlSessionFactoryBean bean){
            this.bean = bean;
        }

        @Override
        public void run() {
            if (isModified()) {
                try {
                    bean.refresh();
                } catch (Exception e) {
                    LOGGER.error("caught exception", e);
                }
            }
        }

        private boolean isModified() {
            boolean retVal = false;

            if (bean.mapperLocations != null) {
                for (int i = 0; i < bean.mapperLocations.length; i++) {
                    Resource mappingLocation = bean.mapperLocations[i];
                    retVal |= findModifiedResource(mappingLocation);
                }
            }

            return retVal;
        }

        private boolean findModifiedResource(Resource resource) {
            boolean retVal = false;
            List<String> modifiedResources = new ArrayList<>();

            try {
                long modified = resource.lastModified();

                if (map.containsKey(resource)) {
                    long lastModified = map.get(resource)
                            .longValue();

                    if (lastModified != modified) {
                        map.put(resource, new Long(modified));
                        modifiedResources.add(resource.getDescription());
                        retVal = true;
                    }
                } else {
                    map.put(resource, new Long(modified));
                }
            } catch (IOException e) {
                LOGGER.error("caught exception", e);
            }
            if (retVal&& LOGGER.isInfoEnabled()) {
                LOGGER.info("modified files : " + modifiedResources);
            }
            return retVal;
        }
    }
}
