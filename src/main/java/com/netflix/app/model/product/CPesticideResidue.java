package com.netflix.app.model.product;

import java.sql.Date;
import java.sql.Timestamp;
/*@Alias("cPesticideResidue")*/
//안정성 테스트정보
public class CPesticideResidue {
    private int testidx; //안전성테스트 일련번호
    private Timestamp testddate; //검사완료일시
    private String testano; //접수번호
    private Timestamp testrdate; //접수일시
    private String testrno; //의뢰번호
    private String testitem; //품목명
    private String testproducer; //생산자(명)
    private String efapflag; //친환경구분 (cd_master.cdtype:09 [10:유기농산물, 20:무농약농산물, 40:저농약농산물])
    private String testjudge; //판정결과 (g/b)
    private String testpath; //성적서파일명 (위치)
    private Date regdate; //등록일시
    private String regid; //등록자
    private String useyn; //사용여부

    public int getTestidx() {
        return testidx;
    }

    public void setTestidx(int testidx) {
        this.testidx = testidx;
    }

    public Timestamp getTestddate() {
        return testddate;
    }

    public void setTestddate(Timestamp testddate) {
        this.testddate = testddate;
    }

    public String getTestano() {
        return testano;
    }

    public void setTestano(String testano) {
        this.testano = testano;
    }

    public Timestamp getTestrdate() {
        return testrdate;
    }

    public void setTestrdate(Timestamp testrdate) {
        this.testrdate = testrdate;
    }

    public String getTestrno() {
        return testrno;
    }

    public void setTestrno(String testrno) {
        this.testrno = testrno;
    }

    public String getTestitem() {
        return testitem;
    }

    public void setTestitem(String testitem) {
        this.testitem = testitem;
    }

    public String getTestproducer() {
        return testproducer;
    }

    public void setTestproducer(String testproducer) {
        this.testproducer = testproducer;
    }

    public String getEfapflag() {
        return efapflag;
    }

    public void setEfapflag(String efapflag) {
        this.efapflag = efapflag;
    }

    public String getTestjudge() {
        return testjudge;
    }

    public void setTestjudge(String testjudge) {
        this.testjudge = testjudge;
    }

    public String getTestpath() {
        return testpath;
    }

    public void setTestpath(String testpath) {
        this.testpath = testpath;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getRegid() {
        return regid;
    }

    public void setRegid(String regid) {
        this.regid = regid;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }
}
