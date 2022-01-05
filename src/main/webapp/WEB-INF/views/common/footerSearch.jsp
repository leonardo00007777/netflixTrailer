<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp" %>

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
              <h1 class="page-tit">통합검색</h1>
            </div>
            <div class="h-col h-menu">
              <div class="global-top-menu">
		          <a href="javascript:void(0)" class="menu-item" id="gnbBtnCart">
		            <i class="wn-icon wni-cart">장바구니</i>
		            <span class="num-badge">9</span>
		          </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <section class="el-container px-m">
          <div class="search-box">
            <input type="text" class="input-text input-search" placeholder="검색어를 입력 해주세요.">
            <button class="btn-search-clear" onclick=""></button>
            <button type="submit" class="btn-search-icon" title="검색"></button>
            <div class="search-autocomplete">
              <a href="#" class="search-key-item"><em>김</em>치</a>
              <a href="#" class="search-key-item"><em>김</em>만두</a>
              <a href="#" class="search-key-item"><em>김</em>밥</a>
              <a href="#" class="search-key-item"><em>김</em></a>
              <a href="#" class="search-key-item">유<em>기</em>농</a>
              <a href="#" class="search-key-item">유<em>기</em>농 김치</a>
              <a href="#" class="search-key-item">유<em>기</em>농 현미</a>
            </div>
          </div>
        </section>

        <nav class="el-container">
          <hr class="solid-line">
          <ul class="nav nav-tabs tab-default" id="searchTab">
            <li class="nav-item">
              <a class="nav-link active" data-toggle="tab" href="javascript:void(0);" onclick="searchTabConOn(0)">최근 검색어</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" data-toggle="tab" href="javascript:void(0);" onclick="searchTabConOn(1)">인기 검색어</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" data-toggle="tab" href="javascript:void(0);" onclick="searchTabConOn(2)">실시간 인기태그</a>
            </li>
          </ul>
          <hr class="spacer">
        </nav>

        <div class="swiper-container" id="searchTabConSwiper">
          <div class="swiper-wrapper">
            <div class="swiper-slide">
              <!-- 최근 검색어 -->
              <article class="search-tab-content">
                <section class="el-container px-m">
                  <header class="header-add-r">
                    <h3 class="hd-s">홍길동님의 최근 검색하신 내용입니다</h3>
                  </header>
                  <ul class="search-word-list">
                    <li>
                      <div class="search-word-item">
                        <span class="word">검색어1</span>
                        <button class="btn-remove"><i class="wn-icon x-16-light"></i></button>
                      </div>
                    </li>
                    <li>
                      <div class="search-word-item">
                        <span class="word">검색어1</span>
                        <button class="btn-remove"><i class="wn-icon x-16-light"></i></button>
                      </div>
                    </li>
                    <li>
                      <div class="search-word-item">
                        <span class="word">검색어1</span>
                        <button class="btn-remove"><i class="wn-icon x-16-light"></i></button>
                      </div>
                    </li>
                    <li>
                      <div class="search-word-item">
                        <span class="word">검색어1</span>
                        <button class="btn-remove"><i class="wn-icon x-16-light"></i></button>
                      </div>
                    </li>
                    <li>
                      <div class="search-word-item">
                        <span class="word">검색어1</span>
                        <button class="btn-remove"><i class="wn-icon x-16-light"></i></button>
                      </div>
                    </li>
                  </ul>
                </section>
              </article>
            </div>
            <div class="swiper-slide">
              <!-- 인기 검색어 -->
              <article class="search-tab-content">
                <section class="el-container px-m">
                  <header class="header-add-r">
                    <h3 class="hd-s">요즘 핫 한 인기 검색어</h3>
                    <div class="add">
                      <div class="t-14">2021-02-16 13:15:00 기준</div>
                    </div>
                  </header>
                  <ul class="search-word-list">
                    <li>
                      <div class="search-word-item">
                        <span class="word">검색어1</span>
                        <button class="btn-remove"><i class="wn-icon x-16-light"></i></button>
                      </div>
                    </li>
                    <li>
                      <div class="search-word-item">
                        <span class="word">검색어1</span>
                        <button class="btn-remove"><i class="wn-icon x-16-light"></i></button>
                      </div>
                    </li>
                    <li>
                      <div class="search-word-item">
                        <span class="word">검색어1</span>
                        <button class="btn-remove"><i class="wn-icon x-16-light"></i></button>
                      </div>
                    </li>
                    <li>
                      <div class="search-word-item">
                        <span class="word">검색어1</span>
                        <button class="btn-remove"><i class="wn-icon x-16-light"></i></button>
                      </div>
                    </li>
                    <li>
                      <div class="search-word-item">
                        <span class="word">검색어1</span>
                        <button class="btn-remove"><i class="wn-icon x-16-light"></i></button>
                      </div>
                    </li>
                  </ul>
                </section>
              </article>
            </div>
            <div class="swiper-slide">
              <!-- 실시간 인기태그 -->
              <article class="search-tab-content">
                <section class="el-container">
                  <header class="header-add-r px-m">
                    <h3 class="hd-s">#쏘핫 #SO_HOT</h3>
                    <div class="add">
                      <div class="t-14">2021-02-16 13:15:00 기준</div>
                    </div>
                  </header>
                  <div class="main-tag-list">
                    <a href="#" class="tag-item">#아이스크림</a>
                    <a href="#" class="tag-item">#한우사골</a>
                    <a href="#" class="tag-item">#라라스윗</a>
                    <a href="#" class="tag-item">#수박</a>
                    <a href="#" class="tag-item">#하겐다즈</a>
                    <a href="#" class="tag-item">#아침에과일주스</a>
                    <a href="#" class="tag-item">#졸릴땐이거</a>
                    <a href="#" class="tag-item">#달콤</a>
                    <a href="#" class="tag-item">#졸릴땐이거</a>
                    <a href="#" class="tag-item">#달콤</a>
                    <a href="#" class="tag-item">#한우사골</a>
                    <a href="#" class="tag-item">#삼겹살</a>
                  </div>
                </section>
              </article>
            </div>
          </div>
        </div><!-- /.swiper-search-tab-con -->

        <hr class="spacer-bottom">

      </div><!-- /.main-content -->
    </main>
    <div class="quick-menu" id="quick-menu">
      <a href="WN_PB_MO_SCH_010201.html" class="quick-menu-button btn-chat"><i class="wn-icon wni-message-square">채팅상담</i></a>
      <a href="#" class="quick-menu-button" id="page-top-button"><i class="wn-icon wni-chevron-v">Top</i></a>
    </div>
    <div class="global-bottom">
      <ul class="global-bottom-menu">
        <li class="gbm-item active">
          <a href="review_home.html">
            <i class="wn-icon wni-home"></i>
          </a>
        </li>
        <li class="gbm-item">
          <a href="WN_PB_MO_COM_030501.html">
            <i class="wn-icon wni-history"></i>
          </a>
        </li>
        <li class="gbm-item">
          <a href="WN_PB_MO_COM_030503.html">
            <i class="wn-icon wni-menu"></i>
          </a>
        </li>
        <li class="gbm-item">
          <a href="WN_PB_MO_SCH_010101.html">
            <i class="wn-icon wni-search"></i>
          </a>
        </li>
        <li class="gbm-item">
          <a href="WN_PB_MO_MYP_000100.html">
            <i class="wn-icon wni-user"></i>
          </a>
        </li>
      </ul>
    </div>
  </div><!-- /.site-container -->
