<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

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
              <h1 class="page-tit text-center">마이자연이랑</h1>
            </div>
            <div class="h-col h-menu">
              <div class="global-top-menu">
		          <a href="javascript:void(0)" class="menu-item"  id="gnbBtnCart">
		            <i class="wn-icon wni-cart">장바구니</i>
		            <span class="num-badge">9</span>
		          </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <article>
          <section class="pt-xl pb-30 bg-gray">
            <div class="content-center">
              <h2 class="hd-l">
                자연이랑에서
                <br>
                다양한 서비스와 혜택을
                <br>
                즐겨보세요!
              </h2>
              <header class="header-add-r mt-xl">
                <h3 class="hd-s">신규고객 가입 축하 이벤트</h3>
                <div class="add">
                  <a href="#" class="t-13 d-inline-flex">
                    <b>혜택보기</b>
                    <i class="wn-icon bt-chevron-h-xs ml-2"></i>
                  </a>
                </div>
              </header>
              <ul class="join-event-list mt-m">
                <li>
                  <div class="join-event-item">
                    <div class="icon-container">
                      <i class="wn-icon join-point"></i>
                    </div>
                    <div class="label">신규가입 시 최대<br> 5,000포인트 적립</div>
                  </div>
                </li>
                <li>
                  <div class="join-event-item">
                    <div class="icon-container">
                      <i class="wn-icon join-gift"></i>
                    </div>
                    <div class="label">자연이랑의<br> 첫 구매 선물</div>
                  </div>
                </li>
                <li>
                  <div class="join-event-item">
                    <div class="icon-container">
                      <i class="wn-icon join-coupon"></i>
                    </div>
                    <div class="label">첫 상품평 쓰면<br> 3,000포인트 적립</div>
                  </div>
                </li>
              </ul>
              <div class="button-group mt-30" id="joinMemberGroup">
<!--                 <a href="WN_PB_MO_MEM_010000.html" class="button bt-green bt-l">회원가입</a>
                <a href="WN_PB_MO_MYP_000100.html" class="button bt-green bt-l">로그인</a> -->
		        	<button class="button bt-green bt-l"  id="btnJoinMember">
		        	    회원가입
			        </button>
		        	<button class="button bt-green bt-l"  id="btnLogin">
		        	    로그인
			        </button>
              </div>
            </div>
          </section>

          <!-- 고객센터 -->
          <section class="myp-se-container">
            <header class="myp-se-header">
              <h3 class="hd-s">고객센터</h3>
            </header>
            <ul class="myp-menu-list">
              <li>
                <a href="WN_PB_MO_MYP_050101.html" class="myp-menu-item">
                  <span class="tit">공지사항</span>
                  <div class="right">
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
              <li>
                <a href="WN_PB_MO_MYP_050201.html" class="myp-menu-item">
                  <span class="tit">자주찾는 질문</span>
                  <div class="right">
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
              <li>
                <a href="#" class="myp-menu-item">
                  <span class="tit">풍성한 가입 혜택</span>
                  <div class="right">
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
              <li>
                <a href="#" class="myp-menu-item">
                  <span class="tit">멤버십 안내</span>
                  <div class="right">
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
            </ul>
          </section>

          <hr class="spacer">

          <!-- 설정 -->
          <section class="myp-se-container">
            <ul class="myp-menu-list">
              <li>
                <a href="WN_PB_MO_MYP_060100.html" class="myp-menu-item">
                  <span class="tit">설정</span>
                  <div class="right">
                    <div class="content t-green">앱 버전 1.35</div>
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
            </ul>
          </section>

          <section class="pt-30 px-m bg-gray-2">
            <div>
              <a href="#" class="button bt-outline bt-steel bt-transparent d-block">자연이랑 APP 다운로드 <i
                  class="wn-icon-16 down-16 ml-2"></i></a>
            </div>

            <hr class="spacer-bottom">
          </section>

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
          <a href="review_home.html">
            <i class="wn-icon wni-home"></i>
          </a>
        </li>
        <li class="gbm-item">
          <a href="WN_PB_MO_COM_030501.html">
            <i class="wn-icon wni-history"></i>
          </a>
        </li>
        <li class="gbm-item active">
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
          <a href="WN_PB_MO_MYP_000200.html">
            <i class="wn-icon wni-user"></i>
          </a>
        </li>
      </ul>
    </div>
  </div><!-- /.site-container -->
