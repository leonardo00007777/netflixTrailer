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
	    
	}
}();

