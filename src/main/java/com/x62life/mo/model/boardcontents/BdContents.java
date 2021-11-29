package com.x62life.mo.model.boardcontents;

import java.sql.Timestamp;
//게시판 컨텐츠
public class BdContents {
    private int ctsidx; //순번
    private char ctscd; //게시판코드
    private String title; //제목
    private String content; //글내용
    private char useyn; //사용여부
    private String indt; //등록일시
    private int rcount; //조회수
    private char topyn; //top게시여부
    private String fromdate; //게시 시작일
    private String todate; //게시 종료일
    private Timestamp dday; //지정일
    private String thumbimg; //썸네일이미지명
    private String grpcd; //(공개)적용고객

    public int getCtsidx() {
        return ctsidx;
    }

    public void setCtsidx(int ctsidx) {
        this.ctsidx = ctsidx;
    }

    public char getCtscd() {
        return ctscd;
    }

    public void setCtscd(char ctscd) {
        this.ctscd = ctscd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public char getUseyn() {
        return useyn;
    }

    public void setUseyn(char useyn) {
        this.useyn = useyn;
    }

    public String getIndt() {
        return indt;
    }

    public void setIndt(String indt) {
        this.indt = indt;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public char getTopyn() {
        return topyn;
    }

    public void setTopyn(char topyn) {
        this.topyn = topyn;
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public Timestamp getDday() {
        return dday;
    }

    public void setDday(Timestamp dday) {
        this.dday = dday;
    }

    public String getThumbimg() {
        return thumbimg;
    }

    public void setThumbimg(String thumbimg) {
        this.thumbimg = thumbimg;
    }

    public String getGrpcd() {
        return grpcd;
    }

    public void setGrpcd(String grpcd) {
        this.grpcd = grpcd;
    }
}
