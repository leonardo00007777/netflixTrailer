package com.x62life.mo.controller.login;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.x62life.mo.common.util.CookiesUtil;
import com.x62life.mo.common.util.TextUtil;
import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.model.member.MbMaster;
import com.x62life.mo.service.login.LoginService;
import com.x62life.mo.service.member.MemberService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	
    @Autowired
    LoginService loginService;
    
    @Autowired
    MemberService memberService;
    
	@Autowired Properties configProperties;
	
	@Value("#{configProperties['loginFormUrl']}") 
	private String loginFormUrl;
	
	@Value("#{configProperties['cartUrl']}") 
	private String cartUrl;
	
	@Value("#{configProperties['mainUrl']}") 
	private String mainUrl;

	@Value("#{configProperties['cookieDomainLocal']}") 
	private String sCookieDomain;
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);	

	
    /**
     * 로그인 폼     
     * (session 로그인정보 있는 경우 / 없는 경우)
     * 
     * @param memberInfo
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/loginform")
    public ModelAndView loginform(@RequestParam Map<String, Object> paramMap
    												, HttpServletRequest request
										            , Model model) throws Exception {
    	
  		 ModelAndView mv = new ModelAndView();
    	//LOGGER.debug("로그인 폼 진입");
    	System.out.println("로그인 폼 진입");
//        
//    	//----------------------------------
//        // App 정보 (앱으로 접근시 활용)
//    	//----------------------------------
//    	UserAgent userAgent = UserAgentUtil.getAppUserAgent(request.getHeader("User-Agent"));
//        model.addAttribute("isApp", userAgent.getIsApp());
//        model.addAttribute("isDeviceId", userAgent.getDeviceId());
//        // 넘겨받은 입력정보
//        model.addAttribute("mbrId", (String)paramMap.get("memid") );
//        model.addAttribute("mbrPw", (String)paramMap.get("mempw") );
//        model.addAttribute("isLoginForm", true);
//        
//        //----------------------------------
//        // 간편/애플로그인  (kakao/apple)
//        //----------------------------------
//        model.addAttribute("easyLoginType", (String)paramMap.get("easyLoginType"));
//        // 애플로그인 인증성공여부 (초기값=N)
//        model.addAttribute("appleLoginCertSucsYn", "N");
//        // 애플로그인 식별자(앱에서 전달)
//        model.addAttribute("appleIdentifier",  (String)paramMap.get("appleIdentifier"));
//        
//        //----------------------------------
//        // 아이폰/아이패드로 접근시, 추가로직
//        //----------------------------------
//        UserAgentUtil ua = new UserAgentUtil(request);
//        if (userAgent.getIsApp() 
//        		&& (ua.getOsName().toLowerCase().indexOf("iphone") > -1 
//        		   || ua.getOsName().toLowerCase().indexOf("ipad") > -1)) 
//        {
//                //아이폰 계열일때 MC 간편로그인 카카오 영역 숨기 여부를 Y 로 바꿈
//                model.addAttribute("iPhoneEasyloginKkoAreaHiddenYn", "Y");
//        }
//
//        //----------------------------------
//        // 처리후 이동URL 
//        //----------------------------------
//        String refererUrl = "/";  // 기본 홈
//        
//        String redirectUrl =  (String) paramMap.get("redirectUrl");
//        if (!TextUtil.isEmpty(redirectUrl)) {
//            refererUrl =redirectUrl;
//        }
//
//        // 이전페이지가 "주문" 이면  > 장바구니 조회로 이동
//        if (refererUrl != null && refererUrl.contains("/order/")) { 
//        	refererUrl =  cartUrl;
//        	
//    	// 이전페이지가 "로그인" 아니면  > model 로 
//        }  else if (refererUrl != null && !refererUrl.contains("login")) {
//        	
//        	// 간편 로그인(naver / facebook / apple) 인경우
//        	// back할때 로그인 폼에서 받은 referer
//            if (refererUrl.contains("naver") || refererUrl.contains("facebook") || refererUrl.contains("apple") ) 
//            {
//                model.addAttribute("returnUrl", (String) paramMap.get("refererUrl"));					
//                request.getSession().setAttribute("redirectUrl", refererUrl);
//            }
//
//        // 이전페이지가 "로그인"   > 장바구니 조회로 이동
//        // session 값 redirectUrl 활용 --> 
//        } else if (refererUrl != null && refererUrl.contains("login") &&  request.getSession().getAttribute("redirectUrl") != null) {
//        	refererUrl = (String) request.getSession().getAttribute("redirectUrl");
//        }
//
//        
//        Map<String, Object>  isLoginYn  = loginCheck(request, null);
//        // 로그인 session 값 있으면
//        if ("Y".equals(isLoginYn.get("result"))) {
//        	
//        	
//        }
//        
//        
//        
        
//        if (userContext.isLoggedIn()) {
//            // 성인인증 상품에서 들어온 경우
//            if (!TextUtil.isEmpty(authYn) && Constants.Y.equals(authYn)) {
//                toUrl = "redirect:" + RequestContext.getCurrent("baseUrl") + "customer/regCertification.do";
//            } else if (referer != null && (referer.contains("login"))) {
//                toUrl = Constants.JSP_FOR_REDIRECT;
//            }
//        }
        
        
        // 회원 확인
//        String sMbrPasswd = loginService.selectMbrInfo(memberInfo.getMbrNo());
//
//        model.addAttribute("mbrPasswd", sMbrPasswd);
//        model.addAttribute("testMbrNo", memberInfo.getMbrNo());
//
//        //이전 페이지 주소 호출
//        String referer = (String)request.getSession().getAttribute("redirectUrl");
//
//        if (referer == null || "".equals(referer)) {
//            referer = RequestContext.getCurrent("baseUrl") + config.get("mainUrl");
//        }
//
//        if (referer != null && !referer.contains(request.getServerName())) {
//            referer = RequestContext.getCurrent("baseUrl") + referer;
//            if (referer.indexOf("logout.do") > -1) {
//                referer = RequestContext.getCurrent("baseUrl") + config.get("mainUrl");
//            }
//        }
//
//        if(!TextUtil.isEmpty(referer) && referer.contains("mainRecommYn")) { // 큐레이션 redirect 처리로 추가
//            referer = RequestContext.getCurrent("baseUrl") + config.get("mainUrl") + "?mainRecommYn=Y";
//        }
//
//        //인앱브라우저 등으로 들어와서
//        request.setAttribute("referer", referer);
//        request.getSession().setAttribute("referer", referer);

   		 mv.setViewName("login/loginForm");
   		
   		return mv;
    }
    
    /**
     * 로그인 성공처리
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */    
	@RequestMapping(value = "/loginsuccess")
	public ModelAndView loginsuccess(@RequestParam Map<String, Object> paramMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		ModelAndView mv = new ModelAndView();

		//--------------------
		// Validation 
		//--------------------
		/*
		 * if (paramMap.getEmail_address() == null ||
		 * "".equals(paramMap.getEmail_address()) ) { return null; }
		 * 
		 * if (paramMap.getPassword() == null || "".equals(paramMap.getPassword()) ) {
		 * return null; }
		 */
    	
		
		//--------------------
		// session 저장
		//--------------------
		LoginProcess loginInfo = new LoginProcess();
		
		loginInfo.setMemcd((String)paramMap.get("memcd"));
		loginInfo.setMemid((String)paramMap.get("memId"));
		loginInfo.setMemname((String)paramMap.get("memName"));
		loginInfo.setMemlevel((String)paramMap.get("memlevel"));
		loginInfo.setJobtype((String)paramMap.get("jobtype"));
		loginInfo.setJobname((String)paramMap.get("jobname"));
		if (!TextUtil.isEmpty((String)paramMap.get("nickn"))) {
			loginInfo.setNickn((String)paramMap.get("nickn"));
		}else {
			loginInfo.setNickn((String)paramMap.get("memName"));
		}
		//loginInfo.setGrpcd((String)paramMap.get("groupname"));  // as-is 할당값없음
		
		request.getSession().setAttribute("sessionMember", loginInfo);
		
		
		//--------------------
	    // cookie 저장 
		//--------------------
		System.out.println("sCookieDomain =" + sCookieDomain);
		
	    if(request != null) {
        	CookiesUtil.setMemberInfoCookie(request, response,  loginInfo , (30 * 60),  sCookieDomain);
        	
        	// 자동로그인 쿠키 유무
        	Cookie autoLoginCookie = CookiesUtil.getCookie(request, "62autologin");
            String autoLogin = autoLoginCookie == null ? "N" : autoLoginCookie.getValue();
        	if ("Y".equals(autoLogin)) {
        		
        	}
        	
        }else {
        	CookiesUtil.setCookie(request, response, "62autologin", ""	, (30 * 60),"/", sCookieDomain);
        }
	    
//		login 쿠키 존재
//----------------------------------------------------------------------------------------------------------------------
//If usec = "y" And Request.Cookies("62autologin") = "Y" Then
//'strUserId = Trim(Request.Cookies("62userid"))
//'strPassword = Trim(Request.Cookies("62passwd"))
//
//---------------------------------------------------------------------------------        
//정상 로그인
//---------------------------------------------------------------------------------        
//if Len(strPassword) > 30 then
//strUserId = AESDecrypt(strUserId, ENC_KEY_NAME)
//strPassword = AESDecrypt(strPassword, ENC_KEY_NAME)
//else
//Response.Cookies("62autologin") = ""
//end If
//
//---------------------------------------------------------------------------------        
//만약 쿠키에 저장된 로그인 정보가 없다면, 자동로그인 기능을 해제한다. (무한루프 방지)
//---------------------------------------------------------------------------------
//If strUserId = "" Or strPassword = "" Then
//Response.Cookies("62autologin") = ""
//End If
//End If

//	    
//	    setCookie("memcd", "<%=strRSMEMCD%>", 365);
//	    localStorage.setItem("memcd", "<%=strRSMEMCD%>");
//	    
//	    <% '자동로그인 정보 저장 처리
//	    if autologin = "on" and strUserId <> "" and strPassword <> "" then 
//	        enc_userid = AESEncrypt(strUserId, ENC_KEY_NAME)
//	        enc_password = AESEncrypt(strPassword, ENC_KEY_NAME) %>
//			setCookie("62userid", '<%=enc_userid%>', 365);
//			setCookie("62passwd", '<%=enc_password%>', 365);
//			setCookie("62autologin", "Y", 365);
//	    <% end if %>
	    
	    mv.setViewName("login/loginSuccess");
	    
    	return mv;
	}
	

    /**
     * 로그인 처리 JSON
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
//    @RequestMapping(value = "/loginSuccess.do", method = { RequestMethod.GET, RequestMethod.POST })
//    public String loginSuccess(@RequestParam Map<String, Object> paramMap, Model model,
//    										HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//        //--------------------------------
//        // session정보 : 간편로그인
//    	//--------------------------------
//        // 약관동의 여부
//        String easyLoginAgreeTerm = (String) request.getSession().getAttribute("easyLoginAgreeTerm");
//        // 로그인 타입
//        String easyLoginType = (String) request.getSession().getAttribute("easyLoginType");
//        // 로그인 식별자
//        String easyLoginIdfy = (String) request.getSession().getAttribute("easyLoginIdfy");
//        //--------------------------------
//        // session정보 : 회원정보
//        //--------------------------------
//        String memberId = (String) request.getSession().getAttribute("memberId");
//
//        MbMaster member = new MbMaster();
//
//
//        if (!TextUtil.isEmpty(memberId)) {
//        	
//            member.setMemid(memberId);
//            MbMaster custInfo = loginService.getMbrLoginInfo(customer);
//            //MbMaster memberInfo = memberService.selectMemberInfo(pramMap);
//            
//
//            //if (custInfo != null) {
//            	//request.getSession().setAttribute("maskMbrNm", custInfo.getMaskMbrNm());
//
//                //----------------------------------------------
//                // 네이버 약관동의
//                //----------------------------------------------
//				/*
//				 * if("Y".equals(easyLoginAgreeTerm) &&
//				 * Constants.EASYLOGIN_TYPE_KAKAO.equals(easyLoginType)){
//				 * MbMaster.setMbrId(custInfo.getMbrId());
//				 * MbMaster.setMbrNo(custInfo.getMbrNo());
//				 * MbMaster.setEasyLoginType(easyLoginType);
//				 * MbMaster.setEasyLoginUseYn("Y"); // gatePage에서 사용여부를 들고있어야 하기떄문에
//				 * MbMaster.setEasyLoginFormYn("Y"); // gatePage에서 간편로그인 폼으로 인지시켜야함
//				 * MbMaster.setEasyLoginFreePass(""); // 간편로그인 Flow 올리브영 회원 새로 만들시 기존 정보 업뎃 null
//				 * 고정
//				 * 
//				 * LOGGER.debug("Oauth 약관동의후 간편로그인 연동페이지 표출"); model.addAttribute("mbrId",
//				 * custInfo.getMbrId()); model.addAttribute("mbrNo", custInfo.getMbrNo());
//				 * model.addAttribute("easyLoginType", MbMaster.getEasyLoginType());
//				 * model.addAttribute("easyLoginUseYn", MbMaster.getEasyLoginUseYn());
//				 * model.addAttribute("easyLoginFormYn", MbMaster.getEasyLoginFormYn());
//				 * model.addAttribute("easyLoginFreePass", MbMaster.getEasyLoginFreePass());
//				 * 
//				 * //return "login/getEasyLoginForm"; }
//				 */
//
//                //----------------------------------------------
//                // 애플로그인 약관동의
//                //----------------------------------------------
//				/*
//				 * if(!StringUtils.isEmpty(easyLoginIdfy) &&
//				 * Constants.EASYLOGIN_TYPE_APPLE.equals(easyLoginType)) {
//				 * 
//				 * MbMaster.setMbrNo(custInfo.getMbrNo());
//				 * MbMaster.setEasyLoginType(easyLoginType);
//				 * MbMaster.setEasyLoginIdfy(easyLoginIdfy);
//				 * MbMaster.setEasyLoginUseYn("Y");
//				 * MbMaster.setSysRegrId(MOConsts.SYS_REGR_ID);
//				 * MbMaster.setSysModrId(MOConsts.SYS_REGR_ID);
//				 * custInfo.setEasyLoginType(easyLoginType);
//				 * 
//				 * // 동일 연동매체 동의정보가 있는지 확인 // String easyLoginUseYn =
//				 * loginService.getEasyLoginInfo(MbMaster);
//				 * 
//				 * // 동일 연동매체 동의정보가 없는 경우에만 회원정보 등록 if( TextUtil.isEmpty(easyLoginUseYn) ||
//				 * !"Y".equals(easyLoginUseYn) ) { loginService.regEasyLoginInfo(MbMaster);
//				 * loginService.regEasyLoginChngHist(MbMaster); } }
//				 */
//
//                // 로그인 성공
//                //loginService.saveLoginSession(request.getSession(), custInfo, response); // custInfo 쿠키 생성을 위해 변경
//
//                //String referer = (String) request.getSession().getAttribute("redirectUrl");
//                String agreeYn = TextUtil.nvl(request.getParameter("agreeYn"), "N");
//                String isSetting = TextUtil.nvl(request.getParameter("isSetting"), "N");
//                String idPwSuccessYn = TextUtil.nvl(request.getParameter("idPwSuccessYn"), "N");
//
//                //model.addAttribute("referer", referer);
//                model.addAttribute("agreeYn", agreeYn);
//                model.addAttribute("memberId", member.getMemid());
//                model.addAttribute("isSetting", isSetting);
//
//                //request.getSession().setAttribute("leglBdayDt", custInfo.getLeglBdayDt());
//
//                HashMap<String, String> resultMap = chkMbrAgesGenger(custInfo.getLeglBdayDt(), custInfo.getGenSctCd(), custInfo.getStaffYn());
//                request.getSession().setAttribute("recoAges", resultMap.get("recoAgesStr"));
//                request.getSession().setAttribute("genSctCd", resultMap.get("genSctCd"));
//                request.getSession().setAttribute("staffYn", resultMap.get("staffYn"));
//
//
//                // 카카오로그인 약관동의 했을 때
//                // 통합회원 탈퇴후, 재로그인 했을 때
//               /* if(("Y".equals(easyLoginAgreeTerm) && Constants.EASYLOGIN_TYPE_KAKAO.equals(easyLoginType)) || "Y".equals(idPwSuccessYn)){
//                    return "login/getEasyLoginForm";
//                }else {
//                    return "login/addSSOCookie";
//                }*/
//            } else {
//                model.addAttribute("showMessage", "회원 정보가 올바르지 않아 메인으로 이동합니다.");
//                return "login/login";
//            }
//        } else {
//            model.addAttribute("showMessage", "회원 정보가 올바르지 않아 메인으로 이동합니다.");
//            return "login/login";
//        }
//    }
	
	
//    @RequestMapping("/loginProcess")
//    public ModelAndView loginProcess(Model model, HttpServletRequest request, HttpServletResponse response){
//        ModelAndView modelAndView = new ModelAndView();
//
//        //---------------- TEST -------------------------
//        String strPassword = "ckdgysl1";
//        String strUserId = "test";
//        String memstOut = "10";
//        //------------------------------------------------
//
//        Map<String, Object> pramMap  = new HashMap<String, Object>();
//        pramMap.put("strPassword",strPassword);
//        pramMap.put("strUserId",strUserId);
//        pramMap.put("memstOut",memstOut);
//
//        MbMaster memberInfo = memberService.selectMemberInfo(pramMap);
//
//        model.addAttribute("memberInfo", memberInfo);
//
//        modelAndView.setViewName("/main/main");
//        return modelAndView;
//    }
    
// 	@RequestMapping(value="/login", method=RequestMethod.GET)
// 	public String login(ModelMap model, HttpServletRequest request)
// 	{
// 		LOGGER.info("/login");
// 		
// 		HttpSession session = request.getSession();		
// 		MbMaster sessionMember = (MbMaster) session.getAttribute("sessionMember");
// 		
// 		if (null != sessionMember && sessionMember.getMemid().length() > 0) {
// 			
//         	boolean isValidMember = memberService.isValidMember(sessionMember);
//         	if (isValidMember) {
//         		return "redirect:main/main";
//         	} else {
//         		session.setAttribute("sessionMember", null);
//         	}
// 		}
// 		
// 		return "login";
// 	}
 //	
 //	
    

    
    /**
     * 로그인 여부 체크 
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/logincheck", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Map<String, Object>  loginCheck(HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result", true);
        
        MbMaster sessionMember = (MbMaster) request.getSession().getAttribute("sessionMember");

        if (sessionMember == null || !sessionMember.getIsLoggedIn()) {
        	resultMap.put("result", false);
        	resultMap.put("url", loginFormUrl);

            return resultMap;
        }
        return resultMap;
    }
	

    /**
     * 비밀번호 체크 (capcha 활용)
     *
     * @param userContext
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/passwdchk")
    @ResponseBody
    public Map<String, Object>  passwdChk(@RequestParam Map<String, Object> paramMap
    															,HttpServletRequest request
													            ,HttpServletResponse response
													            ,Model model)
													            throws Exception {

    	// ---------------------------------------------------------------	
    	// pw 로직 우선 true 처리 (test)
    	// ---------------------------------------------------------------	
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result", true);
        resultMap.put("passwdChk", true);
        
        LoginProcess loginInfo = new LoginProcess();
        loginInfo.setMemid((String)paramMap.get("memid") );
       
        // 패스워드 일치 여부 확인 (capcha 로직 추후추가)
        // ...

        return resultMap;
    }

    
	// log out
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response)
	{
		// Session deletion
		request.getSession().setAttribute("mbMaster", null);
		
		return "login";
	}

	
	@RequestMapping( value="/error_403.jsp", method=RequestMethod.GET)
	public String error_403(ModelMap model, HttpServletRequest request)
	{
		LOGGER.info("/error_403.jsp");
		
		return "error_403";
	}
	
	@RequestMapping( value="/error", method=RequestMethod.GET)
	public String errorPage(ModelMap model, HttpServletRequest request)
	{
		return "error";
	}
	    
}
