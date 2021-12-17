package com.x62life.mo.model.payment;

//주문 카드 정보
/*@Alias("odCard")*/
public class OdCard {
    private String paynum; //결제번호
    private short payidx; //결제카드 일련번호
    private String authyn; //승인여부
    private String trno; //트랜잭션번호
    private String trdt; //트랜잭션일자
    private String trtm; //트랜잭션일시
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

    public String getAuthyn() {
        return authyn;
    }

    public void setAuthyn(String authyn) {
        this.authyn = authyn;
    }

    public String getTrno() {
        return trno;
    }

    public void setTrno(String trno) {
        this.trno = trno;
    }

    public String getTrdt() {
        return trdt;
    }

    public void setTrdt(String trdt) {
        this.trdt = trdt;
    }

    public String getTrtm() {
        return trtm;
    }

    public void setTrtm(String trtm) {
        this.trtm = trtm;
    }

    public String getAuthno() {
        return authno;
    }

    public void setAuthno(String authno) {
        this.authno = authno;
    }
}
