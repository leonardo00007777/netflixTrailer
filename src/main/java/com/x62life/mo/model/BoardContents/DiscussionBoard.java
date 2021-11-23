package com.x62life.mo.model.BoardContents;

import java.sql.Timestamp;

//토론게시판
public class DiscussionBoard {
    private int idx; //순번
    private Timestamp datex; //등록일시
    private String writer; //회원코드
    private String titlex; //제목
    private String contents; //내용
    private int viewcount; //조회수
    private short agree;
    private short oppose;
    private short replies;
    private Timestamp todate; //종료일시
    private char useyn;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public Timestamp getDatex() {
        return datex;
    }

    public void setDatex(Timestamp datex) {
        this.datex = datex;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitlex() {
        return titlex;
    }

    public void setTitlex(String titlex) {
        this.titlex = titlex;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getViewcount() {
        return viewcount;
    }

    public void setViewcount(int viewcount) {
        this.viewcount = viewcount;
    }

    public short getAgree() {
        return agree;
    }

    public void setAgree(short agree) {
        this.agree = agree;
    }

    public short getOppose() {
        return oppose;
    }

    public void setOppose(short oppose) {
        this.oppose = oppose;
    }

    public short getReplies() {
        return replies;
    }

    public void setReplies(short replies) {
        this.replies = replies;
    }

    public Timestamp getTodate() {
        return todate;
    }

    public void setTodate(Timestamp todate) {
        this.todate = todate;
    }

    public char getUseyn() {
        return useyn;
    }

    public void setUseyn(char useyn) {
        this.useyn = useyn;
    }
}
