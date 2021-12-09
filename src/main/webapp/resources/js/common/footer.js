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

}
//------------------------------------------
// footer URL
//------------------------------------------
function goBnbUrl(_num) {
	//alert("footer = " + _num);
	var url = "/common/footertimeline";
	
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






