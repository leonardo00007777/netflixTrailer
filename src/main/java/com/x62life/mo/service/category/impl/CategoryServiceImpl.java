package com.x62life.mo.service.category.impl;

import com.x62life.mo.dao.category.CategoryDao;
import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.model.product.GdPipn;
import com.x62life.mo.model.product.GdPipnRef;
import com.x62life.mo.model.product.GdSugar;
import com.x62life.mo.service.category.CategoryService;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.*;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{
	
	@Resource(name="categoryDao")
	private CategoryDao categoryDao;

	@Override
	public List<GdMasterEx> categoryList(Map<String, Object> paramMap){
		return categoryDao.categoryList(paramMap);
	}

	@Override
	public String categoryDesc(Map<String, Object> paramMap){
		return categoryDao.categoryDesc(paramMap);
	}

	@Override
	public int prodListPaging(Map<String, Object> paramMap){
		return categoryDao.prodListPaging(paramMap);
	}

	@Override
	public List<GdMasterEx> prodListAll(Map<String, Object> paramMap){
		int intPagePeritem = 30;
		paramMap.put("intPagePerItem", intPagePeritem);

		if(paramMap.get("intPage") == null || (int)paramMap.get("intPage") == 0){
			paramMap.put("intPage", 1);

		}

		int intPageOffset = ((int)paramMap.get("intPage") - 1) * (int)paramMap.get("intPagePerItem");

		paramMap.put("intPageOffset", intPageOffset);

		return categoryDao.prodListAll(paramMap);
	}

	@Override
	public List<GdMasterEx> itemDetail(Map<String, Object> paramMap) throws IOException, SQLException {
		List<GdMasterEx> itemDetail = categoryDao.itemDetail(paramMap);

		for(int i = 0; i < itemDetail.size(); i++){
			itemDetail.get(i).setExplain(itemDetail.get(i).getExplain().replaceAll("src=\"/userfiles", "src=\"/resources/images/userfiles"));
		}

		return itemDetail;
	}

	@Override
	public List<Map<String, Object>> itemDetailSetProdConfiguration(Map<String, Object> paramMap){
		return categoryDao.itemDetailSetProdConfiguration(paramMap);
	}

	@Override
	public Map<String, Object> itemDlvDeadlineMsg(Map<String, Object> paramMap) {
		return categoryDao.itemDlvDeadlineMsg(paramMap);
	}


	@Override
	public List<GdSugar> fruitsSugarInfo(String strGDCD) {
		return categoryDao.fruitsSugarInfo(strGDCD);
	}

	@Override
	public String basicDetailInfo(String strGDCD) {
		return categoryDao.basicDetailInfo(strGDCD);
	}

	@Override
	public List<GdPipnRef> usePpCode(String strGDCD) {
		return categoryDao.usePpCode(strGDCD);
	}

	@Override
	public Map<String, Object> getCartOrderType(String strGDCD){
		return categoryDao.getCartOrderType(strGDCD);
	}

	@Override
	public String isRightAwayEnableDay(String datex) {
		return categoryDao.isRightAwayEnableDay(datex);
	}

	@Override
	public String radiationTestInfo(String testidx){
		return categoryDao.radiationTestInfo(testidx);
	}
}
