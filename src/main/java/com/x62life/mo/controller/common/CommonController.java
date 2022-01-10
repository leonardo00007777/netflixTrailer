package com.x62life.mo.controller.common;

import com.x62life.mo.service.category.CategoryService;
import com.x62life.mo.service.main.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/common")
public class CommonController {

	private static final Logger logger = Logger.getLogger("CommonController.class");
	
	@Autowired
	CategoryService categoryService;
	@Autowired
	MainService mainService;

	/**
	 * <pre>
	 * 1. MethodName : BNB / Timeline
	 * 2. ClassName  : CommonController.java
	 * 3. Comment    : Timeline  페이지로 이동한다.
	 * 4. 작성자       : jckim
	 * 5. 작성일       : 2021. 12. 01.
	 * </pre>
	 *
	 * @param request
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/footertimeline")
	public ModelAndView footerTimeline(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();

		//System.out.println("MAIN : " + SessionsAdmin.isLoginAdmin(request));

		mv.addObject("commandMap", commandMap);

		mv.setViewName("/common/footerTimeline");

		return mv;
	}
	
	
	/**
	 * <pre>
	 * 1. MethodName : BNB / Timeline
	 * 2. ClassName  : CommonController.java
	 * 3. Comment    : footerCategory  페이지로 이동한다.
	 * 4. 작성자       : jckim
	 * 5. 작성일       : 2021. 12. 01.
	 * </pre>
	 *
	 * @param request
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/footercategory")
	public ModelAndView footerCategory(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		//System.out.println("MAIN : " + SessionsAdmin.isLoginAdmin(request));
		
		mv.addObject("commandMap", commandMap);
		
		mv.setViewName("/common/footerCategory");
		
		return mv;
	}
	
	
	/**
	 * <pre>
	 * 1. MethodName : BNB / footersearch
	 * 2. ClassName  : CommonController.java
	 * 3. Comment    : footersearch  페이지로 이동한다.
	 * 4. 작성자       : jckim
	 * 5. 작성일       : 2021. 12. 01.
	 * </pre>
	 *
	 * @param request
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/footersearch")
	public ModelAndView footerSearch(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		//System.out.println("MAIN : " + SessionsAdmin.isLoginAdmin(request));
		
		mv.addObject("commandMap", commandMap);
		
		mv.setViewName("/common/footerSearch");
		
		return mv;
	}
	
	/**
	 * <pre>
	 * 1. MethodName : BNB / footerMypage
	 * 2. ClassName  : CommonController.java
	 * 3. Comment    : footerMypage  페이지로 이동한다.
	 * 4. 작성자       : jckim
	 * 5. 작성일       : 2021. 12. 01.
	 * </pre>
	 *
	 * @param request
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/footermypage")
	public ModelAndView footerMypage(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		//System.out.println("MAIN : " + SessionsAdmin.isLoginAdmin(request));
		
		mv.addObject("commandMap", commandMap);
		
		mv.setViewName("/common/footerMypage");
		
		return mv;
	}
	
	//---------------------------------------------
	// 설정
	//---------------------------------------------	
	/**
	 * 설정
	 *
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/setting")
	public ModelAndView setting(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/setting");
		
		mv.addObject("commandMap", commandMap);
		
		mv.setViewName("/common/setting");
		
		return mv;
	}
	
	//---------------------------------------------
	// chatting
	//---------------------------------------------		
	/**
	 * 1:1 문의
	 *
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/chatqna")
	public ModelAndView chatqna(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/chatqna");
		
		mv.setViewName("/common/chatqna");
		
		return mv;
	}
	
	/**
	 * 실시간 채팅 상담
	 *
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/realchat")
	public ModelAndView realchat(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/realchat");
		
		mv.setViewName("/common/realchat");
		
		return mv;
	}
	
	/**
	 * download app
	 *
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/downloadapp")
	public ModelAndView downloadapp(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/downloadapp");
		
		mv.setViewName("/common/downloadapp");
		
		return mv;
	}
	
	
	
	
	
}
