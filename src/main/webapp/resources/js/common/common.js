/* jQuery Ready */
$(function() {

	// 변수초기화
	common.initVars();
	// 키이벤트
	common.initKeyEvent();
});


//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//															common
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var common = function() {
	
	return {
		initVars : function() {
			//윈도우 중앙 표시 좌표
			var winl = screen.availWidth/2, wint = screen.availHeight/2;
			var onbeforeunload_flags = true;
			
			var isChecked = false;
			var popup62win;
			
			var row_tcolor='';
			var row_tid='';
			
		},
		cannotAccess : function() {
			 alert('접근할 수 없습니다. 권한이 부족합니다.');
			
		},

	    //-------------------------------------------------
		// 로그인 유무 (session 체크)
		//-------------------------------------------------
	    isLogin : function(){
	    	
	    	var url= "login/logincheck";
	        var loginResult = false;
	        
	        var checkLoginStatus = sessionStorage.getItem("checkLoginStatus");
	        if(checkLoginStatus == null || checkLoginStatus == "undefined"){
	        	
	            $.ajax({
	                type: "POST",
	                url: url,
	                data: null,
	                dataType : 'json',
	                async: false,
	                cache: false,
	                success: function(data) {
	                    loginResult = data.result;
	                    sessionStorage.setItem("checkLoginStatus", data.result);
	                },
	                error : function() {
	                    loginResult = false;
	                    sessionStorage.removeItem("checkLoginStatus");
	                }
	            });
	        }else{
	        	loginResult = JSON.parse(sessionStorage.getItem("checkLoginStatus"));

	        	if(loginResult != false ){
	        		if(sessionStorage.getItem("notLoginUser") == "done"){
	        			//비로그인 -> 로그인와서 처음 행위
	        			sessionStorage.removeItem("notLoginUser");
	        		}
	        	}
	        }
	        return loginResult;
	    },
	    
		
		saveId : function() {
			var ip_spw = document.getElementById("loginpassword");
			var ip_sid = document.getElementById("loginuserid");
			if(ip_spw.checked) {
				ip_sid.checked = true;
				return false;
			} else {
				return true;
			}
		},
		
		savePwd : function() {
			var ip_spw = document.getElementById("loginpassword");
			var ip_sid = document.getElementById("loginuserid");
			if(!ip_spw.checked) {
				ip_spw.checked = false;
			} else {
				ip_sid.checked = true;
				ip_spw.checked = true;
			}
		},
		
	    //-------------------------------------------------
		// Cookie   set/get
		//-------------------------------------------------
		 /* *
		  * 쿠키값 가져오기
		  */
		getCookie : function(key) {
		    var cook = document.cookie + ";";
		    var idx =  cook.indexOf(key, 0);
		    var val = "";

		    if(idx != -1) {
		        cook = cook.substring(idx, cook.length);
		        begin = cook.indexOf("=", 0) + 1;
		        end = cook.indexOf(";", begin);
		        val = unescape( cook.substring(begin, end) );
		    }

		    return val;
		},
		

		/* *
		 * 쿠키값 설정
		 */
		setCookie : function(name, value, expiredays) {
		    var today = new Date();
		    today.setDate( today.getDate() + expiredays );
		    document.cookie = name + "=" + escape( value ) + "; path=/; expires=" + today.toGMTString() + ";"
		},
		
		
		clearKeyValue : function(pTarget, pBtn) {
			document.getElementById(pBtn).style.display="none";
			document.getElementById(pTarget).value="";
			document.getElementById(pTarget).focus();
		},
		
		checkKeyValue : function(pTarget, pBtn) {
			if(document.getElementById(pTarget).value=="") {
				document.getElementById(pBtn).style.display="none";
			}
			else {
				document.getElementById(pBtn).style.display="block";
			}
		},
			    
		/* ******************************************************************
		 * 필수 스크립트 모음
		 ****************************************************************** */
		init_unload : function() {
		    onbeforeunload_flags = true;
		},

		clear_unload : function() {
		    onbeforeunload_flags = false;
		},
		
		onbeforeunload_f : function() {
		    if ( onbeforeunload_flags ) {
		        event.returnValue = "『페이지를 벗어나시면 처리 중이던 자료에 심각한 문제가 발생할 수 있습니다.』\n『진행 중이던 작업이 있다면, 반드시 완료 또는 취소처리를 하고 이동하십시오!』";
		    }
		    onbeforeunload_flags = true;
		},
		
		onbeforeunload_init : function() {
		    if ( navigator.appName == "Microsoft Internet Explorer" ) {
		        onbeforeunload = onbeforeunload_f;
		    }
		},


		/* *
		 * 작업중(로딩중) 메시지를 표시한다.
		 *
		 * 사용법: submit() 전에 기술한다. <%@include file="/common/waiting.jsp" %>
		 *
		 */
		showWaiting : function() {

		    var xwall = $('#divXwall');
		    if(xwall) {
		        xwall.css("position","fixed");
		        xwall.css("width","100%");
		        xwall.css("height","100%");
		        xwall.css("background-color","rgba(0, 0, 0, 0.8)");
		        xwall.show();
		    }

		    var dv = $('#divWaiting');
		    var dvHeight = parseInt(dv.height());
		    var dvWidth = parseInt(dv.width());
		    var dvTop = (($(window).height() - dv.outerHeight()) / 2) + $(window).scrollTop();
		    var dvLeft = (($(window).width() - dv.outerWidth()) / 2) + $(window).scrollLeft();

		    dv.css("position","absolute");
		    dv.css("top",dvTop);
		    dv.css("left",dvLeft);
		    dv.css("zIndex","9991");
		    dv.css("visibility","visible");
		    dv.show();

		},
		

		/* *
		 * 작업중(로딩중) 메시지를 감춘다.
		 */
		hideWaiting : function() {
		    var dv = document.getElementById("divWaiting");
		    dv.style.display = "none";
		    if(document.getElementById("divXwall")) document.getElementById("divXwall").style.display = "none";
		},
		

		/* *
		 * 권장하지 않음 / 호환성 고려
		 */
		show_waiting : function() {
		    showWaiting();
		},
		
		hide_waiting : function() {
		    hideWaiting();
		},
		

		/* *
		 * 지정한 DIV를 중앙에 표시한다 (설정화면 등)
		 *
		 * divN: DIV id
		 */
		showDivPanel : function(divN) { 

		    var xwall = $('#divXwall');
		    if(xwall) {
		        xwall.css("position","fixed");
		        xwall.css("width","100%");
		        xwall.css("height","100%");
		        xwall.css("background-color","rgba(0, 0, 0, 0.8)");
		        xwall.show();
		    }

		    var dv = $('#'+divN);
		    var dvHeight = parseInt(dv.height());
		    var dvWidth = parseInt(dv.width());
		    var dvTop = (($(window).height() - dv.outerHeight()) / 2) + $(window).scrollTop();
		    var dvLeft = (($(window).width() - dv.outerWidth()) / 2) + $(window).scrollLeft();

		    dv.css("position","absolute");
		    dv.css("top",dvTop);
		    dv.css("left",dvLeft);
		    dv.css("zIndex","9991");
		    dv.css("visibility","visible");
		    dv.show();
		},		
		
		/* *
		 * Iframe을 포함한 DIV를 화면 중앙에 표시하고, 아이프레임에 지정한 URL을 출력한다
		 *
		 * divN: DIV id
		 * iframeN: iframe id
		 * urlx: URL
		 */
		showDivPanelIframe : function(divN,iframeN,urlx) {

		    var xwall = $('#divXwall');
		    if(xwall) {
		        xwall.css("position","fixed");
		        xwall.css("width","100%");
		        xwall.css("height","100%");
		        xwall.css("background-color","rgba(0, 0, 0, 0.8)");
		        xwall.show();
		    }

		    var ifm = document.getElementById(iframeN);
		    ifm.src = urlx;

		    var dv = $('#'+divN);
		    var dvHeight = parseInt(dv.height());
		    var dvWidth = parseInt(dv.width());
		    var dvTop = (($(window).height() - dv.outerHeight()) / 2) + $(window).scrollTop();
		    var dvLeft = (($(window).width() - dv.outerWidth()) / 2) + $(window).scrollLeft();

		    dv.css("position","absolute");
		    dv.css("top",dvTop);
		    dv.css("left",dvLeft);
		    dv.css("zIndex","9991");
		    dv.css("visibility","visible");
		    dv.show();
		},
		

		/* *
		 * 지정한 DIV 창을 감춘다
		 */
		hideDivPanel : function(divN) {

		    var xwall = $('#divXwall');
		    if(xwall) xwall.hide();
		    var dv = $('#'+divN);
		    dv.hide();
		},
		
		/* *
		 * 지정한 div를 자동 스크롤 위치를 조정한다.
		 *
		 * setAutoScrollDiv() 함수에 종속적 임.
		 */
		autoScrollDiv : function(divName) {
		    var yMenuFrom, yMenuTo, yOffset;

		    var obj = document.getElementById(divName);
		    yMenuFrom = parseInt(obj.style.top, 10);
		    yMenuTo = document.body.scrollTop;

		    if( yMenuFrom != yMenuTo) {
		        yOffset = Math.ceil( Math.abs( yMenuTo - yMenuFrom ) / 20 );
		        if(yMenuTo < yMenuFrom) {
		            yOffset = -yOffset;
		        }
		        obj.style.top = parseInt(obj.style.top, 10) + yOffset;
		    }
		    setTimeout ("autoScrollDiv('"+divName+"')", 10);
		},
		

		/* *
		 * 자동 스크롤이 필요한 div를 지정하고 body에서 직접 호출한다
		 *
		 * 예) <script> setAutoScrollDiv('autoScrollDiv'); </script>
		 */
		setAutoScrollDiv : function(divName) {
		    if(top.frames.length) {
		        document.getElementById(divName).style.display = "inline";
		    }
		    autoScrollDiv(divName);
		    return true;
		},
		

		/* *
		 * iframe 크기를 최대로 키움.
		 * (일반적으로 부모페이지가 로딩 될 때 실행함 ex) init() )
		 */
		voidResizeFrame : function() {
		    self.resizeTo(document.body.offsetWidth, document.body.scrollHeight+20);
		},
		

		/* *
		 * 주어진 element를 숨기거나 보이게 한다
		 */
		toggleMenu : function(elName) {
		    var el = document.getElementById(elName);
		    var isVisible = (el.style.visibility == "hidden") ? true : false;
		    var isDisplay = (el.style.display == "none") ? true : false;

		    el.style.visibility = isVisible ? "visible" : "hidden";
		    el.style.display = isDisplay ? "inline" : "none";
		},
		

		toggleMenuOnlyOne : function(elName) {
		    //먼저 메뉴의 모든 span을 닫는다
		    var xl = document.getElementsByTagName("SPAN");
		    for(var i=0; i<xl.length; i++) {
		        //타이틀(제목표시) span tag는 제외한다.
		        if(xl[i].getAttribute("classname") != "title") {
		            xl[i].style.visibility = "hidden";
		            xl[i].style.display = "none";
		        }
		    }
		    var el = document.getElementById(elName);
		    var isVisible = (el.style.visibility == "hidden") ? true : false;
		    el.style.visibility = isVisible ? "visible" : "hidden";
		    el.style.display = isVisible ? "inline" : "none";
		},
		
		toggleMenuAllOpen : function() {
		    //모든 메뉴를 열어 놓는다
		    var xl = document.getElementsByTagName("SPAN");
		    for(var i=0; i<xl.length; i++) {
		        //타이틀(제목표시) span tag는 제외한다.
		        if(xl[i].getAttribute("classname") != "title"
		        && xl[i].id.substring(0,4) == "menu" ) {
		            xl[i].style.visibility = "visible";
		            xl[i].style.display = "inline";
		        }
		    }
		    //메뉴상태정보를 쿠키에 저장한다
		    setCookie("leftMenu", "OPEN", 365);
		},

		toggleMenuAllClose : function(elName) {
		    //모든 메뉴를 열어 놓는다
		    var xl = document.getElementsByTagName("SPAN");
		    for(var i=0; i<xl.length; i++) {
		        //타이틀(제목표시) span tag는 제외한다.
		        if(xl[i].getAttribute("classname") != "title"
		        && xl[i].id.substring(0,4) == "menu" ) {
		            xl[i].style.visibility = "hidden";
		            xl[i].style.display = "none";
		        }
		    }
		    var el = document.getElementById(elName);
		    var isVisible = (el.style.visibility == "hidden") ? true : false;
		    el.style.visibility = isVisible ? "visible" : "hidden";
		    el.style.display = isVisible ? "inline" : "none";

		    //메뉴상태정보를 쿠키에 저장한다
		    setCookie("leftMenu", "CLOSE", 365);
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
		delDateHyphen : function( date ) {
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
		delMonthHyphen : function( date ) {
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
		},
		
		/* *
		 * 올바른 날짜형식인지를 판단한다.
		 */
		isDate : function(as_date){
		    var xflag = false;

		    if(as_date.value=="") {
		        return true;
		    }

		    if(as_date.value.length != 10) {
		        xflag = true;
		    } else {
		        var li_yy=as_date.value.substring(0,4);
		        var li_mm=as_date.value.substring(5,7);
		        var li_dd=as_date.value.substring(8,10);

		        if ((li_yy<1)||(li_mm<1)||(li_dd<1)) { //년월일이 영또는 음수일경우
		            xflag = true;
		        } else if ((li_mm==1) ||(li_mm==3) ||(li_mm==5) ||(li_mm==7) ||(li_mm==8) ||(li_mm==10) ||(li_mm==12)){ //1,3,5,7,8,10,12월인경우(31일)
		            if(li_dd>31){ //31일보다 큰경우
		                xflag = true;
		            }
		        } else if((li_mm==4)||(li_mm==6)||(li_mm==9)||(li_mm==11)){ //4,6,9,11월인경우(30일)
		            if(li_dd>30){ //30일보다 큰경우
		                xflag = true;
		            }
		        } else if(li_mm==2){ //2월인경우
		            if(IsLeapYear(li_yy)==true){ //윤년
		                if(li_dd>29){ //29일보다 큰경우
		                    xflag = true;
		                }
		            } else { //평년
		                if(li_dd>28){//28일보다 큰경우
		                    xflag = true;
		                }
		            }
		        } else {//월범위를 벗어난경우
		            xflag = true;
		        }
		    }

		    if(xflag) {
		        alert("날짜입력이 잘못되었습니다");
		        setTimeout(function(){as_date.select();},1);
		        //showCalendar(as_date);
		        return false;
		    } else {
		        return true;
		    }
		},
		

		/* *
		 * (권장하지 않음, isDate를 사용하시오)
		 * 올바른 날짜형식인지를 판단한다.
		 */
		IsDate : function(as_date){
		    var li_yy=as_date.value.substring(0,4);
		    var li_mm=as_date.value.substring(5,7);
		    var li_dd=as_date.value.substring(8,10);
		    if(as_date.value=="") {
		        return true;
		    } else {
		        if ((li_yy<1)||(li_mm<1)||(li_dd<1)) { //년월일이 영또는 음수일경우
		            alert("날짜입력이 잘못되었습니다");
		            as_date.select();
		            return false;
		        } else if ((li_mm==1) ||(li_mm==3) ||(li_mm==5) ||(li_mm==7) ||(li_mm==8) ||(li_mm==10) ||(li_mm==12)){ //1,3,5,7,8,10,12월인경우(31일)
		            if(li_dd>31){ //31일보다 큰경우
		                alert("날짜입력이 잘못되었습니다");
		                as_date.select();
		                return false;
		            }
		        } else if((li_mm==4)||(li_mm==6)||(li_mm==9)||(li_mm==11)){ //4,6,9,11월인경우(30일)
		            if(li_dd>30){ //30일보다 큰경우
		                alert("날짜입력이 잘못되었습니다");
		                as_date.select();
		                return false;
		            }
		        } else if(li_mm==2){ //2월인경우
		            if(IsLeapYear(li_yy)==true){ //윤년
		                if(li_dd>29){ //29일보다 큰경우
		                    alert("날짜입력이 잘못되었습니다");
		                    as_date.select();
		                    return false;
		                }
		            } else { //평년
		                if(li_dd>28){//28일보다 큰경우
		                    alert("날짜입력이 잘못되었습니다");
		                    as_date.select();
		                    return false;
		                }
		            }
		        } else {//월범위를 벗어난경우
		            alert("날짜입력이 잘못되었습니다");
		            as_date.focus();
		            return false;
		        }
		        return true;
		    }
		},

		IsLeapYear : function(ai_year){ //윤년여부 확인
		    if((ai_year%4)==0){ //년도를 4로 나누어지는 경우(윤년대상)
		        if((ai_year%100)==0){ //년도를 100으로 나누어지는 경우(윤년대상)
		            if((ai_year%400)==0){ //년도를 400으로 나누어지는 경우(윤년)
		                return true;
		            } else{ //400으로 나누어지지않는경우(평년)
		                return false;
		            }
		        } else { //년도를 100으로 나누어지지 않는경우(윤년)
		            return true;
		        }
		    } else { //년도를 4로나누어지지 않는경우(평년)
		        return false;
		    }
		},
		
		chkDateSeq : function( date1, date2 ) {
		    if(date1.value=="" && date2.value=="") {
		        return true;
		    }else{
		        if( date1.value != "" && date2.value == "") {
		            alert("종료일자를 넣어 주십시오!");
		            date2.focus();
		            return false;
		        }
		        if( date1.value == "" && date2.value != "") {
		            alert("시작일자를 넣어 주십시오!");
		            date1.focus();
		            return false;
		        }
		        if( date1.value > date2.value) {
		            alert ("시작일이 종료일 보다 늦습니다.");
		            date2.focus();
		            return false;
		        }
		    }
		},
		

		/* *
		*현재일자와 비교하기
		*/
		chkDateSeq2 : function(date, toDay) {
		    if(date.value=="" ) {
		        return true;
		    }else{
		        if( date.value < toDay.value) {
		            alert ("과거일자를 지정해서는 안됩니다.");
		            date.value = toDay.value;
		            date.focus();
		            return false;
		        } else {
		            return true;
		        }
		    }
		},

		/* *
		 * 두개의 필드로 날짜간격을 나타내야 할 경우 사용, calendar.js 가 필요함.
		 * 예 : <input type="text" class="input" name="fFromDate" id="fFromDate" size="11" maxlength="10" value="<%=fFromDate%>" onfocus="delDateHyphen(this)" onblur="addDateHyphen(this); if(isDate(this)) chkDateSeq3(this,this,document.mainx.fToDate);" onkeydown="if(getKeyCode(event)==13) movePage(<%=pageNum%>)"><img src="/images/down2.gif" align="absmiddle" border="0" style="cursor:pointer" onclick="showCalendar(document.getElementById('fFromDate'));"> -
		 *      <input type="text" class="input" name="fToDate" id="fToDate" size="11" maxlength="10" value="<%=fToDate%>" onfocus="delDateHyphen(this)" onblur="addDateHyphen(this); if(isDate(this)) chkDateSeq3(this,document.mainx.fFromDate,this);" onkeydown="if(getKeyCode(event)==13) movePage(<%=pageNum%>)"><img src="/images/down2.gif" align="absmiddle" border="0" style="cursor:pointer" onclick="showCalendar(document.getElementById('fToDate'));">
		 */
		chkDateSeq3 : function( cntl, date1, date2 ) {
		    if(date1.value=="" && date2.value=="") {
		        return true;
		    } else {
		        if( date1.value != "" && date2.value == "") {
		            alert("종료일자를 넣어 주십시오!");
		            //showCalendar(date2);
		            return false;
		        }
		        if( date1.value == "" && date2.value != "") {
		            alert("시작일자를 넣어 주십시오!");
		            //showCalendar(date1);
		            return false;
		        }
		        if( date1.value > date2.value) {
		            alert ("시작일이 종료일 보다 늦습니다.");
		            //showCalendar(cntl);
		            return false;
		        }
		    }
		},
		
		/* *
		*현재일자와 비교하기, calendar.js 가 필요함.
		*/
		chkDateSeq4 : function(date, toDay) {
		    if(date.value=="" ) {
		        return true;
		    }else{
		        if( date.value < toDay.value) {
		            alert ("과거일자를 지정해서는 안됩니다.");
		            date.value = toDay.value;
		            //showCalendar(date);
		            return false;
		        } else {
		            return true;
		        }
		    }
		},
				
		
		/* *
		 * 달력없이 오늘의 날짜만을 'YYYY-MM-DD'형식으로 리턴
		 */
		toDay : function() {
		    now = new Date;

		    var dMonth;
		    var dDate;
		    var dNow;

		    if(now.getMonth()+1 > 9) { dMonth = now.getMonth()+1; } else { dMonth = "0"+(now.getMonth()+1); }
		    if(now.getDate() > 9) { dDate = now.getDate(); } else { dDate = "0"+now.getDate(); }

		    dNow = now.getFullYear() + "-" + dMonth + "-" + dDate;
		    return dNow;
		},
		
		/* *
		 * 'YYYY-MM-DD'형식의 날짜에 숫자의 일수 더하기(빼기)
		 */
		addDate : function(baseDate,addDay) {
		    var yr = baseDate.substring(0,4);
		    var mn = baseDate.substring(5,7)-1;
		    var dy = baseDate.substring(8,10);

		    var A = new Date(yr,mn,dy);

		    //단순히 숫자로 더하기
		    A.setDate(A.getDate() + parseInt(addDay));

		    //초로 환산하여 더하기.
		    /*var aTime = A.getTime();
		    aTime = aTime + parseInt(addDay)*24*60*60*1000;
		    A.setTime(aTime);*/

		    var rYear = A.getFullYear();
		    var rMonth = A.getMonth()+1;
		    var rDay = A.getDate();

		    if(rMonth<10) rMonth = "0" + rMonth;
		    if(rDay<10) rDay = "0" + rDay;

		    var B = rYear + "-" + rMonth + "-" + rDay;

		    return B;
		},
		
		/* *
		 * 'YYYY-MM-DD'형식의 특정 날짜의 요일반환.
		 * 일요일 : 0 ~ 토요일 : 6 으로 반환.
		 */
		calcWeekDay : function(sDate) {

		    var nYear = sDate.substring(0,4);
		    var nMonth = sDate.substring(5,7)-1;
		    var nDay = sDate.substring(8,10);

		    var xDate = new Date(nYear,nMonth,nDay);
		    nYear = xDate.getFullYear();
		    nMonth = xDate.getMonth()+1;
		    nDay = xDate.getDate();

		    if(nMonth >= 3) {
		        nMonth -= 2;
		    } else {
		        nMonth += 10;
		    }

		    if( (nMonth == 11) || (nMonth == 12) ){
		        nYear--;
		    }

		    var nCentNum = parseInt(nYear / 100);
		    var nDYearNum = nYear % 100;

		    var g = parseInt(2.6 * nMonth - .2);

		    g += parseInt(nDay + nDYearNum);
		    g += nDYearNum / 4;
		    g = parseInt(g);
		    g += parseInt(nCentNum / 4);
		    g -= parseInt(2 * nCentNum);
		    g %= 7;

		    if(nYear >= 1700 && nYear <= 1751) {
		        g -= 3;
		    } else {
		        if(nYear <= 1699) {
		            g -= 4;
		        }
		    }

		    if(g < 0) {
		        g += 7;
		    }

		    return g;
		},

		/* * 시간 유틸 **/
		/* *
		 * 시분표기에 ":" 추가 : 1230(4자리) => 12:30(5자리)
		 */
		addTimeColon : function(oTime) {

		    var newVal  = "";
		    var Year = "";

		    if(oTime.value.length < 4) return;
		    if(oTime.value.length == 4) {
		        newVal = oTime.value.substring(0,2);
		        newVal += ":";
		        newVal += oTime.value.substring(2,4);
		    } else {
		        // 만약 현재 "-"이 있다면
		        for(var x = 0; x < oTime.value.length ; x++) {
		            ch = oTime.value.substring(x,x+1);
		            if( ch == ":") return;
		        }

		        newVal += oTime.value.substring(0,2);
		        newVal += ":";
		        newVal += oTime.value.substring(2,4);
		    }
		    oTime.value = newVal;
		    return;
		},
		
		/* *
		 * 시분표기에 ":" 삭제 : 12:30(5자리) => 1230(4자리)
		 */
		delTimeColon : function(oTime) {
		    var  x, ch;
		    var  i=0;
		    var  newVal="";

		    if( oTime.value.length != 5 ) return;
		    for(x = 0; x < oTime.value.length ; x++) {
		        ch= oTime.value.substring(x,x+1);
		        if( ch != ":") newVal += ch;
		    }
		    oTime.value = newVal;
		    oTime.select();
		    return;
		},

		/* *
		 * 시분표기가 제대로 되었는지 확인.
		 */
		isHourMinute : function(oTime) {
		    var xFlag = false;
		    var hour = 0;
		    var minute = 0;

		    if(oTime.value=='') return true;

		    if(oTime.value.length==5) {
		        hour = oTime.value.substring(0,2);
		        minute = oTime.value.substring(3,5);
		        if(hour=='' || hour<0|| hour>23) xFlag = true;
		        if(minute=='' || minute<0 || minute>59) xFlag = true;
		    } else {
		        xFlag = true;
		    }
		    //alert("hour: "+hour+", minute: "+minute);
		    if(xFlag) {
		        alert("시와 분의 입력이 잘못되었습니다.");
		        oTime.select();
		        return false;
		    } else {
		        return true;
		    }
		},
		
		/* *
		 * 시작시각이 종료시각보다 같거나 작은지 확인
		 */
		chkTimeSeq : function(sTime, cTime) {
		    if(sTime.value!='' && cTime.value!='') {
		        if(sTime.value > cTime.value) {
		            alert("종료시각이 시작시각보다 앞설 수 없습니다.");
		            cTime.select();
		            return false;
		        } else {
		            return true;
		        }
		    } else {
		        return false;
		    }
		},

		/* ******************************************************************
		 * 기타 유틸 스크립트 모음
		 *******************************************************************/

		/*
		 * 텍스트 박스에 기본 메시지를 보여주는 함수
		 * 사용법: <input type="text" value="검색어를 입력 하세요" onfocus="clearText(this)">
		 */
		clearText : function(thefield) {
		    if(thefield.defaultValue==thefield.value) {
		        thefield.value = "";
		        thefield.focus();
		    }
		},
		
		/*
		 * 숫자만 입력하는 함수 (이벤트 이용)
		 *
		 * 사용법: <input type="text" onkeydown="onlyNumber(event);" />
		 *
		 * keyCode 37 : ← Key
		 * keyCode 39 : → Key
		 * keyCode 46 : Delete Key
		 * keyCode 110 : 숫자패드 콤마'.'
		 * keyCode 190 : 문자패드 콤마'.'
		 * keyCode 48 ~ 57 : 문자패드 숫자 0 ~ 9
		 * keyCode 96 ~ 105 : 숫자패드 숫자 0 ~ 9
		 * keyCode 109, 189, 107 : '-','+' 표시
		 */
		onlyNumber : function(evnt) {
		    var ev = evnt || window.event;
		    var code = ev.charCode || ev.keyCode;
		    if(code < 32) return true;
		    if(ev.ctrlKey || ev.altKey) return true;

		    if(   (code==37)
		       || (code==39)
		       || (code==46)
		       || (code==110)
		       || (code==190)
		       || (code>=48 && code<=57)
		       || (code>=96 && code<=105)
		       || (code==109)
		       || (code==189)
		       || (code==107)
		      ) {
		        ev.returnValue = true;
		        return true;
		    } else {
		        if(ev.preventDefault) {
		           ev.preventDefault();
		        } else {
		            ev.returnValue = false;
		        }
		        return false;
		    }
		},
		
		/*
		 * 숫자만 입력하는 함수 (이벤트 이용)
		 *
		 * 사용법: <input type="text" onkeydown="onlyDigit(event);" />
		 *
		 * keyCode 37 : ← Key
		 * keyCode 39 : → Key
		 * keyCode 46 : Delete Key
		 * keyCode 48 ~ 57 : 문자패드 숫자 0 ~ 9
		 * keyCode 96 ~ 105 : 숫자패드 숫자 0 ~ 9
		 * KeyCode 144 : Number Lock
		 */
		onlyDigit : function(evnt) {
		    var ev = evnt || window.event;
		    var code = ev.charCode || ev.keyCode;
		    if(code < 32) return true;
		    if(ev.ctrlKey || ev.altKey) return true;

		    if(   (code==37)
		       || (code==39)
		       || (code==46)
		       || (code>=48 && code<=57)
		       || (code>=96 && code<=105)
		       || (code==144)
		      ) {
		        ev.returnValue = true;
		        return true;
		    } else {
		        if(ev.preventDefault) {
		            ev.preventDefault();
		        } else {
		            ev.returnValue = false;
		        }
		        return false;
		    }
		},

		commaSplit : function(str) {
		    str = ""+str+"";
		    var retValue = "";
		    for(i=0; i<str.length; i++) {
		        if(i > 0 && (i%3)==0) {
		            retValue = str.charAt(str.length - i -1) + "," + retValue;
		        } else {
		            retValue = str.charAt(str.length - i -1) + retValue;
		        }
		    }
		    return retValue
		},

		/* *
		 * 원하는 페이지로 이동
		 * 사용법: onclick="goPage('xxx.jsp');
		 */
		goPage : function(urlx) {
		    location.href = urlx;
		},

		/* *
		 * 선택한 페이지 인쇄.
		 * 사용법: onclick="printPage();"
		 */
		printPage : function() {
		    if(window.print) {
		        window.print()
		    } else {
		        alert("이 브라우저는 인쇄 기능을 지원하지 않습니다!");
		    }
		},

		/* *
		 * 선택시 테이블 열의 색깔을 변하게 합니다.
		 * val: check box, cname: 포커스 컨트롤, fgcolor: 글자색, bgcolor: 배경색
		 */
		changRowColor : function(val,cname,fgcolor,bgcolor) {
		    if(val.checked) {
		        while (val.tagName!="TR") {
		            val=val.parentElement;
		        }
		        val.style.color=fgcolor;
		        val.style.backgroundColor=bgcolor;
		        cname.select();
		    } else {
		        while (val.tagName!="TR") {
		            val=val.parentElement;
		        }
		        val.style.color="";
		        val.style.backgroundColor="";
		    }
		},

		/* *
		 * 버튼의 색깔 변경합니다.
		 * 사용법: <form onMouseover="changeBtnColor('gold')" onMouseout="changeBtnColor('')">
		 */
		changeBtnColor : function(color) {
		    if(navigator.appName=="Microsoft Internet Explorer") {
		        if (event.srcElement.tagName=="INPUT")
		            event.srcElement.style.backgroundColor=color
		    }
		},

		changeBtnFontColor : function(color) {
		    if(navigator.appName=="Microsoft Internet Explorer") {
		        if(event.srcElement.tagName=="INPUT")
		            event.srcElement.style.color=color
		    }
		},

		/* *
		 * 사용법: <img src="이미지URL" onmouseover="rolloverImage(this,'_line')" onmouseout="rolloverImage(this,'_line')" />
		 */
		rolloverImage : function(obj,postfix) {
		    var imgsrc = obj.src;
		    var imgdir = imgsrc.substring(0,imgsrc.lastIndexOf("/"));
		    var imgname = imgsrc.substring(imgsrc.lastIndexOf("/"),imgsrc.lastIndexOf("."));
		    var imgext = imgsrc.substring(imgsrc.lastIndexOf("."),imgsrc.length);

		    if(imgname.indexOf("_") > 0) {
		        imgname = imgname.substring(0,imgname.indexOf("_"));
		    } else {
		        imgname = imgname + postfix;
		    }

		    obj.src = imgdir + imgname + imgext;
		    return true;
		},


		/* *
		 * Check항목들을 모두 체크하게 하거나 모두 해제합니다.
		 * 사용법 : onclick 혹은 <a href= 에 기술함, parameter는 배열명
		 */
		checkAll : function(control) {
		    var X=eval("document.mainx."+control);

		    if(!isChecked) {
		        if(X.length==null) {
		            X.checked=true;
		        } else {
		            for(i=0;i<X.length;i++) {
		                X[i].checked=true;
		            }
		        }
		        isChecked = true;
		    } else {
		        if(X.length==null) {
		            X.checked=false;
		        } else {
		            for(i=0;i<X.length;i++) {
		                X[i].checked=false;
		            }
		        }
		        isChecked = false;
		    }
		},

		/* *
		 * 지정한 체크박스항목들을 모두 체크하게 하거나 모두 해제합니다.
		 */
		checkAll : function(pcontrol, control) {
		    var acheckval = $(pcontrol).is(":checked");

		    $('input:checkbox[name="'+control+'"]').each(function() {
		        this.checked = acheckval;
		    });

		},

		/* *
		 * Check항목 src는 다른 Check 항목들인 tar들을 모두 체크하게 하거나 모두 해제합니다.
		 * 사용법 : <input type="checkbox" id="chkx" name="chka" onclick="checkalls('chkx','chk')"> --> src
		 *          <input type="checkbox" name="chk" value="<%=넘길값%>" onclick="checkout('chka');"> --> tar
		 */
		checkalls : function(src,tar) {
		    var X=eval("document.mainx."+src);
		    var Y=eval("document.mainx."+tar);
		    if(X.checked==true) {
		        if(Y.length==null) {
		            Y.checked=true;
		        } else {
		            for(i=0;i<Y.length;i++) { Y[i].checked=true; }
		        }
		    } else {
		        if(Y.length==null) {
		            Y.checked=false;
		        } else {
		            for(i=0;i<Y.length;i++) { Y[i].checked=false; }
		        }
		    }
		},

		/* *
		 * 위의 checkalls에서 짝으로 사용된다. 여러 tar중에 하나라도 checkout하면 src도 checkout한다.
		 * 사용법은 checkalls의 설명에 있음.
		 */
		checkout : function(name) {
		    var X=eval("document.mainx."+name);
		    X.checked=false;
		},


		/* *
		 * 주로 textarea에서 글자수를 제한할때 사용한다.
		 * textareaLimitColor([제한글자수])와 짝으로 사용됨.
		 * 사용법:100글자로 제한하고자 할 경우 (onblur 혹은 onchange에 사용)
		 * <textarea ... onblur="textareaLimitGetNames(this.form.name,this.name,100)">
		 *
		 */
		textareaLimitGetNames : function(formName,fieldName,limit) {
		    var textareaFormObj=document.getElementById(formName);
		    var textareaObj=document.getElementById(fieldName);

		    if(textareaObj.value.length <= limit) {
		        textareaObj.style.backgroundColor="";
		    } else {
		        textareaObj.style.backgroundcolor="#FFFFFF";
		        alert(limit+"자 이내로 작성해 주십시오.");
		        textareaObj.value = textareaObj.value.substring(0,limit);
		        textareaObj.select();
		    }
		},


		/* *
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

		//숫자를 3자리마다 쉼표를 넣는다.
		numberWithCommas : function(x) {
		    return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
		},

		/* *
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
		NumberFormat  : function() {
		    if(this==0) return 0;

		    var reg = /(^[+-]?\d+)(\d{3})/;
		    var n = (this + '');

		    while (reg.test(n)) n = n.replace(reg, '$1' + ',' + '$2');

		    return n;
		},

		// 문자열 타입에서 쓸 수 있도록 format() 함수 추가
		StringFormat   : function() {
		    var num = parseFloat(this);
		    if( isNaN(num) ) return "0";

		    return num.format();
		},

		/* *
		 * 현재시간을 표현한다.
		 * 사용법: onload 설정, <span id="liveclock"></span>
		 */
		showCurrentTime  : function() {

		    var curtime = new Date();
		    var hours = curtime.getHours();
		    var minutes = curtime.getMinutes();
		    var seconds = curtime.getSeconds();
		    var dn = "오전";

		    if (hours>12) {
		        dn = "오후";
		        hours = hours - 12;
		    }
		    if (hours == 0) hours=12;
		    if (minutes <= 9) minutes = "0" + minutes;
		    if (seconds<=9) seconds = "0" + seconds;

		    // 글꼴을 수정 할 수 있습니다
		    var myclock=dn+"&nbsp;" + hours + ":" + minutes + ":" + seconds;
		    document.getElementById("liveclock").innerHTML = myclock;
		    setTimeout("showCurrentTime()",1000);
		},

		/* *
		 * Parameter 시간만큼 띄운 창닫기 시간을 지연한다.
		 */
		pauseTime  : function(timex){
		    var time= new Date();
		    hours= time.getHours();
		    mins= time.getMinutes();
		    secs= time.getSeconds();
		    closeTime=hours*3600+mins*60+secs;
		    closeTime+=(eval(timex)/1000);
		    Timer(timex);
		},

		Timer  : function(timex){
		    var time= new Date();
		    hours= time.getHours();
		    mins= time.getMinutes();
		    secs= time.getSeconds();
		    curTime=hours*3600+mins*60+secs
		    if (curTime>=closeTime){
		        self.close();
		    }else{
		        window.setTimeout("Timer()",eval(timex));    // 열려있을 시간
		    }
		},

		timer  : function(t) {
		    Timer(t);
		},

		/* *
		 * 특정 입력필드에 한글입력 금지
		 * <input type="text" name="fieldx" onBlur="hanCheck(this);">
		 */
		hanCheck  : function(x) {
		    for(i=0 ; i<x.value.length ; i++) {
		        var a = x.value.charCodeAt(i);
		        if(a > 128) {
		            alert('이 필드에는 한글을 입력할 수 없습니다!');
		            x.value = "";
		            x.focus();
		            //x.select();
		            return;
		        }
		    }
		},

		/* *
		 * 링크를 클릭했을 경우, 지정한색깔로 클릭했던 객체의 색깔을 표시해 둔다.
		 */
		clickMarking  : function(idx) {
		    if(row_tid!='') document.getElementById(row_tid).bgColor = row_tcolor;
		    var obj1=document.getElementById(idx);
		    row_tcolor='#FFFFFF';
		    row_tid=obj1.id;
		    obj1.bgColor='#33FFCC';
		},

		/*
		 * 특정 ID를 가진 iframe에 원하는 URL을 표시한다.
		 *
		 * (Iframe에 POST방식으로 필드값을 넘길 수 있다.)
		 */
		showIframePost  : function(idx,urlx) {
		    var xForm = document.getElementsByTagName('FORM');
		    var xIframe = document.getElementById(idx);
		    var thisForm;
		    for(var i = 0; i < xForm.length; i++) {
		        if(xForm[i].name=='mainx') {
		            thisForm = xForm[i];
		            break;
		        }
		    }

		    //표준은 name이아니라 id로 설정한다.
		    thisForm.target = xIframe.id;
		    thisForm.action = urlx;
		    thisForm.submit();
		},

		/*
		 * 특정 ID를 가진 iframe에 원하는 URL을 표시한다.
		 *
		 * (Iframe에 GET방식으로 필드값을 넘길 수 있다.)
		 */
		showIframe  : function(idx,url) {
		    var xframe=document.getElementById(idx);
		    xframe.src=url;

		},

		copyText : function(msg){
		    window.clipboardData.setData('text', msg);
		    alert("클립보드로 복사 되었습니다. \nCtrl + V로 붙여넣기를 하십시오.");
		},

		/* ***************************************************************
		 * 모듈의존적인 신규추가 함수 모음
		 ****************************************************************/
		addBasicTag  : function(formName) {

		    var fName = formName;
		    if(fName.basictags.value == "") {
		        alert("추가할 태그를 입력하십시오. 하나 이상의 태그를 등록할 경우 반드시 쉼표(,)로 구분하세요!");
		        fName.basictags.focus();
		        return false;
		    } else {
		        var xIframe = document.getElementById("hiddenBasicTagIframe");
		        fName.target = xIframe.id;
		        //fName.target = "_blank";
		        fName.action = "/common/addbasictag.asp";
		        fName.submit();
		        fName.target = "";
		    }
		},

		setBasicTag  : function(atag) {
		    var tfield = document.getElementById("basictags");
		    tfield.value = trim(tfield.value);

		    if(atag != "") {
		        if(tfield.value == "") {
		            tfield.value = atag;
		        } else if(tfield.value.substring(tfield.value.length-1,1)==',') {
		            tfield.value = tfield.value+atag;
		        } else {
		            tfield.value = tfield.value+","+atag;
		        }
		    }
		},

		addBasicTagNoLogin  : function(returnUrl) {
		    if(confirm("태그를 추가하시려면 로그인 하셔야 합니다. 로그인하시겠습니까?")) {
		        //location.href = "/member/login.asp?backurl="+returnUrl;
		        popUpLoginWin(returnUrl);
		    } else {
		         return false;
		    }
		},

		addBasicCommentNoLogin  : function(returnUrl) {
		    if(confirm("글을 남기시려면 로그인 하셔야 합니다. 로그인하시겠습니까?")) {
		        //parent.location.href = "/member/login.asp?backurl="+returnUrl;
		        popUpLoginWin(returnUrl);
		    } else {
		         return false;
		    }
		},

		addRecommendationNoLogin  : function(returnUrl) {
		    if(confirm("먼저 로그인 하셔야 합니다. 로그인하시겠습니까?")) {
		        //parent.location.href = "/member/login.asp?backurl="+returnUrl;
		        popUpLoginWin(returnUrl);
		    } else {
		         return false;
		    }
		},

		dicNoLogin  : function(returnUrl) {
		    if(confirm("열린태그사전을 만드는데 참여하시려면 로그인 하셔야 합니다. \n로그인하시겠습니까?")) {
		        popUpLoginWin(returnUrl);
		    } else {
		         return false;
		    }
		},

		joinMailingListNoLogin  : function(returnUrl) {
		    if(confirm("메일링리스트에 가입신청 하시려면 로그인 하셔야 합니다. 로그인하시겠습니까?")) {
		        popUpLoginWin(returnUrl);
		        return false;
		    } else {
		         return false;
		    }
		},

		joinMailingList : function() {

		    var itext = $('#mailinglistaddr');
		    if(itext.val()=="") {
		        alert("메일링 리스트에 가입신청 할 메일주소를 입력하세요!");
		        itext.focus();
		        return false;
		    } else {
		        //pattern=/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		        pattern = /([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
		        if(!pattern.test(itext.val())) {
		            alert("올바른 메일주소를 입력하세요!");
		            itext.focus();
		            return false;
		        }
		    }
		},

		doAgree  : function(rType,rId,rIdx,param) {
		    var xIframe = document.getElementById("hiddenRecommandationIframe");
		    xIframe.src = "/common/addrecommendation.asp?mode=Y&recommendType="+rType+"&recommendId="+rId+"&recommendIdx="+rIdx+"&param="+param;
		},

		showSecureLoginProcessing : function() {
		    //document.getElementById('divSecureProcessing').style.width = screen.availWidth + 'px';

		    var secustv = getCookie("secust");
		    if(secustv == "ON") {
		        showDivPanel("divSecureProcessing");
		    }
		},

		hideSecureLoginProcessing : function() {
		    var secustv = getCookie("secust");
		    if(secustv == "ON") {
		        hideDivPanel("divSecureProcessing");
		    }
		},

		/* *
		 * 이벤트가 발생한 키코드 값을 반환한다
		 *
		 * 사용법:  onkeypress="if(getKeyCode(event)==13) go_page('<%=pageNum%>');"
		 */
		getKeyCode  : function(e) {
		    var keycode = null;
		    if (!e) var e = window.event
		    if (e.keyCode){
		        keycode = e.keyCode;
		    } else if (e.which) {
		        keycode = e.which;
		    }

		    return keycode;
		},

		/* *
		 * '-' 삭제 처리
		 */
		deleteHyphen  : function(ctl) {
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


		/* ***************************************************************************************
		 * 자연이랑 리뉴얼 신규 함수 모음
		 ****************************************************************************************/
		toggleTopMenu : function(divMenuId,pDiv) {

		    $('#divTopMenu > div:not(#'+divMenuId+')').hide();

		    $('#'+divMenuId).css('left',$(pDiv).position().left);
		    $('#'+divMenuId).css('top',$(pDiv).position().top+35);
		    //$('#'+divMenuId).toggle('slide');
		    $('#'+divMenuId).slideToggle('fast');

		},

		showTopMenu : function(divMenuId,pDiv) {
		    if($('#'+divMenuId).is(':visible')==false) {
		        $('#'+divMenuId).css('left',$(pDiv).position().left);
		        $('#'+divMenuId).css('top',$(pDiv).position().top+35);
		        $('#'+divMenuId).slideDown('fast');
		        $('#'+divMenuId).show();
		    }
		},

		hideTopMenu : function(divMenuId) {
		    if($('#'+divMenuId).is(':visible')==true) {
		        $('#'+divMenuId).slideUp('fast');
		    }
		},

		highlightBorder : function(ctrl,color) {
		    $(ctrl).css('border-color',color);
		},

		nomalBorder : function(ctrl) {
		    $(ctrl).css('border-color','');
		},

		popUpLoginWin : function(backurl) {
		    //popup62win = window.open('/member/login.asp?backurl='+escape(backurl),'loginPopUp','toolbar=no,menubar=no,location=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=no,width=576,height=370,top='+(wint-370/2)+',left='+(winl-580/2));
		    popup62win = window.open('/member/login.asp?backurl='+escape(backurl),'loginPopUp','toolbar=no,menubar=no,location=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=no,width=550,height=510,top='+(wint-370/2)+',left='+(winl-580/2));
		},

		searchTop : function() {
		    if($('#topsearch').val()=="") {
		        alert("검색어를 입력하세요!");
		        return false;
		    } else {
		        document.formtopsearch.submit();
		    }
		},

		searchTopSuggest : function() {
		    if($('#topsearch').val().trim()=="") {
		        if($('#topsearch').attr('placeholder')!="") {
		            $('#topsearch').val($('#suggest_product').val());
		            document.formtopsearch.submit();
		        } else {
		            alert("검색어를 입력하세요!");
		            return false;
		        }

		    } else {
		        document.formtopsearch.submit();
		    }
		},

		searchBottom : function() {
		    if($('#bottomsearch').val()=="") {
		        alert("검색어를 입력하세요!");
		        return false;
		    } else {
		        document.formbsearch.submit();
		    }
		},

		/* *
		 * 자주구매하는 상품(타입R)를 등록/취소한다
		 * 20161006 수정 sjbae
		 */
		updateRepeatedlyg : function(gcd) {
		    var strUrl = "/common/updaterepeatedlyg.asp";
		    var rval = "-1";

		    $.ajax({
		        url: strUrl,
		        data: {gdcd: gcd},
		        dataType: "json",
		        type: "POST",
		        async: false,
		        success: function (data) {
		        	
		        	rval = data.rcount;
		            if(rval=="0") {               // 제거 완료
		                //$('#imgRepeatedlyg').attr("src","/images/button/wbtn_openpurchase.png");
		                //$('#imgRepeatedlyg').attr("title","자주구매상품등록하기");

		                $("#repeatedBuyBtn_"+gcd).removeClass("active");
		            } else if(rval=="1") {      // 추가 완료
		                //$('#imgRepeatedlyg').attr("src","/images/button/obtn_openpurchase.png");
		                //$('#imgRepeatedlyg').attr("title","자주구매상품제외하기");
		                $("#repeatedBuyBtn_"+gcd).addClass("active");
		            }
		            layer_open_new('product-like');
		        }
		    });		    
		    
		},

		/* *
		 * 자주구매하는 상품(타입R)인지 파악 후 버튼색을 설정한다
		 * 20161006 수정 sjbae
		 */
		existRepeatedlyg : function(gcd) {
		    var strUrl = "/common/existrepeatedlyg.asp";
		    var rval = "-1";

		    $.ajax({
		        url: strUrl,
		        data: {gdcd: gcd},
		        dataType: "json",
		        type: "POST",
		        async: false,
		        success: function (data) {
		        	rval = data.rcount;
			        //if($('#imgRepeatedlyg')) {
		            if(rval=="1") {
		                //$('#imgRepeatedlyg').attr("src","/images/button/obtn_openpurchase.png");
		                //$('#imgRepeatedlyg').attr("title","자주구매상품제외하기");
		                $("#repeatedBuyBtn_"+gcd).addClass("active");
		            } else {
		                //$('#imgRepeatedlyg').attr("src","/images/button/wbtn_openpurchase.png");
		                //$('#imgRepeatedlyg').attr("title","자주구매상품등록하기");
		                $("#repeatedBuyBtn_"+gcd).removeClass("active");
		            }
		        //}
		        }
		    });		    
		    
		},

		trim : function(str){
		   //정규 표현식을 사용하여 화이트스페이스를 빈문자로 전환
		   str = str.replace(/^\s*/,'').replace(/\s*$/, '');
		   return str; //변환한 스트링을 리턴.
		},

		/* *
		 * 장바구니에 담을경우 표시된 재고량을 초과하는 수량 담을 수 없도록 처리.
		 * 20161007 sjbae 수정 : 결과 팝업 레이어 변경
		 */
		putCart : function(gdcd, otype, stqty) {
		    var putqty = parseInt(document.getElementById(gdcd+"_CNT").value);
		    if(putqty > parseInt(stqty)) {
		        alert(stqty+"개까지 담을 수 있습니다.");
		        return false;
		    } else {
		        $('#divMiniCartMsgSpan').html("장바구니에 상품이 담겼습니다.");

		        if(fn_CartMgr(gdcd,"",otype,"ADD")==true) {
		            //TagToTip("divMiniCartMsg",ABOVE,true,OFFSETX,-110,WIDTH,210,TEXTALIGN,"center",FADEIN,100,FADEOUT,500,PADDING,8,CLICKCLOSE,true,STICKY,true);
		            layer_open_new('product-basket');
		        }
		    }
		},

		/* *
		 * 20161007 sjbae 수정 : 결과 팝업 레이어 변경
		 * @param gdcd
		 * @param otype
		 * @param stqty
		 * @returns {Boolean}
		 */
		putCartMulti : function(gdcd, otype, stqty) {
		    var putqty = parseInt(document.getElementById(otype+gdcd+"_CNT").value);
		    if(putqty > parseInt(stqty)) {
		        alert(stqty+"개까지 담을 수 있습니다.");
		        return false;
		    } else {
		        $('#divMiniCartMsgSpan').html("장바구니에 상품이 담겼습니다.");

		        if(fn_CartMgrMulti(gdcd,"",otype,"ADD")==true) {
		            //TagToTip("divMiniCartMsg",ABOVE,true,OFFSETX,-110,WIDTH,210,TEXTALIGN,"center",FADEIN,100,FADEOUT,500,PADDING,8,CLICKCLOSE,true,STICKY,true);
		            layer_open_new('product-basket');
		        }
		    }
		},


		/* *
		 * 20161006 sjbae 수정 : 결과 팝업 레이어 변경
		 * @param gdcd
		 * @param otype
		 * @param stqty
		 * @param msg
		 * @returns {Boolean}
		 */
		putCartMsg : function(gdcd, otype, stqty, msg) {
		    var putqty = parseInt(document.getElementById(gdcd+"_CNT").value);
		    if(putqty > parseInt(stqty)) {
		        alert(stqty+"개까지 담을 수 있습니다.");
		        return false;
		    } else {
		        /*
		        if(msg == "") {
		            $('#divMiniCartMsgSpan').html("장바구니에 상품이 담겼습니다.");
		        } else {
		            $('#divMiniCartMsgSpan').html(msg);
		        }
		        */
		        if(fn_CartMgr(gdcd,"",otype,"ADD")==true) {
		            //TagToTip("divMiniCartMsg",ABOVE,true,OFFSETX,-110,WIDTH,210,TEXTALIGN,"center",FADEIN,100,FADEOUT,500,PADDING,8,CLICKCLOSE,true,STICKY,true);
		            if(msg != ""){
		                $("#cartMsg").html(msg);
		                layer_open_new('detail-basket-grain');
		            }else{
		                layer_open_new('product-basket');
		            }
		        }
		    }
		},

		/* *
		 * 20161007 sjbae 수정 : 결과 팝업 레이어 변경
		 * @param gdcd
		 * @param otype
		 * @param stqty
		 * @param msg
		 * @returns {Boolean}
		 */
		putCartMultiMsg : function(gdcd, otype, stqty, msg) {
		    var putqty = parseInt(document.getElementById(otype+gdcd+"_CNT").value);
		    if(putqty > parseInt(stqty)) {
		        alert(stqty+"개까지 담을 수 있습니다.");
		        return false;
		    } else {
		        /*
		        if(msg == "") {
		            $('#divMiniCartMsgSpan').html("장바구니에 상품이 담겼습니다.");
		        } else {
		            $('#divMiniCartMsgSpan').html(msg);
		        }
		        */
		        if(fn_CartMgrMulti(gdcd,"",otype,"ADD")==true) {
		            //TagToTip("divMiniCartMsg",ABOVE,true,OFFSETX,-110,WIDTH,210,TEXTALIGN,"center",FADEIN,100,FADEOUT,500,PADDING,8,CLICKCLOSE,true,STICKY,true);
		            if(msg != ""){
		                $("#cartMsg").html(msg);
		                layer_open_new('detail-basket-grain');
		            }else{
		                layer_open_new('product-basket');
		            }
		        }

		    }
		},

		/*
		 * 모바일 접근 확인 및 페이지 redirect
		 * 사용법: 페이지 내 javascript에서 checkAndGoMobilePage(목적지url) 함수 호출
		 */
		checkAndGoMobilePage : function(destUrl) {
		    //모바일기기에서 접속하면 모바일 웹페이지로 이동.
		    var mobileKeyWords = new Array('iPhone','iPod','BlackBerry','Android','Windows CE','Windows CE;','LG','MOT','SAMSUNG','SonyEricsson','Mobile','Symbian','Opera Mobi','Opera Mini','IEmobile');
		    for (var word in mobileKeyWords) {
		        if (navigator.userAgent.match(mobileKeyWords[word]) != null) {
		            window.location.href = destUrl;
		            break;
		        }
		    }
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
		 * 지역제한코드에 따라 배송이 가능한 지역인지 여부를 반환한다.
		 * 20210723 김민희 MD의 요청으로 수도권에 경기도 외 인천일부 지역 추가.
		 *          계양구(21000~21299), 부평구(21300~21499), 남동구(21500~21899), 연수구(21900~22099), 미추홀구(22100~22299), 서구(22600~22999) 추가.
		 *          중구(22300~22499 영종도 및), 동구(22500~22599), 강화군(23000~23099), 옹진군(23100~23199) 미추가.
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
		        //if(pcn >= 1000 && pcn <= 19999) { //경기도.
		        if((pcn >= 1000 && pcn <= 19999) || (pcn >= 21000 && pcn <= 22299) || (pcn >= 22600 && pcn <= 22999)) {
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

		/*
		 지정한 id 요소 지점까지 부드럽게 스크롤 이동한다.
		 */
		gotoIdScrolling : function(eid, e) {
		    var offset = $('#'+eid).offset();
		    if(offset != null) $('html, body').animate({scrollTop : offset.top}, 1000);
		    if (!e) var e = window.event
		    e.preventDefault();
		},

		/**
		 * 휴대전화 유효성 검사
		 */
		isCellPhone : function(p) {
		    p = p.split('-').join('');
		    var regPhone = /^((01[1|6|7|8|9])[1-9]+[0-9]{6,7})|(010[1-9][0-9]{7})$/;

		    return regPhone.test(p);
		},

		/**
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

		/**
		 * 이메일형식 유효성 검사
		 */
		isEmailFormat : function(em) {
		    //var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		    var regExp = /([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
		    if(em.match(regExp)==null) {
		        return false;
		    } else {
		        return true;
		    }
		},

		/**
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
		}
		

	}
}();



/* ****************************************************************************
System        : 자연이랑
Program       :
Title         : 자연이랑 Common Functions
File          : common.js
Program Type  : js
Analyst       :
Author        : hwkim
Date Started  : 20080124
Last Modified :
Called By     :
Parameters    :
Purpose       :
              :
Version       :

Modified     Author     V/M     Reason For Modification
---------    ---------- ---     ----------------------------------------------
20121122    hwkim       1.0     리뉴얼 사이트 적용
20150713    hwkim       1.0.1   putCartMsg, -MultMsg 추가
20160331    hyeok       ---     모바일 접근 확인 및 redirect
20210723    sykim       -       checkLimitDeliveryArea 함수의 수도권지역에 인천 일부지역 추가.
20210915    hwkim       -       showWaiting(), showDivPanel(1) 배경 처리 보완
***************************************************************************** */
