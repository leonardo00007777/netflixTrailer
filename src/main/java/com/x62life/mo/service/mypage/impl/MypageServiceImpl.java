package com.x62life.mo.service.mypage.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x62life.mo.dao.mypage.MypageDao;
import com.x62life.mo.model.mypage.Mypage;
import com.x62life.mo.service.mypage.MypageService;

@Service("mypageService")
public class MypageServiceImpl implements MypageService {

	@Autowired
	private MypageDao mypageDao;

	@Override
	public Map<String, Object> mypageOrdList(Map<String, Object> paramMap) {
		return mypageDao.mypageOrdList(paramMap);
	}
	
	@Override
	public Mypage mypageLevelInfo(Map<String,Object> paramMap) {
		Mypage mypageLevelInfo = mypageDao.mypageLevelInfo(paramMap);
		return mypageLevelInfo;
	}
	
	@Override
	public Mypage mypageRemainPointInfo(Map<String,Object> paramMap) {
		Mypage mypageRemainPointInfo = mypageDao.mypageRemainPointInfo(paramMap);
		return mypageRemainPointInfo;
	}
	
	@Override
	public Map<String, Object> enableCouponCntAjax(Map<String, Object> paramMap) {
		return mypageDao.enableCouponCntAjax(paramMap);
	}
	
	@Override
	public Map<String, Object> expireCouponCntAjax(Map<String, Object> paramMap) {
		return mypageDao.expireCouponCntAjax(paramMap);
	}
	
}
