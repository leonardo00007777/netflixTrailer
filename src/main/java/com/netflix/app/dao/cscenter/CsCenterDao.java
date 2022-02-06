package com.netflix.app.dao.cscenter;

import com.netflix.app.model.boardcontents.BdFaq;
import com.netflix.app.model.boardcontents.BdNotice;
import com.netflix.app.model.boardcontents.BdNoticeEx;
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
