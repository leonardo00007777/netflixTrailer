<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp" %>

<div class="site-container">
  <header class="local-header has-nav">
    <div class="fixed-top">
      <div class="local-top">
        <a href="review_home.html" class="btn-prev"><i class="wn-icon wni-arrow-left"></i></a>
        <div class="h-row">
          <div class="h-col h-tit text-center">
            <h1 class="page-tit">과일·견과</h1>
            <button class="btn-dropdown" id="btn-top-cat" title="카테고리 모두보기"><i class="wn-icon"></i></button>
          </div>
          <div class="h-col h-menu">
            <div class="global-top-menu">
              <a href="#" class="menu-item">
                <i class="wn-icon wni-cart">장바구니</i>
              </a>
            </div>
          </div>
        </div>
        <ul class="top-cat-menu hide" id="top-cat-menu">
          <li class="menu-item active">
            <a href="#">
              <svg class="i-cat i-cat-fruit">
                <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-fruit"></use>
              </svg>
              <span>과일·견과</span>
            </a>
          </li>
          <li class="menu-item">
            <a href="#">
              <svg class="i-cat i-cat-veggie">
                <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-veggie"></use>
              </svg>
              <span>채소·버섯</span>
            </a>
          </li>
          <li class="menu-item">
            <a href="#">
              <svg class="i-cat i-cat-rice">
                <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-rice"></use>
              </svg>
              <span>쌀·잡곡</span>
            </a>
          </li>
          <li class="menu-item">
            <a href="#">
              <svg class="i-cat i-cat-meat">
                <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-meat"></use>
              </svg>
              <span>정육·계란</span>
            </a>
          </li>
          <li class="menu-item">
            <a href="#">
              <svg class="i-cat i-cat-seafood">
                <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-seafood"></use>
              </svg>
              <span>수산·건어물</span>
            </a>
          </li>
          <li class="menu-item">
            <a href="#">
              <svg class="i-cat i-cat-snack">
                <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-snack"></use>
              </svg>
              <span>음료·간식</span>
            </a>
          </li>
          <li class="menu-item">
            <a href="#">
              <svg class="i-cat i-cat-sauce">
                <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-sauce"></use>
              </svg>
              <span>양념·면</span>
            </a>
          </li>
          <li class="menu-item">
            <a href="#">
              <svg class="i-cat i-cat-hmr">
                <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-hmr"></use>
              </svg>
              <span>반찬·간편식</span>
            </a>
          </li>
          <li class="menu-item">
            <a href="#">
              <svg class="i-cat i-cat-health">
                <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-health"></use>
              </svg>
              <span>건강식품</span>
            </a>
          </li>
          <li class="menu-item">
            <a href="#">
              <svg class="i-cat i-cat-living">
                <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-living"></use>
              </svg>
              <span>리빙·반려</span>
            </a>
          </li>
          <li class="menu-item">
            <a href="#">
              <svg class="i-cat i-cat-set">
                <use xlink:href="./images/sprites/i-cat-defs.svg#i-cat-set"></use>
              </svg>
              <span>정기·선물세트</span>
            </a>
          </li>
        </ul>
      </div>
      <nav class="local-nav">
        <div class="swiper-container local-nav-swiper" id="local-nav-swiper">
          <ul class="swiper-wrapper local-nav-menu">
            <li class="swiper-slide">
              <div class="menu-item active"><a href="#"><span class="tit">전체</span></a></div>
            </li>
            <li class="swiper-slide">
              <div class="menu-item"><a href="#"><span class="tit">사과·배</span></a></div>
            </li>
            <li class="swiper-slide">
              <div class="menu-item"><a href="#"><span class="tit">감귤·한라봉</span></a></div>
            </li>
            <li class="swiper-slide">
              <div class="menu-item"><a href="#"><span class="tit">감·곶감·연시</span></a></div>
            </li>
            <li class="swiper-slide">
              <div class="menu-item"><a href="#"><span class="tit">토마토·자두·복숭아·포도</span></a></div>
            </li>
            <li class="swiper-slide">
              <div class="menu-item"><a href="#"><span class="tit">수박·메론·참외·키위</span></a></div>
            </li>
            <li class="swiper-slide">
              <div class="menu-item"><a href="#"><span class="tit">땅콩·대추·견과·건과·밤</span></a></div>
            </li>
            <li class="swiper-slide">
              <div class="menu-item"><a href="#"><span class="tit">냉동/간편과일</span></a></div>
            </li>
            <li class="swiper-slide">
              <div class="menu-item"><a href="#"><span class="tit">바나나/망고/수입과일</span></a></div>
            </li>
          </ul>
        </div>
      </nav>
    </div>
  </header>
  <main class="main-container" id="main-container">
    <div class="main-content" id="main-content">

      <hr class="spacer">

      <div class="prd-list-tools-container">
        <div class="prd-list-tools">
          <!-- <div class="prd-list-tags">
            <div class="tags-wrapper">
              <div class="tags">
                <span class="tag-item">자연이랑 추천순</span>
              </div>
            </div>
          </div> -->
          <div class="prd-list-buttons">
            <button class="item btn-filter" id="btn-filter" onclick="$('#modalPrdFilters').modal('show')"><i class="wn-icon plp-filter">필터</i></button>
          </div>
        </div>
      </div>

      <section class="prd-list prd-list-tile" id="prd-list">
        <article class="prd-item">
          <div class="img-container">
            <a href="#" class="prd-item-img">
              <img src="./images/uploads/prd-img-01.jpg" data-src='{"v":"./images/uploads/prd-img-01.jpg", "h":"./images/uploads/prd-img-01-h.jpg"}' alt="제품명">
              <div class="prd-item-badge dc">
                <span>15</span>
                <small>%</small>
              </div>
            </a>
            <div class="prd-item-buttons">
              <a href="javascript:void(0)" onclick="$('#modalBuyOption').modal('show')" class="btn btn-cart"><i class="wn-icon wni-cart-w">장바구니</i></a>
            </div>
          </div>
          <div class="detail">
            <a href="#">
              <h4 class="prd-item-tit">제품명</h4>
              <div class="prd-item-price">
                <div class="price"><span>3,480</span><small>원</small></div>
                <div class="price-org">4,800원</div>
              </div>
              <div class="prd-item-label">
                <span class="prd-label mu">무농약</span>
                <span class="prd-label ga">GAP</span>
              </div>
            </a>
          </div>
        </article>
      <%--  <article class="prd-item soldout">
          <div class="img-container">
            <a href="#" class="prd-item-img">
              <img src="./images/uploads/prd-img-01.jpg" data-src='{"v":"./images/uploads/prd-img-01.jpg", "h":"./images/uploads/prd-img-01-h.jpg"}' alt="친환경 유기농 청주 감자 5~7부 2kg">
              <div class="prd-item-soldout">
                <div class="tit">일시품절</div>
                <div class="content">
                  2020-10-29
                  <br>
                  입고예정
                </div>
              </div>
            </a>
            <div class="prd-item-buttons">
              <button class="btn btn-bell" onclick="$('#modalRestock').modal('show')"><i class="wn-icon wni-bell-w">입고알림</i></button>
            </div>
          </div>
          <div class="detail">
            <a href="#">
              <h4 class="prd-item-tit">친환경 유기농 청주 감자 5~7부 2kg</h4>
              <div class="prd-item-price">
                <div class="price"><span>3,480</span><small>원</small></div>
              </div>
              <div class="prd-item-label">
                <span class="prd-label mu">무농약</span>
                <span class="prd-label sp">특가상품</span>
              </div>
            </a>
          </div>
        </article>
        <article class="prd-item">
          <div class="img-container">
            <a href="#" class="prd-item-img">
              <img src="./images/uploads/prd-img-01.jpg" data-src='{"v":"./images/uploads/prd-img-01.jpg", "h":"./images/uploads/prd-img-01-h.jpg"}' alt="제품명이 길게 제품명이 길게제품명이 길게제품명이 길게제품명이 길게">
            </a>
            <div class="prd-item-buttons">
              <a href="javascript:void(0)" onclick="$('#modalBuyOption').modal('show')" class="btn btn-cart"><i class="wn-icon wni-cart-w">장바구니</i></a>
            </div>
          </div>
          <div class="detail">
            <a href="#">
              <h4 class="prd-item-tit">제품명이 길게 제품명이 길게제품명이 길게제품명이 길게제품명이 길게</h4>
              <div class="prd-item-price">
                <div class="price"><span>3,480</span><small>원</small></div>
                <div class="price-org">4,800원</div>
              </div>
              <div class="prd-item-label">
                <span class="prd-label ga">GAP</span>
              </div>
            </a>
          </div>
        </article>
        <article class="prd-item">
          <div class="img-container">
            <a href="#" class="prd-item-img">
              <img src="./images/uploads/prd-img-01.jpg" data-src='{"v":"./images/uploads/prd-img-01.jpg", "h":"./images/uploads/prd-img-01-h.jpg"}' alt="액츠 퍼펙트 실내건조 3.2L">
              <div class="prd-item-badge dc">
                <span>15</span>
                <small>%</small>
              </div>
            </a>
            <div class="prd-item-buttons">
              <a href="javascript:void(0)" onclick="$('#modalBuyOption').modal('show')" class="btn btn-cart"><i class="wn-icon wni-cart-w">장바구니</i></a>
            </div>
          </div>
          <div class="detail">
            <a href="#">
              <h4 class="prd-item-tit">액츠 퍼펙트 실내건조 3.2L</h4>
              <div class="prd-item-price">
                <div class="price"><span>3,480</span><small>원</small></div>
                <div class="price-org">4,800원</div>
              </div>
              <div class="prd-item-label">
                <span class="prd-label ga">GAP</span>
              </div>
            </a>
          </div>
        </article>
        <article class="prd-item">
          <div class="img-container">
            <a href="#" class="prd-item-img">
              <img src="./images/uploads/prd-img-01.jpg" data-src='{"v":"./images/uploads/prd-img-01.jpg", "h":"./images/uploads/prd-img-01-h.jpg"}' alt="액츠 퍼펙트 실내건조 3.2L">
              <div class="prd-item-badge dc">
                <span>15</span>
                <small>%</small>
              </div>
            </a>
            <div class="prd-item-buttons">
              <a href="javascript:void(0)" onclick="$('#modalBuyOption').modal('show')" class="btn btn-cart"><i class="wn-icon wni-cart-w">장바구니</i></a>
            </div>
          </div>
          <div class="detail">
            <a href="#">
              <h4 class="prd-item-tit">액츠 퍼펙트 실내건조 3.2L</h4>
              <div class="prd-item-price">
                <div class="price"><span>3,480</span><small>원</small></div>
                <div class="price-org">4,800원</div>
              </div>
              <div class="prd-item-label">
                <span class="prd-label ga">GAP</span>
              </div>
            </a>
          </div>
        </article>
        <article class="prd-item">
          <div class="img-container">
            <a href="#" class="prd-item-img">
              <img src="./images/uploads/prd-img-01.jpg" data-src='{"v":"./images/uploads/prd-img-01.jpg", "h":"./images/uploads/prd-img-01-h.jpg"}' alt="액츠 퍼펙트 실내건조 3.2L">
              <div class="prd-item-badge dc">
                <span>15</span>
                <small>%</small>
              </div>
            </a>
            <div class="prd-item-buttons">
              <a href="javascript:void(0)" onclick="$('#modalBuyOption').modal('show')" class="btn btn-cart"><i class="wn-icon wni-cart-w">장바구니</i></a>
            </div>
          </div>
          <div class="detail">
            <a href="#">
              <h4 class="prd-item-tit">액츠 퍼펙트 실내건조 3.2L</h4>
              <div class="prd-item-price">
                <div class="price"><span>3,480</span><small>원</small></div>
                <div class="price-org">4,800원</div>
              </div>
              <div class="prd-item-label">
                <span class="prd-label ga">GAP</span>
              </div>
            </a>
          </div>
        </article>--%>
      </section>

      <div class="spacer-bottom"></div>

    </div><!-- /.main-content -->
  </main>
  <div class="quick-menu" id="quick-menu">
    <a href="WN_PB_MO_GDS_020101.html" class="quick-menu-button btn-chat"><i class="wn-icon wni-message-square">채팅상담</i></a>
    <a href="review.html" class="quick-menu-button" id="page-top-button"><i class="wn-icon wni-chevron-v">Top</i></a>
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
</div>

<!-- Modal - 재입고 알림 신청 -->
<div class="modal fade wn-modal" id="modalRestock">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
      <h2 class="wn-modal-header">재입고 알림 신청</h2>
      <div class="wn-modal-body">
        <ul>
          <li>
            <h4 class="t-14 t-green">상품명</h4>
            <div class="mt-xs t-hd">맛있는 아이스 홍시 100g ...</div>
          </li>
          <li class="mt-20">
            <h4 class="t-14 t-green">휴대폰</h4>
            <div class="mt-xs t-hd">010-5523-2038</div>
          </li>
        </ul>
        <hr class="solid-line mt-20">
        <div class="mt-m t-gray t-15 lh-20">
          ※ 상품이 재입고 되면 등록하신 휴대폰 번호로 알려 드립니다.
        </div>
      </div>
      <div class="wn-modal-footer">
        <button class="button bt-l bt-gray bt-rect d-block" data-dismiss="modal">취소</button>
        <button class="button bt-l bt-green bt-rect d-block">알림신청</button>
      </div>
    </div>
  </div>
</div>

<!-- Bottom Sheet - 상품 필터 -->
<div class="modal fade wn-modal-bottom modal-prd-filters" id="modalPrdFilters">
  <div class="modal-dialog">
    <div class="modal-content">
      <button class="btn-close" data-dismiss="modal">닫기</button>
      <div class="overflow-auto">
        <div class="wn-modal-header">
          <h2 class="tit">필터</h2>
        </div>
        <div class="wn-modal-body">
          <ul class="prd-filter-list">
            <li>
              <h4 class="hd">상품 목록 유형</h4>
              <div class="select-group">
                <button class="select-item btn-layout active" data-layout="tile">
                  <div class="icon-container">
                    <div class="wn-icon plp-tile"></div>
                  </div>
                  <span class="label">2xN</span>
                </button>
                <button class="select-item btn-layout" data-layout="large">
                  <div class="icon-container">
                    <div class="wn-icon plp-large"></div>
                  </div>
                  <span class="label">1xN</span>
                </button>
                <button class="select-item btn-layout" data-layout="list">
                  <div class="icon-container">
                    <div class="wn-icon plp-list"></div>
                  </div>
                  <span class="label">목록형</span>
                </button>
              </div>
            </li>
            <li>
              <h4 class="hd">상품 정렬</h4>
              <div class="radio-list">
                <div class="item">
                  <label class="radio">
                    <input type="radio" name="radio-order" id="" value="" checked>
                    <span class="label">자연이랑 추천순</span>
                  </label>
                </div>
                <div class="item">
                  <label class="radio">
                    <input type="radio" name="radio-order" id="" value="">
                    <span class="label">상품명순</span>
                  </label>
                </div>
                <div class="item">
                  <label class="radio">
                    <input type="radio" name="radio-order" id="" value="">
                    <span class="label">인기상품순</span>
                  </label>
                </div>
                <div class="item">
                  <label class="radio">
                    <input type="radio" name="radio-order" id="" value="">
                    <span class="label">낮은 가격순</span>
                  </label>
                </div>
                <div class="item">
                  <label class="radio">
                    <input type="radio" name="radio-order" id="" value="">
                    <span class="label">높은 가격순</span>
                  </label>
                </div>
              </div>
            </li>
            <li>
              <h4 class="hd">발송유형</h4>
              <div class="radio-list">
                <div class="item">
                  <label class="radio">
                    <input type="radio" name="radio-shipping" id="" value="" checked>
                    <span class="label">전체</span>
                  </label>
                </div>
                <div class="item">
                  <label class="radio">
                    <input type="radio" name="radio-shipping" id="" value="">
                    <span class="label">자연이랑 발송</span>
                  </label>
                </div>
                <div class="item">
                  <label class="radio">
                    <input type="radio" name="radio-shipping" id="" value="">
                    <span class="label">업체 직송</span>
                  </label>
                </div>
              </div>
            </li>
          </ul>
          <div class="wn-modal-footer">
            <button class="button bt-l bt-green bt-rect d-block" data-dismiss="modal">확인</button>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>

<!-- Modal - Buy Option -->
<div class="modal fade wn-modal-bottom modal-buy-option" id="modalBuyOption">
  <div class="modal-dialog">
    <div class="modal-content">
      <button class="btn-close" data-dismiss="modal">닫기</button>
      <div class="overflow-auto">
        <div class="wn-modal-body">
          <div class="buy-options">
            <div class="buy-option-item">
              <div class="label">맛있는 아이스 홍시 1개입</div>
              <div class="content">
                <div class="input-number">
                  <button class="dec"></button>
                  <input class="num" type="text" value="1" readonly>
                  <button class="inc"></button>
                </div>
                <div class="price-format">3,480<small>원</small></div>
              </div>
            </div>
            <div class="buy-option-item">
              <div class="label">맛있는 아이스 홍시 & 바나나</div>
              <div class="content">
                <div class="input-number">
                  <button class="dec"></button>
                  <input class="num" type="text" value="0" readonly>
                  <button class="inc"></button>
                </div>
                <div class="price-format">0<small>원</small></div>
              </div>
            </div>
            <div class="buy-option-item">
              <div class="label">맛있는 아이스 바나나</div>
              <div class="content">
                <div class="input-number">
                  <button class="dec"></button>
                  <input class="num" type="text" value="0" readonly>
                  <button class="inc"></button>
                </div>
                <div class="price-format">0<small>원</small></div>
              </div>
            </div>
            <div class="buy-option-total">
              <span class="label">합계</span>
              <span class="price-format">3,480<small>원</small></span>
            </div>
          </div>
        </div>
        <footer class="wn-modal-footer">
          <button class="button bt-l bt-white gray-7 bt-rect" onclick="location.href = '' ">정기배송 신청</button>
          <button class="button bt-l bt-gray bt-rect" onclick="location.href = 'WN_PB_MO_ORD_020101.html' ">바로구매</button>
          <button class="button bt-l bt-green bt-rect"  onclick="location.href = 'WN_PB_MO_ORD_010101.html' ">장바구니</button>
        </footer>
      </div>
    </div>
  </div>
</div>
