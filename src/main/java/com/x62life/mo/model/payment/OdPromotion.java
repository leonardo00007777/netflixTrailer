package com.x62life.mo.model.payment;

import java.sql.Timestamp;

//상품권
public class OdPromotion {
    private int idx; //(k1)
    private String certificateno; //인증번호(k2)
    private char status; //상품권상태코드
    private String rcvname; //받는사람
    private String addr1; //배송지 주소1
    private String addr2; //배송지 주소2
    private String zipcd; //우편번호
    private String telno; //전화번호
    private char hpno; //휴대전화번호
    private String email; //전자우편주소(이메일)
    private String dlvmsg; //배송기사 메시지
    private String rcvmsg; //보내는사람 메시지
    private String paynum; //결제번호
    private String invoiceno; //운송장번호
    private Timestamp registerdate; //등록일시
    private Timestamp useddate; //처리일시
    private String userid; //처리자id

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getCertificateno() {
        return certificateno;
    }

    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getRcvname() {
        return rcvname;
    }

    public void setRcvname(String rcvname) {
        this.rcvname = rcvname;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getZipcd() {
        return zipcd;
    }

    public void setZipcd(String zipcd) {
        this.zipcd = zipcd;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public char getHpno() {
        return hpno;
    }

    public void setHpno(char hpno) {
        this.hpno = hpno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDlvmsg() {
        return dlvmsg;
    }

    public void setDlvmsg(String dlvmsg) {
        this.dlvmsg = dlvmsg;
    }

    public String getRcvmsg() {
        return rcvmsg;
    }

    public void setRcvmsg(String rcvmsg) {
        this.rcvmsg = rcvmsg;
    }

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    public Timestamp getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Timestamp registerdate) {
        this.registerdate = registerdate;
    }

    public Timestamp getUseddate() {
        return useddate;
    }

    public void setUseddate(Timestamp useddate) {
        this.useddate = useddate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
