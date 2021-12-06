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
import com.x62life.mo.model.common.User;
import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.service.common.SSOService;
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
    
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody JsonResponse login_post(Model model, User userParam, HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		Meta meta = new Meta(null, null);
		
    	if (userParam.getEmail_address() == null || "".equals(userParam.getEmail_address()) ) {
        	return null;
		}
    	
    	if (userParam.getPassword() == null || "".equals(userParam.getPassword()) ) {
        	return null;
		}
		
    	
		User user = null;
		try {
			String email = userParam.getEmail_address();
			String loginId = email.split("@")[0];
			
			User selectParam = new User();
			selectParam.setEmail_address(email);
			selectParam.setLogin_name(loginId);
			
			user = userService.getUser(selectParam);
			
		} catch (Exception e) {
			e.printStackTrace();
        	return null;
		}
		
		if (user == null) {
			return null;
		}
		
		User statusParam = new User();
		statusParam.setEmail_address(userParam.getEmail_address());
		
		User accountStatus = userService.getAccountStatus(statusParam);
		if (accountStatus == null) {
			return null;
		}
		
		String db_pw = user.getPassword();					// pw stored in DB; encoded
		String input_pw = passwordEncoder.encode(userParam.getPassword());	// pw input by user; encoded
		if (db_pw == null || "".equals(db_pw)) {
			return null;
		}
		
		if (!passwordEncoder.matches(userParam.getPassword(), db_pw)) {
			User updateParam = new User();
			updateParam.setEmail_address(userParam.getEmail_address());
			int nextCount = accountStatus.getLogin_fail_count() + 1;	// up to 5 tries
			updateParam.setLogin_fail_count(nextCount);
			
			int res = userService.updateAccountStatus(updateParam);
			return null;
			
		} else {
			User updateParam = new User();
			updateParam.setEmail_address(userParam.getEmail_address());
			updateParam.setLogin_fail_count(Integer.parseInt("0"));
			
			int res = userService.updateAccountStatus(updateParam);
		}
		
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
