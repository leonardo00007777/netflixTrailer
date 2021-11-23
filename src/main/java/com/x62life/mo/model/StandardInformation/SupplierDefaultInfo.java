package com.x62life.mo.model.StandardInformation;

import java.math.BigDecimal;
import java.sql.Timestamp;
//공급자 기본정보
public class SupplierDefaultInfo {
    private String sucomp; //회사코드
    private String susuno; //공급자코드
    private String suads1; //주소1
    private String suads2; //주소2
    private String sucdsu; //공급자유형
    private String sunasu; //공급자명
    private String suposu; //우편번호
    private String susdsu; //단축명
    private String sutesu; //전화번호
    private String sucont; //담당자
    private String sucdwh; //주요입고창고
    private String sufxno; //팩스번호
    private String compLicenseNo; //사업자등록번호
    private String compPresident; //대표자명
    private String sucondi; //업태
    private String suitem; //종목/주요아이템
    private String email; //전자우편
    private String websiteUrl; //웹사이트url
    private String authNo; //인증번호(대표)
    private Timestamp indt; //등록일시
    private String usid; //등록자
    private BigDecimal supcpp; //지불비율
    private char suqrfr; //q/r여부
    private BigDecimal sutmsd; //표준배송시간(일)
    private BigDecimal subust; //안전재고(일)
    private BigDecimal sucrst; //긴급재고(일)
    private char sufgvi; //부가세포함여부
    private String stockPurchaseType ; //재고매입유형

    public String getSucomp() {
        return sucomp;
    }

    public void setSucomp(String sucomp) {
        this.sucomp = sucomp;
    }

    public String getSusuno() {
        return susuno;
    }

    public void setSusuno(String susuno) {
        this.susuno = susuno;
    }

    public String getSuads1() {
        return suads1;
    }

    public void setSuads1(String suads1) {
        this.suads1 = suads1;
    }

    public String getSuads2() {
        return suads2;
    }

    public void setSuads2(String suads2) {
        this.suads2 = suads2;
    }

    public String getSucdsu() {
        return sucdsu;
    }

    public void setSucdsu(String sucdsu) {
        this.sucdsu = sucdsu;
    }

    public String getSunasu() {
        return sunasu;
    }

    public void setSunasu(String sunasu) {
        this.sunasu = sunasu;
    }

    public String getSuposu() {
        return suposu;
    }

    public void setSuposu(String suposu) {
        this.suposu = suposu;
    }

    public String getSusdsu() {
        return susdsu;
    }

    public void setSusdsu(String susdsu) {
        this.susdsu = susdsu;
    }

    public String getSutesu() {
        return sutesu;
    }

    public void setSutesu(String sutesu) {
        this.sutesu = sutesu;
    }

    public String getSucont() {
        return sucont;
    }

    public void setSucont(String sucont) {
        this.sucont = sucont;
    }

    public String getSucdwh() {
        return sucdwh;
    }

    public void setSucdwh(String sucdwh) {
        this.sucdwh = sucdwh;
    }

    public String getSufxno() {
        return sufxno;
    }

    public void setSufxno(String sufxno) {
        this.sufxno = sufxno;
    }

    public String getCompLicenseNo() {
        return compLicenseNo;
    }

    public void setCompLicenseNo(String compLicenseNo) {
        this.compLicenseNo = compLicenseNo;
    }

    public String getCompPresident() {
        return compPresident;
    }

    public void setCompPresident(String compPresident) {
        this.compPresident = compPresident;
    }

    public String getSucondi() {
        return sucondi;
    }

    public void setSucondi(String sucondi) {
        this.sucondi = sucondi;
    }

    public String getSuitem() {
        return suitem;
    }

    public void setSuitem(String suitem) {
        this.suitem = suitem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getAuthNo() {
        return authNo;
    }

    public void setAuthNo(String authNo) {
        this.authNo = authNo;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public BigDecimal getSupcpp() {
        return supcpp;
    }

    public void setSupcpp(BigDecimal supcpp) {
        this.supcpp = supcpp;
    }

    public char getSuqrfr() {
        return suqrfr;
    }

    public void setSuqrfr(char suqrfr) {
        this.suqrfr = suqrfr;
    }

    public BigDecimal getSutmsd() {
        return sutmsd;
    }

    public void setSutmsd(BigDecimal sutmsd) {
        this.sutmsd = sutmsd;
    }

    public BigDecimal getSubust() {
        return subust;
    }

    public void setSubust(BigDecimal subust) {
        this.subust = subust;
    }

    public BigDecimal getSucrst() {
        return sucrst;
    }

    public void setSucrst(BigDecimal sucrst) {
        this.sucrst = sucrst;
    }

    public char getSufgvi() {
        return sufgvi;
    }

    public void setSufgvi(char sufgvi) {
        this.sufgvi = sufgvi;
    }

    public String getStockPurchaseType() {
        return stockPurchaseType;
    }

    public void setStockPurchaseType(String stockPurchaseType) {
        this.stockPurchaseType = stockPurchaseType;
    }
}
