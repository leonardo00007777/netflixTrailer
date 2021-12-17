package com.x62life.mo.model.boardcontents;

import java.sql.Timestamp;
//FAQ 게시판
/*@Alias("bdFaq")*/
public class BdFaq {
    private int faqidx; //순번
    private String divcd; //구분
    private String title; //질문내용
    private byte[] content; //답변내용
    private String useyn; //사용여부
    private int rcount; //조회수
    private int marks; //만족도
    private int totalmarks; //만족도합계
    private int markscount; //만족도건수
    private String indt; //등록일시
    private Timestamp updt; //수정일시
    private String memcd; //등록자코드
    private String storyon; //faq story 게시
    private String start; //첫화면게시
    private int page;
    private int maxpage;
    private int cnt;

    public int getFaqidx() {
        return faqidx;
    }

    public void setFaqidx(int faqidx) {
        this.faqidx = faqidx;
    }

    public String getDivcd() {
        return divcd;
    }

    public void setDivcd(String divcd) {
        this.divcd = divcd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
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

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public String getStoryon() {
        return storyon;
    }

    public void setStoryon(String storyon) {
        this.storyon = storyon;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getMaxpage() {
        return maxpage;
    }

    public void setMaxpage(int maxpage) {
        this.maxpage = maxpage;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
