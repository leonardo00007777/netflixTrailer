package com.netflix.app.dao.member;


import com.netflix.app.model.login.LoginProcess;
import com.netflix.app.model.member.MbMaster;

import java.util.List;
import java.util.Map;


public interface MemberDao {
	
	public boolean isValidMember(MbMaster member);
	public int checkMemberExists(MbMaster member);
	public  LoginProcess selectMemberInfo(Map<String,Object> paramMap);
	
	public int savePasswordFailCnt(Map<String,Object> paramMap);
	public int deleteOdCart(Map<String,Object> paramMap);
	public int deleteAfterSevenDays(Map<String,Object> paramMap);
	public int deleteReserveProdStopSelling(Map<String,Object> paramMap);
	public int unlockCartProd(Map<String,Object> paramMap);
	public int saveExistMemberLoginInfo(Map<String,Object> paramMap);
	public int saveNotExistLoginInfo(Map<String,Object> paramMap);
	public int saveLoginHistory(Map<String,Object> paramMap);
    	
	public int checkTwalkAccountInfo(Map<String,Object> paramMap);
	public int saveTwalkAccountInfo(Map<String,Object> paramMap);
	
	public Map<String, Object> loginPointAutoGrant(Map<String, Object> paramMap);
	public int pointGrantWithAuthority(Map<String,Object> paramMap);

	
	public   List<MbMaster> list(MbMaster member);
	public  void register(MbMaster member);
	public  void modify(MbMaster member);
	public  void modifyPassword(MbMaster member);
}
