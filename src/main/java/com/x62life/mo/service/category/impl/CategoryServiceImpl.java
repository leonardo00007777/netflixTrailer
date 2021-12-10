package com.x62life.mo.service.category.impl;

import com.x62life.mo.dao.category.CategoryDao;
import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.service.category.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{
	
	@Resource(name="categoryDao")
	private CategoryDao categoryDao;

	public List<GdMasterEx> categoryList(Map<String, Object> paramMap){
		return categoryDao.categoryList(paramMap);
	}

	public String categoryDesc(Map<String, Object> paramMap){
		return categoryDao.categoryDesc(paramMap);
	}

	public int prodListPaging(Map<String, Object> paramMap){
		return categoryDao.prodListPaging(paramMap);
	}

	public List<GdMasterEx> prodListAll(Map<String, Object> paramMap){
		return categoryDao.prodListAll(paramMap);
	}
}
