package com.x62life.mo.model.payment;

import java.math.BigDecimal;
import java.sql.Timestamp;
//결제정보
/*@Alias("odPay")*/
public class OdPay {
    private char paynum; //결제번호
    private char memcd; //회원코드
    private char paycd; //결제수단
    private char pgcd; //결제대행사
    private short bnkidx; //은행코드
    private String bnkuser; //입금자
    private BigDecimal payprice; //결제금액
    private BigDecimal bntprice; //지원금
    private BigDecimal dpsprice; //예치금
    private BigDecimal dlvprice; //배송비
    private BigDecimal ttlprice; //주문금액
    private char fixdt; //등록일자
    private char paystcd; //결제상태
    private Timestamp paydt; //결제등록일시
    private Timestamp updt; //수정일시
    private char paystcds; //결제상태
    private BigDecimal tvos; //공급가
    private BigDecimal ttax; //과세
    private BigDecimal tvat; //부가세
    private String updid; //수정자id
    private char hideyn; //주문내역숨김여부 Y:숨김, N:보임 쇼핑몰의 주문/배송 목록과 주문결제 화면의 배송지선택 목록에서 숨김/보임 처리
    private String insuno; //보증보험번호
    private BigDecimal pntprice; //sk포인트(회원포인트)
    private BigDecimal accprice; //적립금 - 상품할인가로 적용.
    private BigDecimal bnpprice; //베네피아
    private String device; //device
    private char prepaynum; //임시결제번호
    private String draftnum; //기안번호 유형별 주문등록에서 사용(주문유형이 판촉/마케팅 관련일 경우, 등록할 수 있음)
    private String drafttitle; //기안제목
    private String drafter; //기안자

    public char getPaynum() {
        return paynum;
    }

    public void setPaynum(char paynum) {
        this.paynum = paynum;
    }

    public char getMemcd() {
        return memcd;
    }

    public void setMemcd(char memcd) {
        this.memcd = memcd;
    }

    public char getPaycd() {
        return paycd;
    }

    public void setPaycd(char paycd) {
        this.paycd = paycd;
    }

    public char getPgcd() {
        return pgcd;
    }

    public void setPgcd(char pgcd) {
        this.pgcd = pgcd;
    }

    public short getBnkidx() {
        return bnkidx;
    }

    public void setBnkidx(short bnkidx) {
        this.bnkidx = bnkidx;
    }

    public String getBnkuser() {
        return bnkuser;
    }

    public void setBnkuser(String bnkuser) {
        this.bnkuser = bnkuser;
    }

    public BigDecimal getPayprice() {
        return payprice;
    }

    public void setPayprice(BigDecimal payprice) {
        this.payprice = payprice;
    }

    public BigDecimal getBntprice() {
        return bntprice;
    }

    public void setBntprice(BigDecimal bntprice) {
        this.bntprice = bntprice;
    }

    public BigDecimal getDpsprice() {
        return dpsprice;
    }

    public void setDpsprice(BigDecimal dpsprice) {
        this.dpsprice = dpsprice;
    }

    public BigDecimal getDlvprice() {
        return dlvprice;
    }

    public void setDlvprice(BigDecimal dlvprice) {
        this.dlvprice = dlvprice;
    }

    public BigDecimal getTtlprice() {
        return ttlprice;
    }

    public void setTtlprice(BigDecimal ttlprice) {
        this.ttlprice = ttlprice;
    }

    public char getFixdt() {
        return fixdt;
    }

    public void setFixdt(char fixdt) {
        this.fixdt = fixdt;
    }

    public char getPaystcd() {
        return paystcd;
    }

    public void setPaystcd(char paystcd) {
        this.paystcd = paystcd;
    }

    public Timestamp getPaydt() {
        return paydt;
    }

    public void setPaydt(Timestamp paydt) {
        this.paydt = paydt;
    }

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }

    public char getPaystcds() {
        return paystcds;
    }

    public void setPaystcds(char paystcds) {
        this.paystcds = paystcds;
    }

    public BigDecimal getTvos() {
        return tvos;
    }

    public void setTvos(BigDecimal tvos) {
        this.tvos = tvos;
    }

    public BigDecimal getTtax() {
        return ttax;
    }

    public void setTtax(BigDecimal ttax) {
        this.ttax = ttax;
    }

    public BigDecimal getTvat() {
        return tvat;
    }

    public void setTvat(BigDecimal tvat) {
        this.tvat = tvat;
    }

    public String getUpdid() {
        return updid;
    }

    public void setUpdid(String updid) {
        this.updid = updid;
    }

    public char getHideyn() {
        return hideyn;
    }

    public void setHideyn(char hideyn) {
        this.hideyn = hideyn;
    }

    public String getInsuno() {
        return insuno;
    }

    public void setInsuno(String insuno) {
        this.insuno = insuno;
    }

    public BigDecimal getPntprice() {
        return pntprice;
    }

    public void setPntprice(BigDecimal pntprice) {
        this.pntprice = pntprice;
    }

    public BigDecimal getAccprice() {
        return accprice;
    }

    public void setAccprice(BigDecimal accprice) {
        this.accprice = accprice;
    }

    public BigDecimal getBnpprice() {
        return bnpprice;
    }

    public void setBnpprice(BigDecimal bnpprice) {
        this.bnpprice = bnpprice;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public char getPrepaynum() {
        return prepaynum;
    }

    public void setPrepaynum(char prepaynum) {
        this.prepaynum = prepaynum;
    }

    public String getDraftnum() {
        return draftnum;
    }

    public void setDraftnum(String draftnum) {
        this.draftnum = draftnum;
    }

    public String getDrafttitle() {
        return drafttitle;
    }

    public void setDrafttitle(String drafttitle) {
        this.drafttitle = drafttitle;
    }

    public String getDrafter() {
        return drafter;
    }

    public void setDrafter(String drafter) {
        this.drafter = drafter;
    }
}
