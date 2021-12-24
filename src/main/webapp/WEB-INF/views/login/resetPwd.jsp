<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp"
%>

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
              <h1 class="page-tit">비밀번호 재설정</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <div class="el-container px-m">
          <h2 class="hd-1">
            새로운 비밀번호를<br>
            설정해 주세요.
          </h2>
        </div>
        <div class="el-container px-m">
          <div class="form-field">
            <input type="password" class="input-text" name="" placeholder="새 비밀번호 *">
          </div>
          <div class="form-field">
            <input type="password" class="input-text" name="" placeholder="새 비밀번호 확인 *">
          </div>
        </div>

        <hr class="spacer-bottom">

        <div class="button-footer">
          <a href="WN_PB_MO_MEM_020000.html" class="button bt-l bt-green bt-rect d-block">확인</a>
        </div>
      </div><!-- /.main-content -->
    </main>
  </div>