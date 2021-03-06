package com.netflix.app.model.sms;

import java.sql.Timestamp;
/*@Alias("smsTemplate")*/
public class SmsTemplate {
    private short id; //순번
    private String msg; //메세지내용
    private String useyn; //사용여부
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
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
}
