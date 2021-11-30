package com.x62life.mo.model.payment;

import java.math.BigDecimal;
import java.sql.Timestamp;

//임시결제정보
public class OdPayTemp {
    private String paynum; //결제번호
    private String memcd; //회원코드
    private String paycd; //결제수단 01:카드결제,02:무통장입금, 03:급여공제, 04:SK건설복리후생포인트,05:상품권, 06:기타결제(고객결제0원)
                        // , 07:실시간계좌이체, 08:가상계좌, 09:휴대폰결제, 10:하이닉스하이웰포인트, 11:시럽페이, 12:네이버페이결제
                        // , 13:포인트결제(PG), 20:복합결제(PG포인트와 다른결제수단을 동시에 사용)

    private String pgcd; //결제대행사 01:자체결제, 01:이니시스, 02:SK페이, 03:네이버페이, 99:기타

    private short bnkidx; //은행코드 PAYCD-02
    private String bnkuser; //입금자 PAYCD-02
    private BigDecimal payprice; //결제금액
    private BigDecimal bntprice; //지원금
    private BigDecimal dpsprice; //예치금
    private BigDecimal dlvprice; //배송비
    private BigDecimal ttlprice; //주문금액
    private String fixdt; //등록일자
    private String paystcd; //결제상태 00:결제준비, 01:입금대기, 02:카드결제대기, 10:결제완료, 90:결제실패, 91:결제취소신청, 95:카드결제중단, 99:결제취소
    private Timestamp paydt; //결제등록일시
    private Timestamp updt; //수정일시
    private String paystcds; //결제상태 00:결제준비, 01:입금대기, 02:카드결제대기, 10:결제완료, 90:결제실패, 91:결제취소신청, 95:카드결제중단, 99:결제취소
    private BigDecimal tvos; //공급가
    private BigDecimal ttax; //과세
    private BigDecimal tvat; //부가세
    private String updid; //수정자id
    private char hideyn; //주문내역숨김여부 Y:숨김, N:보임
    private String insuno; //보증보험번호
    private BigDecimal pntprice; //sk포인트(회원포인트)
    private BigDecimal accprice; //적립포인트
    private String device; //device OD_PAYTEMP.DEVICE(M:모바일)
    private char cashYn; //현금영수증발급대상여부 Y:발급가능, N:불가
    private char cashReq; //현금영수증신청여부 Y:신청 N:미신청
    private String cashType; //현금영수증가입분류코드 20:휴대전화, 30:사업자번호, 40:현금영수증카드번호
    private String cashInfo; //현금영수증가입정보 CASH_TYPE에 따른 저옵
    private char rcpType; //현금영수증발행용도 0:소득공제용, 1:지출증빙용

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public String getPaycd() {
        return paycd;
    }

    public void setPaycd(String paycd) {
        this.paycd = paycd;
    }

    public String getPgcd() {
        return pgcd;
    }

    public void setPgcd(String pgcd) {
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

    public String getFixdt() {
        return fixdt;
    }

    public void setFixdt(String fixdt) {
        this.fixdt = fixdt;
    }

    public String getPaystcd() {
        return paystcd;
    }

    public void setPaystcd(String paystcd) {
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

    public String getPaystcds() {
        return paystcds;
    }

    public void setPaystcds(String paystcds) {
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

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public char getCashYn() {
        return cashYn;
    }

    public void setCashYn(char cashYn) {
        this.cashYn = cashYn;
    }

    public char getCashReq() {
        return cashReq;
    }

    public void setCashReq(char cashReq) {
        this.cashReq = cashReq;
    }

    public String getCashType() {
        return cashType;
    }

    public void setCashType(String cashType) {
        this.cashType = cashType;
    }

    public String getCashInfo() {
        return cashInfo;
    }

    public void setCashInfo(String cashInfo) {
        this.cashInfo = cashInfo;
    }

    public char getRcpType() {
        return rcpType;
    }

    public void setRcpType(char rcpType) {
        this.rcpType = rcpType;
    }
}
