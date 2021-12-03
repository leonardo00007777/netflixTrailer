package com.x62life.mo.dao.common;

import com.x62life.mo.model.common.SSOUser;

public interface SSOUserDao {
	
	int checkUserExists(SSOUser ssoUser);
	
	SSOUser selectUser(SSOUser ssoUser);
}
