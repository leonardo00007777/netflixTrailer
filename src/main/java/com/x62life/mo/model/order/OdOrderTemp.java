package com.x62life.mo.model.order;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class OdOrderTemp {
    private char memcd; //회원코드
    private String gubun; //주문유형
    private int crtidx; //장바구니idx
    private int itemidx; //장바구니상품idx
    private String gdcd; //상품코드
    private String gdname; //상품명
    private int gdcnt; //주문상품개수
    private int price; //상품가격
    private int point; //포인트
    private char divcd; //상품구분
    private char odGubun; //주문유형
    private String dlvdt; //배송횟수
    private String rcvname; //받는사람
    private char zipcd; //우편번호
    private String addr1; //배송주소1
    private String addr2; //배송주소2
    private String telno; //전화번호
    private String hpno; //휴대전화
    private String dlvmsg; //배송메세지
    private String rcvmsg; //전달메세지
    private int sort; //정렬순번
    private Timestamp indt; //등록일시
    private BigDecimal vos; //공급가
    private BigDecimal tax; //과세
    private BigDecimal vat; //부가세
    private String comments; //기타사항
    private String sndname; //보내는사람

    public char getMemcd() {
        return memcd;
    }

    public void setMemcd(char memcd) {
        this.memcd = memcd;
    }

    public String getGubun() {
        return gubun;
    }

    public void setGubun(String gubun) {
        this.gubun = gubun;
    }

    public int getCrtidx() {
        return crtidx;
    }

    public void setCrtidx(int crtidx) {
        this.crtidx = crtidx;
    }

    public int getItemidx() {
        return itemidx;
    }

    public void setItemidx(int itemidx) {
        this.itemidx = itemidx;
    }

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public String getGdname() {
        return gdname;
    }

    public void setGdname(String gdname) {
        this.gdname = gdname;
    }

    public int getGdcnt() {
        return gdcnt;
    }

    public void setGdcnt(int gdcnt) {
        this.gdcnt = gdcnt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public char getDivcd() {
        return divcd;
    }

    public void setDivcd(char divcd) {
        this.divcd = divcd;
    }

    public char getOdGubun() {
        return odGubun;
    }

    public void setOdGubun(char odGubun) {
        this.odGubun = odGubun;
    }

    public String getDlvdt() {
        return dlvdt;
    }

    public void setDlvdt(String dlvdt) {
        this.dlvdt = dlvdt;
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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public BigDecimal getVos() {
        return vos;
    }

    public void setVos(BigDecimal vos) {
        this.vos = vos;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSndname() {
        return sndname;
    }

    public void setSndname(String sndname) {
        this.sndname = sndname;
    }
}
