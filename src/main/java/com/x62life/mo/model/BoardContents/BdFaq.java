package com.x62life.mo.model.BoardContents;

import java.sql.Timestamp;
//FAQ 게시판
public class BdFaq {
    private int faqidx; //순번
    private char divcd; //구분
    private String title; //질문내용
    private String content; //답변내용
    private char useyn; //사용여부
    private int rcount; //조회수
    private int marks; //만족도
    private int totalmarks; //만족도합계
    private int markscount; //만족도건수
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private String memcd; //등록자코드
    private char storyon; //faq story 게시
    private char start; //첫화면게시

    public int getFaqidx() {
        return faqidx;
    }

    public void setFaqidx(int faqidx) {
        this.faqidx = faqidx;
    }

    public char getDivcd() {
        return divcd;
    }

    public void setDivcd(char divcd) {
        this.divcd = divcd;
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

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getTotalmarks() {
        return totalmarks;
    }

    public void setTotalmarks(int totalmarks) {
        this.totalmarks = totalmarks;
    }

    public int getMarkscount() {
        return markscount;
    }

    public void setMarkscount(int markscount) {
        this.markscount = markscount;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public char getStoryon() {
        return storyon;
    }

    public void setStoryon(char storyon) {
        this.storyon = storyon;
    }

    public char getStart() {
        return start;
    }

    public void setStart(char start) {
        this.start = start;
    }
}
