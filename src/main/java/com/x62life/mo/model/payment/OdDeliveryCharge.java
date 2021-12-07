package com.x62life.mo.model.payment;

import java.math.BigDecimal;

//배송비
/*@Alias("odDeliveryCharge")*/
public class OdDeliveryCharge {
    private String ordnum; //주문번호
    private String paynum; //결제번호
    private String chargeType; //배송비유형
    private BigDecimal deliveryCharge; //배송비

    public String getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(String ordnum) {
        this.ordnum = ordnum;
    }

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public BigDecimal getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(BigDecimal deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }
}
