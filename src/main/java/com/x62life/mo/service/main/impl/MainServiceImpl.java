package com.x62life.mo.service.main.impl;

import com.x62life.mo.dao.main.MainDao;
import com.x62life.mo.model.boardcontents.BdContents;
import com.x62life.mo.model.boardcontents.MagazineLEx;
import com.x62life.mo.model.exhibition.AdMainMg;
import com.x62life.mo.model.exhibition.OneDaySpecialEx;
import com.x62life.mo.model.product.BestProduct;
import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.model.product.SeasonalFoodHall;
import com.x62life.mo.model.product.SpecialSellingh;
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
    public List<OneDaySpecialEx> nowNewProdList(Map<String, Object> paramMap) {
        List<OneDaySpecialEx> nowNewProdList = mainDao.nowNewProdList(paramMap);
        return nowNewProdList;
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
    public List<Map<String, Object>> bestReviewProdList(Map<String, Object> paramMap) {
        return mainDao.bestReviewProdList(paramMap);
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

    @Override
    public Map<String, Object> getSpecialSellingBrandListPaging(Map<String, Object> paramMap) {
        paramMap.put("intPagePerItem", 30);
        return mainDao.getSpecialSellingBrandListPaging( paramMap);
    }

    @Override
    public List<SpecialSellingh> getSpecialSellingBrandHeader(Map<String, Object> paramMap) {
        paramMap.put("intPagePerItem", 30);
        return mainDao.getSpecialSellingBrandHeader(paramMap);
    }

    @Override
    public List<GdMasterEx> itemListBasicProdCategory(Map<String, Object> paramMap) {

        String[] customFilterProduct = {"43042719", "91073305", "05020034", "99701120", "1010000011", "1010000031"};
        paramMap.put("customFilterProduct", customFilterProduct);
        
        String[] isensExceptProduct = {"B11","B12", "B13", "B14"};
        paramMap.put("isensExceptProduct", isensExceptProduct);

        String[] exceptProduct ={"Y51","Y52","Y53","Y54"};
        paramMap.put("exceptProduct", exceptProduct);

        return mainDao.itemListBasicProdCategory(paramMap);
    }

    @Override
    public List<String> itemListSelectCategory(Map<String, Object> paramMap){
        return mainDao.itemListSelectCategory(paramMap);
    }

    @Override
    public int itemListProdPaging(Map<String, Object> paramMap) {
        return mainDao.itemListProdPaging(paramMap);
    }
}
