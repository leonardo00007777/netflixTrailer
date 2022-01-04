package com.x62life.mo.dao.mypage;


import java.util.Map;

import com.x62life.mo.model.mypage.Mypage;


public interface MypageDao {
	
	public Map<String, Object> mypageOrdList(Map<String, Object> paramMap);
	public Mypage mypageLevelInfo(Map<String,Object> paramMap);
	public Mypage mypageRemainPointInfo(Map<String,Object> paramMap);
	public Map<String, Object> enableCouponCntAjax(Map<String, Object> paramMap);
	public Map<String, Object> expireCouponCntAjax(Map<String, Object> paramMap);
}
