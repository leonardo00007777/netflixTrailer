package com.x62life.mo.service.common;

import com.x62life.mo.model.category.Category;
import com.x62life.mo.model.member.MbMaster;

import java.util.List;
import java.util.Map;

public interface CommonService {
   public List<Map<String, Object>> getSearchRank(String periodDay);

}
