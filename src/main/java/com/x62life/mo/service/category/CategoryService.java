package com.x62life.mo.service.category;

import java.util.List;
import java.util.Map;

import com.x62life.mo.model.category.Category;
import com.x62life.mo.model.category.SubCategory;
import com.x62life.mo.model.order.OdReserveGoodsEx;
import com.x62life.mo.model.product.GdMasterEx;

public interface CategoryService {

	List<Category> getCategoryList(Map<String, Object> paramMap);

	List<SubCategory> getSubCategoryList(Map<String, Object> paramMap);

	Map<String, Object> getReserveItemListPaging(Map<String, Object> paramMap);

	List<OdReserveGoodsEx> reserveGoodsList(Map<String, Object> paramMap);

	Map<String,Object> itemListPagingMap(Map<String, Object> paramMap);

	List<GdMasterEx> allItemList(Map<String, Object> paramMap);
}
