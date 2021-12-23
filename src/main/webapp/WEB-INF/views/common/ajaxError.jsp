<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    import="org.x2framework.spring.core.exception.*
           ,org.x2framework.spring.core.message.MessageResolver"%>
<%@include file="/WEB-INF/views/common/env.jsp"%>
<%
	Exception throwable = (Exception)request.getAttribute(ExceptionResolver.EXCEPTION_KEY);
    
    String systemMessage = null;
    try {
         systemMessage = MessageUtils.getMessage("system.common.exception.message");
    } catch (Exception e) {
        systemMessage = "Unknown Error Occurred.";
    }

    String message = UserDefinedException.class.isAssignableFrom(throwable.getClass())
        ? throwable.getLocalizedMessage() : systemMessage;
        
	response.setStatus(200);
%>{"message" : "<%=message %>", "succeeded" : false}