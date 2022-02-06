package com.netflix.app.model.standardinfo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
/*@Alias("supplierProductPaymentInfo")*/
//공급자 결제 정보
public class SupplierProductPaymentInfo {
    private String macomp; //회사코드
    private String maagno; //구매계약번호
    private String maagde; //
    private String mastat; //계약상태
    private Timestamp madtst; //계약기간시작일시
    private Timestamp madten; //계약기간종료일시
    private String masuno; //공급자번호
    private String maartc; //상품코드
    private BigDecimal maqtag; //
    private BigDecimal macost; //입고단가
    private BigDecimal maqttd; //
    private BigDecimal macomm; //수수료

    public String getMacomp() {
        return macomp;
    }

    public void setMacomp(String macomp) {
        this.macomp = macomp;
    }

    public String getMaagno() {
        return maagno;
    }

    public void setMaagno(String maagno) {
        this.maagno = maagno;
    }

    public String getMaagde() {
        return maagde;
    }

    public void setMaagde(String maagde) {
        this.maagde = maagde;
    }

    public String getMastat() {
        return mastat;
    }

    public void setMastat(String mastat) {
        this.mastat = mastat;
    }

    public Timestamp getMadtst() {
        return madtst;
    }

    public void setMadtst(Timestamp madtst) {
        this.madtst = madtst;
    }

    public Timestamp getMadten() {
        return madten;
    }

    public void setMadten(Timestamp madten) {
        this.madten = madten;
    }

    public String getMasuno() {
        return masuno;
    }

    public void setMasuno(String masuno) {
        this.masuno = masuno;
    }

    public String getMaartc() {
        return maartc;
    }

    public void setMaartc(String maartc) {
        this.maartc = maartc;
    }

    public BigDecimal getMaqtag() {
        return maqtag;
    }

    public void setMaqtag(BigDecimal maqtag) {
        this.maqtag = maqtag.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getMacost() {
        return macost;
    }

    public void setMacost(BigDecimal macost) {
        this.macost = macost.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getMaqttd() {
        return maqttd;
    }

    public void setMaqttd(BigDecimal maqttd) {
        this.maqttd = maqttd.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getMacomm() {
        return macomm;
    }

    public void setMacomm(BigDecimal macomm) {
        this.macomm = macomm.setScale(0, RoundingMode.DOWN);
    }
}
