package com.x62life.mo.model.order;

import java.math.BigDecimal;
import java.sql.Timestamp;
//상품 자동주문
public class OdAuto {
    private char memcd; //회원코드
    private int autoidx; //자동주문결제일련번호
    private short weekgap; //배송간격
    private short dlvweekday; //배송요일
    private char startdt; //첫배송일
    private char enddt; //종료일
    private String rcvname; //수신자
    private char zipcd; //우편번호
    private String addr1; //주소
    private String addr2; //상세주소
    private String telno; //전화번호
    private String hpno; //휴대전화번호
    private String dlvmsg; //배송메세지
    private String rcvmsg; //수신자메세지
    private char paycd; //결제방법코드
    private char payyn; //입금여부
    private char bntoveryn; //잔여지원금기준 주문생성 여부
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private String updid; //수정자
    private byte[] addr1Enc; //영문주소
    private byte[] addr2Enc; //영문주소상세
    private byte[] telnoEnc; //영문전화번호
    private byte[] hpnoEnc; //영문휴대폰번호
    private BigDecimal minbnt; //최소잔여지원금

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

    public short getWeekgap() {
        return weekgap;
    }

    public void setWeekgap(short weekgap) {
        this.weekgap = weekgap;
    }

    public short getDlvweekday() {
        return dlvweekday;
    }

    public void setDlvweekday(short dlvweekday) {
        this.dlvweekday = dlvweekday;
    }

    public char getStartdt() {
        return startdt;
    }

    public void setStartdt(char startdt) {
        this.startdt = startdt;
    }

    public char getEnddt() {
        return enddt;
    }

    public void setEnddt(char enddt) {
        this.enddt = enddt;
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

    public char getPaycd() {
        return paycd;
    }

    public void setPaycd(char paycd) {
        this.paycd = paycd;
    }

    public char getPayyn() {
        return payyn;
    }

    public void setPayyn(char payyn) {
        this.payyn = payyn;
    }

    public char getBntoveryn() {
        return bntoveryn;
    }

    public void setBntoveryn(char bntoveryn) {
        this.bntoveryn = bntoveryn;
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

    public BigDecimal getMinbnt() {
        return minbnt;
    }

    public void setMinbnt(BigDecimal minbnt) {
        this.minbnt = minbnt;
    }
}
