package com.x62life.mo.service.category.impl;

import com.x62life.mo.dao.mypage.CartDao;
import com.x62life.mo.dao.procedure.ProcedureDao;
import com.x62life.mo.model.order.ShoppingBasket;
import com.x62life.mo.model.order.ShoppingBasketEx;
import com.x62life.mo.service.category.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import static com.x62life.mo.common.constants.Constants62life.DAY_PAY_DEADLINE_TIME;
import static com.x62life.mo.common.util.DateTime.*;

@Service("cartService")
public class CartServiceImpl implements CartService {
	
	@Resource(name="cartDao")
	private CartDao cartDao;

	@Resource(name="procedureDao")
	private ProcedureDao procedureDao;

	@Override
	public List<ShoppingBasketEx> cartProdList(Map<String, Object> paramMap) throws Exception {
		List<ShoppingBasketEx> cartProdList = cartDao.cartProdList(paramMap);
		int cnt = 0;
		if(cartProdList.size() > 0) {
			String scode = null;
			for(ShoppingBasketEx shoppingBasketEx : cartProdList){
				if(shoppingBasketEx.getOdtype().equals("02")){
					if(shoppingBasketEx.getThedaysyn().equals("Y")){
						String baseTime = getDateString3() + " " + DAY_PAY_DEADLINE_TIME;
						long diffHour = getDiffHour(baseTime);
						if(diffHour >= 0) {
							String rltDt = addDay(1, baseTime);
							paramMap.put("deliveryDate", rltDt);
							procedureDao.getDLVDTbyHolidayGeneral(paramMap);
							shoppingBasketEx.setStrDLVDT((String) paramMap.get("realDlvDt"));
						}
					}else {
						String baseTime = getDLVDTofToday();
						paramMap.put("deliveryDate", baseTime);
						shoppingBasketEx.setStrDLVDT((String) paramMap.get("realDlvDt"));
					}
				} else if(shoppingBasketEx.getOdtype().equals("PKG")){
					if(shoppingBasketEx.getGdcd().equals("A1")){
						int weekSeq = 0;
						for(int i = 0; i < 3; i++){
							weekSeq = weekSeq + i;
							paramMap.put("weekSeq", weekSeq);
							procedureDao.getDlvDtByHolidayPackage(paramMap);
							shoppingBasketEx.setStrDLVDT((String)paramMap.get("dlvdtOut"));
						}
					} else {
						paramMap.put("weekSeq", 1);
						procedureDao.getDlvDtByHolidayPackage(paramMap);
						shoppingBasketEx.setStrDLVDT((String)paramMap.get("dlvdtOut"));
						paramMap.put("weekSeq", 3);
						procedureDao.getDlvDtByHolidayPackage(paramMap);
						shoppingBasketEx.setStrDLVDT2((String)paramMap.get("dlvdtOut"));
					}
					int packageProduct = 0;
					packageProduct = packageProduct + 1;
				}
			}
		}
		return cartProdList;
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
