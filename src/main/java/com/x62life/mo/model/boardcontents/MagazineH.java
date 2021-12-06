package com.x62life.mo.model.boardcontents;

import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Alias("magazineH")
public class MagazineH {
    private int zhidx;
    private short zhvol;
    private char zhyyyy;
    private char zhmm;
    private String zhtitle;
    private String zhdesc;
    private String zhtimg;
    private String zhtype;
    private char zhusyn;
    private String zhupid;
    private Timestamp zhindt;
    private Timestamp zhupdt;
    private String zhtimg2;
    private String zhcolor;
    private String zhtimg3;

    public int getZhidx() {
        return zhidx;
    }

    public void setZhidx(int zhidx) {
        this.zhidx = zhidx;
    }

    public short getZhvol() {
        return zhvol;
    }

    public void setZhvol(short zhvol) {
        this.zhvol = zhvol;
    }

    public char getZhyyyy() {
        return zhyyyy;
    }

    public void setZhyyyy(char zhyyyy) {
        this.zhyyyy = zhyyyy;
    }

    public char getZhmm() {
        return zhmm;
    }

    public void setZhmm(char zhmm) {
        this.zhmm = zhmm;
    }

    public String getZhtitle() {
        return zhtitle;
    }

    public void setZhtitle(String zhtitle) {
        this.zhtitle = zhtitle;
    }

    public String getZhdesc() {
        return zhdesc;
    }

    public void setZhdesc(String zhdesc) {
        this.zhdesc = zhdesc;
    }

    public String getZhtimg() {
        return zhtimg;
    }

    public void setZhtimg(String zhtimg) {
        this.zhtimg = zhtimg;
    }

    public String getZhtype() {
        return zhtype;
    }

    public void setZhtype(String zhtype) {
        this.zhtype = zhtype;
    }

    public char getZhusyn() {
        return zhusyn;
    }

    public void setZhusyn(char zhusyn) {
        this.zhusyn = zhusyn;
    }

    public String getZhupid() {
        return zhupid;
    }

    public void setZhupid(String zhupid) {
        this.zhupid = zhupid;
    }

    public Timestamp getZhindt() {
        return zhindt;
    }

    public void setZhindt(Timestamp zhindt) {
        this.zhindt = zhindt;
    }

    public Timestamp getZhupdt() {
        return zhupdt;
    }

    public void setZhupdt(Timestamp zhupdt) {
        this.zhupdt = zhupdt;
    }

    public String getZhtimg2() {
        return zhtimg2;
    }

    public void setZhtimg2(String zhtimg2) {
        this.zhtimg2 = zhtimg2;
    }

    public String getZhcolor() {
        return zhcolor;
    }

    public void setZhcolor(String zhcolor) {
        this.zhcolor = zhcolor;
    }

    public String getZhtimg3() {
        return zhtimg3;
    }

    public void setZhtimg3(String zhtimg3) {
        this.zhtimg3 = zhtimg3;
    }
}
