package com.x62life.mo.dao.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("commonDao")
public interface CommonDao {
    List<Map<String, Object>> getSearchRank(String periodDay);
}
