package com.x62life.mo.service.impl.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x62life.mo.dao.common.SSOUserDao;
import com.x62life.mo.model.common.SSOUser;
import com.x62life.mo.service.common.SSOService;

@Service
public class SSOServiceImpl implements SSOService {
	
	@Autowired
	private SSOUserDao ssoServiceDao;
	
	public void setSsoServiceDao(SSOUserDao ssoServiceDao) {
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
