package com.x62life.mo.model.order;

import java.sql.Timestamp;

/*@Alias("shoppingBasket")*/
public class ShoppingBasket {
    private String memcd; //회원코드
    private int crtidx; //카트일련번호
    private String gdcd; //상품코드
    private int gdcnt; //상품수량
    private Timestamp indt; //등록일시
    private String odGubun; //주문유형
    private int idxlink; //회원상품별카트일련번호
    private String freeze; //장바구니 잠금여부
    private int cnt;

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
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

    public String getOdGubun() {
        return odGubun;
    }

    public void setOdGubun(String odGubun) {
        this.odGubun = odGubun;
    }

    public int getIdxlink() {
        return idxlink;
    }

    public void setIdxlink(int idxlink) {
        this.idxlink = idxlink;
    }

    public String getFreeze() {
        return freeze;
    }

    public void setFreeze(String freeze) {
        this.freeze = freeze;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
