package com.x62life.mo.dao.main;

import com.x62life.mo.model.boardcontents.BdContents;
import com.x62life.mo.model.boardcontents.MagazineLEx;
import com.x62life.mo.model.exhibition.AdMainMg;
import com.x62life.mo.model.exhibition.OneDaySpecialEx;
import com.x62life.mo.model.product.BestProduct;
import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.model.product.SeasonalFoodHall;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository("mainDao")
public interface MainDao {
    List<OneDaySpecialEx> todaySpecial(Map<String, Object> paramMap);

    List<AdMainMg> getSwiperBannerInfo();

    List<AdMainMg> swiperBannerRenewal();

    Map<String, Object> checkFirstBuyPresentEventTarget(String strLoginMemCd);

    Map<String, Object> eventTargetPayment(Map<String, Object> paramMap);

    List<GdMasterEx> newProdList(Map<String, Object> paramMap);

    List<SeasonalFoodHall> seasonalFoodHall(Map<String, Object> paramMap);

    List<BestProduct> bestProdList(Map<String, Object> paramMap);

    List<GdMasterEx> discountProdList(String strMEMGRPCD);

    int getMagazineIdx();

    List<MagazineLEx> getMagazineDetail();

    List<BdContents> eventList(Map<String, Object> paramMap);

    Map<String, Object> getRecommendListPaging();

    List<GdMasterEx> getRecommendProdList(Map<String, Object> paramMap);

    Map<String, Object> getRightwayListPaging();

    List<GdMasterEx> getRightwayList(Map<String, Object> paramMap);
}
