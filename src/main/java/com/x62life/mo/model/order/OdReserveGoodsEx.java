package com.x62life.mo.model.order;

import java.math.BigDecimal;

public class OdReserveGoodsEx extends OdReserveGoods{
    private int page; //페이지
    private char priceyn; //가격표시
    private char newyn; //신규상품 여부
    private char recommendyn; //추천여부
    private char qtysaleyn; //수량구매할인
    private BigDecimal price1; //상품가격1
    private BigDecimal saleprice; //세일가격
    private BigDecimal groupsaleprice; //그룹(임직원)세일가격
    private int isgroupsale; // 0:소속사할인가 적용안됨, 1:소속사할인가 적용됨.
    private String gdimg; //상품 이미지
    private String mgdimg1; //모바일 상품 이미지1
    private String cdcode; //공통코드, 코드
    private String cdname; //코드명
    private char deliverydtyn; //배송일자동지정여부
    private char soldoutyn; //품절여부
    private int gdcnt; //상품개수
    private String origin; // 원산지
    private String producer; //생산자
    private String address; //주소
    private String gradedesc;
    private String smenucd; //서브메뉴코드
    private String smenudesc; //서브메뉴이름
    private char thedaysyn; //당일발송상품 여부
    private String shortdesc; // 간략설명

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public char getPriceyn() {
        return priceyn;
    }

    public void setPriceyn(char priceyn) {
        this.priceyn = priceyn;
    }

    @Override
    public char getNewyn() {
        return newyn;
    }

    @Override
    public void setNewyn(char newyn) {
        this.newyn = newyn;
    }

    public char getRecommendyn() {
        return recommendyn;
    }

    public void setRecommendyn(char recommendyn) {
        this.recommendyn = recommendyn;
    }

    public char getQtysaleyn() {
        return qtysaleyn;
    }

    public void setQtysaleyn(char qtysaleyn) {
        this.qtysaleyn = qtysaleyn;
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public BigDecimal getGroupsaleprice() {
        return groupsaleprice;
    }

    public void setGroupsaleprice(BigDecimal groupsaleprice) {
        this.groupsaleprice = groupsaleprice;
    }

    public int getIsgroupsale() {
        return isgroupsale;
    }

    public void setIsgroupsale(int isgroupsale) {
        this.isgroupsale = isgroupsale;
    }

    public String getGdimg() {
        return gdimg;
    }

    public void setGdimg(String gdimg) {
        this.gdimg = gdimg;
    }

    public String getMgdimg1() {
        return mgdimg1;
    }

    public void setMgdimg1(String mgdimg1) {
        this.mgdimg1 = mgdimg1;
    }

    public String getCdcode() {
        return cdcode;
    }

    public void setCdcode(String cdcode) {
        this.cdcode = cdcode;
    }

    public String getCdname() {
        return cdname;
    }

    public void setCdname(String cdname) {
        this.cdname = cdname;
    }

    public char getDeliverydtyn() {
        return deliverydtyn;
    }

    public void setDeliverydtyn(char deliverydtyn) {
        this.deliverydtyn = deliverydtyn;
    }

    public char getSoldoutyn() {
        return soldoutyn;
    }

    public void setSoldoutyn(char soldoutyn) {
        this.soldoutyn = soldoutyn;
    }

    public int getGdcnt() {
        return gdcnt;
    }

    public void setGdcnt(int gdcnt) {
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

    public String getGradedesc() {
        return gradedesc;
    }

    public void setGradedesc(String gradedesc) {
        this.gradedesc = gradedesc;
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

    public char getThedaysyn() {
        return thedaysyn;
    }

    public void setThedaysyn(char thedaysyn) {
        this.thedaysyn = thedaysyn;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }
}
