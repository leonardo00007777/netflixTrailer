<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/common/env.jsp"%>

<body>
  <div class="site-container">
    <header class="local-header">
      <div class="fixed-top">
        <div class="local-top tit-only">
        	<button class="btn-prev"  id="backBtn">
	         	<i class="wn-icon wni-arrow-left"></i>
	        </button>
          <div class="h-row">
            <div class="h-col h-tit">
              <h1 class="page-tit">개인정보 관리</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <section class="se-container px-m">
          <h3 class="hd-l">비밀번호 확인</h3>
          <div class="mt-s">
            <div class="t-15 lh-20 t-gray">
              개인정보 관리에 접근하기 위해서는<br>
              자연이랑 계정의 비밀번호의 확인이 필요합니다.
            </div>
          </div>
        </section>
        <section class="el-container px-m">
          <div class="form-field">
            <input type="password" class="input-text" placeholder="비밀번호">
            <div class="form-msg"></div>
          </div>
        </section>

        <hr class="spacer-bottom">

        <div class="button-footer">
          <a href="WN_PB_MO_MYP_020201.html" class="button bt-l bt-green bt-rect d-block">확인</a>
        </div>
      </div><!-- /.main-content -->
    </main>
  </div>
