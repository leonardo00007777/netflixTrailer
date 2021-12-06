package com.x62life.mo.model.customer;


import org.apache.ibatis.type.Alias;

@Alias("isUsableEmailID")
public class IsUsableEmailID {

	private String resultCode;
	private String resultMessage;
	
	public String getResultCode() {
		return resultCode;
	}


	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}


	public String getResultMessage() {
		return resultMessage;
	}


	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
}
