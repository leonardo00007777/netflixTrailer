package com.x62life.mo.model.product;

import org.apache.ibatis.type.Alias;
@Alias("gdWeek")
public class GdWeek {
    private int gdyear; //년도
    private int gdweek; //배송주차
    private String gdcd; //대표세트상품코드
    private String sgdcd; //상품코드
    private int gdqty; //수량

    public int getGdyear() {
        return gdyear;
    }

    public void setGdyear(int gdyear) {
        this.gdyear = gdyear;
    }

    public int getGdweek() {
        return gdweek;
    }

    public void setGdweek(int gdweek) {
        this.gdweek = gdweek;
    }

    public String getSgdcd() {
        return sgdcd;
    }

    public void setSgdcd(String sgdcd) {
        this.sgdcd = sgdcd;
    }

    public int getGdqty() {
        return gdqty;
    }

    public void setGdqty(int gdqty) {
        this.gdqty = gdqty;
    }
}
