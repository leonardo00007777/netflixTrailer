package com.x62life.mo.model.member;

import java.math.BigDecimal;
import java.sql.Timestamp;

/*@Alias("mbPoint")*/
//회원 지원금
public class MbPoint {
    private int nox; //순번
    private String memcd; //회원번호
    private Timestamp expdt; //만료일시
    private Timestamp indt; //발급일시
    private BigDecimal deposit; //적립금액
    private BigDecimal withdraw; //사용금액
    private BigDecimal cpoint; //잔액
    private String memid; //회원id
    private String rscd; //사유코드
    private String rsnote; //사유설명
    private String paynum; //결제번호
    private Timestamp updt; //수정일시
    private String upid; //수정자id
    private char useyn; //사용여부

    public int getNox() {
        return nox;
    }

    public void setNox(int nox) {
        this.nox = nox;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public Timestamp getExpdt() {
        return expdt;
    }

    public void setExpdt(Timestamp expdt) {
        this.expdt = expdt;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(BigDecimal withdraw) {
        this.withdraw = withdraw;
    }

    public BigDecimal getCpoint() {
        return cpoint;
    }

    public void setCpoint(BigDecimal cpoint) {
        this.cpoint = cpoint;
    }

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public String getRscd() {
        return rscd;
    }

    public void setRscd(String rscd) {
        this.rscd = rscd;
    }

    public String getRsnote() {
        return rsnote;
    }

    public void setRsnote(String rsnote) {
        this.rsnote = rsnote;
    }

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }

    public String getUpid() {
        return upid;
    }

    public void setUpid(String upid) {
        this.upid = upid;
    }

    public char getUseyn() {
        return useyn;
    }

    public void setUseyn(char useyn) {
        this.useyn = useyn;
    }
}
