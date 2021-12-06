package com.x62life.mo.service;

import com.x62life.mo.dao.CommonDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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
