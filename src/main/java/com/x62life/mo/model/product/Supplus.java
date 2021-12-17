package com.x62life.mo.model.product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;

public class Supplus {
    String suno;
    String chargemd;
    Timestamp chargedt;
    String compinfo;
    String feature;
    String brand;
    String note;
    String upid;
    Timestamp indt;
    String pdscd;
    String delpol;
    BigDecimal limamt;
    BigDecimal delcharge;
    String deadline_msg;

    public String getSuno() {
        return suno;
    }

    public void setSuno(String suno) {
        this.suno = suno;
    }

    public String getChargemd() {
        return chargemd;
    }

    public void setChargemd(String chargemd) {
        this.chargemd = chargemd;
    }

    public Timestamp getChargedt() {
        return chargedt;
    }

    public void setChargedt(Timestamp chargedt) {
        this.chargedt = chargedt;
    }

    public String getCompinfo() {
        return compinfo;
    }

    public void setCompinfo(String compinfo) {
        this.compinfo = compinfo;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUpid() {
        return upid;
    }

    public void setUpid(String upid) {
        this.upid = upid;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public String getPdscd() {
        return pdscd;
    }

    public void setPdscd(String pdscd) {
        this.pdscd = pdscd;
    }

    public String getDelpol() {
        return delpol;
    }

    public void setDelpol(String delpol) {
        this.delpol = delpol;
    }

    public BigDecimal getLimamt() {
        return limamt;
    }

    public void setLimamt(BigDecimal limamt) {
        this.limamt = limamt.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getDelcharge() {
        return delcharge;
    }

    public void setDelcharge(BigDecimal delcharge) {
        this.delcharge = delcharge.setScale(0, RoundingMode.DOWN);
    }

    public String getDeadline_msg() {
        return deadline_msg;
    }

    public void setDeadline_msg(String deadline_msg) {
        this.deadline_msg = deadline_msg;
    }
}
