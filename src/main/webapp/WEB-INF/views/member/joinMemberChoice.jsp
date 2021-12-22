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
              <h1 class="page-tit">회원가입</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <div class="content-center pt-l">
          <div class="progress-level level-1-4">
            <span class="tit">회원가입 안내</span>
            <span class="level">1 / 4</span>
          </div>
          <div class="el-container">
            <h2 class="hd-1">
              회원가입 방법을<br>
              선택해주세요.
            </h2>
          </div>
          <div class="el-container">
            <h3 class="hd-s">자연이랑 회원가입</h3>
	        	<button class="button bt-m bt-green w-100"  id="joinMemberForm">
		         	일반 회원가입
		        </button>
            <div class="form-field">
            </div>
          </div>
          <div class="el-container">
            <h3 class="hd-s">SNS 간편 회원가입</h3>
            <div class="d-flex justify-content-around pt-s">
              <a href="WN_PB_MO_MEM_010302.html" class="btn-sns-60">
                <i class="wn-icon sns-60-fb"></i>
                <div class="label">페이스북</div>
              </a>
              <a href="WN_PB_MO_MEM_010302.html" class="btn-sns-60">
                <i class="wn-icon sns-60-nv"></i>
                <div class="label">네이버</div>
              </a>
              <a href="WN_PB_MO_MEM_010302.html" class="btn-sns-60">
                <i class="wn-icon sns-60-kko"></i>
                <div class="label">카카오</div>
              </a>
              <a href="WN_PB_MO_MEM_010302.html" class="btn-sns-60">
                <i class="wn-icon sns-60-t"></i>
                <div class="label">T계정</div>
              </a>
            </div>
          </div>

          <div class="line body-2">
            <span>OR</span>
          </div>

          <div class="form-field mt-s">
            <button class="button bt-outline bt-m bt-green bt-100" onclick="location.href = 'WN_PB_MO_MEM_010201.html' ">SK구성원 가입</button>
          </div>

          <div class="mt-40 text-center">
            <div class="t-14">
              자연이랑 회원이세요?
              <a href="WN_PB_MO_MEM_020000.html" class="bold ml-3">로그인</a>
            </div>
          </div>
          <div class="spacer-bottom"></div>
        </div><!-- /.content-center -->
      </div><!-- /.main-content -->
    </main>
  </div>
