package com.x62life.mo.controller.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.x62life.mo.model.category.Category;
import com.x62life.mo.service.CategoryService;

@Controller
@RequestMapping(value = "/main")
public class MainController {
	
	@Autowired
	CategoryService categoryService;
	
	/**
	 * <pre>
	 * 1. MethodName : Main / MD 추천
	 * 2. ClassName  : MainController.java
	 * 3. Comment    : MD추천 페이지로 이동한다.
	 * 4. 작성자       : jckim
	 * 5. 작성일       : 2021. 10. 11.
	 * </pre>
	 *
	 * @param request
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/main")
	public ModelAndView main(@RequestParam Map<String, Object> paramMap, Model model) {
		ModelAndView mv = new ModelAndView();
		
		List<Category> categoryList = new ArrayList<Category>();
		categoryList = categoryService.getCategoryList(paramMap);
		
		model.addAttribute("categoryList", categoryList);
		
		mv.setViewName("/main/main");
		
		return mv;
	}
	
	
	
	/**
	 * <pre>
	 * 1. MethodName : Main / 신상품
	 * 2. ClassName  : MainController.java
	 * 3. Comment    : 신상품 페이지로 이동한다.
	 * 4. 작성자       : jckim
	 * 5. 작성일       : 2021. 10. 11.
	 * </pre>
	 *
	 * @param request
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/newprdlist")
	public ModelAndView newPrdList(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();

		try {
			//System.out.println("MAIN : " + SessionsAdmin.isLoginAdmin(request));

			mv.setViewName("/main/newPrdList");

			//mv.addObject("commandMap", commandMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mv;
	}
	
	/**
	 * <pre>
	 * 1. MethodName : Main / 베스트
	 * 2. ClassName  : MainController.java
	 * 3. Comment    : 베스트 페이지로 이동한다.
	 * 4. 작성자       : jckim
	 * 5. 작성일       : 2021. 10. 11.
	 * </pre>
	 *
	 * @param request
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/bestprdlist")
	public ModelAndView bestPrdList(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		//System.out.println("MAIN : " + SessionsAdmin.isLoginAdmin(request));
		
		mv.setViewName("/main/bestPrdList");
		
		mv.addObject("commandMap", commandMap);
		
		return mv;
	}
	
	/**
	 * <pre>
	 * 1. MethodName : Main / 할인관
	 * 2. ClassName  : MainController.java
	 * 3. Comment    : 할인관 페이지로 이동한다.
	 * 4. 작성자       : jckim
	 * 5. 작성일       : 2021. 10. 11.
	 * </pre>
	 *
	 * @param request
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dcprdlist")
	public ModelAndView dcPrdList(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		//System.out.println("MAIN : " + SessionsAdmin.isLoginAdmin(request));
		
		mv.setViewName("/main/dcPrdList");
		
		mv.addObject("commandMap", commandMap);
		
		return mv;
	}
	
	/**
	 * <pre>
	 * 1. MethodName : Main / 전문관
	 * 2. ClassName  : MainController.java
	 * 3. Comment    : 전문관 페이지로 이동한다.
	 * 4. 작성자       : jckim
	 * 5. 작성일       : 2021. 10. 11.
	 * </pre>
	 *
	 * @param request
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/proprdlist")
	public ModelAndView proPrdList(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		//System.out.println("MAIN : " + SessionsAdmin.isLoginAdmin(request));
		
		mv.setViewName("/main/proPrdList");
		
		mv.addObject("commandMap", commandMap);
		
		return mv;
	}
	
	/**
	 * <pre>
	 * 1. MethodName : Main / 이벤트
	 * 2. ClassName  : MainController.java
	 * 3. Comment    : 이벤트 페이지로 이동한다.
	 * 4. 작성자       : jckim
	 * 5. 작성일       : 2021. 10. 11.
	 * </pre>
	 *
	 * @param request
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/eventprdlist")
	public ModelAndView eventPrdList(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		//System.out.println("MAIN : " + SessionsAdmin.isLoginAdmin(request));
		
		mv.setViewName("/main/eventPrdList");
		
		mv.addObject("commandMap", commandMap);
		
		return mv;
	}
		
}
