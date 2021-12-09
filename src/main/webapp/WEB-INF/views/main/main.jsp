<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp" %>

<body class="page-home header-float">
  <div class="site-container">
  <header class="global-header" id="global-header">
    <div class="global-header-wrap min" id="sticky-header">
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
          <a href="WN_PB_MO_ORD_010101.html" class="menu-item">
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
                <div class="swiper-slide">
                  <a href="#"><img src="<%=_imgUrl %>images/banner/${renewalBannerList.cbnpath03}" alt="banner3"></a>
                </div>
                <div class="swiper-slide">
                  <a href="#"><img src="<%=_imgUrl %>images/banner/${renewalBannerList.cbnpath04}" alt="banner4"></a>
                </div>
                <div class="swiper-slide">
                  <a href="#"><img src="<%=_imgUrl %>images/banner/${renewalBannerList.cbnpath05}" alt="banner5"></a>
                </div>
                <div class="swiper-slide">
                  <a href="#"><img src="<%=_imgUrl %>images/banner/${renewalBannerList.cbnpath06}" alt="banner6"></a>
                </div>
                <div class="swiper-slide">
                  <a href="#"><img src="<%=_imgUrl %>images/banner/${renewalBannerList.cbnpath07}" alt="banner7"></a>
                </div>
              </c:forEach>
            </div>
            <div class="swiper-kv-footer">
              <div class="swiper-pgn-dots-main">
              </div>

              <div class="swiper-btn-autoplay"><i class="swiper-icon-pause"></i></div>
            </div>
            <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
        </div>
        <div class="global-nav-container" style="">
          <div class="global-nav scroll-fixed-top" id="globalNavContainer">
            <ul class="global-nav-menu" id="mainTab">
              <li class="menu-item"><a href="javascript:void(0);" onclick="mainBodyOn(0);"><span class="tit">메인<span></span></span></a></li>
              <li class="menu-item active"><a href="javascript:void(0);" onclick="mainBodyOn(1);"><span class="tit">신상품<span></span></span></a></li>
              <li class="menu-item"><a href="javascript:void(0);" onclick="mainBodyOn(2);"><span class="tit">할인관</span></a></li>
              <li class="menu-item"><a href="javascript:void(0);" onclick="mainBodyOn(3);"><span class="tit">베스트</span></a></li>
              <li class="menu-item"><a href="javascript:void(0);" onclick="mainBodyOn(4);"><span class="tit">전문관</span></a></li>
              <li class="menu-item"><a href="javascript:void(0);" onclick="mainBodyOn(5);"><span class="tit">이벤트</span></a></li>
            </ul>
          </div>
        </div>
      </section>


      <div class="swiper-container swiper-container-initialized swiper-container-horizontal swiper-container-autoheight" id="globalNavSwiper">
        <div class="swiper-wrapper" style="height: 1018px; transform: translate3d(-808px, 0px, 0px); transition: all 0ms ease 0s;">
          <div class="swiper-slide swiper-slide-prev" style="width: 808px;">
            <!-- 메인 -->
            <!-- MD 추천상품 B ------------------------- -->
            <section class="com-new-items-b">
              <header class="main-sec-header">
                <h3 class="tit"><span class="semi-bold">MD</span> 추천상품</h3>
                <div class="add-r">
                  <a href="#" class="btn-all-chevron" title="전체보기"></a>
                </div>
              </header>
              <div class="swiper-container swiper-prd-2n swiper-no-swiping swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px);">
                  <c:forEach items="${newProdList}" var="newProd">
                  <div class="swiper-slide swiper-slide-active" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/${newProd.mgdimg1}" alt="${newProd.unit}">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">${newProd.gdname}</h4>
                          <div class="prd-item-price">
                            <div class="price">
                              <fmt:formatNumber type="number" maxFractionDigits="0" var="salePrice" value="${newProd.saleprice}"/>
                              <span>${salePrice}</span><small>원</small>
                            </div>
                            <fmt:formatNumber type="number" maxFractionDigits="0" var="originalPrice" value="${newProd.price1}"/>
                            <div class="price-org">${originalPrice} 원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  </c:forEach>
                  <%--<div class="swiper-slide swiper-slide-next" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-02.jpg" alt="마담로익 크림치즈 플레인 150g">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>--%>
                  <%--<div class="swiper-slide" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-08.jpg" alt="마담로익 크림치즈 플레인 150g">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>--%>
                  <%--<div class="swiper-slide" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-02.jpg" alt="마담로익 크림치즈 플레인 150g">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>--%>
                </div>
                <div class="swiper-pgn-dots-sub swiper-pagination-bullets"><span class="swiper-pagination-bullet swiper-pagination-bullet-active"></span><span class="swiper-pagination-bullet"></span></div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>

            <!-- 오늘의 특가 B1 ------------------------- -->
            <section class="com-today-price-b aos-init aos-animate" data-aos="fade-up">
              <header class="today-price-header">
                <div class="tit-top">할인받고 겟!</div>
                <h3 class="tit">오늘의 특가</h3>
              </header>
              <div class="swiper-container swiper-dot-sub swiper-today-price-b swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper">
                  <div class="swiper-slide swiper-slide-active" style="width: 808px;">
                    <a href="#" class="today-price-item-b">
                      <div class="visual-wrapper">
                        <div class="today-price-progress" data-percent="60">
                          <div class="today-price-circle-bg" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="75"><svg version="1.1" width="100" height="100" viewBox="0 0 100 100" class="circle-progress"><circle class="circle-progress-circle" cx="50" cy="50" r="49.25" fill="none" stroke="#ddd" stroke-width="8"></circle><path d="M 15.174991026562537 84.82500897343746 A 49.25 49.25 0 1 1 84.8250089734375 84.82500897343743" class="circle-progress-value" fill="none" stroke="#00E699" stroke-width="8"></path><text class="circle-progress-text" x="50" y="50" font="16px Arial, sans-serif" text-anchor="middle" fill="#999" dy="0.4em"></text></svg></div>
                          <div class="today-price-circle-bar" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="45"><svg version="1.1" width="100" height="100" viewBox="0 0 100 100" class="circle-progress"><defs><marker id="dot" viewBox="0 0 10 10" markerWidth="10" markerHeight="10" markerUnits="strokeWidth" orient="auto" refX="5" refY="5"><circle cx="5" cy="5" r="1" fill="#fa5252" stroke="none"></circle></marker></defs><circle class="circle-progress-circle" cx="50" cy="50" r="49.25" fill="none" stroke="#ddd" stroke-width="8"></circle><path d="M 15.174991026562537 84.82500897343746 A 49.25 49.25 0 0 1 72.35903211217267 6.117928683722873" class="circle-progress-value" fill="none" stroke="#00E699" stroke-width="8" marker-end="url(#dot)"></path><text class="circle-progress-text" x="50" y="50" font="16px Arial, sans-serif" text-anchor="middle" fill="#999" dy="0.4em"></text></svg></div>
                        </div>
                        <div class="img-container">
                          <div class="prd-img" style="background-image: url('<%=_imgUrl %>images/uploads/prd-img-07.jpg');" title="[채움] 유기농 노니 30입">
                          </div>
                          <div class="remain">
                            <div class="today-price-remain">
                              <span class="item">주문마감 01 : 43 : 50 남음</span>
                              <span class="item">남은수량 40개</span>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit">★주말파격특가★ [채움] 유기농 노니 30입</div>
                        <div class="price-wrap">
                          <span class="dc">23%</span>
                          <span class="price">38,900원</span>
                          <span class="price-org">59,000원</span>
                        </div>
                      </div>
                    </a>
                  </div>
                </div>
                <div class="swiper-pgn-dots-sub swiper-pagination-bullets swiper-pagination-lock"><span class="swiper-pagination-bullet swiper-pagination-bullet-active"></span></div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>

            <!-- 전문관 C5 ------------------------- -->
            <section class="com-sp-shop-c5 aos-init" data-aos="fade-up">
              <header class="main-sec-header">
                <h3 class="tit">자연이랑 <span class="semi-bold">PICK</span></h3>
                <div class="add-r">
                  <a href="#" class="btn-all-chevron" title="전체보기"></a>
                </div>
              </header>


              <div class="swiper-container swiper-sp-shop-c5 swiper-no-swiping swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px); transition: all 0ms ease 0s;">
                  <div class="swiper-slide swiper-slide-active" style="width: 653px; margin-right: 10px;">
                    <a href="#" class="sp-shop-banner-c5">
                      <img src="<%=_imgUrl %>images/uploads/spShopBannerC5-01@2x.png" alt="일상적미식">
                    </a>
                  </div>
                  <div class="swiper-slide swiper-slide-next" style="width: 653px; margin-right: 10px;">
                    <a href="#" class="sp-shop-banner-c5">
                      <img src="<%=_imgUrl %>images/uploads/spShopBannerC5-02@2x.png" alt="자연에서본">
                    </a>
                  </div>
                  <div class="swiper-slide" style="width: 653px; margin-right: 10px;">
                    <a href="#" class="sp-shop-banner-c5">
                      <img src="<%=_imgUrl %>images/uploads/spShopBannerC5@2x.jpg" alt="자연's LOVE">
                    </a>
                  </div>
                </div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>

            <!-- 중간배너 A ------------------------- -->
            <section class="com-mid-banner aos-init" data-aos="fade-up">
              <a href="#" class="mid-banner-a">
                <img src="<%=_imgUrl %>images/uploads/midBannerA@2x.jpg" alt="딱 3일간 회원님들께 드리는 깜짝 쿠폰팩을 받으세요!">
              </a>
            </section>

            <!-- 기획전 A1 ------------------------- -->
            <section class="com-plan-shop-a1 aos-init" data-aos="fade-up">
              <header class="main-sec-header">
                <h3 class="tit">제철의 맛</h3>
                <div class="add-r">
                  <a href="#" class="btn-all-chevron" title="전체보기"></a>
                </div>
              </header>
              <div class="swiper-container swiper-dot-sub swiper-plan-shop-a2 swiper-no-swiping swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px); transition: all 0ms ease 0s;">
                  <c:forEach items="${seasonalProdList}" var="seasonPord">
                    <div class="swiper-slide swiper-slide-active" style="width: 808px;">
                    <a href="#" class="plan-shop-banner-a1">
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/seasonalfoodhall/${seasonPord.sfhmimgM}" alt="부산 명물 대저 토마토">
                      </div>
                      <div class="detail">
                        <div class="content">
                          <div data-swiper-parallax="-200" style="transform: translate3d(0px, 0px, 0px); transition: all 0ms ease 0s;">
                            <div class="tag">#${seasonPord.sf01Des2}</div>
                            <div class="tit">${seasonPord.sfshort}</div>
                            <div class="desc"></div>
                          </div>
                        </div>
                        <i class="wn-icon chevron-h-20"></i>
                      </div>
                    </a>
                  </div>
                  </c:forEach>
<%--                  <div class="swiper-slide swiper-slide-next" style="width: 808px;">
                    <a href="#" class="plan-shop-banner-a1">
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/planShopBannerA101@2x.jpg" alt="부산 명물 대저 토마토">
                      </div>
                      <div class="detail">
                        <div class="content">
                          <div data-swiper-parallax="-200" style="transform: translate3d(200px, 0px, 0px); transition: all 0ms ease 0s;">
                            <div class="tag">#단짠의 완벽한 조화</div>
                            <div class="tit">부산 명물 대저 토마토</div>
                            <div class="desc">바다의 염분을 머금어 짭짤한 맛이 나는 대저 토마토</div>
                          </div>
                        </div>
                        <i class="wn-icon chevron-h-20"></i>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide" style="width: 808px;">
                    <a href="#" class="plan-shop-banner-a1">
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/planShopBannerA101@2x.jpg" alt="부산 명물 대저 토마토">
                      </div>
                      <div class="detail">
                        <div class="content">
                          <div data-swiper-parallax="-200" style="transform: translate3d(200px, 0px, 0px); transition: all 0ms ease 0s;">
                            <div class="tag">#단짠의 완벽한 조화</div>
                            <div class="tit">부산 명물 대저 토마토</div>
                            <div class="desc">바다의 염분을 머금어 짭짤한 맛이 나는 대저 토마토</div>
                          </div>
                        </div>
                        <i class="wn-icon chevron-h-20"></i>
                      </div>
                    </a>
                  </div>--%>
                </div>
                <div class="swiper-pgn-dots-sub swiper-pagination-bullets"><span class="swiper-pagination-bullet swiper-pagination-bullet-active"></span><span class="swiper-pagination-bullet"></span><span class="swiper-pagination-bullet"></span></div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>

            <!-- 전문관 A3 ------------------------- -->
            <section class="com-sp-shop-a3 aos-init" data-aos="fade-up">
              <header class="main-sec-header">
                <h3 class="tit">자연이랑 전문관</h3>
                <div class="add-r">
                  <a href="#" class="btn-all-chevron" title="전체보기"></a>
                </div>
              </header>
              <div class="swiper-container swiper-sp-shop-group swiper-no-swiping swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px);">
                  <div class="swiper-slide swiper-slide-active" style="width: 808px;">
                    <article class="sp-shop-group">
                      <a href="#" class="sp-shop-banner-a3">
                        <div class="img-container">
                          <img src="<%=_imgUrl %>images/uploads/spShopA3lg@2x.jpg" alt="미식쌀롱">
                        </div>
                        <div class="detail" data-swiper-parallax="-200" style="transform: translate3d(0px, 0px, 0px);">
                          <div class="tit">미식쌀롱</div>
                          <div class="desc">취향저격 쌀집</div>
                        </div>
                      </a>
                      <div class="swiper-container swiper-sp-shop-thumb-a3 swiper-no-swiping swiper-container-initialized swiper-container-horizontal">
                        <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px);">
                          <div class="swiper-slide swiper-slide-active" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">취향쌀롱</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide swiper-slide-next" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">토종쌀롱</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">당일쌀롱</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">당일쌀롱2</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">당일쌀롱3</div>
                              </div>
                            </a>
                          </div>
                        </div>
                        <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
                    </article>
                  </div>
                  <div class="swiper-slide swiper-slide-next" style="width: 808px;">
                    <article class="sp-shop-group">
                      <a href="#" class="sp-shop-banner-a3">
                        <div class="img-container">
                          <img src="<%=_imgUrl %>images/uploads/spShopA3lg@2x.jpg" alt="미식쌀롱">
                        </div>
                        <div class="detail" data-swiper-parallax="-200" style="transform: translate3d(200px, 0px, 0px);">
                          <div class="tit">미식쌀롱</div>
                          <div class="desc">취향저격 쌀집</div>
                        </div>
                      </a>
                      <div class="swiper-container swiper-sp-shop-thumb-a3 swiper-no-swiping swiper-container-initialized swiper-container-horizontal">
                        <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px);">
                          <div class="swiper-slide swiper-slide-active" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">취향쌀롱</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide swiper-slide-next" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">토종쌀롱</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">당일쌀롱</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">당일쌀롱2</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">당일쌀롱3</div>
                              </div>
                            </a>
                          </div>
                        </div>
                        <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
                    </article>
                  </div>
                  <div class="swiper-slide" style="width: 808px;">
                    <article class="sp-shop-group">
                      <a href="#" class="sp-shop-banner-a3">
                        <div class="img-container">
                          <img src="<%=_imgUrl %>images/uploads/spShopA3lg@2x.jpg" alt="미식쌀롱">
                        </div>
                        <div class="detail" data-swiper-parallax="-200" style="transform: translate3d(200px, 0px, 0px);">
                          <div class="tit">미식쌀롱</div>
                          <div class="desc">취향저격 쌀집</div>
                        </div>
                      </a>
                      <div class="swiper-container swiper-sp-shop-thumb-a3 swiper-no-swiping swiper-container-initialized swiper-container-horizontal">
                        <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px);">
                          <div class="swiper-slide swiper-slide-active" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">취향쌀롱</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide swiper-slide-next" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">토종쌀롱</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">당일쌀롱</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">당일쌀롱2</div>
                              </div>
                            </a>
                          </div>
                          <div class="swiper-slide" style="width: 346.5px; margin-right: 10px;">
                            <a href="#" class="sp-shop-thumb-a3">
                              <div class="img-container">
                                <img src="<%=_imgUrl %>images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                              </div>
                              <div class="detail">
                                <div class="tit">당일쌀롱3</div>
                              </div>
                            </a>
                          </div>
                        </div>
                        <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
                    </article>
                  </div>
                </div><!-- .swiper-wrapper -->
                <div class="swiper-pgn-dots-sub swiper-pagination-bullets"><span class="swiper-pagination-bullet swiper-pagination-bullet-active"></span><span class="swiper-pagination-bullet"></span><span class="swiper-pagination-bullet"></span></div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div><!-- /.swiper-sp-shop-group -->
            </section>

            <!-- 신상품 B ------------------------- -->
            <section class="com-new-items-b aos-init" data-aos="fade-up">
              <header class="main-sec-header">
                <h3 class="tit">신상품</h3>
                <div class="add-r">
                  <a href="#" class="btn-all-chevron" title="전체보기"></a>
                </div>
              </header>
              <div class="swiper-container swiper-prd-2n swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px);">
                  <c:forEach items="${newProdList}" var="newProd">
                    <div class="swiper-slide swiper-slide-active" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/${newProd.mgdimg1}" onerror="this.src='<%=_imgUrl %>images/gdimg/KakaoTalk_20180514_104607728.jpg';" alt="${newProd.unit}">
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">${newProd.gdname}</h4>
                          <div class="prd-item-price">
                            <div class="price">
                              <fmt:formatNumber type="number" maxFractionDigits="0" var="salePrice" value="${newProd.saleprice}"/>
                              <span>${salePrice}</span><small>원</small>
                            </div>
                            <fmt:formatNumber type="number" maxFractionDigits="0" var="originalPrice" value="${newProd.price1}"/>
                            <div class="price-org">${originalPrice}</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  </c:forEach>
<%--                  <div class="swiper-slide swiper-slide-next" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-03.jpg" alt="마담로익 크림치즈 플레인 150g">
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <div class="swiper-slide" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" alt="마담로익 크림치즈 플레인 150g">
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <div class="swiper-slide" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-03.jpg" alt="마담로익 크림치즈 플레인 150g">
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>--%>
                </div>
                <div class="swiper-pgn-dots-sub swiper-pagination-bullets"><span class="swiper-pagination-bullet swiper-pagination-bullet-active"></span><span class="swiper-pagination-bullet"></span></div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>

            <!-- MD 추천상품 B ------------------------- -->
            <section class="com-new-items-b aos-init" data-aos="fade-up">
              <header class="main-sec-header">
                <h3 class="tit">이 상품 어때요?</h3>
                <div class="add-r">
                  <a href="#" class="btn-all-chevron" title="전체보기"></a>
                </div>
              </header>
              <div class="swiper-container swiper-prd-2n swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px);">
                  <%--<c:forEach items="${nowHotProdList}" var="hotProd">--%>
                  <div class="swiper-slide swiper-slide-active" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-08.jpg" alt="마담로익 크림치즈 플레인 150g">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <%--</c:forEach>--%>
                  <div class="swiper-slide swiper-slide-next" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-02.jpg" alt="마담로익 크림치즈 플레인 150g">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <div class="swiper-slide" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-08.jpg" alt="마담로익 크림치즈 플레인 150g">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <div class="swiper-slide" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-02.jpg" alt="마담로익 크림치즈 플레인 150g">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                </div>
                <div class="swiper-pgn-dots-sub swiper-pagination-bullets"><span class="swiper-pagination-bullet swiper-pagination-bullet-active"></span><span class="swiper-pagination-bullet"></span></div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>


            <!-- 할인상품 B ------------------------- -->
            <section class="com-new-items-b aos-init" data-aos="fade-up">
              <header class="main-sec-header">
                <h3 class="tit">할인상품</h3>
                <div class="add-r">
                  <a href="#" class="btn-all-chevron" title="전체보기"></a>
                </div>
              </header>
              <div class="swiper-container swiper-prd-2n swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px);">
                  <c:forEach items="${discountProdList}" var="discountPord">
                    <div class="swiper-slide swiper-slide-active" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="#" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/gdimg/${discountPord.mgdimg1}" alt="${discountProd.shortdesc}" onerror="this.src='<%=_imgUrl %>images/gdimg/KakaoTalk_20180514_104607728.jpg';">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">${discountPord.gdname}</h4>
                          <div class="prd-item-price">
                            <fmt:formatNumber type="number" maxFractionDigits="0" var="salePrice" value="${discountPord.saleprice}"/>
                            <div class="price"><span>${salePrice}</span><small>원</small></div>
                            <fmt:formatNumber type="number" maxFractionDigits="0" var="originalPrice" value="${discountPord.price1}"/>
                            <div class="price-org">${originalPrice}</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  </c:forEach>
<%--                  <div class="swiper-slide swiper-slide-next" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-04.jpg" alt="마담로익 크림치즈 플레인 150g">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <div class="swiper-slide" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-06.jpg" alt="마담로익 크림치즈 플레인 150g">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <div class="swiper-slide" style="width: 384px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-04.jpg" alt="마담로익 크림치즈 플레인 150g">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">마담로익 크림치즈 플레인 150g</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>--%>
                </div>
                <div class="swiper-pgn-dots-sub swiper-pagination-bullets"><span class="swiper-pagination-bullet swiper-pagination-bullet-active"></span><span class="swiper-pagination-bullet"></span></div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>

            <!-- 매거진 ------------------------- -->
            <section class="com-magazine aos-init" data-aos="fade-up">
              <c:forEach items="${magazineDetail}" var="magazine" begin="0" end="0">
                <c:if test="${magazineNum eq magazine.zlidx}">
                  <a href="WN_PB_MO_ETC_010100.html">
                    <img src="<%=_imgUrl %>images/uploads/${magazine.thumbimg3}" alt="매거진 - 봄날의 식탁을 좋아하세요?">
                  </a>
                </c:if>
              </c:forEach>
            </section>

            <!-- 태그 ------------------------- -->
            <section class="com-tags aos-init" data-aos="fade-up">
              <header class="main-sec-header">
                <h3 class="tit">오늘의 인기 #태그</h3>
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

            <!-- 상품랭킹 B ------------------------- -->
            <!-- <section class="com-raking-b" data-aos="fade-up"> -->
            <section class="com-raking-b aos-init" data-aos="fade-up">
              <header class="main-sec-header">
                <h3 class="tit">금주의 야식랭킹</h3>
                <div class="add-r">
                  <a href="#" class="btn-all-chevron" title="전체보기"></a>
                </div>
              </header>
              <div class="swiper-container swiper-ranking-b swiper-no-swiping swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px);">
                  <div class="swiper-slide swiper-slide-active" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="ranking-flag">
                        <div class="flag-shape"></div>
                        <div class="text">1</div>
                      </div>
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide swiper-slide-next" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="ranking-flag">
                        <div class="flag-shape"></div>
                        <div class="text">2</div>
                      </div>
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="ranking-flag">
                        <div class="flag-shape"></div>
                        <div class="text">3</div>
                      </div>
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="ranking-flag">
                        <div class="flag-shape"></div>
                        <div class="text">4</div>
                      </div>
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                </div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>

            <!-- 꾸러미 ------------------------- -->
            <section class="com-package aos-init" data-aos="fade-up">
              <header class="main-sec-header">
                <h3 class="tit">꾸러미</h3>
                <div class="add-r">
                  <a href="#" class="btn-all-chevron" title="전체보기"></a>
                </div>
              </header>
              <a href="#">
                <img src="<%=_imgUrl %>images/uploads/mainPkgA@2x.jpg" alt="일반형 상품">
              </a>
            </section>

            <hr class="spacer-m">
          </div>
          <div class="swiper-slide swiper-slide-active" style="width: 808px;">
            <!-- 신상품 -->
            <div class="prd-list-tools-container">
              <div class="prd-list-tools">
                <div class="prd-list-tags">
                  <div class="tags-wrapper swiper-container swiper-no-swiping swiper-container-initialized swiper-container-horizontal" id="tags-swiper">
                    <div class="tags swiper-wrapper">
                      <a href="#" class="tag-item swiper-slide swiper-slide-active">전체보기</a>
                      <a href="#" class="tag-item swiper-slide swiper-slide-next">과일·견과</a>
                      <a href="#" class="tag-item swiper-slide">채소·버섯</a>
                      <a href="#" class="tag-item swiper-slide">쌀·잡곡</a>
                      <a href="#" class="tag-item swiper-slide">정육·계란</a>
                      <a href="#" class="tag-item swiper-slide">수산·건어물</a>
                      <a href="#" class="tag-item swiper-slide">음료·간식</a>
                      <a href="#" class="tag-item swiper-slide">양념·면</a>
                      <a href="#" class="tag-item swiper-slide">반찬·간편식</a>
                      <a href="#" class="tag-item swiper-slide">건강식품</a>
                      <a href="#" class="tag-item swiper-slide">리빙·반려</a>
                      <a href="#" class="tag-item swiper-slide">정기·선물세트</a>
                    </div>
                    <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
                </div>
                <div class="prd-list-buttons">
                  <button class="item btn-filter" id="btn_filter" onclick="$('#modalNewPrdFilters').modal('show')"><i class="wn-icon plp-filter">필터</i></button>
                </div>
              </div>
            </div>
            <section class="prd-list prd-list-tile" id="newPrdList">
              <%--<c:forEach items="${newProdList}" var="newProd">
                <c:choose>
                  <c:when test="${newProd.gdcnt > 0}">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/${newProd.mgdimg1}" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/${newProd.mgdimg1}&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/${newProd.mgdimg1}&quot;}" alt="제품명">
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
                          <h4 class="prd-item-tit">${newProd.gdname}</h4>
                          <div class="prd-item-price">
                            <div class="price">
                              <fmt:formatNumber type="number" maxFractionDigits="0" var="salePrice" value="${newProd.saleprice}"/>
                              <span>${salePrice}</span><small>원</small>
                            </div>
                            <fmt:formatNumber type="number" maxFractionDigits="0" var="originalPrice" value="${newProd.price1}"/>
                            <div class="price-org">${originalPrice}원</div>
                          </div>
                          <div class="prd-item-label">
                            <span class="prd-label mu">${newProd.address}</span>
                            <span class="prd-label sp">${newProd.g}/span>
                          </div>
                        </a>
                      </div>
                    </article>
                  </c:when>
                  <c:otherwise>
                    <article class="prd-item soldout">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/${newProd.mgdimg1}" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/${newProd.mgdimg1}&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/${newProd.mgdimg1}&quot;}" alt="부여 군밤용 단택알밤 1kg(대)">
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
                          <h4 class="prd-item-tit">${newProd.gdname}</h4>
                          <div class="prd-item-price">
                            <div class="price">
                              <fmt:formatNumber type="number" maxFractionDigits="0" var="salePrice" value="${newProd.saleprice}"/>
                              <span>${salePrice}</span><small>원</small>
                            </div>
                            <fmt:formatNumber type="number" maxFractionDigits="0" var="originalPrice" value="${newProd.price1}"/>
                            <div class="price-org">${originalPrice}원</div>
                          </div>
                          <div class="prd-item-label">
                            <span class="prd-label mu">무농약</span>
                            <span class="prd-label ha">한정수량</span>
                          </div>
                        </a>
                      </div>
                    </article>
                  </c:otherwise>
                </c:choose>
              </c:forEach>--%>

              <%--<article class="prd-item">
                <div class="img-container">
                  <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-06.jpg" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01.jpg&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01-h.jpg&quot;}" alt="제주 구좌당근 500g">
                  </a>
                  <div class="prd-item-buttons">
                    <a href="javascript:void(0)" onclick="$('#modalBuyOption').modal('show')" class="btn btn-cart"><i class="wn-icon wni-cart-w">장바구니</i></a>
                  </div>
                </div>
                <div class="detail">
                  <a href="#">
                    <h4 class="prd-item-tit">제주 구좌당근 500g</h4>
                    <div class="prd-item-price">
                      <div class="price"><span>3,480</span><small>원</small></div>
                      <div class="price-org">4,800원</div>
                    </div>
                    <div class="prd-item-label">
                      <span class="prd-label mu">무항생제</span>
                    </div>
                  </a>
                </div>
              </article>--%>
              <%--<article class="prd-item">
                <div class="img-container">
                  <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-03.jpg" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01.jpg&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01-h.jpg&quot;}" alt="제품명제품명 2줄까지만 표시되게 하기">
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
                    <h4 class="prd-item-tit">제품명제품명 2줄까지만 표시되게 하기</h4>
                    <div class="prd-item-price">
                      <div class="price"><span>3,480</span><small>원</small></div>
                      <div class="price-org">4,800원</div>
                    </div>
                    <div class="prd-item-label">
                      <span class="prd-label yu">유기가공</span>
                      <span class="prd-label sp">특가상품</span>
                    </div>
                  </a>
                </div>
              </article>--%>
              <%--<article class="prd-item">
                <div class="img-container">
                  <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-01.jpg" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01.jpg&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01-h.jpg&quot;}" alt="제주 구좌당근 500g">
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
                    <h4 class="prd-item-tit">제주 구좌당근 500g</h4>
                    <div class="prd-item-price">
                      <div class="price"><span>3,480</span><small>원</small></div>
                      <div class="price-org">4,800원</div>
                    </div>
                    <div class="prd-item-label">
                      <span class="prd-label ga">GMP</span>
                    </div>
                  </a>
                </div>
              </article>--%>
              <%--<article class="prd-item">
                <div class="img-container">
                  <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01.jpg&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01-h.jpg&quot;}" alt="제주 구좌당근 500g">
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
                    <h4 class="prd-item-tit">제주 구좌당근 500g</h4>
                    <div class="prd-item-price">
                      <div class="price"><span>3,480</span><small>원</small></div>
                      <div class="price-org">4,800원</div>
                    </div>
                    <div class="prd-item-label">
                      <span class="prd-label mu">무농약</span>
                      <span class="prd-label ha">한정수량</span>
                    </div>
                  </a>
                </div>
              </article>--%>
            </section>
            <div class="spacer-bottom"></div>
          </div>

          <div class="swiper-slide swiper-slide-next" style="width: 808px;">
            <!-- 할인관 -->
            <!-- 오늘의 특가 -->
            <section class="el-container">
              <header class="px-m">
                <h3 class="hd-ml">타임세일</h3>
              </header>
              <div class="swiper-container swiper-prd-h swiper-no-swiping swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px); transition: all 0ms ease 0s;">
                  <div class="swiper-slide swiper-slide-active" style="width: 753px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-h.jpg" alt="블랙타이거새우 10미(특대/냉동)">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                          <div class="prd-item-remain">
                            <span class="content">01 : 43 : 50 남음</span>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">블랙타이거새우 10미(특대/냉동) 쫄깃쫄미(특대/냉동)...</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <div class="swiper-slide swiper-slide-next" style="width: 753px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-h.jpg" alt="블랙타이거새우 10미(특대/냉동)">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                          <div class="prd-item-remain">
                            <span class="content">01 : 43 : 50 남음</span>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">블랙타이거새우 10미(특대/냉동) 쫄깃쫄미(특대/냉동)...</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                  <div class="swiper-slide" style="width: 753px; margin-right: 10px;">
                    <article class="prd-item">
                      <div class="img-container">
                        <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                          <img src="<%=_imgUrl %>images/uploads/prd-img-h.jpg" alt="블랙타이거새우 10미(특대/냉동)">
                          <div class="prd-item-badge dc">
                            <span>23</span>
                            <small>%</small>
                          </div>
                          <div class="prd-item-remain">
                            <span class="content">01 : 43 : 50 남음</span>
                          </div>
                        </a>
                      </div>
                      <div class="detail">
                        <a href="#">
                          <h4 class="prd-item-tit">블랙타이거새우 10미(특대/냉동) 쫄깃쫄미(특대/냉동)...</h4>
                          <div class="prd-item-price">
                            <div class="price"><span>3,480</span><small>원</small></div>
                            <div class="price-org">4,800원</div>
                          </div>
                        </a>
                      </div>
                    </article>
                  </div>
                </div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>

            <!-- 할인상품 -->
            <section class="se-container px-m">
              <h3 class="hd-ml">할인상품</h3>
            </section>

            <section class="mt-15">
              <div class="prd-list-tools-container">
                <div class="prd-list-tools">
                  <div class="prd-list-tags">
                    <div class="tags-wrapper swiper-container swiper-no-swiping swiper-container-initialized swiper-container-horizontal" id="tags-swiper">
                      <div class="tags swiper-wrapper">
                        <a href="#" class="tag-item swiper-slide swiper-slide-active">전체보기</a>
                        <a href="#" class="tag-item swiper-slide swiper-slide-next">과일·견과</a>
                        <a href="#" class="tag-item swiper-slide">채소·버섯</a>
                        <a href="#" class="tag-item swiper-slide">쌀·잡곡</a>
                        <a href="#" class="tag-item swiper-slide">정육·계란</a>
                        <a href="#" class="tag-item swiper-slide">수산·건어물</a>
                        <a href="#" class="tag-item swiper-slide">음료·간식</a>
                        <a href="#" class="tag-item swiper-slide">양념·면</a>
                        <a href="#" class="tag-item swiper-slide">반찬·간편식</a>
                        <a href="#" class="tag-item swiper-slide">건강식품</a>
                        <a href="#" class="tag-item swiper-slide">리빙·반려</a>
                        <a href="#" class="tag-item swiper-slide">정기·선물세트</a>
                      </div>
                      <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
                  </div>
                  <div class="prd-list-buttons">
                    <button class="item btn-filter" id="btn-filter" onclick="$('#modalDcPrdFilters').modal('show')"><i class="wn-icon plp-filter">필터</i></button>
                  </div>
                </div>
              </div>
            </section>

            <section class="prd-list prd-list-tile" id="dcPrdList">
              <article class="prd-item">
                <div class="img-container">
                  <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-01.jpg" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01.jpg&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01-h.jpg&quot;}" alt="제품명">
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
                    <h4 class="prd-item-tit">제품명제품명 2줄까지만 표시되게 하기</h4>
                    <div class="prd-item-price">
                      <div class="price"><span>3,480</span><small>원</small></div>
                      <div class="price-org">4,800원</div>
                    </div>
                    <div class="prd-item-label">
                      <span class="prd-label mu">무농약</span>
                      <span class="prd-label sp">특가상품</span>
                    </div>
                  </a>
                </div>
              </article>
              <article class="prd-item soldout">
                <div class="img-container">
                  <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01.jpg&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01-h.jpg&quot;}" alt="부여 군밤용 단택알밤 1kg(대)">
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
                    <h4 class="prd-item-tit">부여 군밤용 단택알밤 1kg(대)</h4>
                    <div class="prd-item-price">
                      <div class="price"><span>3,480</span><small>원</small></div>
                      <div class="price-org">3,480원</div>
                    </div>
                    <div class="prd-item-label">
                      <span class="prd-label mu">무농약</span>
                      <span class="prd-label ha">한정수량</span>
                    </div>
                  </a>
                </div>
              </article>
              <article class="prd-item">
                <div class="img-container">
                  <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-06.jpg" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01.jpg&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01-h.jpg&quot;}" alt="제주 구좌당근 500g">
                  </a>
                  <div class="prd-item-buttons">
                    <a href="javascript:void(0)" onclick="$('#modalBuyOption').modal('show')" class="btn btn-cart"><i class="wn-icon wni-cart-w">장바구니</i></a>
                  </div>
                </div>
                <div class="detail">
                  <a href="#">
                    <h4 class="prd-item-tit">제주 구좌당근 500g</h4>
                    <div class="prd-item-price">
                      <div class="price"><span>3,480</span><small>원</small></div>
                      <div class="price-org">4,800원</div>
                    </div>
                    <div class="prd-item-label">
                      <span class="prd-label mu">무항생제</span>
                    </div>
                  </a>
                </div>
              </article>
              <article class="prd-item">
                <div class="img-container">
                  <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-03.jpg" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01.jpg&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01-h.jpg&quot;}" alt="제품명제품명 2줄까지만 표시되게 하기">
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
                    <h4 class="prd-item-tit">제품명제품명 2줄까지만 표시되게 하기</h4>
                    <div class="prd-item-price">
                      <div class="price"><span>3,480</span><small>원</small></div>
                      <div class="price-org">4,800원</div>
                    </div>
                    <div class="prd-item-label">
                      <span class="prd-label yu">유기가공</span>
                      <span class="prd-label sp">특가상품</span>
                    </div>
                  </a>
                </div>
              </article>
              <article class="prd-item">
                <div class="img-container">
                  <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-01.jpg" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01.jpg&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01-h.jpg&quot;}" alt="제주 구좌당근 500g">
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
                    <h4 class="prd-item-tit">제주 구좌당근 500g</h4>
                    <div class="prd-item-price">
                      <div class="price"><span>3,480</span><small>원</small></div>
                      <div class="price-org">4,800원</div>
                    </div>
                    <div class="prd-item-label">
                      <span class="prd-label ga">GMP</span>
                    </div>
                  </a>
                </div>
              </article>
              <article class="prd-item">
                <div class="img-container">
                  <a href="WN_PB_MO_GDS_020201.html" class="prd-item-img">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" data-src="{&quot;v&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01.jpg&quot;, &quot;h&quot;:&quot;<%=_imgUrl %>images/uploads/prd-img-01-h.jpg&quot;}" alt="제주 구좌당근 500g">
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
                    <h4 class="prd-item-tit">제주 구좌당근 500g</h4>
                    <div class="prd-item-price">
                      <div class="price"><span>3,480</span><small>원</small></div>
                      <div class="price-org">4,800원</div>
                    </div>
                    <div class="prd-item-label">
                      <span class="prd-label mu">무농약</span>
                      <span class="prd-label ha">한정수량</span>
                    </div>
                  </a>
                </div>
              </article>
            </section>
            <hr class="spacer-bottom">
          </div>

          <div class="swiper-slide" style="width: 808px;">
            <!-- 베스트 -->
            <!-- 요즘 트랜드 #캠핑 TOP 10 -->
            <section class="se-container">
              <header class="main-sec-header mb-l">
                <h3 class="tit">요즘 트랜드 #캠핑 TOP 10</h3>
              </header>
              <div class="swiper-container swiper-ranking-b swiper-no-swiping swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper" style="transform: translate3d(-778px, 0px, 0px); transition: all 0ms ease 0s;">
                  <div class="swiper-slide swiper-slide-prev" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="ranking-flag">
                        <div class="flag-shape"></div>
                        <div class="text">1</div>
                      </div>
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide swiper-slide-active" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="ranking-flag">
                        <div class="flag-shape"></div>
                        <div class="text">2</div>
                      </div>
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide swiper-slide-next" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="ranking-flag">
                        <div class="flag-shape"></div>
                        <div class="text">3</div>
                      </div>
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="ranking-flag">
                        <div class="flag-shape"></div>
                        <div class="text">4</div>
                      </div>
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                </div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>

            <hr class="spacer-m">

            <!-- 상품랭킹 -->
            <section class="se-container">
              <header class="main-sec-header mb-l">
                <h3 class="tit">상품랭킹</h3>
              </header>
              <div class="ranking-list-a">
                <a href="#" class="ranking-item-a">
                  <div class="ranking-flag">
                    <div class="flag-shape"></div>
                    <div class="text">1</div>
                  </div>
                  <div class="img-container">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-h-01.jpg" alt="[동대산포크] 무항생제 등갈비(구이/찜용) 500g">
                  </div>
                  <div class="detail">
                    <div class="tit">[동대산포크] 무항생제 등갈비(구이/찜용) 500g</div>
                    <div class="price-wrap-format price-16">
                      <div class="price-format">3,480<small>원</small></div>
                      <div class="price-org">3,480원</div>
                    </div>
                    <div class="prd-labels">
                      <span class="prd-label mu">무농약</span>
                      <span class="prd-label gm">GMP</span>
                      <span class="prd-label sp">특가상품</span>
                    </div>
                  </div>
                </a>
                <a href="#" class="ranking-item-a">
                  <div class="ranking-flag">
                    <div class="flag-shape"></div>
                    <div class="text">2</div>
                  </div>
                  <div class="img-container">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-h-02.jpg" alt="[자연스럽] 화식(火食)한우 1등급 한우 암소 국거리(양지) 300g">
                  </div>
                  <div class="detail">
                    <div class="tit">[동대산포크] 무항생제 등갈비(구이/찜용) 500g</div>
                    <div class="price-wrap-format price-16">
                      <div class="price-format">3,480<small>원</small></div>
                      <div class="price-org">3,480원</div>
                    </div>
                    <div class="prd-labels">
                      <span class="prd-label mu">무농약</span>
                      <span class="prd-label gm">GMP</span>
                      <span class="prd-label sp">특가상품</span>
                    </div>
                  </div>
                </a>
                <a href="#" class="ranking-item-a">
                  <div class="ranking-flag">
                    <div class="flag-shape"></div>
                    <div class="text">3</div>
                  </div>
                  <div class="img-container">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-h-03.jpg" alt="[자연스럽] 화식(火食)한우 1등급 한우 암소 국거리(양지) 300g">
                  </div>
                  <div class="detail">
                    <div class="tit">[동대산포크] 무항생제 등갈비(구이/찜용) 500g</div>
                    <div class="price-wrap-format price-16">
                      <div class="price-format">3,480<small>원</small></div>
                      <div class="price-org">3,480원</div>
                    </div>
                    <div class="prd-labels">
                      <span class="prd-label mu">무농약</span>
                      <span class="prd-label gm">GMP</span>
                      <span class="prd-label sp">특가상품</span>
                    </div>
                  </div>
                </a>
              </div>
            </section>

            <!-- 코로나 예방 특집 #홈파티 TOP 10 -->
            <div class="se-key-ranking">
              <header class="px-m">
                <h3 class="hd-ml">코로나 예방 특집 #홈파티 TOP 10</h3>
              </header>
              <div class="swiper-container swiper-ranking-b swiper-no-swiping swiper-container-initialized swiper-container-horizontal">
                <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px);">
                  <div class="swiper-slide swiper-slide-active" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-02.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide swiper-slide-next" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-08.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-02.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide" style="width: 381.5px; margin-right: 10px;">
                    <a href="#" class="ranking-item-b">
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/prd-img-08.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
                      </div>
                      <div class="detail">
                        <div class="tit-row">
                          <div class="tit">[맛집키트] 채선당 프리미엄 샤브샤브</div>
                          <div class="price-wrap-format">
                            <div class="price-format price-16">3,480<small>원</small></div>
                          </div>
                        </div>
                      </div>
                    </a>
                  </div>
                </div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </div>

            <section class="se-container">
              <div class="ranking-list-a">
                <a href="#" class="ranking-item-a">
                  <div class="ranking-flag">
                    <div class="flag-shape"></div>
                    <div class="text">4</div>
                  </div>
                  <div class="img-container">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-h-01.jpg" alt="[자연스럽] 화식(火食)한우 1등급 한우 암소 국거리(양지) 300g">
                  </div>
                  <div class="detail">
                    <div class="tit">[동대산포크] 무항생제 등갈비(구이/찜용) 500g</div>
                    <div class="price-wrap-format price-16">
                      <div class="price-format">3,480<small>원</small></div>
                      <div class="price-org">3,480원</div>
                    </div>
                    <div class="prd-labels">
                      <span class="prd-label mu">무농약</span>
                      <span class="prd-label gm">GMP</span>
                      <span class="prd-label sp">특가상품</span>
                    </div>
                  </div>
                </a>
                <a href="#" class="ranking-item-a">
                  <div class="ranking-flag">
                    <div class="flag-shape"></div>
                    <div class="text">5</div>
                  </div>
                  <div class="img-container">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-h-02.jpg" alt="[자연스럽] 화식(火食)한우 1등급 한우 암소 국거리(양지) 300g">
                  </div>
                  <div class="detail">
                    <div class="tit">[동대산포크] 무항생제 등갈비(구이/찜용) 500g</div>
                    <div class="price-wrap-format price-16">
                      <div class="price-format">3,480<small>원</small></div>
                      <div class="price-org">3,480원</div>
                    </div>
                    <div class="prd-labels">
                      <span class="prd-label mu">무농약</span>
                      <span class="prd-label gm">GMP</span>
                      <span class="prd-label sp">특가상품</span>
                    </div>
                  </div>
                </a>
                <a href="#" class="ranking-item-a">
                  <div class="ranking-flag">
                    <div class="flag-shape"></div>
                    <div class="text">6</div>
                  </div>
                  <div class="img-container">
                    <img src="<%=_imgUrl %>images/uploads/prd-img-h-03.jpg" alt="[자연스럽] 화식(火食)한우 1등급 한우 암소 국거리(양지) 300g">
                  </div>
                  <div class="detail">
                    <div class="tit">[동대산포크] 무항생제 등갈비(구이/찜용) 500g</div>
                    <div class="price-wrap-format price-16">
                      <div class="price-format">3,480<small>원</small></div>
                      <div class="price-org">3,480원</div>
                    </div>
                    <div class="prd-labels">
                      <span class="prd-label mu">무농약</span>
                      <span class="prd-label gm">GMP</span>
                      <span class="prd-label sp">특가상품</span>
                    </div>
                  </div>
                </a>
              </div>
            </section>
            <hr class="spacer-bottom">
          </div>

          <div class="swiper-slide" style="width: 808px;">
            <!-- 전문관 -->
            <section>
              <div class="swiper-container swiper-dot-main swiper-container-initialized swiper-container-horizontal" id="spShopTopSwiper">
                <div class="swiper-wrapper" style="transform: translate3d(-3232px, 0px, 0px); transition: all 0ms ease 0s;"><div class="swiper-slide swiper-slide-duplicate swiper-slide-next swiper-slide-duplicate-prev" data-swiper-slide-index="2" style="width: 808px;">
                  <a href="#" class="sp-hero-banner">
                    <div class="img-container">
                      <img src="<%=_imgUrl %>images/uploads/spShopTop@2x.jpg" alt="정육점">
                    </div>
                    <div class="detail">
                      <div class="content">입맛에딱! 고기추천</div>
                      <div class="tit">정육점</div>
                    </div>
                  </a>
                </div>
                  <div class="swiper-slide swiper-slide-duplicate-active" data-swiper-slide-index="0" style="width: 808px;">
                    <a href="#" class="sp-hero-banner">
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/spShopTop@2x.jpg" alt="정육점">
                      </div>
                      <div class="detail">
                        <div class="content">입맛에딱! 고기추천</div>
                        <div class="tit">정육점</div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide" data-swiper-slide-index="1" style="width: 808px;">
                    <a href="#" class="sp-hero-banner">
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/spShopTop@2x.jpg" alt="정육점">
                      </div>
                      <div class="detail">
                        <div class="content">입맛에딱! 고기추천</div>
                        <div class="tit">정육점</div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide swiper-slide-prev swiper-slide-duplicate-next" data-swiper-slide-index="2" style="width: 808px;">
                    <a href="#" class="sp-hero-banner">
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/spShopTop@2x.jpg" alt="정육점">
                      </div>
                      <div class="detail">
                        <div class="content">입맛에딱! 고기추천</div>
                        <div class="tit">정육점</div>
                      </div>
                    </a>
                  </div>
                  <div class="swiper-slide swiper-slide-duplicate swiper-slide-active" data-swiper-slide-index="0" style="width: 808px;">
                    <a href="#" class="sp-hero-banner">
                      <div class="img-container">
                        <img src="<%=_imgUrl %>images/uploads/spShopTop@2x.jpg" alt="정육점">
                      </div>
                      <div class="detail">
                        <div class="content">입맛에딱! 고기추천</div>
                        <div class="tit">정육점</div>
                      </div>
                    </a>
                  </div></div>
                <div class="swiper-footer-in">
                  <div class="swiper-pgn-dots-main swiper-pagination-bullets"><span class="swiper-pagination-bullet swiper-pagination-bullet-active"></span><span class="swiper-pagination-bullet"></span><span class="swiper-pagination-bullet"></span></div>
                </div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>
            <ul class="sp-main-list">
              <li>
                <a href="WN_PB_MO_DSP_040201.html" class="sp-main-banner">
                  <div class="img-container">
                    <img src="<%=_imgUrl %>images/uploads/spShopMain02@2x.jpg" alt="맛집로드">
                  </div>
                  <div class="detail">
                    <h3 class="tit">맛집로드</h3>
                    <div class="content">너무 멀어서, 혹은 웨이팅이 길어서 고민했던 소문만 맛집모음</div>
                  </div>
                </a>
              </li>
              <li>
                <a href="#" class="sp-main-banner">
                  <div class="img-container">
                    <img src="<%=_imgUrl %>images/uploads/spShopMain03@2x.jpg" alt="미식쌀롱">
                  </div>
                  <div class="detail">
                    <h3 class="tit">미식쌀롱</h3>
                    <div class="content">당신에게 가장 맛있는 밥을 ‘미식쌀롱’에서 찾아보세요.</div>
                  </div>
                </a>
              </li>
              <li>
                <a href="#" class="sp-main-banner">
                  <div class="img-container">
                    <img src="<%=_imgUrl %>images/uploads/spShopMain04@2x.jpg" alt="친환경 식품관">
                  </div>
                  <div class="detail">
                    <h3 class="tit">친환경 식품관</h3>
                    <div class="content">인증받은 먹거리 중 엄선해 놓은 자연이랑 식품 </div>
                  </div>
                </a>
              </li>
            </ul>
            <hr class="spacer-bottom">
          </div>

          <div class="swiper-slide" style="width: 808px;">
            <!-- 이벤트 -->
            <section class="el-container px-m">
              <div class="form-coupon coupon-color1">
                <div class="coupon-info">
                  <h4 class="label">결제시 10% 할인</h4>
                  <div class="value">
                    <b class="extra-bold">10%</b>
                    <small>할인 쿠폰</small>
                  </div>
                  <div class="date">2020-10-19 ~ 2020-11-18</div>
                </div>
                <a class="coupon-btn t-19 bold" href="#">COUPON</a>
              </div>
              <div class="form-coupon coupon-color2">
                <div class="coupon-info">
                  <h4 class="label">결제시(배송단위별) 배송비 무료</h4>
                  <div class="value">
                    <small>배송비무료 쿠폰</small>
                  </div>
                  <div class="date">2020-10-19 ~ 2020-11-18</div>
                </div>
                <a class="coupon-btn t-19 bold" href="#">COUPON</a>
              </div>
            </section>

            <section class="mt-m px-m">
              <button class="btn-view-down" onclick="clickPrdViewMore();"><span class="label">쿠폰 더보기</span><i class="wn-icon chevron-v-16 green"></i></button>
            </section>

            <section class="el-container">
              <a href="#"><img src="<%=_imgUrl %>images/uploads/evtAttendance@2x.png" alt="출석체크 이벤트"></a>
            </section>

            <section class="el-container">
              <div class="swiper-container swiper-free swiper-mid-banner-b swiper-no-swiping swiper-container-initialized swiper-container-horizontal swiper-container-free-mode">
                <div class="swiper-wrapper" style="transform: translate3d(0px, 0px, 0px);">
                  <div class="swiper-slide swiper-slide-active">
                    <a href="#" class="mid-banner-b">
                      <img src="<%=_imgUrl %>images/uploads/midBannerB01@2x.jpg" alt="자연이랑 SNS 인증샷 이벤트">
                    </a>
                  </div>
                  <div class="swiper-slide swiper-slide-next">
                    <a href="#" class="mid-banner-b">
                      <img src="<%=_imgUrl %>images/uploads/midBannerB02@2x.jpg" alt="2020 자연이랑 김장대전">
                    </a>
                  </div>
                  <div class="swiper-slide">
                    <a href="#" class="mid-banner-b">
                      <img src="<%=_imgUrl %>images/uploads/midBannerB01@2x.jpg" alt="자연이랑 SNS 인증샷 이벤트">
                    </a>
                  </div>
                  <div class="swiper-slide">
                    <a href="#" class="mid-banner-b">
                      <img src="<%=_imgUrl %>images/uploads/midBannerB02@2x.jpg" alt="2020 자연이랑 김장대전">
                    </a>
                  </div>
                </div>
                <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
            </section>

            <section class="prm-nav-container" id="prmNavContainer">
              <nav class="prm-nav" id="prmNav">
                <div class="button-group">
                  <a href="WN_PB_MO_PRM_010101.html" class="button bt-green bt-l">기획전 전체보기</a>
                  <a href="WN_PB_MO_PRM_030100.html" class="button bt-green bt-l">이벤트 전체보기</a>
                </div>
              </nav>
            </section>

            <article class="prm-entry pt-m">
              <a href="#" class="prm-entry-banner">
                <div class="img-container">
                  <img src="<%=_imgUrl %>images/uploads/prm-banner-01.jpg" alt="유산균 챙기는 가족 건강">
                  <!-- <div class="flag">홍길동님을 위한 시크릿 기획전</div> -->
                </div>
                <div class="content">
                  <div class="label"><span class="opened">진행중</span></div>
                  <div class="date font-num">~20.09.30</div>
                </div>
              </a>
              <a href="#" class="prm-entry-banner">
                <div class="img-container">
                  <img src="<%=_imgUrl %>images/uploads/prmBanner02@2x.jpg" alt="유산균 챙기는 가족 건강">
                  <div class="flag">홍길동님을 위한 시크릿 기획전</div>
                </div>
                <div class="content">
                  <div class="label"><span class="opened">진행중</span></div>
                  <div class="date font-num">~20.09.30</div>
                </div>
              </a>
              <a href="#" class="prm-entry-banner">
                <div class="img-container">
                  <img src="<%=_imgUrl %>images/uploads/prmBanner03@2x.jpg" alt="유산균 챙기는 가족 건강">
                  <!-- <div class="flag">홍길동님을 위한 시크릿 기획전</div> -->
                </div>
                <div class="content">
                  <div class="label">
                    <span class="closed">종료</span>
                    <i class="dot"></i>
                    <span class="notice">당첨자발표</span>
                  </div>
                  <div class="date font-num">~20.09.30</div>
                </div>
              </a>
              <a href="#" class="prm-entry-banner">
                <div class="img-container">
                  <img src="<%=_imgUrl %>images/uploads/prmBanner03@2x.jpg" alt="유산균 챙기는 가족 건강">
                  <!-- <div class="flag">홍길동님을 위한 시크릿 기획전</div> -->
                </div>
                <div class="content">
                  <div class="label">
                    <span class="closed">종료</span>
                    <i class="dot"></i>
                    <span class="notice">당첨자발표</span>
                  </div>
                  <div class="date font-num">~20.09.30</div>
                </div>
              </a>
              <a href="#" class="prm-entry-banner">
                <div class="img-container">
                  <img src="<%=_imgUrl %>images/uploads/prmBanner03@2x.jpg" alt="유산균 챙기는 가족 건강">
                  <!-- <div class="flag">홍길동님을 위한 시크릿 기획전</div> -->
                </div>
                <div class="content">
                  <div class="label">
                    <span class="closed">종료</span>
                    <i class="dot"></i>
                    <span class="notice">당첨자발표</span>
                  </div>
                  <div class="date font-num">~20.09.30</div>
                </div>
              </a>
            </article>
            <div class="spacer-bottom"></div>
          </div>
        </div>
        <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div><!-- /.swiper-container -->



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
                <div class="pages"></div>
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
                  <div class="price-format">1,900<small>원</small></div>
                </div>
              </div>
              <div class="buy-option-total">
                <span class="label">합계</span>
                <span class="price-format">10,900<small>원</small></span>
              </div>
            </div>
          </div>
          <footer class="wn-modal-footer">
            <button class="button bt-l bt-gray bt-rect">바로구매</button>
            <button class="button bt-l bt-green bt-rect">장바구니</button>
          </footer>
        </div>
      </div>
    </div>
  </div>