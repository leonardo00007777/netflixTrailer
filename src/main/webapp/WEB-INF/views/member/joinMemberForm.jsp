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
              <h1 class="page-tit">회원가입</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <section class="el-container px-m">
          <div class="progress-level level-2-4">
            <span class="tit">정보입력</span>
            <span class="level">2 / 4</span>
          </div>
        </section>
        <section class="el-container px-m">
          <h2 class="hd-1">
            가입 정보를 <br>
            입력해주세요.
          </h2>
        </section>
        <section class="el-container px-m">
          <div class="form-field form-error">
            <div class="input-add add-right add-s">
              <input type="text" class="input-text" name="" placeholder="아이디 *">
              <button class="button bt-outline bt-green">중복확인</button>
            </div>
            <div class="form-msg">아이디는 영문, 숫자로만 입력 가능합니다.</div>
          </div>
          <div class="form-field">
            <input type="password" class="input-text" name="" placeholder="비밀번호 *">
            <div class="form-msg"></div>
          </div>
          <div class="form-field">
            <input type="password" class="input-text" name="" placeholder="비밀번호 확인 *">
            <div class="form-msg"></div>
          </div>
        </section>
        <section class="el-container px-m">
          <div class="form-field">
            <input type="text" class="input-text" name="" placeholder="이름(실명) *">
            <div class="form-msg"></div>
          </div>
          <div class="form-field">
            <div class="input-add add-right add-m">
              <input type="tel" class="input-text" name="" placeholder="생년월일 (ex.19910123) *">
              <div class="custom-select">
                <select>
                  <option value="">성별 *</option>
                  <option value="">남</option>
                  <option value="">여</option>
                </select>
              </div>
            </div>
            <div class="form-msg"></div>
          </div>
          <div class="form-field">
            <input type="text" class="input-text" name="" placeholder="이메일 주소 *">
            <div class="form-msg"></div>
          </div>
          <div class="form-field">
            <div class="input-add add-right add-s">
              <input type="tel" class="input-text" name="" placeholder="휴대전화 *">
              <button class="button bt-outline bt-green">인증</button>
            </div>
            <div class="form-msg"></div>
          </div>
        </section>

        <hr class="spacer-bottom">

        <div class="button-footer">
          <a href="WN_PB_MO_MEM_010103.html" class="button bt-l bt-green bt-rect d-block">다음</a>
        </div>
      </div><!-- /.main-content -->
    </main>
  </div>

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
  
