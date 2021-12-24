package com.x62life.mo.service.category;

import com.x62life.mo.model.product.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CategoryService {

    List<GdMasterEx> categoryList(Map<String, Object> paramMap);

    String categoryDesc(Map<String, Object> paramMap);

    int prodListPaging(Map<String, Object> paramMap);

    List<GdMasterEx> prodListAll(Map<String, Object> paramMap);

    List<GdMasterEx> itemDetail(Map<String, Object> paramMap) throws SQLException, IOException;

    List<Map<String, Object>> setItemDetailConfiguration(Map<String, Object> paramMap);

    Map<String, Object> itemDlvDeadlineMsg(Map<String, Object> paramMap);

    List<GdSugar> fruitsSugarInfo(String strGDCD);

    String basicDetailInfo(String strGDCD);

    List<GdPipnRef> usePpCode(String strGDCD);

    Map<String, Object> getCartOrderType(String strGDCD);

    String isRightAwayEnableDay(String datex);

    String radiationTestInfo(String testidx);

    Map<String, Object> prodReviewPaging(Map<String, Object> paramMap);

    List<ProductReviewEx> prodReviewDetail(Map<String, Object> paramMap);

    String getGoodsWeek(Map<String, Object> paramMap);

    String getGoodsYear(Map<String, Object> paramMap);

    Map<String, Object> getDLVDTbyHolidayGeneral(String dteToday);
}
