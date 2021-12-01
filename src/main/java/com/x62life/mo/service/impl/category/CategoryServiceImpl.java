package com.x62life.mo.service.impl.category;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.x62life.mo.model.category.CartRecipe;
import com.x62life.mo.model.category.CartRecipeEx;
import com.x62life.mo.model.category.SubCategory;
import com.x62life.mo.model.order.OdReserveGoodsEx;
import com.x62life.mo.model.product.BasicTagMap;
import com.x62life.mo.model.product.GdMasterEx;
import org.springframework.stereotype.Service;

import com.x62life.mo.dao.category.CategoryDao;
import com.x62life.mo.model.category.Category;
import com.x62life.mo.service.category.CategoryService;

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
	public List<GdMasterEx> defProdOneProd(Map<String, Object> paramMap){
		return categoryDao.defProdOneProd(paramMap);
	}

	@Override
	public Map<String, Object> discountListPaging(Map<String, Object> paramMap) {
		return categoryDao.discountListAddSetProdPaging(paramMap);
	}

	@Override
	public List<GdMasterEx> discountProdList(Map<String, Object> paramMap){
		return categoryDao.discountProdListAddSetProd(paramMap);
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
		return categoryDao.searchProdAll(paramMap);
	}
}
