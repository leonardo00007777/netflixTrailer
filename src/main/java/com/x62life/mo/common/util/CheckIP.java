package com.x62life.mo.common.util;

import javax.servlet.http.HttpServletRequest;

public class CheckIP {
	
    
    private String checkIp(HttpServletRequest request) {
        String currentRemoteAddr = request.getHeader("X-Forwarded-For");
        if(currentRemoteAddr==null || currentRemoteAddr.length()==0 || "unknown".equalsIgnoreCase(currentRemoteAddr)){
            currentRemoteAddr = request.getHeader("Proxy-Client-IP");
        }
        if(currentRemoteAddr==null || currentRemoteAddr.length()==0 || "unknown".equalsIgnoreCase(currentRemoteAddr)){
            currentRemoteAddr = request.getHeader("WL-Proxy-Client-IP");
        }    
        if(currentRemoteAddr==null || currentRemoteAddr.length()==0 || "unknown".equalsIgnoreCase(currentRemoteAddr)){
            currentRemoteAddr = request.getHeader("HTTP_CLIENT_IP");
        }    
        if(currentRemoteAddr==null || currentRemoteAddr.length()==0 || "unknown".equalsIgnoreCase(currentRemoteAddr)){
            currentRemoteAddr = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if(currentRemoteAddr==null || currentRemoteAddr.length()==0 || "unknown".equalsIgnoreCase(currentRemoteAddr)){
            currentRemoteAddr = request.getRemoteAddr();
        }
        return currentRemoteAddr;
    }
    
}
