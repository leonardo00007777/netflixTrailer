<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp"
%>

<body class="page-home header-float">
  <div class="site-container">
    <header class="global-header" id="global-header">
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
            <a href="#" class="menu-item">
              <i class="wn-icon wni-cart">장바구니</i>
              <span class="num-badge"></span>
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
              
	    			<c:choose>
			        	<c:when test="${fn:length(swiperBannerInfo) == 0}">
			            	<tr>
			            		<td colspan="4" align="center">
			            			조회결과가 없습니다.
			            		</td>
			            	</tr>
			           	</c:when>
			           	<c:otherwise>
			            	<c:forEach var="gdInfo" items="${swiperBannerInfo}" varStatus="status">
				                <div class="swiper-slide">
				                  <a href="#"><img src="<%=_imgUrl %>/images/uploads/"${gdInfo.gdimg}"   alt="상품이미지"></a>
				                </div>
				                
				                
						    </c:forEach>
			           	</c:otherwise> 
			    	</c:choose>
                
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
                <li class="menu-item active"><a href="javascript:void(0);" onclick="javascript:location.href='/main/main'"><span class="tit">메인</span></a></li>
                <li class="menu-item"><a href="javascript:void(0);" onclick="javascript:location.href='/main/newprdlist'"><span class="tit">신상품</span></a></li>
                <li class="menu-item"><a href="javascript:void(0);" onclick="javascript:location.href='/main/dcprdlist'"><span class="tit">할인관</span></a></li>
                <li class="menu-item"><a href="javascript:void(0);" onclick="javascript:location.href='/main/bestprdlist'"><span class="tit">베스트</span></a></li>
                <li class="menu-item"><a href="javascript:void(0);" onclick="javascript:location.href='/main/proprdlist'"><span class="tit">전문관</span></a></li>
                <li class="menu-item"><a href="javascript:void(0);" onclick="javascript:location.href='/main/eventprdlist'"><span class="tit">이벤트</span></a></li>
              </ul>
            </div>
          </div>
        </section>

        <div class="swiper-container" id="globalNavSwiper">
          <div class="swiper-wrapper">
            <div class="swiper-slide">
              <!-- 메인 -->
              <!-- MD 추천상품 B ------------------------- -->
              <section class="com-new-items-b">
                <header class="main-sec-header">
                  <h3 class="tit"><span class="semi-bold">MD</span> 추천상품</h3>
                  <div class="add-r">
                    <a href="#" class="btn-all-chevron" title="전체보기"></a>
                  </div>
                </header>
                
                <div class="swiper-container swiper-prd-2n swiper-no-swiping">
                  <div class="swiper-wrapper">
                  
                  <!-- MD 추천상품 1 : swiper-slide   start	 ------------------------- -->
<%-- 		    			<c:choose>
				        	<c:when test="${fn:length(swiperBannerInfo) == 0}">
				            	<tr>
				            		<td colspan="4" align="center">
				            			조회결과가 없습니다.
				            		</td>
				            	</tr>
				           	</c:when>
				           	<c:otherwise>
				            	<c:forEach var="gdInfo" items="${swiperBannerInfo}" varStatus="status">
					                <div class="swiper-slide">
					                  <a href="#"><img src="<%=_imgUrl %>/images/uploads/"${gdInfo.gdimg}"   alt="상품이미지"></a>
					                </div>
							    </c:forEach>
				           	</c:otherwise> 
				    	</c:choose> --%>
				    	                  
                    <div class="swiper-slide">
                      <article class="prd-item">
                      
                        <div class="img-container">
                          <a href="#" class="prd-item-img">
                            <img src="<%=_imgUrl %>/images/uploads/prd-img-08.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                    <!-- MD 추천상품 1 : swiper-slide   end	 ------------------------- -->     
                  
                  </div>
                  <div class="swiper-pgn-dots-sub"></div>
                </div> <!--  swiper-container swiper-prd-2n swiper-no-swiping -->
              </section>

              <!-- 오늘의 특가 B1 ------------------------- -->
              <section class="com-today-price-b" data-aos="fade-up">
                <header class="today-price-header">
                  <div class="tit-top">할인받고 겟!</div>
                  <h3 class="tit">오늘의 특가</h3>
                </header>
                <div class="swiper-container swiper-dot-sub swiper-today-price-b">
                  <div class="swiper-wrapper">
                    <div class="swiper-slide">
                      <a href="#" class="today-price-item-b">
                        <div class="visual-wrapper">
                          <div class="today-price-progress" data-percent="60">
                            <div class="today-price-circle-bg"></div>
                            <div class="today-price-circle-bar"></div>
                          </div>
                          <div class="img-container">
                            <div class="prd-img" style="background-image: url('<%=_imgUrl %>/images/uploads/prd-img-07.jpg');"
                              title="[채움] 유기농 노니 30입">
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
                  <div class="swiper-pgn-dots-sub"></div>
                </div>
              </section>

              <!-- 전문관 C5 ------------------------- -->
              <section class="com-sp-shop-c5" data-aos="fade-up">
                <header class="main-sec-header">
                  <h3 class="tit">자연이랑 <span class="semi-bold">PICK</span></h3>
                  <div class="add-r">
                    <a href="#" class="btn-all-chevron" title="전체보기"></a>
                  </div>
                </header>


                <div class="swiper-container swiper-sp-shop-c5 swiper-no-swiping">
                  <div class="swiper-wrapper">
                    <div class="swiper-slide">
                      <a href="#" class="sp-shop-banner-c5">
                        <img src="<%=_imgUrl %>/images/uploads/spShopBannerC5-01@2x.png" alt="일상적미식">
                      </a>
                    </div>
                    <div class="swiper-slide">
                      <a href="#" class="sp-shop-banner-c5">
                        <img src="<%=_imgUrl %>/images/uploads/spShopBannerC5-02@2x.png" alt="자연에서본">
                      </a>
                    </div>
                    <div class="swiper-slide">
                      <a href="#" class="sp-shop-banner-c5">
                        <img src="<%=_imgUrl %>/images/uploads/spShopBannerC5@2x.jpg" alt="자연's LOVE">
                      </a>
                    </div>
                  </div>
                </div>
              </section>

              <!-- 중간배너 A ------------------------- -->
              <section class="com-mid-banner" data-aos="fade-up">
                <a href="#" class="mid-banner-a">
                  <img src="<%=_imgUrl %>/images/uploads/midBannerA@2x.jpg" alt="딱 3일간 회원님들께 드리는 깜짝 쿠폰팩을 받으세요!">
                </a>
              </section>

              <!-- 기획전 A1 ------------------------- -->
              <section class="com-plan-shop-a1" data-aos="fade-up">
                <header class="main-sec-header">
                  <h3 class="tit">제철의 맛</h3>
                  <div class="add-r">
                    <a href="#" class="btn-all-chevron" title="전체보기"></a>
                  </div>
                </header>
                <div class="swiper-container swiper-dot-sub swiper-plan-shop-a2 swiper-no-swiping">
                  <div class="swiper-wrapper">
                    <div class="swiper-slide">
                      <a href="#" class="plan-shop-banner-a1">
                        <div class="img-container">
                          <img src="<%=_imgUrl %>/images/uploads/planShopBannerA101@2x.jpg" alt="부산 명물 대저 토마토">
                        </div>
                        <div class="detail">
                          <div class="content">
                            <div data-swiper-parallax="-200">
                              <div class="tag">#단짠의 완벽한 조화</div>
                              <div class="tit">부산 명물 대저 토마토</div>
                              <div class="desc">바다의 염분을 머금어 짭짤한 맛이 나는 대저 토마토</div>
                            </div>
                          </div>
                          <i class="wn-icon chevron-h-20"></i>
                        </div>
                      </a>
                    </div>
                    <div class="swiper-slide">
                      <a href="#" class="plan-shop-banner-a1">
                        <div class="img-container">
                          <img src="<%=_imgUrl %>/images/uploads/planShopBannerA101@2x.jpg" alt="부산 명물 대저 토마토">
                        </div>
                        <div class="detail">
                          <div class="content">
                            <div data-swiper-parallax="-200">
                              <div class="tag">#단짠의 완벽한 조화</div>
                              <div class="tit">부산 명물 대저 토마토</div>
                              <div class="desc">바다의 염분을 머금어 짭짤한 맛이 나는 대저 토마토</div>
                            </div>
                          </div>
                          <i class="wn-icon chevron-h-20"></i>
                        </div>
                      </a>
                    </div>
                    <div class="swiper-slide">
                      <a href="#" class="plan-shop-banner-a1">
                        <div class="img-container">
                          <img src="<%=_imgUrl %>/images/uploads/planShopBannerA101@2x.jpg" alt="부산 명물 대저 토마토">
                        </div>
                        <div class="detail">
                          <div class="content">
                            <div data-swiper-parallax="-200">
                              <div class="tag">#단짠의 완벽한 조화</div>
                              <div class="tit">부산 명물 대저 토마토</div>
                              <div class="desc">바다의 염분을 머금어 짭짤한 맛이 나는 대저 토마토</div>
                            </div>
                          </div>
                          <i class="wn-icon chevron-h-20"></i>
                        </div>
                      </a>
                    </div>
                  </div>
                  <div class="swiper-pgn-dots-sub"></div>
                </div>
              </section>

              <!-- 전문관 A3 ------------------------- -->
              <section class="com-sp-shop-a3" data-aos="fade-up">
                <header class="main-sec-header">
                  <h3 class="tit">자연이랑 전문관</h3>
                  <div class="add-r">
                    <a href="#" class="btn-all-chevron" title="전체보기"></a>
                  </div>
                </header>
                <div class="swiper-container swiper-sp-shop-group swiper-no-swiping">
                  <div class="swiper-wrapper">
                    <div class="swiper-slide">
                      <article class="sp-shop-group">
                        <a href="#" class="sp-shop-banner-a3">
                          <div class="img-container">
                            <img src="<%=_imgUrl %>/images/uploads/spShopA3lg@2x.jpg" alt="미식쌀롱">
                          </div>
                          <div class="detail" data-swiper-parallax="-200">
                            <div class="tit">미식쌀롱</div>
                            <div class="desc">취향저격 쌀집</div>
                          </div>
                        </a>
                        <div class="swiper-container swiper-sp-shop-thumb-a3 swiper-no-swiping">
                          <div class="swiper-wrapper">
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">취향쌀롱</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">토종쌀롱</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">당일쌀롱</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">당일쌀롱2</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">당일쌀롱3</div>
                                </div>
                              </a>
                            </div>
                          </div>
                        </div>
                      </article>
                    </div>
                    <div class="swiper-slide">
                      <article class="sp-shop-group">
                        <a href="#" class="sp-shop-banner-a3">
                          <div class="img-container">
                            <img src="<%=_imgUrl %>/images/uploads/spShopA3lg@2x.jpg" alt="미식쌀롱">
                          </div>
                          <div class="detail" data-swiper-parallax="-200">
                            <div class="tit">미식쌀롱</div>
                            <div class="desc">취향저격 쌀집</div>
                          </div>
                        </a>
                        <div class="swiper-container swiper-sp-shop-thumb-a3 swiper-no-swiping">
                          <div class="swiper-wrapper">
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">취향쌀롱</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">토종쌀롱</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">당일쌀롱</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">당일쌀롱2</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">당일쌀롱3</div>
                                </div>
                              </a>
                            </div>
                          </div>
                        </div>
                      </article>
                    </div>
                    <div class="swiper-slide">
                      <article class="sp-shop-group">
                        <a href="#" class="sp-shop-banner-a3">
                          <div class="img-container">
                            <img src="<%=_imgUrl %>/images/uploads/spShopA3lg@2x.jpg" alt="미식쌀롱">
                          </div>
                          <div class="detail" data-swiper-parallax="-200">
                            <div class="tit">미식쌀롱</div>
                            <div class="desc">취향저격 쌀집</div>
                          </div>
                        </a>
                        <div class="swiper-container swiper-sp-shop-thumb-a3 swiper-no-swiping">
                          <div class="swiper-wrapper">
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">취향쌀롱</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">토종쌀롱</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">당일쌀롱</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm02@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">당일쌀롱2</div>
                                </div>
                              </a>
                            </div>
                            <div class="swiper-slide">
                              <a href="#" class="sp-shop-thumb-a3">
                                <div class="img-container">
                                  <img src="<%=_imgUrl %>/images/uploads/spShopA3sm01@2x.jpg" alt="행복한 젖소의 유기농 우유 생산지_범산목장 이야기">
                                </div>
                                <div class="detail">
                                  <div class="tit">당일쌀롱3</div>
                                </div>
                              </a>
                            </div>
                          </div>
                        </div>
                      </article>
                    </div>
                  </div><!-- .swiper-wrapper -->
                  <div class="swiper-pgn-dots-sub"></div>
                </div><!-- /.swiper-sp-shop-group -->
              </section>

              <!-- 신상품 B ------------------------- -->
              <section class="com-new-items-b" data-aos="fade-up">
                <header class="main-sec-header">
                  <h3 class="tit">신상품</h3>
                  <div class="add-r">
                    <a href="#" class="btn-all-chevron" title="전체보기"></a>
                  </div>
                </header>
                <div class="swiper-container swiper-prd-2n">
                  <div class="swiper-wrapper">
                    <div class="swiper-slide">
                      <article class="prd-item">
                        <div class="img-container">
                          <a href="#" class="prd-item-img">
                            <img src="<%=_imgUrl %>/images/uploads/prd-img-05.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                    <div class="swiper-slide">
                      <article class="prd-item">
                        <div class="img-container">
                          <a href="#" class="prd-item-img">
                            <img src="<%=_imgUrl %>/images/uploads/prd-img-03.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                    <div class="swiper-slide">
                      <article class="prd-item">
                        <div class="img-container">
                          <a href="#" class="prd-item-img">
                            <img src="<%=_imgUrl %>/images/uploads/prd-img-05.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                    <div class="swiper-slide">
                      <article class="prd-item">
                        <div class="img-container">
                          <a href="#" class="prd-item-img">
                            <img src="<%=_imgUrl %>/images/uploads/prd-img-03.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                  <div class="swiper-pgn-dots-sub"></div>
                </div>
              </section>

              <!-- MD 추천상품 B ------------------------- -->
              <section class="com-new-items-b" data-aos="fade-up">
                <header class="main-sec-header">
                  <h3 class="tit">이 상품 어때요?</h3>
                  <div class="add-r">
                    <a href="#" class="btn-all-chevron" title="전체보기"></a>
                  </div>
                </header>
                <div class="swiper-container swiper-prd-2n">
                  <div class="swiper-wrapper">
                    <div class="swiper-slide">
                      <article class="prd-item">
                        <div class="img-container">
                          <a href="#" class="prd-item-img">
                            <img src="<%=_imgUrl %>/images/uploads/prd-img-08.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                    <div class="swiper-slide">
                      <article class="prd-item">
                        <div class="img-container">
                          <a href="#" class="prd-item-img">
                            <img src="<%=_imgUrl %>/images/uploads/prd-img-02.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                    <div class="swiper-slide">
                      <article class="prd-item">
                        <div class="img-container">
                          <a href="#" class="prd-item-img">
                            <img src="<%=_imgUrl %>/images/uploads/prd-img-08.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                    <div class="swiper-slide">
                      <article class="prd-item">
                        <div class="img-container">
                          <a href="#" class="prd-item-img">
                            <img src="<%=_imgUrl %>/images/uploads/prd-img-02.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                  <div class="swiper-pgn-dots-sub"></div>
                </div>
              </section>


               <!-- 할인상품 B ------------------------- -->
               <section class="com-new-items-b" data-aos="fade-up">
                 <header class="main-sec-header">
                   <h3 class="tit">할인상품</h3>
                   <div class="add-r">
                     <a href="#" class="btn-all-chevron" title="전체보기"></a>
                   </div>
                 </header>
                 <div class="swiper-container swiper-prd-2n">
                   <div class="swiper-wrapper">
                     <div class="swiper-slide">
                       <article class="prd-item">
                         <div class="img-container">
                           <a href="#" class="prd-item-img">
                             <img src="<%=_imgUrl %>/images/uploads/prd-img-06.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                     <div class="swiper-slide">
                       <article class="prd-item">
                         <div class="img-container">
                           <a href="#" class="prd-item-img">
                             <img src="<%=_imgUrl %>/images/uploads/prd-img-04.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                     <div class="swiper-slide">
                       <article class="prd-item">
                         <div class="img-container">
                           <a href="#" class="prd-item-img">
                             <img src="<%=_imgUrl %>/images/uploads/prd-img-06.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                     <div class="swiper-slide">
                       <article class="prd-item">
                         <div class="img-container">
                           <a href="#" class="prd-item-img">
                             <img src="<%=_imgUrl %>/images/uploads/prd-img-04.jpg" alt="마담로익 크림치즈 플레인 150g">
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
                   <div class="swiper-pgn-dots-sub"></div>
                 </div>
               </section>

               <!-- 매거진 ------------------------- -->
               <section class="com-magazine" data-aos="fade-up">
                 <a href="#">
                   <img src="<%=_imgUrl %>/images/uploads/magazineBanner@2x.jpg" alt="매거진 - 봄날의 식탁을 좋아하세요?">
                 </a>
               </section>

               <!-- 태그 ------------------------- -->
               <section class="com-tags" data-aos="fade-up">
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
               <section class="com-raking-b" data-aos="fade-up">
                 <header class="main-sec-header">
                   <h3 class="tit">금주의 야식랭킹</h3>
                   <div class="add-r">
                     <a href="#" class="btn-all-chevron" title="전체보기"></a>
                   </div>
                 </header>
                 <div class="swiper-container swiper-ranking-b swiper-no-swiping">
                   <div class="swiper-wrapper">
                     <div class="swiper-slide">
                       <a href="#" class="ranking-item-b">
                         <div class="ranking-flag">
                           <div class="flag-shape"></div>
                           <div class="text">1</div>
                         </div>
                         <div class="img-container">
                           <img src="<%=_imgUrl %>/images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
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
                     <div class="swiper-slide">
                       <a href="#" class="ranking-item-b">
                         <div class="ranking-flag">
                           <div class="flag-shape"></div>
                           <div class="text">2</div>
                         </div>
                         <div class="img-container">
                           <img src="<%=_imgUrl %>/images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
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
                     <div class="swiper-slide">
                       <a href="#" class="ranking-item-b">
                         <div class="ranking-flag">
                           <div class="flag-shape"></div>
                           <div class="text">3</div>
                         </div>
                         <div class="img-container">
                           <img src="<%=_imgUrl %>/images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
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
                     <div class="swiper-slide">
                       <a href="#" class="ranking-item-b">
                         <div class="ranking-flag">
                           <div class="flag-shape"></div>
                           <div class="text">4</div>
                         </div>
                         <div class="img-container">
                           <img src="<%=_imgUrl %>/images/uploads/prd-img-05.jpg" alt="[맛집키트] 채선당 프리미엄 샤브샤브">
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
                 </div>
               </section>

               <!-- 꾸러미 ------------------------- -->
               <section class="com-package" data-aos="fade-up">
                 <header class="main-sec-header">
                   <h3 class="tit">꾸러미</h3>
                   <div class="add-r">
                     <a href="#" class="btn-all-chevron" title="전체보기"></a>
                   </div>
                 </header>
                 <a href="#">
                   <img src="<%=_imgUrl %>/images/uploads/mainPkgA@2x.jpg" alt="일반형 상품">
                 </a>
               </section>

               <hr class="spacer-m">
            </div>
            <div class="swiper-slide"><%@ include file="/WEB-INF/views/main/newPrdList.jsp" %></div>
            <div class="swiper-slide"><%@ include file="/WEB-INF/views/main/dcPrdList.jsp" %></div>
            <div class="swiper-slide"><%@ include file="/WEB-INF/views/main/bestPrdList.jsp" %></div>
            <div class="swiper-slide"><%@ include file="/WEB-INF/views/main/proPrdList.jsp" %></div>
            <div class="swiper-slide"><%@ include file="/WEB-INF/views/main/eventPrdList.jsp" %></div>
         </div><!-- /.swiper-container -->
      	</div><!-- /.main-content -->
      
        <footer class="global-footer">
          <section class="footer-bt">
            <a href="#" class="button bt-outline bt-steel"><i class="wn-icon store-apple"></i>App Store</a>
            <a href="#" class="button bt-outline bt-steel"><i class="wn-icon store-google"></i>Play Store</a>
          </section>
          <nav class="global-footer-menu">
            <div class="wrapper">
              <div class="main-item"><a href="#">자연이랑</a></div>
              <div class="main-item"><a href="#" class="active">올바른밥상</a></div>
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
              <a class="toggle-button fold-button" href="javascript:void(0)">자연이랑 사업자 정보 <i
                  class="wn-icon bt-chevron-v-gray"></i></a>
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
      </div>
    </main>


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

  </div>
</body>
  <!-- Footer.jsp 소스참조  -->
  <!-- Footer.jsp 소스참조 Modal - Buy Option -->

  <script src="<%=_libUrl %>swiper/swiper-bundle.min.js"></script>
  <script src="<%=_jsUrl %>main/main.js"></script>
  <script src="<%=_jsUrl %>main/mainEvent.js"></script>
  