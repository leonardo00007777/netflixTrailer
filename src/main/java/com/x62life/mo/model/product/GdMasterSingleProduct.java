package com.x62life.mo.model.product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;

/*@Alias("gdMasterSingleProduct")*/
//상품 마스터 단품_상품 분리
public class GdMasterSingleProduct {
    private String gdcd;; //상품코드
    private String gdname;; //상품명
    private String unit;; //단위
    private String divcd;; //구분
    private String div1;; //카테고리
    private BigDecimal price1; //가격
    private int point1;; //포인트
    private String gdimg;; //상품이미지1
    private String explain;; //상품설명
    private String priceyn;; //가격표시
    private String useyn; //판매여부
    private String newyn; //신상품표시
    private Date indt; //입력일
    private Date updt; //최종수정
    private String recommendyn; //추천상품표시
    private BigDecimal qprice; //
    private BigDecimal rprice; //
    private String vat; //과세여부
    private String div2; //하위카테고리
    private String updid; //수정자
    private String deliverydtyn; //배송일자동지정
    private BigDecimal saleprice; //할인지정가
    private String saleflag; //할인유형
    private int salepercent; //할인율
    private String soldoutyn; //일시중지
    private String gdimg2; //상품이미지2
    private String gdimg3; //상품이미지3
    private String gdimg4; //상품이미지4
    private String subgdcd1; //연관상품1
    private String subgdcd2; //연관상품2
    private String subgdcd3; //연관상품3
    private String subgdcd4; //연관상품4
    private String subgdcd5; //연관상품5
    private String shortdesc; //간략설명
    private String qtysaleyn; //수량구매할인
    private String favoriteyn; //즐겨찾기
    private String expdt; //유효기간(최대)
    private String packaging; //상품구성 및 포장(포장단위별 용량/중량,수량)
    private String handling; //보관 또는 취급방법
    private String precaution1; //주의사항(1)(원재료명 및 함량)
    private String precaution2; //주의사항(2)(영양성분)
    private String addinformation; //상품관련정보(가공품시+주의사항)
    private String importnote; //식품위생법 수입신고여부
    private int testidx; //안전성테스트 일련번호
    private String bestbeforedate; //유통기한 또는 품질유지기한(농축수산물만)
    private String easybreakyn; //배송주의상품
    private Date plandate; //재판매예정일
    private String dispatchtype; //발송유형
    private String thedaysyn; //당일발송상품
    private String active; //사용여부
    private String optionp; //옵션상품여부
    private String mpcode; //메인상품코드
    private String mgdimg1; //m 이미지 1
    private String mgdimg2; //m 이미지 2
    private int minqty; //최소주문수량
    private int maxqty; //최대주문수량
    private String limitdelivery; //배송지역제한
    private String reserveyn; //예약주문상품
    private BigDecimal suprice; //공급가
    private String scode; //공급자코드
    private BigDecimal suvat; //
    private String exdiv1; //
    private String exdiv2; //

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public String getGdname() {
        return gdname;
    }

    public void setGdname(String gdname) {
        this.gdname = gdname;
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

    public String getDiv1() {
        return div1;
    }

    public void setDiv1(String div1) {
        this.div1 = div1;
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1.setScale(0, RoundingMode.DOWN);
    }

    public int getPoint1() {
        return point1;
    }

    public void setPoint1(int point1) {
        this.point1 = point1;
    }

    public String getGdimg() {
        return gdimg;
    }

    public void setGdimg(String gdimg) {
        this.gdimg = gdimg;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getPriceyn() {
        return priceyn;
    }

    public void setPriceyn(String priceyn) {
        this.priceyn = priceyn;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }

    public String getNewyn() {
        return newyn;
    }

    public void setNewyn(String newyn) {
        this.newyn = newyn;
    }

    public Date getIndt() {
        return indt;
    }

    public void setIndt(Date indt) {
        this.indt = indt;
    }

    public Date getUpdt() {
        return updt;
    }

    public void setUpdt(Date updt) {
        this.updt = updt;
    }

    public String getRecommendyn() {
        return recommendyn;
    }

    public void setRecommendyn(String recommendyn) {
        this.recommendyn = recommendyn;
    }

    public BigDecimal getQprice() {
        return qprice;
    }

    public void setQprice(BigDecimal qprice) {
        this.qprice = qprice.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getRprice() {
        return rprice;
    }

    public void setRprice(BigDecimal rprice) {
        this.rprice = rprice.setScale(0, RoundingMode.DOWN);
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getDiv2() {
        return div2;
    }

    public void setDiv2(String div2) {
        this.div2 = div2;
    }

    public String getUpdid() {
        return updid;
    }

    public void setUpdid(String updid) {
        this.updid = updid;
    }

    public String getDeliverydtyn() {
        return deliverydtyn;
    }

    public void setDeliverydtyn(String deliverydtyn) {
        this.deliverydtyn = deliverydtyn;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice.setScale(0, RoundingMode.DOWN);
    }

    public String getSaleflag() {
        return saleflag;
    }

    public void setSaleflag(String saleflag) {
        this.saleflag = saleflag;
    }

    public int getSalepercent() {
        return salepercent;
    }

    public void setSalepercent(int salepercent) {
        this.salepercent = salepercent;
    }

    public String getSoldoutyn() {
        return soldoutyn;
    }

    public void setSoldoutyn(String soldoutyn) {
        this.soldoutyn = soldoutyn;
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

    public String getShortdesc() {
        return shortdesc;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }

    public String getQtysaleyn() {
        return qtysaleyn;
    }

    public void setQtysaleyn(String qtysaleyn) {
        this.qtysaleyn = qtysaleyn;
    }

    public String getFavoriteyn() {
        return favoriteyn;
    }

    public void setFavoriteyn(String favoriteyn) {
        this.favoriteyn = favoriteyn;
    }

    public String getExpdt() {
        return expdt;
    }

    public void setExpdt(String expdt) {
        this.expdt = expdt;
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

    public String getImportnote() {
        return importnote;
    }

    public void setImportnote(String importnote) {
        this.importnote = importnote;
    }

    public int getTestidx() {
        return testidx;
    }

    public void setTestidx(int testidx) {
        this.testidx = testidx;
    }

    public String getBestbeforedate() {
        return bestbeforedate;
    }

    public void setBestbeforedate(String bestbeforedate) {
        this.bestbeforedate = bestbeforedate;
    }

    public String getEasybreakyn() {
        return easybreakyn;
    }

    public void setEasybreakyn(String easybreakyn) {
        this.easybreakyn = easybreakyn;
    }

    public Date getPlandate() {
        return plandate;
    }

    public void setPlandate(Date plandate) {
        this.plandate = plandate;
    }

    public String getDispatchtype() {
        return dispatchtype;
    }

    public void setDispatchtype(String dispatchtype) {
        this.dispatchtype = dispatchtype;
    }

    public String getThedaysyn() {
        return thedaysyn;
    }

    public void setThedaysyn(String thedaysyn) {
        this.thedaysyn = thedaysyn;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
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

    public String getMgdimg1() {
        return mgdimg1;
    }

    public void setMgdimg1(String mgdimg1) {
        this.mgdimg1 = mgdimg1;
    }

    public String getMgdimg2() {
        return mgdimg2;
    }

    public void setMgdimg2(String mgdimg2) {
        this.mgdimg2 = mgdimg2;
    }

    public int getMinqty() {
        return minqty;
    }

    public void setMinqty(int minqty) {
        this.minqty = minqty;
    }

    public int getMaxqty() {
        return maxqty;
    }

    public void setMaxqty(int maxqty) {
        this.maxqty = maxqty;
    }

    public String getLimitdelivery() {
        return limitdelivery;
    }

    public void setLimitdelivery(String limitdelivery) {
        this.limitdelivery = limitdelivery;
    }

    public String getReserveyn() {
        return reserveyn;
    }

    public void setReserveyn(String reserveyn) {
        this.reserveyn = reserveyn;
    }

    public BigDecimal getSuprice() {
        return suprice;
    }

    public void setSuprice(BigDecimal suprice) {
        this.suprice = suprice.setScale(0, RoundingMode.DOWN);
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public BigDecimal getSuvat() {
        return suvat;
    }

    public void setSuvat(BigDecimal suvat) {
        this.suvat = suvat;
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
