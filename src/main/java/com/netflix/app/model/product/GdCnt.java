package com.netflix.app.model.product;

/*@Alias("gdCnt")*/
//재고량
public class GdCnt {
    private String gdcd; //상품코드
    private int gdcnt; //재고량

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public int getGdcnt() {
        return gdcnt;
    }

    public void setGdcnt(int gdcnt) {
        this.gdcnt = gdcnt;
    }
}
