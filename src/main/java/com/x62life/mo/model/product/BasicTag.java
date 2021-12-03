package com.x62life.mo.model.product;

import org.apache.ibatis.type.Alias;

import java.sql.Date;
@Alias("basicTag")
//기본태그
public class BasicTag {
    private int btidx; //태그인덱스
    private String btname; //태그명
    private int btcount; //검색카운트
    private String btuid; //등록자
    private Date btdate; //등록일시

    public int getBtidx() {
        return btidx;
    }

    public void setBtidx(int btidx) {
        this.btidx = btidx;
    }

    public String getBtname() {
        return btname;
    }

    public void setBtname(String btname) {
        this.btname = btname;
    }

    public int getBtcount() {
        return btcount;
    }

    public void setBtcount(int btcount) {
        this.btcount = btcount;
    }

    public String getBtuid() {
        return btuid;
    }

    public void setBtuid(String btuid) {
        this.btuid = btuid;
    }

    public Date getBtdate() {
        return btdate;
    }

    public void setBtdate(Date btdate) {
        this.btdate = btdate;
    }
}
