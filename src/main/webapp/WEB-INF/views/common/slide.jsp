<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*
			 	"
%><%@ include file="/WEB-INF/views/common/env.jsp"
%>

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
  

  <!-- popMarketing -->
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
 
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																5. 상품 (팝업)																					      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
 
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																 6. 전시 (팝업)																					      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
 
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																7. 프로모션 (팝업)																				      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
 
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																8. 주문/결제 (팝업)																			      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
 
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																9. 통합검색 (팝업)																				      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
 
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																10. 매거진 (팝업)																				      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
 
 
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->
 <!-- 																 11. 푸터 (인증서 등..)(팝업)																      -->
 <!-- ------------------------------------------------------------------------------------------------------------------------ -->     
 
    
    
    
    
    
  <script>
    $(function () {
      //팝업 & 탭 시연용 테스트 코드 
      var queryString = window.location.search;
      var urlParams = new URLSearchParams(queryString);
      
      if (urlParams.has('modalID')) {
        var modalSelector = "#" + urlParams.get('modalID');
        $(modalSelector).modal('show');
      }
      if (urlParams.has('tabID')) {
        var tabSelector = "#" + urlParams.get('tabID');
        $(tabSelector).tab('show');
      }
    }); //jQuery Ready
  </script>