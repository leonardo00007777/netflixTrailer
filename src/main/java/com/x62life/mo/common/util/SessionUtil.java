package com.x62life.mo.common.util;

import com.x62life.mo.model.member.MbMaster;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

public class SessionUtil {

	public static MbMaster currentSessionMember(){
		ServletRequestAttributes serviceRequestAttr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpSession session = serviceRequestAttr.getRequest().getSession();
		
		return (MbMaster)session.getAttribute("sessionMember");
	}
	
	
}
