<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

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
              <h1 class="page-tit">SK구성원 회원가입</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <section class="el-container px-m">
          <div class="progress-level level-2-4">
            <span class="tit">SK구성원 확인</span>
            <span class="level">2 / 5</span>
          </div>
        </section>
        <section class="el-container px-m">
          <h2 class="hd-1">
            SK구성원임을 <br>
            확인해주세요.
          </h2>
        </section>
        <section class="el-container px-m">
          <div class="form-field form-error">
            <input type="text" class="input-text" name="" placeholder="이름 *">
            <div class="form-msg">이름(실명)을 입력해주세요.</div>
          </div>
          <div class="form-field">
            <input type="text" class="input-text" name="" placeholder="사번 *">
            <div class="form-msg"></div>
          </div>
          <div class="form-field">
            <input type="text" class="input-text" name="" placeholder="회사 이메일 *">
            <div class="form-msg"></div>
          </div>
        </section>

        <div class="spacer-bottom"></div>

        <div class="button-footer">
          <a href="WN_PB_MO_MEM_010203.html" class="button bt-l bt-green bt-rect d-block">본인인증</a>
        </div>
      </div><!-- /.main-content -->
    </main>
  </div>
  