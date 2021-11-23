package com.x62life.mo.model.BoardContents;

import java.sql.Timestamp;
//댓글
public class BasicCommnets {
    private int rseqno;
    private String rtype; //태그유형
    private String rid; //태그유형테이블명
    private String ridx; //게시판idx
    private int rrseqno;
    private short rdepth; //depth
    private String rtitle;
    private String rmemo; //내용
    private String rwip; //작성자ip
    private String rwuid; //회원id
    private Timestamp rdatex;
    private short ragree;
    private short roppose;
    private char rblind;
    private String device;
    private char grade;

    public int getRseqno() {
        return rseqno;
    }

    public void setRseqno(int rseqno) {
        this.rseqno = rseqno;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRidx() {
        return ridx;
    }

    public void setRidx(String ridx) {
        this.ridx = ridx;
    }

    public int getRrseqno() {
        return rrseqno;
    }

    public void setRrseqno(int rrseqno) {
        this.rrseqno = rrseqno;
    }

    public short getRdepth() {
        return rdepth;
    }

    public void setRdepth(short rdepth) {
        this.rdepth = rdepth;
    }

    public String getRtitle() {
        return rtitle;
    }

    public void setRtitle(String rtitle) {
        this.rtitle = rtitle;
    }

    public String getRmemo() {
        return rmemo;
    }

    public void setRmemo(String rmemo) {
        this.rmemo = rmemo;
    }

    public String getRwip() {
        return rwip;
    }

    public void setRwip(String rwip) {
        this.rwip = rwip;
    }

    public String getRwuid() {
        return rwuid;
    }

    public void setRwuid(String rwuid) {
        this.rwuid = rwuid;
    }

    public Timestamp getRdatex() {
        return rdatex;
    }

    public void setRdatex(Timestamp rdatex) {
        this.rdatex = rdatex;
    }

    public short getRagree() {
        return ragree;
    }

    public void setRagree(short ragree) {
        this.ragree = ragree;
    }

    public short getRoppose() {
        return roppose;
    }

    public void setRoppose(short roppose) {
        this.roppose = roppose;
    }

    public char getRblind() {
        return rblind;
    }

    public void setRblind(char rblind) {
        this.rblind = rblind;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
