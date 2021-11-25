package com.x62life.mo.dao;

import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.model.member.MbMaster;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("loginDao")
public interface LoginDao {
    public List<LoginProcess> loginProcess(Map<String,Object> paramMap);
}