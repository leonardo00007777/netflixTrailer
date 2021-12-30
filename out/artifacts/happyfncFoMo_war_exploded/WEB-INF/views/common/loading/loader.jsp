
<div>
    <link rel="stylesheet" type="text/css" href="/management/css/gene.css">
    
	<!-- loading overlay -->
	<div id="loading-overlay" class="div-loading-centered-all">
		<div class="div-loading-centered-loading"></div>
	</div>
	
	<script>
		$(document).ready(function() {
	        $('#header-navbar a[href]').on('click', loadingOverlayShow);
	    });
		
		function loadingOverlayShow() {
			var el = document.getElementById("loading-overlay");
			el.style.display = "block";
		}
		function loadingOverlayHide() {
			var el = document.getElementById("loading-overlay");
			el.style.display = "none";
		}
	</script>
</div>