package com.x62life.mo.controller.cart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Properties;

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
