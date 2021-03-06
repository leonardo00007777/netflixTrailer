package com.netflix.app.model.product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
//상품변경정보
/*@Alias("productChangeInfo")*/
public class ProductChangeInfo {
    private String productCd; //상품코드
    private String applyType; //배송일지정상품
    private Timestamp applyDate; //적용일자
    private BigDecimal applyPrice; //적용가격
    private String applyYn; //판매여부
    private String applySalepolicy; //할인유형
    private int applySalevalue; //할인값
    private String applySoldout; //일시품절
    private String applyStockupdate; //재고유형
    private int applyStockvalue; //재고수량
    private String applyDaily; //매일수량추가
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private String updid; //수정자
    private String doneyn; //실행여부
    private String applyMpcode; //메인상품코드
    private BigDecimal applySuprice; //공급가
    private BigDecimal applySuvat;

    public String getproductCd() {
        return productCd;
    }

    public void setproductCd(String productCd) {
        this.productCd = productCd;
    }

    public String getapplyType() {
        return applyType;
    }

    public void setapplyType(String applyType) {
        this.applyType = applyType;
    }

    public Timestamp getapplyDate() {
        return applyDate;
    }

    public void setapplyDate(Timestamp applyDate) {
        this.applyDate = applyDate;
    }

    public BigDecimal getapplyPrice() {
        return applyPrice;
    }

    public void setapplyPrice(BigDecimal applyPrice) {
        this.applyPrice = applyPrice;
    }

    public String getapplyYn() {
        return applyYn;
    }

    public void setapplyYn(String applyYn) {
        this.applyYn = applyYn;
    }

    public String getapplySalepolicy() {
        return applySalepolicy;
    }

    public void setapplySalepolicy(String applySalepolicy) {
        this.applySalepolicy = applySalepolicy;
    }

    public int getapplySalevalue() {
        return applySalevalue;
    }

    public void setapplySalevalue(int applySalevalue) {
        this.applySalevalue = applySalevalue;
    }

    public String getapplySoldout() {
        return applySoldout;
    }

    public void setapplySoldout(String applySoldout) {
        this.applySoldout = applySoldout;
    }

    public String getapplyStockupdate() {
        return applyStockupdate;
    }

    public void setapplyStockupdate(String applyStockupdate) {
        this.applyStockupdate = applyStockupdate;
    }

    public int getapplyStockvalue() {
        return applyStockvalue;
    }

    public void setapplyStockvalue(int applyStockvalue) {
        this.applyStockvalue = applyStockvalue;
    }

    public String getapplyDaily() {
        return applyDaily;
    }

    public void setapplyDaily(String applyDaily) {
        this.applyDaily = applyDaily;
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

    public String getUpdid() {
        return updid;
    }

    public void setUpdid(String updid) {
        this.updid = updid;
    }

    public String getDoneyn() {
        return doneyn;
    }

    public void setDoneyn(String doneyn) {
        this.doneyn = doneyn;
    }

    public String getapplyMpcode() {
        return applyMpcode;
    }

    public void setapplyMpcode(String applyMpcode) {
        this.applyMpcode = applyMpcode;
    }

    public BigDecimal getapplySuprice() {
        return applySuprice;
    }

    public void setapplySuprice(BigDecimal applySuprice) {
        this.applySuprice = applySuprice.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getapplySuvat() {
        return applySuvat;
    }

    public void setapplySuvat(BigDecimal applySuvat) {
        this.applySuvat = applySuvat.setScale(0, RoundingMode.DOWN);
    }
}
