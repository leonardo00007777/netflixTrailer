package com.x62life.mo.service.category.impl;

import com.x62life.mo.dao.category.CategoryDao;
import com.x62life.mo.service.category.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{
	
	@Resource(name="categoryDao")
	private CategoryDao categoryDao;

}
