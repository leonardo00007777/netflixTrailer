package com.x62life.mo.model.member;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;

/*@Alias("memberLevelMaster")*/
//회원 멤버십 등급 정보
public class MemberLevelMaster {
    private String mvcode; //멤버쉽등급
    private String mvlevel; //멤버쉽등급명
    private String mvdesc; //멤버쉽등급설명
    private String mvcond; //멤버쉽혜택조건
    private BigDecimal mvpntr; //멤버쉽적립률
    private BigDecimal mvdisr; //멤버쉽할인율
    private String mvuse; //사용여부
    private Timestamp mvindt; //등록일시
    private String mvicon; //멤버쉽icon
    private String mvimg; //멤버쉽img

    public String getMvcode() {
        return mvcode;
    }

    public void setMvcode(String mvcode) {
        this.mvcode = mvcode;
    }

    public String getMvlevel() {
        return mvlevel;
    }

    public void setMvlevel(String mvlevel) {
        this.mvlevel = mvlevel;
    }

    public String getMvdesc() {
        return mvdesc;
    }

    public void setMvdesc(String mvdesc) {
        this.mvdesc = mvdesc;
    }

    public String getMvcond() {
        return mvcond;
    }

    public void setMvcond(String mvcond) {
        this.mvcond = mvcond;
    }

    public BigDecimal getMvpntr() {
        return mvpntr;
    }

    public void setMvpntr(BigDecimal mvpntr) {
        this.mvpntr = mvpntr.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getMvdisr() {
        return mvdisr;
    }

    public void setMvdisr(BigDecimal mvdisr) {
        this.mvdisr = mvdisr.setScale(0, RoundingMode.DOWN);
    }

    public String getMvuse() {
        return mvuse;
    }

    public void setMvuse(String mvuse) {
        this.mvuse = mvuse;
    }

    public Timestamp getMvindt() {
        return mvindt;
    }

    public void setMvindt(Timestamp mvindt) {
        this.mvindt = mvindt;
    }

    public String getMvicon() {
        return mvicon;
    }

    public void setMvicon(String mvicon) {
        this.mvicon = mvicon;
    }

    public String getMvimg() {
        return mvimg;
    }

    public void setMvimg(String mvimg) {
        this.mvimg = mvimg;
    }
}
