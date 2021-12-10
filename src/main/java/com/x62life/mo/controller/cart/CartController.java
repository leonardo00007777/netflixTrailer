package com.x62life.mo.controller.cart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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
import org.springframework.web.servlet.ModelAndView;

import com.x62life.mo.common.util.CookiesUtil;
import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.model.member.MbMaster;
import com.x62life.mo.service.login.LoginService;
import com.x62life.mo.service.member.MemberService;

@Controller
public class CartController {
	
	@Autowired Properties configProperties;
	
	@Value("#{configProperties['cookieDomain']}") 
	private String sCookieDomain;

	protected static final Logger LOGGER = LoggerFactory.getLogger(CartController.class);	

	/**
	 * <pre>
	 * 1. MethodName : Cart / CartList
	 * 2. ClassName  : CartController.java
	 * 3. Comment    : CartList  페이지로 이동한다.
	 * 4. 작성자       : jckim
	 * 5. 작성일       : 2021. 12. 01.
	 * </pre>
	 *
	 * @param request
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/cartlist")
	public ModelAndView cartList(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();

		//System.out.println("MAIN : " + SessionsAdmin.isLoginAdmin(request));

		mv.addObject("commandMap", commandMap);

		mv.setViewName("/cart/cartList");

		return mv;
	}
	
	
	    
}
