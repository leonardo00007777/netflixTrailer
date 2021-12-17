package com.x62life.mo.model.payment;

//주문 자동결제
/*@Alias("odAutoPay")*/
public class OdAutoPay {
    private String memcd; //회원코드
    private int autoidx; //자동주문결제일련번호
    private String paynum; //결제번호
    private int ptnidx; //패턴일련번호

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

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public int getPtnidx() {
        return ptnidx;
    }

    public void setPtnidx(int ptnidx) {
        this.ptnidx = ptnidx;
    }
}
