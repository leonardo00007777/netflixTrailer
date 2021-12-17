package com.x62life.mo.controller.login;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

import com.x62life.mo.common.util.TextUtil;
import com.x62life.mo.common.util.CookiesUtil;
import com.x62life.mo.model.member.MbMaster;
import com.x62life.mo.service.login.LoginService;
import com.x62life.mo.service.member.MemberService;

import net.sf.json.JSONObject;

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

	@Value("#{configProperties['cookieDomain']}") 
	private String sCookieDomain;
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);	

	
    /**
     * 로그인 페이지
     *
     * @param memberInfo
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/loginForm.do")
    public ModelAndView loginForm(HttpServletRequest request
													            , MbMaster memberInfo
													            , Model model) throws Exception {
        //LOGGER.debug("로그인 폼 진입");
        model.addAttribute("mbrId", memberInfo.getMemid());
        model.addAttribute("mbrNo", memberInfo.getMempw());

        // 회원 확인
//        String sMbrPasswd = loginService.selectMbrInfo(memberInfo.getMbrNo());
//
//        model.addAttribute("mbrPasswd", sMbrPasswd);
//        model.addAttribute("testMbrNo", memberInfo.getMbrNo());
//
//        //이전 페이지 주소 호출
//        String referer = (String)request.getSession().getAttribute(Constants.REDIRECT_URL);
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
//        userContext.setAttribute("referer", referer);

        return new ModelAndView("login/loginForm");
    }

    
    /**
     * 로그인 여부 체크 Ajax
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/loginCheckJson.do", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Object loginCheckJson(HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {

        JSONObject json = new JSONObject();
        json.put("result", true);
        
        MbMaster sessionMember = (MbMaster) request.getSession().getAttribute("sessionMember");

        if (sessionMember == null || !sessionMember.getIsLoggedIn()) {
            json.put("result", false);
            json.put("url", loginFormUrl);

            return json;
        }
        return json;
    }
	
	@RequestMapping(value = "/login")
	public String login(@RequestParam Map<String, Object> paramMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		// Validation 
		/*
		 * if (userParam.getEmail_address() == null ||
		 * "".equals(userParam.getEmail_address()) ) { return null; }
		 * 
		 * if (userParam.getPassword() == null || "".equals(userParam.getPassword()) ) {
		 * return null; }
		 */
    	
		
		// Validation 후, session 생성
		MbMaster memberInfo = new MbMaster();
		memberInfo.setJointype((String)paramMap.get("joinType"));
		memberInfo.setMemid((String)paramMap.get("memId"));
		memberInfo.setMemname((String)paramMap.get("memName"));
		memberInfo.setHpno((String)paramMap.get("hpNo"));
		memberInfo.setSnsId((String)paramMap.get("snsId"));
		
		request.getSession().setAttribute("sessionMember", memberInfo);
		
		
	    // cookie 저장 
		//Cookie cookie = new Cookie("prof_id", Encrypt.EncodeBySType(Long.toString(user.getUserseqno())));
		//cookie.setMaxAge(-1); 
		//response.addCookie(cookie);
		
		System.out.println("sCookieDomain =" + sCookieDomain);
		
		
	    if(request != null) {
        	CookiesUtil.setMemberInfoCookie(request, response,  memberInfo , (30 * 60),  sCookieDomain);
        	
        }else {
        	//CookieUtil.setCookie(response, "cartTotCnt", String.valueOf(request.getSession().getAttribute("cartTotCnt")), (30 * 60),"/", RequestContext.getCurrent("cookieDomain"));
        }
	    
    	return "login/login";
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
//                //String referer = (String) request.getSession().getAttribute(Constants.REDIRECT_URL);
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
