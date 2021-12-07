package com.x62life.mo.model.category;

import java.sql.Timestamp;

/*@Alias("CartRecipe")*/
public class CartRecipe {
    private int hseqno;
    private String memcd;
    private String titlex;
    private String hmemo;
    private String pic1;
    private String pic2;
    private String pic3;
    private String pic4;
    private String pic5;
    private int icount;
    private int scount;
    private int rcount;
    private String indt;
    private Timestamp updt;
    private char share;
    private int lseqno;
    private int lno;
    private String gdcd;
    private int gdqty;
    private String lmemo;


    public int getHseqno() {
        return hseqno;
    }

    public void setHseqno(int hseqno) {
        this.hseqno = hseqno;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public String getTitlex() {
        return titlex;
    }

    public void setTitlex(String titlex) {
        this.titlex = titlex;
    }

    public String getHmemo() {
        return hmemo;
    }

    public void setHmemo(String hmemo) {
        this.hmemo = hmemo;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4;
    }

    public String getPic5() {
        return pic5;
    }

    public void setPic5(String pic5) {
        this.pic5 = pic5;
    }

    public int getIcount() {
        return icount;
    }

    public void setIcount(int icount) {
        this.icount = icount;
    }

    public int getScount() {
        return scount;
    }

    public void setScount(int scount) {
        this.scount = scount;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public String getIndt() {
        return indt;
    }

    public void setIndt(String indt) {
        this.indt = indt;
    }

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }

    public char getShare() {
        return share;
    }

    public void setShare(char share) {
        this.share = share;
    }

    public int getLseqno() {
        return lseqno;
    }

    public void setLseqno(int lseqno) {
        this.lseqno = lseqno;
    }

    public int getLno() {
        return lno;
    }

    public void setLno(int lno) {
        this.lno = lno;
    }

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public int getGdqty() {
        return gdqty;
    }

    public void setGdqty(int gdqty) {
        this.gdqty = gdqty;
    }

    public String getLmemo() {
        return lmemo;
    }

    public void setLmemo(String lmemo) {
        this.lmemo = lmemo;
    }
}
