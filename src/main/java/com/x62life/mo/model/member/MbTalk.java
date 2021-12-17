package com.x62life.mo.model.member;

import java.sql.Timestamp;

/*@Alias("mbTalk")*/
//회원상담
public class MbTalk {
    private int tlkidx; //순번
    private String memcd; //회원번호
    private String divcd1; //상담분류
    private String divcd2; //상담구분
    private String tlkstcd; //상담상태
    private String content; //상담내용
    private String useyn; //잔액
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private String tlkcd; //상담사코드
    private String chargeCd; //담당자지정
    private Timestamp chargeDt; //담당자지정일시
    private String resultMent; //처리내용
    private String resultCd; //처리상태
    private Timestamp resultDt; //처리일시
    private String keyword; //키워드
    private int reputation; //평점
    private String paynum; //결제번호

    public int getTlkidx() {
        return tlkidx;
    }

    public void setTlkidx(int tlkidx) {
        this.tlkidx = tlkidx;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public String getDivcd1() {
        return divcd1;
    }

    public void setDivcd1(String divcd1) {
        this.divcd1 = divcd1;
    }

    public String getDivcd2() {
        return divcd2;
    }

    public void setDivcd2(String divcd2) {
        this.divcd2 = divcd2;
    }

    public String getTlkstcd() {
        return tlkstcd;
    }

    public void setTlkstcd(String tlkstcd) {
        this.tlkstcd = tlkstcd;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getTlkcd() {
        return tlkcd;
    }

    public void setTlkcd(String tlkcd) {
        this.tlkcd = tlkcd;
    }

    public String getChargeCd() {
        return chargeCd;
    }

    public void setChargeCd(String chargeCd) {
        this.chargeCd = chargeCd;
    }

    public Timestamp getChargeDt() {
        return chargeDt;
    }

    public void setChargeDt(Timestamp chargeDt) {
        this.chargeDt = chargeDt;
    }

    public String getResultMent() {
        return resultMent;
    }

    public void setResultMent(String resultMent) {
        this.resultMent = resultMent;
    }

    public String getResultCd() {
        return resultCd;
    }

    public void setResultCd(String resultCd) {
        this.resultCd = resultCd;
    }

    public Timestamp getResultDt() {
        return resultDt;
    }

    public void setResultDt(Timestamp resultDt) {
        this.resultDt = resultDt;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }
}
