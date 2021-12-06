package com.x62life.mo.dao.login;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.x62life.mo.model.login.LoginProcess;

@Repository("loginDao")
public interface LoginDao {
    public List<LoginProcess> loginProcess(Map<String,Object> paramMap);
}
