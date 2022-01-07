/* jQuery Ready */
$(function() {
	
	//mypage.init();
	mypage.initKeyEvent();	
});

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//											mypage
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var mypage = function() {

	//******************  전역변수  ***************************/
	// 암호화된 id/pw 
	var enc_userid = "";
	var enc_password = "";
	var timer;
	//****************************************************/
	
	return {
		init : function() {

			// session 체크 (로그인상태)
/*			var isSession = mypage.sessionCheck();
			
			if(isSession){
				
				// 이번달 구매금액
				var _url = "/mypage/purchase";
				var _param = { "aa" :  "test1", "bb" : "test2"};						
				common_ajax.sendRequest("POST",  _url, _param, mypage.mypagePurchaseCallback, false);

				// 나의 주문
				var _url = "/mypage/order";
				var _param = { "aa" :  "test1", "bb" : "test2"};						
				common_ajax.sendRequest("POST",  _url, _param, mypage.mypageOrderCallback, false);
				
				// 나의 정보
				var _url = "/mypage/profile";
				var _param = { "aa" :  "test1", "bb" : "test2"};						
				common_ajax.sendRequest("POST",  _url, _param, mypage.mypageProfileCallback, false);

				// 나의 활동
				var _url = "/mypage/activity";
				var _param = { "aa" :  "test1", "bb" : "test2"};						
				common_ajax.sendRequest("POST",  _url, _param, mypage.mypageActivityCallback, false);
			}
 */
			
		},

		//---------------------------------------------------------------------------
		// Key Event 
		//---------------------------------------------------------------------------
		initKeyEvent : function() {
/*			//---------------------------------------------
		    // 고객 센터
		    //---------------------------------------------
			$("#aa").find("#bb").bind("click", function() {

			});
			
			
			
			
			//---------------------------------------------
			// 설정
			//---------------------------------------------
			$("#cc").find("#ccc").bind("click", function() {
				
			});
			*/
			
			
			
		},

		//---------------------------------------------------------------------------
		// session 체크
		//---------------------------------------------------------------------------			
		sessionCheck  : function() {
			
			// 로그인 session  O
			if(common.isLogin()){
				
				console.log('이미 로그인상태, mypage 본문실행');
				return true;
				
			// 로그인 session  X 
			}else{
				common_link.goMappingUrl("/main");
			}
			
		},
		
		//---------------------------------------------------------------------------
		// Call back 
		//---------------------------------------------------------------------------			
		// 이번달 구매금액
		mypagePurchaseCallback  : function(data) {
			
			if(data.result){
				
			}else{
				
			}		
		},

		// 나의 주문
		mypageOrderCallback  : function(data) {
			
			if(data.result){
				
			}else{
				
			}		
		},
		
		// 나의 정보
		mypageProfileCallback  : function(data) {
			
			if(data.result){
				
			}else{
				
			}		
		},

		// 나의 활동
		mypageActivityCallback  : function(data) {
			
			if(data.result){
				
			}else{
				
			}		
		},
		
		
	}
}();




