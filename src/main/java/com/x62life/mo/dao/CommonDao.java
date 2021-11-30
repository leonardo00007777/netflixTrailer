package com.x62life.mo.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("commonDao")
public interface CommonDao {
    List<Map<String, Object>> getSearchRank(String periodDay);
}
