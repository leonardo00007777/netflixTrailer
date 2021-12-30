/*
'*************************************************************************************
'20161110   hwkim   0.9     처음 초안 작성
'20180321   hwkim   0.9.1   플로팅 장바구니 담기 버튼 기능 추가.
'20190221   hwkim   -       로그인 여부에 따른 회원가입, 회사소개 표시
'20190612   hwkim   0.9.2   광고아이디 레코픽 전송 코드 적용
'20200714   hwkim   0.9.3   하단바 적용에 따른 코드 리팩토링 처리
'20200721   hwkim   -       적용
'20210114   hwkim   -       맨위로 버튼 위치 조정
'20211018   chhyeon -       상품상세페이지 쿠폰 다운로드(couponbox) 위치 조정
'**************************************************************************************
*/


    $(document).ready(function(){

        var currentUrl = window.location.href;
        var currentUrlFile = currentUrl.replace(/^.*[\\\/]/, '').replace(/\.[^\.]+$/, '');
        //GET query string 부분이나 책갈피 # 부분을 제외한다.
        var arrCurrentUrlFile;
        if(currentUrlFile.length > 0) {
            arrCurrentUrlFile = currentUrlFile.split("?");
            currentUrlFile = arrCurrentUrlFile[0];
            if(currentUrlFile.substring(0,1)=="#") {
                arrCurrentUrlFile = currentUrlFile.split("#");
                currentUrlFile = arrCurrentUrlFile[0];
            }
        }

        //상단 버튼 동적 변경 처리
        if(currentUrlFile=="item_detail_m") {
            if($('#div-bottom-bar').length > 0) {
                $("#div-goto-top").css("bottom","100px");
                $('#fixed-button-set').css('bottom','49px');
            } else {
                $("#div-goto-top").css("bottom","55px");
                $('#fixed-button-set').css('bottom','0');
                $('#couponBox').css('bottom','-49px');
            }
        } else {
            if($('#div-bottom-bar').length > 0) {
                if($('.bottom-banner').is(':visible')) {
                    $('.bottom-banner').css("bottom","50px");
                    $("#div-goto-top").css("bottom","120px");
                }
            } else {
                if($('.bottom-banner').is(':visible')) {
                    $("#div-goto-top").css("bottom","55px");
                } else {
                    $("#div-goto-top").css("bottom","5px");
                }
            }
        }

        //하단 버튼 동적 표시
        var lastScrollTop = 0;

        $(window).scroll(function(event){
            var st = $(this).scrollTop();
            if(st > 0) {
                $("#div-goto-top").show();
            } else {
                $("#div-goto-top").hide();
            }
            lastScrollTop = st;
        });

        $('#btnGotoTop').on('click',function(){
            $( 'html, body' ).animate( { scrollTop : 0 }, 400 );
            return false;
        });

    });

    var gaid = "";
    var idfa = "";
    if(window.Android) {
        gaid = window.Android.getGaid();
        if(gaid != "") recoPick('setGAID', gaid);
    } else if(typeof webkit != "undefined")  {
        webkit.messageHandlers.getIdfa.postMessage("");
    }
    
    function setIdfa(fa) {
        idfa = fa;
        if(idfa != "") recoPick('setIDFA', idfa);
    }
