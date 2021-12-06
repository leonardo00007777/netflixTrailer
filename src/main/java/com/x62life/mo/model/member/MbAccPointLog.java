package com.x62life.mo.model.member;

import java.math.BigDecimal;
import java.sql.Timestamp;

//회원 적립금 로그
public class MbAccPointLog {
    private int seq; //순번
    private String memcd; //회원번호
    private int nox; //회원적립금 순번
    private String acctype; //적립유형
    private char usage; //사용구분
    private Timestamp expdt; //만료일시
    private BigDecimal point; //적립금
    private String paynum; //결제번호
    private Timestamp indt; //등록일시
    private BigDecimal tpoint; //누적적립금

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public int getNox() {
        return nox;
    }

    public void setNox(int nox) {
        this.nox = nox;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public char getUsage() {
        return usage;
    }

    public void setUsage(char usage) {
        this.usage = usage;
    }

    public Timestamp getExpdt() {
        return expdt;
    }

    public void setExpdt(Timestamp expdt) {
        this.expdt = expdt;
    }

    public BigDecimal getPoint() {
        return point;
    }

    public void setPoint(BigDecimal point) {
        this.point = point;
    }

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public BigDecimal getTpoint() {
        return tpoint;
    }

    public void setTpoint(BigDecimal tpoint) {
        this.tpoint = tpoint;
    }
}
