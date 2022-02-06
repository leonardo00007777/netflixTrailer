package com.netflix.app.controller.main;

import com.netflix.app.model.boardcontents.BdContents;
import com.netflix.app.model.boardcontents.MagazineLEx;
import com.netflix.app.model.exhibition.MainPageSkin;
import com.netflix.app.model.exhibition.OneDaySpecialEx;
import com.netflix.app.model.product.GdMasterEx;
import com.netflix.app.model.product.SeasonalFoodHall;
import com.netflix.app.service.category.CategoryService;
import com.netflix.app.service.main.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class MainController {

	@Autowired
	CategoryService categoryService;

	@Autowired
	MainService mainService;
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
	@RequestMapping(value = {"/main", "", "/"})
	public ModelAndView main(@RequestParam Map<String, Object> paramMap, Model model) throws Exception{
		ModelAndView mv = new ModelAndView();

		//리뉴얼 배너 리스트
		List<MainPageSkin> renewalBannerList = mainService.renewalBannerList();
		model.addAttribute("renewalBannerList", renewalBannerList);

		mv.setViewName("/main/main");

		return mv;
	}

	@RequestMapping(value = "/main/prodListAjax")
	@ResponseBody
	public Map<String, Object> newProdListAjax(@RequestParam Map<String, Object> paramMap) throws Exception{

		Map<String, Object> resultMap = new HashMap<>();
		Map<String, Object> prodListPagingAjax = mainService.prodListPagingAjax(paramMap);
		List<Map<String, Object>> prodListAjax = mainService.prodListAjax(paramMap);

		resultMap.put("prodListPagingAjax",prodListPagingAjax);
		resultMap.put("prodListAjax", prodListAjax);

		return resultMap;
	}

	@RequestMapping(value = "/main/prdOptionCheck")
	@ResponseBody
	public List<GdMasterEx> prdOptionCheck(@RequestParam Map<String, Object> paramMap) throws Exception {
		List<GdMasterEx> prdOptionCheck = categoryService.optionProduct(paramMap);

		return prdOptionCheck;
	}
}
