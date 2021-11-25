<%
	response.setHeader("Pragma", "No-cache");
	response.setDateHeader("Expires", 0);
	response.setHeader("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate");
	
 	String _jsUrl =  "/js/";
    String _cssUrl = "/css/";
    String _httpUrl = "/html/";
    String _libUrl = "/lib/";
    String _servletUrl = "/m/";
    
    String _dummStr = "";
    
%>
