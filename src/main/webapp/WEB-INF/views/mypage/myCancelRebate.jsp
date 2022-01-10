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
              <h1 class="page-tit text-center">취소/반품/교환 내역</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <article>
          <div class="search-filters mt-l">
            <div class="bt-select-group select-group">
              <a href="javascript:void(0)" class="button select-item active">전체</a>
              <a href="javascript:void(0)" class="button select-item">1개월</a>
              <a href="javascript:void(0)" class="button select-item">6개월</a>
              <a href="javascript:void(0)" class="button select-item">1년</a>
            </div>
            <div class="date-range-picker">
              <a href="#dpCalStart" class="btn-datepicker" data-dp-role="trigger" data-dp-modal="#modalCalStart">
                <input type="text" id="dpInputStart" value="2020-10-09" readonly="">
              </a>
              <span>~</span>
              <a href="#dpCalEnd" class="btn-datepicker" data-dp-role="trigger" data-dp-modal="#modalCalEnd">
                <input type="text" id="dpInputEnd" value="2020-10-09" readonly="">
              </a>
            </div>
            <div class="mt-s px-m">
              <a href="#" class="button bt-outline bt-green w-100">조회</a>
            </div>
            <hr class="divider-line">
            <div class="form-search">
              <div class="custom-select">
                <select>
                  <option value="">전체</option>
                  <option value="">결제완료</option>
                  <option value="">상품준비중</option>
                  <option value="">배송중</option>
                  <option value="">배송완료</option>
                </select>
              </div>
              <input type="text" class="input-text" placeholder="상품명으로 검색">
              <button class="button bt-green">검색</button>
            </div>
          </div><!-- /.search-filters -->
          <hr class="divider-top mt-20">
          <div class="content-center pt-l">
            <section class="wn-card-item">
              <header class="wn-card-header">
                <h4 class="tit">2020-08-20 주문</h4>
                <div class="add">
                  <a href="WN_PB_MO_MYP_030701.html"> <i class="wn-icon chevron-h-10 steel"></i></a>
                </div>
              </header>
              <div class="wn-card-body">
                <article class="myo-item">
                  <div class="myo-item-header">
                    <div class="state">
                      <b class="color-coral">취소완료</b>
                      <span class="color-steel font-num ml-1">2020-08-05</span>
                    </div>
                  </div>
                  <div class="myo-prd">
                    <div class="prd-thumb">
                      <div class="img-container thumb-7">
                        <div class="prd-img">
                          <img src="./images/uploads/prd-img-03.jpg" alt="자연이랑에서 품질을 보증하는 친환경 청주대추 250g">
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit">자연이랑에서 품질을 보증하는 친환경 청주대추 250g</div>
                        <div class="price-wrap">
                          <div class="price-format price-15">
                            4,430<small>원</small>
                          </div>
                          <span class="quantity">1개</span>
                        </div>
                      </div>
                    </div>
                    <div class="myo-item-buttons">
                      <a href="WN_PB_MO_MYP_030701.html" class="button bt-outline bt-gray">취소 상세보기</a>
                      <a href="#" class="button bt-outline bt-green">재구매</a>
                    </div>
                  </div>
                </article>
              </div>
            </section>
            <section class="wn-card-item">
              <header class="wn-card-header">
                <h4 class="tit">2020-08-10 주문</h4>
                <div class="add">
                  <a href="#"><i class="wn-icon chevron-h-10 steel"></i></a>
                </div>
              </header>
              <div class="wn-card-body">
                <article class="myo-item">
                  <div class="myo-item-header">
                    <div class="state">
                      <b class="color-coral">반품신청</b>
                      <span class="color-steel font-num ml-1">2020-08-05</span>
                    </div>
                  </div>
                  <div class="myo-prd">
                    <div class="prd-thumb">
                      <div class="img-container thumb-7">
                        <div class="prd-img">
                          <img src="./images/uploads/prd-img-03.jpg" alt="자연이랑에서 품질을 보증하는 친환경 청주대추 250g">
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit">자연이랑에서 품질을 보증하는 친환경 청주대추 250g</div>
                        <div class="price-wrap">
                          <div class="price-format price-15">
                            4,430<small>원</small>
                          </div>
                          <span class="quantity">1개</span>
                        </div>
                      </div>
                    </div>
                    <div class="myo-item-buttons">
                      <a href="#" class="button bt-outline bt-gray">교환/반품 상세보기</a>
                      <a href="#" class="button bt-outline bt-green">재구매</a>
                    </div>
                  </div>
                </article>
              </div>
            </section>
            <section class="wn-card-item">
              <header class="wn-card-header">
                <h4 class="tit">2020-08-10 주문</h4>
                <div class="add">
                  <a href="#"><i class="wn-icon chevron-h-10 steel"></i></a>
                </div>
              </header>
              <div class="wn-card-body">
                <article class="myo-item">
                  <div class="myo-item-header">
                    <div class="state">
                      <b class="color-coral">반품접수</b>
                      <span class="color-steel font-num ml-1">2020-08-05</span>
                    </div>
                    <div class="add">
                      <span class="color-gray font-num">반품신청 2020-08-01</span>
                    </div>
                  </div>
                  <div class="myo-prd">
                    <div class="prd-thumb">
                      <div class="img-container thumb-7">
                        <div class="prd-img">
                          <img src="./images/uploads/prd-img-03.jpg" alt="자연이랑에서 품질을 보증하는 친환경 청주대추 250g">
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit">자연이랑에서 품질을 보증하는 친환경 청주대추 250g</div>
                        <div class="price-wrap">
                          <div class="price-format price-15">
                            4,430<small>원</small>
                          </div>
                          <span class="quantity">1개</span>
                        </div>
                      </div>
                    </div>
                    <div class="myo-item-buttons">
                      <a href="#" class="button bt-outline bt-gray">교환/반품 상세보기</a>
                      <a href="#" class="button bt-outline bt-gray">회수 조회</a>
                      <a href="#" class="button bt-outline bt-green">재구매</a>
                    </div>
                  </div>
                </article>
              </div>
            </section>
            <section class="wn-card-item">
              <header class="wn-card-header">
                <h4 class="tit">2020-08-10 주문</h4>
                <div class="add">
                  <a href="#"><i class="wn-icon chevron-h-10 steel"></i></a>
                </div>
              </header>
              <div class="wn-card-body">
                <article class="myo-item">
                  <div class="myo-item-header">
                    <div class="state">
                      <b class="color-coral">반품완료</b>
                      <span class="color-steel font-num ml-1">2020-08-05</span>
                    </div>
                    <div class="add">
                      <span class="color-gray font-num">반품신청 2020-08-01</span>
                    </div>
                  </div>
                  <div class="myo-prd">
                    <div class="prd-thumb">
                      <div class="img-container thumb-7">
                        <div class="prd-img">
                          <img src="./images/uploads/prd-img-03.jpg" alt="자연이랑에서 품질을 보증하는 친환경 청주대추 250g">
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit">자연이랑에서 품질을 보증하는 친환경 청주대추 250g</div>
                        <div class="price-wrap">
                          <div class="price-format price-15">
                            4,430<small>원</small>
                          </div>
                          <span class="quantity">1개</span>
                        </div>
                      </div>
                    </div>
                    <div class="myo-item-buttons">
                      <a href="WN_PB_MO_MYP_030701.html" class="button bt-outline bt-gray">교환/반품 상세보기</a>
                      <a href="#" class="button bt-outline bt-gray">회수 조회</a>
                      <a href="#" class="button bt-outline bt-green">재구매</a>
                    </div>
                  </div>
                </article>
              </div>
            </section>
            <section class="wn-card-item">
              <header class="wn-card-header">
                <h4 class="tit">2020-08-10 주문</h4>
                <div class="add">
                  <a href="#"> <i class="wn-icon chevron-h-10 steel"></i></a>
                </div>
              </header>
              <div class="wn-card-body">
                <article class="myo-item">
                  <div class="myo-item-header">
                    <div class="state">
                      <b class="color-coral">교환신청</b>
                      <span class="color-steel font-num ml-1">2020-08-05</span>
                    </div>
                  </div>
                  <div class="myo-prd">
                    <div class="prd-thumb">
                      <div class="img-container thumb-7">
                        <div class="prd-img">
                          <img src="./images/uploads/prd-img-03.jpg" alt="자연이랑에서 품질을 보증하는 친환경 청주대추 250g">
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit">자연이랑에서 품질을 보증하는 친환경 청주대추 250g</div>
                        <div class="price-wrap">
                          <div class="price-format price-15">
                            4,430<small>원</small>
                          </div>
                          <span class="quantity">1개</span>
                        </div>
                      </div>
                    </div>
                    <div class="myo-item-buttons">
                      <a href="#" class="button bt-outline bt-gray">교환/반품 상세보기</a>
                      <a href="#" class="button bt-outline bt-green">재구매</a>
                    </div>
                  </div>
                </article>
              </div>
            </section>
            <section class="wn-card-item">
              <header class="wn-card-header">
                <h4 class="tit">2020-08-10 주문</h4>
                <div class="add">
                  <a href="#"><i class="wn-icon chevron-h-10 steel"></i></a>
                </div>
              </header>
              <div class="wn-card-body">
                <article class="myo-item">
                  <div class="myo-item-header">
                    <div class="state">
                      <b class="color-coral">교환접수</b>
                      <span class="color-steel font-num ml-1">2020-08-05</span>
                    </div>
                    <div class="add">
                      <span class="color-gray font-num">교환신청 2020-08-01</span>
                    </div>
                  </div>
                  <div class="myo-prd">
                    <div class="prd-thumb">
                      <div class="img-container thumb-7">
                        <div class="prd-img">
                          <img src="./images/uploads/prd-img-03.jpg" alt="자연이랑에서 품질을 보증하는 친환경 청주대추 250g">
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit">자연이랑에서 품질을 보증하는 친환경 청주대추 250g</div>
                        <div class="price-wrap">
                          <div class="price-format price-15">
                            4,430<small>원</small>
                          </div>
                          <span class="quantity">1개</span>
                        </div>
                      </div>
                    </div>
                    <div class="myo-item-buttons">
                      <a href="#" class="button bt-outline bt-gray">교환/반품 상세보기</a>
                      <a href="#" class="button bt-outline bt-gray">회수 조회</a>
                      <a href="#" class="button bt-outline bt-green">재구매</a>
                    </div>
                  </div>
                </article>
              </div>
            </section>
            <section class="wn-card-item">
              <header class="wn-card-header">
                <h4 class="tit">2020-08-10 주문</h4>
                <div class="add">
                  <a href="#">상세보기 <i class="wn-icon chevron-h-10 steel"></i></a>
                </div>
              </header>
              <div class="wn-card-body">
                <article class="myo-item">
                  <div class="myo-item-header">
                    <div class="state">
                      <b class="color-coral">교환완료</b>
                      <span class="color-steel font-num ml-1">2020-08-05</span>
                    </div>
                    <div class="add">
                      <span class="color-gray font-num">교환신청 2020-08-01</span>
                    </div>
                  </div>
                  <div class="myo-prd">
                    <div class="prd-thumb">
                      <div class="img-container thumb-7">
                        <div class="prd-img">
                          <img src="./images/uploads/prd-img-03.jpg" alt="자연이랑에서 품질을 보증하는 친환경 청주대추 250g">
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit">자연이랑에서 품질을 보증하는 친환경 청주대추 250g</div>
                        <div class="price-wrap">
                          <div class="price-format price-15">
                            4,430<small>원</small>
                          </div>
                          <span class="quantity">1개</span>
                        </div>
                      </div>
                    </div>
                    <div class="myo-item-buttons">
                      <a href="#" class="button bt-outline bt-gray">교환/반품 상세보기</a>
                      <a href="#" class="button bt-outline bt-gray">회수 조회</a>
                      <a href="#" class="button bt-outline bt-green">재구매</a>
                    </div>
                  </div>
                </article>
              </div>
            </section>
          </div>
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
