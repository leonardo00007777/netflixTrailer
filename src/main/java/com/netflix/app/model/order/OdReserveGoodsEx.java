package com.netflix.app.model.order;

import java.math.BigDecimal;
import java.math.RoundingMode;


/*@Alias("odReserveGoodsEx")*/
public class OdReserveGoodsEx extends OdReserveGoods{
    private int page; //페이지
    private String priceyn; //가격표시
    private String newyn; //신규상품 여부
    private String recommendyn; //추천여부
    private String qtysaleyn; //수량구매할인
    private BigDecimal price1; //상품가격1
    private BigDecimal saleprice; //세일가격
    private BigDecimal groupsaleprice; //그룹(임직원)세일가격
    private int isgroupsale; // 0:소속사할인가 적용안됨, 1:소속사할인가 적용됨.
    private String gdimg; //상품 이미지
    private String mgdimg1; //모바일 상품 이미지1
    private String cdcode; //공통코드, 코드
    private String cdname; //코드명
    private String deliverydtyn; //배송일자동지정여부
    private String soldoutyn; //품절여부
    private int gdcnt; //상품개수
    private String origin; // 원산지
    private String producer; //생산자
    private String address; //주소
    private String gradedesc;
    private String smenucd; //서브메뉴코드
    private String smenudesc; //서브메뉴이름
    private String thedaysyn; //당일발송상품 여부
    private String shortdesc; // 간략설명
    private String gdimg2; // 상품이미지2
    private String gdimg3;// 상품이미지3
    private String gdimg4;// 상품이미지4
    private String subgdcd1; // 서브상품코드1
    private String subgdcd2; // 서브상품코드2
    private String subgdcd3; // 서브상품코드3
    private String subgdcd4; // 서브상품코드4
    private String subgdcd5; // 서브상품코드5
    private String expdt;
    private String vat;        //부가세여부
    private String dlvFrom;
    private String dlvTo;
    private String gdtype;
    private String gdtypename;
    private String typename;
    private String bestbeforedate;
    private String packaging;
    private String handling;
    private String precaution1;
    private String precaution2;
    private String addinformation;
    private int testidx;
    private String dispatchtype;
    private String plandate;
    private String optionp;
    private String mpcode;
    private String alltimesale;
    private String delpol;
    private BigDecimal limamt;
    private BigDecimal delcharge;
    private String specifications;
    private String periodfuse;
    private String howtouse;
    private String exdiv1;
    private String exdiv2;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPriceyn() {
        return priceyn;
    }

    public void setPriceyn(String priceyn) {
        this.priceyn = priceyn;
    }

    @Override
    public String getNewyn() {
        return newyn;
    }

    @Override
    public void setNewyn(String newyn) {
        this.newyn = newyn;
    }

    public String getRecommendyn() {
        return recommendyn;
    }

    public void setRecommendyn(String recommendyn) {
        this.recommendyn = recommendyn;
    }

    public String getQtysaleyn() {
        return qtysaleyn;
    }

    public void setQtysaleyn(String qtysaleyn) {
        this.qtysaleyn = qtysaleyn;
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice.setScale(0, RoundingMode.DOWN);
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

    public String getDeliverydtyn() {
        return deliverydtyn;
    }

    public void setDeliverydtyn(String deliverydtyn) {
        this.deliverydtyn = deliverydtyn;
    }

    public String getSoldoutyn() {
        return soldoutyn;
    }

    public void setSoldoutyn(String soldoutyn) {
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

    public String getThedaysyn() {
        return thedaysyn;
    }

    public void setThedaysyn(String thedaysyn) {
        this.thedaysyn = thedaysyn;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }

    public String getGdimg2() {
        return gdimg2;
    }

    public void setGdimg2(String gdimg2) {
        this.gdimg2 = gdimg2;
    }

    public String getGdimg3() {
        return gdimg3;
    }

    public void setGdimg3(String gdimg3) {
        this.gdimg3 = gdimg3;
    }

    public String getGdimg4() {
        return gdimg4;
    }

    public void setGdimg4(String gdimg4) {
        this.gdimg4 = gdimg4;
    }

    public String getSubgdcd1() {
        return subgdcd1;
    }

    public void setSubgdcd1(String subgdcd1) {
        this.subgdcd1 = subgdcd1;
    }

    public String getSubgdcd2() {
        return subgdcd2;
    }

    public void setSubgdcd2(String subgdcd2) {
        this.subgdcd2 = subgdcd2;
    }

    public String getSubgdcd3() {
        return subgdcd3;
    }

    public void setSubgdcd3(String subgdcd3) {
        this.subgdcd3 = subgdcd3;
    }

    public String getSubgdcd4() {
        return subgdcd4;
    }

    public void setSubgdcd4(String subgdcd4) {
        this.subgdcd4 = subgdcd4;
    }

    public String getSubgdcd5() {
        return subgdcd5;
    }

    public void setSubgdcd5(String subgdcd5) {
        this.subgdcd5 = subgdcd5;
    }

    public String getExpdt() {
        return expdt;
    }

    public void setExpdt(String expdt) {
        this.expdt = expdt;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    @Override
    public String getDlvFrom() {
        return dlvFrom;
    }

    @Override
    public void setDlvFrom(String dlvFrom) {
        this.dlvFrom = dlvFrom;
    }

    @Override
    public String getDlvTo() {
        return dlvTo;
    }

    @Override
    public void setDlvTo(String dlvTo) {
        this.dlvTo = dlvTo;
    }

    public String getGdtype() {
        return gdtype;
    }

    public void setGdtype(String gdtype) {
        this.gdtype = gdtype;
    }

    public String getGdtypename() {
        return gdtypename;
    }

    public void setGdtypename(String gdtypename) {
        this.gdtypename = gdtypename;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getBestbeforedate() {
        return bestbeforedate;
    }

    public void setBestbeforedate(String bestbeforedate) {
        this.bestbeforedate = bestbeforedate;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getHandling() {
        return handling;
    }

    public void setHandling(String handling) {
        this.handling = handling;
    }

    public String getPrecaution1() {
        return precaution1;
    }

    public void setPrecaution1(String precaution1) {
        this.precaution1 = precaution1;
    }

    public String getPrecaution2() {
        return precaution2;
    }

    public void setPrecaution2(String precaution2) {
        this.precaution2 = precaution2;
    }

    public String getAddinformation() {
        return addinformation;
    }

    public void setAddinformation(String addinformation) {
        this.addinformation = addinformation;
    }

    public int getTestidx() {
        return testidx;
    }

    public void setTestidx(int testidx) {
        this.testidx = testidx;
    }

    public String getDispatchtype() {
        return dispatchtype;
    }

    public void setDispatchtype(String dispatchtype) {
        this.dispatchtype = dispatchtype;
    }

    public String getPlandate() {
        return plandate;
    }

    public void setPlandate(String plandate) {
        this.plandate = plandate;
    }

    public String getOptionp() {
        return optionp;
    }

    public void setOptionp(String optionp) {
        this.optionp = optionp;
    }

    public String getMpcode() {
        return mpcode;
    }

    public void setMpcode(String mpcode) {
        this.mpcode = mpcode;
    }

    @Override
    public String getAlltimesale() {
        return alltimesale;
    }

    @Override
    public void setAlltimesale(String alltimesale) {
        this.alltimesale = alltimesale;
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
        this.limamt = limamt;
    }

    public BigDecimal getDelcharge() {
        return delcharge;
    }

    public void setDelcharge(BigDecimal delcharge) {
        this.delcharge = delcharge;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getPeriodfuse() {
        return periodfuse;
    }

    public void setPeriodfuse(String periodfuse) {
        this.periodfuse = periodfuse;
    }

    public String getHowtouse() {
        return howtouse;
    }

    public void setHowtouse(String howtouse) {
        this.howtouse = howtouse;
    }

    public String getExdiv1() {
        return exdiv1;
    }

    public void setExdiv1(String exdiv1) {
        this.exdiv1 = exdiv1;
    }

    public String getExdiv2() {
        return exdiv2;
    }

    public void setExdiv2(String exdiv2) {
        this.exdiv2 = exdiv2;
    }
}
