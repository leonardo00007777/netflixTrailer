package com.x62life.mo.model.payment;

import org.apache.ibatis.type.Alias;

@Alias("odRelation")
//결제 주문 연관정보
public class OdRelation {
    private char paynum; //결제번호
    private char ordnum; // 주문번호

    public char getPaynum() {
        return paynum;
    }

    public void setPaynum(char paynum) {
        this.paynum = paynum;
    }

    public char getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(char ordnum) {
        this.ordnum = ordnum;
    }
}
