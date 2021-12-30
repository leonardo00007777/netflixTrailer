/*
'*****************************************************************
'20161110   hwkim   0.9     처음 초안 작성
'20161124   hwkim   0.9.1   메뉴 표시 방식 변경
'20161228   hwkim   0.9.2   검색창 스와이프 되돌이 버그 수정 (미완료)
'20180710   hwkim   0.9.3   검색창 새로운 라이브러리로 변경 적용
'20180713   hwkim   -       Recopick 시범적용
'20181114   hwkim   0.9.2   앱 연동을 위한 toggleMenuNav(), toggleSearchNav() 추가
'20181220   hwkim   0.9.3   상단 고정 타이틀, 검색 창 한 줄 변경
'20190103   hwkim   0.9.4   설정 바로가기 iOS적용 goSettingsPage()
'20200320   hyeok,hwkim     검색 자동제시어 기능 추가
'20200713   hwkim   0.9.5   하단 바 적용, 상단 메뉴바 제거
'20200721   hwkim   -       실 서비스 적용
'20200728   hwkim   0.9.6   앱 알림등의 처리를 통한 접근 시 하단바 이슈 보완 / imo paramemter
'20201207   chhyeon 0.9.7   하단 바 useragent 값으로 처리하도록 변경 : 20210308 hwkim agent 값은 소문자 임.
'20210114   hwkim   -       맨위로 버튼 위치 조정
'20210305   hwkim   -       검색 레이아웃 조정
'20210827   hwkim   -       모바일 하단바 표시 처리 공통함수로 변경
'*****************************************************************
*/
			$(function() {
                $.ajax({
                    type : 'get',
                    url : "/m/common/jsonSearchAutocomplete.asp",
                    dataType : "json",
                    success : function(data) {
                        // 초성 검색 가능하도록 자모음 분리해서 js object 배열 생성
                        // 예시: 김치볶음밥
                        let source = $.map(data.data, function(item) {
                            chosung = "";
                            //Hangul.d(item, true) 자모음 분리, 이때 0번 인덱스는 첫번째 자음(초성)
                            full = Hangul.disassemble(item).join("").replace(/ /gi, ""); //공백제거된 ㄱㅣㅁㅊㅣㅂㅗㄲㅇㅡㅁㅂㅏㅂ

                            Hangul.d(item, true).forEach(function(strItem, index) {
                                if(strItem[0] != " "){ //공백문자는 제외
                                    chosung += strItem[0]; //초성 추가
                                }
                            });
                            return {
                                label : chosung + "|" + (item).replace(/ /gi, "") +"|" + full, //ㄱㅊㅂㅇㅂ|김치볶음밥|ㄱㅣㅁㅊㅣㅂㅗㄲㅇㅡㅁㅂㅏㅂ 저장
                                value : item, //김치 볶음밥
                                chosung : chosung, //ㄱㅊㅂㅇㅂ,
                                full : full
                            }
                        });

                        $("#h_search").autocomplete({
                            source : source,
                            appendTo : "#autocomplete-wrap",
                            minLength : 1,
                            autoFocus : false,
                            response: function (event, ui) {
                                ui.content.push({ value:'<div style="height:30px;padding-bottom:6px;text-align:right;box-shadow: 0 4px 2px -2px #eee;">[닫기]&nbsp;</div>', id:0, label:'Close' });
                            },
                            select : function(event, ui) { //아이템 선택시
                                if(ui.item.label != "Close") {
                                    $('#h_search').val(ui.item.value);
                                    doSearch();
                                } else {
                                    return false;
                                }
                            },
                            focus : function(event, ui) { //포커스 가면
                                return false; //한글 에러 잡기용도로 사용됨
                            }
                        }).autocomplete( "instance" )._renderItem = function(ul, item) {
                            // 자동완성 instance rendering시 값을 임의로 변경(앞서 source배열은
                            //ㄱㅊㅂㅇㅂ|김치볶음밥|ㄱㅣㅁㅊㅣㅂㅗㄲㅇㅡㅁㅂㅏㅂ 이 저장되어 있으므로 자동완성 UI에 해당 문자열이 표시되면 안됨
                            return $('<li>')
                                   .append('<div style="height:30px;padding-top:6px;">' + item.value + '</div>') //item.value에는 자모음 분리 이전 원래 상품명이 저장되어 있음
                                   .appendTo(ul);
                        };
                    },
                });

                /*
                 * 20200313 hyeok 속도 이슈로 비활성화
                //초중종성 검색
                $("#h_search").on("keyup",function(){  //검색창에 뭔가가 입력될 때마다
                    input = $("#h_search").val();  //입력된 값 저장
                    $( "#h_search" ).autocomplete("search", Hangul.disassemble(input).join("").replace(/ /gi, "")); //자모 분리후 띄어쓰기 삭제
                })
                 */
            });



    var swiper_search, swiper_search2;
    var isFirstOpen, isOpenMenu, isOpenSearch;
    isFirstOpen = true;
    isOpenMenu = false;
    isOpenSearch = false;

    function toggleMenuNav() {
        if(isOpenMenu) {
            closeMenuNav();
        } else {
            openMenuNav();
        }
    }

    function openMenuNav() {
        $('#leftMenuPannel').animate({'left':'0'},300,'easeInQuart',function(){
            $('.gwrapper').hide();
        });
        isOpenMenu = true;
		if($('.fixed-button-set').length > 0) $('.fixed-button-set').css('position','relative');
    }

    function closeMenuNav() {
        $('.gwrapper').show();
        //$('.scroll-to-fixed-fixed').css('position','static');
        //$('.fixspacer').css('display','none');
        $('#leftMenuPannel').animate({'left':'-100%'},500,'easeInQuart',function(){

        });
        isOpenMenu = false;
		if($('.fixed-button-set').length > 0) $('.fixed-button-set').css('position','fixed');
    }

    function toggleSearchNav() {
        if(isOpenSearch) {
            closeSearchNav();
        } else {
            openSearchNav();
        }
    }

    function openSearchNav() {

        $('#searchPannel').show();
        $('#h_search').focus();
        $('.gwrapper').hide();

        if (isFirstOpen) {
            isFirstOpen = false;

            swiper_search = new Swiper('.swiper-search', {
                pagination: '.swiper-search .swiper-pagination',
                slidesPerView: 3,
                paginationClickable: true,
                spaceBetween: 10,
                freeMode: true,
                pagination: false,
                onlyExternal: true
            });

            swiper_search2 = new Swiper('.swiper-search2', {
                autoHeight: true,
                slidesPerView: 1,
                spaceBetween: 0,
                pagination: false,
                loop: true,
                resizeReInit: true,
                on: {
                    init: function() {
                        $('.search-tabs > li').removeClass('active').eq(0).addClass('active');
                    }
                }
            });

            loadingSearchContent(1);  //처음 시작시 표시

            var tabLen = $('.search-tabs > li').length;
            swiper_search2.on('slideChangeTransitionStart', function() {
                $("#div-loading-noback").show();
                var idx = swiper_search2.activeIndex;
                if(idx == 0) idx = tabLen;
                if(idx > tabLen) {
                    idx = 1;
                    swiper_search2.slideTo(idx, 0);
                }
                swiper_search.slideTo(idx-1, 300);
                $('.search-tabs > li').removeClass('active').eq(idx-1).addClass('active');
                loadingSearchContent(idx);
            });

            swiper_search2.on('slideChangeTransitionEnd', function() {
                $("#div-loading-noback").hide();
            });

            $('.search-tabs > li > a').on('click', function(e) {
                $(this).parent().addClass('active').siblings().removeClass('active');
                var tabIdx = $(this).parent().index();
                swiper_search2.slideTo(tabIdx+1, 300);
                e.preventDefault();
            });
        }
        isOpenSearch = true;
    }

    function loadingSearchContent(idx) {
        switch(idx) {
            case 1:
                updateSearchHistory(swiper_search2.activeIndex,swiper_search2);
                break;
            case 2:
                updateSearchRank(swiper_search2.activeIndex,swiper_search2);
                break;
            case 3:
                updateSearchRecent(swiper_search2.activeIndex,swiper_search2);
                break;
            default:
        }
    }

    function closeSearchNav() {
        $('.gwrapper').show();
        //$('.scroll-to-fixed-fixed').css('position','static');
        //$('.fixspacer').css('display','none');
        $('#searchPannel').hide();
        isOpenSearch = false;
    }

    function updateSearchHistory(rootIdx,swiper) {
        var i, rootElem, ulElem, liElem;

        if (typeof(localStorage) == 'undefined') {
            //console.log('지원하지 않는 웹 브라우저 입니다!');
        } else {
            rootElem = $($('.swiper-search2').find('.swiper-wrapper div')[rootIdx]);
            rootElem.empty();

            if (localStorage.getItem('searchHistory') !== null) {
                var arrSearchHistory = localStorage.getItem('searchHistory').split(',');
                ulElem = $('<ul>');
                rootElem.append(ulElem);
                for (i=0; i<arrSearchHistory.length; i++) {
                    if(arrSearchHistory[i] != "") {
                        liElem  = '<li>';
                        liElem += '<a class="search2-txt" href="javascript:void(0);" data-index="' + i + '">' + arrSearchHistory[i] + '</a>';
                        liElem += '<a class="search2-del" href="javascript:void(0);"><img id="right-close-button" src="/m/images/icons/close_4web_128.png" /></a>';
                        liElem += '</li>';
                        ulElem.append(liElem);
                    }
                }
                $('#searchLog a.search2-txt').on('click', function(e) {
                    $('#h_search').val($(this).text());
                    doSearch();
                });
                $('#searchLog a.search2-del').on('click', function(e) {
                    var dataIdx = $(this).siblings('a').data('index');
                    arrSearchHistory.splice(dataIdx, 1);
                    if (arrSearchHistory.length == 0) {
                        localStorage.removeItem('searchHistory');
                    } else {
                        localStorage.setItem('searchHistory', arrSearchHistory.join(','));
                    }
                    updateSearchHistory(rootIdx,swiper);
                });
                var deleteAllHistory = $('<a class="search2-delall" href="javascript:void(0);">전체삭제</a>');
                deleteAllHistory.on('click', function(e) {
                    if (confirm('최근검색어를 모두 삭제하시겠습니까?')) {
                        localStorage.removeItem('searchHistory');
                        updateSearchHistory(rootIdx,swiper);
                    }
                });
                rootElem.append(deleteAllHistory);
            } else {
                rootElem.append('<p>최근 검색 내역이 없습니다.</p>');
            }
            if($('#searchPannel').is(':visible')) swiper.update(true);
        }
        $("#div-loading-noback").hide();
    }

    function updateSearchRank(rootIdx,swiper) {
        var rootElem;

        $.ajax({
            type: 'POST',
            url: '/m/common/get_search_rank.asp',
            success: function(html) {
                rootElem = $($('.swiper-search2').find('.swiper-wrapper div')[rootIdx]);
                rootElem.empty();
                if (html) {
                    rootElem.append(html);
                    $('#searchRank a.search2-txt').on('click', function(e) {
                        $('#h_search').val($(this).data('word'));
                        doSearch();
                    });
                } else {
                    rootElem.append('<p style="padding:20px 0;">등록된 인기검색어가 없습니다.</p>');
                }
                swiper.update(true);
                $("#div-loading-noback").hide();
            },
            error: function(request,status,error) {
                $("#div-loading-noback").hide();
            }
        });
    }

    function updateSearchRecent(rootIdx,swiper) {
        var rootElem;

        $.ajax({
            type: 'POST',
            url: '/m/common/get_search_recent_view.asp',
            success: function(html) {
                rootElem = $($('.swiper-search2').find('.swiper-wrapper div')[rootIdx]);
                rootElem.empty();
                if (html) {
                    rootElem.append(html);
                } else {
                    rootElem.append('<p style="padding:20px 0;">최근 본 상품이 없습니다.</p>');
                }
                swiper.update(true);
                $("#div-loading-noback").hide();
            },
            error: function(request,status,error) {
                $("#div-loading-noback").hide();
            }
        });
    }

    function doSearch() {
        var schVal = $('#h_search');
        if (schVal.val().trim() == '') {
            alert("검색어를 입력하세요!");
            schVal.focus();
            return false;
        } else {
            document.searchform.action = "/m/goods/search_m.asp";
            document.searchform.submit();
        }
    }

    function goMypage() {
        location.href = "/m/mypage/mypage_m.asp";
    }

    function goCart() {
        location.href = "/m/order/cart_m.asp";
    }
    function goHome() {
        location.href = "/m/mainm.asp";
    }

    function goSettingsPage() {
        var android = window.Android;
        if(android) {
            android.showSettingsPage();
        } else if(typeof webkit != "undefined")  {
            webkit.messageHandlers.showSettingsPage.postMessage("");
        } else {
            location.href = "/m/mypage/config_m.asp"
        }
    }
    
    function hpageback() {
        var android = window.Android;
        if(android) {
            android.goBackPage();
        } else {
            pageback();
        }
    }

    $(document).ready(function(){

        $('#rightMenu1').on('click',function(){
            openSearchNav();
            //toggleSearchNav();
        });
        $('#btnOpenMenu').on('click',function(e) {
            openMenuNav();
        });

        $(document).keyup(function(e) {
            var kcode = (e.keyCode ? e.keyCode : e.which);

            if(kcode == 27) {
                if(parseInt($('#leftMenuPannel').css('width')) > 0) {
                    closeMenuNav();
                }
                if(parseInt($('#searchPannel').css('width')) > 0) {
                    closeSearchNav();
                }

            }
        });


    });

  
  
  
  (function(w,d,n,s,e,o) {
     w[n]=w[n]||function(){(w[n].q=w[n].q||[]).push(arguments)};
     e=d.createElement(s);e.async=1;e.charset='utf-8';e.src='//static.recopick.com/dist/production.min.js';
     o=d.getElementsByTagName(s)[0];o.parentNode.insertBefore(e,o);
   })(window, document, 'recoPick', 'script');
   recoPick('service', 'm.62life.com');
   <% if Len(strResidentNo1) >= 2 then %>
   recoPick('setUserInfo', {'birthyear':'<%=getBirthYearFromResidentNo(strResidentNo1)%>','gender':'<%=getGenderFromDigit(strGender)%>'});
   <% end if %>
</script>
<!--RecoPick 로그수집 스크립트 -->

<!-- Google Analytics Start -->
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-42925481-1', 'auto');
  ga('require', 'displayfeatures');
  ga('send', 'pageview');

<!--Google Analytics End-->


<!-- Facebook Pixel Code -->
    !(function (f, b, e, v, n, t, s) {
        if (f.fbq) return;
        n = f.fbq = function () {
            n.callMethod ? n.callMethod.apply(n, arguments) : n.queue.push(arguments);
        };
        if (!f._fbq) f._fbq = n;
        n.push = n;
        n.loaded = !0;
        n.version = "2.0";
        n.queue = [];
        t = b.createElement(e);
        t.async = !0;
        t.src = v;
        s = b.getElementsByTagName(e)[0];
        s.parentNode.insertBefore(t, s);
    })(window, document, "script", "https://connect.facebook.net/en_US/fbevents.js");
    fbq("init", "1016007328763714");
    fbq("track", "PageView");
