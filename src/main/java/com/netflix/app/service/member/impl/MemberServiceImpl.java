package com.netflix.app.service.member.impl;

import com.netflix.app.dao.member.MemberDao;
import com.netflix.app.model.login.LoginProcess;
import com.netflix.app.model.member.MbMaster;
import com.netflix.app.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;

	@Override
	public boolean isValidMember(MbMaster member){
		int count = memberDao.checkMemberExists(member);
		return ( count > 0 ? true : false);
	}

	@Override
	public LoginProcess selectMemberInfo(Map<String,Object> paramMap) {
		
		LoginProcess memberInfo = memberDao.selectMemberInfo(paramMap);
		
		return memberInfo;
	}
	
	@Override
	public int savePasswordFailCnt(Map<String,Object> paramMap) {
		int count = memberDao.savePasswordFailCnt(paramMap);
		return count;
	}
	@Override
	public int deleteOdCart(Map<String,Object> paramMap) {
		int count = memberDao.deleteOdCart(paramMap);
		return count;
	}
	@Override
	public int deleteAfterSevenDays(Map<String,Object> paramMap) {
		int count = memberDao.deleteAfterSevenDays(paramMap);
		return count;
	}
	@Override
	public int deleteReserveProdStopSelling(Map<String,Object> paramMap) {
		int count = memberDao.deleteReserveProdStopSelling(paramMap);
		return count;
	}
	@Override
	public int unlockCartProd(Map<String,Object> paramMap) {
		int count = memberDao.unlockCartProd(paramMap);
		return count;
	}
	@Override
	public int saveExistMemberLoginInfo(Map<String,Object> paramMap) {
		int count = memberDao.saveExistMemberLoginInfo(paramMap);
		return count;
	}
	@Override
	public int saveNotExistLoginInfo(Map<String,Object> paramMap) {
		int count = memberDao.saveNotExistLoginInfo(paramMap);
		return count;
	}
	@Override
	public int saveLoginHistory(Map<String,Object> paramMap) {
		int count = memberDao.saveLoginHistory(paramMap);
		return count;
	}
	@Override
	public int checkTwalkAccountInfo(Map<String,Object> paramMap) {
		int count = memberDao.checkTwalkAccountInfo(paramMap);
		return count;
	}
	@Override
	public int saveTwalkAccountInfo(Map<String,Object> paramMap) {
		int count = memberDao.saveTwalkAccountInfo(paramMap);
		return count;
	}
	@Override
	public Map<String, Object> loginPointAutoGrant(Map<String, Object> paramMap) {
		return memberDao.loginPointAutoGrant(paramMap);
	}
	@Override
	public int pointGrantWithAuthority(Map<String,Object> paramMap) {
		int count = memberDao.pointGrantWithAuthority(paramMap);
		return count;
	}
	
	
	@Override
	public List<MbMaster> list(MbMaster member) {
        List<MbMaster> list = memberDao.list(member);
		return list;
	}

	@Override
	public void register(MbMaster member) {
		memberDao.register(member);
	}

	@Override
	public void modify(MbMaster member) {
		memberDao.modify(member);
	}

	@Override
	public void modifyPassword(MbMaster member) {
		memberDao.modifyPassword(member);
	}

	@Override
	public MbMaster getMember(MbMaster member) {
		MbMaster memberInfo = ((MemberService) memberDao).getMember(member);
		return memberInfo;
	}	
}
