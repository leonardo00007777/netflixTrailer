package com.netflix.app.model.product;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*@Alias("gdMasterEx")*/
public class GdMasterEx extends GdMaster{
    private BigDecimal groupsaleprice;
    private int isgroupsale;
    private String gdcnt;
    private String cdcode;
    private String origin; //생산지
    private String producer; //생산자
    private String address; //주소
    private String cdname;
    private String odtype;
    private String odtype2;
    private String odFrom;
    private String odTo;
    private String dlvFrom;
    private String dvlTo;
    private String alltimesale; //상시판매
    private String smenucd;
    private String smenudesc;
    private String catDesc;
    private String packunit;
    private long itemRemainQty;
    private long discountPrice;
    private String preOrderInfo;
    private String soldOutFlag;
    private String gradedesc;
    private BigDecimal discountRate;
    private String delpol;
    private BigDecimal limamt;
    private BigDecimal delcharge; //배송비
    private String typename; //상품유형
    private String putclass;
    private String putclass_cd;
    private String dlvdt;
    private boolean directDespatchFlag;
    private String orderDeadlineDate;
    private String nextOrderDeadlineDate;
    private String nextDeliveryDate;

    public String getGdcnt() {
        return gdcnt;
    }

    public void setGdcnt(String gdcnt) {
        this.gdcnt = gdcnt;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCdname() {
        return cdname;
    }

    public void setCdname(String cdname) {
        this.cdname = cdname;
    }

    public String getOdtype() {
        return odtype;
    }

    public void setOdtype(String odtype) {
        this.odtype = odtype;
    }

    public String getOdtype2() {
        return odtype2;
    }

    public void setOdtype2(String odtype2) {
        this.odtype2 = odtype2;
    }

    public BigDecimal getGroupsaleprice() {
        return groupsaleprice;
    }

    public void setGroupsaleprice(BigDecimal groupsaleprice) {
        this.groupsaleprice = groupsaleprice.setScale(0, RoundingMode.DOWN);
    }

    public int getIsgroupsale() {
        return isgroupsale;
    }

    public void setIsgroupsale(int isgroupsale) {
        this.isgroupsale = isgroupsale;
    }

    public String getCdcode() {
        return cdcode;
    }

    public void setCdcode(String cdcode) {
        this.cdcode = cdcode;
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

    public String getDlvFrom() {
        return dlvFrom;
    }

    public void setDlvFrom(String dlvFrom) {
        this.dlvFrom = dlvFrom;
    }

    public String getDvlTo() {
        return dvlTo;
    }

    public void setDvlTo(String dvlTo) {
        this.dvlTo = dvlTo;
    }

    public String getAlltimesale() {
        return alltimesale;
    }

    public void setAlltimesale(String alltimesale) {
        this.alltimesale = alltimesale;
    }

    public String getSmenucd() {
        return smenucd;
    }

    public void setSmenucd(String smenucd) {
        this.smenucd = smenucd;
    }

    public String getSmenudesc() {
        return smenudesc;
    }

    public void setSmenudesc(String smenudesc) {
        this.smenudesc = smenudesc;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public String getPackunit() {
        return packunit;
    }

    public void setPackunit(String packunit) {
        this.packunit = packunit;
    }

    public long getItemRemainQty() {
        return itemRemainQty;
    }

    public void setItemRemainQty(long itemRemainQty) {
        this.itemRemainQty = itemRemainQty;
    }

    public long getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(long discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getPreOrderInfo() {
        return preOrderInfo;
    }

    public void setPreOrderInfo(String preOrderInfo) {
        this.preOrderInfo = preOrderInfo;
    }

    public String getSoldOutFlag() {
        return soldOutFlag;
    }

    public void setSoldOutFlag(String soldOutFlag) {
        this.soldOutFlag = soldOutFlag;
    }

    public String getGradedesc() {
        return gradedesc;
    }

    public void setGradedesc(String gradedesc) {
        this.gradedesc = gradedesc;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public String getDelpol() {
        return delpol;
    }

    public void setDelpol(String delpol) {
        this.delpol = delpol;
    }

    public BigDecimal getLimamt() {
        return limamt;
    }

    public void setLimamt(BigDecimal limamt) {
        this.limamt = limamt.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getDelcharge() {
        return delcharge;
    }

    public void setDelcharge(BigDecimal delcharge) {
        this.delcharge = delcharge.setScale(0, RoundingMode.DOWN);
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getPutclass() {
        return putclass;
    }

    public void setPutclass(String putclass) {
        this.putclass = putclass;
    }

    public String getPutclass_cd() {
        return putclass_cd;
    }

    public void setPutclass_cd(String putclass_cd) {
        this.putclass_cd = putclass_cd;
    }

    public String getDlvdt() {
        return dlvdt;
    }

    public void setDlvdt(String dlvdt) {
        this.dlvdt = dlvdt;
    }

    public boolean isDirectDespatchFlag() {
        return directDespatchFlag;
    }

    public void setDirectDespatchFlag(boolean directDespatchFlag) {
        this.directDespatchFlag = directDespatchFlag;
    }

    public String getOrderDeadlineDate() {
        return orderDeadlineDate;
    }

    public void setOrderDeadlineDate(String orderDeadlineDate) {
        this.orderDeadlineDate = orderDeadlineDate;
    }

    public String getNextOrderDeadlineDate() {
        return nextOrderDeadlineDate;
    }

    public void setNextOrderDeadlineDate(String nextOrderDeadlineDate) {
        this.nextOrderDeadlineDate = nextOrderDeadlineDate;
    }

    public String getNextDeliveryDate() {
        return nextDeliveryDate;
    }

    public void setNextDeliveryDate(String nextDeliveryDate) {
        this.nextDeliveryDate = nextDeliveryDate;
    }
}
