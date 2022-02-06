package com.netflix.app.model.boardcontents;

//요리연관상품
/*@Alias("bdCookGoods")*/
public class BdCookGoods {
    private int ctsidx; //순번
    private String gdcd; //상품코드

    public int getCtsidx() {
        return ctsidx;
    }

    public void setCtsidx(int ctsidx) {
        this.ctsidx = ctsidx;
    }

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }
}
