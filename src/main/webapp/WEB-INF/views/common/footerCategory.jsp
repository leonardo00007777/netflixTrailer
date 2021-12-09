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
          <a href="#" class="btn-prev"><i class="wn-icon wni-arrow-left"></i></a>
          <div class="h-row">
            <div class="h-col h-tit">
              <h1 class="page-tit text-center">카테고리</h1>
            </div>
            <div class="h-col h-menu">
              <div class="global-top-menu">
                <a href="#" class="menu-item">
                  <i class="wn-icon wni-cart">장바구니</i>
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <hr class="spacer">
        <nav class="cate-nav">
          <ul class="global-cate-menu">
            <li class="fold-section ani">
              <a href="javascript:void(0)" class="gc-main-item fold-button">
                <div class="tit">
                  <svg class="i-cat i-cat-fruit">
                    <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-fruit"></use>
                  </svg>
                  <span>과일·견과</span>
                </div>
                <i class="wn-icon chevron-v-16 fold-icon"></i>
              </a>
              <ul class="gc-sub-list fold-open-show">
                <li><a href="#" class="gc-sub-item">전체보기</a></li>
                <li><a href="#" class="gc-sub-item">백미</a></li>
                <li><a href="#" class="gc-sub-item">현미 · 찹쌀 · 흑미</a></li>
                <li><a href="#" class="gc-sub-item">콩 · 보리 · 혼합곡</a></li>
                <li><a href="#" class="gc-sub-item">찹쌀가루 · 미숫가루</a></li>
              </ul>
            </li>
            <li class="fold-section ani">
              <a href="javascript:void(0)" class="gc-main-item fold-button">
                <div class="tit">
                  <svg class="i-cat i-cat-veggie">
                    <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-veggie"></use>
                  </svg>
                  <span>채소·버섯</span>
                </div>
                <i class="wn-icon chevron-v-16 fold-icon"></i>
              </a>
              <ul class="gc-sub-list fold-open-show">
                <li><a href="#" class="gc-sub-item">전체보기</a></li>
                <li><a href="#" class="gc-sub-item">백미</a></li>
                <li><a href="#" class="gc-sub-item">현미 · 찹쌀 · 흑미</a></li>
                <li><a href="#" class="gc-sub-item">콩 · 보리 · 혼합곡</a></li>
                <li><a href="#" class="gc-sub-item">찹쌀가루 · 미숫가루</a></li>
              </ul>
            </li>
            <li class="fold-section ani">
              <a href="javascript:void(0)" class="gc-main-item fold-button">
                <div class="tit">
                  <svg class="i-cat i-cat-rice">
                    <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-rice"></use>
                  </svg>
                  <span>쌀·잡곡</span>
                </div>
                <i class="wn-icon chevron-v-16 fold-icon"></i>
              </a>
              <ul class="gc-sub-list fold-open-show">
                <li><a href="#" class="gc-sub-item">전체보기</a></li>
                <li><a href="#" class="gc-sub-item">백미</a></li>
                <li><a href="#" class="gc-sub-item">현미 · 찹쌀 · 흑미</a></li>
                <li><a href="#" class="gc-sub-item">콩 · 보리 · 혼합곡</a></li>
                <li><a href="#" class="gc-sub-item">찹쌀가루 · 미숫가루</a></li>
              </ul>
            </li>
            <li class="fold-section ani">
              <a href="javascript:void(0)" class="gc-main-item fold-button">
                <div class="tit">
                  <svg class="i-cat i-cat-meat">
                    <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-meat"></use>
                  </svg>
                  <span>정육·계란</span>
                </div>
                <i class="wn-icon chevron-v-16 fold-icon"></i>
              </a>
              <ul class="gc-sub-list fold-open-show">
                <li><a href="#" class="gc-sub-item">전체보기</a></li>
                <li><a href="#" class="gc-sub-item">백미</a></li>
                <li><a href="#" class="gc-sub-item">현미 · 찹쌀 · 흑미</a></li>
                <li><a href="#" class="gc-sub-item">콩 · 보리 · 혼합곡</a></li>
                <li><a href="#" class="gc-sub-item">찹쌀가루 · 미숫가루</a></li>
              </ul>
            </li>
            <li class="fold-section ani">
              <a href="javascript:void(0)" class="gc-main-item fold-button">
                <div class="tit">
                  <svg class="i-cat i-cat-seafood">
                    <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-seafood"></use>
                  </svg>
                  <span>수산·건어물</span>
                </div>
                <i class="wn-icon chevron-v-16 fold-icon"></i>
              </a>
              <ul class="gc-sub-list fold-open-show">
                <li><a href="#" class="gc-sub-item">전체보기</a></li>
                <li><a href="#" class="gc-sub-item">백미</a></li>
                <li><a href="#" class="gc-sub-item">현미 · 찹쌀 · 흑미</a></li>
                <li><a href="#" class="gc-sub-item">콩 · 보리 · 혼합곡</a></li>
                <li><a href="#" class="gc-sub-item">찹쌀가루 · 미숫가루</a></li>
              </ul>
            </li>
            <li class="fold-section ani">
              <a href="javascript:void(0)" class="gc-main-item fold-button">
                <div class="tit">
                  <svg class="i-cat i-cat-snack">
                    <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-snack"></use>
                  </svg>
                  <span>음료·간식</span>
                </div>
                <i class="wn-icon chevron-v-16 fold-icon"></i>
              </a>
              <ul class="gc-sub-list fold-open-show">
                <li><a href="#" class="gc-sub-item">전체보기</a></li>
                <li><a href="#" class="gc-sub-item">백미</a></li>
                <li><a href="#" class="gc-sub-item">현미 · 찹쌀 · 흑미</a></li>
                <li><a href="#" class="gc-sub-item">콩 · 보리 · 혼합곡</a></li>
                <li><a href="#" class="gc-sub-item">찹쌀가루 · 미숫가루</a></li>
              </ul>
            </li>
            <li class="fold-section ani">
              <a href="javascript:void(0)" class="gc-main-item fold-button">
                <div class="tit">
                  <svg class="i-cat i-cat-sauce">
                    <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-sauce"></use>
                  </svg>
                  <span>양념·면</span>
                </div>
                <i class="wn-icon chevron-v-16 fold-icon"></i>
              </a>
              <ul class="gc-sub-list fold-open-show">
                <li><a href="#" class="gc-sub-item">전체보기</a></li>
                <li><a href="#" class="gc-sub-item">백미</a></li>
                <li><a href="#" class="gc-sub-item">현미 · 찹쌀 · 흑미</a></li>
                <li><a href="#" class="gc-sub-item">콩 · 보리 · 혼합곡</a></li>
                <li><a href="#" class="gc-sub-item">찹쌀가루 · 미숫가루</a></li>
              </ul>
            </li>
            <li class="fold-section ani">
              <a href="javascript:void(0)" class="gc-main-item fold-button">
                <div class="tit">
                  <svg class="i-cat i-cat-hmr">
                    <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-hmr"></use>
                  </svg>
                  <span>반찬·간편식</span>
                </div>
                <i class="wn-icon chevron-v-16 fold-icon"></i>
              </a>
              <ul class="gc-sub-list fold-open-show">
                <li><a href="#" class="gc-sub-item">전체보기</a></li>
                <li><a href="#" class="gc-sub-item">백미</a></li>
                <li><a href="#" class="gc-sub-item">현미 · 찹쌀 · 흑미</a></li>
                <li><a href="#" class="gc-sub-item">콩 · 보리 · 혼합곡</a></li>
                <li><a href="#" class="gc-sub-item">찹쌀가루 · 미숫가루</a></li>
              </ul>
            </li>
            <li class="fold-section ani">
              <a href="javascript:void(0)" class="gc-main-item fold-button">
                <div class="tit">
                  <svg class="i-cat i-cat-health">
                    <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-health"></use>
                  </svg>
                  <span>건강식품</span>
                </div>
                <i class="wn-icon chevron-v-16 fold-icon"></i>
              </a>
              <ul class="gc-sub-list fold-open-show">
                <li><a href="#" class="gc-sub-item">전체보기</a></li>
                <li><a href="#" class="gc-sub-item">백미</a></li>
                <li><a href="#" class="gc-sub-item">현미 · 찹쌀 · 흑미</a></li>
                <li><a href="#" class="gc-sub-item">콩 · 보리 · 혼합곡</a></li>
                <li><a href="#" class="gc-sub-item">찹쌀가루 · 미숫가루</a></li>
              </ul>
            </li>
            <li class="fold-section ani">
              <a href="javascript:void(0)" class="gc-main-item fold-button">
                <div class="tit">
                  <svg class="i-cat i-cat-living">
                    <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-living"></use>
                  </svg>
                  <span>리빙·반려</span>
                </div>
                <i class="wn-icon chevron-v-16 fold-icon"></i>
              </a>
              <ul class="gc-sub-list fold-open-show">
                <li><a href="#" class="gc-sub-item">전체보기</a></li>
                <li><a href="#" class="gc-sub-item">백미</a></li>
                <li><a href="#" class="gc-sub-item">현미 · 찹쌀 · 흑미</a></li>
                <li><a href="#" class="gc-sub-item">콩 · 보리 · 혼합곡</a></li>
                <li><a href="#" class="gc-sub-item">찹쌀가루 · 미숫가루</a></li>
              </ul>
            </li>
            <li class="fold-section ani">
              <a href="javascript:void(0)" class="gc-main-item fold-button">
                <div class="tit">
                  <svg class="i-cat i-cat-set">
                    <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-set"></use>
                  </svg>
                  <span>정기·선물세트</span>
                </div>
                <i class="wn-icon chevron-v-16 fold-icon"></i>
              </a>
              <ul class="gc-sub-list fold-open-show">
                <li><a href="#" class="gc-sub-item">전체보기</a></li>
                <li><a href="#" class="gc-sub-item">백미</a></li>
                <li><a href="#" class="gc-sub-item">현미 · 찹쌀 · 흑미</a></li>
                <li><a href="#" class="gc-sub-item">콩 · 보리 · 혼합곡</a></li>
                <li><a href="#" class="gc-sub-item">찹쌀가루 · 미숫가루</a></li>
              </ul>
            </li>
          </ul>
        </nav>

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
          <a href="review_home.html">
            <i class="wn-icon wni-home"></i>
          </a>
        </li>
        <li class="gbm-item">
          <a href="WN_PB_MO_COM_030501.html">
            <i class="wn-icon wni-history"></i>
          </a>
        </li>
        <li class="gbm-item active">
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
          <a href="WN_PB_MO_MYP_000200.html">
            <i class="wn-icon wni-user"></i>
          </a>
        </li>
      </ul>
    </div>
  </div><!-- /.site-container -->

