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
			//---------------------------------------------
			// 나의 주문
			//---------------------------------------------
			// 주문/배송 내역
			$("#myOrderGroup").find("#btnMyOrderDelivery").bind("click", function() {
				common_link.goMappingUrl("/mypage/myorderdelivery");
			});
			// 취소/교환/반품 내역
			$("#myOrderGroup").find("#btnMyCancelRebate").bind("click", function() {
				common_link.goMappingUrl("/mypage/mycancelrebate");
			});
			// 정기배송 관리
			$("#myOrderGroup").find("#btnMyRegularDelivery").bind("click", function() {
				common_link.goMappingUrl("/mypage/myregulardelivery");
			});
			//---------------------------------------------
			// 나의 정보
			//---------------------------------------------
			// 개인정보 관리
			$("#myInfoGroup").find("#btnMyInfo").bind("click", function() {
				common_link.goMappingUrl("/mypage/myinfo");
			});
			// 배송지 관리
			$("#myInfoGroup").find("#btnMyDeliveryPlace").bind("click", function() {
				common_link.goMappingUrl("/mypage/mydeliveryplace");
			});
			//---------------------------------------------
			// 나의 활동 
			//---------------------------------------------
			// 작성 가능한 구매후기
			$("#myActivityGroup").find("#btnMyReview").bind("click", function() {
				common_link.goMappingUrl("/mypage/myreview");
			});
			// 상품 문의 내역
			$("#myActivityGroup").find("#btnMyGoodsQna").bind("click", function() {
				common_link.goMappingUrl("/mypage/mygoodsqna");
			});
			// 1:1 문의 내역
			$("#myActivityGroup").find("#btnMyQna").bind("click", function() {
				common_link.goMappingUrl("/mypage/myqna");
			});
			// 댓글 내역
			$("#myActivityGroup").find("#btnMyReply").bind("click", function() {
				common_link.goMappingUrl("/mypage/myreply");
			});
			// 이벤트 참여 내역
			$("#myActivityGroup").find("#btnMyEventApply").bind("click", function() {
				common_link.goMappingUrl("/mypage/myeventapply");
			});
			// 친구 추천하기
			$("#myActivityGroup").find("#btnMyRecommend").bind("click", function() {
				common_link.goMappingUrl("/mypage/myrecommend");
			});
			
			//---------------------------------------------
		    // 고객 센터
		    //---------------------------------------------
			// 공지사항
			$("#csCenterGroup").find("#btnCsNotice").bind("click", function() {
				common_link.goMappingUrl("/cscenter/csnotice");
			});
			// 자주찾는 질문
			$("#csCenterGroup").find("#btnCsFaq").bind("click", function() {
				common_link.goMappingUrl("/cscenter/csfaq");
			});
			// 풍성한 가입 혜택
			$("#csCenterGroup").find("#btnJoinBenefit").bind("click", function() {
				//common_link.goMappingUrl("/cscenter/joinbenefit");
			});
			// 멤버십 안내
			$("#csCenterGroup").find("#btnJoinGuide").bind("click", function() {
				//common_link.goMappingUrl("/cscenter/joinguide");
			});
			
			//---------------------------------------------
			// 설정
			//---------------------------------------------
			$("#settingGroup").find("btnMySetting").bind("click", function() {
				//common_link.goMappingUrl("/common/setting");
				
			});
			
			//---------------------------------------------
			// chatting
			//---------------------------------------------
			$("#chatGroup").find("#btnChatQna").bind("click", function() {
				//common_link.goMappingUrl("/common/chatqna");
			});
			$("#chatGroup").find("#btnRealChat").bind("click", function() {
				//common_link.goMappingUrl("/common/realchat");
			});
			$("#chatGroup").find("#btnDownloadApp").bind("click", function() {
				//common_link.goMappingUrl("/common/downloadapp");
			});
			
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




