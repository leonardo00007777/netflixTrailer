package com.x62life.mo.service.category;

import java.util.List;
import java.util.Map;

import com.x62life.mo.model.category.CartRecipe;
import com.x62life.mo.model.category.CartRecipeEx;
import com.x62life.mo.model.category.Category;
import com.x62life.mo.model.category.SubCategory;
import com.x62life.mo.model.order.OdReserveGoodsEx;
import com.x62life.mo.model.product.BasicTagMap;
import com.x62life.mo.model.product.GdMasterEx;

public interface CategoryService {

	List<Category> getCategoryList(Map<String, Object> paramMap);

	List<SubCategory> getSubCategoryList(Map<String, Object> paramMap);

	Map<String, Object> getReserveItemListPaging(Map<String, Object> paramMap);

	List<OdReserveGoodsEx> reserveGoodsList(Map<String, Object> paramMap);

	Map<String,Object> itemListPagingMap(Map<String, Object> paramMap);

	List<GdMasterEx> allItemList(Map<String, Object> paramMap);

	List<CartRecipe> cartRecipeTitle(int hseqno);

	void visitorCnt(int hseqno);

	List<BasicTagMap> tagList(Map<String, Object> paramMap);

	List<CartRecipeEx> cartRecipeProdList(int hseqno);

	Map<String, Object> custSetListPaging(Map<String, Object> paramMap);

	List<CartRecipeEx> custSetProdList(Map<String, Object> paramMap);

	List<CartRecipeEx> custSetGoodsList(Map<String, Object> paramMap);

	List<GdMasterEx> defProdOneProd(Map<String, Object> paramMap);

	Map<String, Object> discountListPaging(Map<String, Object> paramMap);

	List<GdMasterEx> discountProdList(Map<String, Object> paramMap);
}
