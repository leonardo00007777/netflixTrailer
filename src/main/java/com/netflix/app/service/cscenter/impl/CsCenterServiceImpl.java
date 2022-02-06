package com.netflix.app.service.cscenter.impl;

import com.netflix.app.dao.cscenter.CsCenterDao;
import com.netflix.app.model.boardcontents.BdFaq;
import com.netflix.app.model.boardcontents.BdNotice;
import com.netflix.app.model.boardcontents.BdNoticeEx;
import com.netflix.app.service.cscenter.CsCenterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("csCenterService")
public class CsCenterServiceImpl implements CsCenterService {
    @Resource
    CsCenterDao csCenterDao;

    @Override
    public List<BdNotice> recentNoticeFiveList(){
        List<BdNotice> recentNoticeFiveList = csCenterDao.recentNoticeFive();
        return recentNoticeFiveList;
    }

    @Override
    public List<BdNoticeEx> recentNoticeTenList(String typeFaq) {
        List<BdNoticeEx> recentNoticeTenList = csCenterDao.recentNoticeTen(typeFaq);

        return recentNoticeTenList;
    }

    @Override
    public List<BdFaq> faqPaging(Map<String, Object> paramMap){
        List<BdFaq> faqPaging = csCenterDao.faqPaging(paramMap);
        return faqPaging;
    }

    @Override
    public List<BdFaq> faqList(Map<String, Object> paramMap){
        List<BdFaq> faqList = csCenterDao.faqList(paramMap);
        return faqList;
    }

    @Override
    public Map<String, Object> faqContent(){
        Map<String, Object> faqContent = csCenterDao.faqDetail();
        return faqContent;
    }
}
