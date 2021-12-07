package com.x62life.mo.model.order;

/*@Alias("odDeliveryTemp")*/
//배송지 정보 임시
public class OdDeliveryTemp {
    private char paynum; //임시결제번호
    private char ordnum; //임시주문번호
    private char memcd; //회원번호
    private String rcvname; //수신자명
    private char zipcd; //우편번호
    private String addr1; //주소1
    private String addr2; //주소2
    private String telno; //전화번호
    private String hpno; //휴대전화
    private String dlvmsg; //배송메세지
    private String rcvmsg; //수신자메세지
    private char hideyn; //숨김여부
    private byte[] addr1Enc; //주소1 enc
    private byte[] addr2Enc; //주소2 enc
    private byte[] telnoEnc; //전화번호 enc
    private byte[] hpnoEnc; //휴대전화 enc
    private String sndname; //주문자명

    public char getPaynum() {
        return paynum;
    }

    public void setPaynum(char paynum) {
        this.paynum = paynum;
    }

    public char getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(char ordnum) {
        this.ordnum = ordnum;
    }

    public char getMemcd() {
        return memcd;
    }

    public void setMemcd(char memcd) {
        this.memcd = memcd;
    }

    public String getRcvname() {
        return rcvname;
    }

    public void setRcvname(String rcvname) {
        this.rcvname = rcvname;
    }

    public char getZipcd() {
        return zipcd;
    }

    public void setZipcd(char zipcd) {
        this.zipcd = zipcd;
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

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getHpno() {
        return hpno;
    }

    public void setHpno(String hpno) {
        this.hpno = hpno;
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

    public char getHideyn() {
        return hideyn;
    }

    public void setHideyn(char hideyn) {
        this.hideyn = hideyn;
    }

    public byte[] getAddr1Enc() {
        return addr1Enc;
    }

    public void setAddr1Enc(byte[] addr1Enc) {
        this.addr1Enc = addr1Enc;
    }

    public byte[] getAddr2Enc() {
        return addr2Enc;
    }

    public void setAddr2Enc(byte[] addr2Enc) {
        this.addr2Enc = addr2Enc;
    }

    public byte[] getTelnoEnc() {
        return telnoEnc;
    }

    public void setTelnoEnc(byte[] telnoEnc) {
        this.telnoEnc = telnoEnc;
    }

    public byte[] getHpnoEnc() {
        return hpnoEnc;
    }

    public void setHpnoEnc(byte[] hpnoEnc) {
        this.hpnoEnc = hpnoEnc;
    }

    public String getSndname() {
        return sndname;
    }

    public void setSndname(String sndname) {
        this.sndname = sndname;
    }
}
