<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp" %>
<% pageContext.setAttribute("newLineChar", "\\n"); %>

<div class="site-container">
  <header class="local-header">
    <div class="fixed-top">
      <div class="local-top">
        <a href="javascript:history.back();" class="btn-prev"><i class="wn-icon wni-arrow-left"></i></a>
        <div class="h-row">
          <div class="h-col h-tit">
            <div class="header-logo-container toggle-point-hide">
              <a href="#">
                <h1 class="header-logo" title="자연이랑"></h1>
              </a>
            </div>
          </div>
          <div class="h-col h-menu">
            <div class="global-top-menu">
              <a href="javascript:void(0)" class="menu-item toggle-point-show" onclick="$('#modalSNS').modal('show')">
                <i class="wn-icon wni-share">공유</i>
              </a>
              <a href="WN_PB_MO_ORD_010101.html" class="menu-item">
                <i class="wn-icon wni-cart">장바구니</i>
                <!-- <span class="num-badge">0</span> -->
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </header>
  <main class="main-container" id="main-container">
    <div class="main-content" id="main-content">
      <section class="prd-detail-img">
        <div class="swiper-container swipder-prd-main" id="prdImgSwiper">
          <div class="swiper-wrapper">
            <c:forEach items="${itemDetail}" var="itemDetail">
              <div class="swiper-slide">
                <img src="<%=_imgUrl %>/images/gdimg/${itemDetail.mgdimg1}" alt="${itemDetail.shortdesc}">
              </div>
            </c:forEach>
          </div>
          <div class="swiper-pgn-footer">
            <div class="swiper-pgn-dots-main">
            </div>
          </div>
        </div>
      </section>
      <c:forEach items="${itemDetail}" var="itemDetail">
        <fmt:formatNumber type="number"
                          maxFractionDigits="0"
                          var="discountRate"
                          value="${itemDetail.discountRate + ((itemDetail.discountRate%1>0.5)?(1-(itemDetail.discountRate%1))%1:-(itemDetail.discountRate%1))}"
        />
        <section class="prd-detail-info">
          <div class="prd-detail-share">
            <button class="btn-share-outline" onclick="$('#modalSNS').modal('show')"><i class="wn-icon wni-share">공유</i></button>
          </div>
          <div class="prd-detail-label">
            <span class="prd-label mu">${itemDetail.origin}</span>
            <span class="prd-label sp">${itemDetail.gradedesc}</span>
          </div>
          <h3 class="prd-detail-tit toggle-point">${itemDetail.gdname}</h3>
          <div class="prd-detail-desc">
            ${itemDetail.shortdesc}
          </div>
          <div class="prd-detail-price prd-item-price">
            <c:if test="${discountRate > 0}">
              <div class="dc">
                <span>${discountRate}</span><small>%</small>
              </div>
            </c:if>
            <c:choose>
              <c:when test="${itemDetail.price1 ne itemDetail.saleprice}">
                <div class="prd-item-price">
                  <div class="price">
                    <span><fmt:formatNumber value="${itemDetail.saleprice}" pattern="#,###" /></span><small>원</small>
                  </div>
                  <div class="price-org">
                    <fmt:formatNumber value="${itemDetail.price1}" pattern="#,###" />원
                  </div>
                </div>
              </c:when>
              <c:otherwise>
                <div class="prd-item-price">
                  <div class="price">
                    <span><fmt:formatNumber value="${itemDetail.price1}" pattern="#,###" /></span><small>원</small>
                  </div>
                </div>
              </c:otherwise>
            </c:choose>
<%--            <c:if test="">
              <div class="dc-tag">
                <span class="label">홍길동님 추가 할인 적용</span>
              </div>
            </c:if>--%>
          </div>
          <ul class="prd-info-promo">
            <c:choose>
              <c:when test="${paramMap.strMEMGRPCD ne null and paramMap.strMEMGRPCD ne '' }">
                <li>
                  <div class="content">
                    <i class="wn-icon pi-point"></i>
                    <span>최대 250 포인트 적립 가능</span>
                  </div>
                  <div class="label">
                    <a href="#">멤버십 혜택</a>
                  </div>
                </li>
              </c:when>
              <c:otherwise>
                <li>
                  <div class="content">
                    <i class="wn-icon pi-point"></i>
                    <span class="logout">로그인 후, 쿠폰과 포인트 적립혜택이 제공됩니다.</span>
                  </div>
                </li>
              </c:otherwise>
            </c:choose>
            <li>
              <div class="label" style="margin-left: 0px;">
                <a href="javascript:void(0)" onclick="$('#modalCardPromotion').modal('show')">
                  <i class="wn-icon pi-card"></i>
                  <span>현대카드 결제 시 5% 추가 할인</span>
                </a>
              </div>
              <div class="label">
                <a href="javascript:void(0)" onclick="$('#modalInstallment').modal('show')">무이자할부 혜택</a>
              </div>
            </li>
          </ul>
        </section>

        <section class="prd-info-gift">
          <h3 class="hd-xs bold">사은품</h3>
          <div class="box">
            <dl class="dl-col pi-gift-due">
              <dt>기간</dt>
              <dd>2020-08-01 ~ 2020-09-30</dd>
            </dl>
            <ul class="pi-gift-list">
              <li>
                <div class="thumb-prd-gift">
                  <div class="img">
                    <img src="<%=_imgUrl %>/images/gdimg/prd-img-05.jpg" alt="${itemDetail.shortdesc}" style="height: 57px; width: 47px; !important;">
                  </div>
                  <div class="content">
                    상품 3개 이상 주문 시,
                    <span class="name">맛있게 튀긴 새우튀김(1봉) 증정</span>
                  </div>
                </div>
              </li>
              <li>
                <div class="thumb-prd-gift">
                  <div class="img">
                    <img src="<%=_imgUrl %>/images/gdimg/prd-img-05.jpg" alt="${itemDetail.shortdesc}" style="height: 57px; width: 47px; !important;">
                  </div>
                  <div class="content">
                    상품 2개 주문 시,
                    <span class="name">감자튀김(1봉) 증정</span>
                  </div>
                </div>
              </li>
            </ul>
          </div>
        <div class="guide">사은품 재고 소진 시 조기 종료될 수 있습니다.</div>
      </section>
     </c:forEach>

      <section class="section-prd-detail-tab">
        <div class="prd-detail-tab-container divider-top" id="prdDetailTabContainer">
          <nav class="prd-detail-tab" id="pdpTab">
            <a href="javascript:void(0);" class="tab-item active" onclick="pdpBodyOn(0);">상품정보</a>
            <a href="javascript:void(0);" class="tab-item" onclick="pdpBodyOn(1);">상세정보</a>
            <a href="javascript:void(0);" class="tab-item" onclick="pdpBodyOn(2);">구매후기 <small>100</small></a>
            <a href="javascript:void(0);" class="tab-item" onclick="pdpBodyOn(3);">상품문의</a>
          </nav>
        </div>
      </section>

      <div class="swiper-container swiper-prd-detail" id="prdDetailSwiper">
        <div class="swiper-wrapper">
          <c:forEach items="${itemDetail}" var="itemDetail">
            <fmt:formatNumber type="number"
                              maxFractionDigits="0"
                              var="discountRate"
                              value="${itemDetail.discountRate + ((itemDetail.discountRate%1>0.5)?(1-(itemDetail.discountRate%1))%1:-(itemDetail.discountRate%1))}"
            />
            <!-- 상품정보 컨텐츠 -->
            <article class="swiper-slide prd-detail-slide">
            <!-- 상품 기본 정보 -->
            <section class="pdp-basic-spec">
              <table class="table-basic-spec">
                <tr>
                  <th>판매단위</th>
                  <td>${itemDetail.unit}</td>
                </tr>
                <tr>
                  <th>상품유형</th>
                  <td>${itemDetail.gradedesc}</td>
                </tr>
                <tr>
                  <th>원산지</th>
                  <td>${itemDetail.origin}</td>
                </tr>
                <tr>
                  <th>도착예정</th>
                  <td>${itemDlvDeadlineMsg.supmsg}</td>
                </tr>
                <tr>
                  <th>배송유형</th>
                  <c:choose>
                    <c:when test="${itemDetail.dispatchtype eq 'O'}">
                      <c:choose>
                        <c:when test="${itemDetail.limitdelivery eq 'CA'}">
                          <td>업체 직송(수도권만)</td>
                        </c:when>
                        <c:when test="${itemDetail.limitdelivery eq 'SE'}">
                          <td>업체 직송(서울지역만)</td>
                        </c:when>
                        <c:when test="${itemDetail.limitdelivery eq 'NJ'}">
                          <td>업체 직송(제주도 제외)</td>
                        </c:when>
                        <c:otherwise>
                          <td>업체 직송</td>
                        </c:otherwise>
                      </c:choose>
                    </c:when>
                    <c:otherwise>
                      <c:choose>
                        <c:when test="${itemDetail.limitdelivery eq 'CA'}">
                          <td>자연이랑배송(수도권만)</td>
                        </c:when>
                        <c:when test="${itemDetail.limitdelivery eq 'SE'}">
                          <td>자연이랑배송(서울지역만)</td>
                        </c:when>
                        <c:when test="${itemDetail.limitdelivery eq 'NJ'}">
                          <td>자연이랑배송(제주도 제외)</td>
                        </c:when>
                        <c:otherwise>
                          <td>자연이랑배송</td>
                        </c:otherwise>
                      </c:choose>
                    </c:otherwise>
                  </c:choose>
                </tr>
                <tr>
                  <th>배송정보</th>
                  <td>
                    <c:choose>
                      <c:when test="${paramMap.strOdtype eq '15'}">
                        <c:choose>
                          <c:when test="${itemDetail.delpol ne null or itemDetail.delpol ne '' and itemDetail.delpol eq '02'}">
                            <c:choose>
                              <c:when test="${itemDetail.saleprice lt itemDetail.limamt}">
                                <fmt:formatNumber value="${itemDetail.delcharge}" pattern="#,###" />원 ( <fmt:formatNumber value="${itemDetail.limamt}" pattern="#,###" />이상 무료배송)
                              </c:when>
                              <c:otherwise>
                                무료배송
                              </c:otherwise>
                            </c:choose>
                          </c:when>
                          <c:when test="${itemDetail.delpol ne null or itemDetail.delpol ne '' and itemDetail.delpol eq '03'}">
                            <fmt:formatNumber value="${itemDetail.delcharge}" pattern="#,###" />원
                          </c:when>
                          <c:otherwise>
                            무료배송
                          </c:otherwise>
                        </c:choose>
                      </c:when>
                      <c:otherwise>
                        <c:choose>
                          <c:when test="${paramMap.strGDCD ne 'A3' and paramMap.strGDCD ne 'B2' and itemDetail.saleprice lt paramMap.minimumOrderPrice}">
                            <fmt:formatNumber value="${paramMap.deliveryCharge}" pattern="#,###" />원 ( <fmt:formatNumber value="${paramMap.minimumOrderPrice}" pattern="#,###"/> 원 이상 무료 )
                          </c:when>
                          <c:otherwise>
                            무료
                          </c:otherwise>
                        </c:choose>
                      </c:otherwise>
                    </c:choose>
                    <br>
                    <a href="#" class="button bt-xs bt-outline bt-brown btn-spec"><span>배송비 절약상품 담기</span> <i class="wn-icon chevron-h-16 brown"></i></a>
                  </td>
                </tr>
              </table>
            </section>
            <!-- 예약상품 정보 -->
            <section class="pdp-pre-order">
              <c:choose>
                <c:when test="${itemDetail.reserveyn eq 'Y'}">
                  <div class="t-15 lh-22">
                    본 상품은 사전 예약주문 상품입니다.
                    <br>
                    미리 주문하시면 발송일에 맞춰 배송됩니다.
                  </div>
                  <div class="bg-gray pa-m mt-10">
                    <table class="table-basic-spec">
                      <tr>
                        <th>사전주문기간</th>
                        <td>${itemDetail.odFrom} ~ ${itemDetail.odTo}</td>
                      </tr>
                      <tr>
                        <th>배송기간</th>
                        <td>${itemDetail.dlvFrom} ~ ${itemDetail.dlvTo}</td>
                      </tr>
                    </table>
                  </div>
                </c:when>
                <c:when test="${itemDetail.deliverydtyn eq 'Y'}">
                  <div class="bg-gray pa-m mt-10">
                    <table class="table-basic-spec">
                      <tr>
                        <th>배송기간</th>
                        <td>${itemDetail.odFrom} ~ ${itemDetail.odTo}</td>
                      </tr>
                    </table>
                  </div>
                </c:when>
              </c:choose>
            </section>
            <!-- 상품 프로모션 배너 -->
            <section class="prd-promo-banner">
              <img src="<%=_imgUrl%>images/banner/prdDetailNoticeBanner.png" alt="싱싱하지 않으면 환불, 신선보장">
            </section>
            <!-- 인증마크 -->
            <section class="pdp-add-info">
              <div class="pdp-add-info-mu">
                <div class="img-container">
                  <img src="<%=_imgUrl%>images/banner/pdpBannerEl01.png" alt="" style="width: 104px; height: 104px; !important;">
                </div>
                <div class="detail">
                  <div class="tit">무농약 농산물 인증</div>
                  <div class="content">
                    유기합성 농약을 전혀 사용하지 않고 화학비료는 권장 시비량의 1/3 이내 사용
                  </div>
                </div>
              </div>
            </section>
            <!-- 안정성 검사 결과 -->
          <c:if test="${itemDetail.testidx ne '0' or itemDetail.testidx ne ''}">
            <section class="pdp-add-info">
              <div class="pdp-add-info-safe">
                <div class="img-container">
                  <img src="<%=_imgUrl%>images/banner/pdpBannerEl02.png" alt="방사능 측정 결과">
                </div>
                <div class="detail">
                  <div class="tit">자연이랑에서<br>안심하고 구매하세요! ${itemDetail.testidx} </div>
                  <div class="content">이 상품은 (방사능 또는 잔류농약) 검사 결과 안정성이 검증 된 상품입니다.</div>
                  <a href="javascript:void(0);" onclick="radiationTestInfo('11');" class="btn-go">방사능 측정 결과 보기</a>
                </div>
              </div>
            </section>
          </c:if>
            <!-- 최근측정당도 -->
          <c:if test="${paramMap.strGdtype eq '01'}">
            <c:forEach items="${fruitsSugarInfo}" var="sugarInfo">
              <c:if test="${sugarInfo.gasuga ne null and sugarInfo.gasuga ne ''}">
                <section class="pdp-add-info">
                  <div class="hr"></div>
                  <div class="pdp-add-info-brix">
                    <div class="img-container">
                      <img src="<%=_imgUrl%>images/banner/pdpBannerEl03.png" alt="11.4brix">
                    </div>

                    <div class="detail">
                      <div class="tit">최근측정당도</div>
                      <div class="content">
                        고객님의 구매에 도움을 드리기 위해 판매되는 동일한 상품을 샘플링하여
                        측정했으며, 농산물의 특성상 받으신 상품 당도와는 차이날 수 있습니다.
                        <div class="text">
                          <c:choose>
                            <c:when test="${sugarInfo.fruitsSugar gt '1.1'}">
                              <p><em> <fmt:formatNumber value="${sugarInfo.fruitsSugar}" pattern="#.##"/> brix (표준1) * 표준당도보다 더 달아요.</em></p>
                            </c:when>
                            <c:when test="${sugarInfo.fruitsSugar gt '1.05'}">
                              <p><em> <fmt:formatNumber value="${sugarInfo.fruitsSugar}" pattern="#.##"/> brix (표준1) * 표준당도보다 약간 달아요.</em></p>
                            </c:when>
                            <c:when test="${sugarInfo.fruitsSugar gt '0.95'}">
                              <p><em> <fmt:formatNumber value="${sugarInfo.fruitsSugar}" pattern="#.##"/> brix (표준1) * 표준당도와 비슷해요.</em></p>
                            </c:when>
                            <c:when test="${sugarInfo.fruitsSugar gt '0.90'}">
                              <p><em> <fmt:formatNumber value="${sugarInfo.fruitsSugar}" pattern="#.##"/>brix (표준1) * 표준당도보다 약간 낮아요.</em></p>
                            </c:when>
                            <c:otherwise>
                              <p><em> <fmt:formatNumber value="${sugarInfo.fruitsSugar}" pattern="#.##"/> brix (표준1) * 표준당도보다 더 낮아요.</em></p>
                            </c:otherwise>
                          </c:choose>
                        </div>
                      </div>
                    </div>
                  </div>
                </section>
              </c:if>
            </c:forEach>
          </c:if>

            <!-- 상품 상품정보 페이지 -->
            <section class="pdp-detail-content">
              <div class="pdp-detail-view" id="pdpDetailView">
                <!-- 상품 동영상 -->
                <section class="pdp-vod">
                  <div class="pdp-video-container">
                    <video id="prd-vod" class="video-js vjs-wn-skin vjs-fluid" controls playsinline
                           preload="auto" width="100%" height="100%" poster=""
                           data-setup='{"aspectRatio": "1:1"}'>
                      <source src="<%=_imgUrl%>images/uploads/prd-vod.mp4#t=0.1" type="video/mp4" />
                    </video>
                  </div>
                </section>

                ${itemDetail.explain}
              </div>
              <div class="pdp-detail-more">
                <button class="btn-view-down" onclick="clickPrdViewMore();">
                  <span class="label">상세정보 펼쳐보기</span>
                  <i class="wn-icon chevron-v-16 green"></i>
                </button>
              </div>
            </section>
            <!-- 상품내 공지안내 -->
<%--            <section class="prd-detail-notice">
              <h3 class="hd hd-s"><i class="wn-icon alert-24-brown"></i><span>상품내 공지안내</span></h3>
              <div class="content">
                <ul class="list-dot">
                  <li>본상품은 신선식품으로 판매되고 있습니다.</li>
                  <li>상품 수취 후 4~5일 후 교환/반품 요청을 불가능합니다.</li>
                  <li>이점 유년하여 주문 부탁드립니다.</li>
                </ul>
              </div>
            </section>--%>
            <hr class="spacer">

            <!-- 꿀팁! 레시피 -->
            <section class="com-container">
              <header class="main-sec-header">
                <h3 class="tit">자연이랑 레시피</h3>
              </header>
              <div class="swiper-container swiper-pdp-recipe swiper-no-swiping">
                <div class="swiper-wrapper">
                  <div class="swiper-slide">
                    <a href="#" class="pdp-recipe-banner">
                      <div class="img-container">
                        <img src="./images/uploads/recipeBanner.jpg" alt="지금 만들어 두새우! 제철 새우장">
                      </div>
                      <div class="detail">
                        <div class="content">
                          <div class="tit" data-swiper-parallax="-200">지금 만들어 두새우! 제철 새우장</div>
                          <div class="desc" data-swiper-parallax="-200">
                            입안 가득 꽉 차게 살이 오른 새우의 달달함과 싱싱함을 오래도록 즐기는 방법으로 새우장만한게 없죠.
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide">
                    <a href="#" class="pdp-recipe-banner">
                      <div class="img-container">
                        <img src="./images/uploads/recipeBanner.jpg" alt="지금 만들어 두새우! 제철 새우장">
                      </div>
                      <div class="detail">
                        <div class="content">
                          <div class="tit" data-swiper-parallax="-200">지금 만들어 두새우! 제철 새우장</div>
                          <div class="desc" data-swiper-parallax="-200">
                            입안 가득 꽉 차게 살이 오른 새우의 달달함과 싱싱함을 오래도록 즐기는 방법으로 새우장만한게 없죠.
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide">
                    <a href="#" class="pdp-recipe-banner">
                      <div class="img-container">
                        <img src="./images/uploads/recipeBanner.jpg" alt="지금 만들어 두새우! 제철 새우장">
                      </div>
                      <div class="detail">
                        <div class="content">
                          <div class="tit" data-swiper-parallax="-200">지금 만들어 두새우! 제철 새우장</div>
                          <div class="desc" data-swiper-parallax="-200">
                            입안 가득 꽉 차게 살이 오른 새우의 달달함과 싱싱함을 오래도록 즐기는 방법으로 새우장만한게 없죠.
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                </div>
                <div class="swiper-pgn-dots-sub"></div>
              </div>
            </section>

            <!-- 배송비 절약상품 모음 -->
            <section class="com-container">
              <header class="main-sec-header">
                <h3 class="tit">배송비 절약상품</h3>
              </header>
              <div class="swiper-container swiper-prd-2n swiper-no-swiping">
                <div class="swiper-wrapper">
                  <div class="swiper-slide">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="#" class="prd-item-img">
                          <img src="./images/uploads/prd-img-03.jpg" alt="무항생제 황토 유정란 10입">
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">오불+오낙+쭈삼+만두증정</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <div class="swiper-slide">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="#" class="prd-item-img">
                          <img src="./images/uploads/prd-img-05.jpg" alt="무항생제 황토 유정란 10입">
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">오불+오낙+쭈삼+만두증정</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <div class="swiper-slide">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="#" class="prd-item-img">
                          <img src="./images/uploads/prd-img-03.jpg" alt="무항생제 황토 유정란 10입">
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">오불+오낙+쭈삼+만두증정</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <div class="swiper-slide">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="#" class="prd-item-img">
                          <img src="./images/uploads/prd-img-05.jpg" alt="무항생제 황토 유정란 10입">
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">오불+오낙+쭈삼+만두증정</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                </div>
                <div class="swiper-pgn-dots-sub"></div>
              </div>
            </section>
          </article>
          </c:forEach>

          <c:if test="${basicDetailInfo ne null and basicDetailInfo ne ''}">
            <c:choose>
              <c:when test="${basicDetailInfo eq null and basicDetailInfo eq ''}">
                <c:choose>
                  <c:when test="${itemDetail.vat eq '2' and itemDetail.div1 ne '70'}"> <%--농축산물--%>
                    <!-- 상세정보 -->
                    <article class="swiper-slide prd-detail-slide">
                      <section class="el-container">
                        <h3 class="hd-m px-m">상품 정보 고시</h3>
                        <div class="content-center">
                          <table class="table-pdp">
                            <tbody>
                              <tr>
                                <th>상품명칭</th>
                                <td>${itemDetail.gdname}</td>
                              </tr>
                              <tr>
                                <th>상품유형</th>
                                <td>${itemDetail.typename}</td>
                              </tr>
                              <tr>
                                <th>생산자/수입자</th>
                                <td>${itemDetail.producer}</td>
                              </tr>
                              <c:if test="${itemDetail.origin ne null and itemDetail.origin ne ''}">
                                <tr>
                                  <th>농수산물의 원산지 표시에 관한 법률에 따른 원산지</th>
                                  <td>${itemDetail.origin}</td>
                                </tr>
                              </c:if>
                              <tr>
                                <th><span class="keep-all">품질유지기한/유통기한</span></th>
                                <c:choose>
                                  <c:when test="${itemDetail.bestbeforedate ne null and itemDetail.bestbeforedate ne ''}">
                                    <td>${itemDetail.bestbeforedate}</td>
                                  </c:when>
                                  <c:otherwise>
                                    <td>농축수산물은 기본적으로 유통기한을 별도로 정하고 있지 않거나 상세상품 정보란에 표기합니다.</td>
                                  </c:otherwise>
                                </c:choose>
                              </tr>
                              <c:if test="${itemDetail.dispatchtype eq 'I'}">
                                <tr>
                                  <th>취급유형</th>
                                  <c:choose>
                                    <c:when test="${itemDetail.putclass_cd eq '08'}">
                                      <td>냉장상품</td>
                                    </c:when>
                                    <c:otherwise>
                                      <td>${itemDetail.putclass}</td>
                                    </c:otherwise>
                                  </c:choose>
                                </tr>
                              </c:if>
                              <c:if test="${itemDetail.packaging ne null and itemDetail.packaging ne ''}">
                                <tr>
                                  <th>상품 구성 및 포장</th>
                                  <td>
                                      ${fn:replace(itemDetail.packaging, newLineChar, "<br/>")}
                                  </td>
                                </tr>
                              </c:if>
                              <c:if test="${itemDetail.handling ne null and itemDetail.handling ne ''}">
                                <tr>
                                  <th>보관/취급방법</th>
                                  <td>
                                      ${fn:replace(itemDetail.handling, newLineChar, "<br/>")}
                                  </td>
                                </tr>
                              </c:if>
                              <c:if test="${itemDetail.precaution1 ne null and itemDetail.precaution1 ne ''}">
                                <th>주의사항(1)</th>
                                <td>${fn:replace(itemDetail.precaution1, newLineChar, "<br/>")}</td>
                              </c:if>
                              <c:if test="${itemDetail.precaution2 ne null and itemDetail.precaution2 ne ''}">
                                <th>주의사항(2)</th>
                                <td>${fn:replace(itemDetail.precaution2, newLineChar, "<br/>")}</td>
                              </c:if>
                              <c:if test="${itemDetail.addinformation ne null and itemDetail.addinformation ne ''}">
                                <th>상품관련정보</th>
                                <td>${fn:replace(itemDetail.addinformation, newLineChar, "<br/>")}</td>
                              </c:if>
                            </tbody>
                          </table>
                        </div>
                      </section>
                    </article>
                  </c:when>
                  <c:when test="${itemDetail.div1 eq '95' and itemDetail.div2 eq '10'}"> <%--화장품--%>
                    <article class="swiper-slide prd-detail-slide">
                      <section class="el-container">
                        <h3 class="hd-m px-m">상품 정보 고시</h3>
                        <div class="content-center">
                          <table class="table-pdp">
                            <tbody>
                            <tr>
                              <th>상품명칭</th>
                              <td>${itemDetail.gdname}</td>
                            </tr>
                            <tr>
                              <th>용량/중량</th>
                              <td>${itemDetail.unit}</td>
                            </tr>
                            <tr>
                              <th>제품 주요사양</th>
                              <td>${fn:replace(itemDetail.specifications, newLineChar, "<br/>")}</td>
                            </tr>
                            <tr>
                              <th>사용기간(개봉후 사용기간)</th>
                              <td>${fn:replace(itemDetail.periodofuse, newLineChar, "<br/>")}</td>
                            </tr>
                            <tr>
                              <th>사용방법</th>
                              <td>${fn:replace(itemDetail.howtouse, newLineChar, "<br/>")}</td>
                            </tr>
                            <tr>
                              <th>제조업자 및 책임판매업자</th>
                              <td>${itemDetail.producer} / 재단법인행복에프앤씨(자연이랑분사무소)</td>
                            </tr>
                            <tr>
                              <th>제조국가</th>
                              <td>${itemDetail.origin}</td>
                            </tr>
                            <tr>
                              <th>화장품법에 따라 기재해야하는 모든성분</th>
                              <td>${fn:replace(itemDetail.precaution1, newLineChar, "<br/>")}</td>
                            </tr>
                            <tr>
                              <th>기능성 화장품 식품의약품안전처 심사필 여부</th>
                              <td>해당없음</td>
                            </tr>
                            <tr>
                              <th>사용시 주의사항</th>
                              <td>${fn:replace(itemDetail.precaution1, newLineChar, "<br/>")}</td>
                            </tr>
                            <tr>
                              <th>품질보증기준</th>
                              <td>본 제품에 이상이 있을 경우 공정거래위원회 고시에 의거 보상 해 드립니다.</td>
                            </tr>
                            </tbody>
                          </table>
                        </div>
                      </section>
                    </article>
                  </c:when>
                  <c:otherwise> <%--그외공산품--%>
                    <tr>
                      <th>상품명칭</th>
                      <td>${itemDetail.gdname}</td>
                    </tr>
                    <tr>
                      <th>상품유형</th>
                      <td>${itemDetail.typename}</td>
                    </tr>
                    <tr>
                      <th>생산자/수입자 소재지</th>
                      <td>${itemDetail.producer}</td>
                    </tr>
                    <tr>
                      <th>제조연월일/유통기한 또는 품질유지기한</th>
                      <c:choose>
                        <c:when test="${itemDetail.expdt ne null and itemDetail.expdt ne ''}">
                          <td>제조일(또는 포장일)로부터 ${itemDetail.expdt}일</td>
                        </c:when>
                        <c:otherwise>
                          <td>별도표기.</td>
                        </c:otherwise>
                      </c:choose>
                    </tr>
                    <c:if test="${itemDetail.packaging ne null and itemDetail.packaging ne ''}">
                      <tr>
                        <th>포장단위별 용량(중량),수량</th>
                        <td>${fn:replace(itemDetail.packaging, newLineChar, "<br/>")}</td>
                      </tr>
                    </c:if>
                    <c:if test="${itemDetail.precaution1 ne null and itemDetail.precaution1 ne ''}">
                      <th>원재료명 및 함량</th>
                      <td>${fn:replace(itemDetail.precaution1, newLineChar, "<br/>")}</td>
                    </c:if>
                    <c:if test="${itemDetail.precaution2 ne null and itemDetail.precaution2 ne ''}">
                      <th>영양성분</th>
                      <td>${fn:replace(itemDetail.precaution2, newLineChar, "<br/>")}</td>
                    </c:if>
                    <tr>
                      <th>유전자재조합식품유무</th>
                      <td>해당없음</td>
                    </tr>
                    <tr>
                      <th>영유아식 또는 체중조절식품의 경우 표시광고 사전심의필 여부</th>
                      <td>해당없음</td>
                    </tr>
                    <c:if test="${itemDetail.handling ne null and itemDetail.handling ne ''}">
                      <tr>
                        <th>보관 또는 취급방법</th>
                        <td>${fn:replace(itemDetail.handling, newLineChar, "<br/>")}</td>
                      </tr>
                    </c:if>
                    <c:if test="${itemDetail.addinformation ne null and itemDetail.addinformation ne ''}">
                      <tr>
                        <th>상품관련정보/주의사항</th>
                        <td>${fn:replace(itemDetail.addinformation, newLineChar, "<br/>")}</td>
                      </tr>
                    </c:if>
                  </c:otherwise>
                </c:choose>
                <!-- 상세정보 -->
              </c:when>
              <c:otherwise>
                <article class="swiper-slide prd-detail-slide">
                  <section class="el-container">
                    <h3 class="hd-m px-m">상품 정보 고시</h3>
                    <div class="content-center">
                      <table class="table-pdp">
                        <tbody>
                        <c:forEach items="${usePpCode}" var="ppcode">
                          <tr>
                            <th>${ppcode.pnitem01}</th>
                            <td>
                              <c:choose>
                                <c:when test="${ppcode.pp01 eq ''}">
                                  상품정보 참조
                                </c:when>
                                <c:otherwise>
                                  ${fn:replace(ppcode.pp01, newLineChar, "<br/>")}
                                </c:otherwise>
                              </c:choose>
                            </td>
                          </tr>
                          <tr>
                            <th>${ppcode.pnitem02}</th>
                            <td>
                              <c:choose>
                                <c:when test="${ppcode.pp02 eq ''}">
                                  상품정보 참조
                                </c:when>
                                <c:otherwise>
                                  ${fn:replace(ppcode.pp02, newLineChar, "<br/>")}
                                </c:otherwise>
                              </c:choose>
                            </td>
                          </tr>
                          <tr>
                            <th>${ppcode.pnitem03}</th>
                            <td>
                              <c:choose>
                                <c:when test="${ppcode.pp03 eq ''}">
                                  상품정보 참조
                                </c:when>
                                <c:otherwise>
                                  ${fn:replace(ppcode.pp03, newLineChar, "<br/>")}
                                </c:otherwise>
                              </c:choose>
                            </td>
                          </tr>
                          <tr>
                            <th>${ppcode.pnitem04}</th>
                            <td>
                              <c:choose>
                                <c:when test="${ppcode.pp04 eq ''}">
                                  상품정보 참조
                                </c:when>
                                <c:otherwise>
                                  ${fn:replace(ppcode.pp04, newLineChar, "<br/>")}
                                </c:otherwise>
                              </c:choose>
                            </td>
                          </tr>
                          <tr>
                            <th>${ppcode.pnitem05}</th>
                            <td>
                              <c:choose>
                                <c:when test="${ppcode.pp05 eq ''}">
                                  상품정보 참조
                                </c:when>
                                <c:otherwise>
                                  ${fn:replace(ppcode.pp05, newLineChar, "<br/>")}
                                </c:otherwise>
                              </c:choose>
                            </td>
                          </tr>
                          <c:if test="${ppcode.pnitem06 ne null and ppcode.pnitem06 ne ''}">
                            <tr>
                              <th>${ppcode.pnitem06}</th>
                              <td>
                                <c:choose>
                                  <c:when test="${ppcode.pp06 eq ''}">
                                    상품정보 참조
                                  </c:when>
                                  <c:otherwise>
                                    ${fn:replace(ppcode.pp06, newLineChar, "<br/>")}
                                  </c:otherwise>
                                </c:choose>
                              </td>
                            </tr>
                          </c:if>
                          <c:if test="${ppcode.pnitem07 ne null and ppcode.pnitem07 ne ''}">
                            <tr>
                              <th>${ppcode.pnitem07}</th>
                              <td>
                                <c:choose>
                                  <c:when test="${ppcode.pp07 eq ''}">
                                    상품정보 참조
                                  </c:when>
                                  <c:otherwise>
                                    ${fn:replace(ppcode.pp07, newLineChar, "<br/>")}
                                  </c:otherwise>
                                </c:choose>
                              </td>
                            </tr>
                          </c:if>
                          <c:if test="${ppcode.pnitem08 ne null and ppcode.pnitem08 ne ''}">
                            <tr>
                              <th>${ppcode.pnitem08}</th>
                              <td>
                                <c:choose>
                                  <c:when test="${ppcode.pp08 eq ''}">
                                    상품정보 참조
                                  </c:when>
                                  <c:otherwise>
                                    ${fn:replace(ppcode.pp08, newLineChar, "<br/>")}
                                  </c:otherwise>
                                </c:choose>
                              </td>
                            </tr>
                          </c:if>
                          <c:if test="${ppcode.pnitem09 ne null and ppcode.pnitem09 ne ''}">
                            <tr>
                              <th>${ppcode.pnitem09}</th>
                              <td>
                                <c:choose>
                                  <c:when test="${ppcode.pp09 eq ''}">
                                    상품정보 참조
                                  </c:when>
                                  <c:otherwise>
                                    ${fn:replace(ppcode.pp09, newLineChar, "<br/>")}
                                  </c:otherwise>
                                </c:choose>
                              </td>
                            </tr>
                          </c:if>
                          <c:if test="${ppcode.pnitem10 ne null and ppcode.pnitem10 ne ''}">
                            <tr>
                              <th>${ppcode.pnitem10}</th>
                              <td>
                                <c:choose>
                                  <c:when test="${ppcode.pp10 eq ''}">
                                    상품정보 참조
                                  </c:when>
                                  <c:otherwise>
                                    ${fn:replace(ppcode.pp10, newLineChar, "<br/>")}
                                  </c:otherwise>
                                </c:choose>
                              </td>
                            </tr>
                          </c:if>
                          <c:if test="${ppcode.pnitem11 ne null and ppcode.pnitem11 ne ''}">
                            <tr>
                              <th>${ppcode.pnitem11}</th>
                              <td>
                                <c:choose>
                                  <c:when test="${ppcode.pp11 eq ''}">
                                    상품정보 참조
                                  </c:when>
                                  <c:otherwise>
                                    ${fn:replace(ppcode.pp11, newLineChar, "<br/>")}
                                  </c:otherwise>
                                </c:choose>
                              </td>
                            </tr>
                          </c:if>
                          <c:if test="${ppcode.pnitem12 ne null and ppcode.pnitem12 ne ''}">
                            <tr>
                              <th>${ppcode.pnitem12}</th>
                              <td>
                                <c:choose>
                                  <c:when test="${ppcode.pp12 eq ''}">
                                    상품정보 참조
                                  </c:when>
                                  <c:otherwise>
                                    ${fn:replace(ppcode.pp12, newLineChar, "<br/>")}
                                  </c:otherwise>
                                </c:choose>
                              </td>
                            </tr>
                          </c:if>
                          <c:if test="${ppcode.pnitem13 ne null and ppcode.pnitem13 ne ''}">
                            <tr>
                              <th>${ppcode.pnitem13}</th>
                              <td>
                                <c:choose>
                                  <c:when test="${ppcode.pp13 eq ''}">
                                    상품정보 참조
                                  </c:when>
                                  <c:otherwise>
                                    ${fn:replace(ppcode.pp13, newLineChar, "<br/>")}
                                  </c:otherwise>
                                </c:choose>
                              </td>
                            </tr>
                          </c:if>
                          <c:if test="${ppcode.pnitem14 ne null and ppcode.pnitem14 ne ''}">
                            <tr>
                              <th>${ppcode.pnitem14}</th>
                              <td>
                                <c:choose>
                                  <c:when test="${ppcode.pp14 eq ''}">
                                    상품정보 참조
                                  </c:when>
                                  <c:otherwise>
                                    ${fn:replace(ppcode.pp14, newLineChar, "<br/>")}
                                  </c:otherwise>
                                </c:choose>
                              </td>
                            </tr>
                          </c:if>
                          <c:if test="${ppcode.pnitem15 ne null and ppcode.pnitem15 ne ''}">
                            <tr>
                              <th>${ppcode.pnitem15}</th>
                              <td>
                                <c:choose>
                                  <c:when test="${ppcode.pp15 eq ''}">
                                    상품정보 참조
                                  </c:when>
                                  <c:otherwise>
                                    ${fn:replace(ppcode.pp15, newLineChar, "<br/>")}
                                  </c:otherwise>
                                </c:choose>
                              </td>
                            </tr>
                          </c:if>
                        </c:forEach>
                        </tbody>
                      </table>
                    </div>
                  </section>
                  <section class="el-container">
                    <h3 class="hd-m px-m">배송 정보</h3>
                    <div class="content-center">
                      <ul class="wn-accordion">
                        <li class="wn-accordion-item active">
                          <h4 class="wn-accordion-tit">상품 발송 안내</h4>
                          <div class="wn-accordion-content">
                            <div class="pdp-delivery-sche pt-2">
                              <div class="delivery-sche-wn">
                                <h5 class="hd-xs">자연이랑 배송</h5>
                                <div class="delivery-sche-container">
                                  <dl class="delivery-sche weekday">
                                    <dt>
                                      <span>일</span>
                                      <span>월</span>
                                      <span>화</span>
                                      <span>수</span>
                                      <span>목</span>
                                      <span>금</span>
                                    </dt>
                                    <dd>오후 1시 이전 주문 시 <em>당일 발송</em></dd>
                                  </dl>
                                  <dl class="delivery-sche weekend">
                                    <dt>
                                      <span>토</span>
                                    </dt>
                                    <dd><em>일요일</em> 발송</dd>
                                  </dl>
                                </div>
                              </div>
                              <div class="delivery-sche-shop mt-4">
                                <h5 class="hd-xs">외부업체 배송</h5>
                                <div class="t-gray t-13">
                                  각 외부업체의 출고일정에 따라 배송됩니다.
                                </div>
                              </div>
                            </div>
                          </div>
                        </li>
                        <li class="wn-accordion-item">
                          <h4 class="wn-accordion-tit">배송 주의사항</h4>
                          <div class="wn-accordion-content">
                            <ul class="list-dot t-12 lh-15">
                              <li>일요일, 법정공휴일은 배송(도착)하지 않습니다.(명절 및 특수시즌 제외)</li>
                              <li>배송지 정보와 받으시는 분의 장소 및 연락처가 불분명할 경우에는 배송이 지연될 수 있으며, 그로 인한 상품변질에 대해서는 자연이랑이 책임지지 않습니다.</li>
                            </ul>
                          </div>
                        </li>
                        <li class="wn-accordion-item">
                          <h4 class="wn-accordion-tit">배송료 안내</h4>
                          <div class="wn-accordion-content">
                            <ul class="list-dot t-12 lh-15">
                              <li>주문금액이 <fmt:formatNumber value="${paramMap.minimumOrderPrice}" pattern="#,###" />원 미만인 경우에는 주문유형에 따라 배송비가 부과될 수 있습니다.</li>
                              <li>일부 산간벽지 및 도서지역의 경우 배송이 불가할 수 있습니다.</li>
                              <li>주문 및 배송에 관한 자세한 상담이나 궁금하신 점이 있을 경우 고객센터의 FAQ나 1:1상담 게시판,
                                또는 고객센터 080-303-6262를 통해서 안내 받으실 수 있습니다.</li>
                            </ul>
                          </div>
                        </li>
                        <li class="wn-accordion-item">
                          <h4 class="wn-accordion-tit">배송 기간 안내</h4>
                          <div class="wn-accordion-content">
                            <ul class="list-dot t-12 lh-15">
                              <li>배송(도착) 기간은 통상 입금 확인일 기준으로 2~3일 소요됩니다.(일요일,토요일 제외)</li>
                              <li>일요일 및 공휴일이 겹치는 경우에는 배송이 지연될 수 있습니다.</li>
                              <li>주말 주문량이 많을 경우 월요일 주문이 하루 지연 발송 될 수 있습니다.</li>
                              <li>재고의 결품, 배송 지역, 택배사 사정에 따라 배송이 지연될 수 있습니다.</li>
                              <li>택배사 업무특성상 배송 시간을 지정하기 어렵습니다.</li>
                              <li>물류센터 출고 시, 수취인에게 문자로 안내 드리며, 통신사 상황에 따라 지연, 누락 발송 될 수 있습니다.</li>
                              <li>예약주문 상품은 안내한 배송기간에 배송됩니다.</li>
                            </ul>
                          </div>
                        </li>
                      </ul>
                    </div>
                  </section>
                  <section class="el-container">
                    <h3 class="hd-m px-m">교환/반품/환불 안내</h3>
                    <div class="content-center">
                      <ul class="wn-accordion">
                        <li class="wn-accordion-item active">
                          <h4 class="wn-accordion-tit">교환/반품/환불이 가능한 경우</h4>
                          <div class="wn-accordion-content">
                            <ul class="list-dot t-12 lh-15">
                              <li>제품 수령일 기준 1일 이내 반품이 가능합니다.
                                (단, 구매자 단순변심 반품불가)</li>
                              <li>제품 수령 후 제품이 주문 내용과 다른 경우, 제품이 고객님께 인도될 당시 상품이 멸실 또는 훼손된
                                경우, 구매자 단순 변심의 경우 교환/반품이 불가능합니다.</li>
                              <li>전자상거래 등에서의 소비자보호에 관한 법률에 규정되어 있는 소비자 청약철회 가능범위에 해당되
                                는 경우 교환/반품이 가능합니다.</li>
                              <li>통신판매업자 방문 판매 등에 관한 법률에서 규정하고 있는 광고에 표시하여야 할 사항을 표시하지
                                아니한 경우 교환/반품이 가능합니다.</li>
                            </ul>
                          </div>
                        </li>
                        <li class="wn-accordion-item">
                          <h4 class="wn-accordion-tit">교환/반품/환불이 불가능한 경우</h4>
                          <div class="wn-accordion-content">
                            <ul class="list-dot t-12 lh-15">
                              <li>고객님의 책임 있는 사유로 상품 등이 멸실 또는 훼손된 경우</li>
                              <li>고객님의 사용 또는 일부 소비에 의하여 상품의 가치가 감소한 경우</li>
                              <li>기타 전자상거래 등에서의 소비자 보호에 관한 법률이 정하는 소비자 청약철회 제한에 해당되는 경우</li>
                            </ul>
                          </div>
                        </li>
                        <li class="wn-accordion-item">
                          <h4 class="wn-accordion-tit">환불 및 주문취소에 대한 일반 안내</h4>
                          <div class="wn-accordion-content">
                            <ul class="list-dot t-12 lh-15">
                              <li>제품을 먼저 발송해 주셔야 하며, 제품이 도착한 후 환불 및 주문취소가 가능합니다.</li>
                              <li>주문취소는 결제완료 상태에서 가능하며, 상품이 준비된 이후에는 취소하실 수 없습니다.</li>
                            </ul>
                          </div>
                        </li>
                        <li class="wn-accordion-item">
                          <h4 class="wn-accordion-tit">제품을 교환/반품 하실 때의 배송비 비용에 대한 안내</h4>
                          <div class="wn-accordion-content">
                            <ul class="list-dot t-12 lh-15">
                              <li>당사 부담 상품하자 등의 문제로 교환/반품을 하실 경우 고객상담실로 직접 교환/반품 접수합니다.</li>
                              <li>교환/반품 접수 후 도착한 택배사를 통해 상품을 인도하여 주시면 해당 상품을 재발송 속은 주문취소 처리해 드리겠습니다.</li>
                              <li>단순 고객 변심에 의한 교환/반품인 경우 고객님께 반품비용 왕복 배송료가 발생할 수 있습니다.</li>
                            </ul>
                          </div>
                        </li>
                        <li class="wn-accordion-item">
                          <h4 class="wn-accordion-tit">재화 등의 교환/반품/보증과 그 대금 환불 및 환불의 지연에 따른 배상금 지급의 조건/절차</h4>
                          <div class="wn-accordion-content">
                            <ul class="list-dot t-12 lh-15">
                              <li>재화 등의 교환/반품/보증 조건 및 품질보증기준은 본 제품의 공정위고시인 '소비자피해보상규정'에서 상세히 정한 기준과 절차를 따릅니다.</li>
                              <li>재화 등의 A/S 관련 전화번호 : 080-303-6262</li>
                              <li>
                                본 제품이 적법하게 철회된 경우 이미 지급받은 재화 등의 대금을 고객에게 환급합니다.
                                <br>
                                만일 고객에게 재화 등의 대금 환급을 지연한 때에는 그 지연기간에 대하여 지연배상금을 지급할 것이며, 구체적인 조건(이율, 기간 등)은 '전자상거래 등에서의 소비자보호에 관한 법률'에서 정한 바를 따릅니다.
                              </li>
                            </ul>
                          </div>
                        </li>
                        <li class="wn-accordion-item">
                          <h4 class="wn-accordion-tit">소비자피해보상의 처리, 재화 등에 대한 불만 처리 및 소비자와 사업자 사이의 분쟁처리에 관한 사항</h4>
                          <div class="wn-accordion-content">
                            <ul class="list-dot t-12 lh-15">
                              <li>'전자상거래 등에서의 소비자보호에 관한 법률'에서 정한 바를 준수하여 처리할 예정입니다.</li>
                            </ul>
                          </div>
                        </li>
                        <li class="wn-accordion-item">
                          <h4 class="wn-accordion-tit">반품 시 유의사항</h4>
                          <div class="wn-accordion-content">
                            <ul class="list-dot t-12 lh-15">
                              <li>반품 접수 절차 없이 임의로 반송할 경우, 반품 내용을 확인할 수 없으므로 환불이 지연되거나 환불이 되지 않을 수 있습니다.</li>
                              <li>그러므로 반드시 절차에 따라 교환 및 반품하여 주시기 바랍니다</li>
                            </ul>
                          </div>
                        </li>
                      </ul>
                    </div>
                  </section>
                </article>
              </c:otherwise>
            </c:choose>
          </c:if>
          <!-- 구매후기 -->
          <article class="swiper-slide prd-detail-slide">
            <section class="section-pdp-write-enter">
              <div class="content-center">
                <a href="javascript:void(0);" onclick="$('#normalReview').modal('show');" class="button bt-outline bt-steel w-100">구매후기 작성하기</a>
                <div class="se-review-notice">
                  <ul class="list-circle t-13 mt-sp-4">
                    <li>구매후기는 배송완료 후 주문내역에서도 작성하실 수 있습니다. (최근 6개월 안에 작성된 글만 표시합니다)</li>
                    <li>다른 구매고객에게 도움이 될 만한 구매후기를 남겨주세요. 구매후기를 남기시는 고객님께는 즉시 사용할 수 있는 포인트를 적립해 드립니다.</li>
                  </ul>
                  <div class="footer">
                    <span class="item">포토후기 <em>100P</em></span>
                    <span class="item">일반후기 <em>50P</em></span>
                  </div>
                </div>
              </div>
            </section>

            <hr class="spacer">
<%--            <c:choose>
              <c:when test="${prodReviewDetail.size() > 0}">--%>
                  <section class="el-container">
                    <h3 class="hd-m px-m">포토구매후기</h3>
                    <div class="content-center">
                      <div class="pdp-photo-reviews">
                        <a href="#" class="btn-more-num">+14</a>
                        <ul class="pdp-preview-list">
                          <li>
                            <a href="javascript:void(0)" onclick="showPhotoReviewDetail(0)">
                              <div class="img-square">
                                <div class="img-crop" style="background-image: url(./images/uploads/prd-review-test.jpg);"></div>
                              </div>
                            </a>
                          </li>
                          <li>
                            <a href="javascript:void(0)" onclick="showPhotoReviewDetail(1)">
                              <div class="img-square">
                                <div class="img-crop" style="background-image: url(./images/uploads/prd-review-test.jpg);"></div>
                              </div>
                            </a>
                          </li>
                          <li>
                            <a href="javascript:void(0)" onclick="showPhotoReviewDetail(2)">
                              <div class="img-square">
                                <div class="img-crop" style="background-image: url(./images/uploads/prd-review-test.jpg);"></div>
                              </div>
                            </a>
                          </li>
                        </ul>
                      </div>
                      <!-- <button class="button bt-outline bt-fill-gray btn-more-review">더보기</button> -->
                    </div>
                  </section>

                  <section class="se-container">
                    <h3 class="hd-m px-m pb-0">구매후기</h3>
                    <div class="content-center">
                      <ul class="review-list" id="prodReviewList">
                        <c:forEach items="${prodReviewDetail}" var="review">
                          <li>
                            <article class="review-item">
                              <div class="review-option">
                                <span class="label">구매옵션</span>
                                <span class="content">망고스틱 10개</span>
                              </div>
                              <div class="review-wrapper">
                                <div class="review-detail">
                                  <div class="content">
                                      ${review.rmemo}
                                  </div>
                                  <div class="info">
                                    <c:choose>
                                      <c:when test="${review.orddt ne null and review.orddt ne ''}">
                                        <span class="info-item">${review.orddt}</span>
                                      </c:when>
                                      <c:otherwise>
                                        구매자
                                      </c:otherwise>
                                    </c:choose>
                                    <span class="info-item">${review.nickn}</span>
                                  </div>
                                </div>
                              </div>
                            </article>
                          </li>
                        </c:forEach>
                      </ul>
                    </div>
                  </section>
<%--              </c:when>
              <c:otherwise>
                <div class="nodata no-msg">
                  <div class="text">등록된 구매후기가 없습니다.</div>
                  <div class="text-desc">
                    첫 구매 후기를 작성하여
                    <br>
                    3,000P를 획득하세요!
                  </div>
                </div>
              </c:otherwise>
            </c:choose>--%>
          </article>

          <!-- 상품문의 -->
          <article class="swiper-slide prd-detail-slide">
            <section class="section-pdp-write-enter">
              <div class="content-center">
                <a href="javascript:void(0)" class="button bt-outline bt-steel w-100" onclick="$('#modalQnaGuide').modal('show')">상품문의 작성하기</a>
                <div class="se-review-notice">
                  <ul class="list-circle t-13 mt-sp-4">
                    <li>최근 6개월 안에 작성된 글만 표시합니다.</li>
                    <li>상품문의 글을 남기시려면 로그인 하십시오.</li>
                    <li>상품에 대해 궁금한 점을 작성하시고, 주문 및 배송 등 자세한 문의는 1:1문의나 고객센터를 이용해 주세요.</li>
                  </ul>
                  <div class="go-container">
                    <a href="WN_PB_MO_MYP_040306.html" class="btn-go">
                      <strong>1:1 문의 바로가기</strong>
                      <i class="wn-icon"></i>
                    </a>
                  </div>
                </div>
              </div>
            </section>

            <hr class="spacer">

            <section class="section-pdp-qna">
              <div class="qna-list">
                <article class="qna-item">
                  <div class="header">
                    <div class="state"><span>답변대기</span></div>
                    <div class="info">kimsoojin09 | 2020-10-10</div>
                  </div>
                  <div class="tit">
                    <span class="label">Q</span>
                    <a href="#" class="btn-toggle">내가 쓴 제목</a>
                  </div>
                  <div class="q-content">내용이 내용이 내용이 내용이 내용이 </div>
                  <div class="edit-buttons">
                    <button class="button bt-xs bt-outline bt-gray">삭제</button>
                    <button class="button bt-xs bt-green-2">수정</button>
                  </div>
                </article>
                <article class="qna-item open">
                  <div class="header">
                    <div class="state"><span class="done">답변완료</span></div>
                    <div class="info">kimsoojin09 | 2020-10-10</div>
                  </div>
                  <div class="tit">
                    <span class="label">Q</span>
                    <a href="#" class="btn-toggle">내가 쓴 제목</a>
                  </div>
                  <div class="q-content">내용이 내용이 내용이 내용이 내용이 </div>
                  <div class="edit-buttons">
                    <button class="button bt-xs bt-outline bt-gray">삭제</button>
                    <button class="button bt-xs bt-green-2">수정</button>
                  </div>
                  <div class="content-container">
                    <span class="label">A</span>
                    <div class="content">
                      안녕하세요. 자연이랑 입니다.<br>
                      자연이랑에서 출시되는 상품은 2가지 입니다.<br>
                      모든 상품은 수시로 이벤트를 진행합니다.<br>
                      여러분의 많은 관심과 참여 부탁 드립니다.<br>
                      항상 더 좋은 상품으로 찾아 뵙겠습니다.<br>
                      감사합니다.
                      <div class="info">자연이랑 | 2020-10-12</div>
                    </div>
                  </div>
                </article>
                <article class="qna-item open">
                  <div class="header">
                    <div class="state"><span class="done">답변완료</span></div>
                    <div class="info">skj****** | 2020-10-10</div>
                  </div>
                  <div class="tit">
                    <span class="label">Q</span>
                    <a href="#" class="btn-toggle">상품 세일은 언제 하나요?</a>
                  </div>
                  <div class="q-content">내용이 내용이 내용이 내용이 내용이 </div>
                  <div class="content-container">
                    <span class="label">A</span>
                    <div class="content">
                      안녕하세요. 자연이랑 입니다.<br>
                      자연이랑에서 출시되는 상품은 2가지 입니다.<br>
                      모든 상품은 수시로 이벤트를 진행합니다.<br>
                      여러분의 많은 관심과 참여 부탁 드립니다.<br>
                      항상 더 좋은 상품으로 찾아 뵙겠습니다.<br>
                      감사합니다.
                      <div class="info">자연이랑 | 2020-10-12</div>
                    </div>
                  </div>
                </article>
                <article class="qna-item">
                  <div class="header">
                    <div class="state"><span class="done">답변완료</span></div>
                    <div class="info">skj****** | 2020-10-10</div>
                  </div>
                  <div class="tit">
                    <span class="label">Q</span>
                    <span><i class="wn-icon lock-16"></i> 비밀글입니다.</span>
                  </div>
                </article>
              </div>
            </section>
          </article>
        </div><!-- /.swiper-wrapper -->
      </div><!-- /.swiper-prd-detail -->

      <hr class="spacer-bottom">

      <div class="button-footer-fixed">
        <button class="button bt-l bt-green bt-rect" id="plpBtnBuy" onclick="showBuyOption()">구매하기</button>
      </div>
    </div><!-- /.main-content -->
  </main>
  <div class="quick-menu" id="quick-menu">
    <a href="review_home.html" class="quick-menu-button btn-chat"><i class="wn-icon wni-message-square">채팅상담</i></a>
    <a href="#" class="quick-menu-button" id="page-top-button"><i class="wn-icon wni-chevron-v">Top</i></a>
  </div>
</div><!-- /.site-container -->

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
                <div class="price-format">1,900<small>원</small></div>
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
                <div class="price-format">12,000<small>원</small></div>
              </div>
            </div>
            <div class="buy-option-total">
              <span class="label">합계</span>
              <span class="price-format">10,900<small>원</small></span>
            </div>
          </div>
        </div>
        <footer class="wn-modal-footer">
          <button class="button bt-l bt-gray bt-rect" onclick="location.href = 'WN_PB_MO_ORD_010101.html' ">바로구매</button>
          <button class="button bt-l bt-green bt-rect" onclick="location.href = 'WN_PB_MO_ORD_010101.html' ">장바구니</button>
        </footer>
      </div>
    </div>
  </div>
</div>

<!-- Modal - Share SNS -->
<div class="modal fade wn-modal-bottom" id="modalSNS">
  <div class="modal-dialog">
    <div class="modal-content">
      <button class="btn-close" data-dismiss="modal">닫기</button>
      <div class="overflow-auto">
        <div class="wn-modal-body">
          <article class="section-share">
            <div class="share-item">
              <div class="thumb">
                <div class="img-square rounded-8">
                  <div class="img-crop" style="background-image: url(images/uploads/prd-img-01.jpg);"></div>
                </div>
              </div>
              <div class="content">
                <h3 class="label">공유하기</h3>
                <div class="tit">[정덕원 농부] 제주의 달콤향긋 애플망고 2kg (5~7수)</div>
              </div>
            </div>
            <ul class="sns-tile">
              <li>
                <a href="#" class="sns-thumb">
                  <i class="wn-icon sns-kakaostory"></i>
                  <div class="label">카카오스토리</div>
                </a>
              </li>
              <li>
                <a href="#" class="sns-thumb">
                  <i class="wn-icon sns-band"></i>
                  <div class="label">밴드</div>
                </a>
              </li>
              <li>
                <a href="#" class="sns-thumb">
                  <i class="wn-icon sns-line"></i>
                  <div class="label">라인</div>
                </a>
              </li>
              <li>
                <a href="#" class="sns-thumb">
                  <i class="wn-icon sns-facebook"></i>
                  <div class="label">페이스북</div>
                </a>
              </li>
              <li>
                <a href="#" class="sns-thumb">
                  <i class="wn-icon sns-twitter"></i>
                  <div class="label">트위터</div>
                </a>
              </li>
              <li>
                <a href="#" class="sns-thumb">
                  <i class="wn-icon sns-kakaotalk"></i>
                  <div class="label">카카오톡</div>
                </a>
              </li>
              <li>
                <a href="#" class="sns-thumb">
                  <i class="wn-icon sns-sms"></i>
                  <div class="label">문자 (SMS)</div>
                </a>
              </li>
              <li>
                <a href="#" class="sns-thumb">
                  <i class="wn-icon sns-link"></i>
                  <div class="label">링크 복사</div>
                </a>
              </li>
            </ul>
          </article>
        </div>
      </div>
    </div>
  </div>
</div>

<!-- Modal - 상품문의 작성 안내 -->
<div class="modal wn-modal-full" id="modalQnaGuide">
  <div class="modal-dialog">
    <div class="modal-content">
      <header class="wn-modal-header">
        <h2 class="tit">상품문의 작성 전 확인해 주세요!</h2>
        <button class="btn-close-modal" data-dismiss="modal">닫기</button>
      </header>
      <div class="wn-modal-body">
        <section class="section-qna-guide">
          <div class="content-center">
            <div class="mt-l">
              <ul class="list-dot">
                <li>답변은 영업일 기준 2~3일 소요됩니다.</li>
                <li>상품 문의 게시판의 성격과 다른 글은 사전 동의없이 담당게시판으로 이동될 수 있습니다.</li>
                <li>배송관련 및 주무(취소/환불/교환) 문의, 요청사항은 자연이랑 1:1문의를 이용해 주세요.</li>
              </ul>
            </div>
            <div class="mt-l">
              <h3 class="hd-s">상품</h3>
              <ul class="list-dot">
                <li>입고일 : 입고일이 확정되면 상품 이미지에 표시되어 안내됩니다.(상품 상품정보 페이지 내 재입고 알림 신청 가능)</li>
                <li>상품 상세정보 : 영양성분, 원재료, 보관 및 취급 방법은
                  상세 이미지 또는 상세 정보에서 확인 가능합니다.</li>
              </ul>
            </div>
            <div class="mt-l">
              <h3 class="hd-s">주문취소</h3>
              <ul class="list-dot">
                <li>
                  배송 단계별 주문 취소 방법이 상이합니다.
                  <div class="pl-3 my-2 t-gray">
                    <p>
                      [결제완료]단계 : 마이페이지>주문내역 상품정보 페이지]에서 직접 취소 가능(취소불가 시 고객센터로 문의)
                    </p>
                    <p>
                      [출고작업중]단계 : 취소가 제한되는 점 고객님의 양해부탁 드립니다.
                    </p>
                  </div>
                </li>
                <li>
                  주문상품의 부분 취소는 불가능하니, 전체주문 취소 후
                  재구매 해주세요.
                </li>
              </ul>
            </div>
            <div class="mt-l">
              <h3 class="hd-s">배송</h3>
              <ul class="list-dot">
                <li>배송일 및 배송시간 지정은 불가능합니다.(예약배송 포함)</li>
              </ul>
            </div>
          </div>
          <div class="content-center">
            <div class="bg-gray border-gray mt-l px-m py-15 rounded-4">
              전화번호,이메일, 주소, 계좌번호 등 개인정도가 문의 내용에 저장되지 않도록 주의 부탁드립니다.
            </div>
          </div>
        </section>

        <hr class="spacer-bottom">
      </div>
      <div class="wn-modal-footer">
        <button class="button bt-l bt-rect bt-green" onclick="location.href ='WN_PB_MO_GDS_020604.html'">확인</button>
      </div>
    </div>
  </div>
</div>
<script>
  $(document).ready(function () {
    $('.global-bottom').hide();
  });
</script>