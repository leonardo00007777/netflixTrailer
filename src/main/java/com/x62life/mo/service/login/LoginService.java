package com.x62life.mo.service.login;

import com.x62life.mo.model.login.LoginProcess;

import java.util.List;
import java.util.Map;

public interface LoginService {
    public List<LoginProcess> loginInfo(Map<String,Object> paramMap);
}
