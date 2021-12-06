package com.x62life.mo.model.order;

import java.sql.Timestamp;

public class ShoppingBasket {
    private char memcd; //회원코드
    private int crtidx; //카트일련번호
    private String gdcd; //상품코드
    private int gdcnt; //상품수량
    private Timestamp indt; //등록일시
    private char odGubun; //주문유형
    private int idxlink; //회원상품별카트일련번호
    private char freeze; //장바구니 잠금여부

    public char getMemcd() {
        return memcd;
    }

    public void setMemcd(char memcd) {
        this.memcd = memcd;
    }

    public int getCrtidx() {
        return crtidx;
    }

    public void setCrtidx(int crtidx) {
        this.crtidx = crtidx;
    }

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public int getGdcnt() {
        return gdcnt;
    }

    public void setGdcnt(int gdcnt) {
        this.gdcnt = gdcnt;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public char getOdGubun() {
        return odGubun;
    }

    public void setOdGubun(char odGubun) {
        this.odGubun = odGubun;
    }

    public int getIdxlink() {
        return idxlink;
    }

    public void setIdxlink(int idxlink) {
        this.idxlink = idxlink;
    }

    public char getFreeze() {
        return freeze;
    }

    public void setFreeze(char freeze) {
        this.freeze = freeze;
    }
}
