/*
'/*****************************************************************************
'System        : 62life.com
'Program       :
'Title         : 자연이랑 모바일 첫 페이지
'File          : mainm.asp
'Program Type  : asp
'Analyst       :
'Author        : hwkim
'Date Started  : 20161107
'Last Modified :
'Called By     :
'Parameters    :
'Purpose       :
'Version       :
'
'Modified   Author  V/M     Reason For Modification
'---------  ------  ----    ------------------------------------------------------
'20161107   hwkim   0.9     처음 작성
'20161227   hwkim   0.9.1   처음 표시 방식 개선 - 동시 백그라운드 로딩 처리
'20161229   hwkim   0.9.2   카테고리 버튼 디자인 변경
'20170106   hwkim   0.9.3   (자연이랑)소식 정보 탭 추가 - 확대
'20170202   hwkim   0.9.4   업체 직배송 상품 처리 추가.
'20170209   hwkim   0.9.5   자동로그인 기능 개선
'20170303   hwkim   0.9.6   첫 화면 로딩 속도 향상 처리 / 이전, 다음 탭의 정보만 미리 로딩
'20170331   hwkim   0.9.7   바로 가기 아이콘 디자인 변경 v20170331
'20170614   hwkim   0.9.8   제한된 시간에 따라 당일발송 배너를 표시
'20171012   hwkim   0.9.9   품절 및 일시판매중지 상품, 표시 제외
'20171208   hwkim   -       FCM 토큰, 아이디 매칭을 위한 함수 추가.
'20180114   hwkim   1.0     상품표시 레이아웃 개선. 모바일용 세로비율 그림 적용
'20180227   hwkim   1.0.1   첫 화면 그리드 표시 방식으로 변경, swiper 리팩토링
'20180423   hwkim   -       freewall 첫화면 지연 표시 개선
'20180524   hwkim   1.0.2   티커 부분 제거, 레시피 배너 제거 및 레시피 고정 아이콘 추가
'20180621   hyeok   -       세트유형(20)상품 추천,할인상품, 신상품 목록에 표시 조건 추가
'20180629   sykim   -       7시 > 8시 당일발송 변경.
'20180723   hwkim   -       상품간략 설명이 없을 경우, 높이를 맞추기 위해 공백으로 표시
'20180803   hwkim   1.0.3   상품등급 라벨 표시, 할인율 사각형스티커 변경, 장바구니 표시 축소, 흐리게 등
'20180808   hwkim   -       건강식품 카테고리 추가 (고객센터 제외)
'20180821   sykim   -       배송휴일의 전날과 당일은 당일발송 배너 제외기능 추가.
'20180928   hwkim   -       배너 자동표시 임시처리. 후 지울것.
'20181005   hwkim   1.0.4   할인상품 다양한 상품을 표시하기 위한 조작
'20190103   hwkim   1.0.5   iOS 대응 webkit 객체 판단 처리 추가.
'20190104   hwkim   1.0.6   자동로그인 시 fcm 파라미터 유지 처리 강화 적용.
'20190124   hwkim   1.0.7   첫 화면 속도문제로 '할인중인 상품' 제거 (탭, 할인관에 있음)
'20190128   hwkim   -       '할인중인 상품' 속도 개선 후 무작위 처리 다시 도입.
'20190722   hwkim   -       중앙 '레시피' 아이콘, '멤버십안내'로 변경
'20190828   hwkim   -       전문관을 기획전으로 대체(복원)
'20200310   -       -       202003 리뉴얼 적용
'20200713   hwkim   1.1     하단 바 적용, 앱전용 파라미터 추가
'20200721   hwkim   1.1.1   세션처리 하단바 표시 제어
'20201019   chhyeon 1.2.1   모바일 HM 1차 변경
'20201113   chhyeon 1.2.2   더 자연이랑 멤버십 배너추가
'20201130   chhyeon 1.3     홈메인 변경
'20201207   chhyeon 1.4     하단 바 useragent 값으로 처리하도록 변경
'20210107   chhyeon 1.4.1   신상품, 할인중인 상품 더보기 시 상단 탭으로 이동하도록 변경.
'20210114   chhyeon 1.4.2   상단 nav 이동 시 하단 짤림 문제 보완 - swipe 라이브러리 자동 높이 조정 기능 이슈, 첫 페이지 로딩 시 모든 콘텐츠를 불러오는 방식으로 변경
'20210114   hwkim   -       하단 배너 유무에 따른 상단으로 버튼 위치 조정
'20210118   chhyeon 1.5.0   상단nav(신상품,베스트,할인관) 필터링 처리 추가
'20210125   chhyeon 1.6.0   신상품, 베스트, 할인관 x2 처리
'20210128   chhyeon -       헤더 IOS 디자인 가이드 적용
'20210204   chhyeon 1.6.1   사용자 정의 (고객)그룹 표시 제한 방식 적용
'20210310   chhyeon 1.7     홈메인 개편
'20210708   chhyeon 1.8     일일특가(기간특가) 처리 개선
'20210715   chhyeon 1.9     제철의 맛 변경.
'20210728   hwkim   1.9.1   모바일 전용 url링크 정보 추가. ad_mainimg.urlm
'20210805   chhyeon 1.9.2   모바일 url 체크 부분 쿼리 보완
'20210903   chhyeon 2.0     일일특가 스와이프 형식으로 개편
'                           불필요한 코드 간단하게 정리, 인라인 스타일 정리(추가정리필요)
'20210906   hnjang  2.1     배송유형별(자연이랑,업체직송) 분류 기능 추가
'******************************************************************************/

 
  var eventbanner_swiper = new Swiper('.swiper-eventbanner', {
	    slidesPerView: 'auto',
	    spaceBetween: 10,
	    loop: true,
	    watchOverflow: true,
	    pagination: {
	       el: '.swiper-pagination',
	           clickable: true,
	        },
	        autoplay: {
	          delay: 5000,
	          disableOnInteraction: false
	        },
   });
  
function openIntroVideo() {
      $('#intro-video-wrap iframe').attr('src', 'https://www.youtube.com/embed/AzGTyf3Fc6A');
      $('#intro-video-wrap').fadeIn();
  }

  function closeIntroVideo() {
      $('#intro-video-wrap iframe').attr('src', '');
      $('#intro-video-wrap').fadeOut();
  }
                           
  function closeJoinPointPop() {
      setCookie('closeJoinLayer', 'true' , 1);
      $('.bottom-banner').css('display', 'none');
      if($('#div-bottom-bar').length > 0) {
        $("#div-goto-top").css("bottom","50px");
      } else {
          $("#div-goto-top").css("bottom","5px");
      }
  }

  function closeJoinPointPop() {
      setCookie('closeJoinLayer', 'true' , 1);
      $('.bottom-banner').css('display', 'none');
  }

  var swiper_1, swiper_2;

    $(document).ready(function(){
        var width = $(window).width();
        var recopickHTML = "";
        if (width <= 450){
            recopickHTML = "<div id=\'recopick_widget_McMxEaTK\' data-widget_id=\'McMxEaTK\'><script>(function(w,n){w[n]=w[n]||function(){(w[n].q=w[n].q||[]).push(arguments)};}(window, \'recoPick\'));recoPick(\'widget\', \'recopick_widget_McMxEaTK\');<" + "/script></div>";
        }else if(width <= 600){
            recopickHTML = "<div id=\'recopick_widget_KiKjL9cM\' data-widget_id=\'KiKjL9cM\'><script>(function(w,n){w[n]=w[n]||function(){(w[n].q=w[n].q||[]).push(arguments)};}(window, \'recoPick\'));recoPick(\'widget\', \'recopick_widget_KiKjL9cM\');<" + "/script></div>";
        }else{
            recopickHTML = "<div id=\'recopick_widget_aT6M4qiM\' data-widget_id=\'aT6M4qiM\'><script>(function(w,n){w[n]=w[n]||function(){(w[n].q=w[n].q||[]).push(arguments)};}(window, \'recoPick\'));recoPick(\'widget\', \'recopick_widget_aT6M4qiM\');<" + "/script></div>";
        }
        $('#recopickWidget').html(recopickHTML);

        <!-- Initialize Swiper -->
        swiper_1 = new Swiper('.swiper-tab', {
            slidesPerView: 4,
            paginationClickable: true,
            spaceBetween: 10,
            freeMode: true,
            setWrapperSize: true,
        });
        swiper_2 = new Swiper('.swiper-content', {
            autoHeight: true,
            slidesPerView: 1,
            spaceBetween: 0,
            pagination: false,
            simulateTouch: false,
            loop: true,
            loopAdditionalSlides: 0,
            touchAngle: 20,
            on: {
                init: function(){
                    //$('.swiper-tab .tabs > li').removeClass('active').eq(0).addClass('active');
                }
            }
        });
        var tabLen = $('.swiper-tab .tabs > li').length;

        swiper_2.on('slideChangeTransitionStart', function() {
            var idx = swiper_2.activeIndex;

            if(idx == 0) idx = tabLen+1;
            if(idx > tabLen+1) idx = 1;

            if (idx == 1) {
                swiper_1.slideTo(0, 300);
                $('.swiper-tab .tabs > li').removeClass('active');
            } else {
                swiper_1.slideTo(idx-2, 300);
                $('.swiper-tab .tabs > li').removeClass('active').eq(idx-2).addClass('active');
            }
            loadingContent(idx);
        });

        $('.swiper-tab .tabs > li > a').on('click', function(e){
            $(this).parent().addClass('active').siblings().removeClass('active');
            var tabIdx = $(this).parent().index();
            swiper_2.slideTo(tabIdx+2, 300);
            e.preventDefault();
        });

        checkForHash();

        //추천상품 영역 swiper비활성화 처리
        var recommswiper = new Swiper('#freewall-recommend', {
            noSwiping: true
        });

        //새로나온 상품 swiper비활성화 처리
        var newitemswiper = new Swiper('#freewall-new', {
            noSwiping: true
        });

        //할인중인 상품 swiper비활성화 처리
        var newitemswiper = new Swiper('#freewall-discount', {
            noSwiping: true
        });

        $(window).on('hashchange', function() {
            checkForHash();
        });

        /* 제철관 배너 변경 */
        var main_seasonalfood = new Swiper('.swiper-seasonalfood', {
          loop: true,
          slidesPerView: 'auto',
          spaceBetween: 20,
          autoplay: {
              delay: 5000,
              disableOnInteraction: false
            },
          pagination: {
              el: '.swiper-pagination',
              clickable: true,
            },
        });
        
        /* 베스트 리뷰 상품 */
        var main_bestreview = new Swiper('.swiper-bestreview', {
          loop: true,
          slidesPerView: 'auto',
          spaceBetween: 20,
          autoplay: {
              delay: 5000,
              disableOnInteraction: false
            },
          pagination: {
              el: '.swiper-pagination',
              clickable: true,
            },
        });
        
        if($('.ul-new').find("li").length == 0) getNewList(0);
        if($('.ul-hot').find("li").length == 0) getHotList(0);
        if($('.ul-discount').find("li").length == 0) getDiscountList(0);
        if($('.ul-event').find("li").length == 0) getEvent(1);
        if($('.ul-news').find("li").length == 0) getNews(1);
    });

    // Android : android, iOS : webkit 객체 판단 추가
    function callFCMSync() {
        var android = window.Android;
        if(android) {
            android.callFCMIdSync('<%=strLoginMemCd%>');
        } else if(typeof webkit != "undefined")  {
            webkit.messageHandlers.callFCMIdSync.postMessage('<%=strLoginMemCd%>');
        }
    }

    function loadingContent(idx) {
        var page2 = parseInt($('#page2').val());
        var page3 = parseInt($('#page3').val());
        var page4 = parseInt($('#page4').val());

        if(idx == 2 || idx == 3 || idx == 4){
        //if(idx == 2 || idx == 4){
            $('#popFilter').show();
        }else{
            $('#popFilter').hide();
        }

        switch(idx) {
            case 1:
                //홈
                fixViewport();

                break;
            case 2:
                //신제품
                fixViewport();
                if($('.ul-new').find("li").length == 0) getNewList(1);
                showFilter(1);
                showFilter2(1);

                break;
            case 3:
                //인기
                fixViewport();
                if($('.ul-hot').find("li").length == 0) getHotList(1);
                showFilter(2);
                showFilter2(2);

                break;
            case 4:
                //할인중
                fixViewport();
                if($('.ul-discount').find("li").length == 0) getDiscountList(1);
                showFilter(3);
                showFilter2(3);

                break;
            case 5:
                //이벤트
                zoomViewport();
                if($('.ul-event').find("li").length == 0) getEvent(1);

                break;
            case 6:
                //자연이랑
                fixViewport();
                if($('.ul-event').find("li").length == 0) getEvent(1);
                
                break;
            case 7:
                //행복소식
                zoomViewport();
                //if($('.ul-news').find("li").length == 0) getNews(1);

                break;
            default:
        }
        //$('#mtab'+idx).click();
    }

    function changeSortingOptionNew(){
        $('.ul-new').empty();
        delayUpdate();
        getNewList(1);
    }
    function changeSortingOptionHot(){
        $('.ul-hot').empty();
        delayUpdate();
        getHotList(1);
    }
    function changeSortingOptionDis(){
        $('.ul-discount').empty();
        delayUpdate();
        getDiscountList(1);
    }

    function showFilter(num){
        for(var i=1; i <= 3; i++){
            if(num == i){
                $('#pOption'+i).show();
            }else{
                $('#pOption'+i).hide();
            }
        }
    }
    
    function showFilter2(num){
        for(var i=1; i <= 3; i++){
            if(num == i){
                $('#dOption'+i).show();
            }else{
                $('#dOption'+i).hide();
            }
        }
    }

    function checkForHash() {
        if(document.location.hash){
            var HashLocationName = document.location.hash;
            HashLocationName = HashLocationName.replace("#","");
            var arrtemp = HashLocationName.split("-");
            var ctab = parseInt(arrtemp[0]);
            var npage = parseInt(arrtemp[1]);
            var cgdcd = parseInt(arrtemp[2]);
            if(ctab != "" && ctab != null){
                $('#mtab'+ctab).click();
                $('#hash'+ctab).val(npage+"-"+ctab+"-"+cgdcd);
            }
        } else {

        }
    }

    function moveToContent(ctab) {
        var hashl = $('#hash'+ctab).val();
        var position = null;
        if($('#'+hashl).length > 0){
            position = $('#'+hashl).offset();
            $('html, body').animate({scrollTop : position.top}, 300);
        }
    }

    function showProductDetailNoHash(urlx){
        document.location.hash = "";
        location.href = urlx;
    }

    function showProductDetail(urlx, tab, gdcd, currentPage){
        var tabidx;

        if(tab=="new") {
            tabidx = 1;
        } else if(tab=="hot") {
            tabidx = 2;
        } else if(tab=="discount") {
            tabidx = 3;
        } else if(tab=="hot") {
            tabidx = 4;
        } else if(tab=="event") {
            tabidx = 5;
        } else if(tab=="withnature") {
            tabidx = 6;
        } else if(tab=="news") {
            tabidx = 7;
        } else {
            tabidx = "0";
        }

        window.location.hash = "#" + tabidx + "-" + currentPage + "-" + gdcd;
        location.href = urlx;
    }

    function delayUpdate() {
        swiper_2.update();
    }

    function getNewList(page) {
        var orderby = $("#pOption1").val();
        var dispatchtype = $("#dOption1").val();
        var flagfirst = false;
        if(page == 0){
            flagfirst = true;
            page = 1;
        }
        $("#div-loading-noback").show();
        $.ajax({
            type: 'POST',
            url: "/m/goods/get_new_list_x2_m.asp",
            data: "page="+page+"&opcart=show&orderby="+orderby+"&dispatchtype="+dispatchtype,
            success: function(html) {
                if(html) {
                    $('.new-button').remove();
                    $(".ul-new").append(html);
                    $('#page2').val(page);
                }
                $("#div-loading-noback").hide();
            },
            complete: function(data) {
                moveToContent(2);
                if(!flagfirst){
                    $("img").load(function(){
                        delayUpdate();
                    });
                }
            },
            error: function(request,status,error) {
                $("#div-loading-noback").hide();
            }
        });
    }

    function getHotList(page) {
        var orderby = $("#pOption2").val();
        var dispatchtype = $("#dOption2").val();
        var flagfirst = false;
        if(page == 0){
            flagfirst = true;
            page = 1;
        }
        $("#div-loading-noback").show();
        $.ajax({
            type: 'POST',
            url: "/m/goods/get_hot_list_x2_m.asp",
            data: "page="+page+"&opcart=show&orderby="+orderby+"&dispatchtype="+dispatchtype,
            success: function(html) {
                if(html) {
                    $('.hot-button').remove();
                    $(".ul-hot").append(html);
                    $('#page3').val(page);
                }
                $("#div-loading-noback").hide();
            },
            complete: function(data) {
                moveToContent(3);
                if(!flagfirst){
                    $("img").load(function(){
                        delayUpdate();
                    });
                }
            },
            error: function(request,status,error) {
                $("#div-loading-noback").hide();
            }
        });
    }

    function getDiscountList(page) {
        var orderby = $("#pOption3").val();
        var dispatchtype = $("#dOption3").val();
        var flagfirst = false;
        if(page == 0){
            flagfirst = true;
            page = 1;
        }
        $("#div-loading-noback").show();
        $.ajax({
            type: 'POST',
            url: "/m/goods/get_discount_list_x2_m.asp",
            data: "page="+page+"&opcart=show&orderby="+orderby+"&dispatchtype="+dispatchtype,
            success: function(html) {
                if(html) {
                    $('.discount-button').remove();
                    $(".ul-discount").append(html);
                    $('#page4').val(page);
                }
                $("#div-loading-noback").hide();
            },
            complete: function(data) {
                if(!flagfirst){
                    $("img").load(function(){
                        delayUpdate();
                    });
                }
            },
            error: function(request,status,error) {
                $("#div-loading-noback").hide();
            }
        });
    }

    function getNews(page) {
        $("#div-loading-noback").show();
        $.ajax({
            type: 'POST',
            url: "/m/community/get_magazine_m.asp",
            data: "",
            success: function(html) {
                if(html) {
                    $(".ul-news").empty();
                    $(".ul-news").append(html);
                    $('.ul-news img').css('max-width','100%');
                    $('.ul-news img').css('height','auto');
                }
                $("#div-loading-noback").hide();
            },
            complete: function(data) {
                $("img").load(function(){
                    delayUpdate();
                });
            },
            error: function(request,status,error) {
                $("#div-loading-noback").hide();
            }
        });
    }

    function getEvent(page) {
        $("#div-loading-noback").show();
        $.ajax({
            type: 'POST',
            url: "/m/community/get_news_m.asp",
            data: "page="+page+"&bdtype=event",
            success: function(html) {
                if(html) {
                    $(".ul-event").empty();
                    $(".ul-event").append(html);
                    $('.ul-event img').css('max-width','100%');
                    $('.ul-event img').css('height','auto');
                    //태블릿 크기 경우 레이아웃 중앙정렬
                    if($('.ul-event #divBbsContents').length > 0) $('.ul-event #divBbsContents').css('text-align','center');
                }
                $("#div-loading-noback").hide();
            },
            complete: function(data) {
                $("img").load(function(){
                    delayUpdate();
                });
            },
            error: function(request,status,error) {
                $("#div-loading-noback").hide();
            }
        });
    }

    function fixViewport() {
        $("meta[name=viewport]").attr("content","user-scalable=yes, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width, height=device-height");
    }

    function zoomViewport() {
        $("meta[name=viewport]").attr("content","user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, minimum-scale=1.0, width=device-width, height=device-height");
    }

    $(window).load (function(){
        delayUpdate();
    });
