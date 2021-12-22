/* jQuery Ready */
$(function() {

	// 변수초기화
	common_link.init();
});


//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//															common_link
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var common_link = function() {
	
	return {
		init : function() {
			
		},
		
		//-------------------------------------------------
		// go URL
		//-------------------------------------------------
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
		},
		
		goMappingUrl : function(_url) {
			//alert("goMappingUrl ,  _url = " + _url);
			
			let f = document.createElement('form');
			f.setAttribute('method', 'post');
			f.setAttribute('action', _url);
			document.body.appendChild(f);
			f.submit();
		},
		
		goReplaceUrl : function(_url) {
			setTimeout(function(){
				document.location.replace(_url);
			}, 500);
		},
		
		goUrlPath : function(_url, _path) {
	        location.href = _url + _path;
	    },

	    goPath : function(_path) {
	    	location.href =  _path;
	    }
		

	}
}();

