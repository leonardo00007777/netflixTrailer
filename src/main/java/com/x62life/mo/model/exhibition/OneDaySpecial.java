package com.x62life.mo.model.exhibition;

import java.sql.Timestamp;

/*@Alias("oneDaySpecial")*/
//오늘의 특가
public class OneDaySpecial {
    private int idx; //순번
    private Timestamp startdt; //시행시작일
    private Timestamp enddt; //시행종료일
    private String gdcd; //상품코드
    private String opt; //특가유형
    private String note; //설명
    private Timestamp indt; //등록일시
    private String uscd; //등록자
    private String gdname1; //상품명1
    private String gdname2; //상품명2
    private int gdlimit; //한정수량
    private String target;
    private String supname;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public Timestamp getStartdt() {
        return startdt;
    }

    public void setStartdt(Timestamp startdt) {
        this.startdt = startdt;
    }

    public Timestamp getEnddt() {
        return enddt;
    }

    public void setEnddt(Timestamp enddt) {
        this.enddt = enddt;
    }

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public String getOpt() {
        return opt;
    }

    public void setOpt(String opt) {
        this.opt = opt;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public String getUscd() {
        return uscd;
    }

    public void setUscd(String uscd) {
        this.uscd = uscd;
    }

    public String getGdname1() {
        return gdname1;
    }

    public void setGdname1(String gdname1) {
        this.gdname1 = gdname1;
    }

    public String getGdname2() {
        return gdname2;
    }

    public void setGdname2(String gdname2) {
        this.gdname2 = gdname2;
    }

    public int getGdlimit() {
        return gdlimit;
    }

    public void setGdlimit(int gdlimit) {
        this.gdlimit = gdlimit;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname;
    }
}
