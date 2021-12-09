<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp" %>

<body>
  <div class="site-container bg-gray">
    <header class="local-header">
      <div class="fixed-top">
        <div class="local-top">
          <a href="review_home.html" class="btn-prev"><i class="wn-icon wni-arrow-left"></i></a>
          <div class="h-row">
            <div class="h-col h-tit">
              <h1 class="page-tit text-center">타임라인</h1>
            </div>
            <div class="h-col h-menu">
              <div class="global-top-menu">
                <a href="#" class="menu-item">
                  <div class="label-icon">
                    <i class="wn-icon trash-20"></i>
                    <div class="label">전체삭제</div>
                  </div>
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <section class="nav-scroll-container pt-20 pb-15">
          <nav class="nav-scroll">
            <ul class="nav-item-list">
              <li class="nav-item">
                <label class="checkbox-pill">
                  <input type="checkbox" hidden checked>
                  <div class="label"><span class="text">상품</span></div>
                </label>
              </li>
              <li class="nav-item">
                <label class="checkbox-pill">
                  <input type="checkbox" hidden checked>
                  <div class="label"><span class="text">카테고리</span></div>
                </label>
              </li>
              <li class="nav-item">
                <label class="checkbox-pill">
                  <input type="checkbox" hidden checked>
                  <div class="label"><span class="text">이벤트</span></div>
                </label>
              </li>
              <li class="nav-item">
                <label class="checkbox-pill">
                  <input type="checkbox" hidden checked>
                  <div class="label"><span class="text">검색</span></div>
                </label>
              </li>
            </ul>
          </nav>
        </section>
        <div class="mt-m"></div>
        <section class="timeline-group">
          <header class="timeline-group-header">
            <h3 class="tit hd-l">오늘<small>9/30</small></h3>
          </header>
          <ul class="timeline-list">
            <li>
              <i class="timeline-icon prd"></i>
              <a href="#" class="timeline-item">
                <div class="detail">
                  <div class="tit">두부스테이크 1200g</div>
                  <div class="price-format">3,480<small>원</small></div>
                </div>
                <div class="img-container">
                  <div class="prd-img thumb-6">
                    <img src="<%=_imgUrl %>/images/uploads/prd-img-03.jpg" alt="두부스테이크 1200g">
                  </div>
                </div>
              </a>
            </li>
            <li>
              <i class="timeline-icon cate"></i>
              <a href="#" class="timeline-item">
                <div class="detail">
                  <div class="tit">리빙/반려 &gt; 뷰티용품</div>
                </div>
                <div class="img-container">
                  <div class="text-outline">카테고리</div>
                </div>
              </a>
            </li>
            <li>
              <i class="timeline-icon event"></i>
              <a href="#" class="timeline-item">
                <div class="detail">
                  <div class="tit">
                    하루 세끼 모두 꿀조합!
                    <br>
                    자연이랑 MD 3끼
                  </div>
                </div>
                <div class="img-container">
                  <div class="img-square thumb-6">
                    <div class="img-crop" style="background-image: url(./images/uploads/prd-img-02.jpg);"></div>
                  </div>
                </div>
              </a>
            </li>
            <li>
              <i class="timeline-icon prd"></i>
              <a href="#" class="timeline-item">
                <div class="detail">
                  <div class="tit">두부스테이크 1200g 두줄두 줄 두줄 두줄</div>
                  <div class="price-format">3,480<small>원</small></div>
                </div>
                <div class="img-container">
                  <div class="prd-img thumb-6">
                    <img src="<%=_imgUrl %>/images/uploads/prd-img-03.jpg" alt="두부스테이크 1200g">
                  </div>
                </div>
              </a>
            </li>
            <li>
              <i class="timeline-icon search"></i>
              <a href="#" class="timeline-item">
                <div class="detail">
                  <div class="tit">두부</div>
                </div>
                <div class="img-container">
                  <div class="text-outline">검색</div>
                </div>
              </a>
            </li>
          </ul>
        </section>
        <section class="timeline-group">
          <header class="timeline-group-header">
            <h3 class="tit hd-l">화<small>9/29</small></h3>
          </header>
          <ul class="timeline-list">
            <li>
              <i class="timeline-icon prd"></i>
              <a href="#" class="timeline-item">
                <div class="detail">
                  <div class="tit">두부스테이크 1200g</div>
                  <div class="price-format">3,480<small>원</small></div>
                </div>
                <div class="img-container">
                  <div class="prd-img thumb-6">
                    <img src="<%=_imgUrl %>/images/uploads/prd-img-03.jpg" alt="두부스테이크 1200g">
                  </div>
                </div>
              </a>
            </li>
            <li>
              <i class="timeline-icon cate"></i>
              <a href="#" class="timeline-item">
                <div class="detail">
                  <div class="tit">리빙/반려 &gt; 뷰티용품</div>
                </div>
                <div class="img-container">
                  <div class="text-outline">카테고리</div>
                </div>
              </a>
            </li>
          </ul>
        </section>
        <section class="timeline-group">
          <header class="timeline-group-header">
            <h3 class="tit hd-l">월<small>9/28</small></h3>
          </header>
          <ul class="timeline-list">
            <li>
              <i class="timeline-icon event"></i>
              <a href="#" class="timeline-item">
                <div class="detail">
                  <div class="tit">
                    하루 세끼 모두 꿀조합!
                    <br>
                    자연이랑 MD 3끼
                  </div>
                </div>
                <div class="img-container">
                  <div class="img-square thumb-6">
                    <div class="img-crop" style="background-image: url(./images/uploads/prd-img-02.jpg);"></div>
                  </div>
                </div>
              </a>
            </li>
            <li>
              <i class="timeline-icon prd"></i>
              <a href="#" class="timeline-item">
                <div class="detail">
                  <div class="tit">두부스테이크 1200g 두줄두 줄 두줄 두줄</div>
                  <div class="price-format">3,480<small>원</small></div>
                </div>
                <div class="img-container">
                  <div class="prd-img thumb-6">
                    <img src="<%=_imgUrl %>/images/uploads/prd-img-03.jpg" alt="두부스테이크 1200g">
                  </div>
                </div>
              </a>
            </li>
          </ul>
        </section>
        <hr class="spacer-bottom">
      </div>
      <!-- /.main-content -->
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
        <li class="gbm-item active">
          <a href="WN_PB_MO_COM_030501.html">
            <i class="wn-icon wni-history"></i>
            <i class="badge"></i>
          </a>
        </li>
        <li class="gbm-item">
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
          <a href="WN_PB_MO_MYP_000100.html">
            <i class="wn-icon wni-user"></i>
          </a>
        </li>
      </ul>
    </div>
  </div><!-- /.site-container -->


  <script src="<%=_libUrl %>/jquery/jquery.min.js"></script>
  <script src="<%=_libUrl %>/jquery/jquery-ui.min.js"></script>
  <script src="<%=_libUrl %>/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="<%=_libUrl %>/swiper/swiper-bundle.min.js"></script>
  <script src="<%=_libUrl %>/waypoints/jquery.waypoints.min.js"></script>
  <script src="<%=_libUrl %>/waypoints/shortcuts/sticky.min.js"></script>

  <script src="<%=_jsUrl %>/ui.js"></script>
  <script src="<%=_jsUrl %>/main.js"></script>

</body>

</html>
