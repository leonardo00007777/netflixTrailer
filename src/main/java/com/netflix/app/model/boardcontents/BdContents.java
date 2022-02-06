package com.netflix.app.model.boardcontents;

import java.sql.Timestamp;
//게시판 컨텐츠
/*@Alias("bdContents")*/
public class BdContents {
    private int ctsidx; //순번
    private String ctscd; //게시판코드
    private String title; //제목
    private String content; //글내용
    private String useyn; //사용여부
    private String indt; //등록일시
    private int rcount; //조회수
    private String topyn; //top게시여부
    private String fromdate; //게시 시작일
    private String todate; //게시 종료일
    private Timestamp dday; //지정일
    private String thumbimg; //썸네일이미지명
    private String thumbimg2;
    private String thumbimg3;
    private int ingyn;
    private String grpcd; //(공개)적용고객

    public int getCtsidx() {
        return ctsidx;
    }

    public void setCtsidx(int ctsidx) {
        this.ctsidx = ctsidx;
    }

    public String getCtscd() {
        return ctscd;
    }

    public void setCtscd(String ctscd) {
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

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
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

    public String getTopyn() {
        return topyn;
    }

    public void setTopyn(String topyn) {
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

    public String getThumbimg2() {
        return thumbimg2;
    }

    public void setThumbimg2(String thumbimg2) {
        this.thumbimg2 = thumbimg2;
    }

    public String getThumbimg3() {
        return thumbimg3;
    }

    public void setThumbimg3(String thumbimg3) {
        this.thumbimg3 = thumbimg3;
    }

    public int getIngyn() {
        return ingyn;
    }

    public void setIngyn(int ingyn) {
        this.ingyn = ingyn;
    }

    public String getGrpcd() {
        return grpcd;
    }

    public void setGrpcd(String grpcd) {
        this.grpcd = grpcd;
    }
}
