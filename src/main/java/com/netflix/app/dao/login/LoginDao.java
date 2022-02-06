package com.netflix.app.dao.login;

import com.netflix.app.model.login.LoginProcess;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("loginDao")
public interface LoginDao {
    public List<LoginProcess> loginProcess(Map<String,Object> paramMap);
}
