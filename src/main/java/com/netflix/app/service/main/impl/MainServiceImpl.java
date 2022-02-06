package com.netflix.app.service.main.impl;

import com.netflix.app.dao.main.MainDao;
import com.netflix.app.model.boardcontents.BdContents;
import com.netflix.app.model.boardcontents.MagazineLEx;
import com.netflix.app.model.exhibition.AdMainMg;
import com.netflix.app.model.exhibition.MainPageSkin;
import com.netflix.app.model.exhibition.OneDaySpecialEx;
import com.netflix.app.model.product.GdMasterEx;
import com.netflix.app.model.product.SeasonalFoodHall;
import com.netflix.app.service.main.MainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("mainService")
public class MainServiceImpl implements MainService {
    @Resource
    private MainDao mainDao;

    @Override
    public List<AdMainMg> mainBannerList(String strMEMGRPCD){
        return mainDao.mainBannerList(strMEMGRPCD);
    }

    @Override
    public List<MainPageSkin> renewalBannerList() {
        return mainDao.renewalBannerList();
    }

    @Override
    public List<OneDaySpecialEx> todaySpecialProdList(Map<String, Object> paramMap){
        return mainDao.todaySpecialProdList(paramMap);
    }

    @Override
    public String firstBuyGiftTargetCheck(String strMEMGRPCD){
        return mainDao.firstBuyGiftTargetCheck(strMEMGRPCD);
    }

    @Override
    public Map<String, Object> commonUserBuyGiftTargetCheck(Map<String, Object> paramMap){
        paramMap.put("normalMemberPromotionStartDdate", "2020-10-27");
        paramMap.put("normalMemberPromotionEndDate", "2020-11-30");
        return mainDao.commonUserBuyGiftTargetCheck(paramMap);
    }

    @Override
    public List<SeasonalFoodHall> seasonalProdList(Map<String, Object> paramMap){
        return mainDao.seasonalProdList(paramMap);
    }

    @Override
    public List<OneDaySpecialEx> nowHotProdList(Map<String, Object> paramMap){
        return mainDao.nowHotProdList(paramMap);
    }

    @Override
    public List<GdMasterEx> newProdList(Map<String, Object> paramMap){
        return mainDao.newProdList(paramMap);
    }

    @Override
    public List<GdMasterEx> bestProdList(Map<String, Object> paramMap){
        return mainDao.bestProdList(paramMap);
    }

    @Override
    public List<GdMasterEx> discountProdList(Map<String, Object> paramMap){
        return mainDao.discountProdList(paramMap);
    }

    @Override
    public List<Map<String, Object>> bestReviewProd(Map<String, Object> paramMap){
        return mainDao.bestReviewProd(paramMap);
    }

    @Override
    public int magazineNum(){
        return mainDao.magazineNum();
    }

    @Override
    public List<MagazineLEx> magazineDetail(){
        return mainDao.magazineDetail();
    }

    @Override
    public List<BdContents> eventList(Map<String, Object> paramMap){
        return mainDao.eventList(paramMap);
    }

    @Override
    public Map<String, Object> prodListPagingAjax(Map<String, Object> paramMap){
        return mainDao.prodListPagingAjax(paramMap);
    }

    @Override
    public List<Map<String, Object>> prodListAjax(Map<String, Object> paramMap){
        return mainDao.prodListAjax(paramMap);
    }
}
