/* jQuery Ready */
$(function() {
	
	loginForm.init();
	loginForm.initKeyEvent();	
});

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//											loginForm
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var loginForm = function() {

	//******************  전역변수  ***************************/
	// 암호화된 id/pw 
	var enc_userid = "";
	var enc_password = "";
	var timer;
	//****************************************************/
	
	return {
		init : function() {

			// sessionStorage 체크 (로그인 진행상태)
			loginForm.initSessionStorage();
			
			// Autologin 체크
			loginForm.chkAutoLogin();
		},
		
		//---------------------------------------------------------------------------
		// Session Storage 값체크
		//---------------------------------------------------------------------------
		initSessionStorage : function() {
			
			// 로그인 로직체크 갔다온후 
			var isLoginStart = sessionStorage.getItem("loginStart");
			var backurl = sessionStorage.getItem("backurl");
			var loginresult =sessionStorage.getItem("loginresult");
			var loginuserid =sessionStorage.getItem("loginuserid");
			var loginpassword =sessionStorage.getItem("loginpassword");

			if(isLoginStart){
				sessionStorage.removeItem("loginStart");
				
				// 비번실패회원  /승급요청회원  /잠김회원 
				if(loginresult == "FAIL" || loginresult == "UPREQ" || loginresult == "LOCK"){
					// 결과 url로 화면이동(post)
					if(loginresult == "UPREQ"){
						// 승급의 경우, mode값 전달하여 이동	
						common_link.goMappingUrl1(backurl, "mode", loginresult);
					}else {
						common_link.goMappingUrl(backurl);
					}
					
				// login success
				}else {
					// backurl 없으면, main 이동 	
					if (backurl == null || backurl == "" || backurl == undefined){
						common_link.goMappingUrl("/main");
					}
		    		
					// mypage 이동
					common_link.goMappingUrl2("/mypage", "loginuserid", loginuserid, "loginpassword", loginpassword);
					
				}
			}
		},

		//---------------------------------------------------------------------------
		// Key Event 
		//---------------------------------------------------------------------------
		initKeyEvent : function() {

			//---------------------------------------------
		    // Login / 회원가입 
		    //---------------------------------------------
		    // 로그인 처리  (validation + submit)
			$("#loginuserid, #loginpassword").keypress(function(e){
				
				if(e.keyCode == 13) {
					loginForm.loginSubmit();
			    }
			});
			
			// login 폼 > 로그인 
			$("#loginFormGroup").find("#loginBtn").bind("click", function() {
				loginForm.loginSubmit();
			});
			
			// ID 찾기
			$("#loginGroup").find("#btnSearchId").bind("click", function() {
				common_link.goMappingUrl("/login/searchid");
			});
			
			// 비번 재설정
			$("#loginGroup").find("#btnResetPwd").bind("click", function() {
				common_link.goMappingUrl("/login/resetpwd");
			});
			
		    // 회원가입
	        $("#loginGroup").find("#btnJoinMember").bind("click", function() {
	        	common_link.goMappingUrl("/member/joinmemberchoice");
		    });
	        
		},
		
		//---------------------------------------------------------------------------
		// Login  >   비번체크
		//---------------------------------------------------------------------------		
		loginSubmit : function() {
			
			var isValidLogin = loginForm.validLogin();
			
			 // 1.  id, pw 값있는 경우
			if(isValidLogin){
				sessionStorage.removeItem("checkLoginStatus");

		    	var id = $("#loginuserid").val();
		    	var pw = $("#loginpassword").val();
				var _url = "/login/passwdchk";
				var _param = { "id" :  id, "pw" : pw};				
				common_ajax.sendRequest("POST",  _url, _param, loginForm.passwdChkCallback, false);
			 }
		},
		passwdChkCallback  : function(data) {
			
			// 2. 비번체크 정상인 경우
            if(data.result){
            	// 3. 로그인 시작
            	loginForm.loginStart();
            	
            } else {
                $("#loginpassword").val("");
                $("#loginpassword").focus();
                return false;
            }			
		},
		
		//---------------------------------------------------------------------------
		// Login  >   login start
		//---------------------------------------------------------------------------			
		loginStart  : function() {
			
			// 로그인 session  O
			if(common.isLogin()){
				alert('이미 로그인상태');
				
				$("#loginpassword").val("");
				$("#loginpassword").focus();	        		
				
				common_link.goMappingUrl("/main");
			}
			
			// 로그인 session  X ,  로그인 start (cookie / session 처리)
			var autologin = $("input:checkbox[id='autologin']").is(":checked") ;   // true/false
	    	var id = $("#loginuserid").val();
	    	var pw = $("#loginpassword").val();
			var _url = "/login/login";
			var _param = { "loginuserid" :  id, "loginpassword" : pw, "autologin": autologin};			
			common_ajax.sendRequest("POST",  _url, _param, loginForm.loginStartCallback, false);
		},
		
		loginStartCallback  : function(data) {
			
			// 로그인 처리(성공)
			if(data.result){
				sessionStorage.setItem("loginStart", true);
				sessionStorage.setItem("loginresult", data.loginresult);
				sessionStorage.setItem("backurl", data.backurl);
				sessionStorage.setItem("loginuserid", data.loginuserid);
				sessionStorage.setItem("loginpassword", data.loginpassword);
				
			//  로그인 처리(실패) session x	
			}else{
				$("#loginpassword").val("");
				$("#loginpassword").focus();	        		
				
				common_link.goMappingUrl("/main");
			}		
		},
		
		//---------------------------------------------------------------------------
		// Login  >    id / pw    null 체크
		//---------------------------------------------------------------------------		
		validLogin : function() {
			var _id = $("#loginuserid");
			var _pw = $("#loginpassword");
			var id = common.validEmpty(_id);
			var pw = common.validEmpty(_pw);

			if(id.isValid) {
				if(pw.isValid) {
					return true;
					
				} else {
					alert(pw.validMsg);
					_pw.focus();
					return false;
				}
			} else {
				alert(id.validMsg);
				_id.focus();
				return false;
			}
		},
		
		//---------------------------------------------------------------------------
		// 자동로그인 체크
		//---------------------------------------------------------------------------		
		chkAutoLogin : function() {
			
			// 로그인 상태 아닌경우, 초기화
			if(!common.isLogin()){
				//$("#loginuserid").val(""); 
				$("#loginuserid").val("hwkim");  //test 
				$("#loginpassword").val("");

				$("#loginuserid").focus();	  
				//$("input:checkbox[id='autologin']").attr("checked", false);
			}
			
		},
		
	    //■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//								Cookie / Session
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//---------------------------------------------------------------------------
		// Cookie 체크
		//---------------------------------------------------------------------------
		chkCookie : function() {

			//alert("enc_userid " + enc_userid);
			//alert("enc_password " + enc_password);
			
			// 쿠키 여부
			var userid = common.getCookie("62userid");
			alert("chkCookie userid = " + userid); 
			
			// 가져온 쿠키값이 있으면
			if(userid != "") {
				$('#loginpassword').focus();
			} else {
				$('#loginuserid').focus();
			}
			
		}
		
	}
}();




