/* jQuery Ready */
$(function() {
	//loginForm.init();
	
});

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//											loginForm
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var loginForm = function() {

	//******************  전역변수  ***************************/
	// 암호화된 id/pw 
	var enc_userid = "";
	var enc_password = "";
	
	//****************************************************/
	return {
		init : function() {
			
			// 넘어온 값 (GET)
			strUserId		= loginuserid ; 
			strPassword = loginpassword ; 
			autologin		= autologin; 

			// 변수초기화
			loginForm.initVars();
			
			// 자동로그인 여부
			loginForm.chkAutoLogin();
			
			// Cookie 체크
			loginForm.chkCookie();
			
			// back url 체크
		
		    
		},
		//------------------------------------------------------------
		// 변수 초기화
		//------------------------------------------------------------
		initVars : function() {
			
			// 암호화된 id/pw 초기화
			enc_userid = "";
			enc_password = "";
			
		},
		//------------------------------------------------------------
		// Cookie 체크
		//------------------------------------------------------------
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
			
		},
		//------------------------------------------------------------
		// 자동로그인 체크
		//------------------------------------------------------------		
		chkAutoLogin : function(_id, _pw) {
	


		}
		
	}
}();




