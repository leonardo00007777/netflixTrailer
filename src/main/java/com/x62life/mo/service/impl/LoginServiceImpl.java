package com.x62life.mo.service.impl;

import com.x62life.mo.dao.LoginDao;
import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.model.member.MbMaster;
import com.x62life.mo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
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
