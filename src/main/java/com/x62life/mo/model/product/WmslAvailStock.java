package com.x62life.mo.model.product;

import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;
import java.sql.Timestamp;
@Alias("wmslAvailStock")
//실시간 가용재고량 수신 및 조회
public class WmslAvailStock {
    private String avcomp;
    private String avusid; //등록인
    private String avartc; //상품코드
    private BigDecimal avavqt; //??
    private BigDecimal avavst; //창고재고량
    private BigDecimal avalqt; //창고할당량
    private Timestamp avindt; //등록일시

    public String getAvcomp() {
        return avcomp;
    }

    public void setAvcomp(String avcomp) {
        this.avcomp = avcomp;
    }

    public String getAvusid() {
        return avusid;
    }

    public void setAvusid(String avusid) {
        this.avusid = avusid;
    }

    public String getAvartc() {
        return avartc;
    }

    public void setAvartc(String avartc) {
        this.avartc = avartc;
    }

    public BigDecimal getAvavqt() {
        return avavqt;
    }

    public void setAvavqt(BigDecimal avavqt) {
        this.avavqt = avavqt;
    }

    public BigDecimal getAvavst() {
        return avavst;
    }

    public void setAvavst(BigDecimal avavst) {
        this.avavst = avavst;
    }

    public BigDecimal getAvalqt() {
        return avalqt;
    }

    public void setAvalqt(BigDecimal avalqt) {
        this.avalqt = avalqt;
    }

    public Timestamp getAvindt() {
        return avindt;
    }

    public void setAvindt(Timestamp avindt) {
        this.avindt = avindt;
    }
}
