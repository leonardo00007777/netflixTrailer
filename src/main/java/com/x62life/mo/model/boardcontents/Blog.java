package com.x62life.mo.model.boardcontents;

import java.sql.Timestamp;
//블로그
/*@Alias("blog")*/
public class Blog {
    private int seqno; //순번 순번
    private int idx; //작성자순번 작성자순번
    private String memid; //작성자 작성자
    private String bgroup; //카테고리 카테고리
    private String btitle; //제목 제목
    private String bbody; //글내용 글내용
    private String brip; //작성ip 작성ip
    private Timestamp brdate; //작성일시 작성일시
    private short bagree;
    private short boppose;
    private short breplies; //댓글건수 댓글건수
    private int bviews; //조회수 조회수
    private String bnoticelv;
    private char bblind; //blind처리 blind처리
    private String btrackback;
    private String thumbimg; //썸네일이미지명 썸네일이미지명

    public int getSeqno() {
        return seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public String getBgroup() {
        return bgroup;
    }

    public void setBgroup(String bgroup) {
        this.bgroup = bgroup;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBbody() {
        return bbody;
    }

    public void setBbody(String bbody) {
        this.bbody = bbody;
    }

    public String getBrip() {
        return brip;
    }

    public void setBrip(String brip) {
        this.brip = brip;
    }

    public Timestamp getBrdate() {
        return brdate;
    }

    public void setBrdate(Timestamp brdate) {
        this.brdate = brdate;
    }

    public short getBagree() {
        return bagree;
    }

    public void setBagree(short bagree) {
        this.bagree = bagree;
    }

    public short getBoppose() {
        return boppose;
    }

    public void setBoppose(short boppose) {
        this.boppose = boppose;
    }

    public short getBreplies() {
        return breplies;
    }

    public void setBreplies(short breplies) {
        this.breplies = breplies;
    }

    public int getBviews() {
        return bviews;
    }

    public void setBviews(int bviews) {
        this.bviews = bviews;
    }

    public String getBnoticelv() {
        return bnoticelv;
    }

    public void setBnoticelv(String bnoticelv) {
        this.bnoticelv = bnoticelv;
    }

    public char getBblind() {
        return bblind;
    }

    public void setBblind(char bblind) {
        this.bblind = bblind;
    }

    public String getBtrackback() {
        return btrackback;
    }

    public void setBtrackback(String btrackback) {
        this.btrackback = btrackback;
    }

    public String getThumbimg() {
        return thumbimg;
    }

    public void setThumbimg(String thumbimg) {
        this.thumbimg = thumbimg;
    }
}
