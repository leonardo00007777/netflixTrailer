package com.x62life.mo.model.StandardInformation;

import java.math.BigDecimal;
import java.sql.Date;
//공급자 상품정보
public class SupplierProductInfo {
    private String sacomp; //회사코드
    private String sasuno; //공급자번호
    private String saartc; //상품코드
    private BigDecimal sacost; //공급단가
    private String authNo; //인증번호(대표)
    private Date authExpiry; //인증기간
    private BigDecimal addressNum; //수수료
    private int saqtor; //최소주문수량
    private int sasafe; //안전재고량
    private int saqttu; //재고상한수량
    private short salead; //리드타임
    private short samcda; //최소대응일수
    private short samada; //최대대응일수
    private short sabust; //안전재고일수
    private char safgqr; //q/r
    private char safome; //예측방법
    private char sauseyn; //사용여부

    public String getSacomp() {
        return sacomp;
    }

    public void setSacomp(String sacomp) {
        this.sacomp = sacomp;
    }

    public String getSasuno() {
        return sasuno;
    }

    public void setSasuno(String sasuno) {
        this.sasuno = sasuno;
    }

    public String getSaartc() {
        return saartc;
    }

    public void setSaartc(String saartc) {
        this.saartc = saartc;
    }

    public BigDecimal getSacost() {
        return sacost;
    }

    public void setSacost(BigDecimal sacost) {
        this.sacost = sacost;
    }

    public String getauthNo() {
        return authNo;
    }

    public void setauthNo(String authNo) {
        this.authNo = authNo;
    }

    public Date getauthExpiry() {
        return authExpiry;
    }

    public void setauthExpiry(Date authExpiry) {
        this.authExpiry = authExpiry;
    }

    public BigDecimal getaddressNum() {
        return addressNum;
    }

    public void setaddressNum(BigDecimal addressNum) {
        this.addressNum = addressNum;
    }

    public int getSaqtor() {
        return saqtor;
    }

    public void setSaqtor(int saqtor) {
        this.saqtor = saqtor;
    }

    public int getSasafe() {
        return sasafe;
    }

    public void setSasafe(int sasafe) {
        this.sasafe = sasafe;
    }

    public int getSaqttu() {
        return saqttu;
    }

    public void setSaqttu(int saqttu) {
        this.saqttu = saqttu;
    }

    public short getSalead() {
        return salead;
    }

    public void setSalead(short salead) {
        this.salead = salead;
    }

    public short getSamcda() {
        return samcda;
    }

    public void setSamcda(short samcda) {
        this.samcda = samcda;
    }

    public short getSamada() {
        return samada;
    }

    public void setSamada(short samada) {
        this.samada = samada;
    }

    public short getSabust() {
        return sabust;
    }

    public void setSabust(short sabust) {
        this.sabust = sabust;
    }

    public char getSafgqr() {
        return safgqr;
    }

    public void setSafgqr(char safgqr) {
        this.safgqr = safgqr;
    }

    public char getSafome() {
        return safome;
    }

    public void setSafome(char safome) {
        this.safome = safome;
    }

    public char getSauseyn() {
        return sauseyn;
    }

    public void setSauseyn(char sauseyn) {
        this.sauseyn = sauseyn;
    }
}
