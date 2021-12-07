package com.x62life.mo.model.payment;

import java.sql.Timestamp;

//자동주문 중단
/*@Alias("odAutoPayStop")*/
public class OdAutoPayStop {
    private String memcd; //회원코드
    private int autoidx; //자동주문결제일련번호
    private int stpidx; //자동주문일시중단일련번호
    private String startdt; //변경기간시작일
    private String enddt; //변경기간종료일
    private char useyn; //사용여부
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private String updid; //수정자

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

    public int getStpidx() {
        return stpidx;
    }

    public void setStpidx(int stpidx) {
        this.stpidx = stpidx;
    }

    public String getStartdt() {
        return startdt;
    }

    public void setStartdt(String startdt) {
        this.startdt = startdt;
    }

    public String getEnddt() {
        return enddt;
    }

    public void setEnddt(String enddt) {
        this.enddt = enddt;
    }

    public char getUseyn() {
        return useyn;
    }

    public void setUseyn(char useyn) {
        this.useyn = useyn;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }

    public String getUpdid() {
        return updid;
    }

    public void setUpdid(String updid) {
        this.updid = updid;
    }
}
