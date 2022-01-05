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

		goMappingUrl1 : function(_url, _data1, _value1) {
			
			var newForm = $('<form></form>'); 

			newForm.attr("name", "newForm"); 
			newForm.attr("method", "post"); 
			newForm.attr("action", _url); 
			
			if(_data1 != null || _data1 !=""){
				newForm.append($('<input/>', {type: 'hidden', name: _data1, value:_value1 })); 
			}
			newForm.appendTo('body'); 

			newForm.submit();
		},
		
		goMappingUrl2 : function(_url, _data1, _value1, _data2, _value2) {
			
			var newForm = $('<form></form>'); 
			
			newForm.attr("name", "newForm"); 
			newForm.attr("method", "post"); 
			newForm.attr("action", _url); 
			
			if(_data1 != null || _data1 !=""){
				newForm.append($('<input/>', {type: 'hidden', name: _data1, value:_value1 })); 
			}
			if(_data2 != null || _data2 !=""){
				newForm.append($('<input/>', {type: 'hidden', name: _data2, value:_value2 })); 
			}
			newForm.appendTo('body'); 
			
			newForm.submit();
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
	    },
		
		// form submit 후, 이동 target url
		formSubmit : function(form, url, target) {
		    $(form).submit(function(event) {
		        $.post(url, $(form).serialize())
		            .done(function(res) {
		                if (res.success) {
		                    window.location = target;
		                }
		                else {
		                    alert(res.error);
		                }
		            })
		            .fail(function(res) {
		                alert("Server Error: " + res.status + " " + res.statusText);

		            })
		        event.preventDefault();
		    });
		}
			    

	}
}();

