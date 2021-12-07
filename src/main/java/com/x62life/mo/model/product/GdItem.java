package com.x62life.mo.model.product;

import java.math.BigDecimal;
/*@Alias("gdItem")*/
//상품 정보
public class GdItem {
    private String gdcd;  //상품코드
    private char typecd;  //상품유형
    private String origin;  //원산지
    private String producer;  //생산/제조자
    private String address;  //생산지
    private String scode;  //공급자코드
    private int perpack;  //발주단위
    private int perpick;  //피킹단위
    private short dbbd;  //최적진열기한
    private BigDecimal pbbd;  //최적진열기한
    private short shelfLife;  //최대진열기한
    private String putclass;  //상품취급유형
    private char crossdockyn;  //cd상품여부

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public char getTypecd() {
        return typecd;
    }

    public void setTypecd(char typecd) {
        this.typecd = typecd;
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

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public int getPerpack() {
        return perpack;
    }

    public void setPerpack(int perpack) {
        this.perpack = perpack;
    }

    public int getPerpick() {
        return perpick;
    }

    public void setPerpick(int perpick) {
        this.perpick = perpick;
    }

    public short getDbbd() {
        return dbbd;
    }

    public void setDbbd(short dbbd) {
        this.dbbd = dbbd;
    }

    public BigDecimal getPbbd() {
        return pbbd;
    }

    public void setPbbd(BigDecimal pbbd) {
        this.pbbd = pbbd;
    }

    public short getshelfLife() {
        return shelfLife;
    }

    public void setshelfLife(short shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getPutclass() {
        return putclass;
    }

    public void setPutclass(String putclass) {
        this.putclass = putclass;
    }

    public char getCrossdockyn() {
        return crossdockyn;
    }

    public void setCrossdockyn(char crossdockyn) {
        this.crossdockyn = crossdockyn;
    }
}
