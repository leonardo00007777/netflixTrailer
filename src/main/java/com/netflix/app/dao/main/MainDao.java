package com.netflix.app.dao.main;

import com.netflix.app.model.boardcontents.BdContents;
import com.netflix.app.model.boardcontents.MagazineLEx;
import com.netflix.app.model.exhibition.AdMainMg;
import com.netflix.app.model.exhibition.MainPageSkin;
import com.netflix.app.model.exhibition.OneDaySpecialEx;
import com.netflix.app.model.product.GdMasterEx;
import com.netflix.app.model.product.SeasonalFoodHall;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("mainDao")
public interface MainDao {
    List<AdMainMg> mainBannerList(String strMEMGRPCD);

    List<MainPageSkin> renewalBannerList();

    List<OneDaySpecialEx> todaySpecialProdList(Map<String, Object> paramMap);

    String firstBuyGiftTargetCheck(String strLoginMemCd);

    Map<String, Object> commonUserBuyGiftTargetCheck(Map<String, Object> paramMap);

    List<SeasonalFoodHall> seasonalProdList(Map<String, Object> paramMap);

    List<OneDaySpecialEx> nowHotProdList(Map<String, Object> paramMap);

    List<GdMasterEx> newProdList(Map<String, Object> paramMap);

    List<GdMasterEx> bestProdList(Map<String, Object> paramMap);

    List<GdMasterEx> discountProdList(Map<String, Object> paramMap);

    List<Map<String, Object>> bestReviewProd(Map<String, Object> paramMap);

    int magazineNum();

    List<MagazineLEx> magazineDetail();

    List<BdContents> eventList(Map<String, Object> paramMap);

    Map<String, Object> prodListPagingAjax(Map<String, Object> paramMap);

    List<Map<String, Object>> prodListAjax(Map<String, Object> paramMap);
}
