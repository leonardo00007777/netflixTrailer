package com.x62life.mo.service.common;

import com.x62life.mo.model.common.SSOUser;

public interface SSOService {
	
	boolean isValidSSOUser(SSOUser ssoUser);
	
	SSOUser selectUser(SSOUser ssoUser);
}
