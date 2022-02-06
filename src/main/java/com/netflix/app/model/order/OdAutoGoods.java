package com.netflix.app.model.order;

/*@Alias("odAutoGoods")*/
//자동주문 상품
public class OdAutoGoods {
    private String memcd; //회원코드
    private int autoidx; //자동주문결제일련번호
    private int seqidx; //자동주문상품일련번호
    private int ptnidx; //패턴일련번호
    private String gdcd; //상품코드

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
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
