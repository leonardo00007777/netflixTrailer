/* jQuery Ready */
$(function() {

	gnbSub.init();
	
});

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//														gnb Sub
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var gnbSub = function() {

	return {
		init : function() {
			
		},

		//------------------------------------------------------------
		// go URL
		//------------------------------------------------------------
		goUrl : function(_url) {
			//alert("goUrl ,  _url = " + _url);
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


