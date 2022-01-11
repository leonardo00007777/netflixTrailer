<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.commerce.util.TextUtil"%>
<%@include file="/WEB-INF/jsp/common/env.jsp"%>
<%
	String referer = (String)request.getAttribute("referer") == null ? _baseUrl+"main/main.do?ssoCheck=N" : (String)request.getAttribute("referer");
	if(!referer.contains(request.getServerName())){
		referer = _baseUrl + referer;
	}
	
	// 세션과 쿠키의 mbrNo, ssoMbrNo 가 다른 경우 로그인페이지로 이동
	String goLoginYn = TextUtil.nullToSpace(request.getParameter("goLoginYn"));
	
	if(!"".equals(goLoginYn) && "Y".equals(goLoginYn)){
		referer = _baseUrl + "login/loginForm.do";
	}
%>

<script type="text/javascript">
	localStorage.removeItem("APP_BIOMETRIC_LAYER");
	
	if(common.app.appInfo.isapp){
	    common.app.callLogout();
	    common.resetSessionStorage();
	    setTimeout(function() {
	        self.location.href="<%=referer%>";
	    }, 200);
	
	} else {
	    common.resetSessionStorage();
	    self.location.href="<%=referer%>";
	}
</script>