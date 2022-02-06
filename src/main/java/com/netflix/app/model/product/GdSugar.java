package com.netflix.app.model.product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
/*@Alias("gdSugar")*/
public class GdSugar {
    private int gaidx;
    private String gagdcd;
    private Timestamp gadate;
    private BigDecimal gasuga;
    private BigDecimal gasug1;
    private BigDecimal gasug2;
    private BigDecimal gasug3;
    private String gasuno;
    private String ganote;
    private String gamemo;
    private String gaimag;
    private Timestamp gaindt;
    private String gausid;
    private String fruitsSugar;

    public int getGaidx() {
        return gaidx;
    }

    public void setGaidx(int gaidx) {
        this.gaidx = gaidx;
    }

    public String getGagdcd() {
        return gagdcd;
    }

    public void setGagdcd(String gagdcd) {
        this.gagdcd = gagdcd;
    }

    public Timestamp getGadate() {
        return gadate;
    }

    public void setGadate(Timestamp gadate) {
        this.gadate = gadate;
    }

    public BigDecimal getGasuga() {
        return gasuga;
    }

    public void setGasuga(BigDecimal gasuga) {
        this.gasuga = gasuga.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getGasug1() {
        return gasug1;
    }

    public void setGasug1(BigDecimal gasug1) {
        this.gasug1 = gasug1.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getGasug2() {
        return gasug2;
    }

    public void setGasug2(BigDecimal gasug2) {
        this.gasug2 = gasug2.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getGasug3() {
        return gasug3;
    }

    public void setGasug3(BigDecimal gasug3) {
        this.gasug3 = gasug3.setScale(0, RoundingMode.DOWN);
    }

    public String getGasuno() {
        return gasuno;
    }

    public void setGasuno(String gasuno) {
        this.gasuno = gasuno;
    }

    public String getGanote() {
        return ganote;
    }

    public void setGanote(String ganote) {
        this.ganote = ganote;
    }

    public String getGamemo() {
        return gamemo;
    }

    public void setGamemo(String gamemo) {
        this.gamemo = gamemo;
    }

    public String getGaimag() {
        return gaimag;
    }

    public void setGaimag(String gaimag) {
        this.gaimag = gaimag;
    }

    public Timestamp getGaindt() {
        return gaindt;
    }

    public void setGaindt(Timestamp gaindt) {
        this.gaindt = gaindt;
    }

    public String getGausid() {
        return gausid;
    }

    public void setGausid(String gausid) {
        this.gausid = gausid;
    }

    public String getFruitsSugar() {
        return fruitsSugar;
    }

    public void setFruitsSugar(String fruitsSugar) {
        this.fruitsSugar = fruitsSugar;
    }
}
