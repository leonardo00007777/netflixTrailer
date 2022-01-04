package com.x62life.mo.model.mypage;

import com.x62life.mo.model.payment.OdPay;

/*@Alias("mypage")*/
// Mypage 정보
public class Mypage  extends OdPay {
	
	private String ordered;
	private String indelivery;
	private String lastmonthttl;
	private String thismonthttl;

	public String getOrdered() {
		return ordered;
	}
	public void setOrdered(String ordered) {
		this.ordered = ordered;
	}
	public String getIndelivery() {
		return indelivery;
	}
	public void setIndelivery(String indelivery) {
		this.indelivery = indelivery;
	}
	public String getLastmonthttl() {
		return lastmonthttl;
	}
	public void setLastmonthttl(String lastmonthttl) {
		this.lastmonthttl = lastmonthttl;
	}
	public String getThismonthttl() {
		return thismonthttl;
	}
	public void setThismonthttl(String thismonthttl) {
		this.thismonthttl = thismonthttl;
	}
}
