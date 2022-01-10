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
              <h1 class="page-tit text-center">나의 구매후기</h1>
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
                <a class="nav-link active" href="#">작성 가능한 후기 (21)</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="WN_PB_MO_MYP_040105.html">내가 작성한 후기 (8)</a>
              </li>
            </ul>
            <hr class="divider-top">
          </nav>

          <div class="my-review-list mt-l">
            <div class="myo-prd">
              <div class="prd-thumb">
                <div class="img-container thumb-6">
                  <div class="prd-img">
                    <img src="./images/uploads/prd-img-02.jpg" alt="친환경 청주 대추방울 토마토 900g">
                  </div>
                </div>
                <div class="detail">
                  <div class="tit">친환경 청주 대추방울 토마토 900g</div>
                  <div class="info">
                    <dl class="dl-col">
                      <dt>배송완료</dt>
                      <dd class="t-gray">2020-08-25</dd>
                    </dl>
                  </div>
                  <div class="info">
                    <dl class="dl-col">
                      <dt>포인트</dt>
                      <dd>최대 100P</dd>
                    </dl>
                    <dl class="dl-col">
                      <dt>작성기한</dt>
                      <dd>2020-09-20 (D-10)</dd>
                    </dl>
                  </div>
                </div>
              </div>
              <a href="WN_PB_MO_MYP_040103.html" class="button bt-green-2 w-100 mt-s">구매후기 작성</a>
            </div>
            <div class="myo-prd">
              <div class="prd-thumb">
                <div class="img-container thumb-6">
                  <div class="prd-img">
                    <img src="./images/uploads/prd-img-02.jpg" alt="친환경 청주 대추방울 토마토 900g">
                  </div>
                </div>
                <div class="detail">
                  <div class="tit">친환경 청주 대추방울 토마토 900g길게길게길게길게길게길게길게길게</div>
                  <div class="info">
                    <dl class="dl-col">
                      <dt>배송완료</dt>
                      <dd class="t-gray">2020-08-25</dd>
                    </dl>
                  </div>
                  <div class="info">
                    <dl class="dl-col">
                      <dt>포인트</dt>
                      <dd>최대 100P</dd>
                    </dl>
                    <dl class="dl-col">
                      <dt>작성기한</dt>
                      <dd>2020-09-20 (D-10)</dd>
                    </dl>
                  </div>
                </div>
              </div>
              <a href="WN_PB_MO_MYP_040103.html" class="button bt-green-2 w-100 mt-s">구매후기 작성</a>
            </div>
            <div class="myo-prd">
              <div class="prd-thumb">
                <div class="img-container thumb-6">
                  <div class="prd-img">
                    <img src="./images/uploads/prd-img-02.jpg" alt="친환경 청주 대추방울 토마토 900g">
                  </div>
                </div>
                <div class="detail">
                  <div class="tit">친환경 청주 대추방울 토마토 900g길게길게길게길게길게길게길게길게</div>
                  <div class="info">
                    <dl class="dl-col">
                      <dt>배송완료</dt>
                      <dd class="t-gray">2020-08-25</dd>
                    </dl>
                  </div>
                  <div class="info">
                    <dl class="dl-col">
                      <dt>포인트</dt>
                      <dd>최대 100P</dd>
                    </dl>
                    <dl class="dl-col">
                      <dt>작성기한</dt>
                      <dd>2020-09-20 (D-10)</dd>
                    </dl>
                  </div>
                </div>
              </div>
              <a href="WN_PB_MO_MYP_040103.html" class="button bt-green-2 w-100 mt-s">구매후기 작성</a>
            </div>
          </div>

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
