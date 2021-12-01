package com.x62life.mo.service.impl.main;

import com.x62life.mo.dao.CommonDao;
import com.x62life.mo.dao.category.CategoryDao;
import com.x62life.mo.dao.main.MainDao;
import com.x62life.mo.model.boardcontents.BdContents;
import com.x62life.mo.model.boardcontents.MagazineLEx;
import com.x62life.mo.model.exhibition.AdMainMg;
import com.x62life.mo.model.exhibition.OneDaySpecialEx;
import com.x62life.mo.model.product.BestProduct;
import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.model.product.SeasonalFoodHall;
import com.x62life.mo.service.main.MainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("mainService")
public class MainServiceImpl implements MainService {
    @Resource
    private MainDao mainDao;

    @Override
    public List<OneDaySpecialEx> oneDaySpecialList (Map<String, Object> paramMap){
        List<OneDaySpecialEx> oneDaySpecialList = mainDao.todaySpecial(paramMap);
        return oneDaySpecialList;
    }

    @Override
    public List<AdMainMg> getSwiperBannerInfo(){
        List<AdMainMg> getSwiperBannerInfo = mainDao.getSwiperBannerInfo();
        return getSwiperBannerInfo;
    }

    @Override
    public List<AdMainMg> swiperBannerRenewal() {
        List<AdMainMg> swiperBannerRenewal = mainDao.swiperBannerRenewal();
        return swiperBannerRenewal;
    }

    @Override
    public Map<String, Object> checkEventTarget(String strLoginMemCd){
        Map<String, Object> checkEventTarget = mainDao.checkFirstBuyPresentEventTarget(strLoginMemCd);
        return checkEventTarget;
    }

    @Override
    public Map<String, Object> eventTargetPayment(Map<String, Object> paramMap){
        Map<String, Object> eventTargetPayment = mainDao.eventTargetPayment(paramMap);
        return eventTargetPayment;
    }

    @Override
    public List<GdMasterEx> newProdList(Map<String, Object> paramMap){
        List<GdMasterEx> newProdList = mainDao.newProdList(paramMap);
        return newProdList;
    }

    @Override
    public List<SeasonalFoodHall> seasonalFoodHallList(Map<String, Object> paramMap){
        List<SeasonalFoodHall> seasonalFoodHallList = mainDao.seasonalFoodHall(paramMap);
        return seasonalFoodHallList;
    }

    @Override
    public List<BestProduct> bestProductList(Map<String,Object> paramMap){
        List<BestProduct> bestProductList = mainDao.bestProdList(paramMap);
        return bestProductList;
    }

    @Override
    public List<GdMasterEx> discountProdList(String strMEMGRPCD){
        List<GdMasterEx> discountProdList = mainDao.discountProdList(strMEMGRPCD);
        return discountProdList;
    }

    @Override
    public int magazineIdx(){
        int magazineIdx = mainDao.getMagazineIdx();
        return magazineIdx;
    }

    @Override
    public List<MagazineLEx> magazineDetailList(){
        List<MagazineLEx> magazineDetailList = mainDao.getMagazineDetail();
        return magazineDetailList;
    }

    @Override
    public List<BdContents> eventList(Map<String, Object> paramMap) {
        List<BdContents> eventList = mainDao.eventList(paramMap);
        return eventList;
    }

    @Override
    public Map<String, Object> getRecommendListPaging() {
       return mainDao.getRecommendListPaging();
    }

    @Override
    public List<GdMasterEx> getRecommendProdList(Map<String, Object> paramMap){
        return mainDao.getRecommendProdList(paramMap);
    }

    @Override
    public Map<String, Object> getRightwayListPaging() {
        return mainDao.getRightwayListPaging();
    }

    @Override
    public List<GdMasterEx> getRightwayList(Map<String, Object> paramMap){

        return mainDao.getRightwayList(paramMap);
    }
}
