package com.x62life.mo.model.exhibition;

import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;


@Alias("oneDaySpecialEx")
public class OneDaySpecialEx extends OneDaySpecial{

    private String gdname; //상품이름
    private String div1; //div1
    private String divcd; //디바이스 cd
    private int difftime; // 남은시간
    private int fulltime; // 전체 시간
    private String mgdimg1; // 모바일 상품 이미지1
    private String gdimg; //상품 이미지
    private String odtype; //발송 유형
    private String odtype2;
    private BigDecimal price1; // 상품가격1
    private char soldoutyn; //품절 여부
    private int gdcnt; //상품 개수
    private String mhmimg1;
    private String title;
    private String subtitle;
    private int cnt;

    public String getGdname() {
        return gdname;
    }

    public void setGdname(String gdname) {
        this.gdname = gdname;
    }

    public String getDiv1() {
        return div1;
    }

    public void setDiv1(String div1) {
        this.div1 = div1;
    }

    public String getDivcd() {
        return divcd;
    }

    public void setDivcd(String divcd) {
        this.divcd = divcd;
    }

    public int getDifftime() {
        return difftime;
    }

    public void setDifftime(int difftime) {
        this.difftime = difftime;
    }

    public int getFulltime() {
        return fulltime;
    }

    public void setFulltime(int fulltime) {
        this.fulltime = fulltime;
    }

    public String getMgdimg1() {
        return mgdimg1;
    }

    public void setMgdimg1(String mgdimg1) {
        this.mgdimg1 = mgdimg1;
    }

    public String getGdimg() {
        return gdimg;
    }

    public void setGdimg(String gdimg) {
        this.gdimg = gdimg;
    }

    public String getOdtype() {
        return odtype;
    }

    public void setOdtype(String odtype) {
        this.odtype = odtype;
    }

    public String getOdtype2() {
        return odtype2;
    }

    public void setOdtype2(String odtype2) {
        this.odtype2 = odtype2;
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1;
    }

    public char getSoldoutyn() {
        return soldoutyn;
    }

    public void setSoldoutyn(char soldoutyn) {
        this.soldoutyn = soldoutyn;
    }

    public int getGdcnt() {
        return gdcnt;
    }

    public void setGdcnt(int gdcnt) {
        this.gdcnt = gdcnt;
    }

    public String getMhmimg1() {
        return mhmimg1;
    }

    public void setMhmimg1(String mhmimg1) {
        this.mhmimg1 = mhmimg1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
