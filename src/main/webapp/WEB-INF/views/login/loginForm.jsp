<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp"
%>
<script type="text/javascript" src="https://appleid.cdn-apple.com/appleauth/static/jsapi/appleid/1/en_US/appleid.auth.js"></script>
<%-- <script src="<%=_jsUrl %>asis/dataEvent.js"></script>   --%>   
<script src="<%=_jsUrl %>login/login.js"></script>

<body class="page-login header-float">
  <div class="site-container">
    <header class="local-header">
      <div class="fixed-top">
        <div class="local-top">
          <a href="#" class="btn-prev"><i class="wn-icon wni-arrow-left"></i></a>
          <div class="h-row">
            <div class="h-col h-tit">
              <h1 class="page-tit"></h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
		<form id="loginForm" name="loginForm">
<%--             <input type="hidden" name="backurl" id="backurl" value="<%=backurl%>" />
            <input type="hidden" name="refererx" id="refererx" value="<%=refererx%>" />
 --%>
			<!-- 애플로그인 -->
			<%-- <input type="hidden" id="easyLoginFormYn"      name="easyLoginFormYn"      value="${appleLoginCertSucsYn}" /><!-- 간편로그인폼 -->
			<input type="hidden" id="easyLoginType"        name="easyLoginType"        value="${easyLoginType}" /><!-- 간편로그인폼 --> --%>

      
        <article class="page-login-container">
          <div class="page-login-content">
            <h3 class="logo-tit"><img src="<%=_imgUrl %>/images/loginLogo@2x.png" alt="자연이랑"></h3>  
           
            <section class="form-login">
              <input type="text" class="input-login" id="loginuserid" placeholder="아이디">
              <input type="password" class="input-login" id="loginpassword" placeholder="비밀번호" onkeyup="javascript:login.tryLogin(event);" autocomplete="off" placeholder="비밀번호 (8-12자 영문자+숫자+특수문자)" title="비밀번호를 입력해주세요.">
              <label class="checkbox mt-s">
                <input type="checkbox"  id="chk01" name="autologin" id="autologin" checked="checked" value="Y" title="자동로그인 선택">
                <span class="label">자동 로그인</span>
              </label>
              <button class="button bt-green bt-l w-100 btn-login"  onclick="javascript:login.loginCheck();">로그인</button>
            </section>
								
            <section class="management-box">
              <a href="WN_PB_MO_MEM_020401.html">아이디 찾기</a>
              <a href="WN_PB_MO_MEM_020503.html">비밀번호 재설정</a>
              <a href="WN_PB_MO_MEM_010000.html">회원가입</a>
            </section>

            <section class="el-container">
              <h3 class="tit-sns">SNS계정으로 로그인</h3>
              <div class="sns-box">
                <button class="button bt-fb"><i class="wn-icon wni-fb"></i></button>
                <button class="button bt-naver"><i class="wn-icon wni-naver"></i></button>
                <button class="button bt-ct"><i class="wn-icon wni-ct"></i></button>
                <button class="button bt-t"><i class="wn-icon wni-t"></i></button>
              </div>
            </section>
          </div>
          <div class="spacer-bottom"></div>
        </article>

	  </form>
      </div><!-- /.main-content -->
    </main>
  </div>

  <!-- Confirm: 자연이랑 회원이 아닐경우 메시지   modalSnsJoin-->
  
