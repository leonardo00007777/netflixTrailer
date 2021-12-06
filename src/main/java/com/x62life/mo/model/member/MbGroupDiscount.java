package com.x62life.mo.model.member;

import java.math.BigDecimal;
import java.sql.Timestamp;

//회원 그룹사 할인
public class MbGroupDiscount {
    private String grpcd; //그룹사코드
    private String gdcd; //상품코드
    private BigDecimal price; //가격
    private BigDecimal saleprice; //할인가격
    private short salepercent; //할인율
    private char salepolicy; //할인유형
    private char useyn; //사용여부
    private String upcd; //수정코드
    private Timestamp updt; //수정일시

    public String getGrpcd() {
        return grpcd;
    }

    public void setGrpcd(String grpcd) {
        this.grpcd = grpcd;
    }

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public short getSalepercent() {
        return salepercent;
    }

    public void setSalepercent(short salepercent) {
        this.salepercent = salepercent;
    }

    public char getSalepolicy() {
        return salepolicy;
    }

    public void setSalepolicy(char salepolicy) {
        this.salepolicy = salepolicy;
    }

    public char getUseyn() {
        return useyn;
    }

    public void setUseyn(char useyn) {
        this.useyn = useyn;
    }

    public String getUpcd() {
        return upcd;
    }

    public void setUpcd(String upcd) {
        this.upcd = upcd;
    }

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }
}
