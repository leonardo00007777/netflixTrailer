package com.netflix.app.service.cscenter;

import com.netflix.app.model.boardcontents.BdFaq;
import com.netflix.app.model.boardcontents.BdNotice;
import com.netflix.app.model.boardcontents.BdNoticeEx;

import java.util.List;
import java.util.Map;

public interface CsCenterService {
    List<BdNotice> recentNoticeFiveList();

    List<BdNoticeEx> recentNoticeTenList(String typeFaq);

    List<BdFaq> faqPaging(Map<String, Object> paramMap);

    List<BdFaq> faqList(Map<String, Object> paramMap);

    Map<String, Object> faqContent();
}
