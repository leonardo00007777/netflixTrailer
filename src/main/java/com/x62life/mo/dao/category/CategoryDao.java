package com.x62life.mo.dao.category;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.x62life.mo.model.category.Category;

@Repository("categoryDao")
public interface CategoryDao {

	
	List<Category> getCategoryList(Map<String, Object> paramMap);
	
	
}
