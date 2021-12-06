package com.x62life.mo.controller.login;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.x62life.mo.model.common.SSOUser;
import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.service.common.SsoService;
import com.x62life.mo.service.login.LoginService;

@Controller
public class LoginController {
	
    @Autowired
    LoginService loginService;
    
    @Autowired
    SsoService ssoService;


	protected static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);	
	
	// Login 값없이 시도
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model, HttpServletRequest request)
	{
		LOGGER.info("/login");
		
		HttpSession session = request.getSession();
		SSOUser ssoUser = (SSOUser) session.getAttribute("ssoUser");
		
		if (null != ssoUser && ssoUser.getLoginId().length() > 0) {
			
        	boolean isValidUser = ssoService.isValidSSOUser(ssoUser);
        	if (isValidUser) {
        		return "redirect:washerSubmission/list";
        	} else {
        		session.setAttribute("ssoUser", null);
        	}
		}
		
		return "login";
	}
	
	@RequestMapping( value="/error_403.jsp", method=RequestMethod.GET)
	public String error_403(ModelMap model, HttpServletRequest request)
	{
		LOGGER.info("/error_403.jsp");
		
		return "error_403";
	}
	
	/*
	 * Error
	 */
	@RequestMapping( value="/error", method=RequestMethod.GET)
	public String errorPage(ModelMap model, HttpServletRequest request)
	{
		return "error";
	}
	
	
	
	
	
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
}
