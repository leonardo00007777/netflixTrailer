package com.x62life.mo.service.impl;

import com.x62life.mo.dao.CommonDao;
import com.x62life.mo.model.category.Category;
import com.x62life.mo.model.member.MbMaster;
import com.x62life.mo.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
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
