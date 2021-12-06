package com.x62life.mo.model.sms;

//sms 전송 대상
public class SmsSendLine {
    private int seqno;
    private int smsid;
    private String targetphone; //전송전화번호
    private String targetname; //고객명
    private String grpcd;
    private String memcd;

    public int getSeqno() {
        return seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    public int getSmsid() {
        return smsid;
    }

    public void setSmsid(int smsid) {
        this.smsid = smsid;
    }

    public String getTargetphone() {
        return targetphone;
    }

    public void setTargetphone(String targetphone) {
        this.targetphone = targetphone;
    }

    public String getTargetname() {
        return targetname;
    }

    public void setTargetname(String targetname) {
        this.targetname = targetname;
    }

    public String getGrpcd() {
        return grpcd;
    }

    public void setGrpcd(String grpcd) {
        this.grpcd = grpcd;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }
}
