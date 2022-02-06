package com.netflix.app.model.payment;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;

/*@Alias("couponVoucher")*/
//쿠폰 바우처
public class CouponVoucher {
    private int idx; //순번
    private String certificateno; //인증번호(k2)
    private Timestamp issuedate; //발행일
    private String serialno; //일련번호
    private BigDecimal facevalue; //액면가(포인트)
    private String vtype; //유형
    private String isused; //사용여부
    private Timestamp registerdate; //등록일시
    private String memcd; //사용자코드
    private BigDecimal currentvalue; //현재사용금액
    private Timestamp expirydate; //유효일자
    private Timestamp lastusedate; //최근사용일시
    private String receivername; //계약자명
    private String memo; //메모
    private String useplace; //교부처

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getCertificateno() {
        return certificateno;
    }

    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno;
    }

    public Timestamp getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Timestamp issuedate) {
        this.issuedate = issuedate;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public BigDecimal getFacevalue() {
        return facevalue;
    }

    public void setFacevalue(BigDecimal facevalue) {
        this.facevalue = facevalue.setScale(0, RoundingMode.DOWN);
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }

    public String getIsused() {
        return isused;
    }

    public void setIsused(String isused) {
        this.isused = isused;
    }

    public Timestamp getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Timestamp registerdate) {
        this.registerdate = registerdate;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public BigDecimal getCurrentvalue() {
        return currentvalue;
    }

    public void setCurrentvalue(BigDecimal currentvalue) {
        this.currentvalue = currentvalue.setScale(0, RoundingMode.DOWN);
    }

    public Timestamp getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Timestamp expirydate) {
        this.expirydate = expirydate;
    }

    public Timestamp getLastusedate() {
        return lastusedate;
    }

    public void setLastusedate(Timestamp lastusedate) {
        this.lastusedate = lastusedate;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getUseplace() {
        return useplace;
    }

    public void setUseplace(String useplace) {
        this.useplace = useplace;
    }
}
