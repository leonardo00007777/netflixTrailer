/* jQuery Ready */
$(function() {

	
});

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//																dataEvent
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var dataEvent = function() {

	return {
		cannotAccess : function() {
			 alert('접근할 수 없습니다. 권한이 부족합니다.');
			
		},
			
	}
	
}();


		
//			
//	cannotAccess : function() {
//	    alert('접근할 수 없습니다. 권한이 부족합니다.');
//	},
//	validateFieldNotEmpty : function(id, message) {
//	    var loginId = $(id).val();
//	    if ($.trim(loginId) == '') {
//	        alert(message);
//	        return false;
//	    }
//	
//	    return true;
//	},
//	convertSystemToJtmpl : function(str) {
//	    if (str) {
//	        str = str.replace(/\n/gi, "<br/>");
//	        str = str.replace(/ /gi, "&nbsp;");
//	        return str;
//	    }
//	},
//	splitToEnterKey : function(str) {
//	    if (str) {
//	        var patt = /\n/g;
//	
//	        if (patt.test(str)) {
//	            str = str.split(/\r|\n/)[0];
//	        }
//	        return str;
//	    }
//	},
//	
//	memJoinEvtNo : function() {
//	
//	    var evtNo = "";
//	    var url= _baseUrl + "event/getAgreeTermEventInfoAjax.do";
//	
//	    $.ajax({
//	        type: "POST",
//	        url: url,
//	        data: null,
//	        dataType : 'json',
//	        success: function(data) {
//	            if(data.result){
//	                evtNo = data.evtNo;
//	            }
//	        }
//	    });
//	
//	    return evtNo;
//	},
//	
//	sessionClear : function() {
//	    var url = _baseUrl + "login/sessionClear.do";
//	    common.Ajax.getAjaxObj("POST", url, "");
//	    console.log("sessionClear=======");
//	},
//	
//	loginChkForEvt : function(){
//	    var url= _baseUrl + "login/loginCheckJson.do";
//	    var loginResult = false;
//	
//	    $.ajax({
//	        type: "POST",
//	        url: url,
//	        data: null,
//	        dataType : 'json',
//	        async: false,
//	        cache: false,
//	        success: function(data) {
//	
//	            if(!data.result && data.url!=null){
//	                window.location.href = _secureUrl + data.url + "?redirectUrl=" + encodeURIComponent(location.href);
//	            }
//	
//	            loginResult = data.result;
//	        },
//	        error : function(a, b, c) {
//	            console.log(a);
//	            console.log(b);
//	            console.log(c);
//	        }
//	    });
//	
//	    return loginResult;
//	},
//	
//	isLoginForEvt : function(){
//	    var url= _baseUrl + "login/loginCheckJson.do";
//	    var loginResult = false;
//	
//	    $.ajax({
//	        type: "POST",
//	        url: url,
//	        data: null,
//	        dataType : 'json',
//	        async: false,
//	        cache: false,
//	        success: function(data) {
//	            loginResult = data.result;
//	            sessionStorage.setItem("checkLoginStatus", data.result);
//	        },
//	        error : function() {
//	            loginResult = false;
//	            sessionStorage.removeItem("checkLoginStatus");
//	        }
//	    });
//	
//	    return loginResult;
//	},    
//	
//	loginChk : function(){
//		
//	    /* 3273769 로그인체크 중복 제거 추가 진행 요청 
//	     * "login/loginCheckJson.do" 중복 호출을 막기 위한 SessionStorage내, checkLoginStatus등록
//	     * 만약 checkLoginStatus내에 값이 존재할 경우, 값을 반환한다.
//	     * false일 경우에는 checkLoginStatus값을 제거한다.
//	     */
//		var url= _baseUrl + "login/loginCheckJson.do";
//		var loginResult = false;
//	    var checkLoginStatus = sessionStorage.getItem("checkLoginStatus");
//	    if(checkLoginStatus == null || checkLoginStatus == "undefined"){
//		
//	
//	        $.ajax({
//	            type: "POST",
//	            url: url,
//	            data: null,
//	            dataType : 'json',
//	            async: false,
//	            cache: false,
//	            success: function(data) {
//	
//	                if(!data.result && data.url!=null){
//	                    window.location.href = _secureUrl + data.url + "?redirectUrl=" + encodeURIComponent(location.href);
//	                }
//	
//	                loginResult = data.result;
//	            },
//	            error : function(a, b, c) {
//	                console.log(a);
//	                console.log(b);
//	                console.log(c);
//	            }
//	        });
//	    }else{
//	    	loginResult = JSON.parse(sessionStorage.getItem("checkLoginStatus"));
//	    	if(loginResult == false){
//	    		window.location.href = _secureUrl + "login/loginForm.do" + "?redirectUrl=" + encodeURIComponent(location.href);
//	    	}
//	    }
//	    return loginResult;
//	},
//	
//	
//	isLogin : function(){
//	    
//	    /* 3212592 12월올영세일_온라인몰 특이현상 점검 및 개선 요청의 件 
//	     * "login/loginCheckJson.do" 중복 호출을 막기 위한 SessionStorage내, checkLoginStatus등록
//	     * 만약 checkLoginStatus내에 값이 존재할 경우, 값을 반환한다.
//	     * false일 경우에는 checkLoginStatus값을 제거한다.
//	     */
//		
//		  var url= _baseUrl + "login/loginCheckJson.do";
//	    var loginResult = false;
//	    
//	    var checkLoginStatus = sessionStorage.getItem("checkLoginStatus");
//	    if(checkLoginStatus == null || checkLoginStatus == "undefined"){
//	    	
//	        $.ajax({
//	            type: "POST",
//	            url: url,
//	            data: null,
//	            dataType : 'json',
//	            async: false,
//	            cache: false,
//	            success: function(data) {
//	                loginResult = data.result;
//	                sessionStorage.setItem("checkLoginStatus", data.result);
//	            },
//	            error : function() {
//	                loginResult = false;
//	                sessionStorage.removeItem("checkLoginStatus");
//	            }
//	        });
//	    }else{
//	    	loginResult = JSON.parse(sessionStorage.getItem("checkLoginStatus"));
//	
//	    	if(loginResult != false ){
//	    		if(sessionStorage.getItem("byIsNotLoginFirPurBan") == "done"){
//	    			//비로그인 -> 로그인와서 처음 행위
//	    			sessionStorage.removeItem("firstPurchaseBanInfo");
//	    			sessionStorage.removeItem("byIsNotLoginFirPurBan");
//	    		}
//	    	}
//	    }
//	    return loginResult;
//	}
//	
