package com.x62life.mo.controller.main;

import com.x62life.mo.model.boardcontents.BdContents;
import com.x62life.mo.model.boardcontents.MagazineLEx;
import com.x62life.mo.model.exhibition.MainPageSkin;
import com.x62life.mo.model.exhibition.OneDaySpecialEx;
import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.model.product.SeasonalFoodHall;
import com.x62life.mo.service.category.CategoryService;
import com.x62life.mo.service.main.MainService;
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
	@RequestMapping(value = "/main")
	public ModelAndView main(@RequestParam Map<String, Object> paramMap, Model model) throws Exception{
		ModelAndView mv = new ModelAndView();

/*		//상단 메인 배너 리스트
		List<AdMainMg> mainBannerList = mainService.mainBannerList((String) paramMap.get("strMEMGRPCD"));
		model.addAttribute("mainBannerList",mainBannerList);*/

		//리뉴얼 배너 리스트
		List<MainPageSkin> renewalBannerList = mainService.renewalBannerList();
		model.addAttribute("renewalBannerList", renewalBannerList);

		//오늘의 특가
		List<OneDaySpecialEx> todaySpecialProdList = mainService.todaySpecialProdList(paramMap);
		model.addAttribute("todaySpecialProdList",todaySpecialProdList);

		//첫구매 선물증정 이벤트 대상 검사
		if(paramMap != null && !paramMap.isEmpty()){
			if(paramMap.get("strLoginMemCd") != null || !paramMap.get("strLoginMemCd").equals("")){
				String firstBuyGiftTargetCheck = mainService.firstBuyGiftTargetCheck((String)paramMap.get("strMEMGRPCD"));
				model.addAttribute("firstBuyGiftTargetCheck", firstBuyGiftTargetCheck);

				//'20201021 일반회원 활성화 방안 1 - 신규회원처럼 첫구매 선물증정 절차 거치게 함.
				//'2019-01-01 ~ 2020-09-27 가입한 결제 0회인 일반회원 첫구매 혜택(기간: 2020-10-27 ~ 2020-11-27)
				String date1 = "2020-10-27"; //날짜1
				String date2 = "2020-11-30"; //날짜2
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date currentTime = new Date();
				String today = format.format(currentTime);
				int compare1 = date1.compareTo(today);
				int compare2 = today.compareTo(date2);

				if(compare1 >= 0 && compare2 >= 0){
					Map<String, Object> commonUserBuyGiftTargetCheck = mainService.commonUserBuyGiftTargetCheck(paramMap);
					model.addAttribute("commonUserBuyGiftTargetCheck",commonUserBuyGiftTargetCheck);
				}
			}
		}

		//제철 상품
		List<SeasonalFoodHall> seasonalProdList = mainService.seasonalProdList(paramMap);
		model.addAttribute("seasonalProdList", seasonalProdList);

		//지금 뜨는 상품 (신상품추천)
		List<OneDaySpecialEx> nowHotProdList = mainService.nowHotProdList(paramMap);
		model.addAttribute("nowHotProdList", nowHotProdList);

		//새로나온 상품
		List<GdMasterEx> newProdList = mainService.newProdList(paramMap);
		model.addAttribute("newProdList", newProdList);

		//인기상품 리스트
		paramMap.put("basicDays", 7);
		List<GdMasterEx> bestProdList = mainService.bestProdList(paramMap);
		model.addAttribute("bestProdList", bestProdList);

		//할인상품 리스트
		paramMap.put("displayCount", 8);
		paramMap.put("limitRank", 100);
		List<GdMasterEx> discountProdList = mainService.discountProdList(paramMap);
		model.addAttribute("discountProdList", discountProdList);

/*		//베스트 리뷰 상품
		List<Map<String, Object>> bestReviewProd = mainService.bestReviewProd(paramMap);
		model.addAttribute("bestReviewProd", bestReviewProd);*/

		//매거진
		int magazineNum = mainService.magazineNum();
		List<MagazineLEx> magazineDetail = mainService.magazineDetail();
		model.addAttribute("magazineNum",magazineNum);
		model.addAttribute("magazineDetail", magazineDetail);

		//이벤트
		List<BdContents> eventList = mainService.eventList(paramMap);
		model.addAttribute("eventList", eventList);

		//신상품 옵션상품 체크
		if(newProdList.size() > 0) {
			List<List<GdMasterEx>> newProdOptionProduct = new ArrayList<>();
			for(GdMasterEx gdMasterEx : newProdList){
				paramMap.put("strGDCD", gdMasterEx.getGdcd());
				paramMap.put("strItemOptionp", gdMasterEx.getOptionp());
				newProdOptionProduct.add(categoryService.optionProduct(paramMap));
			}
			model.addAttribute("newProdOptionProduct", newProdOptionProduct);
		}
		
		//할인상품 옵션상품 체크
		if(discountProdList.size() > 0) {
			List<List<GdMasterEx>> dcProdOptionProduct = new ArrayList<>();
			for(GdMasterEx gdMasterEx : discountProdList){
				paramMap.put("strGDCD", gdMasterEx.getGdcd());
				paramMap.put("strItemOptionp", gdMasterEx.getOptionp());
				dcProdOptionProduct.add(categoryService.optionProduct(paramMap));
				model.addAttribute("dcProdOptionProduct", dcProdOptionProduct);
			}
		}

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
