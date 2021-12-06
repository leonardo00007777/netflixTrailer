package com.x62life.mo.model.product;

import org.apache.ibatis.type.Alias;

//주간 상품 변경 정보
@Alias("gdConvertWeek")
public class GdConvertWeek {
    private String gdcd;
    private int gdyear;
    private int gdweek;
    private char goodsno;
    private String goodsday;
    private String goodscount;
    private String goodsendday;
    private String goodsplanday;

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

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

    public char getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(char goodsno) {
        this.goodsno = goodsno;
    }

    public String getGoodsday() {
        return goodsday;
    }

    public void setGoodsday(String goodsday) {
        this.goodsday = goodsday;
    }

    public String getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(String goodscount) {
        this.goodscount = goodscount;
    }

    public String getGoodsendday() {
        return goodsendday;
    }

    public void setGoodsendday(String goodsendday) {
        this.goodsendday = goodsendday;
    }

    public String getGoodsplanday() {
        return goodsplanday;
    }

    public void setGoodsplanday(String goodsplanday) {
        this.goodsplanday = goodsplanday;
    }
}
