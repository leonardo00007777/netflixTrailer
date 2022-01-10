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
              <h1 class="page-tit">배송지 관리</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <ul class="nav nav-tabs tab-default">
          <li class="nav-item">
            <a class="nav-link active" data-toggle="tab" href="#">배송지 목록</a>
          </li>
          <li class="nav-item">
            <a class="nav-link"  href="WN_PB_MO_MYP_020602.html">최근 배송지</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="WN_PB_MO_MYP_020603.html">신규배송지 등록</a>
          </li>
        </ul>

        <hr class="spacer">

        <section class="addr-list pt-m">
          <div class="addr-item">
            <div class="addr-header">
              <span class="addr-label">기본배송지</span>
              <span class="addr-name">홍길동</span>
            </div>
            <div class="addr-detail">
              <div>서울시 용산구 장문로 54길 SEL빌딩 5층</div>
              <div class="font-num">010-1234-5678</div>
            </div>
            <div class="addr-footer add-r">
              <button class="button bt-xs bt-outline bt-gray">수정</button>
              <button class="button bt-xs bt-outline bt-gray">삭제</button>
            </div>
          </div>
          <div class="addr-item">
            <div class="addr-header">
              <span class="addr-name">홍길동</span>
            </div>
            <div class="addr-detail">
              <div>서울시 용산구 장문로 54길 SEL빌딩 5층</div>
              <div class="font-num">010-1234-5678</div>
            </div>
            <div class="addr-footer add-r">
              <button class="button bt-xs bt-outline bt-gray">수정</button>
              <button class="button bt-xs bt-outline bt-gray">삭제</button>
              <div class="add">
                <button class="button bt-xs bt-outline bt-steel">기본배송지 설정</button>
              </div>
            </div>
          </div>
          <div class="addr-item">
            <div class="addr-header">
              <span class="addr-name">홍길동</span>
            </div>
            <div class="addr-detail">
              <div>서울시 용산구 장문로 54길 SEL빌딩 5층</div>
              <div class="font-num">010-1234-5678</div>
            </div>
            <div class="addr-footer add-r">
              <button class="button bt-xs bt-outline bt-gray">수정</button>
              <button class="button bt-xs bt-outline bt-gray">삭제</button>
              <div class="add">
                <button class="button bt-xs bt-outline bt-steel">기본배송지 설정</button>
              </div>
            </div>
          </div>
          <div class="addr-item">
            <div class="addr-header">
              <span class="addr-name">홍길동</span>
            </div>
            <div class="addr-detail">
              <div>서울시 용산구 장문로 54길 SEL빌딩 5층</div>
              <div class="font-num">010-1234-5678</div>
            </div>
            <div class="addr-footer add-r">
              <button class="button bt-xs bt-outline bt-gray">수정</button>
              <button class="button bt-xs bt-outline bt-gray">삭제</button>
              <div class="add">
                <button class="button bt-xs bt-outline bt-steel">기본배송지 설정</button>
              </div>
            </div>
          </div>
        </section>

        <hr class="spacer-bottom">

        <section class="button-footer">
          <a href="#" class="button bt-l bt-gray br-rect">취소</a>
          <a href="#" class="button bt-l bt-green br-rect">확인</a>
        </section>

      </div><!-- /.main-content -->
    </main>
    <div class="quick-menu" id="quick-menu">
      <a href="#" class="quick-menu-button btn-chat"><i class="wn-icon wni-message-square">채팅상담</i></a>
      <a href="#" class="quick-menu-button" id="page-top-button"><i class="wn-icon wni-chevron-v">Top</i></a>
    </div>
  </div><!-- /.site-container -->


  <!-- Modal - 주소 찾기 -->
  <div class="modal wn-modal-full" id="modalZip">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">주소 찾기</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
          <div class="content-center mt-l">
            주소찾기 API
          </div>
        </div>
      </div>
    </div>
  </div>
