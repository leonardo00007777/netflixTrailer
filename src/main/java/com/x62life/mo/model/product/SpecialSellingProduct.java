package com.x62life.mo.model.product;

//기획전 상품
/*@Alias("specialSellingProduct")*/
public class SpecialSellingProduct {
    private int slidx; //순번
    private String slgdcd; //상품코드
    private String slgdiv1; //상품 카테고리1
    private String slgdiv2; //상품 카테고리2
    private char sltop; //top게시
    private String slnote; //상품간략설명
    private String shmcd; //등록자코드
    private String slcat; //카테고리
    private String slsort; //정렬

    public int getSlidx() {
        return slidx;
    }

    public void setSlidx(int slidx) {
        this.slidx = slidx;
    }

    public String getSlgdcd() {
        return slgdcd;
    }

    public void setSlgdcd(String slgdcd) {
        this.slgdcd = slgdcd;
    }

    public String getSlgdiv1() {
        return slgdiv1;
    }

    public void setSlgdiv1(String slgdiv1) {
        this.slgdiv1 = slgdiv1;
    }

    public String getSlgdiv2() {
        return slgdiv2;
    }

    public void setSlgdiv2(String slgdiv2) {
        this.slgdiv2 = slgdiv2;
    }

    public char getSltop() {
        return sltop;
    }

    public void setSltop(char sltop) {
        this.sltop = sltop;
    }

    public String getSlnote() {
        return slnote;
    }

    public void setSlnote(String slnote) {
        this.slnote = slnote;
    }

    public String getShmcd() {
        return shmcd;
    }

    public void setShmcd(String shmcd) {
        this.shmcd = shmcd;
    }

    public String getSlcat() {
        return slcat;
    }

    public void setSlcat(String slcat) {
        this.slcat = slcat;
    }

    public String getSlsort() {
        return slsort;
    }

    public void setSlsort(String slsort) {
        this.slsort = slsort;
    }
}
