/* jQuery Ready */
$(function() {

	common_app.init();
	// 변수초기화
	common_app.initVars();
	// 키이벤트
	common_app.initKeyEvent();
});


//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//															common_app (앱)
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var common_app = function() {
	
	return {
		parser : null, 
		appInfo : null,
		
		scrollInterval : null,
		appMktFlag : null,
		pushConfigResult : null,

		initVars : function() {
			
		},
		cannotAccess : function() {
			 alert('접근할 수 없습니다. 권한이 부족합니다.');
		},
	    
	    /**
	     * user agent 초기화 
	     */
	    init : function() {
	        this.parser = new UserAgentUtil(navigator.userAgent);
	        this.appInfo = this.parser.getAppInfo();
	        
//	        if (false && this.appInfo.isapp) {
//	            $(document).bind("touchstart", function() {
//	               
//	                if (common_app.scrollInterval != null) {
//	                    clearInterval(common_app.scrollInterval);
//	                }
//	                
//	                common_app.scrollInterval = setInterval(function() {
//	                   common_app.scroll();
//	               }, 100); 
//	            });
//	            
//	            $(document).bind("touchend", function() {
//	                setTimeout(function() {
//	                    clearInterval(common_app.scrollInterval); 
//	                    common_app.scrollInterval = null;
//	                }, 1000);
//	                
//	            });
//	        } 
	        $("#contactInfoBtn").on("click",function(){
	            var isVer = common_app.appInfo.appver.replace(/\./gi, "");
	            var isOS  = common_app.appInfo.ostype;
	            
	            /* ios는 10, android는 20 주소록 없는 구버전은 앱다운로드 유도 */
	            if ((isOS == "10" && parseInt(isVer) < 224)) {
	                if(confirm("최신버전 앱으로 업데이트하고\n연락처를 편하게 입력해보세요.")){
	                    location.href = "oliveyoungapp://openBrowser?url=https://itunes.apple.com/kr/app/ollibeuyeong/id873779010?l=kr&mt=8";
	                }
	                
	            }else if((isOS == "20" && parseInt(isVer) < 222)){
	                if(confirm("최신버전 앱으로 업데이트하고\n연락처를 편하게 입력해보세요.")){
	                    location.href = "oliveyoungapp://openBrowser?url=market://details?id=com.oliveyoung";
	                }
	                
	            }else{
	                location.href = "oliveyoungapp://getContactInfo";
	            }
	        });
	    },

	    /**
	     * 0105. APP_앱설정화면호출_송신
	     */
	    callSettings : function() {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://settings";
	        }
	    },
	    
	    /**
	     * 0106. APP_로그인_송신
	     */
	    callLoginInfo : function(loginYn, loginId, ssoMbrNo, strNtcRcvAgrYn, mblEventAgrYn, callPushAgrYn, closeYn, custInfo, bioPopHide, touchIdLoginYn, biometricsUseYn, referer, isAppver, encMbrNo) {
	        if (common_app.appInfo.isapp) {
	        	if(isAppver == "Y"){
	        		location.href = "oliveyoungapp://loginInfo?loginYn=" + loginYn + "&loginId=" + loginId + "&ssoMbrNo=" + ssoMbrNo
	                + "&strNtcRcvAgrYn=" + strNtcRcvAgrYn + "&mblEventAgrYn="+ mblEventAgrYn + "&callPushAgrYn=" + callPushAgrYn + "&closeYn=" + closeYn + "&custInfo=" + common_app.fixedEncodeURIComponent(custInfo)
	                + "&bioPopHide=" + bioPopHide + "&touchIdLoginYn=" + touchIdLoginYn + "&biometricsUseYn=" + biometricsUseYn + "&movePage=" + common_app.fixedEncodeURIComponent(referer) + "&encMbrNo=" + encMbrNo;
	        	}else{
	        		location.href = "oliveyoungapp://loginInfo?loginYn=" + loginYn + "&loginId=" + loginId + "&ssoMbrNo=" + ssoMbrNo
	                + "&strNtcRcvAgrYn=" + strNtcRcvAgrYn + "&mblEventAgrYn="+ mblEventAgrYn + "&callPushAgrYn=" + callPushAgrYn + "&closeYn=" + closeYn + "&custInfo=" + common_app.fixedEncodeURIComponent(custInfo)
	                + "&bioPopHide=" + bioPopHide + "&touchIdLoginYn=" + touchIdLoginYn + "&biometricsUseYn=" + biometricsUseYn + "&encMbrNo=" + encMbrNo;
	        	}
	        }
	    },
	    
	    /**
	     * 0107. APP_로그아웃_송신
	     */
	    callLogout : function() {
	        if (common_app.appInfo.isapp) {
	            //console.log(">>>>>>>>>>>>> logout");
	            location.href = "oliveyoungapp://logout";
	        }
	    },
	    
	    /**
	     * 0108. APP_외부브라우저_실행_송신
	     */
	    callOpenBrowser : function(url) {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://openBrowser?url=" + common_app.fixedEncodeURIComponent(url);
	        } else {
	            window.open(url);
	        }
	    },
	    
	    /**
	     * 0109. APP_업로드_이미지선택_송신
	     */
	    callImgSelector : function() {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://imageSelector";
	        }
	    },
	    
	    /**
	     * 0110. APP_업로드_이미지선택_결과_수신
	     */
	    setUploadImgBase64 : function(fileName, fileBase64) {
	        if (common_app.appInfo.isapp) {
	            this.callbackUploadImgBase64(fileName, fileBase64);
	        }
	    },
	    
	    /**
	     * 이미지 업로드 결과 수신 콜백 - 개발 페이지에 override 구현
	     */
	    callbackUploadImgBase64 : function(fileName, fileBase64) {
	        
	    },
	    
	    /**
	     * 0111. APP_URL링크_이동_송신
	     */
	    callOpenPage : function(title, url, closeYn, isGet, isBack) {
	        if (common_app.appInfo.isapp) {
	            closeYn = common.isEmpty(closeYn) ? "N" : closeYn;
	            isGet = common.isEmpty(isGet) ? "N" : isGet;
	            isBack = common.isEmpty(isBack) ? "N" : isBack;
	            
	            location.href = "oliveyoungapp://openPage?" 
	                + "title=" + common_app.fixedEncodeURIComponent(title) 
	                + "&url=" + common_app.fixedEncodeURIComponent(url) 
	                + "&closeYn="+common_app.fixedEncodeURIComponent(closeYn) 
	                + "&isGet=" + common_app.fixedEncodeURIComponent(isGet) 
	                + "&isBack=" + common_app.fixedEncodeURIComponent(isBack);
	            
	        }else{
	            window.open(url);
	        }        
	    },
	    
	    /**
	     * 0112. APP_앱실행_송신
	     */
	    callExcApp : function() {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://";
	        }
	    },
	    
	    
	    /**
	     * 0113. APP_로딩바_송신
	     */
	    callShowLoadingBar : function(showYn) {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://showLoadingBar?showYn=" + showYn;
	        }
	    },
	    
	    
	    /**
	     * 0115. APP_웹페이지스크립트호출_송신
	     */
	    callWebScript : function(scriptNm) {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://callWebScript?script=" + scriptNm;
	        }
	    },
	    
	    /**
	     * 0114. APP_팝업닫기_송신(deeplink)
	     */
	    callClosePage : function() {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://closePage";
	        }
	    },
	    
	    /**
	     * 0114. APP_로그아웃요청_수신(javascript)
	     */
	    logout : function() {
	        //로그아웃
	        if (common_app.appInfo.isapp) {
	            common.link.moveLogoutPage();
	        }
	    },
	  
	    /**
	     * 0113. APP_슬라이드메뉴노출여부_송신(deeplink)
	     */
	    callMenu : function(showYn) {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://menu?showYn=" + showYn;
	        }
	    },

	    /**
	     * 0120. APP_네비게이션 가능한 팝업(일반 오픈페이지는 팝업처럼 x표시가 붙지만 얘는 화살표가 붙는다. 오픈페이지 내에 이동 가능)
	     */
	    openHistoryPage : function(title, url, closeYn, isGet) {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://openHistoryPage?title=" + common_app.fixedEncodeURIComponent(title) + 
	            "&url=" + common_app.fixedEncodeURIComponent(url) + "&closeYn="+common_app.fixedEncodeURIComponent(!common.isEmpty(closeYn) ? closeYn : "N") + "&isGet=" + common_app.fixedEncodeURIComponent(!common.isEmpty(isGet) ? isGet : "N");
	        }        
	    },
	    
		/**
	     * 0121. APP_페이지이동
	     */
	    callMovePage : function(url) {
	        // iOS의 경우 앱에서 custom scheme 호출시 이동 안되는 현상으로 인해 앱은 화면 이동으로 변경
	        if (common_app.appInfo.isapp) {
	            location.href = url;
	        } else {
	            location.href = "oliveyoungapp://movePage?af_dp=&url=" + common_app.fixedEncodeURIComponent(url);
	        }
	    },
	    
	    /**
	     * 0123. HistoryBack
	     */
	    historyBack : function() {
	        location.href = "oliveyoungapp://historyBack";
	    },

	    /**
	     * 0124. APP_웹페이지스크립트호출_송신
	     */
	    callWebUrl : function(url) {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://callWebUrl?url=" + common_app.fixedEncodeURIComponent(url);
	        }
	    },
	    
	    /**
	     * 0125. APP_팝업닫음(설정에서 로그인 관련 팝업 처리 용도)
	     */
	    callClosePopup : function() {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://closePopup";
	        }
	    },

	    /**
	     * 0126. alert 을 toast팝업으로 띄우는 용도. (안드로이드에서만 사용)
	     */
	    callOnAlertToast : function(msg) {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://onAlertToast?msg="+msg;
	        }
	    },
	    
	    //타이틀, 파라미터 인코딩
	    fixedEncodeURIComponent : function(str) {
	        return encodeURIComponent(str).replace(/[!'()]/g, escape).replace(/\*/g, "%2A");
	    },
	    
	    /**
	     * 에러 시 APP_팝업닫음(설정에서 로그인 관련 팝업 처리 용도)
	     */
	    callCloseErrPopup : function() {
	        setTimeout(function() {
	            if (common_app.appInfo.isapp) {
	                location.href = "oliveyoungapp://closePopup";
	            }
	        }, 50);
	        
	        setTimeout(function() {
	            history.back();
	        }, 300);
	    },

	    /**
	     * 앱에서 custInfo(자동로그인)쿠키 삭제시 필요
	     */
	    callDeleteCustInfo : function(){
	        if (common_app.appInfo.isapp) {
	            setTimeout(function() {
	                location.href = "oliveyoungapp://deleteCustInfo";
	            }, 200);
	        }
	    },

	    scroll : function() {
	        //$(document).scroll();
//	        console.log("스크롤이벤트 호출됨");
	    },
	    
	    /**
	     *  앱 버전 비교
	     */
	    compareVersion : function(v1, v2) {
	 
	        var rtn;
	        v1_array = v1.split('.');
	        v2_array = v2.split('.');

	        if(v1 == v2){
	            rtn =  "=";
	        }else{
	            for(var x=0;x<v1_array.length;x++){
	                if (Number(v1_array[x]) < Number(v2_array[x])){
	                    rtn =  "<";
	                    break;
	                }
	                
	                if(Number(v1_array[x]) > Number(v2_array[x])){
	                    rtn =  ">";
	                    break;
	                }
	            }
	        }
	        return rtn;
	    },
	    
	    /**
	     *  OS 버전 비교
	     */
	    compareVersion2 : function(v1, v2) {
	 
	        var rtn;
	        v1_array = v1.split('.');
	        v2_array = v2.split('.');
	        
	        var array_length = 0;
	        var ver1 = "";
	        var ver2 = "";
	        
	        if(v1_array.length > v2_array.length){
	            array_length = v1_array.length;
	        }else{
	            array_length = v2_array.length;
	        }
	        
	        for(var x=0;x<array_length;x++){
	            
	            if(common.isEmpty(v1_array[x])){
	                ver1 = 0;
	            }else{
	                ver1 = Number(v1_array[x]);
	            }
	            
	            if(common.isEmpty(v2_array[x])){
	                ver2 = 0;
	            }else{
	                ver2 = Number(v2_array[x]);
	            }
	            
	            if(ver1 < ver2){
	                rtn =  "<";
	                break;
	            }
	            
	            if(ver1 > ver2){
	                rtn =  ">";
	                break;
	            }
	        }
	        
	        if(common.isEmpty(rtn)){
	            rtn =  "=";
	        }
	        
	        return rtn;
	    },
	    
	    /**
	     * CJONE에서 스마트영수증 팝업 닫을 경우 호출하는 스킴
	     */
	    callCjoneClose : function() {
	        setTimeout(function() {
	            location.href = "cjonecard://webtoapp?action=smart_receipt_action&type=confirm";
	        }, 100);
	    },
	    
	    /**
	     * AppsFlyer trackEvent 호출하는 스킴
	     */
	    callTrackEvent : function(eventType, eventValue) {
	        var eventName = "";
	        if("gnb" == eventType){} eventName = "af_gnb";
	        if("category" == eventType) eventName = "af_category";
	        if("search" == eventType) eventName = "af_search";
	        if("goods" == eventType) eventName = "af_goods_detail";
	        if("cart" == eventType) eventName = "af_add_to_cart";
	        if("login" == eventType) eventName = "af_login";
	        if("af_purchase" == eventType) eventName = "af_purchase";
	        if("af_purchase_first" == eventType) eventName = "af_purchase_first";        
	        if("af_purchase_canceled" == eventType) eventName = "af_purchase_canceled";
	        if("af_purchase_1" == eventType) eventName = "af_purchase_1";
	        if("af_purchase_2" == eventType) eventName = "af_purchase_2";
	        if("af_purchase_3" == eventType) eventName = "af_purchase_3";
	        if("af_purchase_4" == eventType) eventName = "af_purchase_4";
	        if("af_purchase_first_1" == eventType) eventName = "af_purchase_first_1";
	        if("af_purchase_first_2" == eventType) eventName = "af_purchase_first_2";
	        if("af_purchase_first_3" == eventType) eventName = "af_purchase_first_3";
	        if("af_purchase_first_4" == eventType) eventName = "af_purchase_first_4";
	        
	        
	        if (common_app.appInfo.isapp) {

	            if(common_app.compareVersion(common_app.appInfo.appver, "2.0.8") ==  ">"){
	                //앱 스킴 호출
	                console.log("oliveyoungapp-af-event://?eventName=" + eventName 
	                        + "&eventValue=" + common_app.fixedEncodeURIComponent(JSON.stringify(eventValue)));
	                location.href = "oliveyoungapp-af-event://?eventName=" + eventName 
	                + "&eventValue=" + common_app.fixedEncodeURIComponent(JSON.stringify(eventValue));
	            }
	        }
	    },

	    /**
	     * ios post send 데이타를 받아 post send 
	     */
	    appPostSndBridge : function(path, uParams, method) {
	        var params = {};
	        
	        uParams.split('&').forEach(function(pairs) {
	            var pair = {};
	            
	            if(pairs.indexOf('=') > -1){
	                pair[0] = pairs.substring(0, pairs.indexOf('='));
	                pair[1] = pairs.substring(pairs.indexOf('=')+1, pairs.length);
	            }
	            
	            if (pair[1] !== undefined) {
	                var key = decodeURIComponent(pair[0]),
	                val = decodeURIComponent(pair[1]);
	                //val = val ? val.replace(/\++/g,' ').trim() : '';
	                
	                if (key.length === 0) {
	                    return;
	                }
	                if (params[key] === undefined) {
	                    params[key] = val;
	                }
	                else {
	                    if ("function" !== typeof params[key].push) {
	                        params[key] = [params[key]];
	                    }
	                    params[key].push(val);
	                }
	            }
	        });
	        
	        var form = document.createElement("form");
	        form.setAttribute("id", "payForm");
	        form.setAttribute("method", "post");
	        form.setAttribute("action", path);
	        
	        
	    
	        for(var key in params) {
	            if(params.hasOwnProperty(key)) {
	                var hiddenField = document.createElement("input");
	                hiddenField.setAttribute("type", "hidden");
	                hiddenField.setAttribute("name", key);
	                hiddenField.setAttribute("value", params[key]);

	                form.appendChild(hiddenField);
	            }
	        }
	        document.body.appendChild(form);
	        form.submit();
	    },
	    
	    /**
	     * 쿠키 get 
	     */
	    getCookie : function (c_name) {
	        var i,x,y,ARRcookies=document.cookie.split(";");
	        
	        for (i=0;i<ARRcookies.length;i++){
	            x=ARRcookies[i].substr(0,ARRcookies[i].indexOf("="));
	            y=ARRcookies[i].substr(ARRcookies[i].indexOf("=")+1);
	            x=x.replace(/^\s+|\s+$/g,"");
	            if (x==c_name){
	                return unescape(y);
	            }
	        }
	    },
	    
	    //바이오인증 
	    biometricShow : function(p) {
	        if (common_app.appInfo.isapp) {
	        	location.href = "oliveyoungapp://bioLogin?loginId=" + p;
	        }
	    },
	    
	    //바이오인증 가능 단말기 확인
	    biometricCheck : function() {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://isSupportedBioLogin";
	        }
	    },
	    
	    //바이오인증 정보 초기화
	    callReSetBiometrics : function() {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://resetBiometrics";
	        }
	    },
	    
	    // 푸시 리스트 new 여부
	    setPushMsgNewYn : function(newYn){
	        // 새로운 푸시 알림 있는지 확인 후 new 표시해준다.
	        if(newYn == 'Y'){
	            $(".notice").html("<em>N</em>알림");
	        }else{
	            $(".notice").html("알림");
	        }
	    },
	    
	    // 푸시 수신 동의 팝업 요청(바이오 로그인 팝업을 닫을때 or 바이오 로그인 팝업 띄우지 않을때 호출)
	    callBioLoginAgrCallBack : function() {
	        if (common_app.appInfo.isapp) {
	        	var isVer = common_app.appInfo.appver.replace(/\./gi, "");
	            var isOS  = common_app.appInfo.ostype;
	            if ((isOS == "10" && parseInt(isVer) >= 218) || (isOS == "20" && parseInt(isVer) >= 216)) {
	            	location.href = "oliveyoungapp://bioLoginAgrCallBack";
	            }
	        }
	    },
	    
	    //TMS 푸시 동의값 조회
	    getTmsPushConfig : function() {
	        common_app.appMktFlag = "";
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://getTmsPushConfig";
	        }
	    },
	    
	    //TMS 푸시 동의값 수신
	    getPushConfig : function(mktFlag) {
	        if (common_app.appInfo.isapp) {
	            common_app.appMktFlag = mktFlag;
	        }
	    },
	    
	    //TMS 푸시 동의값 설정
	    setTmsPushConfig : function(mktFlag) {
	        common_app.pushConfigResult = "";
	        if (common_app.appInfo.isapp) {
	            if(mktFlag==="N") {
	                if(confirm("알림을 해제하시겠습니까?")) {
	                    location.href = "oliveyoungapp://setTmsPushConfig?mktFlag="+mktFlag;
	                }
	            } else {
	                location.href = "oliveyoungapp://setTmsPushConfig?mktFlag="+mktFlag;
	            }
	        }
	    },
	    
	    //TMS 푸시 동의값 설정 결과 수신
	    setTmsPushConfigCallback : function(result) {
	        if (common_app.appInfo.isapp) {
	            common_app.pushConfigResult = result;
	        }
	    },
	    /* 3201008 안드로이드 앱, 모바일 팝업배너 '하루보지 않기' 동작 오류 */
	    //앱-웹간 Cookie등 동기화 수행
	    syncCookie : function() {
	        if (common_app.appInfo.isapp) {
	            location.href = "oliveyoungapp://syncCookie";
	        }
	    },
	    
	    // 선물하기 주소록 이름과 핸드폰 번호 받아오기
	    setContactInfo : function(name, phoneNumber) {
	    	
	    	var rcvManNmObj,rcvManCellSctNoObj,rcvManCellTxnoNoObj,rcvManCellEndNoObj;
	    	
	    	rcvManNmObj = $("#rcvManNm");
	    	rcvManCellSctNoObj = $("#rcvManCellSctNo");
	    	rcvManCellTxnoNoObj = $("#rcvManCellTxnoNo");
	    	rcvManCellEndNoObj = $("#rcvManCellEndNo");
	    	
	    	if( rcvManNmObj.length > 0 && rcvManCellSctNoObj.length > 0 
	    			&& rcvManCellTxnoNoObj.length > 0 && rcvManCellEndNoObj.length > 0  ){
	    		// 수령인명은 한글/영문/숫자만 가능
	    		name = replaceStrSpecialChar(name);
	    		if(name.length == 0){
	    			alert("수령인명을 다시 확인하여 주세요. 특수문자는 기입하실 수 없습니다.");
	    		}
	    		
	    		// 리셋
	    		$("#rcvManNm").val("");
	    		$("#rcvManCellSctNo").val("");
	    		$("#rcvManCellTxnoNo").val("");
	    		$("#rcvManCellEndNo").val("");
	    		
	    		// 불러온 값 셋팅
	    		var numberLength = phoneNumber.length;
	    		var hyphenIndex = phoneNumber.indexOf("-");
	    		if(hyphenIndex == -1){
	    			// 전화번호에 하이픈이 없는 경우 가공 필요
	    			if(numberLength <= 10){
	    				// 10자리 이하인 경우
	    				phoneNumber = phoneNumber.substring(0,3) + "-" + phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6,10); 
	    			}else{
	    				// 10자리 초과하는 경우
	    				phoneNumber = phoneNumber.substring(0,3) + "-" + phoneNumber.substring(3,7) + "-" + phoneNumber.substring(7,11);
	    			}
	    		}
	    		$("#rcvManNm").val(name.substring(0, 10));
	    		$("#rcvManCellSctNo").val(phoneNumber.split("-")[0]);
	    		$("#rcvManCellTxnoNo").val(phoneNumber.split("-")[1].substring(0, 4));
	    		$("#rcvManCellEndNo").val(phoneNumber.split("-")[2].substring(0, 4));
	    	}else{
	    		var rStr = name;
	        	
	            var regExp = /[^(가-힣ㄱ-ㅎㅏ-ㅣa-zA-Z0-9)]/gi;

	            if(regExp.test(name)){
	            	rStr = name.replace(regExp,"");
	            }
	            
	        	// 불러온 값 셋팅
	            var numberLength = phoneNumber.length;
	            
	            phoneNumber = phoneNumber.replace(/-/gi, "");
	        	
	        	var rcvManNmObj = $('input[name=rcvNm]');
	        	var rcvManNoObj = $('input[name=rcvPhone]');
	        	
	        	var iIndex = rcvManNmObj.length - 1;

	        	for( var i = 0; i < rcvManNmObj.length; i++ ){
	        		if( common.isEmpty(rcvManNmObj[i].value) || common.isEmpty(rcvManNoObj[i].value) ){
	        			iIndex = i;
	        			break;	
	        		}
	        	}
	        	rcvManNmObj[iIndex].value = rStr.substring(0, 10);
	    		if(phoneNumber.length>7){
					rcvManNoObj[iIndex].value = phoneNumber.substr(0, 3)+"-"+phoneNumber.substr(3, 4)+"-"+phoneNumber.substr(7, 4);
				}else if (phoneNumber.length>3){
					rcvManNoObj[iIndex].value = phoneNumber.substr(0, 3)+"-"+phoneNumber.substr(3, 4);
				}else{
					rcvManNoObj[iIndex].value = phoneNumber.substr(0, 11);
				}
	        	
	    	}
	        
	    },

	    /**
	     * APP_애플 로그인 정보 요청 송신
	     */
	    callAppleLogin : function() {
	        if (common_app.appInfo.isapp && common_app.appInfo.ostype == "10") {
	            
	            var varCompareVersionOs = common_app.compareVersion2(common_app.appInfo.osver, "13"); // OS 버전(미만 버전은 애플로그인 사용불가)
	            var varCompareVersionApp = common_app.compareVersion(common_app.appInfo.appver, "2.3.5"); // APP 버전(이하 버전은 애플로그인 사용불가)
	            
	            if( (varCompareVersionOs  ==  ">" || varCompareVersionOs == "=") && varCompareVersionApp == ">" ) {
	                
	                /* 애플로그인 DS 클릭지표 추가(로그인폼에서 애플로그인 버튼 선택 시) */
	                common.wlog("easyLogin_apple_btn_mc");
	                
	                location.href = "oliveyoungapp://appleLogin";
	            }
	        }
	    },
	    
	    /**
	     * APP_애플 로그인 정보 수신
	     */
	    getAppleLoginInfo : function(appleIdentifier) {
	    	
	        if (common_app.appInfo.isapp && common_app.appInfo.ostype == "10") { // 앱 & IOS

	            // OS 버전 비교
	            var varCompareVersionOs = common_app.compareVersion2(common_app.appInfo.osver, "13");
	            
	            if(varCompareVersionOs  ==  ">" || varCompareVersionOs == "=") { // 13 버전 이상
	                
	                if(!common.isEmpty(appleIdentifier)){ // 식별자값을 정상적으로 수신했을 때 간편로그인 사용여부 조회
	                    
	                    /* 애플로그인 DS 클릭지표 추가(로그인폼에서 애플로그인 인증 완료 시) */
	                    common.wlog("easyLogin_apple_cert_cmpl_mc");
	                    
	                    var url = _secureUrl + "login/getAppleIdfyMbrLoginInfoJson.do";
	                    var param = {easyLoginIdfy : appleIdentifier
	                                ,easyLoginType : "apple" };
	                    
	                    $.ajax({
	                        type: 'POST',
	                        url: url,
	                        data: param,
	                        async: false,
	                        success: function(data){
	                            var json = $.parseJSON(data);
	                            console.log(json);
	                            common_app.callbackAppleLogin(json);
	                        }
	                    });
	                }
	            }
	        }
	    },
	    
	    /**
	     * APP_애플 로그인 정보 수신 콜백
	     * data.easyLoginUseYn == "Y" 인 경우 로그인 처리를 진행하면 된다. 반대의 경우 로그인폼으로 이동, 통합로그인 유도
	     */
	    callbackAppleLogin : function(data) {
	        
	        if (common_app.appInfo.isapp && common_app.appInfo.ostype == "10") { // 앱 & IOS
	            
	            // OS 버전 비교
	            var varCompareVersionOs = common_app.compareVersion2(common_app.appInfo.osver, "13");
	            
	            if(varCompareVersionOs ==  ">" || varCompareVersionOs == "=") { // 13 버전 이상이면 로그인 진행
	                
	                var location_href = window.location.href; // 머무르고 있는 페이지를 확인하기 위한 선언
	                 
	                if( 0 < location_href.indexOf("login/loginForm.do") ){ // 로그인폼에서 수신한 경우
	                    
	                    if( data.easyLoginUseYn == "Y" ){ // 간편로그인 동의자인 경우
	                        this.doAppleLogin(data);
	                    } else {
	                        this.appleLoginCertAfter(data,"Y");
	                    }
	                    
	                // 로그인폼이 아닌 곳에서 수신한 경우
	                } else {
	                    var form = $('<form></form>');
	                    var url = _secureUrl + "login/loginForm.do";
	                    var fvEasyLoginType        = $("<input type='hidden' id='easyLoginType'        name='easyLoginType'        value='apple' />");
	                    var fvAppleIdentifier      = $("<input type='hidden' id='appleIdentifier'      name='appleIdentifier'      value='"+data.easyLoginIdfy+"' />");
	                    var fvAppleLoginCertSucsYn = $("<input type='hidden' id='appleLoginCertSucsYn' name='appleLoginCertSucsYn' value='Y' />");
	                    
	                    form.attr('action', url);
	                    form.attr('method', 'post');
	                    form.appendTo('body');
	                    form.append(fvEasyLoginType);
	                    form.append(fvAppleIdentifier);
	                    form.append(fvAppleLoginCertSucsYn);
	                    form.submit();
	                }
	            }
	        }
	    },
	    
	    /**
	     * 애플 로그인 off 회원이 인증 성공 시, 통합회원 로그인을 유도 - 개발 페이지에 override 구현
	     */
	    appleLoginCertAfter : function(data, appleLoginCertSucsYn) {
	        
	    },
	    
	    /**
	     * 애플 로그인 수행 - 개발 페이지에 override 구현
	     */
	    doAppleLogin : function(data) {
	        
	    },

	    /**
	     * APP_애플 로그인 정보 수신 실패or취소
	     */
	    getAppleLoginFail : function() {
	        
	        var location_href = window.location.href; // 머무르고 있는 페이지를 확인하기 위한 선언
	        
	        if( 0 < location_href.indexOf("mypage/getMemberInfoChangeForm.do") ){ // 마이페이지에서만 동작
	            $('#applelogin').prop("checked",false);
	        }
	    },

	    addNotchPixel : function(px) {
	        return common_app.appInfo.hassafearea == "true"?common_app.addPixel(px,34):px;
	    },
	    addPixel : function(px, value) {
	        var intPx = parseInt(px);
	        intPx += value;
	        return intPx+"px";
	    }		
		
	}
}
		
		

