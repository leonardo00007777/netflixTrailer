<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp" %>
<c:set value="" var="title"/>
<div class="site-container">
  <header class="local-header">
    <div class="fixed-top">
      <div class="local-top">
        <a href="javascript:void(0);" onclick="history.back();" class="btn-prev"><i class="wn-icon wni-arrow-left"></i></a>
        <div class="h-row">
          <div class="h-col h-tit">
            <h1 class="page-tit text-center">장바구니</h1>
          </div>
        </div>
      </div>
    </div>
  </header>
  <main class="main-container" id="main-container">
    <div class="main-content" id="main-content">
      <section class="check-header-container">
        <header class="check-header position-fixed line-bot">
          <ul class="nav nav-tabs tab-default">
            <li class="nav-item">
              <a class="nav-link active" data-toggle="tab" href="#">장바구니 일반</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" data-toggle="tab" href="#">정기배송용 장바구니</a>
            </li>
          </ul>
          <hr class="spacer">
          <div class="check-toolbar px-m ">
            <label class="checkbox">
              <input type="checkbox">
              <span class="label">전체선택</span>
            </label>
            <button class="btn-remove">선택삭제(13)</button>
          </div>
        </header>
      </section>
      <article>
        <header class="cart-summary">
          <div>
            4가지 <a href="javascript:void(0)" onclick="$('#popDeliveryCase').modal('show')">배송유형</a>에 맞춰 17개 상품이 담겨있습니다.
          </div>
        </header>
        <c:forEach items="${cartProdList}" var="cartPrd" varStatus="i">
          <c:set value="${cartProdList[i.index - 1].scode}" var="scodePrev"/>
          <c:set value="${cartProdList[i.index + 1].scode}" var="scodeNext"/>
          <!-- 배송 유형 그룹: 자연배송 -->
            <c:if test="${cartPrd.scode ne scodePrev}">
              <section class="cart-group cart-group-cat fold-section open">
              <header class="cart-group-header">
                <div class="wrapper c-top-trigger">
                  <div class="top-row">
                    <div class="tit">
                      <label class="checkbox">
                        <input type="checkbox" onclick="cartCheckBox(this.checked(), '${cartPrd.scode}');">
                        <div class="label">
                          <span>
                            <c:choose>
                              <c:when test="${empty cartPrd.sname}">
                                자연이랑
                              </c:when>
                              <c:otherwise>
                                ${cartPrd.sname}
                              </c:otherwise>
                            </c:choose>
                          </span>
                        </div>
                      </label>
                      <c:choose>
                        <c:when test="${cartPrd.odtype eq '02'}">
                          <div class="tag t-yellow">배송일지정 주문 ${cartPrd.strDLVDT} 도착예정</div>
                        </c:when>
                        <c:when test="${cartPrd.odtype eq '12'}">
                          <div class="tag t-yellow">예약 주문, 예정된 일자에 도착예정</div>
                        </c:when>
                        <c:when test="${cartPrd.odtype eq 'PKG'}">
                          <div class="tag t-yellow">패키지</div>
                        </c:when>
                      </c:choose>
                      <div class="tag t-yellow">업체직송</div>
                    </div>
                    <div class="right">
                      <div class="content">3</div>
                      <button class="btn-toggle fold-button" value="${cartPrd.scode}"><i class="wn-icon chevron-v-18 fold-icon"></i></button>
                    </div>
                  </div>
                  <div class="bottom-row">
                    <div class="progress-bar xsmall" data-percent="71">
                    </div>
                    <div class="text add-r">
                      <div class="content"><em class="t-brown">29,000원</em> 추가 시 배송비 절약</div>
                      <div class="add">
                        <a href="#" class="btn-add">
                          <i class="icon-math plus"></i>
                          <b>배송비 절약 상품담기</b>
                        </a>
                      </div>
                    </div>
                  </div>
                </div>
              </header>
            </c:if>
          <div class="fold-open-show" data-value="${cartPrd.scode}">
            <section class="cart-item-list">
              <article class="cart-item">
                <label class="checkbox">
                  <input type="checkbox" id="check_${cartPrd.scode}">
                  <span class="label"></span>
                </label>
                <div class="cart-item-content">
                  <div class="prd-thumb">
                    <div class="img-container">
                      <a href="#" class="prd-img thumb-7">
                        <img src="<%=_imgUrl %>images/uploads/${cartPrd.gdimg}" alt="${cartPrd.gdname}">
                      </a>
                      <div class="label-bottom sand">추가할인</div>
                    </div>
                    <div class="detail">
                      <div class="tit-wrap">
                        <div class="tit single-line">${cartPrd.gdname}</div>
                        <button class="btn-remove">
                          <i class="wn-icon x-16 gray"></i>
                        </button>
                      </div>
                      <footer class="prd-thumb-footer">
                        <div class="price-wrap">
                          <div class="price-org"><fmt:formatNumber value="${cartPrd.origprice}" pattern="#,###" /></div>
                          <div class="price-format price-18">
                            <fmt:formatNumber value="${cartPrd.origprice}" pattern="#,###" /><small>원</small>
                          </div>
                        </div>
                        <div class="right">
                          <div class="input-number">
                            <button class="dec"></button>
                            <input class="num" type="text" value="1" readonly="">
                            <button class="inc"></button>
                          </div>
                        </div>
                      </footer>
                    </div>
                  </div>
                </div>
              </article>
            </section>
          </div>
          <c:if test="${cartPrd.scode ne scodeNext}">
            <footer class="cart-group-footer">
              <div class="cart-group-total-box">
                <div class="cell">
                  <div class="t-price t-price-14">
                    119,000<small>원</small>
                  </div>
                  <div class="label">상품금액</div>
                </div>
                <div class="cell">
                  <i class="icon-math minus"></i>
                </div>
                <div class="cell">
                  <div class="t-price t-price-14">8,000<small>원</small></div>
                  <div class="label">할인금액</div>
                </div>
                <div class="cell">
                  <i class="icon-math plus"></i>
                </div>
                <div class="cell">
                  <div>무료배송</div>
                  <div class="label">배송비</div>
                </div>
                <div class="cell">
                  <i class="icon-math equal"></i>
                </div>
                <div class="cell">
                  <div class="t-price t-price-14">200,000<small>원</small></div>
                  <div class="label">주문합계</div>
                </div>
              </div>
              <div class="bottom-row">
                <a href="#" class="btn-add">
                  <i class="icon-math plus"></i>
                  <b>배송비 절약 상품담기</b>
                </a>
              </div>
              <div class="c-bottom-trigger"></div>
            </footer>
            </section>
          </c:if>
        </c:forEach>
        <hr class="spacer">
        <section class="cart-total">
          <div class="content-center">
            <div class="label-content-justify">
              <h4 class="label">총 삼품금액</h4>
              <div class="content">
                <div class="t-price t-price-14">
                  113,900<small>원</small>
                </div>
              </div>
            </div>
            <div class="label-content-justify">
              <h4 class="label">총 할인금액</h4>
              <div class="content">
                <div class="t-price t-price-14">
                  - 67,400<small>원</small>
                </div>
              </div>
            </div>
            <div class="label-content-justify">
              <h4 class="label">총 배송비</h4>
              <div class="content">
                <div class="t-price t-price-14">
                  + 5,500<small>원</small>
                </div>
              </div>
            </div>
            <div class="order-total">
              <div class="label-content-justify">
                <h4 class="label">총 주문합계</h4>
                <div class="content"><b class="t-price t-price-20">52,000<small>원</small></b></div>
              </div>
            </div>
          </div>
        </section>
        <hr class="spacer-bottom">
        <div class="button-footer-fixed">
          <a href="WN_PB_MO_ORD_020101.html" class="button bt-l bt-rect bt-green">52,000원 결제하기</a>
        </div>
      </article>
    </div><!-- /.main-content -->
  </main>
</div><!-- /.site-container -->


<!-- 팝업: 배송유형안내 -->
<div class="modal wn-modal-full" id="popDeliveryCase">
  <div class="modal-dialog">
    <div class="modal-content">
      <header class="wn-modal-header">
        <h2 class="tit">배송유형 안내</h2>
        <button class="btn-close-modal" data-dismiss="modal">닫기</button>
      </header>
      <div class="wn-modal-body">
        <section class="el-container px-m">
          <ul class="list-dot t-14 lh-20">
            <li>자연이랑의 배송 시스템은 크게 자연배송과 업체직송 두가지 유형이 있어요!</li>
          </ul>
        </section>
        <section class="el-container px-m">
          <h3 class="hd-s mb-s">자연배송</h3>
          <ul class="list-dot t-14 lh-20">
            <li>자연이랑 계약 물류센터에서 직접 배송</li>
          </ul>
        </section>
        <section class="mt-m px-l">
          <div class="d-case-container">
            <div class="d-case-item">
              <i class="d-case-icon d-case-01"></i>
              <div class="label">공급사</div>
            </div>
            <i class="d-case-line"></i>
            <div class="d-case-item">
              <i class="d-case-icon d-case-02"></i>
              <div class="label">배송</div>
            </div>
            <i class="d-case-line"></i>
            <div class="d-case-item">
              <i class="d-case-icon d-case-03"></i>
              <div class="label">구매자</div>
            </div>
          </div>
        </section>
        <section class="el-container px-m">
          <div class="px-m py-m outline bg-gray rounded-4">
            <h4 class="hd-xs mb-xs">오늘 발송상품</h4>
            <div class="t-gray t-14 lh-20">자연배송 중 13시 이전 주문시 오늘 바로 발송하는 상품</div>
          </div>
        </section>
        <section class="el-container px-m">
          <h3 class="hd-s mb-s">업체직송</h3>
          <ul class="list-dot t-14 lh-20">
            <li>자연이랑 대신 각 공급사가 배송을 대행</li>
          </ul>
        </section>
        <section class="mt-m px-l">
          <div class="d-case-container">
            <div class="d-case-item">
              <i class="d-case-icon d-case-04"></i>
              <div class="label">공급사</div>
            </div>
            <i class="d-case-line"></i>
            <div class="d-case-item">
              <i class="d-case-icon d-case-02"></i>
              <div class="label">배송</div>
            </div>
            <i class="d-case-line"></i>
            <div class="d-case-item">
              <i class="d-case-icon d-case-03"></i>
              <div class="label">구매자</div>
            </div>
          </div>
        </section>

        <hr class="spacer-bottom">

      </div>
      <div class="wn-modal-footer">
        <button class="button bt-l bt-rect bt-green w-100" data-dismiss="modal">확인</button>
      </div>
    </div>
  </div>
</div>


<!-- Modal - 사용 가능 쿠폰 조회 -->
<div class="modal wn-modal-full" id="modalCoupon">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
      <header class="wn-modal-header">
        <h2 class="tit">사용 가능 쿠폰 조회</h2>
        <button class="btn-close-modal" data-dismiss="modal">닫기</button>
      </header>
      <div class="wn-modal-body">
        <div class="content-center">
          <div class="checkable-group mt-l">
            <div class="checkable-item checkable-box">
              <label class="radio">
                <input type="radio" name="radio-coupon" id="">
                <span class="label">견과류 10% 할인 쿠폰</span>
              </label>
              <div class="sub-content">
                2020-08-01 ~ 2020-08-31
              </div>
            </div>
            <div class="checkable-item checkable-box">
              <label class="radio">
                <input type="radio" name="radio-coupon" id="">
                <span class="label">전체 상품 5% 쿠폰</span>
              </label>
              <div class="sub-content">
                2020-08-01 ~ 2020-08-31
              </div>
            </div>
            <div class="checkable-item checkable-box">
              <label class="radio">
                <input type="radio" name="radio-coupon" id="">
                <span class="label">대추 5% 할인 쿠폰</span>
              </label>
              <div class="sub-content">
                2020-08-01 ~ 2020-08-31
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="wn-modal-footer">
        <button class="button bt-l bt-rect bt-gray" data-dismiss="modal">취소</button>
        <button class="button bt-l bt-rect bt-green" data-dismiss="modal">쿠폰 적용</button>
      </div>
    </div>
  </div>
</div>