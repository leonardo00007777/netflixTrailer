package com.x62life.mo.model.boardcontents;

import org.apache.ibatis.type.Alias;

@Alias("magazineLEx")
public class MagazineLEx extends MagazineL{
    String thumbimg2;
    String thumbimg3;
    String memid;
    String idx;

    public String getThumbimg2() {
        return thumbimg2;
    }

    public void setThumbimg2(String thumbimg2) {
        this.thumbimg2 = thumbimg2;
    }

    public String getThumbimg3() {
        return thumbimg3;
    }

    public void setThumbimg3(String thumbimg3) {
        this.thumbimg3 = thumbimg3;
    }

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }
}
