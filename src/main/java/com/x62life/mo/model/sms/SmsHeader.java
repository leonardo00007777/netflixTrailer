package com.x62life.mo.model.sms;

import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;
@Alias("smsHeader")
//sms 헤더
public class SmsHeader {
    private int smsid;
    private String smstitle; //제목
    private String smstext;
    private Timestamp senddate; //전송일시
    private String callback; //회신번호

    public int getSmsid() {
        return smsid;
    }

    public void setSmsid(int smsid) {
        this.smsid = smsid;
    }

    public String getSmstitle() {
        return smstitle;
    }

    public void setSmstitle(String smstitle) {
        this.smstitle = smstitle;
    }

    public String getSmstext() {
        return smstext;
    }

    public void setSmstext(String smstext) {
        this.smstext = smstext;
    }

    public Timestamp getSenddate() {
        return senddate;
    }

    public void setSenddate(Timestamp senddate) {
        this.senddate = senddate;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
