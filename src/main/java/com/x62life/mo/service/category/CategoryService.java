package com.x62life.mo.service.category;

import java.util.List;
import java.util.Map;

import com.x62life.mo.model.category.Category;
import com.x62life.mo.model.exhibition.OneDaySpecialEx;

public interface CategoryService {

	List<Category> getCategoryList(Map<String, Object> paramMap);


}
