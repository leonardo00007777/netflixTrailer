package com.netflix.app.model.boardcontents;

import java.sql.Timestamp;
//scm 공지사항

/*@Alias("bdNoticeScm")*/
public class BdNoticeScm {
    private int ntcidx; //순번
    private String title; //제목
    private String content; //내용
    private int hitcnt; //조회수
    private short important; //중요도
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private String useyn; //사용여부
    private String suppno; //열람대상
    private String show; //게시방법

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

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }

    public String getSuppno() {
        return suppno;
    }

    public void setSuppno(String suppno) {
        this.suppno = suppno;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }
}
