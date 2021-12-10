/* jQuery Ready */
$(function() {

	//initGnbKeyEvent();
});

//-------------------------------------------------------------------
//						common - validation
//-------------------------------------------------------------------
var keyEvent = function() {

	return {
		cannotAccess : function() {
			 alert('접근할 수 없습니다. 권한이 부족합니다.');
			
		},
			
	}
	
}();

//
///* Key Event */
//function initGnbKeyEvent() {
//
//	//	$("#footerMypage").on("click", function(e) {
//	//
//	//	});
//
//	
//	//<a href="javascript;;" id="a_click">click!</a>
//
//   $("#a_click").click(function() { 
//	   alert("click event"); 
//	}); 
//
//	// unbind로 기존 click 이벤트 해제 
//	$("#a_click").unbind("click"); // click 이벤트만 해제 
//	//$("#a_click").unbind(""); // 전체 해제
//	
//	// bind로 이벤트 등록
//	$("#a_click").bind("click", function() { 
//		alert("click event2");
//	});
//	
//}
