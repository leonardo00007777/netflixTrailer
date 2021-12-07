package com.x62life.mo.controller.login;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lowagie.text.Meta;
import com.x62life.mo.common.util.Encrypt;
import com.x62life.mo.model.common.Code;
import com.x62life.mo.model.common.SSOUser;
import com.x62life.mo.model.common.UserRef;
import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.service.login.LoginService;

@Controller
public class LoginController {
	
    @Autowired
    LoginService loginService;
    
    @Autowired
    SSOService ssoService;

	protected static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);	

    @RequestMapping("/loginProcess")
    public ModelAndView userLoginInfo(Model model, HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();

        String strPassword = "ckdgysl1";
        String strUserId = "test";
        String memstOut = "10";

        Map<String, Object> pramMap  = new HashMap<String, Object>();

        pramMap.put("strPassword",strPassword);
        pramMap.put("strUserId",strUserId);
        pramMap.put("memstOut",memstOut);

        List<LoginProcess> loginUserInfoList = loginService.loginInfo(pramMap);

        model.addAttribute("loginUserInfo", loginUserInfoList);

        modelAndView.setViewName("/main/main");
        return modelAndView;
    }
    
/*
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody JsonResponse login_post(Model model, User userParam, HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
    	if (userParam.getEmail_address() == null || "".equals(userParam.getEmail_address()) ) {
        	return null;
		}
    	
    	if (userParam.getPassword() == null || "".equals(userParam.getPassword()) ) {
        	return null;
		}
		
    	
		User user = null;
		
		// validation success후, session 생성
		SSOUser ssoUser = new SSOUser();
		ssoUser.setUserSeqNo(Long.toString(user.getUserseqno()));
		ssoUser.setLoginId(user.getLogin_name());
		ssoUser.setEmail(user.getEmail_address());
		ssoUser.setUserName(user.getFirst_name() + " " + user.getLast_name());
		ssoUser.setUserType(user.getUser_type());
		ssoUser.setPasswd_reset_needed(user.getPasswd_reset_needed());
		
		request.getSession().setAttribute("ssoUser", ssoUser);
		
		// cookie 저장
		Cookie cookie = new Cookie("prof_id", Encrypt.EncodeBySType(Long.toString(user.getUserseqno())));
		cookie.setMaxAge(-1);
		response.addCookie(cookie);
		
    	return new JsonResponse(meta, accountStatus.getPasswd_reset_needed());
	}
	*/
	
	// log out
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response)
	{
		// Session deletion
		request.getSession().setAttribute("ssoUser", null);
		
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
