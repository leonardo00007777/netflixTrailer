<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp"
%>
<script src="<%=_jsUrl %>login/login.js"></script>

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
              <h1 class="page-tit">아이디 찾기</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <article class="px-m pt-l">
          <h2 class="hd-l">
            아이디가 기억나지 않으세요?<br>
            아래 방법을 통해<br>
            아이디를 찾아보세요.
          </h2>
          <div class="el-container">
            <h3 class="hd-s">간편하게 아이디 찾기</h3>
            <h4 class="t-13 t-gray">아이디의 앞 세 자리만 보여줍니다.</h4>
          </div>
          <div class="form-field mt-s">
            <input type="text" class="input-text" name="" placeholder="이름(실명) *">
          </div>
          <div class="form-field">
            <input type="tel" class="input-text" name="" placeholder="휴대전화 *">
          </div>
          <div class="form-field">
            <button class="button bt-green bt-m bt-100" onclick="location.href ='WN_PB_MO_MEM_020402.html?modalID=modalSnsJoin'">확인</button>
          </div>

          <div class="line body-2">
            <span>OR</span>
          </div>

          <section>
            <h3 class="hd-s">정확하게 아이디 찾기</h3>
            <h4 class="t-13 t-gray">아이디의 전체 정보를 보여줍니다.</h4>
            <div class="form-field mt-m">
              <button class="button bt-m bt-outline bt-green bt-100">본인 인증</button>
            </div>
          </section>

          <div class="el-container">
            <section class="wn-card-alert">
              <header class="wn-card-header">
                <h3 class="tit">
                  <i class="wn-icon wni-alert-16"></i>
                  읽어주세요!
                </h3>
              </header>
              <div class="wn-card-body">
                <div class="t-13 t-gray lh-18">
                  SNS 계정으로 가입하신 경우 아이디/비밀번호 찾기를 이용하실 수 없습니다. 이 경우, 해당 SNS 홈페이지를 통해 아이디/비밀번호 찾기가 가능합니다.
                </div>
              </div>
            </section>
          </div>

          <div class="spacer-bottom"></div>

        </article><!-- /.content-center -->


      </div><!-- /.main-content -->
    </main>
  </div>
