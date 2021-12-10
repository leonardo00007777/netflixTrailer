//-------------------------------------------------------------------
//						BNB - Event
//-------------------------------------------------------------------
/* jQuery Ready */
$(function() {

	initBnbFooter();
	
});

/* Key Event */
function initBnbFooter() {

	//	$("#footerMypage").on("click", function(e) {
	//
	//	});

	
	//<a href="javascript;;" id="a_click">click!</a>

   $("#a_click").click(function() { 
	   alert("click event"); 
	}); 

	// unbind로 기존 click 이벤트 해제 
	$("#a_click").unbind("click"); // click 이벤트만 해제 
	//$("#a_click").unbind(""); // 전체 해제
	
	// bind로 이벤트 등록
	$("#a_click").bind("click", function() { 
		alert("click event2");
	});
	
}
//------------------------------------------
// footer URL
//------------------------------------------
function goBnbUrl(_num) {
	//alert("footer = " + _num);
	var url = "/common/footertimeline";
	
	// login 유무활용 
	//common.cannotAccess();
	
	switch (_num) {
		case 0:
			url = "/main/main";
			break;
		case 1:
			url = "/common/footertimeline";
			break;
		case 2:
			url = "/common/footercategory";
			break;
		case 3:
			url = "/common/footersearch";
			break;
		case 4:
			url = "/common/footermypage";
			break;
		default:
			break;
	}
    
	let f = document.createElement('form');
    
    f.setAttribute('method', 'post');
    f.setAttribute('action', url);
    document.body.appendChild(f);
    
    f.submit();
}






