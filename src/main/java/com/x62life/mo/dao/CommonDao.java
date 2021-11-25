package com.x62life.mo.dao;

import com.x62life.mo.model.category.Category;

import java.util.List;
import java.util.Map;

public interface CommonDao {
    List<Map<String, Object>> getSearchRank();

    List<Map<String, Object>> getCategoryList();
}
