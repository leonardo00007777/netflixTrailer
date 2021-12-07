package com.x62life.mo.model.purchase;

import java.math.BigDecimal;
import java.sql.Timestamp;
/*@Alias("purchasingDetailInfo")*/
public class PurchasingDetailInfo {
    private String plcomp; //회사코드
    private String plnmor; //구매주문번호
    private short plpoln; //구매주문라인
    private String plcdst; //구매주문상태
    private String plartc; //상품코드
    private int plqtor; //발주수량
    private int plqtod; //납품수량
    private String plgrno; //입고번호
    private Timestamp pldtgr; //입고일자
    private BigDecimal plucost; //단가
    private BigDecimal plcost; //공급가
    private BigDecimal plvat; //부가세
    private String plnote; //요청사항(메모)

    public String getPlcomp() {
        return plcomp;
    }

    public void setPlcomp(String plcomp) {
        this.plcomp = plcomp;
    }

    public String getPlnmor() {
        return plnmor;
    }

    public void setPlnmor(String plnmor) {
        this.plnmor = plnmor;
    }

    public short getPlpoln() {
        return plpoln;
    }

    public void setPlpoln(short plpoln) {
        this.plpoln = plpoln;
    }

    public String getPlcdst() {
        return plcdst;
    }

    public void setPlcdst(String plcdst) {
        this.plcdst = plcdst;
    }

    public String getPlartc() {
        return plartc;
    }

    public void setPlartc(String plartc) {
        this.plartc = plartc;
    }

    public int getPlqtor() {
        return plqtor;
    }

    public void setPlqtor(int plqtor) {
        this.plqtor = plqtor;
    }

    public int getPlqtod() {
        return plqtod;
    }

    public void setPlqtod(int plqtod) {
        this.plqtod = plqtod;
    }

    public String getPlgrno() {
        return plgrno;
    }

    public void setPlgrno(String plgrno) {
        this.plgrno = plgrno;
    }

    public Timestamp getPldtgr() {
        return pldtgr;
    }

    public void setPldtgr(Timestamp pldtgr) {
        this.pldtgr = pldtgr;
    }

    public BigDecimal getPlucost() {
        return plucost;
    }

    public void setPlucost(BigDecimal plucost) {
        this.plucost = plucost;
    }

    public BigDecimal getPlcost() {
        return plcost;
    }

    public void setPlcost(BigDecimal plcost) {
        this.plcost = plcost;
    }

    public BigDecimal getPlvat() {
        return plvat;
    }

    public void setPlvat(BigDecimal plvat) {
        this.plvat = plvat;
    }

    public String getPlnote() {
        return plnote;
    }

    public void setPlnote(String plnote) {
        this.plnote = plnote;
    }
}
