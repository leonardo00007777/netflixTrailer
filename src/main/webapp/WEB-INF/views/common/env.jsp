<%
	response.setHeader("Pragma", "No-cache");
	response.setDateHeader("Expires", 0);
	response.setHeader("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate");
	
    String mainDomain = request.getServerName();
    String remoteAddr = request.getRemoteAddr();
    String contextPath = request.getContextPath();
    String servletPath = request.getServletPath();

    
 	String _jsUrl =  "/resources/js/";
    String _cssUrl = "/resources/css/";
    String _httpUrl = "/resources/html/";
    String _libUrl = "/resources/lib/";
    String _imgUrl = "/resources/";
    String _servletUrl = "/m/";
    
    String _dummStr = "";
    
%>
