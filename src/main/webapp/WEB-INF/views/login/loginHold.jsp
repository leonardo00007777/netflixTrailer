<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp" %>

<div class="gwrapper">
    <ul class="login-box">
        <li class="content10 align-center">
            <div id="loginBox" class="shadowborder" style="padding:40px;">
				<c:choose>
				   		<c:when test="${infoMode eq  'UPREQ'}">
						    <span class="text-title color-skred">
				                <strong>"현재 고객님은 '승급신청' 상태 입니다."</strong>
				            </span>
				            <br /><br />
				            담당자가 절차에 따라 '승급처리'가 완료할 때까지 기다려 주십시오.<br />
				            더 많은 혜택으로 '자연이랑'을 이용하실 수 있도록 항상 노력하겠습니다.<br />
				            자세한 사항은 고객상담실(<a href="tel:0803036363">080-303-6262, 수신자 부담</a>)로 문의하시기 바랍니다.			
				      	</c:when>
				      	
				   		<c:when test="${infoMode eq  'LAYOFF'}">
				            <span class="text-title color-skred">
				                <strong>"현재 고객님은 '휴직 중' 상태 입니다."</strong>
				            </span>
				            <br /><br />
				            자세한 사항은 고객상담실(<a href="tel:0803036363">080-303-6262, 수신자 부담</a>)로 문의하시기 바랍니다.		
				      	</c:when>
				      	<c:otherwise>
				      	..
				      	</c:otherwise> 
				</c:choose>
            </div>
        </li>    
    </ul>

</div>