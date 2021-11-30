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
}
