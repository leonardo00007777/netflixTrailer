/* jQuery Ready */
$(function() {

	// 변수초기화
	common_pop.init();
	// 변수초기화
	common_pop.initKeyEvent();
});


//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
//															common_pop
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
var common_pop = function() {
	
	return {
		init : function() {
			
		},
		
		initKeyEvent : function() {
			        
	        //---------------------------------------------
	        // 팝업 test
	        //---------------------------------------------
	        $("#pop1").bind("click", function() {
	        	common_pop.modalShowHide("modalConfirm", "show");
	        });
	        $("#pop2").bind("click", function() {
	        	common_pop.modalShowHide("modalAlert", "show");
	        });
	        $("#pop3").bind("click", function() {
	        	common_pop.modalShowHide("modalAlertTitle", "show");
	        });

		},

        
	    //-------------------------------------------------
		// Modal
		//-------------------------------------------------
		// confirm / alert 
		modalShowHide : function(_targetId, _showHide) {
			
			$('#' + _targetId).modal(_showHide);
		},
	    
	    popFullOpen : function(id, title) {
	        $(window).scrollTop(0.0); // 추가부분

	        $('body').css({
	            'background-color' : '#fff'
	        }); 
	        if(id != undefined && title != undefined){
	        	$('#pop-full-title', $("#pop-full-wrap")).html(title);
	        	$('#'+id+'').show();
	        }else{
	        	$('#pop-full-wrap-retstr').show();
	        }
	        $('#mWrapper').hide();
	    },

	    popFullClose : function(id) {
	        $('body').css({
	            'background-color' : '#eee'
	        });
	        if(id != undefined && id != ''){
	        	$('#'+id+'').hide();
	        }else{
	        	$('#pop-full-wrap-retstr').hide();
	        }
	        $('#mWrapper').show();
	    },
				
		
		
		
	}
}();

