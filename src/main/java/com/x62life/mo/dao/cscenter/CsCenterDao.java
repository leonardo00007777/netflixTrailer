package com.x62life.mo.dao.cscenter;

import com.x62life.mo.model.boardcontents.BdFaq;
import com.x62life.mo.model.boardcontents.BdNotice;
import com.x62life.mo.model.boardcontents.BdNoticeEx;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CsCenterDao {
    List<BdNotice> recentNoticeFive();

    List<BdNoticeEx> recentNoticeTen(String typeFaq);

    List<BdFaq> faqPaging(Map<String,Object> paramMap);

    List<BdFaq> faqList(Map<String, Object> paramMap);

    Map<String, Object> faqDetail();
}
