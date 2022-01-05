package com.x62life.mo.dao.mypage;


import com.x62life.mo.model.order.ShoppingBasket;
import com.x62life.mo.model.order.ShoppingBasketEx;

import java.util.List;
import java.util.Map;

public interface CartDao {
    List<ShoppingBasketEx> cartProdList(Map<String, Object> paramMap);

    Map<String,Object> cartListTotalAmount(Map<String, Object> paramMap);

    String checkProdCategory(Map<String, Object> paramMap);

    List<ShoppingBasket> checkAlreadyCart(Map <String, Object> paramMap);

    void addCart(Map<String, Object> paramMap);

    Map<String, Object> checkReservedAndFast(Map<String, Object> paramMap);

    void cartProdCntUpdate(Map<String, Object> paramMap);

    List<ShoppingBasket> checkProdCnt(Map<String, Object> paramMap);

    void deleteProdOneFromCart(Map<String, Object> paramMap);

    void deleteProdOneFromOdCart(Map<String, Object> paramMap);

    void deleteChoiceProdFromCart(Map<String, Object> paramMap);

    void deleteChoiceProdFromOdCart(Map<String, Object> paramMap);

    void clearAllProdFromCart(Map<String, Object> paramMap);

    void clearAllProdFormOdCart(Map<String, Object> paramMap);
}
