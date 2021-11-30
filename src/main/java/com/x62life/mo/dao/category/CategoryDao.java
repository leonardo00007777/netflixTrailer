package com.x62life.mo.dao.category;

import java.util.List;
import java.util.Map;

import com.x62life.mo.model.category.SubCategory;
import com.x62life.mo.model.order.OdReserveGoodsEx;
import com.x62life.mo.model.product.GdMasterEx;
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
}
