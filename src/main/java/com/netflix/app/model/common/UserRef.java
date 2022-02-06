package com.netflix.app.model.common;

import java.io.Serializable;
import java.util.List;

public class UserRef implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4512264820153491630L;

	private long userseqno;
	
	private String email_address;
	
	private String first_name;
	
	private String last_name;
	
	private String user_type;
	
	private String login_name;
	
	private String division_name;
	
	private List<Code> divisions;
	
	private String company_code;
	
	private String company_name;
	
	private String status;

	private String password;
	
	private String new_password;
	
	private String new_password_confirm;

	private int login_fail_count;
	
	private String inactive_flag;
	
	private String passwd_reset_needed;
	
	public long getUserseqno() {
		return userseqno;
	}

	public void setUserseqno(long userseqno) {
		this.userseqno = userseqno;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getDivision_name() {
		return division_name;
	}

	public void setDivision_name(String division_name) {
		this.division_name = division_name;
	}

	public List<Code> getDivisions() {
		return divisions;
	}

	public void setDivisions(List<Code> divisions) {
		this.divisions = divisions;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany_code() {
		return company_code;
	}

	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}

	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}

	public String getNew_password_confirm() {
		return new_password_confirm;
	}

	public void setNew_password_confirm(String new_password_confirm) {
		this.new_password_confirm = new_password_confirm;
	}

	public int getLogin_fail_count() {
		return login_fail_count;
	}

	public void setLogin_fail_count(int login_fail_count) {
		this.login_fail_count = login_fail_count;
	}
	
	public String getInactive_flag() {
		return inactive_flag;
	}

	public void setInactive_flag(String inactive_flag) {
		this.inactive_flag = inactive_flag;
	}

	public String getPasswd_reset_needed() {
		return passwd_reset_needed;
	}

	public void setPasswd_reset_needed(String passwd_reset_needed) {
		this.passwd_reset_needed = passwd_reset_needed;
	}

	

	
}
