package com.x62life.mo.model.member;

import java.sql.Timestamp;

/*@Alias("mbJoinHistory")*/
//회원 가입 이력
public class MbJoinHistory {
    private int idx; //순번
    private Timestamp indt; //등록일시
    private char pcertdi; //인증키

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public char getPcertdi() {
        return pcertdi;
    }

    public void setPcertdi(char pcertdi) {
        this.pcertdi = pcertdi;
    }
}
