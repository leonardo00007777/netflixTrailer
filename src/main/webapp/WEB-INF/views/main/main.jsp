<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp" %>

<div class="site-container">
  <header class="global-header" id="global-header" style="height: 0px;">
    <div class="global-header-wrap" id="sticky-header">
      <div class="global-top" id="global-top">
        <div class="header-logo-container">
          <a href="#">
            <h1 class="header-logo" title="자연이랑"></h1>
          </a>
        </div>
        <div class="global-top-menu">
          <a href="javascript:void(0)" class="menu-item">
            <i class="wn-icon wni-bell" onclick="$('#modalNotification').modal('show')">Notification</i>
            <span class="circle-badge"></span>
          </a>
          <a href="javascript:void(0)" class="menu-item" id="gnbBtnCart">
            <i class="wn-icon wni-cart">장바구니</i>
            <span class="num-badge">9</span>
          </a>
        </div>
      </div>
      <!-- <div class="global-nav" id="sticky-nav">
        <ul class="global-nav-menu">
          <li class="menu-item"><a href="#"><span class="tit">신상품</span></a></li>
          <li class="menu-item active"><a href="#"><span class="tit">할인관</span></a></li>
          <li class="menu-item"><a href="#"><span class="tit">베스트</span></a></li>
          <li class="menu-item"><a href="#"><span class="tit">전문관</span></a></li>
          <li class="menu-item"><a href="#"><span class="tit">이벤트</span></a></li>
        </ul>
      </div> -->
    </div>
  </header>
  <main class="main-container" id="main-container">
    <div class="main-content" id="main-content">
      <!-- 키 비주얼 A2 ------------------------- -->
      <section class="com-keyvisual-a">
        <div class="kv-container">
          <div class="swiper-container swiper-dot-main" id="swiperKvA2">
            <div class="swiper-wrapper">
              <c:forEach items="${renewalBannerList}" var="renewalBannerList" varStatus="status">
                <div class="swiper-slide">
                  <a href="#"><img src="<%=_imgUrl %>images/banner/${renewalBannerList.cbnpath01}" alt="banner1"></a>
                </div>
                <div class="swiper-slide">
                  <a href="#"><img src="<%=_imgUrl %>images/banner/${renewalBannerList.cbnpath02}" alt="banner2"></a>
                </div>
              </c:forEach>
            </div>
            <div class="swiper-kv-footer">
              <div class="swiper-pgn-dots-main">
              </div>
              <div class="swiper-btn-autoplay"><i class="swiper-icon-pause"></i></div>
            </div>
          </div>
        </div>
        <div class="global-nav-container">
          <div class="global-nav scroll-fixed-top" id="globalNavContainer">
            <ul class="global-nav-menu" id="mainTab">
              <li class="menu-item active"><a href="javascript:void(0);" onclick="mainBodyOn(0);"><span class="tit">메인</span></a></li>
              <li class="menu-item"><a href="javascript:void(0);" onclick="mainBodyOn(1);"><span class="tit">신상품</span></a></li>
              <li class="menu-item"><a href="javascript:void(0);" onclick="mainBodyOn(2);"><span class="tit">할인관</span></a></li>
              <li class="menu-item"><a href="javascript:void(0);" onclick="mainBodyOn(3);"><span class="tit">베스트</span></a></li>
              <li class="menu-item"><a href="javascript:void(0);" onclick="mainBodyOn(4);"><span class="tit">전문관</span></a></li>
              <li class="menu-item"><a href="javascript:void(0);" onclick="mainBodyOn(5);"><span class="tit">이벤트</span></a></li>
            </ul>
          </div>
        </div>
      </section>

    </div><!-- /.main-content -->
    <footer class="global-footer">
      <section class="footer-bt">
        <a href="#" class="button bt-outline bt-steel"><i class="wn-icon store-apple"></i>App Store</a>
        <a href="#" class="button bt-outline bt-steel"><i class="wn-icon store-google"></i>Play Store</a>
      </section>
      <nav class="global-footer-menu">
        <div class="wrapper">
          <div class="main-item"><a href="WN_PB_MO_ETC_030100.html">자연이랑소개</a></div>
          <div class="main-item"><a href="WN_PB_MO_ETC_040100.html" class="active">올바른밥상</a></div>
        </div>
        <div class="wrapper">
          <div class="main-item"><a href="#">고객센터</a></div>
          <div class="main-item"><a href="#">제휴문의</a></div>
          <div class="main-item"><a href="#">이용약관</a></div>
          <div class="main-item"><a href="#">개인정보처리방침</a></div>
        </div>
      </nav>
      <section class="footer-business-info fold-section">
        <div class="toggle-button-container">
          <a class="toggle-button fold-button" href="javascript:void(0)">자연이랑 사업자 정보 <i class="wn-icon bt-chevron-v-gray"></i></a>
        </div>
        <div class="business-info-content fold-open-show">
          재단법인 행복에프앤씨 (자연이랑 분사무소) 대표자 : 안범환<br>
          사업자등록번호: 794-85-00155 <a href="#" class="green-sub">[사업자등록번호확인]</a><br>
          통신판매업신고: 2016-서울용산-00340<br>
          개인정보 보호 책임자 : 김흥완<br>
          <br>
          서울시 용산구 장문로 54, SEL빌딩 4층 자연이랑<br>
          080-303-6262 / 02-6445-5500<br>
          <a href="mailto:help@happyfnc.org">help@happyfnc.org</a>
        </div>
      </section>
      <ul class="footer-privacy">
        <li><a href="javascript:void(0)" onclick="$('#popISMS').modal('show')">정보보호 관리<br>체계 인증 획득</a></li>
        <li><a href="javascript:void(0)" onclick="$('#popSSL').modal('show')">Secure Sockets<br>Layer 적용</a></li>
        <li><a href="javascript:void(0)" class="item" onclick="$('#popEscrow').modal('show')">에스크로<br>서비스 제공</a></li>
      </ul>
      <ul class="footer-sns-list">
        <li><a href="#"><i class="wn-icon sns-25-fb">Facebook</i></a></li>
        <li><a href="#"><i class="wn-icon sns-25-in">Instagram</i></a></li>
        <li><a href="#"><i class="wn-icon sns-25-nv">Naver Blog</i></a></li>
        <li><a href="#"><i class="wn-icon sns-25-kko">Kakaotalk</i></a></li>
      </ul>
      <section class="footer-copyright">Copyright(C) 2017 WithNature All rights reserved.</section>
    </footer>
  </main>

  <div class="quick-menu" id="quick-menu" style="display: none;">
    <a href="#" class="quick-menu-button btn-chat"><i class="wn-icon wni-message-square">채팅상담</i></a>
    <a href="#" class="quick-menu-button" id="page-top-button"><i class="wn-icon wni-chevron-v">Top</i></a>
  </div>
  <div class="global-bottom">
    <ul class="global-bottom-menu">
      <li class="gbm-item active">
        <a href="WN_PB_MO_COM_swiperMenu.html">
          <i class="wn-icon wni-home"></i>
          <!-- <span class="tit">홈</span> -->
        </a>
      </li>
      <li class="gbm-item">
        <a href="WN_PB_MO_COM_030501.html">
          <i class="wn-icon wni-history"></i>
          <!-- <span class="tit">타임라인</span> -->
        </a>
      </li>
      <li class="gbm-item">
        <a href="WN_PB_MO_COM_030503.html">
          <i class="wn-icon wni-menu"></i>
          <!-- <span class="tit">카테고리</span> -->
        </a>
      </li>
      <li class="gbm-item">
        <a href="WN_PB_MO_SCH_010101.html">
          <i class="wn-icon wni-search"></i>
          <!-- <span class="tit">검색</span> -->
        </a>
      </li>
      <li class="gbm-item">
        <a href="WN_PB_MO_MYP_000100.html">
          <i class="wn-icon wni-user"></i>
          <span class="tit">마이자연</span>
        </a>
      </li>
    </ul>
  </div>
</div>


  <!-- Bottom Sheet Modal Code -->
  <div class="modal fade wn-modal-bottom modal-notification" id="modalNotification">
    <div class="modal-dialog">
      <div class="modal-content">
        <button class="btn-close" data-dismiss="modal">닫기</button>
        <div class="overflow-auto">
          <div class="wn-modal-header">
            <h2 class="tit">Notification <b class="green-sub ml-2">13</b></h2>
          </div>
          <div class="wn-modal-body">
            <div class="notifi-list">
              <div class="notifi-item">
                <div class="img-container">
                  <div class="prd-img thumb-6 rounded-4">
                    <img src="<%=_imgUrl %>/images/uploads/prd-img-01.jpg" alt="[정덕원 농부] 제주의 달콤향긋 애플망고 2kg (5~7수)">
                  </div>
                </div>
                <div class="detail">
                  <div class="header">
                    <h4 class="tit">배송예정</h4>
                    <div class="date">30분 전</div>
                  </div>
                  <div class="content">
                    업체 직송 배송상품(달콤한 망고를 그...)이 우체국택배(송장번호:123456897)를 통해 7/26(일) 도착 예정입니다!
                  </div>
                </div>
              </div>
              <div class="notifi-item">
                <div class="img-container">
                  <div class="prd-img thumb-6 rounded-4">
                    <img src="<%=_imgUrl %>/images/uploads/prd-img-01.jpg" alt="[정덕원 농부] 제주의 달콤향긋 애플망고 2kg (5~7수)">
                  </div>
                </div>
                <div class="detail">
                  <div class="header">
                    <h4 class="tit">구매후기</h4>
                    <div class="date">13시간 전</div>
                  </div>
                  <div class="content">
                    업체 직송 배송상품(달콤한 망고를 그...)이 우체국택배(송장번호:123456897)를 통해 7/26(일) 도착 예정입니다!
                  </div>
                </div>
              </div>
              <div class="notifi-item">
                <div class="detail">
                  <div class="header">
                    <h4 class="tit">포인트 소멸 예정</h4>
                    <div class="date">9월 10일</div>
                  </div>
                  <div class="content">
                    3,800 포인트가 2020년 8월 15일에 소멸될 예정 입니다. 혜택이 사라지기전에 사용해보세요^^
                  </div>
                </div>
              </div>
              <div class="notifi-item">
                <div class="detail">
                  <div class="header">
                    <h4 class="tit">이벤트</h4>
                    <div class="date">9월 16일</div>
                  </div>
                  <div class="content">
                    [이벤트] 자연에서本 촉촉 감동 100
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>


  <div class="modal fade wn-marketing-popup" id="popMarketing">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="overflow-auto">
          <div class="wn-modal-body">
            <div class="swiper-container swiper-mkp">
              <div class="swiper-wrapper">
                <div class="swiper-slide">
                  <a href="#"><img src="<%=_imgUrl %>/images/uploads/marketingPopBanner@2x.jpg" alt="정성스럽게 선별한 완도 특대 전복 1kg"></a>
                </div>
                <div class="swiper-slide">
                  <a href="#"><img src="<%=_imgUrl %>/images/uploads/marketingPopBanner@2x.jpg" alt="정성스럽게 선별한 완도 특대 전복 1kg"></a>
                </div>
                <div class="swiper-slide">
                  <a href="#"><img src="<%=_imgUrl %>/images/uploads/marketingPopBanner@2x.jpg" alt="정성스럽게 선별한 완도 특대 전복 1kg"></a>
                </div>
              </div>
              <div class="swiper-mkp-control">
                <div class="swiper-btn-autoplay"><i class="swiper-icon-pause"></i></div>
                <div class="discountProd.discountRate"></div>
              </div>
            </div>
            <footer class="wn-marketing-footer">
              <button class="btn-close-today" onclick="$('#popMarketing').modal('hide')">오늘 하루 보지 않기</button>
              <button class="btn-close-pop" data-dismiss="modal">닫기</button>
            </footer>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Modal - 신상품 --------------------------------------------------------------- -->
  <!-- Modal - 재입고 알림 신청 -->
  <div class="modal fade wn-modal" id="modalRestock">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <h2 class="wn-modal-header">재입고 알림 신청</h2>
        <div class="wn-modal-body">
          <div class="dl-box">
            <dl>
              <dt>상품명</dt>
              <dd>맛있는 아이스 홍시 100g 맛있는 아이스 홍시 100g</dd>
            </dl>
            <dl>
              <dt>휴대폰</dt>
              <dd>010-5523-2038</dd>
            </dl>
          </div>
          <div class="color-steel t-14 lh-m mt-sp-6">
            ※ 상품이 재입고 되면 등록하신 휴대폰 번호로 알려 드립니다.
          </div>
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-m bt-white bt-rect d-block" data-dismiss="modal">취소</button>
          <button class="button bt-m bt-green bt-rect d-block">알림신청</button>
        </div>
      </div>
    </div>
  </div>

  <!-- Bottom Sheet - 상품 필터 (신상품) -->
  <div class="modal fade wn-modal-bottom modal-prd-filters" id="modalNewPrdFilters">
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
                  <button class="select-item btn-layout active" data-layout="tile" data-list="#newPrdList">
                    <div class="icon-container">
                      <div class="wn-icon plp-tile"></div>
                    </div>
                    <span class="label">2xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="large" data-list="#newPrdList">
                    <div class="icon-container">
                      <div class="wn-icon plp-large"></div>
                    </div>
                    <span class="label">1xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="list" data-list="#newPrdList">
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
                      <input type="radio" name="orderByNew" id="newProdOrderByNew" value="PI" onclick="prodFilter('newProd');" checked>
                      <span class="label">신상품순</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="orderByNew" id="newProdOrderByHot" value="PB" onclick="prodFilter('newProd');">
                      <span class="label">인기순</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="orderByNew" id="newProdOrderByDc" value="PP" onclick="prodFilter('newProd');">
                      <span class="label">할인율순</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="orderByNew" id="newProdOrderByNm" value="PN" onclick="prodFilter('newProd');">
                      <span class="label">상품명순</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="orderByNew" id="newProdOrderByLowPrc" value="PU" onclick="prodFilter('newProd');">
                      <span class="label">낮은가격순</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="orderByNew" id="newProdOrderByHighPrc" value="PD" onclick="prodFilter('newProd');">
                      <span class="label">높은가격순</span>
                    </label>
                  </div>
                </div>
              </li>
              <li>
                <h4 class="hd">발송유형</h4>
                <div class="radio-list">
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="newProdDispatch" id="deliveryAll"  value="" onclick="prodFilter('newProd');" checked>
                      <span class="label">전체</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="newProdDispatch" id="selfDelivery" value="I" onclick="prodFilter('newProd');">
                      <span class="label">자연이랑 발송</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="newProdDispatch" id="companyDelivery" value="O" onclick="prodFilter('newProd');">
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

  <!-- Bottom Sheet - 상품 필터 (할인관) -->
  <div class="modal fade wn-modal-bottom modal-prd-filters" id="modalDcPrdFilters">
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
                  <button class="select-item btn-layout active" data-layout="tile" data-list="#dcPrdList">
                    <div class="icon-container">
                      <div class="wn-icon plp-tile"></div>
                    </div>
                    <span class="label">2xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="large" data-list="#dcPrdList">
                    <div class="icon-container">
                      <div class="wn-icon plp-large"></div>
                    </div>
                    <span class="label">1xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="list" data-list="#dcPrdList">
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
                      <input type="radio" name="orderByDis" id="orderByDisRate" value="PP" onclick="prodFilter('dcProd')" checked>
                      <span class="label">할인율순</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="orderByDis" id="orderByDisName" value="PB" onclick="prodFilter('dcProd')">
                      <span class="label">인기상품순</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="orderByDis" id="orderByDisNew" value="PI" onclick="prodFilter('dcProd')">
                      <span class="label">신상품순</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="orderByDis" id="orderByDisNm" value="PN" onclick="prodFilter('dcProd')">
                      <span class="label">상품명순</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="orderByDis" id="orderByDisLowPrc" value="PU" onclick="prodFilter('dcProd')">
                      <span class="label">낮은 가격순</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="orderByDis" id="orderByDisHighPrc" value="PD" onclick="prodFilter('dcProd')">
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
                      <input type="radio" name="dispatchDis" id="dispatchDisAll" value="" checked onclick="prodFilter('dcProd')">
                      <span class="label">전체</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="dispatchDis" id="dispatchDisSelfDlv" value="I" onclick="prodFilter('dcProd')">
                      <span class="label">자연이랑 발송</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="dispatchDis" id="dispatchDisCompanyDlv" value="O" onclick="prodFilter('dcProd')">
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