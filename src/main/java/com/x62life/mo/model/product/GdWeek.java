package com.x62life.mo.model.product;

import java.math.BigDecimal;

public class GdWeek {
    private BigDecimal gdyear; //년도
    private	BigDecimal	gdweek; //배송주차
    private	String	gdcd; //대표세트상품코드
    private	String	sgdcd; //상품코드
    private	BigDecimal	gdqty; //수량

    public BigDecimal getGdyear() {
        return gdyear;
    }

    public void setGdyear(BigDecimal gdyear) {
        this.gdyear = gdyear;
    }

    public BigDecimal getGdweek() {
        return gdweek;
    }

    public void setGdweek(BigDecimal gdweek) {
        this.gdweek = gdweek;
    }

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public String getSgdcd() {
        return sgdcd;
    }

    public void setSgdcd(String sgdcd) {
        this.sgdcd = sgdcd;
    }

    public BigDecimal getGdqty() {
        return gdqty;
    }

    public void setGdqty(BigDecimal gdqty) {
        this.gdqty = gdqty;
    }
}
