package com.x62life.mo.service.common;

import com.x62life.mo.model.common.SSOUser;

public interface SsoService {
	
	boolean isValidSSOUser(SSOUser ssoUser);
	
	SSOUser selectUser(SSOUser ssoUser);
}
