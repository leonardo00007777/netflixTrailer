package com.x62life.mo.service.category;

import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.model.product.GdPipn;
import com.x62life.mo.model.product.GdSugar;

import java.util.List;
import java.util.Map;

public interface CategoryService {

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

    Map<String, Object> getCartOrderType(String strGDCD);

    String isRightAwayEnableDay(String datex);

    String radiationTestInfo(String testidx);
}
