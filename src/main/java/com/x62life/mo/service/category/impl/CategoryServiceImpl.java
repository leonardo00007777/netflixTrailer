package com.x62life.mo.service.category.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.x62life.mo.dao.category.CategoryDao;
import com.x62life.mo.model.category.Category;
import com.x62life.mo.service.category.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	
	@Resource(name="categoryDao")
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> getCategoryList(Map<String, Object> paramMap) {
		return categoryDao.getCategoryList(paramMap);
	}


}
