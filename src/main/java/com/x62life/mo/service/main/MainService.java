package com.x62life.mo.service.main;

import com.x62life.mo.model.boardcontents.BdContents;
import com.x62life.mo.model.boardcontents.MagazineLEx;
import com.x62life.mo.model.exhibition.AdMainMg;
import com.x62life.mo.model.exhibition.MainPageSkin;
import com.x62life.mo.model.exhibition.OneDaySpecialEx;
import com.x62life.mo.model.product.GdMasterEx;

import java.util.List;
import java.util.Map;

public interface MainService {
    List<AdMainMg> mainBannerList(String strMEMGRPCD);

    List<MainPageSkin> renewalBannerList();

    List<OneDaySpecialEx> todaySpecialProdList(Map<String, Object> paramMap);

    String firstBuyGiftTargetCheck(String strMEMGRPCD);

    Map<String, Object> commonUserBuyGiftTargetCheck(Map<String, Object> paramMap);

    List<OneDaySpecialEx> nowHotProdList(Map<String, Object> paramMap);

    List<GdMasterEx> newProdList(Map<String, Object> paramMap);

    List<GdMasterEx> bestProdList(Map<String, Object> paramMap);

    List<GdMasterEx> discountProdList(Map<String, Object> paramMap);

    List<Map<String, Object>> bestReviewProd(Map<String, Object> paramMap);

    int magazineNum();

    List<MagazineLEx> magazineDetail();

    List<BdContents> eventList(Map<String, Object> paramMap);
}
