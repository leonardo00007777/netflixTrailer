package com.x62life.mo.model.common;

import java.io.Serializable;

public class SSOUser implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String userSeqNo;
	private String loginId;
	private String email;
	private String userName;
	private String userType;
	private String userType_name;
	private String passwd_reset_needed;
	
	public String getUserSeqNo() {
		return userSeqNo;
	}
	public void setUserSeqNo(String userSeqNo) {
		this.userSeqNo = userSeqNo;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserType_name() {
		return userType_name;
	}
	public void setUserType_name(String userType_name) {
		this.userType_name = userType_name;
	}
	public String getPasswd_reset_needed() {
		return passwd_reset_needed;
	}
	public void setPasswd_reset_needed(String passwd_reset_needed) {
		this.passwd_reset_needed = passwd_reset_needed;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("\n*******************************");
		sb.append("\n User Seq No = ").append(userSeqNo);
		sb.append("\n Login ID = ").append(loginId);
		sb.append("\n Email = ").append(email);
		sb.append("\n User Name = ").append(userName);
		sb.append("\n User Type = ").append(userType);
		sb.append("\n User Type Name = ").append(userType_name);
		sb.append("\n Password Reset Needed = ").append(passwd_reset_needed);
		sb.append("\n*******************************");
		
		return sb.toString();
	}

}
