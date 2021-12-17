package com.x62life.mo.model.payment;

import java.sql.Timestamp;

//이니시스 결제
/*@Alias("inicisPay")*/
public class InicisPay {
    private int inidx; //id
    private String tid; //각 거래를 나타내는 40자리 고유번호.
    private String paynum; //자연이랑 결제번호.
    private Timestamp indt; //입력시간.
    private String resultcode; //결과코드.
    private String applydate; //결제승인 날짜. 값 형식: yyyymmdd
    private String applytime; //결제승인 시각. 값 형식: hh24mmss
    private String applynum; //결제승인 번호, ocb point/vbank 를 제외한 지불수단에 모두 존재.
    private String paymethod; //결제방법. (gopaymethod 와 값이 틀릴수 있음)
    private String totalprice; //결제결과 금액.
    private String acctbankcode; //은행코드.
    private String cshrresultcode; //현금영수증, 발급결과코드.
    private String cshrtype; //현금영수증, 발급구분코드.
    private String vactnum; //입금계좌번호.
    private String vactbankcode; //입금은행코드.
    private String vactname; //예금주명.
    private String vactinputname; //입금계좌번호.
    private String vactdate; //송금일자. 값 형식: yyyymmdd
    private String vacttime; //송금시각. 값 형식: hh24mmss
    private String errorcode;
    private String resultmsg;

    public int getInidx() {
        return inidx;
    }

    public void setInidx(int inidx) {
        this.inidx = inidx;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
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

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getApplydate() {
        return applydate;
    }

    public void setApplydate(String applydate) {
        this.applydate = applydate;
    }

    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime;
    }

    public String getApplynum() {
        return applynum;
    }

    public void setApplynum(String applynum) {
        this.applynum = applynum;
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    public String getAcctbankcode() {
        return acctbankcode;
    }

    public void setAcctbankcode(String acctbankcode) {
        this.acctbankcode = acctbankcode;
    }

    public String getCshrresultcode() {
        return cshrresultcode;
    }

    public void setCshrresultcode(String cshrresultcode) {
        this.cshrresultcode = cshrresultcode;
    }

    public String getCshrtype() {
        return cshrtype;
    }

    public void setCshrtype(String cshrtype) {
        this.cshrtype = cshrtype;
    }

    public String getVactnum() {
        return vactnum;
    }

    public void setVactnum(String vactnum) {
        this.vactnum = vactnum;
    }

    public String getVactbankcode() {
        return vactbankcode;
    }

    public void setVactbankcode(String vactbankcode) {
        this.vactbankcode = vactbankcode;
    }

    public String getVactname() {
        return vactname;
    }

    public void setVactname(String vactname) {
        this.vactname = vactname;
    }

    public String getVactinputname() {
        return vactinputname;
    }

    public void setVactinputname(String vactinputname) {
        this.vactinputname = vactinputname;
    }

    public String getVactdate() {
        return vactdate;
    }

    public void setVactdate(String vactdate) {
        this.vactdate = vactdate;
    }

    public String getVacttime() {
        return vacttime;
    }

    public void setVacttime(String vacttime) {
        this.vacttime = vacttime;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    public String getResultmsg() {
        return resultmsg;
    }

    public void setResultmsg(String resultmsg) {
        this.resultmsg = resultmsg;
    }
}
