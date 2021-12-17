package com.x62life.mo.dao.category;

import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.model.product.GdPipn;
import com.x62life.mo.model.product.GdSugar;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("categoryDao")
public interface CategoryDao {
    List<GdMasterEx> categoryList(Map<String, Object> paramMap);

    String categoryDesc(Map<String, Object> paramMap);

    int prodListPaging(Map<String, Object> paramMap);

    List<GdMasterEx> prodListAll(Map<String, Object> paramMap);

    List<GdMasterEx> itemDetail(Map<String, Object> paramMap);

    List<Map<String, Object>> itemDetailSetProdConfiguration(Map<String, Object> paramMap);

    Map<String, Object> itemDlvDeadlineMsg(Map<String, Object> paramMap);

    List<GdSugar> fruitsSugarInfo(String strGDCD);

    List<GdPipn> basicDetailInfo(String strGDCD);

    List<GdPipn> usePpCode(String strGDCD);

    Map<String, Object> getCartOrderType(String gdcd);

    String isRightAwayEnableDay(String datex);

    String radiationTestInfo(String testidx);
}
