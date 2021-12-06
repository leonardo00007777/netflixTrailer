package com.x62life.mo.model.payment;

import org.apache.ibatis.type.Alias;

//주문 카드 정보
@Alias("odCard")
public class OdCard {
    private String paynum; //결제번호
    private short payidx; //결제카드 일련번호
    private char authyn; //승인여부
    private String trno; //트랜잭션번호
    private char trdt; //트랜잭션일자
    private char trtm; //트랜잭션일시
    private String authno; //승인번호

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public short getPayidx() {
        return payidx;
    }

    public void setPayidx(short payidx) {
        this.payidx = payidx;
    }

    public char getAuthyn() {
        return authyn;
    }

    public void setAuthyn(char authyn) {
        this.authyn = authyn;
    }

    public String getTrno() {
        return trno;
    }

    public void setTrno(String trno) {
        this.trno = trno;
    }

    public char getTrdt() {
        return trdt;
    }

    public void setTrdt(char trdt) {
        this.trdt = trdt;
    }

    public char getTrtm() {
        return trtm;
    }

    public void setTrtm(char trtm) {
        this.trtm = trtm;
    }

    public String getAuthno() {
        return authno;
    }

    public void setAuthno(String authno) {
        this.authno = authno;
    }
}
