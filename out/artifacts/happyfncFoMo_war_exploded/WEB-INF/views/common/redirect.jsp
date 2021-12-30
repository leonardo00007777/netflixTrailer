<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
    import="java.util.Locale
	           ,org.springframework.context.i18n.LocaleContextHolder
	          "
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ include file="/WEB-INF/views/common/env.jsp"%>
<%
    
    String redirectUrl = TextUtil.nullToSpace((String)request.getAttribute(Constants.REDIRECT_URL));

    String showMessage = TextUtil.nullToSpace((String)request.getAttribute(Constants.SHOW_MESSAGE));
    String ordYn = TextUtil.nvl((String)request.getAttribute("ordYn"), Constants.N);
    String orderCertYn = (String)request.getAttribute("orderCertYn");
    String authYn =  TextUtil.nvl((String)request.getAttribute("authYn"), "N");
    String authChk = (String)request.getSession().getAttribute("authChk") == null ? "N" : (String)request.getSession().getAttribute("authChk"); 
    String passwdChk = request.getSession().getAttribute("passwdChk") == null ? "N" : "Y";
    
    if("N".equals(passwdChk) && (redirectUrl.trim().length() == 0 
    		|| redirectUrl.contains("loginForm.do")
    		|| redirectUrl.contains("ssoLogin.do")
    		|| redirectUrl.contains("main.do")))
    {
    	redirectUrl = _servletUrl + "main/main.do";
    }else if(!redirectUrl.contains(request.getServerName())){
        redirectUrl = _servletUrl + redirectUrl;
    }

    if(redirectUrl.contains("%")){
    	redirectUrl = URLDecoder.decode(redirectUrl, "UTF-8");
    }
    
    logger.debug("Redirect Url=[{}]", redirectUrl);
    
   request.getSession().setAttribute("showMessage", showMessage);
   request.getSession().setAttribute("redirectUrl", redirectUrl);
   request.getSession().setAttribute("ordYn", ordYn);
   request.getSession().setAttribute("orderCertYn", orderCertYn);
    
    String genSctCd = (String)request.getSession().getAttribute("genSctCd");
	String recoAges = (String)request.getSession().getAttribute("recoAges");
	String staffYn = (String)request.getSession().getAttribute("staffYn");
	String mbrNo = (String)request.getSession().getAttribute("mbrNo");

%>


<script>
	var _baseUrl = '<%=_servletUrl%>';
	var _plainUrl = '<%=_baseUrl%>';
	var _secureUrl = '<%=_secureUrl%>';
	var _jsUrl = '<%=_jsUrl%>';
	var _cssUrl = '<%=_cssUrl%>';
	var _imgUrl = '<%=_imgUrl%>';
	var _imgUrlLocale = '<%=_imgUrlLocale%>';
	var _cabUrl = '<%=_cabUrl%>';
	var _isLogin = <%=customer.isLoggedIn()%>;
	var _goodsImgUploadUrl = '<%=_goodsImgUploadUrl%>';
	var _mainUrl = '<%=Config.getStatically("mainUrl") %>';
	var _goodsImg85 = '<%=StoreConsts.GOODS_IMG_85 %>';
	var _gdasImgUploadUrl = '<%=_gdasImgUploadUrl%>';
	var _profileImgUploadUrl = '<%=_profileImgUploadUrl%>'; 
	var _authYn = '<%=authYn%>';
	var _authYnLogin = '<%=request.getSession().getAttribute("authYn")%>';
	var _authChk = '<%=authChk%>';
	var _yn14 = '<%=yn14%>';
	var _passwdChk = '<%=passwdChk%>';
	var _redirectUrl ='<%=redirectUrl%>';
    var bSId = '<%=bSId%>';

    
// 앱 , 주문상태
if(common.app.appInfo.isapp && ${not empty ordYn and ordYn eq 'Y'}){
    if(${not empty orderCertYn and orderCertYn eq 'Y'}) {
		common.app.callWebUrl(_redirectUrl);
    } else {
        common.app.callClosePage();
    }

// 앱 
} else if(common.app.appInfo.isapp){
    setTimeout(function(){
	    // 성인인증
	    if(_authChk == 'Y'){
	        if(_authYnLogin == 'Y'){
	        	//로그인페이지로 진입해서 성인인증받고 성공한 경우
		        common.app.callWebUrl(_redirectUrl);
	        }else{
	            //로그인후 성인인증 진입해서  성공한 경우
	            common.app.callWebScript("certReload();");    
	        }
	    }else if(_authYn == 'Y' && _passwdChk != 'Y' && _yn14 != 'Y' ){
	        //실패
	        common.app.callWebScript("certHistoryBack();");    
	    }else{
	        window.location.href=_redirectUrl;
	    }
    },200);
}else { 
	 if(typeof opener == "undefined" || opener == null){
         if (bSId !== "") {
             window.location.href = "kakaotalk://inappbrowser/close";
         }
         setTimeout(function () {
             window.location.href = _redirectUrl;
         }, 200);
	} else {
	    if(${not empty ordYn and ordYn eq 'Y' and (empty orderCertYn or orderCertYn ne 'Y')}) {
			window.close();
	    }else {
		    opener.location.replace(_redirectUrl);
			window.close();
	    }
    }
}
</script>