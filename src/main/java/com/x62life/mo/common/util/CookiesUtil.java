package com.x62life.mo.common.util;
/**
 * 
 */
import javax.servlet.http.*;
/**
 * @author shanth
 *
 */
public abstract class CookiesUtil {
	


	    public CookiesUtil() {
	    	super();
	    }

	    public static Cookie getCookie(HttpServletRequest request, String name) {
	        Cookie cookies[] = request.getCookies();
	        Cookie returnCookie = null;
	        if(cookies != null)
	        {
	            for(int i = 0; i < cookies.length; i++)
	            {
	                if(!cookies[i].getName().equals(name))
	                    continue;
	                returnCookie = cookies[i];
	                break;
	            }

	        }
	        return returnCookie;
	    }

	    public static String getCookieValue(HttpServletRequest request, String name) {
	        String rtnValue = null;
	        Cookie returnCookie = null;
	        returnCookie = getCookie(request, name);
	        if(returnCookie != null)
	            rtnValue = returnCookie.getValue();
	        return rtnValue;
	    }

	    public static void setCookie(HttpServletRequest request, HttpServletResponse response, String name, String value, int expire) {
	        Cookie targetCookie = getCookie(request, name);
	        if(targetCookie == null)
	            targetCookie = new Cookie(name, value);
	        else
	            targetCookie.setValue(value);
	        targetCookie.setMaxAge(expire * 24 * 60 * 60);
	        response.addCookie(targetCookie);
	    }

	    public static void setCookie(HttpServletRequest request, HttpServletResponse response, String name, String value, int expire, String path) {
	        Cookie targetCookie = getCookie(request, name);
	        if(targetCookie == null)
	            targetCookie = new Cookie(name, value);
	        else
	            targetCookie.setValue(value);
	        targetCookie.setMaxAge(expire * 24 * 60 * 60);
	        targetCookie.setPath(path);
	        response.addCookie(targetCookie);
	    }

	    public static void setCookie(HttpServletRequest request, HttpServletResponse response, String name, String value, int expire, String path, String domain) {
	        Cookie targetCookie = getCookie(request, name);
	        if(targetCookie == null)
	            targetCookie = new Cookie(name, value);
	        else
	            targetCookie.setValue(value);
	        targetCookie.setMaxAge(expire * 24 * 60 * 60);
	        targetCookie.setPath(path);
	        targetCookie.setDomain(domain);
	        response.addCookie(targetCookie);
	    }

	    public static void deleteCookie(HttpServletRequest request, HttpServletResponse response, String name) {
	        Cookie targetCookie = getCookie(request, name);
	        if(targetCookie != null)
	        {
	            
	        	targetCookie.setMaxAge(0);
	            response.addCookie(targetCookie);
	        }
	    }

	    public static void deleteAllCookie(HttpServletRequest request, HttpServletResponse response) {
	        Cookie cookies[] = request.getCookies();
	        Cookie returnCookie = null;
	        if(cookies != null)
	        {
	            for(int i = 0; i < cookies.length; i++)
	            {
	                returnCookie = cookies[i];
	                returnCookie.setMaxAge(0);
	                response.addCookie(returnCookie);
	            }

	        }
	    }
	    
	    
	    public static void setCookie(HttpServletRequest request, HttpServletResponse response, String name, String value, int expire, String path, String domain,Boolean isSecure) {
	        Cookie targetCookie = getCookie(request, name);
	        if(targetCookie == null)
	            targetCookie = new Cookie(name, value);
	        else
	            targetCookie.setValue(value);
	        targetCookie.setMaxAge(expire * 24 * 60 * 60);
	        targetCookie.setPath(path);
	        targetCookie.setDomain(domain);
	        targetCookie.setSecure(isSecure);
	        response.addCookie(targetCookie);
	    }
	}

