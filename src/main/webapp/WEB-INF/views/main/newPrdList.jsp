<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

                <!-- 신상품 -->
              <div class="prd-list-tools-container">
                  <div class="prd-list-tools">
                    <div class="prd-list-tags">
                      <div class="tags-wrapper swiper-container swiper-no-swiping" id="tags-swiper">
                        <div class="tags swiper-wrapper">
                          <a href="#" class="tag-item swiper-slide">전체보기</a>
                          <a href="#" class="tag-item swiper-slide">과일·견과</a>
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
                      </div>
                    </div>
                    <div class="prd-list-buttons">
                      <button class="item btn-filter" id="btn-filter" onclick="$('#modalNewPrdFilters').modal('show')"><i class="wn-icon plp-filter">필터</i></button>
                    </div>
                  </div>
                </div>
              <section class="prd-list prd-list-tile" id="newPrdList">
                <article class="prd-item">
                  <div class="img-container">
                    <a href="#" class="prd-item-img">
                      <img src="<%=_imgUrl %>/images/uploads/prd-img-01.jpg" data-src='{"v":"<%=_imgUrl %>/images/uploads/prd-img-01.jpg", "h":"<%=_imgUrl %>/images/uploads/prd-img-01-h.jpg"}' alt="제품명">
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
                    <a href="#" class="prd-item-img">
                      <img src="<%=_imgUrl %>/images/uploads/prd-img-05.jpg" data-src='{"v":"<%=_imgUrl %>/images/uploads/prd-img-01.jpg", "h":"<%=_imgUrl %>/images/uploads/prd-img-01-h.jpg"}' alt="부여 군밤용 단택알밤 1kg(대)">
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
                    <a href="#" class="prd-item-img">
                      <img src="<%=_imgUrl %>/images/uploads/prd-img-06.jpg" data-src='{"v":"<%=_imgUrl %>/images/uploads/prd-img-01.jpg", "h":"<%=_imgUrl %>/images/uploads/prd-img-01-h.jpg"}' alt="제주 구좌당근 500g">
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
                    <a href="#" class="prd-item-img">
                      <img src="<%=_imgUrl %>/images/uploads/prd-img-03.jpg" data-src='{"v":"<%=_imgUrl %>/images/uploads/prd-img-01.jpg", "h":"<%=_imgUrl %>/images/uploads/prd-img-01-h.jpg"}' alt="제품명제품명 2줄까지만 표시되게 하기">
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
                    <a href="#" class="prd-item-img">
                      <img src="<%=_imgUrl %>/images/uploads/prd-img-01.jpg" data-src='{"v":"<%=_imgUrl %>/images/uploads/prd-img-01.jpg", "h":"<%=_imgUrl %>/images/uploads/prd-img-01-h.jpg"}' alt="제주 구좌당근 500g">
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
                    <a href="#" class="prd-item-img">
                      <img src="<%=_imgUrl %>/images/uploads/prd-img-05.jpg" data-src='{"v":"<%=_imgUrl %>/images/uploads/prd-img-01.jpg", "h":"<%=_imgUrl %>/images/uploads/prd-img-01-h.jpg"}' alt="제주 구좌당근 500g">
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
              <div class="spacer-bottom"></div>