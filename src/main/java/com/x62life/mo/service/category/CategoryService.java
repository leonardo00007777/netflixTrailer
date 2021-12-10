package com.x62life.mo.service.category;

import com.x62life.mo.model.product.GdMasterEx;

import java.util.List;
import java.util.Map;

public interface CategoryService {

    List<GdMasterEx> categoryList(Map<String, Object> paramMap);

    String categoryDesc(Map<String, Object> paramMap);

    int prodListPaging(Map<String, Object> paramMap);

    List<GdMasterEx> prodListAll(Map<String, Object> paramMap);
}
