package com.netflix.app.service.mypage;

import java.util.Map;

import com.netflix.app.model.mypage.Mypage;

public interface MypageService {
	
	public Map<String, Object> mypageOrdList(Map<String, Object> paramMap);
	public Mypage mypageLevelInfo(Map<String,Object> paramMap);
	public Mypage mypageRemainPointInfo(Map<String,Object> paramMap);
	public Map<String, Object> enableCouponCntAjax(Map<String, Object> paramMap);
	public Map<String, Object> expireCouponCntAjax(Map<String, Object> paramMap);
}
