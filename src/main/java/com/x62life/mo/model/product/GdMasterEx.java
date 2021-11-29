package com.x62life.mo.model.product;

import java.math.BigDecimal;

public class GdMasterEx extends GdMaster{
    private BigDecimal saleprice;
    private int gdcnt;
    private String origin; //생산지
    private String producer; //생산자
    private String address; //주소
    private String cdname;
    private String odtype;

    @Override
    public BigDecimal getSaleprice() {
        return saleprice;
    }

    @Override
    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public int getGdcnt() {
        return gdcnt;
    }

    public void setGdcnt(int gdcnt) {
        this.gdcnt = gdcnt;
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

    public String getCdname() {
        return cdname;
    }

    public void setCdname(String cdname) {
        this.cdname = cdname;
    }

    public String getOdtype() {
        return odtype;
    }

    public void setOdtype(String odtype) {
        this.odtype = odtype;
    }
}
