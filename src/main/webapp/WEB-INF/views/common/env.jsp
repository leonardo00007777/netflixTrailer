<%@ page import="org.apache.commons.lang.StringUtils" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%><%@taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"
%><%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%
	response.setHeader("Pragma", "No-cache");
	response.setDateHeader("Expires", 0);
	response.setHeader("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate");
	
/*  	String _jsUrl 		   =  "/resources/js/";
    String _cssUrl 	   = "/resources/css/";
    String _httpUrl 	   = "/resources/html/";
    String _libUrl 		   = "/resources/lib/";
    String _imgUrl 	   = "/resources/";
    String _servletUrl = "/m/";
    String _dummStr = ""; */
    
    
	String _jsUrl 		   =  "http://192.168.0.91:7080/happyfncFoMo/resources/js/";
    String _cssUrl 	   =   "http://192.168.0.91:7080/happyfncFoMo/resources/css/";
    String _httpUrl 	   =   "http://192.168.0.91:7080/happyfncFoMo/resources/html/";
    String _libUrl 		   =   "http://192.168.0.91:7080/happyfncFoMo/resources/lib/";
    String _imgUrl 	   =   "http://192.168.0.91:7080/happyfncFoMo/resources/";
    String _servletUrl =   "http://192.168.0.91:7080/happyfncFoMo/m/";    
    String _dummStr =   ""; 
%>

 

 <%-- <spring:eval expression="@configProperties['cookieDomain']" var="aaaa"/> --%>
<!-- <script>

	//console.log("cookieDomain===" + "${aaaa}");
	
	// javascript 로 properties 활용

	//<c:set var="aa">
	//    <spring:eval expression="@configProperties['cookieDomain']"/>
	//</c:set>
	// var bb = '<c:out value="${aa}" />';
	//alert("bb= "+bb);
	
</script>
  -->