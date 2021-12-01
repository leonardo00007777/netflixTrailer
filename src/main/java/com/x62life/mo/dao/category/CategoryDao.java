package com.x62life.mo.dao.category;

import java.util.List;
import java.util.Map;

import com.x62life.mo.model.category.CartRecipe;
import com.x62life.mo.model.category.CartRecipeEx;
import com.x62life.mo.model.category.SubCategory;
import com.x62life.mo.model.order.OdReserveGoodsEx;
import com.x62life.mo.model.product.BasicTagMap;
import com.x62life.mo.model.product.GdMasterEx;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.x62life.mo.model.category.Category;

@Repository("categoryDao")
public interface CategoryDao {

	
	List<Category> getCategoryList(Map<String, Object> paramMap);

	List<SubCategory> getItemList(Map<String, Object> paramMap);

	Map<String, Object> getReserveItemListPaging(Map<String, Object> paramMap);

	List<OdReserveGoodsEx> getReserveItemList(Map<String, Object> paramMap);

	Map<String, Object> getItemListPaging(Map<String, Object> paramMap);

	List<GdMasterEx> getItemListSearch(Map<String, Object> paramMap);

	List<CartRecipe> custSetTitle(Map<String, Object> paramMap);

	void visitorCnt(Map<String, Object> paramMap);

//	List<BasicTagMap> getTagList(Map<String, Object> paramMap);

	List<CartRecipeEx> getCartRecipeProdList(Map<String, Object> paramMap);

	Map<String, Object> custSetListPaging(Map<String, Object> paramMap);

	List<CartRecipeEx> custSetProdList(Map<String, Object> paramMap);

	List<CartRecipeEx> custSetGoodsList(Map<String, Object> paramMap);

	List<GdMasterEx> defProdOneProd(Map<String, Object> paramMap);

	Map<String,Object> discountListAddSetProdPaging(Map<String, Object> paramMap);

	List<GdMasterEx> discountProdListAddSetProd(Map<String, Object> paramMap);

	Map<String, Object> getDirectListPaging(Map<String, Object> paramMap);

	List<OdReserveGoodsEx> getDirectListHeader(Map<String, Object> paramMap);

	int targetDate(String date);

	List<String> isenseFilteringProdGdcd(Map<String, Object> paramMap);

	List<GdMasterEx> isenseBestProd(Map<String, Object> paramMap);

	int itemListPaging(Map<String, Object> paramMap);

	List<String> getItemListSubmenu(Map<String, Object> paramMap);

	List<GdMasterEx> searchProdAll(Map<String, Object> paramMap);

	Map<String,Object> getNewItemListPaging(Map<String, Object> paramMap);

	List<GdMasterEx> getNewItemListStatistics(Map<String, Object> paramMap);

	Map<String, Object> setListPaging(Map<String, Object> paramMap);

	List<GdMasterEx> setProdList(Map<String, Object> paramMap);
}
