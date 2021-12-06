package com.x62life.mo.model.exhibition;

import java.sql.Timestamp;
//메인광고
public class AdMainMg {
    private int seq; //순번
    private String title; //제목
    private String imgSrc; //데스크탑 이미지 파일명
    private String imgSrcM; //모바일 이미지 파일명
    private String url; //경로
    private char useYn; //사용여부
    private char applyYn; //
    private Timestamp registDt; //등록일시
    private Timestamp updateDt; //변경일시
    private char topx; //
    private Timestamp sdate; //(전시)적용 시작일시
    private Timestamp edate; //(전시)적용 종료일시
    private short important; //게시순위

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getimgSrc() {
        return imgSrc;
    }

    public void setimgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getimgSrcM() {
        return imgSrcM;
    }

    public void setimgSrcM(String imgSrcM) {
        this.imgSrcM = imgSrcM;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public char getuseYn() {
        return useYn;
    }

    public void setuseYn(char useYn) {
        this.useYn = useYn;
    }

    public char getapplyYn() {
        return applyYn;
    }

    public void setapplyYn(char applyYn) {
        this.applyYn = applyYn;
    }

    public Timestamp getregistDt() {
        return registDt;
    }

    public void setregistDt(Timestamp registDt) {
        this.registDt = registDt;
    }

    public Timestamp getupdateDt() {
        return updateDt;
    }

    public void setupdateDt(Timestamp updateDt) {
        this.updateDt = updateDt;
    }

    public char getTopx() {
        return topx;
    }

    public void setTopx(char topx) {
        this.topx = topx;
    }

    public Timestamp getSdate() {
        return sdate;
    }

    public void setSdate(Timestamp sdate) {
        this.sdate = sdate;
    }

    public Timestamp getEdate() {
        return edate;
    }

    public void setEdate(Timestamp edate) {
        this.edate = edate;
    }

    public short getImportant() {
        return important;
    }

    public void setImportant(short important) {
        this.important = important;
    }
}
