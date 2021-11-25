package com.x62life.mo.service.impl;

import com.x62life.mo.dao.CommonDao;
import com.x62life.mo.model.category.Category;
import com.x62life.mo.service.CommonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("CommonService")
public class CommonServiceImpl implements CommonService {
    @Resource
    CommonDao commonDao;

    @Override
    public List<Map<String, Object>> commonList() {
        List<Map<String, Object>> testList = commonDao.getSearchRank();
        return testList;
    }
    @Override
    public List<Map<String, Object>> cList() {
        List<Map<String, Object>> categoryList = commonDao.getCategoryList();
        return categoryList;
    }
}
