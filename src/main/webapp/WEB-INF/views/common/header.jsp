<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
    import="java.util.Locale
	           ,org.springframework.context.i18n.LocaleContextHolder
	          "
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ include file="/WEB-INF/views/common/env.jsp"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, viewport-fit=cover">
	<meta http-equiv="Content-Script-Type" content="text/javascript">
	<meta http-equiv="Content-Style-Type" content="text/css">
	<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
	<meta name="format-detection" content="telephone=no">

	<title>
	자연이랑	
	</title>
	<meta name="title" content="자연이랑" />
	<%-- <meta name="description" content="${PAGEDESC}" /> --%>
   <!-- ------------------------------------------------------------------------------------------------------------------------ -->
   <!--  CSS   -->
   <!-- ------------------------------------------------------------------------------------------------------------------------ -->  
   <link rel="stylesheet" href="<%=_libUrl %>jquery/css/jquery-ui.min.css"/>
   <link rel="stylesheet" href="<%=_libUrl %>swiper/swiper-bundle.min.css"/>
   <link rel="stylesheet" href="<%=_libUrl %>video-js/video-js.min.css"/>
   <link rel="stylesheet" href="<%=_libUrl %>aos/aos.css"/>
   <link rel="stylesheet" href="<%=_cssUrl %>lib.css"/>
   <link rel="stylesheet" href="<%=_cssUrl %>main.css"/>
   <link rel="stylesheet" href="<%=_cssUrl %>home.css"/>
   <link rel="stylesheet" href="<%=_cssUrl %>display.css"/>
   <link rel="stylesheet" href="<%=_cssUrl %>promotion.css"/>
   <link rel="stylesheet" href="<%=_cssUrl %>order.css"/>
   <link rel="stylesheet" href="<%=_cssUrl %>mypage.css"/>
   <link rel="stylesheet" href="<%=_cssUrl%>products.css">
  <!-- ------------------------------------------------------------------------------------------------------------------------ -->
  <!--  js v3.5.1   -->
  <!-- ------------------------------------------------------------------------------------------------------------------------ -->
   <script src="<%=_libUrl %>jquery/jquery.min.js"/>
   <script src="<%=_libUrl %>jquery/jquery-ui.min.js"/>
</head>
<body>
<c:set var="cookieDomain"><spring:eval expression='@configProperties["cookieDomain"]' /></c:set>
<c:set var="devURL"><spring:eval expression='@configProperties["devURL"]' /></c:set>
<c:set var="_jsUrl"><spring:eval expression='@configProperties["_jsUrl"]' /></c:set>
<c:set var="_cssUrl"><spring:eval expression='@configProperties["_cssUrl"]' /></c:set>
<c:set var="_httpUrl"><spring:eval expression='@configProperties["_httpUrl"]' /></c:set>
<c:set var="_libUrl"><spring:eval expression='@configProperties["_libUrl"]' /></c:set>
<c:set var="_imgUrl"><spring:eval expression='@configProperties["_imgUrl"]' /></c:set>
<c:set var="_servletUrl"><spring:eval expression='@configProperties["_servletUrl"]' /></c:set>

<script>
	//---------------------------------------------------------------------------
	// Global  Variables
	//---------------------------------------------------------------------------
	var _cookieDomain = '<c:out value="${cookieDomain}" />';
	var _devURL = '<c:out value="${devURL}" />';	
	var _devURL = '<c:out value="${_jsUrl}" />';
	var _devURL = '<c:out value="${_cssUrl}" />';
	var _devURL = '<c:out value="${_httpUrl}" />';
	var _devURL = '<c:out value="${_libUrl}" />';
	var _devURL = '<c:out value="${_imgUrl}" />';
	var _devURL = '<c:out value="${_servletUrl}" />';
	
	
	
</script>
  
  