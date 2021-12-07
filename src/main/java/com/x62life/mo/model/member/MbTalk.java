package com.x62life.mo.model.member;

import java.sql.Timestamp;

/*@Alias("mbTalk")*/
//회원상담
public class MbTalk {
    private int tlkidx; //순번
    private char memcd; //회원번호
    private char divcd1; //상담분류
    private char divcd2; //상담구분
    private char tlkstcd; //상담상태
    private String content; //상담내용
    private char useyn; //잔액
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private char tlkcd; //상담사코드
    private char chargeCd; //담당자지정
    private Timestamp chargeDt; //담당자지정일시
    private String resultMent; //처리내용
    private char resultCd; //처리상태
    private Timestamp resultDt; //처리일시
    private String keyword; //키워드
    private int reputation; //평점
    private char paynum; //결제번호

    public int getTlkidx() {
        return tlkidx;
    }

    public void setTlkidx(int tlkidx) {
        this.tlkidx = tlkidx;
    }

    public char getMemcd() {
        return memcd;
    }

    public void setMemcd(char memcd) {
        this.memcd = memcd;
    }

    public char getDivcd1() {
        return divcd1;
    }

    public void setDivcd1(char divcd1) {
        this.divcd1 = divcd1;
    }

    public char getDivcd2() {
        return divcd2;
    }

    public void setDivcd2(char divcd2) {
        this.divcd2 = divcd2;
    }

    public char getTlkstcd() {
        return tlkstcd;
    }

    public void setTlkstcd(char tlkstcd) {
        this.tlkstcd = tlkstcd;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public char getUseyn() {
        return useyn;
    }

    public void setUseyn(char useyn) {
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

    public char getTlkcd() {
        return tlkcd;
    }

    public void setTlkcd(char tlkcd) {
        this.tlkcd = tlkcd;
    }

    public char getChargeCd() {
        return chargeCd;
    }

    public void setChargeCd(char chargeCd) {
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

    public char getResultCd() {
        return resultCd;
    }

    public void setResultCd(char resultCd) {
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

    public char getPaynum() {
        return paynum;
    }

    public void setPaynum(char paynum) {
        this.paynum = paynum;
    }
}
