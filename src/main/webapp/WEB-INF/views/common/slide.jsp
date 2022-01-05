<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*" %>
<%@ include file="/WEB-INF/views/common/env.jsp" %>
<%-- 전체메뉴 --%>
<div id="allMenu" class="allmenu" style="" tabindex="0">
	<div id="mLnb">
		<%-- 비동기 ajax 처리 시 다음 주석처리 --%>
<%-- 		<%@ include file="/WEB-INF/jsp/common/slideMenuAjax.jsp" %> --%>
	</div>
	<% /* BI Renewal. 20190918. nobbyjin. - 닫기 버튼 위치 조정
	<button type="button" class="allmenuClose">전체 메뉴 닫기</button>
	*/ %>
</div>
<%--//전체메뉴 끝--%>

  <!-- Confirm -->
  <div class="modal fade wn-modal wn-modal-msg" id="modalConfirm" data-backdrop="static">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <div class="wn-modal-body">
          페이지 이동 시
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-m bt-gray bt-rect d-block" data-dismiss="modal">취소</button>
          <button class="button bt-l bt-green bt-rect d-block" data-dismiss="modal">확인</button>
        </div>
      </div>
    </div>
  </div>

  <!-- Alert -->
  <div class="modal fade wn-modal wn-modal-msg" id="modalAlert" data-backdrop="static">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <div class="wn-modal-body">
          상품이 장바구니에 담겼습니다
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-green bt-rect d-block" data-dismiss="modal">닫기</button>
        </div>
      </div>
    </div>
  </div>
  
  <!-- Alert - Add Text Contents -->
  <div class="modal fade wn-modal wn-modal-msg" id="modalAlertTitle" data-backdrop="static">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <h2 class="wn-modal-header">개인정보 마케팅 활용 동의</h2>
        <div class="wn-modal-body">
          2020년 7월 26일 14시40분에
          개인정보 마케팅활용에 동의 하셨습니다
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-green bt-rect d-block" data-dismiss="modal">닫기</button>
        </div>
      </div>
    </div>
  </div>
  

 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																1. 공통 (팝업)																					      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
  <!-- Modal - 무이자 할부 혜택 -->
  <div class="modal fade wn-modal" id="modalInstallment">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <h2 class="wn-modal-header">무이자 할부 혜택</h2>
        <div class="wn-modal-body">
          <div class="gray-5 t-15 lh-20">
            무이자 할부는 결제 금액 기준으로 적용됩니다.
            <br>
            일부 개월 수 제외
          </div>
          <table class="table-lined mt-s t-18">
            <thead>
              <tr>
                <th class="text-left text-nowrap">카드</th>
                <th class="text-left text-nowrap">금액기준</th>
                <th class="text-left text-nowrap">행사 개월수</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td class="text-nowrap">국민카드</td>
                <td class="text-nowrap">5만원이상</td>
                <td class="text-nowrap">2,3,4,6개월</td>
              </tr>
              <tr>
                <td class="text-nowrap">삼성카드</td>
                <td class="text-nowrap">7만원이상</td>
                <td class="text-nowrap">2,3,4개월</td>
              </tr>
            </tbody>
          </table>
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-green bt-rect d-block" data-dismiss="modal">확인</button>
        </div>
      </div>
    </div>
  </div>
  

  <!-- Modal - 마케팅  -->
  <div class="modal fade wn-marketing-popup" id="popMarketing">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="overflow-auto">
          <div class="wn-modal-body">
            <div class="swiper-container swiper-mkp">
              <div class="swiper-wrapper">
                <div class="swiper-slide">
                  <a href="#"><img src="./images/uploads/marketingPopBanner@2x.jpg" alt="정성스럽게 선별한 완도 특대 전복 1kg"></a>
                </div>
                <div class="swiper-slide">
                  <a href="#"><img src="./images/uploads/marketingPopBanner@2x.jpg" alt="정성스럽게 선별한 완도 특대 전복 1kg"></a>
                </div>
                <div class="swiper-slide">
                  <a href="#"><img src="./images/uploads/marketingPopBanner@2x.jpg" alt="정성스럽게 선별한 완도 특대 전복 1kg"></a>
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
                    <img src="./images/uploads/prd-img-01.jpg" alt="[정덕원 농부] 제주의 달콤향긋 애플망고 2kg (5~7수)">
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
                    <img src="./images/uploads/prd-img-01.jpg" alt="[정덕원 농부] 제주의 달콤향긋 애플망고 2kg (5~7수)">
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

 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																2. 메인 (팝업)																					      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
 
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																3. 회원 (팝업)																					      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
  <!-- 이용약관 팝업 -->
  <!-- 약관 메세지 + 확인 -->
  <div class="modal wn-modal-full" id="modalTerms">
    <div class="modal-dialog">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">이용약관</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
          <div class="px-m pt-l">
            <ul class="wn-accordion mb-l">
              <li class="wn-accordion-item active">
                <h4 class="wn-accordion-tit"><span class="mr-2">01</span> 목적</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">02</span>정의</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">03</span>약관 등의 명시와 설명 및 개정</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">04</span>서비스의 제공 및 변경</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">05</span>서비스의 중단</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">06</span>회원가입</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">07</span>회원 탈퇴 및 자격 상실 등</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">08</span>회원에 대한 통지</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">09</span>구매신청</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">10</span>계약의 성립</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">11</span>지급방법</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">12</span>적립포인트</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit"><span class="mr-2">13</span>할인쿠폰</h4>
                <div class="wn-accordion-content">
                  <ol class="t-12 lh-18 ol-circle">
                    <li>
                      <span class="counter-circle">①</span>
                      "자연이랑"은 다음과 같은 업무를 수행합니다.
                      1. 재화 또는 용역에 대한 정보 제공 및 구매계약의 체결.
                      2. 구매계약이 체결된 재화 또는 용역의 배송.
                      3. 기타 "자연이랑"이 정하는 업무.
                    </li>
                    <li>
                      <span class="counter-circle">②</span>
                      자연이랑"은 재화 또는 용역의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화 또는 용역의 내용을 변경할 수 있습니다. 이 경우에는 변경된
                      재화
                      또는 용역의 내용 및 제공일자를 명시하여 현재의 재화 또는 용역의 내용을 게시한 곳에 즉시 공지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">③</span>
                      "자연이랑"이 제공하기로 이용자와 계약을 체결한 서비스의 내용을 "재화 등"의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한
                      주소로 즉시
                      통지합니다.
                    </li>
                    <li>
                      <span class="counter-circle">④</span>
                      전항의 경우, "자연이랑"은 이로 인하여 이용자가 입은 손해를 배상합니다. 다만, "자연이랑"이 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.
                    </li>
                  </ol>
                </div>
              </li>
            </ul>
          </div>
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-rect bt-green">동의합니다.</button>
        </div>
      </div>
    </div>
  </div>

  <!-- Alert: SK구성원확인 실패 -->
  <!-- 메세지 +  확인 -->
  <div class="modal fade wn-modal wn-modal-msg" id="modalFailed" data-backdrop="static">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <div class="wn-modal-body">
          해당정보로 등록된 SK구성원 정보가
          <br>
          없습니다.
          <br><br>
          사내 담당자에게 문의해 주세요.
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-m bt-green bt-rect d-block" data-dismiss="modal">확인</button>
        </div>
      </div>
    </div>
  </div> 

  <!-- Confirm: 자연이랑 회원이 아닐경우 메시지 -->
  <!--   메세지 +  취소/확인 -->
  <div class="modal fade wn-modal wn-modal-msg" id="modalSnsJoin" data-backdrop="static">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <div class="wn-modal-body">
          자연이랑 회원이 아닙니다.<br>
          SNS간편 회원가입을
          진행하시겠습니까?

        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-gray  bt-rect d-block" data-dismiss="modal">취소</button>
          <button class="button bt-l bt-green bt-rect d-block" data-dismiss="modal">확인</button>
        </div>
      </div>
    </div>
  </div> 
  
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																4. 마이페이지 - (팝업)																		      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
  <!-- Alert : 쿠폰 등록 실패 (적립되었습니다 유효기간 xxx )-->
  <!-- 메세지 + 확인 -->
  <div class="modal fade wn-modal wn-modal-msg" id="alertCouponFailed" data-backdrop="static">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <div class="wn-modal-body">
          죄송합니다.<br>
          미등록 쿠폰코드 혹은<br>
          이미 등록된 쿠폰코드 입니다.
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-m bt-green bt-rect d-block" data-dismiss="modal">확인</button>
        </div>
      </div>
    </div>
  </div>
 
  <!-- Popup - 탈퇴회원 개인정보 보유기간 -->
  <!-- x 닫기 버튼  -->
  <div class="modal wn-modal-full" id="removeNotice">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">탈퇴회원 개인정보 보유기간</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
          <div class="bg-gray px-20 pt-l pb-20">
            <div class="t-14 lh-20 text-break">
              관련 법률에 의거하여 회원탈퇴 후에도 판/구매자의 권익을 보호하기 위해 아래의 정보가 일정기간 보존됨을 알려드립니다.
            </div>
          </div>
          <div class="el-container px-20">
            <ul class="t-14 lh-20">
              <li>
                <h4 class="t-hd t-15 bold">· 계약 또는 청약 철회 등에 관한 기록</h4>
                <div class="mt-xs t-gray">
                  보존이유 : 전자상거래 등에서의 소비자보호에 관한 법률<br>
                  보존기간 : 5년
                </div>
              </li>
              <li class="mt-20">
                <h4 class="t-hd t-15 bold">· 대금 결제 및 재화 등이 공급에 관한 기록</h4>
                <div class="mt-xs t-gray">
                  보존이유 : 전자상거래 등에서의 소비자보호에 관한 법률<br>
                  보존기간 : 5년
                </div>
              </li>
              <li class="mt-20">
                <h4 class="t-hd t-15 bold">· 소비자의 불만 또는 분쟁처리에 관한 기록</h4>
                <div class="mt-xs t-gray">
                  보존이유 : 전자상거래 등에서의 소비자보소에 관한 법률<br>
                  보존기간 : 3년
                </div>
              </li>
              <li class="mt-20">
                <h4 class="t-hd t-15 bold">· 본인 확인 정보에 관한 기록</h4>
                <div class="mt-xs t-gray">
                  보존이유 : 정보통신 이용촉진 및 정보보호 등에 관한 법률<br>
                  보존기간 : 6개월
                </div>
              </li>
              <li class="mt-20">
                <h4 class="t-hd t-15 bold">· 방문에 관한 기록(서비스 이용기록, 접속로그, 접속 IP 정보)</h4>
                <div class="mt-xs t-gray">
                  보존이유 : 통신비밀보호법<br>
                  보존기간 : 3개월
                </div>
              </li>
            </ul>
          </div>

          <hr class="spacer-bottom">

        </div>
      </div>
    </div>
  </div>
   
  <!-- Confirm : 주문취소 확인 -->
  <!-- 메세지 + 취소/확인 -->
  <div class="modal fade wn-modal" id="confirmCancel">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <h2 class="wn-modal-header">주문취소</h2>
        <div class="wn-modal-body">
          <div class="t-13 color-steel lh-m">결제에 사용된 지원금은 반환되며 다른 결제주문에 자동으로 반영되지 않습니다.
            <br>
            주문을 취소하기겠습니까?
          </div>

        </div>
        <div class="wn-modal-footer">
          <button class="button bt-m bt-grey bt-rect d-block" data-dismiss="modal">취소</button>
          <button class="button bt-m bt-green bt-rect d-block" onclick="$('#alertCancel').modal('show')"
            data-dismiss="modal">확인</button>
        </div>
      </div>
    </div>
  </div>
   
  <!-- Alert : 주문취소 완료 -->
  <!-- 메세지 + 확인 -->
  <div class="modal fade wn-modal" id="alertCancel">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <h2 class="wn-modal-header">주문취소</h2>
        <div class="wn-modal-body">
          주문/결제가 취소되었습니다!
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-m bt-green bt-rect d-block" data-dismiss="modal"  onclick="location.href = 'WN_PB_MO_MYP_000100.html' ">확인</button>
        </div>
      </div>
    </div>
  </div>


  <!-- Modal 반품신청 완료 -->
  <!-- 메세지 + 확인 -->
  <div class="modal fade wn-modal wn-modal-msg" id="modalComplete" data-backdrop="static">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <h2 class="wn-modal-header">반품 신청 완료</h2>
        <div class="wn-modal-body">
          반품신청이 정상적으로 접수되었습니다!
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-m bt-green bt-rect d-block" data-dismiss="modal">확인</button>
        </div>
      </div>
    </div>
  </div>
     
  <!-- Modal 교환신청 완료 -->
  <!-- 메세지 + 확인 -->
  <div class="modal fade wn-modal wn-modal-msg" id="modalComplete" data-backdrop="static">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <h2 class="wn-modal-header">교환 신청 완료</h2>
        <div class="wn-modal-body">
          교환신청이 정상적으로 접수되었습니다!
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-green bt-rect d-block" data-dismiss="modal" onclick="location.href = 'WN_PB_MO_MYP_030102.html' "
>확인</button>
        </div>
      </div>
    </div>
  </div>     
     
     
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																5. 상품 (팝업)																					      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
  <!-- Bottom Sheet - 상품 필터 -->
  <!-- 상품정렬 + 발송유형 별  조회 -->
  <div class="modal fade wn-modal-bottom modal-prd-filters" id="modalPrdFilters1">
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
                  <button class="select-item btn-layout active" data-layout="tile">
                    <div class="icon-container">
                      <div class="wn-icon plp-tile"></div>
                    </div>
                    <span class="label">2xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="large">
                    <div class="icon-container">
                      <div class="wn-icon plp-large"></div>
                    </div>
                    <span class="label">1xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="list">
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

<!-- Modal - Buy Option <newProdList> -->
<div class="modal fade wn-modal-bottom modal-buy-option" id="newProdListBuyOption">
  <div class="modal-dialog">
    <div class="modal-content">
      <button class="btn-close" data-dismiss="modal">닫기</button>
      <div class="overflow-auto">
        <div class="wn-modal-body">
          <div class="buy-options">
            <c:if test="${fn:length(newProdOptionProduct) > 0}">
              <div class="buy-option-item">
                <div class="custom-select mb-20">
                  <select id="newPrdCartOption">
                    <option></option>
                  </select>
                  <div class="select-selected"></div>
                  <div class="select-items select-hide">
                  </div>
                </div>
              </div>
            </c:if>
            <div class="buy-option-item">
              <div class="label" id="newPrdCartGdNm"></div>
              <div class="content">
                <div class="input-number">
                  <input type="hidden" value="" id="newPrdCnt"/>
                  <button class="dec" id="newPrdCartDec" value=""></button>
                  <input class="num" id="newPrdCartCnt" type="text" value="1" readonly>
                  <button class="inc" id="newPrdCartInc" value=""></button>
                </div>
                <div class="price-format" id="newPrdCartPrice"><small>원</small></div>
              </div>
            </div>
            <div class="buy-option-total">
              <span class="label">합계</span>
              <span class="price-format" id="newPrdCartTotalPrc"><small>원</small></span>
            </div>
          </div>
        </div>
        <footer class="wn-modal-footer">
          <button class="button bt-l bt-white gray-7 bt-rect" onclick="location.href = '' ">정기배송 신청</button>
          <button class="button bt-l bt-gray bt-rect" onclick="location.href = 'WN_PB_MO_ORD_020101.html' ">바로구매</button>
          <button class="button bt-l bt-green bt-rect"  onclick="location.href = '/mypage/cartlist' ">장바구니</button>
        </footer>
      </div>
    </div>
  </div>
</div>

<!-- Modal - Buy Option <discountProdList> -->
<div class="modal fade wn-modal-bottom modal-buy-option" id="dcProdListBuyOption">
  <div class="modal-dialog">
    <div class="modal-content">
      <button class="btn-close" data-dismiss="modal">닫기</button>
      <div class="overflow-auto">
        <div class="wn-modal-body">
          <div class="buy-options">
            <c:if test="${fn:length(dcProdOptionProduct) > 0}">
              <div class="buy-option-item">
                <div class="custom-select mb-20">
                  <select id="dcPrdCartOption">
                    <option></option>
                  </select>
                  <div class="select-selected"></div>
                  <div class="select-items select-hide">
                  </div>
                </div>
              </div>
            </c:if>
            <div class="buy-option-item">
              <div class="label" id="dcPrdCartGdNm"></div>
              <div class="content">
                <div class="input-number">
                  <input type="hidden" value="" id="dcPrdCnt"/>
                  <button class="dec" id="dcPrdCartDec" value=""></button>
                  <input class="num" id="dcPrdCartCnt" type="text" value="1" readonly>
                  <button class="inc" id="dcPrdCartInc" value=""></button>
                </div>
                <div class="price-format" id="dcPrdCartPrice"><small>원</small></div>
              </div>
            </div>
            <div class="buy-option-total">
              <span class="label">합계</span>
              <span class="price-format" id="dcPrdCartTotalPrc"><small>원</small></span>
            </div>
          </div>
        </div>
        <footer class="wn-modal-footer">
          <button class="button bt-l bt-white gray-7 bt-rect" onclick="location.href = '' ">정기배송 신청</button>
          <button class="button bt-l bt-gray bt-rect" onclick="location.href = 'WN_PB_MO_ORD_020101.html' ">바로구매</button>
          <button class="button bt-l bt-green bt-rect"  onclick="location.href = '/mypage/cartlist' ">장바구니</button>
        </footer>
      </div>
    </div>
  </div>
</div>
  
  <!-- Modal - Buy Option -->
  <!-- 개수선택 + 정기배송신청 / 장바구니 / 바로구매 -->
  <div class="modal fade wn-modal-bottom modal-buy-option" id="modalBuyOptionDetail">
    <div class="modal-dialog">
      <div class="modal-content">
        <button class="btn-close" onclick="closeBuyOption();" data-dismiss="modal">닫기</button>
        <div class="overflow-auto">
          <div class="wn-modal-body">
            <div class="buy-options">
              <c:forEach items="${itemDetail}" var="itemDetail">
                <c:if test="${fn:length(optionProduct) > 0}">
                  <div class="buy-option-item">
                    <div class="custom-select mb-20">
                      <select>
                        <c:forEach var="option" items="${optionProduct}" varStatus="i">
                          <option value="'${option.gdcd}','${option.gdname}','${option.price1}','${option.saleprice}','dtlOption','${option.gdcnt}'">${option.gdname}</option>
                        </c:forEach>
                      </select>
                      <div class="select-selected"></div>
                      <div class="select-items select-hide">
                      </div>
                    </div>
                  </div>
                </c:if>
                <div class="buy-option-item">
                  <div class="label" id="dtlGdName">${itemDetail.gdname}</div>
                  <div class="content">
                    <div class="input-number" id="inputNumber">
                      <input type="hidden" value="${itemDetail.gdcnt}" id="dtlCnt"/>
                      <c:choose>
                        <c:when test="${itemDetail.price1 eq itemDetail.saleprice}">
                          <button class="dec" id="dtlCartDec" value="${itemDetail.price1}"></button>
                        </c:when>
                        <c:otherwise>
                          <button class="dec" id="dtlCartDec" value="${itemDetail.saleprice}"></button>
                        </c:otherwise>
                      </c:choose>
                      <input class="num" id="itemNum" type="text" value="1" readonly>
                      <c:choose>
                        <c:when test="${itemDetail.price1 eq itemDetail.saleprice}">
                          <button class="inc" id="dtlCartInc" value="${itemDetail.price1}"></button>
                        </c:when>
                        <c:otherwise>
                          <button class="inc" id="dtlCartInc" value="${itemDetail.saleprice}"></button>
                        </c:otherwise>
                      </c:choose>
                    </div>
                    <div class="price-format" id="dtlPrc">
                      <c:choose>
                        <c:when test="${itemDetail.price1 eq itemDetail.saleprice}">
                          <fmt:formatNumber value="${itemDetail.price1}"/><small>원</small>
                        </c:when>
                        <c:otherwise>
                          <fmt:formatNumber value="${itemDetail.saleprice}"/><small>원</small>
                        </c:otherwise>
                      </c:choose>
                    </div>
                  </div>
                  <div class="buy-option-total">
                    <span class="label">합계</span>
                    <span class="price-format" id="dtlTotalPrc">
                      <c:choose>
                        <c:when test="${itemDetail.price1 eq itemDetail.saleprice}">
                          <fmt:formatNumber value="${itemDetail.price1}"/><small>원</small>
                        </c:when>
                        <c:otherwise>
                          <fmt:formatNumber value="${itemDetail.saleprice}"/><small>원</small>
                        </c:otherwise>
                      </c:choose>
                  </span>
                  </div>
                </div>
              </c:forEach>
            </div>
            <footer class="wn-modal-footer">
              <button class="button bt-l bt-gray bt-rect" onclick="location.href = 'WN_PB_MO_ORD_020101.html' ">바로구매</button>
              <button class="button bt-l bt-green bt-rect"  onclick="location.href = '/mypage/cartlist' ">장바구니</button>
            </footer>
          </div>
        </div>
      </div>
    </div>
  </div>
 

  <!-- Modal - Buy Option 2  -->
  <!-- 개수선택 + 바로구매 / 장바구니 -->
  <div class="modal fade wn-modal-bottom modal-buy-option" id="modalBuyOption2">
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
  
  <!-- Modal - 재입고 알림 신청 -->
  <!-- 메세지 + 취소/알림신청 -->
  <div class="modal fade wn-modal" id="modalRestock">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <h2 class="wn-modal-header">재입고 알림 신청</h2>
        <div class="wn-modal-body">
          <ul>
            <c:forEach items="${itemDetail}" var="itemDetail">
              <li>
                <h4 class="t-14 t-green">상품명</h4>
                <div class="mt-xs t-hd">${itemDetail.gdname}</div>
              </li>
            </c:forEach>
            <li class="mt-20">
              <h4 class="t-14 t-green">휴대폰</h4>
              <div class="mt-xs t-hd">010-5523-2038</div>
            </li>
          </ul>
          <hr class="solid-line mt-20">
          <div class="mt-m t-gray t-15 lh-20">
            ※ 상품이 재입고 되면 등록하신 휴대폰 번호로 알려 드립니다.
          </div>
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-gray bt-rect d-block" data-dismiss="modal">취소</button>
          <button class="button bt-l bt-green bt-rect d-block">알림신청</button>
        </div>
      </div>
    </div>
  </div> 
 
<!-- Modal - 카드혜택 정보 -->
<!-- 메세지 + 확인  -->
  <div class="modal fade wn-modal" id="modalCardPromotion">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <h2 class="wn-modal-header">카드혜택 정보</h2>
        <div class="wn-modal-body">
          <div class="t-hd t-19">[현대카드] 5만원 이상 결제 시 5% 청구 할인</div>
          <ul class="mt-25">
            <li>
              <h4 class="t-green t-14">행사기간</h4>
              <div class="mt-xs t-hd">2021-05-04~2021-10-21</div>
            </li>
            <li class="mt-20">
              <h4 class="t-green t-14">행사내용</h4>
              <div class="mt-xs t-hd">5만원 이상 결제 시, 5% 청구 할인</div>
            </li>
            <li class="mt-20">
              <h4 class="t-green t-14">행사조건</h4>
              <div class="mt-xs t-hd">1인 1일 최대 5만원 할인</div>
            </li>
            <li class="mt-20">
              <h4 class="t-green t-14">대상카드</h4>
              <div class="mt-xs t-hd">현대카드</div>
            </li>
          </ul>
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-green bt-rect d-block" data-dismiss="modal">확인</button>
        </div>
      </div>
    </div>
  </div>

<div class="modal wn-modal-full" id="normalReview">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
      <header class="local-header">
        <div class="fixed-top">
          <div class="local-top">
            <a href="javascript:void(0);" onclick="$('#normalReview').modal('hide');" class="btn-prev"><i class="wn-icon wni-arrow-left"></i></a>
            <div class="h-row">
              <div class="h-col h-tit">
                <h1 class="page-tit">구매후기 작성하기</h1>
              </div>
            </div>
          </div>
        </div>
      </header>
      <main class="main-container" id="main-container">
        <div class="main-content" id="main-content">
          <article class="pt-l content-center">
            <c:forEach items="${itemDetail}" var="itemDetail">
              <section class="prd-thumb align-items-center">
                <div class="img-container thumb-8">
                  <div class="prd-img rounded-8">
                    <img src="<%=_imgUrl%>images/gdimg/${itemDetail.mgdimg1}" alt="${itemDetail.gdname}">
                  </div>
                </div>
                <div class="detail">
                  <div class="tit">${itemDetail.gdname}</div>
                </div>
              </section>
            </c:forEach>
            <section>
              <header class="mt-l d-flex align-items-center">
                <h3 class="hd-s mb-0">구매후기</h3>
                <div class="ml-auto">
                  <div class="t-13">
                    <span id="textLength">0</span>
                    <i class="i-divider"></i>
                    <span>최대 30자</span>
                  </div>
                </div>
              </header>
              <div class="mt-s">
                <textarea class="textarea" id="reviewText" maxlength="30" onkeyup="textAreaCheck(this);" rows="6" placeholder="작성 시 개인정보 포함을 주의해주세요. 구매후기는 배송완료 후 14일(2주) 이내에 작성가능하고 적립포인트를 부여 받을 수 있습니다."></textarea>
              </div>
            </section>
            <section class="pb-30">
              <header class="mt-l">
                <h3 class="hd-s">사진첨부</h3>
              </header>
              <div class="form-attach-image">
                <input type="file" name="" id="input-file" hidden>
                <label for="input-file">
                  <div class="attach-image-thumb">
                    <div class="img-square">
                      <div class="img-crop" data-attach-role="bgImg"></div>
                    </div>
                  </div>
                </label>
                <div class="detail">
                  <div class="label-point"><span>+200P</span></div>
                  <div class="content">
                    포토 구매후기 작성 시 <br>
                    200 포인트를 적립하여 드립니다.
                  </div>
                </div>
              </div>
            </section>
            <div class="button-footer-fixed">
              <button class="button bt-l bt-gray bt-rect" onclick="$('#normalReview').modal('hide');">취소</button>
              <button class="button bt-l bt-green bt-rect" onclick="reviewInsert();">등록</button>
            </div>
          </article>
        </div><!-- /.main-content -->
      </main>
      <div class="quick-menu" id="quick-menu">
        <a href="WN_PB_MO_GDS_020601.html" class="quick-menu-button btn-chat"><i class="wn-icon wni-message-square">채팅상담</i></a>
        <a href="#" class="quick-menu-button" id="page-top-button"><i class="wn-icon wni-chevron-v">Top</i></a>
      </div>
    </div>
  </div>
</div>
  <!-- Modal - Photo Review Detail -->
  <!-- 포토 구매후기 팝업 #020503 -->
  <div class="modal wn-modal-full" id="modalPhotoReview">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">포토 구매후기</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
          <input type="hidden" name="photoRivewIndex" id="photoRivewIndex" value="0"/>
          <div class="swiper-container photo-review-swiper" id="photoReviewSwiper">
            <div class="swiper-wrapper">
              <div class="swiper-slide">
                <div class="photo-reivew-detail">
                  <div class="img-view">
                    <img src="./images/uploads/prd-review-test.jpg" alt="">
                  </div>
                  <div class="content-center">
                    <article class="review-item">
                      <div class="review-option">
                        <span class="label">구매옵션</span>
                        <span class="content">망고스틱 10개</span>
                      </div>
                      <div class="review-wrapper">
                        <div class="review-img">
                          <div class="img-square rounded-4">
                            <div class="img-crop" style="background-image: url(./images/uploads/prd-review-test.jpg);"></div>
                          </div>
                        </div>
                        <div class="review-detail">
                          <div class="content">
                            길게 쓰자 길게 쓰자길게 쓰자 쓰자길게 쓰자 쓰자길게 쓰자길게 쓰자길길게 쓰자길게 쓰자길게 쓰자길
                          </div>
                          <div class="info">
                            <span class="info-item">2020.07.30</span>
                            <span class="info-item">jkd***</span>
                          </div>
                        </div>
                      </div>
                    </article>
                  </div>
                </div>
              </div>
              <div class="swiper-slide">
                <div class="photo-reivew-detail">
                  <div class="img-view">
                    <img src="./images/uploads/prd-review-test.jpg" alt="">
                  </div>
                  <div class="content-center">
                    <article class="review-item">
                      <div class="review-option">
                        <span class="label">구매옵션</span>
                        <span class="content">망고스틱 10개</span>
                      </div>
                      <div class="review-wrapper">
                        <div class="review-img">
                          <div class="img-square rounded-4">
                            <div class="img-crop" style="background-image: url(./images/uploads/prd-review-test.jpg);"></div>
                          </div>
                        </div>
                        <div class="review-detail">
                          <div class="content">
                            길게 쓰자 길게 쓰자길게 쓰자 쓰자길게 쓰자 쓰자길게 쓰자길게 쓰자길길게 쓰자길게 쓰자길게 쓰자길
                          </div>
                          <div class="info">
                            <span class="info-item">2020.07.30</span>
                            <span class="info-item">jkd***</span>
                          </div>
                        </div>
                      </div>
                    </article>
                  </div>
                </div>
              </div>
              <div class="swiper-slide">
                <div class="photo-reivew-detail">
                  <div class="img-view">
                    <img src="./images/uploads/prd-review-test.jpg" alt="">
                  </div>
                  <div class="content-center">
                    <article class="review-item">
                      <div class="review-option">
                        <span class="label">구매옵션</span>
                        <span class="content">망고스틱 10개</span>
                      </div>
                      <div class="review-wrapper">
                        <div class="review-img">
                          <div class="img-square rounded-4">
                            <div class="img-crop" style="background-image: url(./images/uploads/prd-review-test.jpg);"></div>
                          </div>
                        </div>
                        <div class="review-detail">
                          <div class="content">
                            길게 쓰자 길게 쓰자길게 쓰자 쓰자길게 쓰자 쓰자길게 쓰자길게 쓰자
                          </div>
                          <div class="info">
                            <span class="info-item">2020.07.30</span>
                            <span class="info-item">jkd***</span>
                          </div>
                        </div>
                      </div>
                    </article>
                  </div>
                </div>
              </div>
            </div>
            <div class="swiper-nav-footer">
              <div class="swiper-nav-prev">이전</div>
              <div class="swiper-nav-fraction"></div>
              <div class="swiper-nav-next">다음</div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Modal - 상품문의 작성 안내 -->
  <!-- 메세지 + x 닫기 -->
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
                  <li>입고일 : 입고일이 확정되면 상품 이미지에 표시되어 안내됩니다.(상품 상세페이지 내 재입고 알림 신청 가능)</li>
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
                        [결제완료]단계 : 마이페이지>주문내역 상세페이지]에서 직접 취소 가능(취소불가 시 고객센터로 문의)
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
          <button class="button bt-l bt-rect bt-green">확인</button>
        </div>
      </div>
    </div>
  </div>
  
  <!-- Modal (bottom sheet) - Share SNS -->
  <!-- sns 공유하기 -->
  <div class="modal fade wn-modal-bottom" id="modalSNS">
    <div class="modal-dialog">
      <div class="modal-content">
        <button class="btn-close" data-dismiss="modal">닫기</button>
        <div class="overflow-auto">
          <c:forEach var="itemDetail" items="${itemDetail}">
            <div class="wn-modal-body">
              <article class="section-share">
                <div class="share-item">
                  <div class="thumb">
                    <div class="img-square rounded-8">
                      <div class="img-crop" style="background-image: url(<%=_imgUrl%>images/uploads/${itemDetail.mgdimg1});"></div>
                    </div>
                  </div>
                  <div class="content">
                    <h3 class="label">공유하기</h3>
                    <div class="tit">${itemDetail.gdname}</div>
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
                    <a href="javascript:void(0)" onclick="shareFaceBook();" class="sns-thumb">
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
          </c:forEach>
        </div>
      </div>
    </div>
  </div>
    

  <!-- 자동주문 이용약관 -->
  <div class="modal wn-modal-full" id="subscribeTerms">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">자동주문 이용약관</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
          <section class="pt-l px-m">
            <ul class="wn-accordion">
              <li class="wn-accordion-item active">
                <h4 class="wn-accordion-tit">제1조 (정의)</h4>
                <div class="wn-accordion-content">
                  <div class="t-12 lh-18">
                    자동주문이란 장기간 반복구매하려는 회원의 주문 편리를 위함이
                    며, 처음 신청 시 상품과 배송주기를 선택하면 자연이랑이 회원을
                    대신하여 신청한 상품을 주기적으로 주문하는 것입니다.
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit">제2조 (계약의 성립과 기간)</h4>
                <div class="wn-accordion-content">
                  <div class="t-12 lh-18">
                    자동주문의 개시일자(요일)와 해지일자(요일)는 회원이 선택할 수 있으며, 자동주문 신청을 한 때로부터 계약이 성립한 것으로 합니다.
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit">제3조 (자동주문 일자 및 결제방법)</h4>
                <div class="wn-accordion-content">
                  <div class="t-12 lh-18">
                    자동주문의 주문일자는 선택하신 배송 요일에 의해서 결정되며 배송일의 1주일전에 자동주문 되고 주문과 동시에 결제가 이루어 집니다.
                    <br>
                    자동주문의 결제는 지원금 또는 급여공제만 가능합니다. 따라서 지원금 또는 급여공제로 결제가 가능한 회원만이 이용할 수 있습니다.
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit">제4조 (주문 사항의 변경)</h4>
                <div class="wn-accordion-content">
                  <div class="t-12 lh-18">
                    이사 등의 사유로 배송지가 변경되거나 휴가 등으로 일시 중단해야하는 경우에는 상품 도착일로부터 일주일 전까지 자연이랑에서 해당사항을 변경하여야 합니다.
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit">제5조 (상품의 구성물 변경)</h4>
                <div class="wn-accordion-content">
                  <div class="t-12 lh-18">
                    상품의 구성물은 상품도착일 한달 전부터 자연이랑에 고지합니다.
                    <br>
                    그러나 생산지의 사정에 의해서 예고없이 변경될 수 있습니다.
                    <br>
                    기타 다른 사항은 자연이랑 이용약관에 준합니다.
                  </div>
                </div>
              </li>
            </ul>
          </section>
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-rect bt-gray" data-dismiss="modal">취소</button>
          <button class="button bt-l bt-rect bt-green">확인</button>
        </div>
      </div>
    </div>
  </div>
  
  <!-- 정기배송 상품 구성 -->
  <!-- 상품리스트 + 상품구성변경 / 확인 -->
  <div class="modal wn-modal-full" id="subscriptionDetail">
    <div class="modal-dialog">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">정기배송 상품 구성</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
          <section class="pkg-detail-view">
            <div class="content-center">
              <div class="prd-thumb">
                <div class="img-container thumb-8">
                  <div class="prd-img">
                    <img src="./images/uploads/prd-img-02.jpg" alt="[자연이랑세트] 계속 받는 꾸러미 – 패턴형 격주배송">
                  </div>
                </div>
                <div class="detail">
                  <div class="tit">[자연이랑세트] 계속 받는 꾸러미 – 패턴형 격주배송</div>
                </div>
              </div>
            </div>
          </section>
          <section class="bg-gray py-l px-m">
            <ul class="list-dot t-13 lh-18 color-steel">
              <li>고객님께서 선택하신 상품 내역을 아래에서 확인해주세요.</li>
              <li class="pt-xs">변경하시려면 이전버튼을, 이대로 주문구성을 확정하시려면 패턴지정완료 버튼을 눌러주세요.</li>
              <li class="pt-xs">세트 종류에 따라 제철 과일, 채소, 곡류로 시기별로 다양하게 변경됩니다.</li>
              <li class="pt-xs">아래 상품구성내용은 고객님께서 지정하시는 첫 배송일에 따라 변경될 수 있습니다.</li>
            </ul>
          </section>
          <div class="content-center">
            <section class="mt-l">
              <h3 class="hd-s">선택 상품 구성 확인</h3>
              <div class="wn-card">
                <header class="wn-card-header">
                  <h4 class="tit">1주차</h4>
                </header>
                <div class="wn-card-body">
                  <div class="px-m py-20">
                    <a href="#" class="prd-thumb prd-thumb-s">
                      <div class="img-container">
                        <div class="prd-img thumb-5">
                          <img src="./images/uploads/prd-img-01.jpg" alt="">
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit bold">친환경 채소 세트</div>
                        <ul class="items">
                          <li>GAP 껍질째 먹는 사과 2.5kg (1)</li>
                        </ul>
                      </div>
                    </a>
                    <a href="#" class="prd-thumb prd-thumb-s">
                      <div class="img-container">
                        <div class="prd-img thumb-5">
                          <img src="./images/uploads/prd-img-02.jpg" alt="">
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit bold">곡류 세트</div>
                        <ul class="items">
                          <li>GAP 껍질째 먹는 사과 2.5kg (1)</li>
                        </ul>
                      </div>
                    </a>
                  </div>
                </div>
              </div>
              <div class="wn-card">
                <header class="wn-card-header">
                  <h4 class="tit">2주차</h4>
                </header>
                <div class="wn-card-body">
                  <div class="px-m py-20">
                    <a href="#" class="prd-thumb prd-thumb-s">
                      <div class="img-container">
                        <div class="prd-img thumb-5">
                          <img src="./images/uploads/prd-img-01.jpg" alt="">
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit bold">친환경 채소 세트</div>
                        <ul class="items">
                          <li>GAP 껍질째 먹는 사과 2.5kg (1)</li>
                        </ul>
                      </div>
                    </a>
                    <a href="#" class="prd-thumb prd-thumb-s">
                      <div class="img-container">
                        <div class="prd-img thumb-5">
                          <img src="./images/uploads/prd-img-02.jpg" alt="">
                        </div>
                      </div>
                      <div class="detail">
                        <div class="tit bold">곡류 세트</div>
                        <ul class="items">
                          <li>GAP 껍질째 먹는 사과 2.5kg (1)</li>
                        </ul>
                      </div>
                    </a>
                  </div>
                </div>
              </div>
            </section>
          </div>
          <div class="button-footer">
            <button class="button bt-xl bt-rect bt-gray" data-dismiss="modal">상품 구성 변경</button>
            <button class="button bt-xl bt-rect bt-green">확인</button>
          </div>
        </div><!-- /.wn-modal-body -->
      </div>
    </div>
  </div><!-- /.modal -->

  
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																 6. 전시 (팝업)																					      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
  <!-- Bottom Sheet - 상품 필터 -->
  <!-- 상품목록유형 + 정렬 / 카테고리  (체크박스) -->
  <div class="modal fade wn-modal-bottom modal-prd-filters" id="modalPrdFilters2">
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
                  <button class="select-item btn-layout active" data-layout="tile">
                    <div class="icon-container">
                      <div class="wn-icon plp-tile"></div>
                    </div>
                    <span class="label">2xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="large">
                    <div class="icon-container">
                      <div class="wn-icon plp-large"></div>
                    </div>
                    <span class="label">1xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="list">
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
                <h4 class="hd">카테고리</h4>
                <div class="radio-list">
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="" checked>
                      <span class="label">전체카테고리</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">과일·견과</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">채소·버섯</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">쌀·잡곡</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">정육·계란</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">수산·건어물</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">음료·간식</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">양념·면</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">반찬·간편식</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">쌀·잡곡</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">건강식품</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">리빙·반려</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" name="radio-shipping" id="" value="">
                      <span class="label">정기·선물세트</span>
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
 
  <!-- Bottom Sheet - 상품 필터 -->
  <!-- 상품목록유형 + 정렬 / 카테고리  (라디오박스) -->
  <div class="modal fade wn-modal-bottom modal-prd-filters" id="modalPrdFilters3">
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
                  <button class="select-item btn-layout active" data-layout="tile">
                    <div class="icon-container">
                      <div class="wn-icon plp-tile"></div>
                    </div>
                    <span class="label">2xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="large">
                    <div class="icon-container">
                      <div class="wn-icon plp-large"></div>
                    </div>
                    <span class="label">1xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="list">
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
                      <span class="label">할인율순</span>
                    </label>
                  </div>
                  <!-- <div class="item">
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
                  </div> -->
                </div>
              </li>
              <li>
                <h4 class="hd">카테고리</h4>
                <div class="radio-list">
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="radio-shipping" id="" value="" checked>
                      <span class="label">전체카테고리</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="radio-shipping" id="" value="">
                      <span class="label">과일/견과</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="radio">
                      <input type="radio" name="radio-shipping" id="" value="">
                      <span class="label">채소/버섯</span>
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
   
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																7. 프로모션 (팝업)																				      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
 
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																8. 주문/결제 (팝업)																			      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     

  <!-- 팝업: 배송비 쿠폰 -->
  <div class="modal wn-modal-full" id="popShipCoupon">
    <div class="modal-dialog">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">배송비 쿠폰</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
          <div class="content-center pt-l">
            <section class="t-15 color-steel">
              보유 <b class="strong">3</b>장 <i class="i-11"></i> 사용 <b class="green-light">1</b>장
            </section>
            <section class="mt-20">
              <div class="checkable-item checkable-box">
                <label class="checkbox">
                  <input type="checkbox" id="">
                  <span class="label">자연이랑 발송</span>
                </label>
                <div class="sub-content">배송비 3,000원 할인</div>
              </div>
              <div class="checkable-item checkable-box">
                <label class="checkbox">
                  <input type="checkbox" id="">
                  <span class="label">농업회사법인 자연두레 주식회사</span>
                </label>
                <div class="sub-content">배송비 3,000원 할인</div>
              </div>
              <div class="checkable-item checkable-box">
                <label class="checkbox">
                  <input type="checkbox" id="">
                  <span class="label">자연두레</span>
                </label>
                <div class="sub-content">배송비 3,000원 할인</div>
              </div>
            </section>
          </div>
        </div>
        <section class="cart-total popup">
          <div class="content-center">
            <div class="order-total">
              <div class="label-content-justify">
                <h4 class="label">배송비 할인 합계</h4>
                <div class="content">-3,000원</div>
              </div>
            </div>
          </div>
        </section>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-rect bt-grey" data-dismiss="modal">취소</button>
          <button class="button bt-l bt-rect bt-green">쿠폰 적용</button>
        </div>
      </div>
    </div>
  </div>
  
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
 

  <!-- 팝업: 상품쿠폰 적용 -->
  <div class="modal wn-modal-full" id="popPrdCoupon">
    <div class="modal-dialog">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">사용 가능 쿠폰</h2>
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
 

  <!-- 팝업: 결제방법 안내 -->
  <div class="modal wn-modal-full" id="popPayGuide">
    <div class="modal-dialog">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">결제방법 안내</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
          <div class="content-center pt-l">
            <ul class="wn-accordion ani text-break">
              <li class="wn-accordion-item active">
                <h4 class="wn-accordion-tit">WN PAY (자연이랑 간편결제)</h4>
                <div class="wn-accordion-content">
                  <div class="wrapper">
                    <p class="t-12">
                      WN PAY는 자연이랑에서 제공하는 간편결제 서비스입니다.
                      <br>
                      고객은 본인 명의의 카드 또는 계좌 등록 후 비밀번호 입력
                      한번으로 쉽고 빠르게 결제할 수 있습니다.
                    </p>
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit">신용카드</h4>
                <div class="wn-accordion-content">
                  <div class="wrapper">
                    <div class="t-12">
                      ISP안전결제/안심클릭 외 카드 결제불가
                      <div class="mt-s">
                        &lt;신용카드 결제 시 공인인증 이용안내&gt;
                        <br>
                        2005년 11월 1일부터 30만원 이상 신용카드 결제 시 공인
                        인증 의무화로 은행/증권용 공인인증서가 있으신 분께서도
                        ‘신용카드용 공인인증서(무료)’를 발급 받아야 합니다.
                      </div>
                    </div>
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit">실시간 계좌이체</h4>
                <div class="wn-accordion-content">
                  <div class="wrapper">
                    <p class="t-12">
                      인터넷 뱅킹과 관련된 파일, 인증서 등이 설치된 PC에서 인
                      터넷 뱅킹 시스템을 이용하여 계좌이체로 지불하는 방식이
                      며, 이용 금액은 고객의 계좌에서 실시간으로 차감됩니다.
                    </p>
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit">휴대폰 결제</h4>
                <div class="wn-accordion-content">
                  <div class="wrapper">
                    <p class="t-12">
                      휴대폰 가입정보를 입력해 결제하고 이용요금은 고객님의
                      휴대폰요금에 익월 합산하여 청구합니다.
                    </p>
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit">Skpay 간편결제</h4>
                <div class="wn-accordion-content">
                  <div class="wrapper">
                    <p class="t-12">
                      Skpay는 SK에서 만든 간편결제 서비스로 앱이나 공인인증서,
                      Active-X를 설치할 필요 없이 모든 브라우저에서 안전하
                      게 결제할 수 있습니다.
                    </p>
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit">네이버페이 간편결제</h4>
                <div class="wn-accordion-content">
                  <div class="wrapper">
                    <ul class="list-dot t-12">
                      <li>주문 변경 시 카드사 혜택 및 할부 적요 여부는 해당 카
                      드사 정책에 따라 변경될 수 있습니다.</li>
                      <li>네이버페이는 네이버 ID로 별도 앱 설치 없이 신용카드
                      또는 은행계좌 정보를 등록하여 네이버페이 비밀번호로
                      결제할 수 있는 간편결제 서비스입니다.</li>
                      <li>는 SK에서 만든 간편결제 서비스로 앱이나 공인인증서,
                      Active-X를 설치할 필요 없이 모든 브라우저에서 안전하
                      게 결제할 수 있습니다.</li>
                      <li>결제 가능한 신용카드 : 신한, 삼성, 현대, BC, 국민, 하나,
                      롯데, NH농협, 씨티</li>
                      <li>결제 가능한 은행 : NH농협, 국민, 신한, 우리, 기업, SC
                      제일, 부산, 경남, 수협, 우체국</li>
                      <li>네이버페이 카드 간편결제는 네이버페이에서 제공하는
                      카드사 별 무이자, 청구할인 혜택을 받을 수 있습니다.</li>
                    </ul>
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit">카카오 PAY</h4>
                <div class="wn-accordion-content">
                  <div class="wrapper">
                    <ul class="list-dot t-12">
                      <li>카카오페이(KakaoPay)란? 카카오톡 안에서 개인 신용카
                      드(체크카드)을 등록하여 다양한 곳에서 결제 시 간단하
                      게 비밀번호만으로 결제할 수 있는 모바일 결제 서비스
                      입니다. 본인명의 휴대폰에서 본인명의 카드 등록 후 사
                      용 가능합니다.</li>
                      <li>결제 가능 신용카드 : 모든 신용/체크카드(하나BC, 국민
                      BC, 신한BC, 시티(체크) 불가)</li>
                      <li>신용카드 청구할인, 무이자 할부도 카카오페이 기준으
                      로 적용됩니다.</li>
                    </ul>
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit">급여공제</h4>
                <div class="wn-accordion-content">
                  <div class="wrapper">
                    <ul class="list-dot t-12">
                      <li>SK계열사 별로 지원금이 다르므로 지원금 사용내역을
                      확인하세요.</li>
                      <li>주문내역을 확인하시고 상품의 배송일을 확인하세요.</li>
                      <li>자연이랑에서 월간 결제 금액을 고객님의 회사로 익월
                      청구합니다.</li>
                      <li>고객님의 급여명세서를 확인하시기 바랍니다.</li>
                    </ul>
                  </div>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
  
  <!-- 팝업: 개인정보 제3자 제공 -->
  <div class="modal wn-modal-full" id="popPrivate">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">개인정보 제3자 제공</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
            <div class="content-center">
              <div class="pt-l t-hd t-15 lh-20 text-break">
                고객님께서는 아래 내용에 대하여 동의를 거부하실 수 있으며, 거부 시 상품 배송이 제한됩니다.
              </div>
              <table class="table-lined gray large mt-20">
                <tbody>
                  <tr>
                    <th class="t-hd">제공받는 자</th>
                    <td>주식회사 세컨리스트</td>
                  </tr>
                  <tr>
                    <th class="t-hd">목적</th>
                    <td>주문상품의 배송(예약)을 위해</td>
                  </tr>
                  <tr>
                    <th class="t-hd">항목</th>
                    <td>성명, 주소, 연락처</td>
                  </tr>
                  <tr>
                    <th class="t-hd">보유기간</th>
                    <td>배송 완료후 1개월 이내</td>
                  </tr>
                </tbody>
              </table>
            </div>
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-rect bt-green">확인</button>
        </div>
      </div>
    </div>
  </div>
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																9. 통합검색 (팝업)																				      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     

  <!-- Bottom Sheet: 상품 필터 -->
  <div class="modal fade wn-modal-bottom modal-prd-filters" id="modalPrdFilters4">
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
                  <button class="select-item btn-layout active" data-layout="tile">
                    <div class="icon-container">
                      <div class="wn-icon plp-tile"></div>
                    </div>
                    <span class="label">2xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="large">
                    <div class="icon-container">
                      <div class="wn-icon plp-large"></div>
                    </div>
                    <span class="label">1xN</span>
                  </button>
                  <button class="select-item btn-layout" data-layout="list">
                    <div class="icon-container">
                      <div class="wn-icon plp-list"></div>
                    </div>
                    <span class="label">목록형</span>
                  </button>
                </div>
              </li>
              <!-- <li>
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
              </li> -->
              <li>
                <h4 class="hd">배송 유형</h4>
                <div class="radio-list">
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" checked>
                      <span class="label">자연배송(입고)</span>
                    </label>
                  </div>
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox">
                      <span class="label">업체(직송)</span>
                    </label>
                  </div>
                </div>
              </li>
              <li>
                <h4 class="hd">정기배송 가능</h4>
                <div class="radio-list">
                  <div class="item">
                    <label class="checkbox">
                      <input type="checkbox" checked>
                      <span class="label">정기배송 가능 상품만 보기</span>
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
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																10. 매거진 (팝업)																				      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
 
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																 11. 푸터 (인증서 등..)(팝업)																      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
  <!-- 팝업: 푸터 - 정보보호 관리체계 인증서 -->
  <div class="modal wn-modal-full" id="popISMS">
    <div class="modal-dialog">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">정보보호 관리체계 인증서</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
          <div class="px-20 py-20">
            <div class="img-isms">
              <img src="./images/invalidName@2x.png" alt="정보보호 관리체계 인증서">
            </div>
          </div>
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-rect bt-green" data-dismiss="modal">닫기</button>
        </div>
      </div>
    </div>
  </div>

  <!-- 팝업: 푸터 - Secure Sockets Layer 적용 -->
  <div class="modal wn-modal-full" id="popSSL">
    <div class="modal-dialog">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">SSL 인증서</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
          <div class="el-container">
            <div class="px-m pb-s">
              <div class="t-hd t-18 bold">Secure And Authentic Site by UCERT</div>
              <div class="mt-xs t-gray t-13 lh-18">
                <p>visit our website</p>
                <p>www.ucert.co.kr</p>
              </div>
            </div>
            <hr class="solid-line">
          </div>

          <div class="el-container">
            <div class="ssl-item">
              <div class="img-container">
                <img src="./images/ucertBlue@2x.png" alt="SSL 인증서">
              </div>
              <div class="detail">
                *.62life.com 사이트는 <br>
                SSL(Secure Socket Layer)로<br>
                암호화 되고 있습니다.
              </div>
            </div>
          </div>

          <section class="el-container px-m">
            <table class="table-lined">
              <colgroup>
                <col style="width: 120px;">
              </colgroup>
              <tbody>
                <tr>
                  <th class="t-body text-nowrap">Name of Company</th>
                  <td class="py-10"></td>
                </tr>
                <tr>
                  <th class="t-body text-nowrap">Address of URL</th>
                  <td class="py-10">*.62life.com</td>
                </tr>
                <tr>
                  <th class="t-body text-nowrap">Validity Period</th>
                  <td class="py-10">
                    2020-04-28 09:00:00 to <br>
                    2022-06-28 08:59:59
                  </td>
                </tr>
              </tbody>
            </table>
          </section>

          <section class="mt-s px-m">
            <div class="t-gray t-13 lh-18">
              The following SSL certificate has been issued for secure communications
            </div>
          </section>

          <hr class="spacer-bottom">
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-rect bt-green" data-dismiss="modal">닫기</button>
        </div>
      </div>
    </div>
  </div>

  <!-- 팝업: 푸터 - 에스크로 서비스 제공 -->
  <div class="modal wn-modal-full" id="popEscrow">
    <div class="modal-dialog">
      <div class="modal-content">
        <header class="wn-modal-header">
          <h2 class="tit">이니페이 에스크로 가입사실 확인</h2>
          <button class="btn-close-modal" data-dismiss="modal">닫기</button>
        </header>
        <div class="wn-modal-body">
          <div class="el-container">
            <div class="escrow-item">
              <div class="img-container">
                <img src="./images/escrow@2x.png" alt="이니페스 에스크로 가입사실 확인">
              </div>
              <div class="detail">
                아래와 같이 www.62life.com은 (주)이니시스의 결제대금 예치서비스인 이니페이 에스크로의 이용사용자로 등록하여 에스크로 서비스를 제공하고 있으며, 귀하의 결제 정보의 보안이
                최상의 상태로 유지되고 있습니다.<br>
                결제대금예치업 등록번호 : <br>
                02-006-00013
              </div>
            </div>
          </div>

          <section class="el-container px-m">
            <table class="table-lined">
              <colgroup>
                <col style="width: 115px;">
              </colgroup>
              <tbody>
                <tr>
                  <th class="t-body text-nowrap">상호</th>
                  <td class="py-10">(재)행복에프앤씨(자연이랑)</td>
                </tr>
                <tr>
                  <th class="t-body text-nowrap">사업자번호</th>
                  <td class="py-10">7948500155</td>
                </tr>
                <tr>
                  <th class="t-body text-nowrap">URL</th>
                  <td class="py-10">www.62life.com</td>
                </tr>
                <tr>
                  <th class="t-body text-nowrap">에스크로 결제수단</th>
                  <td class="py-10">신용카드,ISP,실시간계좌이체</td>
                </tr>
                <tr>
                  <th class="t-body text-nowrap">인증상태</th>
                  <td class="py-10">인증 (2020-01-12 ~ 2021-01-11)</td>
                </tr>
              </tbody>
            </table>
          </section>

          <section class="mt-s px-m">
            <div class="t-gray t-13 lh-18">
              이니시스 결제 인증마크는 전자결제 No.1 이니시스의 심사를 통과하여 이니시스의 결제 시스템을 탑재한 가맹점만이 이용할 수 있습니다.
            </div>
          </section>

          <hr class="spacer-bottom">
        </div>
        <div class="wn-modal-footer">
          <button class="button bt-l bt-rect bt-green" data-dismiss="modal">닫기</button>
        </div>
      </div>
    </div>
  </div>