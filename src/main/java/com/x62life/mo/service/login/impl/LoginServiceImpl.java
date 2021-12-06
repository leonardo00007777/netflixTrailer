package com.x62life.mo.service.login.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.x62life.mo.dao.login.LoginDao;
import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.service.login.LoginService;

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
