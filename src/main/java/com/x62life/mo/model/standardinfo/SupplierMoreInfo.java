package com.x62life.mo.model.standardinfo;

import java.sql.Timestamp;
//공급자 추가정보
public class SupplierMoreInfo {
    private String suno; //공급자코드
    private String chargemd; //담당md
    private Timestamp chargedt; //담당시작일자
    private String compinfo; //회사 정보
    private String feature; //업체 특성(장.단점)
    private String brand; //주요 브랜드
    private String note; //추가 메모
    private String upid; //수정자
    private Timestamp indt; //등록일시
    private String pdscd; //

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
}
