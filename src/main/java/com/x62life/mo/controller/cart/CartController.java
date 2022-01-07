package com.x62life.mo.controller.cart;

import com.x62life.mo.model.order.ShoppingBasket;
import com.x62life.mo.model.order.ShoppingBasketEx;
import com.x62life.mo.service.category.CartService;
import com.x62life.mo.service.category.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class CartController {
	
	@Autowired Properties configProperties;

	@Autowired
	CartService cartService;

	@Autowired
	CategoryService categoryService;
	
	@Value("#{configProperties['cookieDomain']}") 
	private String sCookieDomain;

	protected static final Logger LOGGER = LoggerFactory.getLogger(CartController.class);

	/**
	 * <pre>
	 * 1. MethodName : Cart / CartList
	 * 2. ClassName  : CartController.java
	 * 3. Comment    : CartList  페이지로 이동한다.
	 * 4. 작성자       : chLee
	 * 5. 작성일       : 2022. 01. 05.
	 * </pre>
	 *
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/mypage/cartList")
	public ModelAndView cartList(@RequestParam Map<String, Object> paramMap, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		paramMap.put("strLoginMemCd", "develop");
		List<ShoppingBasketEx> cartProdList = cartService.cartProdList(paramMap);

		model.addAttribute("cartProdList", cartProdList);

		Map<String,Object> cartListTotalAmount = cartService.cartListTotalAmount(paramMap);
		model.addAttribute("cartListTotalAmount", cartListTotalAmount);

		mv.setViewName("/mypage/cart");

		return mv;
	}

	@RequestMapping("/mypage/addCartAjax")
	public void addCartAjax(@RequestParam Map<String, Object> paramMap) throws Exception {

		String checkProdCategory = cartService.checkProdCategory(paramMap);

		paramMap.put("strLoginMemCd", "develop");

		if(checkProdCategory != null && !checkProdCategory.isEmpty()){
			String gdcd = paramMap.get("strGDCD").toString();

			Map<String, Object> getCartOrderType = categoryService.getCartOrderType(gdcd);

			paramMap.put("strCartODTYPE", getCartOrderType.get("odgubun"));

			List<ShoppingBasket> checkAlreadyCart = cartService.checkAlreadyCart(paramMap);

			if(checkAlreadyCart.size() > 0) {
				int sumCnt = 0;

				for(ShoppingBasket shoppingBasket : checkAlreadyCart) {
					sumCnt = shoppingBasket.getGdcnt() + Integer.parseInt(paramMap.get("strGDCNT").toString());
					paramMap.put("strCRTIDX", shoppingBasket.getCrtidx());
					paramMap.put("sumCnt", sumCnt);

					Map<String, Object> checkReservedAndFast = cartService.checkReservedAndFast(paramMap);
					if(checkReservedAndFast != null && !checkReservedAndFast.isEmpty()){
						cartService.cartProdCntUpdate(paramMap);
					}
				}
			} else {
				cartService.addCart(paramMap);
			}
		}
	}
}
