<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp"
%>

<%-- message call test  ------------------------------------------------------------------------  --%>
 <spring:message code="error.common"></spring:message>
<spring:message code="error.minlength" arguments="테스트글자, 1"></spring:message> 
