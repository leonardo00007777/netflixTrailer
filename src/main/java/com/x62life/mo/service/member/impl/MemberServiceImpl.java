package com.x62life.mo.service.member.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x62life.mo.dao.login.LoginDao;
import com.x62life.mo.dao.member.MemberDao;
import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.model.member.MbMaster;
import com.x62life.mo.service.member.MemberService;

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
	public MbMaster selectMemberInfo(Map<String,Object> paramMap) {
		
		MbMaster memberInfo = memberDao.selectMemberInfo(paramMap);
		
		return memberInfo;
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
