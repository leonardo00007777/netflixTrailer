package com.netflix.app.model.payment;

/*@Alias("odRelation")*/
//결제 주문 연관정보
public class OdRelation {
    private String paynum; //결제번호
    private String ordnum; // 주문번호

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public String getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(String ordnum) {
        this.ordnum = ordnum;
    }
}
