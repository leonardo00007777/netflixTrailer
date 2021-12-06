package com.x62life.mo.service.common.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x62life.mo.dao.common.SsoUserDao;
import com.x62life.mo.model.common.SSOUser;
import com.x62life.mo.service.common.SsoService;

@Service
public class SsoServiceImpl implements SsoService {
	
	@Autowired
	private SsoUserDao ssoServiceDao;
	
	public void setSsoServiceDao(SsoUserDao ssoServiceDao) {
		this.ssoServiceDao = ssoServiceDao;
	}

	public boolean isValidSSOUser(SSOUser ssoUser){
		int count = ssoServiceDao.checkUserExists(ssoUser);
		return ( count > 0 ? true : false);
	}

	@Override
	public SSOUser selectUser(SSOUser ssoUser) {
		return ssoServiceDao.selectUser(ssoUser);
	}
	
	
}
