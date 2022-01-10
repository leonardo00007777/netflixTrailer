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
              <h1 class="page-tit">공지사항</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <article>
          <div class="el-container px-m">
            <div class="search-box">
              <input type="text" class="input-text" placeholder="검색">
              <button type="submit" class="btn-search-icon" title="검색"></button>
            </div>
          </div>
          <ul class="board-list mt-30">
            <li>
              <a href="WN_PB_MO_MYP_050102.html" class="board-item">
                <div class="tit-row">
                  <span class="tit-label green">중요</span>
                  <span class="tit">[안내]오전8시 이전 주문시 당일발송서비스</span>
                </div>
                <div class="date">2020-09-08</div>
              </a>
            </li>
            <li>
              <a href="#" class="board-item">
                <div class="tit-row">
                  <span class="tit-label green">중요</span>
                  <span class="tit">[안내] 2020 유기농 햅쌀 예약판매 상품 9월 유기농 햅쌀 예약판매 상품</span>
                </div>
                <div class="date">2020-09-08</div>
              </a>
            </li>
            <li>
              <a href="#" class="board-item">
                <div class="tit-row">
                  <span class="tit">[공지] 자연이랑 개인정보처리방침 개정안내</span>
                </div>
                <div class="date">2020-09-08</div>
              </a>
            </li>
            <li>
              <a href="#" class="board-item">
                <div class="tit-row">
                  <span class="tit">[공지] 자연이랑 서비스 일시 제한 안내 자연이랑 서비스 일시 제한 안내</span>
                </div>
                <div class="date">2020-09-08</div>
              </a>
            </li>
            <li>
              <a href="#" class="board-item">
                <div class="tit-row">
                  <span class="tit">[공지] 자연이랑 개인정보처리방침 개정안내</span>
                </div>
                <div class="date">2020-09-08</div>
              </a>
            </li>
            <li>
              <a href="#" class="board-item">
                <div class="tit-row">
                  <span class="tit">[공지] 자연이랑 서비스 일시 제한 안내 자연이랑 서비스 일시 제한 안내</span>
                </div>
                <div class="date">2020-09-08</div>
              </a>
            </li>
          </ul>
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