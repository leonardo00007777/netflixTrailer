package com.netflix.app.service.login;

import com.netflix.app.model.login.LoginProcess;

import java.util.List;
import java.util.Map;

public interface LoginService {
    public List<LoginProcess> loginInfo(Map<String,Object> paramMap);
}
