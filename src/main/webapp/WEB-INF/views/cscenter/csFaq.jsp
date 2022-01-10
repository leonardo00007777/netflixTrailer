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
          <a href="WN_PB_MO_MYP_000100.html" class="btn-prev"><i class="wn-icon wni-arrow-left"></i></a>
          <div class="h-row">
            <div class="h-col h-tit">
              <h1 class="page-tit text-center">자주 찾는 질문</h1>
            </div>
          </div>
        </div>
      </div>
    </header>
    <main class="main-container" id="main-container">
      <div class="main-content" id="main-content">
        <article>
          <section class="search-box-container">
            <div class="search-box-fixed">
              <div class="search-box">
                <input type="text" class="input-text input-search" placeholder="검색">
                <button class="btn-search-clear" onclick=""></button>
                <button type="submit" class="btn-search-icon" title="검색"></button>
              </div>
            </div>
          </section>
          <section class="px-m">
            <table class="tile-table select-group">
              <tr>
                <td><a href="#" class="select-item tile-button active">전체 (121)</a></td>
                <td><a href="#" class="select-item tile-button">회원(20)</a></td>
                <td><a href="#" class="select-item tile-button">결제(19)</a></td>
              </tr>
              <tr>
                <td><a href="#" class="select-item tile-button">주문(15)</a></td>
                <td><a href="#" class="select-item tile-button">배송/반품(5) </a></td>
                <td><a href="#" class="select-item tile-button">상품(41)</a></td>
              </tr>
              <tr>
                <td><a href="#" class="select-item tile-button">서비스(7)</a></td>
                <td><a href="#" class="select-item tile-button">기타(14)</a></td>
                <td></td>
              </tr>
            </table>
          </section>
          <!-- 검색 결과 수 노출 -->
          <!-- <header class="search-result-header">
            <h3 class="result"><b class="t-hd">가입절차</b> <span class="green-sub ml-2">검색결과 3건</span></h3>
          </header> -->
          <section class="el-container px-m">
            <ul class="wn-accordion ani faq-acc">
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit faq-acc-tit">
                  <div class="content">
                    <p class="tit">SK회원은 무엇이고 어떤 혜택이 있나요?</p>
                    <p class="cat">회원</p>
                  </div>
                </h4>
                <div class="wn-accordion-content">
                  <div class="wrapper faq-acc-detail">
                    <section class="editor-content">
                      자연이랑과 제휴된 SK 계열/관계사에서는 농촌과 서로 돕는 의미로 신뢰할 수 있는 농축수산물을 구입할 수 있도록 지원금을 제공하고 있습니다.<br>
                      따라서, SK회원은 SK 계열/관계사 직원만이 가입할 수 있습니다. SK 계열/관계사 별로 복리후생차원에서 직원에게 자연이랑에서 구매한 상품금액의 일부를 회사에서 지원해
                      주거나,<br>
                      급여공제로 결제 할 수 있도록 하는 서비스를 제공해드립니다.<br>
                      이러한 혜택을 받으시기 위해서는 반드시 인증하신 후 주문하셔야 합니다.<br>
                      <br>
                      <a href="#">SK회원인증 바로가기</a>
                      <br>
                      감사합니다.
                      <br><br>
                      친환경농산물은 건강을 지키고, 도시와 농촌이 서로 돕고,
                      환경을 살립니다
                    </section>
                    <footer class="faq-acc-detail-footer">
                      <div class="text">더 자세한 답변을 원한다면 1:1문의를 클릭해주세요!</div>
                      <div class="controls">
                        <a href="#" class="button bt-outline bt-green w-100">1:1 문의</a>
                      </div>
                    </footer>
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit faq-acc-tit">
                  <div class="content">
                    <p class="tit">SK회원 가입절차와 인증은 어떻게 하나요?</p>
                    <p class="cat">회원</p>
                  </div>
                </h4>
                <div class="wn-accordion-content">
                  <div class="wrapper faq-acc-detail">
                    <section class="editor-content">
                      자연이랑과 제휴된 SK 계열/관계사에서는 농촌과 서로 돕는 의미로 신뢰할 수 있는 농축수산물을 구입할 수 있도록 지원금을 제공하고 있습니다.<br>
                      따라서, SK회원은 SK 계열/관계사 직원만이 가입할 수 있습니다. SK 계열/관계사 별로 복리후생차원에서 직원에게 자연이랑에서 구매한 상품금액의 일부를 회사에서 지원해
                      주거나,<br>
                      급여공제로 결제 할 수 있도록 하는 서비스를 제공해드립니다.<br>
                      이러한 혜택을 받으시기 위해서는 반드시 인증하신 후 주문하셔야 합니다.<br>
                      <br>
                      <a href="#">SK회원인증 바로가기</a>
                      <br>
                      감사합니다.
                      <br><br>
                      친환경농산물은 건강을 지키고, 도시와 농촌이 서로 돕고,
                      환경을 살립니다
                    </section>
                    <footer class="faq-acc-detail-footer">
                      <div class="text">더 자세한 답변을 원한다면 1:1문의를 클릭해주세요!</div>
                      <div class="controls">
                        <a href="#" class="button bt-outline bt-green w-100">1:1 문의</a>
                      </div>
                    </footer>
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit faq-acc-tit">
                  <div class="content">
                    <p class="tit">전화, 이메일, 팩스로도 주문이 가능한가요? 전화, 이메일, 팩스로도 주문이 가능가요?</p>
                    <p class="cat">회원</p>
                  </div>
                </h4>
                <div class="wn-accordion-content">
                  <div class="wrapper faq-acc-detail">
                    <section class="editor-content">
                      자연이랑과 제휴된 SK 계열/관계사에서는 농촌과 서로 돕는 의미로 신뢰할 수 있는 농축수산물을 구입할 수 있도록 지원금을 제공하고 있습니다.<br>
                      따라서, SK회원은 SK 계열/관계사 직원만이 가입할 수 있습니다. SK 계열/관계사 별로 복리후생차원에서 직원에게 자연이랑에서 구매한 상품금액의 일부를 회사에서 지원해
                      주거나,<br>
                      급여공제로 결제 할 수 있도록 하는 서비스를 제공해드립니다.<br>
                      이러한 혜택을 받으시기 위해서는 반드시 인증하신 후 주문하셔야 합니다.<br>
                      <br>
                      <a href="#">SK회원인증 바로가기</a>
                      <br>
                      감사합니다.
                      <br><br>
                      친환경농산물은 건강을 지키고, 도시와 농촌이 서로 돕고,
                      환경을 살립니다
                    </section>
                    <footer class="faq-acc-detail-footer">
                      <div class="text">더 자세한 답변을 원한다면 1:1문의를 클릭해주세요!</div>
                      <div class="controls">
                        <a href="#" class="button bt-outline bt-green w-100">1:1 문의</a>
                      </div>
                    </footer>
                  </div>
                </div>
              </li>
              <li class="wn-accordion-item">
                <h4 class="wn-accordion-tit faq-acc-tit">
                  <div class="content">
                    <p class="tit">지원금이란 무엇인가요?</p>
                    <p class="cat">회원</p>
                  </div>
                </h4>
                <div class="wn-accordion-content">
                  <div class="wrapper faq-acc-detail">
                    <section class="editor-content">
                      자연이랑과 제휴된 SK 계열/관계사에서는 농촌과 서로 돕는 의미로 신뢰할 수 있는 농축수산물을 구입할 수 있도록 지원금을 제공하고 있습니다.<br>
                      따라서, SK회원은 SK 계열/관계사 직원만이 가입할 수 있습니다. SK 계열/관계사 별로 복리후생차원에서 직원에게 자연이랑에서 구매한 상품금액의 일부를 회사에서 지원해
                      주거나,<br>
                      급여공제로 결제 할 수 있도록 하는 서비스를 제공해드립니다.<br>
                      이러한 혜택을 받으시기 위해서는 반드시 인증하신 후 주문하셔야 합니다.<br>
                      <br>
                      <a href="#">SK회원인증 바로가기</a>
                      <br>
                      감사합니다.
                      <br><br>
                      친환경농산물은 건강을 지키고, 도시와 농촌이 서로 돕고,
                      환경을 살립니다
                    </section>
                    <footer class="faq-acc-detail-footer">
                      <div class="text">더 자세한 답변을 원한다면 1:1문의를 클릭해주세요!</div>
                      <div class="controls">
                        <a href="#" class="button bt-outline bt-green w-100">1:1 문의</a>
                      </div>
                    </footer>
                  </div>
                </div>
              </li>
            </ul>
          </section>
        </article>

        <hr class="spacer-bottom">
      </div><!-- /.main-content -->
    </main>
    <div class="quick-menu" id="quick-menu">
      <a href="#" class="quick-menu-button btn-chat"><i class="wn-icon wni-message-square">채팅상담</i></a>
      <a href="#" class="quick-menu-button" id="page-top-button"><i class="wn-icon wni-chevron-v">Top</i></a>
    </div>
  </div><!-- /.site-container -->
