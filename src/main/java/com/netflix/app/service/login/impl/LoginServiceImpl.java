package com.netflix.app.service.login.impl;

import com.netflix.app.dao.login.LoginDao;
import com.netflix.app.model.login.LoginProcess;
import com.netflix.app.service.login.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Resource
    LoginDao loginDao;

    @Override
    public List<LoginProcess> loginInfo(Map<String,Object> paramMap){
        List<LoginProcess> userInfoList = loginDao.loginProcess(paramMap);

        return userInfoList;
    }
}
