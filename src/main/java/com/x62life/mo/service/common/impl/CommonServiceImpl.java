package com.x62life.mo.service.common.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.x62life.mo.dao.common.CommonDao;
import com.x62life.mo.service.common.CommonService;

@Service("commonService")
public class CommonServiceImpl implements CommonService {

    @Resource
    CommonDao commonDao;

    @Override
    public List<Map<String, Object>> getSearchRank(String periodDay) {
        List<Map<String, Object>> searchRank = commonDao.getSearchRank(periodDay);
        return searchRank;
    }

}
