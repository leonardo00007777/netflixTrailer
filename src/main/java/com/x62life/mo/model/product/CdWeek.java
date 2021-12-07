package com.x62life.mo.model.product;

import java.math.BigDecimal;

/*@Alias("cdWeek")*/
//CDWeek
public class CdWeek {
    private BigDecimal gdyear;  // gdyear
    private BigDecimal gdweek;  // gdweek
    private char ordsdt; // 주문시작일
    private char ordedt; // 주문종료일
    private char dlvsdt; // 배송시작일
    private char dlvedt; // 배송종료일

    public BigDecimal getGdyear() {
        return gdyear;
    }

    public void setGdyear(BigDecimal gdyear) {
        this.gdyear = gdyear;
    }

    public BigDecimal getGdweek() {
        return gdweek;
    }

    public void setGdweek(BigDecimal gdweek) {
        this.gdweek = gdweek;
    }

    public char getOrdsdt() {
        return ordsdt;
    }

    public void setOrdsdt(char ordsdt) {
        this.ordsdt = ordsdt;
    }

    public char getOrdedt() {
        return ordedt;
    }

    public void setOrdedt(char ordedt) {
        this.ordedt = ordedt;
    }

    public char getDlvsdt() {
        return dlvsdt;
    }

    public void setDlvsdt(char dlvsdt) {
        this.dlvsdt = dlvsdt;
    }

    public char getDlvedt() {
        return dlvedt;
    }

    public void setDlvedt(char dlvedt) {
        this.dlvedt = dlvedt;
    }
}
