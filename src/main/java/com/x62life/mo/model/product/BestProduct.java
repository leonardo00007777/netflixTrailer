package com.x62life.mo.model.product;

import java.math.BigDecimal;

public class BestProduct extends GdMaster {
    private String odtype;
    private String odtype2;
    private int tcount;
    private BigDecimal tsales;
    private int gdcnt;
    private String gradedesc;

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

    public int getTcount() {
        return tcount;
    }

    public void setTcount(int tcount) {
        this.tcount = tcount;
    }

    public BigDecimal getTsales() {
        return tsales;
    }

    public void setTsales(BigDecimal tsales) {
        this.tsales = tsales;
    }

    public int getGdcnt() {
        return gdcnt;
    }

    public void setGdcnt(int gdcnt) {
        this.gdcnt = gdcnt;
    }

    public String getGradedesc() {
        return gradedesc;
    }

    public void setGradedesc(String gradedesc) {
        this.gradedesc = gradedesc;
    }
}
