package com.x62life.mo.model.member;

import java.sql.Timestamp;

/*@Alias("memberLevel")*/
//회원 멤버십 레벨
public class MemberLevel {
    private String YYYYMM; //연월
    private String memcd; //회원코드
    private String mlevel; //등급코드
    private Timestamp mupdt; //부여일시 "mb_level_master:mvcode 01:씨앗 02:새싹 03:꽃잎 04:열매 05:나무"

    public String getYYYYMM() {
        return YYYYMM;
    }

    public void setYYYYMM(String YYYYMM) {
        this.YYYYMM = YYYYMM;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public String getMlevel() {
        return mlevel;
    }

    public void setMlevel(String mlevel) {
        this.mlevel = mlevel;
    }

    public Timestamp getMupdt() {
        return mupdt;
    }

    public void setMupdt(Timestamp mupdt) {
        this.mupdt = mupdt;
    }
}
