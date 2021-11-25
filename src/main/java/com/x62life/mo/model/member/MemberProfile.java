package com.x62life.mo.model.member;

public class MemberProfile {
    private String memid; //회원id
    private String memcd; //회원번호
    private String nickn; //회원명
    private String ppath; //프로필경로
    private String smemo; //메모
    private String idurl; //id경로
    private char smode; //
    private short memlevel; //멤버쉽레벨
    private String jobtype; //담당업무유형
    private String jobname; //담당업무명
    private char isblogger; //블로그여부

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public String getNickn() {
        return nickn;
    }

    public void setNickn(String nickn) {
        this.nickn = nickn;
    }

    public String getPpath() {
        return ppath;
    }

    public void setPpath(String ppath) {
        this.ppath = ppath;
    }

    public String getSmemo() {
        return smemo;
    }

    public void setSmemo(String smemo) {
        this.smemo = smemo;
    }

    public String getIdurl() {
        return idurl;
    }

    public void setIdurl(String idurl) {
        this.idurl = idurl;
    }

    public char getSmode() {
        return smode;
    }

    public void setSmode(char smode) {
        this.smode = smode;
    }

    public short getMemlevel() {
        return memlevel;
    }

    public void setMemlevel(short memlevel) {
        this.memlevel = memlevel;
    }

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public char getIsblogger() {
        return isblogger;
    }

    public void setIsblogger(char isblogger) {
        this.isblogger = isblogger;
    }
}