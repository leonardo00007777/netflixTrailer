<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/common/env.jsp"%>

<c:set var="_isLoginYn" value="<%=_isLoginYn %>" />
<c:choose>
   		<c:when test="${_isLoginYn eq true}">
	   		<script>
	   			// alert("_isLoginYn true ");
	   		</script>
      	</c:when>
      	<c:otherwise>
			<script>
				var redirectURL = "/member/joinmember";
				window.location.href = redirectURL;
			</script>      	
      	</c:otherwise> 
</c:choose>

<script src="<%=_jsUrl %>mypage/mypage.js"></script>

<body>
  <div class="site-container">
    <header class="local-header">
      <div class="fixed-top">
        <div class="local-top">
        	<button class="btn-prev"  id="backBtn">
	         	<i class="wn-icon wni-arrow-left"></i>
	        </button>
          <div class="h-row">
            <div class="h-col h-tit">
              <h1 class="page-tit">알림설정</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <section class="myp-se-container">
          <header class="myp-se-header">
            <h3 class="hd-s">마케팅수신동의</h3>
          </header>
          <hr class="solid-line ml-m mb-m">
          <ul class="switch-list-l px-m">
            <li>
              <div class="switch-item">
                <span>이메일</span>
                <label class="checkbox-switch">
                  <input type="checkbox" checked>
                  <span class="label"></span>
                </label>
              </div>
            </li>
            <li>
              <div class="switch-item">
                <span>전화</span>
                <label class="checkbox-switch">
                  <input type="checkbox" checked>
                  <span class="label"></span>
                </label>
              </div>
            </li>
            <li>
              <div class="switch-item">
                <span>SMS</span>
                <span class="account">2020-08-25 17:34:82 수신동의</span>
                <label class="checkbox-switch">
                  <input type="checkbox">
                  <span class="label"></span>
                </label>
              </div>
            </li>
          </ul>
        </section>
        <section class="myp-se-container">
          <header class="myp-se-header">
            <h3 class="hd-s">PUSH 설정</h3>
          </header>
          <hr class="solid-line ml-m mb-m">
          <ul class="switch-list-l px-m">
            <li>
              <div class="switch-item">
                <span>광고성 알림 수신</span>
                <label class="checkbox-switch">
                  <input type="checkbox" checked>
                  <span class="label"></span>
                </label>
              </div>
            </li>
            <li>
              <div class="switch-item">
                <span>AM7 ~ PM7에만 수신하기</span>
                <label class="checkbox-switch">
                  <input type="checkbox" checked>
                  <span class="label"></span>
                </label>
              </div>
            </li>
          </ul>
        </section>
        <section class="myp-se-container">
          <header class="myp-se-header">
            <h3 class="hd-s">어플리케이션 관리</h3>
          </header>
          <hr class="solid-line ml-m mb-m">
          <ul class="switch-list-l px-m">
            <li>
              <div class="switch-item">
                <div>
                  <p class="t-16">현재 최신버전 입니다.</p>
                  <p class="mt-1 t-gray t-15">V1.35</p>
                </div>
                <div class="ml-auto">
                  <button class="button bt-outline bt-steel">V1.2.1 버전 다운로드</button>
                </div>
              </div>
            </li>
            <li>
              <div class="switch-item">
                <div>
                  <p>캐시 데이터</p>
                  <p class="mt-1 t-gray t-15">2.1GB</p>
                </div>
                <div class="ml-auto">
                  <button class="button bt-outline bt-steel">캐시 데이터 삭제</button>
                </div>
              </div>
            </li>
          </ul>
        </section>

        <hr class="spacer-bottom">
      </div><!-- /.main-content -->
    </main>
    <div class="quick-menu" id="quick-menu">
      <a href="#" class="quick-menu-button btn-chat"><i class="wn-icon wni-message-square">채팅상담</i></a>
      <a href="#" class="quick-menu-button" id="page-top-button"><i class="wn-icon wni-chevron-v">Top</i></a>
    </div>
    <div class="global-bottom">
      <ul class="global-bottom-menu">
        <li class="gbm-item">
          <a href="#">
            <i class="wn-icon wni-home"></i>
          </a>
        </li>
        <li class="gbm-item">
          <a href="#">
            <i class="wn-icon wni-history"></i>
          </a>
        </li>
        <li class="gbm-item">
          <a href="#">
            <i class="wn-icon wni-menu"></i>
          </a>
        </li>
        <li class="gbm-item">
          <a href="#">
            <i class="wn-icon wni-search"></i>
          </a>
        </li>
        <li class="gbm-item">
          <a href="#">
            <i class="wn-icon wni-user"></i>
          </a>
        </li>
      </ul>
    </div>
  </div><!-- /.site-container -->
