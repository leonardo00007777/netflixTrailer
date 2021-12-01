package com.x62life.mo.service.main;

import com.x62life.mo.model.boardcontents.BdContents;
import com.x62life.mo.model.boardcontents.MagazineLEx;
import com.x62life.mo.model.exhibition.AdMainMg;
import com.x62life.mo.model.exhibition.OneDaySpecialEx;
import com.x62life.mo.model.product.BestProduct;
import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.model.product.SeasonalFoodHall;

import java.util.List;
import java.util.Map;

public interface MainService {
    List<OneDaySpecialEx> oneDaySpecialList(Map<String, Object> paramMap);

    List<AdMainMg> getSwiperBannerInfo();

    List<AdMainMg> swiperBannerRenewal();

    Map<String,Object> checkEventTarget(String strLoginMemCd);

    Map<String, Object> eventTargetPayment(Map<String, Object> paramMap);

    List<GdMasterEx> newProdList (Map<String, Object> paramMap);

    List<SeasonalFoodHall> seasonalFoodHallList(Map<String, Object> paramMap);

    List<BestProduct> bestProductList(Map<String, Object> paramMap);

    List<GdMasterEx> discountProdList(String strMEMGRPCD);

    int magazineIdx();

    List<MagazineLEx> magazineDetailList();

    List<BdContents> eventList(Map<String, Object> paramMap);

    Map<String, Object> getRecommendListPaging();

    List<GdMasterEx> getRecommendProdList(Map<String, Object> paramMap);

    Map<String, Object> getRightwayListPaging();

    List<GdMasterEx> getRightwayList(Map<String, Object> paramMap);
}
