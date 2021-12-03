package com.x62life.mo.controller.main;

import com.x62life.mo.model.category.Category;
import com.x62life.mo.model.exhibition.OneDaySpecialEx;
import com.x62life.mo.service.category.CategoryService;
import com.x62life.mo.service.main.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/main")
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
	@RequestMapping(value = "/main")
	public ModelAndView main(@RequestParam Map<String, Object> paramMap, Model model) {
		ModelAndView mv = new ModelAndView();

		List<Category> categoryList = categoryService.getCategoryList(paramMap);

		model.addAttribute("categoryList", categoryList);
/*	
		//스와이퍼 배너 정보
		List<AdMainMg> swiperBannerInfo = new ArrayList<>();

		swiperBannerInfo = mainService.getSwiperBannerInfo();

		model.addAttribute("swiperBannerInfo", swiperBannerInfo);

		//스와이퍼 배너 정보 리뉴얼
		List<AdMainMg> swiperBannerInfoRenewal = mainService.swiperBannerRenewal();

		model.addAttribute("swiperBannerRenewal", swiperBannerInfoRenewal);

		// strLoginMemCd, strGroupSalePolicy 가져오는 로직 필요
		String strLoginMemCd = null;
		String strGroupSalePolicy = "Y";
		paramMap.put("strLoginMemCd", strLoginMemCd);
		paramMap.put("strGroupSalePolicy", strGroupSalePolicy);

		//오늘의 특가 상품
		List<OneDaySpecialEx> oneDaySpecialList = mainService.oneDaySpecialList(paramMap);

		model.addAttribute("oneDaySpecialList", oneDaySpecialList);

		// 신규 상품 리스트 (strLoginMemCd, strGroupSalePolicy 가져오는 로직 필요)
		List<GdMasterEx> newProdList = mainService.newProdList(paramMap);

		model.addAttribute("newProdList", newProdList);

		//계절 상품 리스트
		List<SeasonalFoodHall> seasonalFoodHallList = mainService.seasonalFoodHallList(paramMap);

		model.addAttribute("seasonalFoodHallList", seasonalFoodHallList);

		//인기 상품 리스트
		paramMap.put("basicDays", 7);
		List<BestProduct> bestProductList = mainService.bestProductList(paramMap);
		
		model.addAttribute("bestProductList", bestProductList);

		//추천 상품 리스트 페이징
		Map<String, Object> getRecommendListPaging = mainService.getRecommendListPaging();

		model.addAttribute("getRecommendListPaging", getRecommendListPaging);

		//추천 상품 리스트
		List<GdMasterEx> getRecommendProdList = mainService.getRecommendProdList(paramMap);

		model.addAttribute("getRecommendProdList",getRecommendProdList);

		//할인 상품 리스트
		String strMEMGRPCD = null;
		List<GdMasterEx> discountProdList = mainService.discountProdList(strMEMGRPCD);

		model.addAttribute("discountProdList", discountProdList);

		//매거진 컨텐츠 idx
		int magazineIdx = mainService.magazineIdx();
		List<MagazineLEx> magazineDetailList = mainService.magazineDetailList();

		model.addAttribute("magazineIdx",magazineIdx);
		model.addAttribute("magazineDetailList", magazineDetailList);

		//이벤트 리스트
		String ctsctEvent = null;
		paramMap.put("ctsctEvent",ctsctEvent);
		List<BdContents> eventList = mainService.eventList(paramMap);
		model.addAttribute(eventList);

		//오늘발송 상품 리스트 페이징
		Map<String, Object> getRightwayListPaging = mainService.getRightwayListPaging();
		model.addAttribute("getRightwayListPaging", getRightwayListPaging);

		//오늘발송 상품 리스트
		List<GdMasterEx> getRightwayList = mainService.getRightwayList(paramMap);
		model.addAttribute("getRightwayList", getRightwayList);
		
		//전문관 정보 가져오기
		Map<String, Object> getSpecialSellingBrandListPaging = mainService.getSpecialSellingBrandListPaging(paramMap);
		model.addAttribute("getSpecialSellingBrandListPaging", getSpecialSellingBrandListPaging);
		
		//전문관 헤더 정보 및 상품 가져오기
		List<SpecialSellingh> getSpecialSellingBrandHeader = mainService.getSpecialSellingBrandHeader(paramMap);
		model.addAttribute("getSpecialSellingBrandHeader", getSpecialSellingBrandHeader);
		*/
		//지금뜨는 상품
		List<OneDaySpecialEx> nowNewProdList = mainService.nowNewProdList(paramMap);
		model.addAttribute("nowNewProdList",nowNewProdList);

		//베스트 리뷰 상품
		List<Map<String, Object>> bestReviewProdList = mainService.bestReviewProdList(paramMap);
		model.addAttribute("bestReviewProdList",bestReviewProdList);

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

	@RequestMapping("/oneDaySpecial")
	public ModelAndView oneDaySpecial(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
		ModelAndView modelAndView = new ModelAndView();

		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("strMEMGRPCD", null);
		paramMap.put("strGroupSalePolicy","Y");

		List<OneDaySpecialEx> oneDaySpecialList = mainService.oneDaySpecialList(paramMap);
		model.addAttribute("oneDaySpecialList", oneDaySpecialList);
		modelAndView.setViewName("/main/main");

		return modelAndView;
	}

	/*첫구매 이벤트 대상자 체크*/
	@ResponseBody
	@RequestMapping(value = "/firstBuyEventCheck", method = { RequestMethod.POST })
	public Map<String,Object> firstBuyEventCheck(@RequestParam("strLoginMemCd") String strLoginMemCd) throws Exception{

		Map<String, Object> resultMap = mainService.checkEventTarget(strLoginMemCd);

		return resultMap;
	}

	/*첫구매 이벤트 대상자 세일 금액 */
	@ResponseBody
	@RequestMapping(value = "/eventTargetPayment", method = { RequestMethod.POST })
	public Map<String, Object> eventTargetPayment(@RequestParam Map<String,Object> paramMap) throws Exception {

		Map<String, Object> resultMap = mainService.eventTargetPayment(paramMap);

		return resultMap;
	}
}
