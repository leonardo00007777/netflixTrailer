package com.x62life.mo.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.x62life.mo.common.constants.Constants;
import com.x62life.mo.common.constants.StoreConsts;
import com.x62life.mo.common.util.TextUtil;

/**
 * Controller Interceptor Class Interceptor for Timing / Login / Authorization
 * @author sys4u
 */
public class ControllerInterceptor extends HandlerInterceptorAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(Constants.DEFAULT_LOGGER_CATEGORY);
    
    private static final ThreadLocal<Long> START_TIME_THREAD_LOCAL = new ThreadLocal<Long>(){
        @Override
        protected Long initialValue(){
            return 0L;
        }
    };
    @Autowired
    private ApplicationContext applicationContext;
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        
        START_TIME_THREAD_LOCAL.set(System.nanoTime());
        
        //-------------------------------------
        //이메일 진입시 ip체크
        //-------------------------------------
        String checkIp = checkIp(request);
        String path = TextUtil.nullToSpace((String)request.getServletPath());
        String queryStr = TextUtil.nullToSpace((String)request.getQueryString());
        String stonUseYn = TextUtil.nullToSpace((String)request.getHeader(StoreConsts.STON_USE_YN_PARAM));
        String stonUseYnParam = TextUtil.nullToSpace((String)request.getParameter((StoreConsts.STON_USE_YN_PARAM)));
        
        request.setAttribute(StoreConsts.STON_USE_YN_PARAM, stonUseYn);
        
        LOGGER.debug(">>>> PreHandle for checkip : [{}]" + checkIp);
        LOGGER.debug(">>>> PreHandle for path : [{}]" + path);
        LOGGER.debug(">>>> PreHandle for stonUseYn : [{}]" + stonUseYn);
        LOGGER.debug(">>>> request.getScheme() : [{}]" + request.getScheme());
     
        if (!(path.startsWith("/resources/"))){
            System.out.println("================================================");
            System.out.println("======     start Interceptor : ControllerInterceptor / preHandle       =====");
            System.out.println("================================================");        	
        }
                
                
        //--------------------------------------------------------------------------------
        //모바일은 무조건 https 처리. order의 경우 외부에서 콜백들어오는 부분이 있어 예외처리
        //---------------------------------------------------------------------------------
        if ("http".equals(request.getScheme()) 
                && !(path.startsWith("/WEB-INF/"))
                && !(path.startsWith("/api/"))
                && !(path.indexOf("/order/") > -1) 
                && !(path.indexOf("/orderGiftCard/") > -1) 
                && !(path.indexOf("/G.do") > -1)
                && !(path.indexOf("/common/") > -1)
                && !(path.indexOf("/email/") > -1)
                && !(path.indexOf("/emailGiftCard/") > -1)
                && !(path.indexOf("/search/") > -1 && path.indexOf("/search/getSearchMain") < 0)
                && !(path.indexOf("/search/") > -1 && path.indexOf("/search/getSearchApi") < 0)
                && ("N".equals(StoreConsts.IS_NGINX))
                ) {
            
        	System.out.println(">>>> PreHandle for request.getRequestURL() : [{}] " + request.getRequestURL() +
            					    " >>>> " + request.getRequestURL().toString().replaceAll("http:", "https:"));
            
            if (request.getQueryString() != null) {
                queryStr = "?" + request.getQueryString();
            }
            
            System.out.println(">>>>>>>>>>>redirect11 : {}" +  request.getRequestURL().toString().replaceAll("http:", "https:") + queryStr);
            
            response.sendRedirect(request.getRequestURL().toString().replaceAll("http:", "https:") + queryStr);
            
            return false;
        }
        
        
        
        return true;
    }
    
    private String checkIp(HttpServletRequest request) {
        String currentRemoteAddr = request.getHeader("X-Forwarded-For");
        if(currentRemoteAddr==null || currentRemoteAddr.length()==0 || "unknown".equalsIgnoreCase(currentRemoteAddr)){
            currentRemoteAddr = request.getHeader("Proxy-Client-IP");
        }
        if(currentRemoteAddr==null || currentRemoteAddr.length()==0 || "unknown".equalsIgnoreCase(currentRemoteAddr)){
            currentRemoteAddr = request.getHeader("WL-Proxy-Client-IP");
        }    
        if(currentRemoteAddr==null || currentRemoteAddr.length()==0 || "unknown".equalsIgnoreCase(currentRemoteAddr)){
            currentRemoteAddr = request.getHeader("HTTP_CLIENT_IP");
        }    
        if(currentRemoteAddr==null || currentRemoteAddr.length()==0 || "unknown".equalsIgnoreCase(currentRemoteAddr)){
            currentRemoteAddr = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if(currentRemoteAddr==null || currentRemoteAddr.length()==0 || "unknown".equalsIgnoreCase(currentRemoteAddr)){
            currentRemoteAddr = request.getRemoteAddr();
        }
        return currentRemoteAddr;
    }
    
}