package com.x62life.mo.service;

import java.util.List;
import java.util.Map;

import com.x62life.mo.model.category.Category;

public interface CategoryService {

	List<Category> getCategoryList(Map<String, Object> paramMap);	
}
