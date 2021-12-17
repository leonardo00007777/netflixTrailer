package com.x62life.mo.model.product;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*@Alias("cdWeek")*/
//CDWeek
public class CdWeek {
    private BigDecimal gdyear;  // gdyear
    private BigDecimal gdweek;  // gdweek
    private String ordsdt; // 주문시작일
    private String ordedt; // 주문종료일
    private String dlvsdt; // 배송시작일
    private String dlvedt; // 배송종료일

    public BigDecimal getGdyear() {
        return gdyear;
    }

    public void setGdyear(BigDecimal gdyear) {
        this.gdyear = gdyear.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getGdweek() {
        return gdweek;
    }

    public void setGdweek(BigDecimal gdweek) {
        this.gdweek = gdweek.setScale(0, RoundingMode.DOWN);
    }

    public String getOrdsdt() {
        return ordsdt;
    }

    public void setOrdsdt(String ordsdt) {
        this.ordsdt = ordsdt;
    }

    public String getOrdedt() {
        return ordedt;
    }

    public void setOrdedt(String ordedt) {
        this.ordedt = ordedt;
    }

    public String getDlvsdt() {
        return dlvsdt;
    }

    public void setDlvsdt(String dlvsdt) {
        this.dlvsdt = dlvsdt;
    }

    public String getDlvedt() {
        return dlvedt;
    }

    public void setDlvedt(String dlvedt) {
        this.dlvedt = dlvedt;
    }
}
