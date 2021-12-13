/* jQuery Ready */
$(function() {

	footer.initKeyEvent();
	
});
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//														Footer
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var footer = function() {

	return {
		cannotAccess : function() {
			 alert('접근할 수 없습니다. 권한이 부족합니다.');
			
		},
		
		//------------------------------------------------------------
		// Key Event 
		//------------------------------------------------------------
		initKeyEvent : function() {
			
			$("#aaaa").on("click", function(e) {
				
			});
			
		},
		
		//------------------------------------------------------------
		// go URL
		//------------------------------------------------------------
		goUrl : function(_num) {
			//alert("footer = " + _num);
			var url = "/common/footertimeline";
			
			// login 유무활용 
			//common.cannotAccess();
			
			switch (_num) {
				case 0:
					url = "/main";
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
	}
}();










