package com.x62life.mo.model.product;

import java.sql.Timestamp;

/*@Alias("productReview")*/
public class ProductReview {
    private int rseqno; //상품평일련번호
    private String rtype;
    private String rid;
    private String ridx; //상품코드
    private int rrseqno;
    private short rdepth;
    private String rtitle;
    private String rmemo; //상품평
    private String rwip; //작성자ip
    private String rwuid; //회원아이디
    private Timestamp rdatex; //등록일자
    private short ragree;
    private short roppose;
    private char rblind;
    private String device;
    private char grade; //평점
    private char ordnum; //주문번호

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

    public char getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(char ordnum) {
        this.ordnum = ordnum;
    }
}
