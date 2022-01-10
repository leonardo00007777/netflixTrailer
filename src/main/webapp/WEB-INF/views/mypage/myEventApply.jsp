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
              <h1 class="page-tit text-center">이벤트 참여 내역</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <section>
          <article class="my-evt-item">
            <div class="img-container" style="background-image: url('./images/uploads/evtThumb@2x.jpg');"
              title="2020 상반기 FLEX 결산">
            </div>
            <div class="detail">
              <div class="state t-red">당첨</div>
              <div class="tit">2020 상반기 FLEX 결산 이벤트 제목이 길 경우 두줄까지 표현 될수있음</div>
              <div class="date">2020-08-25 14:53:23 <small>응모</small></div>
            </div>
          </article>
          <article class="my-evt-item">
            <div class="img-container" style="background-image: url('./images/uploads/evtThumb@2x.jpg');"
              title="2020 상반기 FLEX 결산">
            </div>
            <div class="detail">
              <div class="state">다음기회에</div>
              <div class="tit">2020 상반기 FLEX 결산 이벤트 제목이 길 경우 두줄까지 표현 될수있음</div>
              <div class="date">2020-08-25 14:53:23 <small>응모</small></div>
            </div>
          </article>
          <article class="my-evt-item">
            <div class="img-container" style="background-image: url('./images/uploads/evtThumb@2x.jpg');"
              title="2020 상반기 FLEX 결산">
            </div>
            <div class="detail">
              <div class="state">다음기회에</div>
              <div class="tit">2020 상반기 FLEX 결산 이벤트 제목이 길 경우 두줄까지 표현 될수있음</div>
              <div class="date">2020-08-25 14:53:23 <small>응모</small></div>
            </div>
          </article>
          <article class="my-evt-item">
            <div class="img-container" style="background-image: url('./images/uploads/evtThumb@2x.jpg');"
              title="2020 상반기 FLEX 결산">
            </div>
            <div class="detail">
              <div class="state t-red">당첨</div>
              <div class="tit">2020 상반기 FLEX 결산 이벤트 제목이 길 경우 두줄까지 표현 될수있음</div>
              <div class="date">2020-08-25 14:53:23 <small>응모</small></div>
            </div>
          </article>

          <hr class="spacer-bottom">
        </section>

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

