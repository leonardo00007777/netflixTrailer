package com.x62life.mo.service.impl.cscenter;

import com.x62life.mo.dao.cscenter.CsCenterDao;
import com.x62life.mo.model.boardcontents.BdFaq;
import com.x62life.mo.model.boardcontents.BdNotice;
import com.x62life.mo.model.boardcontents.BdNoticeEx;
import com.x62life.mo.service.cscenter.CsCenterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("CsCenterService")
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
