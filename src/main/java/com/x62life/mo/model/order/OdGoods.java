package com.x62life.mo.model.order;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;

/*@Alias("odGoods")*/
//주문상품
public class OdGoods {
    private String paynum; //결제번호
    private String ordnum; //주문번호
    private String gdcd; //상품코드
    private String gdname; //상품명
    private BigDecimal price; //가격
    private int point; //포인트
    private int gdcnt; //수량
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private BigDecimal tax; //과세
    private BigDecimal vat; //부가세
    private BigDecimal vos; //공급가
    private BigDecimal sprice; //공급단가
    private BigDecimal oprice; //판매단가

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public String getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(String ordnum) {
        this.ordnum = ordnum;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
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

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getVos() {
        return vos;
    }

    public void setVos(BigDecimal vos) {
        this.vos = vos.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getSprice() {
        return sprice;
    }

    public void setSprice(BigDecimal sprice) {
        this.sprice = sprice.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getOprice() {
        return oprice;
    }

    public void setOprice(BigDecimal oprice) {
        this.oprice = oprice.setScale(0, RoundingMode.DOWN);
    }
}
