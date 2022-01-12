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
              <h1 class="page-tit text-center">나의 1:1 문의</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <article>
          <nav>
            <ul class="nav nav-tabs tab-default"  id="myActivityGroup">
              <li class="nav-item">
                <!-- <a class="nav-link" href="WN_PB_MO_MYP_040302.html">내 문의 내역</a> -->
                <a class="nav-link" href="javascript:void(0)"  id="btnMyQnaList">내 문의 내역</a>
              </li>
              <li class="nav-item">
                <a class="nav-link active" href="#">1:1 문의하기</a>
              </li>
            </ul>
            <hr class="divider-top">
          </nav>
          <section class="content-center pt-25">
            <div class="form-field">
              <div class="custom-select" data-select-role="select-main" data-select-sub="#selectQnaSub">
                <select>
                  <option value="">문의유형 선택</option>
                  <option value="" data-select-items="회원인증,불편사항,기타">서비스 이용</option>
                  <option value="" data-select-items="내용문의,당첨문의,기타">이벤트</option>
                  <option value="" data-select-items="상품,서비스,쇼핑몰,기타">고객제안</option>
                  <option value="" data-select-items="첫구매대상,재배송대상,미배송대상,첫자동주문,무작위대상,기타">아웃바운드</option>
                  <option value="">기타</option>
                </select>
              </div>
            </div>
            <div class="form-field">
              <div class="custom-select" id="selectQnaSub">
                <select disabled>
                  <option value="">세부종류 선택</option>
                </select>
              </div>
            </div>
          </section>
          <section class="content-center mt-20">
            <div class="form-field">
              <input type="text" class="input-text" placeholder="제목을 입력하세요">
            </div>
            <div class="form-field">
              <textarea class="textarea" rows="7" placeholder="내용을 입력하세요"></textarea>
            </div>
          </section>
          <section class="content-center mt-l">
            <div class="header-add-r">
              <h3 class="hd-xs">관련 파일을 첨부해 주세요</h3>
              <div class="add">
                <span class="t-13 color-steel">최대 10개 첨부 가능</span>
              </div>
            </div>
            <div class="form-attach-file">
              <input type="file" name="" id="inputFile1" hidden="">
              <label for="inputFile1">
                <span class="button bt-outline bt-steel w-100">파일 첨부</span>
              </label>
              <div class="attach-list" data-attach-role="attach-list">
                <div class="attach-item">
                  <i class="wn-icon clip-16"></i>
                  <span class="file-name" title="IMG_2982_84392943.jpg">주민등록 등본 사본 v20200726.pdf</span>
                  <button class="btn-remove" onclick="attachItemRemoveClick(this)"><i
                      class="wn-icon x-16"></i></button>
                </div>
                <div class="attach-item">
                  <i class="wn-icon clip-16"></i>
                  <span class="file-name" title="IMG_2982_84392943.jpg">IMG_2982_84392943.jpg</span>
                  <button class="btn-remove" onclick="attachItemRemoveClick(this)"><i
                      class="wn-icon x-16"></i></button>
                </div>
              </div>
            </div>
          </section>

          <hr class="spacer-bottom">

          <div class="button-footer">
            <a href="#" class="button bt-rect bt-green bt-l">저장</a>
          </div>
        </article>
      </div><!-- /.main-content -->
    </main>
    <div class="quick-menu" id="quick-menu">
      <a href="#" class="quick-menu-button btn-chat"><i class="wn-icon wni-message-square">채팅상담</i></a>
      <a href="#" class="quick-menu-button" id="page-top-button"><i class="wn-icon wni-chevron-v">Top</i></a>
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
