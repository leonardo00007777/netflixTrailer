package com.netflix.app.model.product;

import java.math.BigDecimal;
import java.math.RoundingMode;
//상품 이름 변경정보

/*@Alias("gdConvert")*/
public class GdConvert {
    private String gdcd; //상품코드
    private String newname;
    private String unit;
    private BigDecimal newprice;
    private int gdcnt;
    private String commoditycode;
    private String commodityname;
    private String commoditycnt;
    private BigDecimal price;
    private String daecode;
    private String socode;
    private String img;

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public String getNewname() {
        return newname;
    }

    public void setNewname(String newname) {
        this.newname = newname;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getNewprice() {
        return newprice;
    }

    public void setNewprice(BigDecimal newprice) {
        this.newprice = newprice.setScale(0, RoundingMode.DOWN);
    }

    public int getGdcnt() {
        return gdcnt;
    }

    public void setGdcnt(int gdcnt) {
        this.gdcnt = gdcnt;
    }

    public String getCommoditycode() {
        return commoditycode;
    }

    public void setCommoditycode(String commoditycode) {
        this.commoditycode = commoditycode;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
    }

    public String getCommoditycnt() {
        return commoditycnt;
    }

    public void setCommoditycnt(String commoditycnt) {
        this.commoditycnt = commoditycnt;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price.setScale(0, RoundingMode.DOWN);
    }

    public String getDaecode() {
        return daecode;
    }

    public void setDaecode(String daecode) {
        this.daecode = daecode;
    }

    public String getSocode() {
        return socode;
    }

    public void setSocode(String socode) {
        this.socode = socode;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
