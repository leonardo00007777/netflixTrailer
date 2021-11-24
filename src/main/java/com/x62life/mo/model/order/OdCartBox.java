package com.x62life.mo.model.order;
//카트 박스
public class OdCartBox {
    private char memcd; //회원코드
    private int crtidx; //카트일련번호
    private String gdcd; //상품코드
    private int gdcnt; //상품수량
    private int boxidx; //박스일련번호
    private short weekidx; //주차일련번호

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

    public int getBoxidx() {
        return boxidx;
    }

    public void setBoxidx(int boxidx) {
        this.boxidx = boxidx;
    }

    public short getWeekidx() {
        return weekidx;
    }

    public void setWeekidx(short weekidx) {
        this.weekidx = weekidx;
    }
}
