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
              <h1 class="page-tit text-center">댓글 내역</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <article class="el-container">
          <div class="search-filters">
            <div class="bt-select-group select-group">
              <a href="javascript:void(0)" class="button select-item active">전체</a>
              <a href="javascript:void(0)" class="button select-item">1개월</a>
              <a href="javascript:void(0)" class="button select-item">6개월</a>
              <a href="javascript:void(0)" class="button select-item">1년</a>
            </div>
            <div class="date-range-picker">
              <a href="#dpCalStart" class="btn-datepicker" data-dp-role="trigger" data-dp-modal="#modalCalStart">
                <input type="text" id="dpInputStart" value="2020-10-09" readonly="">
              </a>
              <span>~</span>
              <a href="#dpCalEnd" class="btn-datepicker" data-dp-role="trigger" data-dp-modal="#modalCalEnd">
                <input type="text" id="dpInputEnd" value="2020-10-09" readonly="">
              </a>
            </div>
            <div class="mt-s px-m">
              <a href="#" class="button bt-outline bt-green w-100">조회</a>
            </div>
             <hr class="solid-line mt-20">
          </div><!-- /.search-filters -->

          <section class="nav-scroll-container">
            <nav class="nav-scroll">
              <ul class="nav-item-list select-group">
                <li class="nav-col">
                  <a href="javascript:void(0)" class="select-item tab-pill active">전체</a>
                </li>
                <li class="nav-col">
                  <a href="javascript:void(0)" class="select-item tab-pill">이벤트</a>
                </li>
                <li class="nav-col">
                  <a href="javascript:void(0)" class="select-item tab-pill">WITH</a>
                </li>
                <li class="nav-col">
                  <a href="javascript:void(0)" class="select-item tab-pill">NATURE</a>
                </li>
                <li class="nav-col">
                  <a href="javascript:void(0)" class="select-item tab-pill">FOOD</a>
                </li>
                <li class="nav-col">
                  <a href="javascript:void(0)" class="select-item tab-pill">COOK</a>
                </li>
              </ul>
            </nav>
          </section>

          <hr class="solid-line">

          <div class="my-review-list mt-s">
            <article class="my-review-item">
              <div class="wrapper">
                <div class="detail">
                  <div class="myr-item-header">
                    <div class="tit">[이벤트] 자연이랑 창립15주년 이벤트! 우리 15년 됐어요</div>
                    <div class="date font-num">2020-09-10 작성</div>
                  </div>
                  <div class="myr-item-content">
                    와우 이번 이벤트 대박이네옄ᄏᄏᄏ 응모합니다. 당첨되게 해
                    주세요. 당첨되게 해주세요. 당첨 되게 해주세요.
                  </div>
                </div>
              </div>
            </article>
            <article class="my-review-item">
              <div class="wrapper">
                <div class="detail">
                  <div class="myr-item-header">
                    <div class="tit">[레시피] 내가 만드는 고등어조림</div>
                    <div class="date font-num">2020-09-10 작성</div>
                  </div>
                  <div class="myr-item-content">
                    사진 맛있게 잘찍으시네요.
                  </div>
                </div>
              </div>
            </article>
            <article class="my-review-item">
              <div class="wrapper">
                <div class="detail">
                  <div class="myr-item-header">
                    <div class="tit">[자연이랑 이야기] 우리 15년 됐어요</div>
                    <div class="date font-num">2020-09-10 작성</div>
                  </div>
                  <div class="myr-item-content">
                    15년됐어요 15년됐어요 15년됐어요 15년됐어요 15년됐어요
                    15년됐어요 15년됐어요 15년됐어요 15년됐어요 15년됐어요
                    15년됐어요 15년됐어요
                  </div>
                </div>
              </div>
            </article>
          </div>
        </article>

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

