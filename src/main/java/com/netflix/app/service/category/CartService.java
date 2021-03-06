package com.netflix.app.service.category;

import com.netflix.app.model.order.ShoppingBasket;
import com.netflix.app.model.order.ShoppingBasketEx;

import java.util.List;
import java.util.Map;

public interface CartService {
    List<ShoppingBasketEx> cartProdList(Map<String, Object> paramMap) throws Exception;

    Map<String,Object> cartListTotalAmount(Map<String, Object> paramMap);

    String checkProdCategory(Map<String, Object> paramMap);

    List<ShoppingBasket> checkAlreadyCart(Map <String, Object> paramMap);

    void addCart(Map<String, Object> paramMap);

    public Map<String, Object> checkReservedAndFast(Map<String, Object> paramMap);

    void cartProdCntUpdate(Map<String, Object> paramMap);

    List<ShoppingBasket> checkProdCnt(Map<String, Object> paramMap);

    void deleteProdOneFromCart(Map<String, Object> paramMap);

    void deleteProdOneFromOdCart(Map<String, Object> paramMap);

    void deleteChoiceProdFromCart(Map<String, Object> paramMap);

    void deleteChoiceProdFromOdCart(Map<String, Object> paramMap);

    void clearAllProdFromCart(Map<String, Object> paramMap);

    void clearAllProdFormOdCart(Map<String, Object> paramMap);
}
