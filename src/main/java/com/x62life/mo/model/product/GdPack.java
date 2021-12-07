package com.x62life.mo.model.product;

/*@Alias("gdPack")*/
// 패키지 상품 패키지 정보
public class GdPack {
   private String gdcd;
   private String weekcnt;
   private String weekgap;

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public String getWeekcnt() {
        return weekcnt;
    }

    public void setWeekcnt(String weekcnt) {
        this.weekcnt = weekcnt;
    }

    public String getWeekgap() {
        return weekgap;
    }

    public void setWeekgap(String weekgap) {
        this.weekgap = weekgap;
    }
}
