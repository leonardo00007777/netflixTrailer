/* jQuery Ready */
$(function() {

	mainm().init();
	mainm().initKeyEvent();
	
});


//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//														mainm
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var mainm = function() {

	return {
		init : function() {
//		    // 모바일 left 메뉴 화살표
//		    $('.li-category-title').click((){
//		        $(this).find('.li-category-arrow-img').toggleClass('on');
//		    });
//
//		    // 모바일 left 탭메뉴
//		    $(".leftmenu-tab ul li").click(function(){
//		        $(this).toggleClass('on').siblings().removeClass('on');
//		        $("#"+$(this).data('id')).slideToggle(300).siblings().slideUp(300);
//		    });
		},
		
		cannotAccess  : function() {
			 alert('접근할 수 없습니다. 권한이 부족합니다.');
		},
		
		goUrl : function(_url) {
			var url = "/cart";
			switch (_url) {
				case "cart":
					url = "/mypage/cartList";
					break;
				default:
					break;
			}
		 
			let f = document.createElement('form');
			 f.setAttribute('method', 'post');
			 f.setAttribute('action', url);
			 document.body.appendChild(f);
			 f.submit();
		},
		
		//------------------------------------------------------------
		// Key Event 
		//------------------------------------------------------------
		initKeyEvent : function() {

	        
		},
		
		getDummy : function() {
			return new Date().getTime() + Math.ceil(Math.random() * 2147483647);
		},
		
		addEvent : function(agEle, agType, agHandler) {
			if (!(agEle && agType && agHandler)) {
				return;
			}
			agEle['on' + agType] = agHandler;
		},
		
		setHiddenInputs : function() {
			var url = decodeURIComponent(getParameter("url"));
			if (url) {
			document.getElementById("url").value = url;
			}
			document.getElementById("relative").value = getParameter("relative");
			document.getElementById("brand").value = getParameter("brand");
		},
		
		getParameter : function(name) {
			var query = window.location.search.substring(1);
			var params = query.split("&");
			for (var i = 0; i < params.length; i++) {
				var pos = params[i].indexOf("=");
				if (pos == -1) continue;
				if (name == params[i].substring(0, pos)) {
					return params[i].substring(pos + 1);
				}
			}
			return "";
		},
		
		onClickCheck : function(cBox) {
			box = eval(cBox);
			box.checked = !box.checked;
			box.click();
		},
		
		/*************************************
		 * 일반공용함수
		 ************************************/
		
		onlyNumberQty : function(ctlx) {
		    var ctl = $('#'+ctlx);
		    if(trim(ctl.val())=="") ctl.val("1");
		    if(isNaN(ctl.val())) ctl.val("1");
		},
		
		increaseQty : function(ctlx) {
		    var ctl = $('#'+ctlx);
		    var xval = parseInt(ctl.val());
		    if(xval >= 0) {
		        ctl.val(++xval);
		    } else {
		        ctl.val("1");
		    }
		},
		
		decreaseQty : function(ctlx) {
		    var ctl = $('#'+ctlx);
		    var xval = parseInt(ctl.val());
		    if(xval > 1) {
		        ctl.val(--xval);
		    } else {
		        ctl.val("1");
		    }
		},
		
		checkZeroQty : function(ctl) {
		    var val = parseInt($(ctl).val());
		    if(isNaN(val) || val < 1) {
		        $(ctl).val('1');
		    }
		},
		
		/**
		 * 금액 쉼표 찍기
		    // 숫자 타입 test
		    var num = 123456.012;
		    console.log(num.format());               // 123,456.012
		
		    num = 13546745;
		    console.log(num.format());               // 13,546,745
		
		    // 문자열 타입 test
		    console.log("12348".format());           // 12,348
		    console.log("12348.6456".format());      // 12,348.6456
		 */
		// 숫자 타입에서 쓸 수 있도록 format() 함수 추가
		Numberformat : function(){
		    if(this==0) return 0;
		
		    var reg = /(^[+-]?\d+)(\d{3})/;
		    var n = (this + '');
		
		    while (reg.test(n)) n = n.replace(reg, '$1' + ',' + '$2');
		
		    return n;
		},
		
		// 문자열 타입에서 쓸 수 있도록 format() 함수 추가
		Stringformat : function(){
		    var num = parseFloat(this);
		    if( isNaN(num) ) return "0";
		
		    return num.format();
		},
		
		/**
		 * 이벤트가 발생한 키코드 값을 반환한다
		 *
		 * 사용법:  onkeypress="if(getKeyCode(event)==13) go_page('<%=pageNum%>');"
		 */
		getKeyCode : function(e) {
		    var keycode = null;
		    if (!e) var e = window.event
		    if (e.keyCode){
		        keycode = e.keyCode;
		    } else if (e.which) {
		        keycode = e.which;
		    }
		
		    return keycode;
		},
		
		/**
		 * '-' 삭제 처리
		 */
		deleteHyphen : function(ctl) {
		    var  x, ch;
		    var  i=0;
		    var  newVal="";
		
		    for(x = 0; x < ctl.value.length ; x++) {
		        ch= ctl.value.substring(x,x+1);
		        if( ch != "-") newVal += ch;
		    }
		
		    ctl.value = newVal;
		    return;
		},
		

		
		/**
		 * 숫자를 금액의 표현으로(콤마를 삽입) 바꿀 때 사용된다.
		 * presentCash()와 cashReturn()은 짝으로 사용된다.
		 * 사용법 : <input... onKeyDown="onlyNumber()" onKeyUp="presentCash(this);"
		 * 주의사항 : 16자리까지만 숫자허용하도록 한다.
		 */
		presentCash : function(val) {
		    var tmpstr = "";
		    var cash = eval(val);
		    if(cash.value=="" || cash.value==null) {
		        cash.value = "0";
		    }
		    var len = cash.value.length;
		    for (var i=0 ; i<len ; i++) {
		        if(cash.value.charAt(i)!=',') {
		            tmpstr = tmpstr + cash.value.charAt(i);
		        } else {
		            tmpstr = tmpstr + '';
		        }
		    }
		    var amt = parseInt(tmpstr);
		    cash.value = (amt==0 ? "" : cashReturn(amt));
		},
		
		//숫자를 금액형식으로 리턴 (000,000,000)
		cashReturn : function(num) {
		    var numValue = "" + num;
		    var cashReturn = "";
		    for (var i=numValue.length-1 ; i>=0 ; i--) {
		        cashReturn = numValue.charAt(i) + cashReturn;
		        if(i!=0 && i%3==numValue.length%3) {
		            cashReturn = "," + cashReturn;
		        }
		    }
		    return cashReturn;
		},
		
		//
		hexifyWithZeroLead : function(tohex){
		    var rtn = tohex.toString(16);
		    return ( rtn.length == 1 ? "0" : "" ) + rtn;
		},
		
		getHexColor : function() {
		
		    var maxnumhours = 23;
		    var maxnummins = 59;
		    var maxnumsecs = 60;
		    var maxmilisecs = 999;
		
		    //set community panel color
		    var currentTime = new Date ( );
		    var currentHours = currentTime.getHours();
		    var currentMinutes = currentTime.getMinutes();
		    var currentSeconds = currentTime.getSeconds();
		    var currentMiliSeconds = currentTime.getMilliseconds();
		    var rounded = currentSeconds + (currentMiliSeconds / maxmilisecs);
		
		    //Get Color Percentages based off time.
		    //Percentage of 255 for Color
		    //Percentage of 100 for Position
		    rednum = (Math.round(255 * ((currentHours) / maxnumhours)));
		    rednum100 = (Math.round(100 * ((currentHours) / maxnumhours)));
		    greennum = (Math.round(255 * ((currentMinutes) / maxnummins)));
		    greennum100 = (Math.round(100 * ((currentMinutes) / maxnummins)));
		    bluenum = (Math.round(255 * ((rounded) / maxnumsecs)));
		    bluenum100 = (Math.round(100 * ((rounded) / maxnumsecs)));
		
		    //convert to HEX
		    redhex = hexifyWithZeroLead(rednum);
		    greenhex = hexifyWithZeroLead(greennum);
		    bluehex = hexifyWithZeroLead(bluenum);
		
		    return "#" + redhex + greenhex + bluehex;
		
		},
		
		/* 이전으로 돌아가기 */
		pageback : function() {
		     if ( history.length > 0 ) {
		          history.back();
				  return false;
		     } else {
		          $.toast('첫 페이지 입니다!');
				  return false;
		     }
		},
		
		/* DIV기준 전체 화면 덮기 */
		wrapMask : function(divx) {
		
		     // 화면에 너비와 너비를 구함
		     var wx = $(window).width();
		     var hx = $('#'+divx).height();
		
		     // 마스크를 화면의 높이와 너비로 만들어 전체화면에 덮기 및 애니매이션 효과
		     $("#windowmask").css({'width':wx,'height':hx});
		     $("#windowmask").fadeTo('fast',0.7);
		
		},
		
		/*
		    textarea id, 제한 글자 수, 입력 결과 메세지 저장 ID
		    사용 예)
		    $(function(){
		        $('#commentContent').bind('keyup',function(){
		            limitCharacters('commentContent', <%=limitInput%>);
		        });
		    });
		
		*/
		
		limitCharacters : function(textid, limit, limitid) {
		    // 잆력 값 저장
		    var text = $('#'+textid).val();
		    // 입력값 길이 저장
		    var textlength = text.length;
		    if(textlength > limit) {
		        $('#' + limitid).html('글내용을 '+limit+
		        '자 이상 쓸수 없습니다!');
		        // 제한 글자 길이만큼 값 재 저장
		        $('#'+textid).val(text.substr(0,limit));
		        return false;
		    } else {
		        $('#' + limitid).html('쓸수 있는 글자가 '+ (limit - textlength) +
		        ' 자 남았습니다.');
		        return true;
		    }
		},
		
		limitCharacters : function(textid, limit) {
		    // 잆력 값 저장
		    var text = $('#'+textid).val();
		    // 입력값 길이 저장
		    var textlength = text.length;
		    if(textlength > limit) {
		        alert('글 내용을 '+limit+'자 이상 작성할 수 없습니다!');
		        // 제한 글자 길이만큼 값 재 저장
		        $('#'+textid).val(text.substr(0,limit));
		        return false;
		    } else {
		       return true;
		    }
		},
		
		/**
		 * 지정한 체크박스항목들을 모두 체크하게 하거나 모두 해제합니다.
		 */
		checkAll : function(pcontrol, control) {
		    var acheckval = $(pcontrol).is(":checked");
		
		    $('input:checkbox[name="'+control+'"]').each(function() {
		        this.checked = acheckval;
		    });
		
		},
		
		/**
		 * 지정한 요소 표시를 토글한다.
		 */
		toggleDisplayElementById : function(el) {
		    $('#'+el).toggle('fast');
		},
		toggleDisplayElementById_menu : function(el) {
		    $('#'+el).slideToggle('fast');
		    $('li[id^=catCont-]').not('#'+el).hide('fast');
		},
		
		
		/************************************************'
		 * 특수 용도 공용함수
		 ************************************************/
		
		shareSNSRead : function(sname,tx,ux,ix){
		
		    var shareTitle = tx;
		    var shareUrl = ux;
		    var shareImg = ix;
		
			switch(sname){
		          case 'twitter' :
		               var url = "https://twitter.com/intent/tweet?source=webclent&text="+encodeURIComponent("[자연이랑] 읽어보세요.\n"+shareTitle +" " + shareUrl);
		               window.open(url);
		               break;
		          case 'facebook' :
		               var f_shareTitle = shareTitle.replace(/(&)/g,"");
		               var f_shareUrl = shareUrl.replace(/(&)/g, "%26");
		               var url = "http://m.facebook.com/sharer.php?u="+encodeURIComponent(ux);
		               window.open(url);
		               break;
		          case 'kakao' :
						Kakao.init('c8e2d8346693d70194aec5c9a0dc5ddb');
						Kakao.Link.createTalkLinkButton({
						  container: '#kakao-link-btn',
						  label: '읽어보세요.',
						  image: {
							src: shareImg,
							width: '150',
							height: '150'
						  },
						  webButton: {
							text: shareTitle,
							url: shareUrl
						  }
						});
		               break;
		          case 'kakaostory' :
		               kakao.link("story").send({
		                  post : shareUrl,
		                  appid : "m.62life.com",
		                  appver : "0.9",
		                  appname : "[자연이랑]",
		                  urlinfo : JSON.stringify({title:"읽어보세요.",desc:shareTitle,imageurl:[shareImg]})
		              });
		               break;
				  case 'sms' :
						var urlx = "sms:+?body=[자연이랑] 이 상품 어때요? " + shareTitle + " " + shareUrl
						window.location = urlx;
						break;
		          default :
		               break;
		    }
		
		},
		
		shareSNS : function(sname,tx,ux,ix){
		
		    var shareTitle = tx;
		    var shareUrl = ux;
		    var shareImg = ix;
		
			switch(sname){
		        case 'twitter' :
						var url = "https://twitter.com/intent/tweet?source=webclent&text="+encodeURIComponent("[자연이랑] 이 상품 어때요?\n"+shareTitle +" " + shareUrl);
						window.open(url);
						break;
		        case 'facebook' :
						var f_shareTitle = shareTitle.replace(/(&)/g,"");
						var f_shareUrl = shareUrl.replace(/(&)/g, "%26");
						var url = "http://m.facebook.com/sharer.php?u="+encodeURIComponent(ux);
						window.open(url);
						break;
		        case 'kakao' :
						Kakao.init('c8e2d8346693d70194aec5c9a0dc5ddb');
						Kakao.Link.createTalkLinkButton({
						  container: '#kakao-link-btn',
						  label: '이 상품 어때요?',
						  image: {
							src: shareImg,
							width: '150',
							height: '150'
						  },
						  webButton: {
							text: shareTitle,
							url: shareUrl
						  }
						});
		              break;
		        case 'kakaostory' :
		               kakao.link("story").send({
		                  post : shareUrl,
		                  appid : "m.62life.com",
		                  appver : "0.9",
		                  appname : "[자연이랑]",
		                  urlinfo : JSON.stringify({title:"좋아요?",desc:shareTitle,imageurl:[shareImg]})
		              });
		              break;
				case 'sms' :
		                var urlx = "";
		                urlx = "sms:+?body=[자연이랑] 이 상품 어때요? " + shareTitle + " " + shareUrl
		                window.location = urlx;
						break;
		        default :
		              break;
		    }
		
		},
		
		shareSNSlikethis : function(sname,tx,ux,ix){
		
		    var shareTitle = tx;
		    var shareUrl = ux;
		    var shareImg = ix;
		
			switch(sname){
		        case 'twitter' :
		             var url = "https://twitter.com/intent/tweet?source=webclent&text="+encodeURIComponent("[자연이랑] 이렇게살까?\n"+shareTitle +" " + shareUrl);
		             window.open(url);
		             break;
		        case 'facebook' :
		             var f_shareTitle = shareTitle.replace(/(&)/g,"");
		             var f_shareUrl = shareUrl.replace(/(&)/g, "%26");
		             var url = "http://m.facebook.com/sharer.php?u="+encodeURIComponent(ux);
		             window.open(url);
		             break;
		        case 'kakao' :
						Kakao.init('c8e2d8346693d70194aec5c9a0dc5ddb');
						Kakao.Link.createTalkLinkButton({
						  container: '#kakao-link-btn',
						  label: '이렇게 살까?',
						  image: {
							src: shareImg,
							width: '80',
							height: '80'
						  },
						  webButton: {
							text: shareTitle,
							url: shareUrl
						  }
						});
						break;
		        default :
		              break;
		    }
		
		},
		
		logoutM : function() {
		    if(confirm('로그아웃하시겠습니까?')) {
		        location.href='/m/logoutm.asp'
		    }
		},
		
		/**
		 * 원하는 페이지로 이동
		 */
		goPage : function(pg) {
		    location.href = pg;
		},
		
		/* 팝업창을 띄운다. 너비와 높이를 0으로 지정하면 최대화면으로 표시, 그 외 중앙에 표시 */
		popup : function(strURL, strTarget, strWidth, strHeight, strStatus) {
		    var winl, wint, objWin;
		    //화면 중앙에 표시 듀얼 모니터에서 팝업창 가운데 정렬 (window의 screen left, top값으로 보정)
		    //var winl = (parseInt($(window).width())/2)-(strWidth/2);
		    //var wint = ((parseInt($(window).height())+parseInt($(window).scrollTop()))/2)-(strHeight/2);
		    if(strWidth == "0" && strHeight == "0") {
		        strWidth = screen.availWidth;
		        strHeight = screen.availHeight;
		        winl = 0;
		        wint = 0;
		    } else {
		        winl = window.screenLeft + (((window.innerWidth || document.documentElement.clientWidth) - parseInt(strWidth))/2);
		        wint = window.screenTop + (((window.innerHeight || document.documentElement.clientHeight) - parseInt(strHeight))/2);
		    }
		    objWin = window.open( strURL,strTarget,"top="+wint+",left="+winl+",width="+strWidth+",height="+strHeight+(strStatus?(","+strStatus):"") );
		    objWin.focus();
		},
		
		popupTrackingIframe : function(strURL, strTarget, strWidth, strHeight, strStatus) {
		    var winl, wint, objWin;
		    var turl = "/m/public/tracking_p.asp?urlx=";
		
		    if(strWidth == "0" && strHeight == "0") {
		        strWidth = screen.availWidth;
		        strHeight = screen.availHeight;
		        winl = 0;
		        wint = 0;
		    } else {
		        winl = window.screenLeft + (((window.innerWidth || document.documentElement.clientWidth) - parseInt(strWidth))/2);
		        wint = window.screenTop + (((window.innerHeight || document.documentElement.clientHeight) - parseInt(strHeight))/2);
		    }
		    objWin = window.open( turl+encodeURIComponent(strURL),strTarget,"top="+wint+",left="+winl+",width="+strWidth+",height="+strHeight+(strStatus?(","+strStatus):"") );
		    objWin.focus();
		},
		
		/* 현대택배 모바일 웹 운송장 조회용 전용 함수 */
		popupTrackingHD : function(strURL, strTarget, strWidth, strHeight, strStatus, strInv) {
		    var frm, objWin
		
		    if(strWidth == "0" && strHeight == "0") {
		        strWidth = screen.availWidth;
		        strHeight = screen.availHeight;
		        winl = 0;
		        wint = 0;
		    } else {
		        winl = window.screenLeft + (((window.innerWidth || document.documentElement.clientWidth) - parseInt(strWidth))/2);
		        wint = window.screenTop + (((window.innerHeight || document.documentElement.clientHeight) - parseInt(strHeight))/2);
		    }
		
		    frm = document.frm;
		    objWin = window.open(strURL,strTarget,"top="+wint+",left="+winl+",width="+strWidth+",height="+strHeight+(strStatus?(","+strStatus):""));
		    frm.InvNo.value = strInv;
		    frm.action.value = 'processInvoiceSubmit';
		    frm.action = strURL;
		    frm.target = strTarget;
		    frm.submit();
		    objWin.focus();
		},
		
		/*********************************************************
		 * 공용 함수 모음
		 *********************************************************/
		decreaseCount : function(ctl){
		    var $ctl = ctl;
		    var qty = parseInt($ctl.val());
		    qty = qty - 1;
		    if(qty <= 0) qty = 1;
		    $ctl.val(qty);
		},
		
		increaseCount : function(ctl){
		    var $ctl = ctl;
		    var qty = parseInt($ctl.val());
		    qty = qty + 1;
		    $ctl.val(qty);
		},
		
		/* 장바구니 공용함수 */
		addBasketQty : function(prod,qty,otype) {
		
		    var urlx = "/m/order/dobasket_m.asp";
		
		    $.getJSON(urlx,{'mode':'ADD','gdcd':prod,'gdcnt':qty,'crtidx':'','odtype':otype},function(data) {
		        //장바구니 정보 업데이트
		        if($('#howmanyinmycart').length > 0) $('#howmanyinmycart').html(data.tcount);
		        if(confirm("장바구니에 담았습니다. 장바구니로 이동하시겠습니까?")) {
		            location.href = "/m/order/cart_m.asp";
		        }
		    });
		
		},
		
		addBasketMsg : function(prod,otype,msg) {
		    var urlx = "/m/order/dobasket_m.asp";
		
		    $.getJSON(urlx,{'mode':'ADD','gdcd':prod,'gdcnt':'1','crtidx':'','odtype':otype},function(data) {
		        //장바구니 정보 업데이트
		        $('#howmanyinmycart').html(data.tcount);
		        if(confirm(msg+"\n장바구니로 이동하시겠습니까?")) {
		            location.href = "/m/order/cart_m.asp";
		        }
		    });
		
		},
		
		addBasketQtyMsg : function(prod,qty,otype,stock,msg) {
		    var defaultMsg = "장바구니에 상품을 담았습니다.";
		
		    if(qty=="" || qty=="0") {
		        qty = 1;
		    }
		    if(parseInt(stock)<parseInt(qty)) {
		        alert(stock+"개까지 담을 수 있습니다.");
		        return false;
		    } else {
		        var urlx = "/m/order/dobasket_m.asp";
		
		        $.getJSON(urlx,{'mode':'ADD','gdcd':prod,'gdcnt':qty,'crtidx':'','odtype':otype},function(data) {
		            //장바구니 정보 업데이트
		            if($('#howmanyinmycart').length > 0)  $('#howmanyinmycart').html(data.tcount);
		            if(msg == "") {
		                $.toast(defaultMsg);
		            } else {
		                alert(defaultMsg+"\n"+msg);
		                $.toast(defaultMsg);
		            }
		        });
		    }
		
		},
		
		showProductDetail : function(urlx, tab, gdcd, currentPage){
		    location.href = urlx;
		},
		
		/*
		 * PC 접근 확인 및 페이지 redirect
		 * 사용법: 페이지 내 javascript에서 checkAndGoPCPage(목적지url) 함수 호출
		 */
		checkAndGoPCPage : function(destUrl) {
		    //PC에서 모바일 페이지를 접속하면 PC 웹페이지로 이동.
		    var mobileKeyWords = new Array('iPhone','iPod','BlackBerry','Android','Windows CE','Windows CE;','LG','MOT','SAMSUNG','SonyEricsson','Mobile','Symbian','Opera Mobi','Opera Mini','IEmobile');
		    var xflag = false;
		    for (var word in mobileKeyWords) {
		        if (navigator.userAgent.match(mobileKeyWords[word]) != null) {
		            xflag = true;
		            break;
		        }
		    }
		    if(!xflag) window.location.href = destUrl;
		},
		
		/*
		 * 모바일에서 접근 여부 판단.
		 */
		isAccessMobile : function() {
		    var mobileKeyWords = new Array('iPhone','iPod','BlackBerry','Android','Windows CE','Windows CE;','LG','MOT','SAMSUNG','SonyEricsson','Mobile','Symbian','Opera Mobi','Opera Mini','IEmobile');
		    for (var word in mobileKeyWords) {
		        if (navigator.userAgent.match(mobileKeyWords[word]) != null) {
		            return true;
		            break;
		        }
		    }
		    return false;
		},
		
		/*
		 * iOS 계열 확인
		 */
		isiOSDevice : function() {
		    var ios_mobileKeyWords = new Array('iPhone','iPod');
		    var xflag = false;
		    for (var word in ios_mobileKeyWords) {
		        if (navigator.userAgent.match(ios_mobileKeyWords[word]) != null) {
		            xflag = true;
		            break;
		        }
		    }
		
		    return xflag;
		},
		
		/*
		 * 레시피 공유 처리 함수 (facebook, twitter)
		 */
		shareSNSrecipe : function(sname,tx,ux,ix){
		    var shareTitle = tx;
		    var shareUrl = ux;
		    var shareImg = ix;
		
		    switch(sname){
		        case 'twitter' :
		             var url = "https://twitter.com/intent/tweet?source=webclent&text="+encodeURIComponent("[자연이랑] 레시피공유\n"+shareTitle +" " + shareUrl);
		             window.open(url);
		             break;
		        case 'facebook' :
		             var f_shareTitle = shareTitle.replace(/(&)/g,"");
		             var f_shareUrl = shareUrl.replace(/(&)/g, "%26");
		             var url = "http://m.facebook.com/sharer.php?u="+encodeURIComponent(ux);
		             window.open(url);
		             break;
		        default :
		            break;
		    }
		},
		
		/*
		 * 지역제한코드에 따라 배송이 가능한 지역인지 여부를 반환한다.
		 */
		checkLimitDeliveryArea : function(limitcode, postcode) {
		    var lc = limitcode
		    var pc = postcode
		    var pcn = 0;
		
		    if(lc.lenth == 0) return false;
		    pcn = parseInt(pc);
		
		    if(lc == "SE") {  //서울지역
		        if(pcn >= 1000 && pcn <= 9999) {
		            return true;
		        } else {
		            return false;
		        }
		    } else if (lc == "CA") {  //수도권지역
		        if(pcn >= 1000 && pcn <= 19999) {
		            return true;
		        } else {
		            return false;
		        }
		    } else if (lc == "NJ") {  //제주도외 지역
		        if(pcn >= 63000 && pcn <= 69999) {
		            return false;
		        } else {
		            return true;
		        }
		    } else {
		        return false;
		    }
		
		},
		
		limitAddCartGdCnt : function(key, minqty, maxqty) {
		    var ixqty = 0;
		    var qty = $('#'+key).val();
		
		    if(qty=="" || qty=="0") {
		        qty = minqty;
		        $('#'+key).val(minqty);
		    }
		    if(Number($('#'+key).val()) < minqty) {
		        alert('이 상품은 '+minqty+'개 부터 주문 가능합니다');
		        $('#'+key).val(minqty);
		    }
		    if(Number($('#'+key).val()) > maxqty) {
		        alert('이 상품은 '+maxqty+'개 까지 주문 가능합니다');
		        $('#'+key).val(maxqty);
		    }
		},
		
		/*
		 지정한 id 요소 지점까지 부드럽게 스크롤 이동한다.
		 */
		gotoIdScrolling : function(eid, e) {
		    var offset = $('#'+eid).offset();
		    if(offset != null) $('html, body').animate({scrollTop : offset.top}, 1000);
		    if (!e) var e = window.event
		    e.preventDefault();
		},
		
		/*
		 * 휴대전화 유효성 검사
		 */
		isCellPhone : function(p) {
		    p = p.split('-').join('');
		    var regPhone = /^((01[1|6|7|8|9])[1-9]+[0-9]{6,7})|(010[1-9][0-9]{7})$/;
		
		    return regPhone.test(p);
		},
		
		/*
		 * 생년월일 6자리 유효성 검사
		 */
		validDateFormat : function(dateStr) {
		    var regexp = new RegExp("^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))","ig");
		    var strArr = regexp.exec(dateStr);
		    if(strArr==null) {
		        return false;
		    } else {
		        return true;
		    }
		},
		
		/*
		 * 이메일형식 유효성 검사
		 */
		isEmailFormat : function(em) {
		    var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		    if(em.match(regExp)==null) {
		        return false;
		    } else {
		        return true;
		    }
		},
		
		/*
		 * 휴대전화번호 자동 하이픈 추가기능.
		 */
		autoHypenPhone : function(str) {
		    str = str.replace(/[^0-9]/g, '');
		    var tmp = '';
		    if(str.length < 4) {
		        return str;
		    } else if(str.length < 7) {
		        tmp += str.substr(0, 3);
		        tmp += '-';
		        tmp += str.substr(3);
		        return tmp;
		    } else if(str.length < 11) {
		        tmp += str.substr(0, 3);
		        tmp += '-';
		        tmp += str.substr(3, 3);
		        tmp += '-';
		        tmp += str.substr(6);
		        return tmp;
		    } else {
		        tmp += str.substr(0, 3);
		        tmp += '-';
		        tmp += str.substr(3, 4);
		        tmp += '-';
		        tmp += str.substr(7);
		        return tmp;
		    }
		    return str;
		},
		
		/* ******************************************************************
		 * 날짜 관련 스크립트 모음
		 *******************************************************************/
		
		/* *
		 * 날짜 형식 처리 함수(YYYY-MM-DD)
		 * 사용법:
		 * <input type="text" size="10" name="fromdate" value="<%=fromdate%>" onfocus="delDateHyphen(this)" onblur="addDateHyphen(this)">
		 *
		 * "-" 추가 : 19961230(8자리) => 1996-12-30(10자리)
		 */
		addDateHyphen : function( date ) {
		
		    var newVal  = "";
		    var Year = "";
		
		    if(date.value.length < 8) return;
		    if(date.value.length == 8) {
		        newVal = date.value.substring(0,4);
		        newVal += "-";
		        newVal += date.value.substring(4,6);
		        newVal += "-";
		        newVal += date.value.substring(6,8);
		    } else {
		        // 만약 현재 "-"이 있다면
		        for(var x = 0; x < date.value.length ; x++) {
		               ch= date.value.substring(x,x+1);
		               if( ch == "-") return;
		        }
		
		        newVal += date.value.substring(0,4);
		        newVal += "-";
		        newVal += date.value.substring(4,6);
		        newVal += "-";
		        newVal += date.value.substring(6,8);
		    }
		    date.value = newVal;
		    return;
		},
		
		/* *
		 * 일자 조정
		 *
		 * "-" 삭제 : 1996-12-30(10자리) => 19961230(8자리)
		 */
		delDateHyphen : function(date) {
		    var  x, ch;
		    var  i=0;
		    var  newVal="";
		
		    if( date.value.length != 10 ) return;
		    for(x = 0; x < date.value.length ; x++) {
		        ch= date.value.substring(x,x+1);
		        if( ch != "-") newVal += ch;
		    }
		    date.value = newVal;
		    date.select();
		    return;
		},
		
		/* *
		 * 날짜 형식 처리 함수(YYYY-MM)
		 *
		 * "-" 추가 : 199612(6자리) => 1996-12(7자리)
		 *
		 * 사용법:
		 * <input type="text" size="10" name="fromdate" value="<%=fromdate%>" onfocus="delDateHyphen(this)" onblur="addMonthlyHyphen(this)">
		 */
		addMonthlyHyphen : function( date ) {
		    var newVal  = "";
		    var Year = "";
		
		    if(date.value.length < 6) return;
		    if(date.value.length == 6) {
		        newVal = date.value.substring(0,4);
		        newVal += "-";
		        newVal += date.value.substring(4,6);
		    } else {
		        // 만약 현재 "-"이 있다면
		        for(var x = 0; x < date.value.length ; x++) {
		               ch= date.value.substring(x,x+1);
		               if( ch == "-") return;
		        }
		
		        newVal += date.value.substring(0,4);
		        newVal += "-";
		        newVal += date.value.substring(4,6);
		    }
		    date.value = newVal;
		    return;
		},
		
		/* *
		 * 날짜 필드 조정
		 *
		 * "-" 삭제 : 1996-12(7자리) => 199612(6자리)
		 */
		delMonthHyphen : function(date) {
		    var  x, ch;
		    var  i=0;
		    var  newVal="";
		
		    if( date.value.length != 7 ) return;
		    for(x = 0; x < date.value.length ; x++) {
		        ch= date.value.substring(x,x+1);
		        if( ch != "-") newVal += ch;
		    }
		    date.value = newVal;
		    date.select();
		    return;
		}


	}
}



