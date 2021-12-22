<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ include file="/WEB-INF/views/common/env.jsp" %>
<% pageContext.setAttribute("newLineChar", "\\n"); %>


  <main class="main-container" id="main-container">
    <div class="main-content" id="main-content">
      <article class="pt-l content-center">
        <section class="prd-thumb align-items-center">
          <div class="img-container thumb-8">
            <div class="prd-img rounded-8">
              <img src="./images/uploads/prd-img-02.jpg" alt="[정덕원 농부] 제주의 달콤향긋 애플망고 2kg (5~7수)">
            </div>
          </div>
          <div class="detail">
            <div class="tit">[정덕원 농부] 제주의 달콤향긋 애플망고 2kg (5~7수)</div>
          </div>
        </section>
        <section>
          <header class="mt-l d-flex align-items-center">
            <h3 class="hd-s mb-0">구매후기</h3>
            <div class="ml-auto">
              <div class="t-13">
                <span>0자</span>
                <i class="i-divider"></i>
                <span>최대 30자</span>
              </div>
            </div>
          </header>
          <div class="mt-s">
            <textarea class="textarea" rows="6" placeholder="작성 시 개인정보 포함을 주의해주세요. 구매후기는 배송완료 후 14일(2주) 이내에 작성가능하고 적립포인트를 부여 받을 수 있습니다."></textarea>
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
          <button class="button bt-l bt-gray bt-rect">취소</button>
          <button class="button bt-l bt-green bt-rect"> <a href="WN_PB_MO_GDS_020201.html">등록</a></button>
        </div>
      </article>
    </div><!-- /.main-content -->
  </main>
  <div class="quick-menu" id="quick-menu">
    <a href="WN_PB_MO_GDS_020601.html" class="quick-menu-button btn-chat"><i class="wn-icon wni-message-square">채팅상담</i></a>
    <a href="#" class="quick-menu-button" id="page-top-button"><i class="wn-icon wni-chevron-v">Top</i></a>
  </div>