<%@ page import="org.apache.commons.lang.StringUtils" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%
	//--------------------------------------------------------------------------------------
	// Header 
	//--------------------------------------------------------------------------------------
	response.setHeader("Pragma", "No-cache");
	response.setDateHeader("Expires", 0);
	response.setHeader("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate");

	//--------------------------------------------------------------------------------------
	// Path 
	//--------------------------------------------------------------------------------------
 	String _jsUrl 		   =  "/resources/js/";
	String _cssUrl 	   = "/resources/css/";
	String _httpUrl 	   = "/resources/html/";
	String _libUrl 		   = "/resources/lib/";
	String _imgUrl 	   = "/resources/";
	String _servletUrl = "/m/";
	String _dummStr = ""; 

/* 	String _jsUrl 		   =  "http://192.168.0.91:7080/happyfncFoMo/resources/js/";
    String _cssUrl 	   =   "http://192.168.0.91:7080/happyfncFoMo/resources/css/";
    String _httpUrl 	   =   "http://192.168.0.91:7080/happyfncFoMo/resources/html/";
    String _libUrl 		   =   "http://192.168.0.91:7080/happyfncFoMo/resources/lib/";
    String _imgUrl 	   =   "http://192.168.0.91:7080/happyfncFoMo/resources/";
    String _servletUrl =   "http://192.168.0.91:7080/happyfncFoMo/m/";    
    String _dummStr =   "";  
 */
 
	//--------------------------------------------------------------------------------------
	// Session 
	//--------------------------------------------------------------------------------------
	boolean _isLoginYn = false;
	
	HttpSession ss = request.getSession(); 
	if(ss != null && ss.getAttribute("isLogin") != null && !ss.getAttribute("isLogin").equals("")){
		_isLoginYn = true;
	}
	
	String _sessionMemId = (String) ss.getAttribute("memid");
	String _sessionMemCd = (String) ss.getAttribute("memcd");
	String _sessionMemNm = (String) ss.getAttribute("memname62");
	String _sessionMemStcd = (String) ss.getAttribute("memstcd");
	
%>



  	