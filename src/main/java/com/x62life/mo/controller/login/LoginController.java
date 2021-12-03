package com.x62life.mo.controller.login;

import java.util.List;

import javax.servlet.http.Cookie;
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
import org.springframework.web.bind.annotation.ResponseBody;

import com.lowagie.text.Meta;
import com.x62life.mo.common.util.Encrypt;
import com.x62life.mo.model.common.Code;
import com.x62life.mo.model.common.SSOUser;
import com.x62life.mo.model.common.User;
import com.x62life.mo.service.category.CategoryService;
import com.x62life.mo.service.common.SSOService;
import com.x62life.mo.service.main.MainService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	

	@Autowired
	private SSOService ssoService;
	
	
	@Autowired
	CategoryService categoryService;

	@Autowired
	MainService mainService;

	protected static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(ModelMap model, HttpServletRequest request)
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
	
//	
//	@RequestMapping(value="/login", method = RequestMethod.POST)
//	public @ResponseBody login_post(Model model, User userParam,HttpServletRequest request, HttpServletResponse response) throws Exception 
//	{
//		Meta meta = new Meta();
//		
//		/*
//		 * Validation checks
//		 */
//    	if (userParam.getEmail_address() == null || "".equals(userParam.getEmail_address()) ) {
//        	meta.setMessage("Email required");
//        	meta.setSuccess(false);
//        	
//        	return new JsonResponse(meta, null);
//		}
//    	if (userParam.getPassword() == null || "".equals(userParam.getPassword()) ) {
//        	meta.setMessage("Password required");
//        	meta.setSuccess(false);
//        	
//        	return new JsonResponse(meta, null);
//		}
//		
//		/*
//		 * Get user
//		 */
//		User user = null;
//		
//		try {
//			String email = userParam.getEmail_address();
//			String loginId = email.split("@")[0];
//			
//			User selectParam = new User();
//			selectParam.setEmail_address(email);
//			selectParam.setLogin_name(loginId);
//			
//			user = userService.getUser(selectParam);
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//        	meta.setMessage("Error : Invalid Account");
//        	meta.setSuccess(false);
//        	
//        	return new JsonResponse(meta, null);
//		}
//		
//		/*
//		 * Return if account doesn't exist
//		 */
//		if (user == null) {
//        	meta.setMessage("Login failed : Account does not exist");
//        	meta.setSuccess(false);
//        	
//        	return new JsonResponse(meta, null);
//		}
//		
//		/*
//		 * Return if account exists, but is closed
//		 */
////		if (user.getDelete_date() != null) {
////			model.addAttribute("message", "Login failed : Account is closed.");
////			model.addAttribute("redirectUrl", home_url + "/login/");
////    		return "login/retailer_login_submit.jsp";
////		}
//		
//		/*
//		 * Check account status:
//		 *     is locked? -> then ur screwed
//		 *     is inactive for 3 months? -> then change pw
//		 */
//		User statusParam = new User();
//		statusParam.setEmail_address(userParam.getEmail_address());
//		
//		User accountStatus = userService.getAccountStatus(statusParam);
//		
//		if (accountStatus == null) {
//        	meta.setMessage("Login failed : Invalid Email address");
//        	meta.setSuccess(false);
//        	
//        	return new JsonResponse(meta, null);
//		}
//		if (accountStatus.getLogin_fail_count() >= 5) {
//        	meta.setMessage("Login failed : Account is locked from too many failed login attempts. Please reset your password.");
//        	meta.setSuccess(false);
//        	
//        	return new JsonResponse(meta, null);
//		}
//		if ("Y".equalsIgnoreCase(accountStatus.getInactive_flag())) {
//        	meta.setMessage("Login failed : Account is locked because of inactivity. Please reset your password.");
//        	meta.setSuccess(false);
//        	
//        	return new JsonResponse(meta, null);
//		}
//		
//	  	/*
//	  	 * Validate sign-in (check password)
//	  	 *     return if password is incorrect
//	  	 */
//		String db_pw = user.getPassword();					// pw stored in DB; encoded
////		String input_pw = Encrypt.MD5_encode(userParam.getPassword());		// pw input by user; encoded
//		String input_pw = passwordEncoder.encode(userParam.getPassword());	// pw input by user; encoded
//		
//		if (db_pw == null || "".equals(db_pw)) {
//        	meta.setMessage("Account is invalid. Please reset your password");
//        	meta.setSuccess(false);
//        	return new JsonResponse(meta, null);
//		}
////		if ((input_pw == null && "".equals(input_pw)) || (!input_pw.equals(db_pw))) {
//		if (!passwordEncoder.matches(userParam.getPassword(), db_pw)) {
//			User updateParam = new User();
//			updateParam.setEmail_address(userParam.getEmail_address());
//			int nextCount = accountStatus.getLogin_fail_count() + 1;	// up to 5 tries
//			updateParam.setLogin_fail_count(nextCount);
//			
//			int res = userService.updateAccountStatus(updateParam);
//			
//			if (nextCount < 5) {
//				meta.setMessage("Login failed : Incorrect password (" + nextCount + "/5 tries)");
//			} else {
//				meta.setMessage("Login failed : Incorrect password. Account is locked from too many failed attempts");
//			}
//        	meta.setSuccess(false);
//        	
//        	return new JsonResponse(meta, null);
//		} else {
//			// otherwise, reset the fail count and proceed with log-in
//			User updateParam = new User();
//			updateParam.setEmail_address(userParam.getEmail_address());
//			updateParam.setLogin_fail_count(Integer.parseInt("0"));
//			
//			int res = userService.updateAccountStatus(updateParam);
//		}
//		
//		/*
//		 * Session creation on successful login
//		 */
//		SSOUser ssoUser = new SSOUser();
//		ssoUser.setUserSeqNo(Long.toString(user.getUserseqno()));
//		ssoUser.setLoginId(user.getLogin_name());
//		ssoUser.setEmail(user.getEmail_address());
//		ssoUser.setUserName(user.getFirst_name() + " " + user.getLast_name());
//		ssoUser.setUserType(user.getUser_type());
//		ssoUser.setPasswd_reset_needed(user.getPasswd_reset_needed());
//		
//		// gets usertype display name
//		List<Code> userTypeList = codeService.listUserType("en");
//		for (Code code : userTypeList) {
//			if (code.getCode_id() != null && code.getCode_id().equals(user.getUser_type()) ) {
//        		ssoUser.setUserType_name(code.getCode_name());
//        		break;
//			}
//		}
//		
//		request.getSession().setAttribute("ssoUser", ssoUser);
//		
//		/*
//		 * prof_id cookie creation (mainly because of excel hyperlinks) 
//		 *     store userseqno
//		 */
//		Cookie cookie = new Cookie("prof_id", Encrypt.EncodeBySType(Long.toString(user.getUserseqno())));
//		cookie.setMaxAge(-1);
//		response.addCookie(cookie);
//		
//    	meta.setMessage("OK");
//    	meta.setSuccess(true);
//    	
//    	return new JsonResponse(meta, accountStatus.getPasswd_reset_needed());
//	}
//	
//	@RequestMapping(value = "/logout", method = RequestMethod.GET)
//	public String logout(HttpServletRequest request, HttpServletResponse response)
//	{
//		/*
//		 * Session deletion
//		 */
//		request.getSession().setAttribute("ssoUser", null);
//		
//		return "login";
//	}
//
//	
//	
//	
//	
//	
//	
//	
//	/*
//	 * IP Restriction stuff
//	 */
//	@RequestMapping( value="/access", method=RequestMethod.POST)
//	public @ResponseBody JsonResponse access(ModelMap model, HttpServletRequest request)
//	{
//		Meta meta = new Meta();
//		
//		HttpSession session = request.getSession();
//		
//		LOGGER.info("##### session.getAttribute('isWhitelisted') #### : " + session.getAttribute("isWhitelisted"));
//		
//		if (session.getAttribute("isWhitelisted") == null) {
//			session.setAttribute("isWhitelisted", false);
//		} else if ((Boolean) session.getAttribute("isWhitelisted") == true) {
//        	meta.setMessage("OK");
//        	meta.setSuccess(true);
//        	return new JsonResponse(meta, null);
//		}
//		
//		/*
//		 * Whitelisted IPs only!!!!!!1
//		 */
//		if (checkAccessIPs(request, (Boolean) session.getAttribute("isWhitelisted")) == false) {
//    		System.out.println("IP not whitelisted");
//        	meta.setMessage("IP not whitelisted");
//        	meta.setSuccess(false);
//        	return new JsonResponse(meta, null);
//		} else {
//			session.setAttribute("isWhitelisted", true);
//		}
//		
//    	meta.setMessage("OK");
//    	meta.setSuccess(true);
//    	return new JsonResponse(meta, null);
//	}
//	
//	private boolean checkAccessIPs(HttpServletRequest request, boolean isWhitelisted) 
//	{
//		if (isWhitelisted == false) {
//			String remoteAddr = request.getRemoteAddr() == null ? "" : request.getRemoteAddr();
//			String remoteAddrX = request.getHeader("x-forwarded-for") == null ? "" : request.getHeader("x-forwarded-for").split(",")[0];
//			
//			LOGGER.info("##### request.getRemoteAddr() ################## : " + remoteAddr);
//			LOGGER.info("##### request.getHeader('x-forwarded-for') ##### : " + remoteAddrX);
//			
//			List<AccessIPs> accessIPs = accessIPsDAO.selectAccessIPs();
//			
//			boolean canAccess = false;
//			
//			// only unrestricted IPs have access (see table CA_OFFER_ACCESS_IP)
//			for (AccessIPs ip : accessIPs) {
//				// if X-FORWARDED-FOR address is empty, check remoteAddr
//				if ("".equals(remoteAddrX)) {
//					if (!"".equals(remoteAddr) && remoteAddr.equals(ip.getIpaddress())) {
//						canAccess = true;
//					}
//				// otherwise, check it
//				} else if (remoteAddrX.equals(ip.getIpaddress())) {
//					canAccess = true;
//				}
//			}
//			if (!canAccess) {
//				LOGGER.info("Access IP is not whitelisted. Access denied.");
//				return false;
//			}
//		}
//		
//		return true;
//	}
	
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
		
}
