package com.x62life.mo.model.member;

import java.math.BigDecimal;
import java.sql.Timestamp;

/*@Alias("mbDeposit")*/
//회원 예치금
public class MbDeposit {
    private char memcd; //회원번호
    private int dpsidx; //예치금순번
    private char dpscd; //예치금구분
    private String title; //예치금사용내용
    private BigDecimal dpsprice; //예치금
    private char dpsstcd; //예치금상태
    private char paynum; //결제번호
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시

    public char getMemcd() {
        return memcd;
    }

    public void setMemcd(char memcd) {
        this.memcd = memcd;
    }

    public int getDpsidx() {
        return dpsidx;
    }

    public void setDpsidx(int dpsidx) {
        this.dpsidx = dpsidx;
    }

    public char getDpscd() {
        return dpscd;
    }

    public void setDpscd(char dpscd) {
        this.dpscd = dpscd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getDpsprice() {
        return dpsprice;
    }

    public void setDpsprice(BigDecimal dpsprice) {
        this.dpsprice = dpsprice;
    }

    public char getDpsstcd() {
        return dpsstcd;
    }

    public void setDpsstcd(char dpsstcd) {
        this.dpsstcd = dpsstcd;
    }

    public char getPaynum() {
        return paynum;
    }

    public void setPaynum(char paynum) {
        this.paynum = paynum;
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
}
