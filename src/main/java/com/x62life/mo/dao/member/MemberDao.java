package com.x62life.mo.dao.member;


import java.util.List;
import java.util.Map;

import com.x62life.mo.model.member.MbMaster;


public interface MemberDao {
	
	public boolean isValidMember(MbMaster member);
	
	public int checkMemberExists(MbMaster member);

	public  MbMaster selectMemberInfo(Map<String,Object> paramMap);

	public   List<MbMaster> list(MbMaster member);

	public  void register(MbMaster member);
	
	public  void modify(MbMaster member);
	
	public  void modifyPassword(MbMaster member);
	
	

}
