/* jQuery Ready */
$(function() {

	// 초기화
	common_keyevent.init();
	// 키이벤트
	common_keyevent.initKeyEvent();
});


//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//															common_keyevent
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var common_keyevent = function() {
	
	return {
		init : function() {
		},
		
		initKeyEvent : function() {
		    //----------------------------------------------------------------------------------------------------- 
		    //                                			          1. 공통 				
		    //-----------------------------------------------------------------------------------------------------      
			//  Back 상단  (gnb)
			$("#backBtn").bind("click", function() {
				
				//alert("timeline Back....");
				setTimeout(function() {
					history.back();
				}, 100);
				
				//		    	$("#mWrapper").attr("style", "display:block");
				//		    	$("#mSearchWrapper").attr("style", "display:none");
				//		    	if ( $("#main-swiper-tab0 .mVisual-slide").length ) {
				//		    		// 메인화면으로 back할때 검색어 삭제
				//		    		$("#query").val("");
				//		    		  mmain.home.mVisual.ixOverlayList('resize');
				//		    	};
				//		    	
				//		    	common.app.callMenu("N");
				//		    	
				//		    	// pullToDown refresh 활성화
				//		    	setTimeout(function() {
				//		    		history.back();
				//		    	}, 100);
				//		    	
				//		    	// history.back();		    	
			});
			
			// 장바구니 이동
			$("#gnbBtnCart").on("click", function(e) {
				gnbSub.goUrl("cart");
			});
						
			//----------------------------------------------------------------------------------------------------- 
			//                                			         회원가입 / 로그인	
			//-----------------------------------------------------------------------------------------------------      
	        //$("#joinMemberGroup").find("#btnLogin").bind("click", function() {
        	$("#btnLogin").bind("click", function() {
	        	common_link.goMappingUrl("/login/loginform");	// 로그인 폼 진입
	        });
		    // Join Member (일반회원/간편회원) 선택
	        $("#joinMemberGroup").find("#btnJoinMember").bind("click", function() {
	        	common_link.goMappingUrl("/member/joinmemberchoice");
		    });
	        // Join Member Form 
	        $("#joinMemberForm").bind("click", function() {
	        	common_link.goMappingUrl("/member/joinmemberform");
	        });
	        // Join Member Form SK
	        $("#joinMemberFormSK").bind("click", function() {
	        	common_link.goMappingUrl("/member/joinmemberformsk");
	        });

	        	     
	        //----------------------------------------------------------------------------------------------------- 
	        //                                			         고객센터
	        //-----------------------------------------------------------------------------------------------------      
	        // 공지사항
	        $("#csGroup").find("#btnCsNotice").bind("click", function() {
	        	common_link.goMappingUrl("/cscenter/csnotice");
	        });
	        
	        // 자주찾는 질문
	        $("#csGroup").find("#btnCsFaq").bind("click", function() {
	        	common_link.goMappingUrl("/cscenter/csfaq");
	        });
	        
	        //----------------------------------------------------------------------------------------------------- 
	        //                                			         설정
	        //-----------------------------------------------------------------------------------------------------      
	        // 설정
	        $("#settingGroup").find("#btnSetting").bind("click", function() {
	        	common_link.goMappingUrl("/common/setting");
	        });
	        
			//---------------------------------------------
			// 로그아웃
			//---------------------------------------------
			$("#btnLogOut").bind("click", function() {				
	            var isConfirm = confirm("로그아웃 하시겠습니까?");
	            if(isConfirm){
	                common_link.goMappingUrl("/login/logout");
	            }
			});
		        
	        
		}
	}
}();

