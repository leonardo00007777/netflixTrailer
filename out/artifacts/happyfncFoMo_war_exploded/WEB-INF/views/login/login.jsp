<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp" %>
<%--  test ---------------------------------------------------
			<c:set var="blankCnt" value="5"> </c:set>
			<c:if test="${ blankCnt < 4 }">
			작음
			</c:if>
			<c:if test="${ blankCnt > 3 }">
			큼
			</c:if>
---------------------------------------------------------------- --%>
<!-- 자동로그인  -->	    	
<c:set var="usec" value="${usec}"> </c:set>
<c:set var="backurl" value="${backurl}"> </c:set>
<c:set var="_isLogin" value="true"> </c:set>


<c:out value="${usec}" />  ---------
<c:out value="${backurl}" /> 

<c:choose>
   		<c:when test="${_isLogin eq true}">
	 	<%@ include file="/WEB-INF/views/mypage/mypage.jsp" %> 
      	</c:when>
      	<c:otherwise>
			<%@ include file="/WEB-INF/views/member/joinMember.jsp" %>
      	</c:otherwise> 
</c:choose>

