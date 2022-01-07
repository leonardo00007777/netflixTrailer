package com.x62life.mo.model.order;

import com.x62life.mo.model.product.GdMaster;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShoppingBasketEx extends GdMaster {
    private String odtype;
    private int crtidx;
    private BigDecimal price;
    private int gdcnt;
    private BigDecimal tsales;
    private int limitgdcnt;
    private String issale;
    private String origin;
    private String producer;
    private String address;
    private String sname;
    private BigDecimal origprice;
    private BigDecimal origtotal;
    private String delpol;
    private BigDecimal limamt;
    private BigDecimal delcharge;

    public String getOdtype() {
        return odtype;
    }

    public void setOdtype(String odtype) {
        this.odtype = odtype;
    }

    public int getCrtidx() {
        return crtidx;
    }

    public void setCrtidx(int crtidx) {
        this.crtidx = crtidx;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price.setScale(0, RoundingMode.DOWN);
    }

    public int getGdcnt() {
        return gdcnt;
    }

    public void setGdcnt(int gdcnt) {
        this.gdcnt = gdcnt;
    }

    public BigDecimal getTsales() {
        return tsales;
    }

    public void setTsales(BigDecimal tsales) {
        this.tsales = tsales.setScale(0, RoundingMode.DOWN);
    }

    public int getLimitgdcnt() {
        return limitgdcnt;
    }

    public void setLimitgdcnt(int limitgdcnt) {
        this.limitgdcnt = limitgdcnt;
    }

    public String getIssale() {
        return issale;
    }

    public void setIssale(String issale) {
        this.issale = issale;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public BigDecimal getOrigprice() {
        return origprice;
    }

    public void setOrigprice(BigDecimal origprice) {
        this.origprice = origprice.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getOrigtotal() {
        return origtotal;
    }

    public void setOrigtotal(BigDecimal origtotal) {
        this.origtotal = origtotal.setScale(0, RoundingMode.DOWN);
    }

    public String getDelpol() {
        return delpol;
    }

    public void setDelpol(String delpol) {
        this.delpol = delpol;
    }

    public BigDecimal getLimamt() {
        return limamt;
    }

    public void setLimamt(BigDecimal limamt) {
        this.limamt = limamt.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getDelcharge() {
        return delcharge;
    }

    public void setDelcharge(BigDecimal delcharge) {
        this.delcharge = delcharge.setScale(0, RoundingMode.DOWN);
    }
}
