package com.x62life.mo.service.category.impl;

import com.x62life.mo.dao.mypage.CartDao;
import com.x62life.mo.model.order.ShoppingBasket;
import com.x62life.mo.model.order.ShoppingBasketEx;
import com.x62life.mo.service.category.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service("cartService")
public class CartServiceImpl implements CartService {
	
	@Resource(name="cartDao")
	private CartDao cartDao;

	@Override
	public List<ShoppingBasketEx> cartProdList(Map<String, Object> paramMap){
		return cartDao.cartProdList(paramMap);
	}

	@Override
	public List<String> cartCategory(Map<String, Object> paramMap){
		List<ShoppingBasketEx> cartProdList = cartDao.cartProdList(paramMap);

		List<String> cartCategory = new ArrayList<>();

		LinkedHashSet<String> titleSet = new LinkedHashSet();

		for(ShoppingBasketEx shoppingBasketEx : cartProdList){
			titleSet.add(shoppingBasketEx.getScode());
		}

		cartCategory.addAll(titleSet);

		return cartCategory;
	}

	@Override
	public Map<String,Object> cartListTotalAmount(Map<String, Object> paramMap){
		return cartDao.cartListTotalAmount(paramMap);
	}

	@Override
	public String checkProdCategory(Map<String, Object> paramMap){
		return cartDao.checkProdCategory(paramMap);
	}

	@Override
	public List<ShoppingBasket> checkAlreadyCart(Map<String, Object> paramMap) {
		return cartDao.checkAlreadyCart(paramMap);
	}

	@Override
	public void addCart(Map<String, Object> paramMap){
		cartDao.addCart(paramMap);
	}

	@Override
	public Map<String, Object> checkReservedAndFast(Map<String, Object> paramMap){
		return cartDao.checkReservedAndFast(paramMap);
	}

	@Override
	public void cartProdCntUpdate(Map<String, Object> paramMap){
		cartDao.cartProdCntUpdate(paramMap);
	}

	@Override
	public List<ShoppingBasket> checkProdCnt(Map<String, Object> paramMap){
		return cartDao.checkProdCnt(paramMap);
	}

	@Override
	public void deleteProdOneFromCart(Map<String, Object> paramMap){
		cartDao.deleteProdOneFromCart(paramMap);
	}

	@Override
	public void deleteProdOneFromOdCart(Map<String, Object> paramMap){
		cartDao.deleteProdOneFromOdCart(paramMap);
	}

	@Override
	public void deleteChoiceProdFromCart(Map<String, Object> paramMap){
		cartDao.deleteChoiceProdFromCart(paramMap);
	}

	@Override
	public void deleteChoiceProdFromOdCart(Map<String, Object> paramMap){
		cartDao.deleteChoiceProdFromOdCart(paramMap);
	}

	@Override
	public void clearAllProdFromCart(Map<String, Object> paramMap){
		cartDao.clearAllProdFromCart(paramMap);
	}

	@Override
	public void clearAllProdFormOdCart(Map<String, Object> paramMap){
		cartDao.clearAllProdFormOdCart(paramMap);
	}
}
