package com.x62life.mo.service.impl.category;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.x62life.mo.model.category.SubCategory;
import com.x62life.mo.model.order.OdReserveGoodsEx;
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
}
