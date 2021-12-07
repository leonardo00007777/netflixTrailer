package com.x62life.mo.model.product;

import java.sql.Timestamp;
//상품 입고 기본정보
/*@Alias("gdHeader")*/
public class GdHeader {
    private String ghno; //입고번호
    private String ghcdwh; //입고창고코드
    private String ghcdty; //입고유형
    private String ghcdst; //입고상태
    private Timestamp ghactd; //입고등록현재일시
    private Timestamp ghcomd; //입고등록일시
    private String ghusid; //등록자id

    public String getGhno() {
        return ghno;
    }

    public void setGhno(String ghno) {
        this.ghno = ghno;
    }

    public String getGhcdwh() {
        return ghcdwh;
    }

    public void setGhcdwh(String ghcdwh) {
        this.ghcdwh = ghcdwh;
    }

    public String getGhcdty() {
        return ghcdty;
    }

    public void setGhcdty(String ghcdty) {
        this.ghcdty = ghcdty;
    }

    public String getGhcdst() {
        return ghcdst;
    }

    public void setGhcdst(String ghcdst) {
        this.ghcdst = ghcdst;
    }

    public Timestamp getGhactd() {
        return ghactd;
    }

    public void setGhactd(Timestamp ghactd) {
        this.ghactd = ghactd;
    }

    public Timestamp getGhcomd() {
        return ghcomd;
    }

    public void setGhcomd(Timestamp ghcomd) {
        this.ghcomd = ghcomd;
    }

    public String getGhusid() {
        return ghusid;
    }

    public void setGhusid(String ghusid) {
        this.ghusid = ghusid;
    }
}
