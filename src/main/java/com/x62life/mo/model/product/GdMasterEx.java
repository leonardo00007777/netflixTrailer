package com.x62life.mo.model.product;

import java.math.BigDecimal;

public class GdMasterEx extends GdMaster{
    private BigDecimal saleprice;
    private BigDecimal groupsaleprice;
    private int isgroupsale;
    private int gdcnt;
    private String cdcode;
    private String origin; //생산지
    private String producer; //생산자
    private String address; //주소
    private String cdname;
    private String odtype;
    private String odtype2;
    private String odFrom;
    private String odTo;
    private String dlvFrom;
    private char alltimesale; //상시판매
    private String smenucd;
    private String smenudesc;

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

    public String getOdtype2() {
        return odtype2;
    }

    public void setOdtype2(String odtype2) {
        this.odtype2 = odtype2;
    }

    public BigDecimal getGroupsaleprice() {
        return groupsaleprice;
    }

    public void setGroupsaleprice(BigDecimal groupsaleprice) {
        this.groupsaleprice = groupsaleprice;
    }

    public int getIsgroupsale() {
        return isgroupsale;
    }

    public void setIsgroupsale(int isgroupsale) {
        this.isgroupsale = isgroupsale;
    }

    public String getCdcode() {
        return cdcode;
    }

    public void setCdcode(String cdcode) {
        this.cdcode = cdcode;
    }

    public String getOdFrom() {
        return odFrom;
    }

    public void setOdFrom(String odFrom) {
        this.odFrom = odFrom;
    }

    public String getOdTo() {
        return odTo;
    }

    public void setOdTo(String odTo) {
        this.odTo = odTo;
    }

    public String getDlvFrom() {
        return dlvFrom;
    }

    public void setDlvFrom(String dlvFrom) {
        this.dlvFrom = dlvFrom;
    }

    public char getAlltimesale() {
        return alltimesale;
    }

    public void setAlltimesale(char alltimesale) {
        this.alltimesale = alltimesale;
    }

    public String getSmenucd() {
        return smenucd;
    }

    public void setSmenucd(String smenucd) {
        this.smenucd = smenucd;
    }

    public String getSmenudesc() {
        return smenudesc;
    }

    public void setSmenudesc(String smenudesc) {
        this.smenudesc = smenudesc;
    }
}
