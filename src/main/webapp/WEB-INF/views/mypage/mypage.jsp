<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/common/env.jsp"%>

<c:set var="_isLoginYn" value="<%=_isLoginYn %>" />
<c:choose>
   		<c:when test="${_isLoginYn eq true}">
	   		<script>
	   			// alert("_isLoginYn true ");
	   		</script>
      	</c:when>
      	<c:otherwise>
			<script>
				var redirectURL = "/member/joinmember";
				window.location.href = redirectURL;
			</script>      	
      	</c:otherwise> 
</c:choose>

<script src="<%=_jsUrl %>mypage/mypage.js"></script>

<body onload="checkAccess()">
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
                <a href="#" class="menu-item">
                  <i class="wn-icon wni-cart">장바구니</i>
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
          <section class="myp-header bg-gray">
            <div class="mem-info">
              <div class="icon-mem-lv lv-2"></div>
              <div class="content">
                <div class="mem-sk">SK하이닉스</div>
                <div class="mem-welcome"><b><%=_sessionMemNm %></b> 님, 건강한 하루 보내세요.</div>
                <div class="mem-accounts">
                  <i class="wn-icon sns-20-kko"></i>
                  <i class="wn-icon sns-20-nv"></i>
                  <i class="wn-icon sns-20-wn"></i>
                  <i class="wn-icon sns-20-fb"></i>
                </div>
              </div>
            </div>
          </section>

          <!-- 이번달 구매금액 -->
          <section class="myp-se-container se-mem-purchase fold-section ani open">
            <header class="myp-se-header">
              <h3 class="hd-s">이번달 구매금액</h3>
              <div class="ml-auto">
                <button class="fold-button"><i class="wn-icon chevron-v-24 fold-icon"></i></button>
              </div>
            </header>
            <div class="fold-open-show">
              <div class="px-m">
                <div class="mem-purchase-info">
                  <div class="mem-progress-container">
                    <!-- data-percent 등급 달성률 퍼센트 -->
                    <div class="progress-bar mem-progress-bar ani" data-percent="40">
                      <div class="pointer">
                        <div class="speech-bubble-s">
                          <div class="text">280,999<small>원</small></div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <ul class="mem-lv-list">
                    <li class="mem-lv-item lv-1">
                      <div class="top">
                        <div class="label">씨앗</div>
                        <div class="condition"></div>
                      </div>
                      <i class="mem-lv-marker active"></i>
                      <div class="bottom">
                        <div class="reward">
                          <p>0.5%</p> 적립
                        </div>
                      </div>
                    </li>
                    <li class="mem-lv-item lv-2">
                      <div class="top">
                        <div class="label">새싹</div>
                        <div class="condition"><p>15만원</p> 이상</div>
                      </div>
                      <i class="mem-lv-marker active"></i>
                      <div class="bottom">
                        <div class="reward"><p>1%</p> 적립</div>
                      </div>
                    </li>
                    <li class="mem-lv-item lv-3">
                      <div class="top">
                        <div class="label">꽃잎</div>
                        <div class="condition"><p>30만원</p> 이상</div>
                      </div>
                      <i class="mem-lv-marker next-level"></i>
                      <div class="bottom">
                        <div class="reward"><p>3%</p> 적립</div>
                      </div>
                    </li>
                    <li class="mem-lv-item lv-4">
                      <div class="top">
                        <div class="label">열매</div>
                        <div class="condition"><p>50만원</p> 이상</div>
                      </div>
                      <i class="mem-lv-marker"></i>
                      <div class="bottom">
                        <div class="reward"><p>5%</p> 적립</div>
                      </div>
                    </li>
                    <li class="mem-lv-item lv-5">
                      <div class="top">
                        <div class="label">나무</div>
                        <div class="condition"><p>100만원</p> 이상</div>
                      </div>
                      <i class="mem-lv-marker"></i>
                      <div class="bottom">
                        <div class="reward"><p>7%</p> 적립</div>
                      </div>
                    </li>
                  </ul>
                </div>
                <div class="mem-lv-result">
                  <span class="label">다음달 예상 등급</span>
                  <b class="mem-lv-color lv-3">꽃잎등급</b>
                </div>
              </div>
            </div>
          </section>

          <hr class="spacer">

          <!-- 나의 주문 -->
          <section class="myp-se-container">
            <header class="myp-se-header">
              <h3 class="hd-s">나의 주문</h3>
            </header>
            <hr class="solid-line ml-m">
            <div class="mt-25">
              <div class="d-flex justify-content-around px-m">
                <a href="WN_PB_MO_MYP_030101.html" class="myp-menu-icon">
                  <div class="icon-wrap">
                    <i class="wn-icon-50 wn-icon-50-cart"></i>
                    <span class="badge">8</span>
                  </div>
                  <div class="label">주문/배송 내역</div>
                </a>
                <a href="WN_PB_MO_MYP_030602.html" class="myp-menu-icon">
                  <div class="icon-wrap">
                    <i class="wn-icon-50 wn-icon-50-return"></i>
                    <span class="badge">8</span>
                  </div>
                  <div class="label">취소/교환/반품 내역</div>
                </a>
                <a href="WN_PB_MO_MYP_030801.html" class="myp-menu-icon">
                  <div class="icon-wrap">
                    <i class="wn-icon-50 wn-icon-50-delivery"></i>
                    <span class="badge">8</span>
                  </div>
                  <div class="label">정기배송 관리</div>
                </a>
              </div>
            </div>
          </section>

          <hr class="spacer">

          <!-- 나의 정보 -->
          <section class="myp-se-container">
            <header class="myp-se-header">
              <h3 class="hd-s">나의 정보</h3>
            </header>
            <ul class="myp-menu-list">
              <li>
                <a href="WN_PB_MO_MYP_020101.html" class="myp-menu-item">
                  <span class="tit">개인정보 관리</span>
                  <div class="right">
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
              <li>
                <a href="WN_PB_MO_MYP_020601.html" class="myp-menu-item">
                  <span clWN_PB_MO_MYP_020601.htmlass="tit">배송지 관리</span>
                  <div class="right">
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
            </ul>
          </section>

          <hr class="spacer">

          <!-- 나의 활동 -->
          <section class="myp-se-container">
            <header class="myp-se-header">
              <h3 class="hd-s">나의 활동</h3>
            </header>
            <ul class="myp-menu-list">
              <li>
                <a href="WN_PB_MO_MYP_040102.html" class="myp-menu-item">
                  <span class="tit">작성 가능한 구매후기</span>
                  <div class="right">
                    <div class="content t-green">21개</div>
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
              <li>
                <a href="WN_PB_MO_MYP_040202.html" class="myp-menu-item">
                  <span class="tit">상품 문의 내역</span>
                  <div class="right">
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
              <li>
                <a href="WN_PB_MO_MYP_040302.html" class="myp-menu-item">
                  <span class="tit">1:1 문의 내역</span>
                  <div class="right">
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
              <li>
                <a href="WN_PB_MO_MYP_040502.html" class="myp-menu-item">
                  <span class="tit">댓글 내역</span>
                  <div class="right">
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
              <li>
                <a href="WN_PB_MO_MYP_040602.html" class="myp-menu-item">
                  <span class="tit">이벤트 참여 내역</span>
                  <div class="right">
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
              <li>
                <a href="WN_PB_MO_MYP_040701.html" class="myp-menu-item">
                  <span class="tit">친구 추천하기</span>
                  <span class="t-13 t-yellow t-outline ml-3">친구가 구매시 적립포인트 혜택</span>
                  <div class="right">
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
            </ul>
          </section>

          <hr class="spacer">

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
                <a href="#" class="myp-menu-item">
                  <span class="tit">설정</span>
                  <div class="right">
                    <div class="content t-green">앱 버전 1.35</div>
                    <i class="wn-icon chevron-h-24 gray-5"></i>
                  </div>
                </a>
              </li>
            </ul>
          </section>

          <section class="pt-m px-m bg-gray-2">
            <div class="grid-2n gutter-10">
              <div class="cell">
                <a href="#" class="button bt-outline bt-green bt-transparent d-block">1:1 문의</a>
              </div>
              <div class="cell">
                <a href="#" class="button bt-outline bt-green bt-transparent d-block">실시간 채팅 상담</a>
              </div>
            </div>
            <div class="mt-10">
              <a href="#" class="button bt-outline bt-steel bt-transparent d-block">자연이랑 APP 다운로드 <i class="wn-icon-16 down-16 ml-2"></i></a>
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
