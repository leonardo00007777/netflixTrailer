package com.x62life.mo.model.boardcontents;

import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;
//crm 공지사항
@Alias("bdNoticeCrm")
public class BdNoticeCrm {
    private int ntcidx; //순번
    private String title; //제목
    private String content; //내용
    private int hitcnt; //조회수
    private short important; //중요도
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private char useyn; //사용여부
    private String grpcd; //열람범위

    public int getNtcidx() {
        return ntcidx;
    }

    public void setNtcidx(int ntcidx) {
        this.ntcidx = ntcidx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getHitcnt() {
        return hitcnt;
    }

    public void setHitcnt(int hitcnt) {
        this.hitcnt = hitcnt;
    }

    public short getImportant() {
        return important;
    }

    public void setImportant(short important) {
        this.important = important;
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

    public char getUseyn() {
        return useyn;
    }

    public void setUseyn(char useyn) {
        this.useyn = useyn;
    }

    public String getGrpcd() {
        return grpcd;
    }

    public void setGrpcd(String grpcd) {
        this.grpcd = grpcd;
    }
}
