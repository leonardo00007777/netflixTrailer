package com.x62life.mo.model.payment;
//주문 자동결제
public class OdAutoPay {
    private char memcd; //회원코드
    private int autoidx; //자동주문결제일련번호
    private char paynum; //결제번호
    private int ptnidx; //패턴일련번호

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

    public char getPaynum() {
        return paynum;
    }

    public void setPaynum(char paynum) {
        this.paynum = paynum;
    }

    public int getPtnidx() {
        return ptnidx;
    }

    public void setPtnidx(int ptnidx) {
        this.ptnidx = ptnidx;
    }
}
