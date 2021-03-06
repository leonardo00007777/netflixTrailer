package com.netflix.app.model.order;

import java.sql.Timestamp;

/*@Alias("odQuickGoods")*/
//신속배송 상품
public class OdQuickGoods {
    private int seqno; //순번
    private String gdcd; //상품코드
    private String gdnm; //상품명
    private String unit; //단위
    private String divcd; //상품구분
    private String divcd1; //카테고리
    private float masterPrice; //가격
    private float applyPrice; //가격
    private float point; //포인트
    private float stockNum; //재고량
    private String odFrom; //판매기간 from
    private String odTo; //판매기간 to
    private String useyn; //사용여부
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private Timestamp candt; //취소일시
    private String gdExplain; //상품설명
    private String type; //상품유형
    private String newyn; //신상품여부
    private String recommandyn; //추천상품여부
    private String divcd2; //하위카테고리
    private String updid; //수정자id

    public int getSeqno() {
        return seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public String getGdnm() {
        return gdnm;
    }

    public void setGdnm(String gdnm) {
        this.gdnm = gdnm;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDivcd() {
        return divcd;
    }

    public void setDivcd(String divcd) {
        this.divcd = divcd;
    }

    public String getDivcd1() {
        return divcd1;
    }

    public void setDivcd1(String divcd1) {
        this.divcd1 = divcd1;
    }

    public float getMasterPrice() {
        return masterPrice;
    }

    public void setMasterPrice(float masterPrice) {
        this.masterPrice = masterPrice;
    }

    public float getApplyPrice() {
        return applyPrice;
    }

    public void setApplyPrice(float applyPrice) {
        this.applyPrice = applyPrice;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public float getStockNum() {
        return stockNum;
    }

    public void setStockNum(float stockNum) {
        this.stockNum = stockNum;
    }

    public String getOdFrom() {
        return odFrom;
    }

    public void setOdFrom(String odFrom) {
        this.odFrom = odFrom;
    }

    public String getOdTo() {
        return odTo;
    }

    public void setOdTo(String odTo) {
        this.odTo = odTo;
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

    public Timestamp getCandt() {
        return candt;
    }

    public void setCandt(Timestamp candt) {
        this.candt = candt;
    }

    public String getGdExplain() {
        return gdExplain;
    }

    public void setGdExplain(String gdExplain) {
        this.gdExplain = gdExplain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNewyn() {
        return newyn;
    }

    public void setNewyn(String newyn) {
        this.newyn = newyn;
    }

    public String getRecommandyn() {
        return recommandyn;
    }

    public void setRecommandyn(String recommandyn) {
        this.recommandyn = recommandyn;
    }

    public String getDivcd2() {
        return divcd2;
    }

    public void setDivcd2(String divcd2) {
        this.divcd2 = divcd2;
    }

    public String getUpdid() {
        return updid;
    }

    public void setUpdid(String updid) {
        this.updid = updid;
    }
}
