/* jQuery Ready */
$(function() {

	gnbSub.initKeyEvent();
	
});

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//														gnb Sub
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var gnbSub = function() {

	return {
		cannotAccess : function() {
			 alert('접근할 수 없습니다. 권한이 부족합니다.');
			
		},
		
		//------------------------------------------------------------
		// Key Event 
		//------------------------------------------------------------
		initKeyEvent : function() {
			
			$("#gnbBtnCart").on("click", function(e) {
				alert("장바구니 이동 ...");
				
				// login 유무활용 
				// common.cannotAccess();				
				gnbSub.goUrl("cart");
				
			});
			
		},
		
		//------------------------------------------------------------
		// go URL
		//------------------------------------------------------------
		goUrl : function(_url) {
			alert("goUrl ,  _url = " + _url);
			var url = "/cart";
			
			switch (_url) {
				case "cart":
					url = "/cartlist";
					break;
					
				case "alarm":
					url = "/alarm";
					break
					
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


