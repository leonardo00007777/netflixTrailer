package com.x62life.mo.common.util;

import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.x62life.mo.model.common.SSOUser;

public class SessionUtil {

	public static SSOUser currentSSOUser(){
		ServletRequestAttributes serviceRequestAttr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpSession httpSession = serviceRequestAttr.getRequest().getSession();
		
		return (SSOUser)httpSession.getAttribute("ssoUser");
	}
	
	
}
