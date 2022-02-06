package com.netflix.app.model.login;

import java.sql.Timestamp;

/*@Alias("memberTwalkLogin")*/
//twalk 로그인
public class MemberTwalkLogin {
    private String twMemcd; //회원번호
    private String twPid; //t-work id
    private Timestamp twIndt; //등록일시

    public String getTwMemcd() {
        return twMemcd;
    }

    public void setTwMemcd(String twMemcd) {
        this.twMemcd = twMemcd;
    }

    public String getTwPid() {
        return twPid;
    }

    public void setTwPid(String twPid) {
        this.twPid = twPid;
    }

    public Timestamp getTwIndt() {
        return twIndt;
    }

    public void setTwIndt(Timestamp twIndt) {
        this.twIndt = twIndt;
    }
}
