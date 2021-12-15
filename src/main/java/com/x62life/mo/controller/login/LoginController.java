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
//        String referer = (String)userContext.getAttribute(Constants.REDIRECT_URL);
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
    
//	@RequestMapping(value="/login", method=RequestMethod.GET)
//	public String login(ModelMap model, HttpServletRequest request)
//	{
//		LOGGER.info("/login");
//		
//		HttpSession session = request.getSession();		
//		MbMaster sessionMember = (MbMaster) session.getAttribute("sessionMember");
//		
//		if (null != sessionMember && sessionMember.getMemid().length() > 0) {
//			
//        	boolean isValidMember = memberService.isValidMember(sessionMember);
//        	if (isValidMember) {
//        		return "redirect:main/main";
//        	} else {
//        		session.setAttribute("sessionMember", null);
//        	}
//		}
//		
//		return "login";
//	}
//	
//	
	
	
	@RequestMapping(value = "/login")
	public String login_post(@RequestParam Map<String, Object> paramMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		/*
		 * if (userParam.getEmail_address() == null ||
		 * "".equals(userParam.getEmail_address()) ) { return null; }
		 * 
		 * if (userParam.getPassword() == null || "".equals(userParam.getPassword()) ) {
		 * return null; }
		 */
    	
		
		// validation 후, session 생성
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
        	//CookieUtil.setCookie(response, "cartTotCnt", String.valueOf(userContext.getAttribute("cartTotCnt")), (30 * 60),"/", RequestContext.getCurrent("cookieDomain"));
        }
	    
    	return "login/login";
	}
	
    @RequestMapping("/loginProcess")
    public ModelAndView getMemberInfo(Model model, HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();

        //---------------- TEST -------------------------
        String strPassword = "ckdgysl1";
        String strUserId = "test";
        String memstOut = "10";
        //------------------------------------------------

        Map<String, Object> pramMap  = new HashMap<String, Object>();
        pramMap.put("strPassword",strPassword);
        pramMap.put("strUserId",strUserId);
        pramMap.put("memstOut",memstOut);

        MbMaster memberInfo = memberService.selectMemberInfo(pramMap);

        model.addAttribute("memberInfo", memberInfo);

        modelAndView.setViewName("/main/main");
        return modelAndView;
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
