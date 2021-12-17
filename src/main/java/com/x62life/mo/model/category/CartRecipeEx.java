package com.x62life.mo.model.category;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*@Alias("cartRecipeEx")*/
public class CartRecipeEx extends CartRecipe{
    private String gdname; //상품이름
    private String useyn; //사용여부
    private String soldoutyn; //품절여부
    private int gdcnt; //상품개수
    private String gdimg; //상품이미지
    private BigDecimal price1; //상품가격1
    private BigDecimal price; //상품가격
    private String memname;
    private int popscore;
    private int page;
    private int rcnt;

    public String getGdname() {
        return gdname;
    }

    public void setGdname(String gdname) {
        this.gdname = gdname;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }

    public String getSoldoutyn() {
        return soldoutyn;
    }

    public void setSoldoutyn(String soldoutyn) {
        this.soldoutyn = soldoutyn;
    }

    public int getGdcnt() {
        return gdcnt;
    }

    public void setGdcnt(int gdcnt) {
        this.gdcnt = gdcnt;
    }

    public String getGdimg() {
        return gdimg;
    }

    public void setGdimg(String gdimg) {
        this.gdimg = gdimg;
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price.setScale(0, RoundingMode.DOWN);
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        this.memname = memname;
    }

    public int getPopscore() {
        return popscore;
    }

    public void setPopscore(int popscore) {
        this.popscore = popscore;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRcnt() {
        return rcnt;
    }

    public void setRcnt(int rcnt) {
        this.rcnt = rcnt;
    }
}
