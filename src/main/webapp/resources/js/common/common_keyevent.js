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
						
	        
	        
	        
		}
	}
}();

