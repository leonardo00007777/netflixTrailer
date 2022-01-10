<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/common/env.jsp"%>

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
              <h1 class="page-tit text-center">친구 추천하기</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <article>
          <nav>
            <ul class="nav nav-tabs tab-default">
              <li class="nav-item">
                <a class="nav-link active" href="#">친구 추천하기</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="WN_PB_MO_MYP_040705.html">추천인 활동내역</a>
              </li>
            </ul>
            <hr class="divider-top">
          </nav>

          <section class="se-container px-m">
            <h3 class="hd-l">
              친구가 나의 추천코드를<br>
              입력하여 가입하고 활동하면<br>
              추천혜택을 드립니다.
            </h3>
          </section>

          <section class="el-container px-m">
            <div class="order-no-box">
              <span class="label">추천인 코드</span>
              <span>I1090232</span>
            </div>
          </section>

          <section class="el-container px-20">
            <div class="join-event-list">
              <div class="join-event-item">
                <div class="icon-container gray">
                  <i class="wn-icon join-point"></i>
                </div>
                <div class="label">
                  추천인 가입보상<br>
                  2,000포인트 적립
                </div>
              </div>
              <div class="join-event-item">
                <div class="icon-container gray">
                  <i class="wn-icon join-point-2"></i>
                </div>
                <div class="label">
                  추천인이 물건구매시<br>
                  결제 보상 포인트 계속 적립
                </div>
              </div>
            </div>
          </section>

          <section class="button-footer">
            <a href="#" class="button bt-l bt-gray">내 코드 복사</a>
            <a href="#" class="button bt-l bt-green">내 코드 공유</a>
          </section>

          <hr class="spacer-bottom">
        </article>
      </div><!-- /.main-content -->
    </main>
  </div><!-- /.site-container -->

  <!-- Datepicker Popup : Range Start -->
  <div class="modal fade wn-modal-bottom" data-dp-role="modal" id="modalCalStart">
    <div class="modal-dialog">
      <div class="modal-content">
        <button class="btn-close" data-dismiss="modal">닫기</button>
        <div class="overflow-auto">
          <div class="wn-modal-body">
            <div id="dpCalStart" data-dp-role="calendar" data-dp-input="#dpInputStart"></div>
          </div>
          <div class="wn-modal-footer">
            <button class="button bt-l bt-gray" data-dismiss="modal">취소</button>
            <button class="button bt-l bt-green" data-dp-role="modal-submit">선택</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Datepicker Popup : Range End -->
  <div class="modal fade wn-modal-bottom" data-dp-role="modal" id="modalCalEnd">
    <div class="modal-dialog">
      <div class="modal-content">
        <button class="btn-close" data-dismiss="modal">닫기</button>
        <div class="overflow-auto">
          <div class="wn-modal-body">
            <div id="dpCalEnd" class="dpCal" data-dp-role="calendar" data-dp-input="#dpInputEnd"></div>
          </div>
          <div class="wn-modal-footer">
            <button class="button bt-l bt-gray" data-dismiss="modal">취소</button>
            <button class="button bt-l bt-green" data-dp-role="modal-submit">선택</button>
          </div>
        </div>
      </div>
    </div>
  </div>

