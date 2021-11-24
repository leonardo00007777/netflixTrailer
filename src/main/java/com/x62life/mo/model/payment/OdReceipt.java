package com.x62life.mo.model.payment;

import java.math.BigDecimal;
import java.sql.Timestamp;

//현금영수증
public class OdReceipt {
    private char paynum; //결제번호
    private String pgtrid; //거래번호
    private BigDecimal cash; //현금연수증 금액
    private char rcpcd; //현금영수증가입분류코드
    private String rcpinfo; //현금영수증가입정보
    private char rcpstcd; //현금영수증상태코드
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private BigDecimal suprice; //공급가
    private BigDecimal notaxprice; //비과세
    private BigDecimal taxprice; //과세
    private BigDecimal vat; //부가세
    private char useopt; //현금영수증발행용도

    public char getPaynum() {
        return paynum;
    }

    public void setPaynum(char paynum) {
        this.paynum = paynum;
    }

    public String getPgtrid() {
        return pgtrid;
    }

    public void setPgtrid(String pgtrid) {
        this.pgtrid = pgtrid;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public char getRcpcd() {
        return rcpcd;
    }

    public void setRcpcd(char rcpcd) {
        this.rcpcd = rcpcd;
    }

    public String getRcpinfo() {
        return rcpinfo;
    }

    public void setRcpinfo(String rcpinfo) {
        this.rcpinfo = rcpinfo;
    }

    public char getRcpstcd() {
        return rcpstcd;
    }

    public void setRcpstcd(char rcpstcd) {
        this.rcpstcd = rcpstcd;
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

    public BigDecimal getSuprice() {
        return suprice;
    }

    public void setSuprice(BigDecimal suprice) {
        this.suprice = suprice;
    }

    public BigDecimal getNotaxprice() {
        return notaxprice;
    }

    public void setNotaxprice(BigDecimal notaxprice) {
        this.notaxprice = notaxprice;
    }

    public BigDecimal getTaxprice() {
        return taxprice;
    }

    public void setTaxprice(BigDecimal taxprice) {
        this.taxprice = taxprice;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public char getUseopt() {
        return useopt;
    }

    public void setUseopt(char useopt) {
        this.useopt = useopt;
    }
}
