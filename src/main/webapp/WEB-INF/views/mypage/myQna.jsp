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
              <h1 class="page-tit text-center">나의 1:1 문의 내역</h1>
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
                <a class="nav-link active" href="#">내 문의 내역</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="WN_PB_MO_MYP_040306.html">1:1 문의하기</a>
              </li>
            </ul>
            <hr class="divider-top">
          </nav>

          <section class="mt-20">
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
              <div class="form-search">
                <div class="custom-select">
                  <select>
                    <option value="">전체</option>
                    <option value="">결제완료</option>
                    <option value="">상품준비중</option>
                    <option value="">배송중</option>
                    <option value="">배송완료</option>
                  </select>
                </div>
                <input type="text" class="input-text" placeholder="상품명으로 검색">
                <button class="button bt-green">검색</button>
              </div>
            </div><!-- /.search-filters -->

            <hr class="solid-line mt-20">
          </section>

          <section class="el-container">
            <a href="#" class="my-qna-tit-container">
              <div class="detail">
                <div class="my-qna-tit">
                  <div class="content">
                    <div class="tit">아이스크림이 다 녹고 터져서 왔어요</div>
                    <div class="info">
                      <span class="state">답변대기</span>
                      <i class="i"></i>
                      <span class="date">2020-09-08</span>
                    </div>
                  </div>
                </div>
              </div>
            </a>
            <a href="#" class="my-qna-tit-container">
              <div class="detail">
                <div class="my-qna-tit">
                  <div class="content">
                    <div class="tit">아이스크림이 다 녹고 터져서 왔어요 <i class="wn-icon clip-16"></i></div>
                    <div class="info">
                      <span class="state t-green">답변완료</span>
                      <i class="i"></i>
                      <span class="date">2020-09-08</span>
                    </div>
                  </div>
                </div>
              </div>
            </a>
            <a href="#" class="my-qna-tit-container">
              <div class="detail">
                <div class="my-qna-tit">
                  <div class="content">
                    <div class="tit">제목이 길에요 제목이 길에요제목이 길에요제목이 길에요</div>
                    <div class="info">
                      <span class="state t-green">답변완료</span>
                      <i class="i"></i>
                      <span class="date">2020-09-08</span>
                    </div>
                  </div>
                </div>
              </div>
            </a>
          </section>

          <hr class="spacer-bottom">
        </article>
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

  