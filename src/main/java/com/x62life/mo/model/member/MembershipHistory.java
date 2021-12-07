package com.x62life.mo.model.member;

import java.sql.Timestamp;

/*@Alias("membershipHistory")*/
//멤버쉽 이력
public class MembershipHistory {
    private int idx; //순번
    private String hpnoHash; //휴대전화 hash
    private String emailHash; //이메일 hash
    private Timestamp indt; //등록일시
    private String memcd; //회원번호
    private String memid; //회원id
    private char withdraw; //탈퇴여부
    private Timestamp wddt; //탈퇴일시

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getHpnoHash() {
        return hpnoHash;
    }

    public void setHpnoHash(String hpnoHash) {
        this.hpnoHash = hpnoHash;
    }

    public String getEmailHash() {
        return emailHash;
    }

    public void setEmailHash(String emailHash) {
        this.emailHash = emailHash;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public char getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(char withdraw) {
        this.withdraw = withdraw;
    }

    public Timestamp getWddt() {
        return wddt;
    }

    public void setWddt(Timestamp wddt) {
        this.wddt = wddt;
    }
}
