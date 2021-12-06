package com.x62life.mo.model.order;

import org.apache.ibatis.type.Alias;

@Alias("odAutoGoods")
//자동주문 상품
public class OdAutoGoods {
    private char memcd; //회원코드
    private int autoidx; //자동주문결제일련번호
    private int seqidx; //자동주문상품일련번호
    private int ptnidx; //패턴일련번호
    private String gdcd; //상품코드

    public char getMemcd() {
        return memcd;
    }

    public void setMemcd(char memcd) {
        this.memcd = memcd;
    }

    public int getAutoidx() {
        return autoidx;
    }

    public void setAutoidx(int autoidx) {
        this.autoidx = autoidx;
    }

    public int getSeqidx() {
        return seqidx;
    }

    public void setSeqidx(int seqidx) {
        this.seqidx = seqidx;
    }

    public int getPtnidx() {
        return ptnidx;
    }

    public void setPtnidx(int ptnidx) {
        this.ptnidx = ptnidx;
    }

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }
}
