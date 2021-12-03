package com.x62life.mo.service.impl.category;

import com.x62life.mo.dao.category.CategoryDao;
import com.x62life.mo.model.category.CartRecipe;
import com.x62life.mo.model.category.CartRecipeEx;
import com.x62life.mo.model.category.Category;
import com.x62life.mo.model.category.SubCategory;
import com.x62life.mo.model.order.OdReserveGoodsEx;
import com.x62life.mo.model.product.*;
import com.x62life.mo.service.category.CategoryService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{
	
	@Resource(name="categoryDao")
	private CategoryDao categoryDao;

	@Override
	public List<Category> getCategoryList(Map<String, Object> paramMap) {
		return categoryDao.getCategoryList(paramMap);
	}

	@Override
	public List<SubCategory> getSubCategoryList(Map<String, Object> paramMap) {
		return categoryDao.getItemList(paramMap);
	}

	@Override
	public int specialExhibitionProdCnt(Map<String, Object> paramMap) {
		return categoryDao.specialExhibitionProdCnt(paramMap);
	}

	@Override
	public List<GdMasterEx> specialExhibitionProdList(Map<String, Object> paramMap) throws Exception{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date currentTime = new Date();
		String date = format.format(currentTime);

		String targetDate1 = "2020-06-18";
		String targetDate2 = "2020-06-27";
		String targetDate3 = "2020-06-26";
		String targetDate4 = "2020-07-06";

		Date endDate1 = format.parse(targetDate1);
		Date endDate2 = format.parse(targetDate2);
		Date endDate3 = format.parse(targetDate3);
		Date endDate4 = format.parse(targetDate4);

		Date todate = format.parse(date);

		int compareDate1 = endDate1.compareTo(todate);
		int compareDate2 = endDate2.compareTo(todate);
		int compareDate3 = endDate3.compareTo(todate);
		int compareDate4 = endDate4.compareTo(todate);

		paramMap.put("compare1", compareDate1);
		paramMap.put("compare2", compareDate2);
		paramMap.put("compare3", compareDate3);
		paramMap.put("compare4", compareDate4);

		return categoryDao.specialExhibitionProdList(paramMap);
	}

	@Override
	public Map<String,Object> getReserveItemListPaging(Map<String, Object> paramMAp) {
		return categoryDao.getReserveItemListPaging(paramMAp);
	}

	@Override
	public List<OdReserveGoodsEx> reserveGoodsList(Map<String, Object> paramMap) {
		return categoryDao.getReserveItemList(paramMap);
	}

	@Override
	public Map<String,Object> itemListPagingMap(Map<String, Object> paramMap) {
		return categoryDao.getItemListPaging(paramMap);
	}

	@Override
	public List<GdMasterEx> allItemList(Map<String, Object> paramMap){
		return categoryDao.getItemListSearch(paramMap);
	}

	@Override
	public List<CartRecipe> cartRecipeTitle(Map<String, Object> paramMap) {
		return categoryDao.custSetTitle(paramMap);
	}

	@Override
	public void visitorCnt(Map<String, Object> paramMap){
		categoryDao.visitorCnt(paramMap);
	}

//	@Override
//	public List<BasicTagMap> tagList(Map<String, Object> paramMap) {
//		return categoryDao.getTagList(paramMap);
//	}

	@Override
	public List<CartRecipeEx> cartRecipeProdList(Map<String, Object> paramMap) {
		return categoryDao.getCartRecipeProdList(paramMap);
	}

	@Override
	public Map<String, Object> custSetListPaging(Map<String, Object> paramMap) {
		return categoryDao.custSetListPaging(paramMap);
	}

	@Override
	public List<CartRecipeEx> custSetProdList(Map<String, Object> paramMap) {
		return categoryDao.custSetProdList(paramMap);
	}

	@Override
	public List<CartRecipeEx> custSetGoodsList(Map<String, Object> paramMap) {
		return categoryDao.custSetGoodsList(paramMap);
	}

	@Override
	public List<GdMasterEx> defSetOneProd(Map<String, Object> paramMap){
		String[] customFilterProduct = {"43042719","91073305","05020034","99701120","1010000011","1010000013", "1010000031"};
		paramMap.put("customFilterProduct",customFilterProduct);

		return categoryDao.defSetOneProd(paramMap);
	}

	@Override
	public Map<String, Object> discountListPaging(Map<String, Object> paramMap) {
		paramMap.put("intPagePerItem", 30);
		return categoryDao.discountListPaging(paramMap);
	}

	@SneakyThrows
	@Override
	public List<GdMasterEx> discountSetProdList(Map<String, Object> paramMap) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date currentTime = new Date();
		String date = format.format(currentTime);

		String targetDate1 = "2020-11-16";
		String targetDate2 = "2020-11-20";
		String targetDate3 = "2020-11-21";

		Date endDate1 = format.parse(targetDate1);
		Date endDate2 = format.parse(targetDate2);
		Date endDate3 = format.parse(targetDate3);

		Date todate = format.parse(date);

		int compareDate1 = endDate1.compareTo(todate);
		int compareDate2 = endDate2.compareTo(todate);
		int compareDate3 = endDate3.compareTo(todate);;

		paramMap.put("compare1", compareDate1);
		paramMap.put("compare2", compareDate2);
		paramMap.put("compare3", compareDate3);

		String[] onlyNormalGroupProduct= {"1010000246", "0110000403", "7010000438", "1010000245", "7010000439"};
		paramMap.put("onlyNormalGroupProduct", onlyNormalGroupProduct);

		return categoryDao.discountSetProdList(paramMap);
	}

	@Override
	public Map<String, Object> getDirectListPaging(Map<String, Object> paramMap) {
		return categoryDao.getDirectListPaging(paramMap);
	}

	@Override
	public List<OdReserveGoodsEx> getDirectListHeader(Map<String, Object> paramMap){
		return categoryDao.getDirectListHeader(paramMap);
	}

	@Override
	public int getTargetDate(String date) {
		return categoryDao.targetDate(date);
	}

	@Override
	public List<String> isenseFilteringProdGdcd(Map<String, Object> paramMap){
		return categoryDao.isenseFilteringProdGdcd(paramMap);
	}

	@Override
	public List<GdMasterEx> isenseBestProd(Map<String, Object> paramMap) {
		List<GdMasterEx> isenseBestProd = categoryDao.isenseBestProd(paramMap);

		for(int i = 0; i < isenseBestProd.size(); i++){
			if(isenseBestProd.get(i).getGdcnt() == null || isenseBestProd.get(i).getGdcnt().equals("")){
				isenseBestProd.get(i).setItemRemainQty(0);
			}else{
				isenseBestProd.get(i).setItemRemainQty(Integer.parseInt(isenseBestProd.get(i).getGdcnt()));
				if(isenseBestProd.get(i).getItemRemainQty() > 50000){
					isenseBestProd.get(i).setGdcnt("제한없음");
				}
			}
			if(isenseBestProd.get(i).getReserveyn() == 'Y'){
				if(isenseBestProd.get(i).getOdtype() == "11"){
					isenseBestProd.get(i).setOdtype2("12");
				}
			}else{
				if(isenseBestProd.get(i).getDeliverydtyn() == 'Y'){
					isenseBestProd.get(i).setOdtype2("02");
				}
			}
		}
		return isenseBestProd;
	}

	@Override
	public int itemListPaging(Map<String, Object> paramMap){
		return categoryDao.itemListPaging(paramMap);
	}

	@Override
	public List<String> subCategoryList(Map<String, Object> paramMap){

		return categoryDao.getItemListSubmenu(paramMap);
	}

	@Override
	public List<GdMasterEx> getItemList(Map<String, Object> paramMap) {
		String[] spProduct = {"Y31", "Y32", "Y33", "Y34", "Y35"};
		String[] exceptProduct = {"Y51", "Y52", "Y53", "Y54"};
		String[] isenseExceptProduct = {"B11", "B12", "B13", "B14"};
		String[] customFilterProduct = {"43042719","91073305","05020034","99701120","1010000011","1010000013", "1010000031"};

		paramMap.put("listingMode", "OPT");
		paramMap.put("spCustomerGroup", "SK_CHEMICALS");
		paramMap.put("spProduct", spProduct);
		paramMap.put("exceptProduct", exceptProduct);
		paramMap.put("isenseExceptProduct", isenseExceptProduct);
		paramMap.put("customFilterProduct", customFilterProduct);

		paramMap.put("intPagePerItem", 30);

		if(paramMap.get("intPage").equals("") || Integer.parseInt((String)paramMap.get("intPage")) == 0){
			paramMap.put("intPage", 1);
		}

		int pageOffset = (Integer.parseInt((String)paramMap.get("intPage")) - 1) * Integer.parseInt((String)paramMap.get("intPagePerItem"));
		paramMap.put("pageOffset", pageOffset);

		if(paramMap.get("strOdtype2").equals("")) {
			paramMap.put("strOdtype2", "01");
		}
		if(paramMap.get("strGdtype").equals("") && !paramMap.get("strOdtype").equals("12")){
			paramMap.put("strGdtype", "01");
		}

		if(paramMap.get("strExDiv1").equals("") && !paramMap.get("strOdtype").equals("12")){
			paramMap.put("strExDiv1", "01");
		}
		if(paramMap.get("strPriceRange").equals("A")){
			paramMap.put("lowPrice", 1);
			paramMap.put("highPrice", 30000);
		} else if(paramMap.get("strPriceRange").equals("B")){
			paramMap.put("lowPrice", 30000);
			paramMap.put("highPrice", 50000);
		} else if(paramMap.get("strPriceRange").equals("C")){
			paramMap.put("lowPrice", 50000);
			paramMap.put("highPrice", 100000);
		} else if(paramMap.get("strPriceRange").equals("D")){
			paramMap.put("lowPrice", 100000);
			paramMap.put("highPrice", 200000);
		} else if(paramMap.get("strPriceRange").equals("E")){
			paramMap.put("lowPrice", 200000);
			paramMap.put("highPrice", 99999999);
		} else {
			paramMap.put("lowPrice", 0);
			paramMap.put("highPrice", 99999999);
		}
		if(paramMap.get("strOdtype").equals("RESERVE")){
			paramMap.put("strOdtype", 12);
		} else if(paramMap.get("strOdtype").equals("QUICK")){
			paramMap.put("strOdtype", 11);
		} else if(paramMap.get("strOdtype").equals("SP")){
			paramMap.put("strOdtype", 12);
		}
		List<GdMasterEx> searchProdAll =  categoryDao.searchProdAll(paramMap);

		for(int i = 0; i < searchProdAll.size(); i++) {
			if(searchProdAll.get(i).getGdcnt().equals("0")){
				searchProdAll.get(i).setItemRemainQty(99999);
			}
			if(searchProdAll.get(i).getReserveyn() == 'Y'){
				if(searchProdAll.get(i).getOdtype().equals("11")){
					searchProdAll.get(i).setOdtype("12");
				} else {
					if(searchProdAll.get(i).getDeliverydtyn() == 'Y'){
						searchProdAll.get(i).setOdtype("02");
					}
				}
			}
		}

		return searchProdAll;
	}

	@Override
	public Map<String, Object> getNewItemListPaging(Map<String, Object> paramMap){
		paramMap.put("intPagePerItem", 20);

		return categoryDao.getNewItemListPaging(paramMap);
	}

	@Override
	public List<GdMasterEx> getNewItemListStatistics(Map<String, Object> paramMap) {

		return categoryDao.getNewItemListStatistics(paramMap);
	}

	@Override
	public Map<String, Object> setListPaging(Map<String, Object> paramMap) {
		String[] isenseExceptProduct = {"B11", "B12", "B13", "B14"};
		paramMap.put("isenseExceptProduct", isenseExceptProduct);
		return categoryDao.setListPaging(paramMap);
	}

	@Override
	public List<GdMasterEx> setProdList(Map<String, Object> paramMap) {
		String[] isenseExceptProduct = {"B11", "B12", "B13", "B14"};
		paramMap.put("isenseExceptProduct", isenseExceptProduct);
		return categoryDao.setProdList(paramMap);
	}

	@Override
	public Map<String, Object> getSpecialSellingBrandListPaging(Map<String, Object> paramMap) {
		paramMap.put("intPagePerItem", 30);
		return categoryDao.getSpecialSellingBrandListPaging(paramMap);
	}

	@Override
	public List<SpecialSellingh> getSpecialSellingBrandHeader(Map<String, Object> paramMap) {
		String strMEMGRPCD = (String) paramMap.get("strMEMGRPCD");
		String strLoginMemCd = (String)paramMap.get("strLoginMemCd");
		String grpcd;

		List<SpecialSellingh> getSpecialSellingBrandHeader = categoryDao.getSpecialSellingBrandHeader(paramMap);

		for(int i = 0; i < getSpecialSellingBrandHeader.size(); i++) {
			grpcd = getSpecialSellingBrandHeader.get(i).getGrpcd();

			if(grpcd != null && grpcd.isEmpty()) {
				if(!grpcd.equals(strMEMGRPCD)) {
					getSpecialSellingBrandHeader.get(i).setXflag(true);
				}
				if(grpcd.equals("SKCH")
				   && strMEMGRPCD != null
				   && !strMEMGRPCD.isEmpty()
				   && strMEMGRPCD.indexOf("SK_CHEMICALS") > 0) {
					getSpecialSellingBrandHeader.get(i).setXflag(true);
				}
				if(grpcd.equals("02")
				   && strMEMGRPCD != null
				   && !strMEMGRPCD.isEmpty()
				   && strMEMGRPCD.indexOf("SK_EC") > 0) {
					getSpecialSellingBrandHeader.get(i).setXflag(true);
				}
				if(grpcd.equals("SKHY")
				   && strMEMGRPCD != null
				   && !strMEMGRPCD.isEmpty()
				   && grpcd.indexOf("SK_HYNIXES") > 0){
					getSpecialSellingBrandHeader.get(i).setXflag(true);
				}
				if(grpcd.equals("31")
				   && strMEMGRPCD != null
				   && !strMEMGRPCD.isEmpty()
				   && strMEMGRPCD.indexOf("SK_PLANET") > 0) {
					getSpecialSellingBrandHeader.get(i).setXflag(true);
				}
			}
		}
		String[] whiteListMemCd = {  "I0006074", "I0007404", "I1008267"
				                   , "I1041799", "I1032425", "I1000675"
				                   , "I1008121", "I1048759", "I1052648"
				                   , "I1047006", "I1052177", "I1049552" };
		for(int i = 0; i < whiteListMemCd.length; i++) {
			if(strLoginMemCd.equals(whiteListMemCd[i])){
				getSpecialSellingBrandHeader.get(i).setXflag(true);
			}
		}

		return getSpecialSellingBrandHeader;
	}

	@Override
	public List<GdMasterEx> searchReserveProdDetail(Map<String, Object> paramMap){

		return categoryDao.searchReserveProdDetail(paramMap);
	}

	@Override
	public List<Map<String, Object>> setItemInfoOnlySetProd(Map<String, Object> paramMap) {
		return categoryDao.setItemInfoOnlySetProd(paramMap);
	}

	@Override
	public List<GdMasterEx> optionProductViewYn(Map<String, Object> paramMap) {
		return categoryDao.optionProductViewYn(paramMap);
	}

	@Override
	public String testPathInfo(String strTestidx){
		return categoryDao.testPathInfo(strTestidx);
	}

	@Override
	public List<GdSugar> fruitsSugarInfo(String strGdcd) {
		return categoryDao.fruitsSugarInfo(strGdcd);
	}

	@Override
	public List<String> defProdInfoList(String strGdcd) {
		return categoryDao.defProdInfoList(strGdcd);
	}

	@Override
	public List<GdPipnRef> defProdInfoListNew(String strGdcd){
		return categoryDao.defProdInfoListNew(strGdcd);
	}

	@Override
	public List<GdMasterEx> itemDetailBar(Map<String, Object> paramMap){
		return categoryDao.itemDetailBar(paramMap);
	}

	@Override
	public List<GdMasterEx> itemDetailBarSetItem(Map<String, Object> paramMap) {
		return categoryDao.itemDetailBarSetItem(paramMap);
	}

	@Override
	public List<GdMasterEx> itemDetailBarOptionYN(Map<String, Object> paramMap) {
		return categoryDao.itemDetailBarOptionYN(paramMap);
	}

	@Override
	public String itemDetailBarTestPathInfo(Map<String, Object> paramMap) {
		return categoryDao.itemDetailBarTestPathInfo(paramMap);
	}

	@Override
	public List<GdSugar> itemBarDetailFruitsSugarInfo(Map<String, Object> paramMap) {
		return categoryDao.itemBarDetailFruitsSugarInfo(paramMap);
	}
	@Override
	public List<GdPipn> itemBarDetailBasicInfoNew(Map<String, Object> paramMap) {
		return categoryDao.itemBarDetailBasicInfoNew(paramMap);
	}
}
