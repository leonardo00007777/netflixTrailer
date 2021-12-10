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
          <a href="review_home.html" class="btn-prev"><i class="wn-icon wni-arrow-left"></i></a>
          <div class="h-row">
            <div class="h-col h-tit">
              <h1 class="page-tit text-center">ì¥ë°êµ¬ë</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <section class="check-header-container">
          <header class="check-header position-fixed">
            <div class="check-toolbar px-m">
              <label class="checkbox">
                <input type="checkbox">
                <span class="label">ì ì²´ì í</span>
              </label>
              <button class="btn-remove">ì íì­ì (13)</button>
            </div>
            <hr class="spacer">
          </header>
        </section>
        <article>
          <header class="cart-summary">
            <div>
              4ê°ì§ <a href="javascript:void(0)" onclick="$('#popDeliveryCase').modal('show')">ë°°ì¡ì í</a>ì ë§ì¶° 17ê° ìíì´ ë´ê²¨ììµëë¤.
            </div>
          </header>
          <!-- ë°°ì¡ ì í ê·¸ë£¹: ìì°ë°°ì¡ -->
          <section class="cart-group cart-group-cat fold-section open">
            <header class="cart-group-header">
              <div class="wrapper c-top-trigger">
                <div class="top-row">
                  <div class="tit">
                    <label class="checkbox">
                      <input type="checkbox">
                      <div class="label">
                        <span>ìì°ë°°ì¡ìí</span>
                      </div>
                    </label>
                  </div>
                  <div class="right">
                    <div class="content">3</div>
                    <button class="btn-toggle fold-button"><i class="wn-icon chevron-v-18 fold-icon"></i></button>
                  </div>
                </div>
                <div class="bottom-row">
                  <div class="progress-bar xsmall" data-percent="71">
                  </div>
                  <div class="text add-r">
                    <div class="content"><em class="t-brown">29,000ì</em> ì¶ê° ì ë°°ì¡ë¹ ì ì½</div>
                    <div class="add">
                      <a href="#" class="btn-add">
                        <i class="icon-math plus"></i>
                        <b>ë°°ì¡ë¹ ì ì½ ìíë´ê¸°</b>
                      </a>
                    </div>
                  </div>
                </div>
              </div>
            </header>
            <div class="fold-open-show">
              <section class="cart-item-list">
                <article class="cart-item">
                  <label class="checkbox">
                    <input type="checkbox">
                    <span class="label"></span>
                  </label>
                  <div class="cart-item-content">
                    <div class="prd-thumb">
                      <div class="img-container">
                        <a href="#" class="prd-img thumb-7">
                          <img src="./images/uploads/prd-img-03.jpg" alt="ì¬ì¼í¬ì°¨êµ­ì(ì¼í°íë§)">
                        </a>
                        <div class="label-bottom sand">ì¶ê°í ì¸</div>
                      </div>
                      <div class="detail">
                        <div class="tit-wrap">
                          <div class="tit single-line">ì¬ì¼í¬ì°¨êµ­ì(ì¼í°íë§) íì¤ë¡ë§ íì¤ë¡ë§ íì¤ë¡ë§</div>
                          <button class="btn-remove"><i class="wn-icon x-16 gray"></i></button>
                        </div>
                        <footer class="prd-thumb-footer">
                          <div class="price-wrap">
                            <div class="price-org">15,000ì</div>
                            <div class="price-format price-18">
                              10,000<small>ì</small>
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
                <article class="cart-item">
                  <label class="checkbox">
                    <input type="checkbox">
                    <span class="label"></span>
                  </label>
                  <div class="cart-item-content">
                    <div class="prd-thumb">
                      <div class="img-container">
                        <a href="#" class="prd-img thumb-7">
                          <img src="./images/uploads/prd-img-03.jpg" alt="ì¬ì¼í¬ì°¨êµ­ì(ì¼í°íë§)">
                        </a>
                        <div class="label-bottom sand">ì¶ê°í ì¸</div>
                      </div>
                      <div class="detail">
                        <div class="tit-wrap">
                          <div class="tit single-line">ì¬ì¼í¬ì°¨êµ­ì(ì¼í°íë§) íì¤ë¡ë§ íì¤ë¡ë§ íì¤ë¡ë§</div>
                          <button class="btn-remove"><i class="wn-icon x-16 gray"></i></button>
                        </div>
                        <footer class="prd-thumb-footer">
                          <div class="price-wrap">
                            <div class="price-org">15,000ì</div>
                            <div class="price-format price-18">
                              10,000<small>ì</small>
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
            <footer class="cart-group-footer">
              <div class="cart-group-total-box">
                <div class="cell">
                  <div class="t-price t-price-14">119,000<small>ì</small></div>
                  <div class="label">ìíê¸ì¡ </div>
                </div>
                <div class="cell">
                  <i class="icon-math minus"></i>
                </div>
                <div class="cell">
                  <div class="t-price t-price-14">8,000<small>ì</small></div>
                  <div class="label">í ì¸ê¸ì¡</div>
                </div>
                <div class="cell">
                  <i class="icon-math plus"></i>
                </div>
                <div class="cell">
                  <div>ë¬´ë£ë°°ì¡</div>
                  <div class="label">ë°°ì¡ë¹</div>
                </div>
                <div class="cell">
                  <i class="icon-math equal"></i>
                </div>
                <div class="cell">
                  <div class="t-price t-price-14">200,000<small>ì</small></div>
                  <div class="label">ì£¼ë¬¸í©ê³</div>
                </div>
              </div>
              <div class="bottom-row">
                <a href="#" class="btn-add">
                  <i class="icon-math plus"></i>
                  <b>ë°°ì¡ë¹ ì ì½ ìíë´ê¸°</b>
                </a>
              </div>
              <div class="c-bottom-trigger"></div>
            </footer>
          </section>

          <hr class="spacer">

          <!-- ë°°ì¡ ì í ê·¸ë£¹: ìì²´ë°°ì¡ -->
          <section class="cart-group fold-section">
            <header class="cart-group-header">
              <div class="wrapper c-top-trigger">
                <div class="top-row">
                  <div class="tit">
                    <label class="checkbox">
                      <input type="checkbox">
                      <div class="label">
                        <span>ëìíì¬ ë²ì¸ ìì°ëë  ëìíì¬ ë²ì¸ ìì°ëë </span>
                      </div>
                    </label>
                    <div class="tag t-yellow">ìì²´ì§ì¡</div>
                  </div>
                  <div class="right">
                    <div class="content">3</div>
                    <button class="btn-toggle fold-button"><i class="wn-icon chevron-v-18 fold-icon"></i></button>
                  </div>
                </div>
                <div class="bottom-row">
                  <div class="progress-bar xsmall" data-percent="71">
                  </div>
                  <div class="text add-r">
                    <div class="content"><em class="t-brown">29,000ì</em> ì¶ê° ì ë°°ì¡ë¹ ì ì½</div>
                    <div class="add">
                      <a href="#" class="btn-add">
                        <i class="icon-math plus"></i>
                        <b>ë°°ì¡ë¹ ì ì½ ìíë´ê¸°</b>
                      </a>
                    </div>
                  </div>
                </div>
              </div>
            </header>
            <div class="fold-open-show">
              <section class="cart-item-list">
                <article class="cart-item">
                  <label class="checkbox">
                    <input type="checkbox">
                    <span class="label"></span>
                  </label>
                  <div class="cart-item-content">
                    <div class="prd-thumb">
                      <div class="img-container">
                        <a href="#" class="prd-img thumb-7">
                          <img src="./images/uploads/prd-img-03.jpg" alt="ì¬ì¼í¬ì°¨êµ­ì(ì¼í°íë§)">
                        </a>
                        <div class="label-bottom sand">ì¶ê°í ì¸</div>
                      </div>
                      <div class="detail">
                        <div class="tit-wrap">
                          <div class="tit single-line">ì¬ì¼í¬ì°¨êµ­ì(ì¼í°íë§) íì¤ë¡ë§ íì¤ë¡ë§ íì¤ë¡ë§</div>
                          <button class="btn-remove"><i class="wn-icon x-16 gray"></i></button>
                        </div>
                        <footer class="prd-thumb-footer">
                          <div class="price-wrap">
                            <div class="price-org">15,000ì</div>
                            <div class="price-format price-18">
                              10,000<small>ì</small>
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
            <footer class="cart-group-footer">
              <div class="cart-group-total-box">
                <div class="cell">
                  <div class="t-price t-price-14">119,000<small>ì</small></div>
                  <div class="label">ìíê¸ì¡ </div>
                </div>
                <div class="cell">
                  <i class="icon-math minus"></i>
                </div>
                <div class="cell">
                  <div class="t-price t-price-14">8,000<small>ì</small></div>
                  <div class="label">í ì¸ê¸ì¡</div>
                </div>
                <div class="cell">
                  <i class="icon-math plus"></i>
                </div>
                <div class="cell">
                  <div class="t-price t-price-14">3,000<small>ì</small></div>
                  <div class="label">ë°°ì¡ë¹</div>
                </div>
                <div class="cell">
                  <i class="icon-math equal"></i>
                </div>
                <div class="cell">
                  <div class="t-price t-price-14">200,000<small>ì</small></div>
                  <div class="label">ì£¼ë¬¸í©ê³</div>
                </div>
              </div>
              <div class="bottom-row">
                <a href="#" class="btn-add">
                  <i class="icon-math plus"></i>
                  <b>ë°°ì¡ë¹ ì ì½ ìíë´ê¸°</b>
                </a>
              </div>
              <div class="c-bottom-trigger"></div>
            </footer>
          </section>

          <hr class="spacer">

          <!-- ë°°ì¡ ì í ê·¸ë£¹: ìì²´ë°°ì¡ -->
          <section class="cart-group fold-section">
            <header class="cart-group-header">
              <div class="wrapper c-top-trigger">
                <div class="top-row">
                  <div class="tit">
                    <label class="checkbox">
                      <input type="checkbox">
                      <div class="label">
                        <span>(ì£¼)ëëì¤í</span>
                      </div>
                    </label>
                    <div class="tag t-yellow">ìì²´ì§ì¡</div>
                  </div>
                  <div class="right">
                    <div class="content">6</div>
                    <button class="btn-toggle fold-button"><i class="wn-icon chevron-v-18 fold-icon"></i></button>
                  </div>
                </div>
                <div class="bottom-row">
                  <div class="progress-bar xsmall" data-percent="71">
                  </div>
                  <div class="text add-r">
                    <div class="content"><em class="t-brown">29,000ì</em> ì¶ê° ì ë°°ì¡ë¹ ì ì½</div>
                    <div class="add">
                      <a href="#" class="btn-add">
                        <i class="icon-math plus"></i>
                        <b>ë°°ì¡ë¹ ì ì½ ìíë´ê¸°</b>
                      </a>
                    </div>
                  </div>
                </div>
              </div>
            </header>
            <div class="fold-open-show">
              <section class="cart-item-list">
                <article class="cart-item">
                  <label class="checkbox">
                    <input type="checkbox">
                    <span class="label"></span>
                  </label>
                  <div class="cart-item-content">
                    <div class="prd-thumb">
                      <div class="img-container">
                        <a href="#" class="prd-img thumb-7">
                          <img src="./images/uploads/prd-img-03.jpg" alt="ì¬ì¼í¬ì°¨êµ­ì(ì¼í°íë§)">
                        </a>
                        <div class="label-bottom sand">ì¶ê°í ì¸</div>
                      </div>
                      <div class="detail">
                        <div class="tit-wrap">
                          <div class="tit single-line">ì¬ì¼í¬ì°¨êµ­ì(ì¼í°íë§) íì¤ë¡ë§ íì¤ë¡ë§ íì¤ë¡ë§</div>
                          <button class="btn-remove"><i class="wn-icon x-16 gray"></i></button>
                        </div>
                        <footer class="prd-thumb-footer">
                          <div class="price-wrap">
                            <div class="price-org">15,000ì</div>
                            <div class="price-format price-18">
                              10,000<small>ì</small>
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
            <footer class="cart-group-footer">
              <div class="cart-group-total-box">
                <div class="cell">
                  <div class="t-price t-price-14">119,000<small>ì</small></div>
                  <div class="label">ìíê¸ì¡ </div>
                </div>
                <div class="cell">
                  <i class="icon-math minus"></i>
                </div>
                <div class="cell">
                  <div class="t-price t-price-14">8,000<small>ì</small></div>
                  <div class="label">í ì¸ê¸ì¡</div>
                </div>
                <div class="cell">
                  <i class="icon-math plus"></i>
                </div>
                <div class="cell">
                  <div class="t-price t-price-14">3,000<small>ì</small></div>
                  <div class="label">ë°°ì¡ë¹</div>
                </div>
                <div class="cell">
                  <i class="icon-math equal"></i>
                </div>
                <div class="cell">
                  <div class="t-price t-price-14">200,000<small>ì</small></div>
                  <div class="label">ì£¼ë¬¸í©ê³</div>
                </div>
              </div>
              <div class="bottom-row">
                <a href="#" class="btn-add">
                  <i class="icon-math plus"></i>
                  <b>ë°°ì¡ë¹ ì ì½ ìíë´ê¸°</b>
                </a>
              </div>
              <div class="c-bottom-trigger"></div>
            </footer>
          </section>

          <hr class="spacer">

          <section class="cart-total">
            <div class="content-center">
              <div class="label-content-justify">
                <h4 class="label">ì´ ì¼íê¸ì¡</h4>
                <div class="content">
                  <div class="t-price t-price-14">
                    113,900<small>ì</small>
                  </div>
                </div>
              </div>
              <div class="label-content-justify">
                <h4 class="label">ì´ í ì¸ê¸ì¡</h4>
                <div class="content">
                  <div class="t-price t-price-14">
                    - 67,400<small>ì</small>
                  </div>
                </div>
              </div>
              <div class="label-content-justify">
                <h4 class="label">ì´ ë°°ì¡ë¹</h4>
                <div class="content">
                  <div class="t-price t-price-14">
                    + 5,500<small>ì</small>
                  </div>
                </div>
              </div>
              <div class="order-total">
                <div class="label-content-justify">
                  <h4 class="label">ì´ ì£¼ë¬¸í©ê³</h4>
                  <div class="content"><b class="t-price t-price-20">52,000<small>ì</small></b></div>
                </div>
              </div>
            </div>
          </section>

          <hr class="spacer-bottom">

          <div class="button-footer-fixed">
            <a href="WN_PB_MO_ORD_020101.html" class="button bt-l bt-rect bt-green">52,000ì ê²°ì íê¸°</a>
          </div>
        </article>
      </div><!-- /.main-content -->
    </main>
  </div><!-- /.site-container -->


  <!-- íì: ë°°ì¡ì íìë´ -->
  <div class="modal wn-modal-full" id="popDeliveryCase">
    <div class="modal-dialog">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">ë°°ì¡ì í ìë´</h2>
          <button class="btn-close-modal" data-dismiss="modal">ë«ê¸°</button>
        </header>
        <div class="wn-modal-body">
          <section class="el-container px-m">
            <ul class="list-dot t-14 lh-20">
              <li>ìì°ì´ëì ë°°ì¡ ìì¤íì í¬ê² ìì°ë°°ì¡ê³¼ ìì²´ì§ì¡ ëê°ì§ ì íì´ ìì´ì!</li>
            </ul>
          </section>
          <section class="el-container px-m">
            <h3 class="hd-s mb-s">ìì°ë°°ì¡</h3>
            <ul class="list-dot t-14 lh-20">
              <li>ìì°ì´ë ê³ì½ ë¬¼ë¥ì¼í°ìì ì§ì  ë°°ì¡</li>
            </ul>
          </section>
          <section class="mt-m px-l">
            <div class="d-case-container">
              <div class="d-case-item">
                <i class="d-case-icon d-case-01"></i>
                <div class="label">ê³µê¸ì¬</div>
              </div>
              <i class="d-case-line"></i>
              <div class="d-case-item">
                <i class="d-case-icon d-case-02"></i>
                <div class="label">ë°°ì¡</div>
              </div>
              <i class="d-case-line"></i>
              <div class="d-case-item">
                <i class="d-case-icon d-case-03"></i>
                <div class="label">êµ¬ë§¤ì</div>
              </div>
            </div>
          </section>
          <section class="el-container px-m">
            <div class="px-m py-m outline bg-gray rounded-4">
              <h4 class="hd-xs mb-xs">ì¤ë ë°ì¡ìí</h4>
              <div class="t-gray t-14 lh-20">ìì°ë°°ì¡ ì¤ 13ì ì´ì  ì£¼ë¬¸ì ì¤ë ë°ë¡ ë°ì¡íë ìí</div>
            </div>
          </section>
          <section class="el-container px-m">
            <h3 class="hd-s mb-s">ìì²´ì§ì¡</h3>
            <ul class="list-dot t-14 lh-20">
              <li>ìì°ì´ë ëì  ê° ê³µê¸ì¬ê° ë°°ì¡ì ëí</li>
            </ul>
          </section>
          <section class="mt-m px-l">
            <div class="d-case-container">
              <div class="d-case-item">
                <i class="d-case-icon d-case-04"></i>
                <div class="label">ê³µê¸ì¬</div>
              </div>
              <i class="d-case-line"></i>
              <div class="d-case-item">
                <i class="d-case-icon d-case-02"></i>
                <div class="label">ë°°ì¡</div>
              </div>
              <i class="d-case-line"></i>
              <div class="d-case-item">
                <i class="d-case-icon d-case-03"></i>
                <div class="label">êµ¬ë§¤ì</div>
              </div>
            </div>
          </section>

          <hr class="spacer-bottom">

        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-rect bt-green w-100" data-dismiss="modal">íì¸</button>
        </div>
      </div>
    </div>
  </div>


  <!-- Modal - ì¬ì© ê°ë¥ ì¿ í° ì¡°í -->
  <div class="modal wn-modal-full" id="modalCoupon">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">ì¬ì© ê°ë¥ ì¿ í° ì¡°í</h2>
          <button class="btn-close-modal" data-dismiss="modal">ë«ê¸°</button>
        </header>
        <div class="wn-modal-body">
          <div class="content-center">
            <div class="checkable-group mt-l">
              <div class="checkable-item checkable-box">
                <label class="radio">
                  <input type="radio" name="radio-coupon" id="">
                  <span class="label">ê²¬ê³¼ë¥ 10% í ì¸ ì¿ í°</span>
                </label>
                <div class="sub-content">
                  2020-08-01 ~ 2020-08-31
                </div>
              </div>
              <div class="checkable-item checkable-box">
                <label class="radio">
                  <input type="radio" name="radio-coupon" id="">
                  <span class="label">ì ì²´ ìí 5% ì¿ í°</span>
                </label>
                <div class="sub-content">
                  2020-08-01 ~ 2020-08-31
                </div>
              </div>
              <div class="checkable-item checkable-box">
                <label class="radio">
                  <input type="radio" name="radio-coupon" id="">
                  <span class="label">ëì¶ 5% í ì¸ ì¿ í°</span>
                </label>
                <div class="sub-content">
                  2020-08-01 ~ 2020-08-31
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-rect bt-gray" data-dismiss="modal">ì·¨ì</button>
          <button class="button bt-l bt-rect bt-green" data-dismiss="modal">ì¿ í° ì ì©</button>
        </div>
      </div>
    </div>
  </div>

