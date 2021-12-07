package com.x62life.mo.model.product;

import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;
import java.sql.Date;
/*@Alias("gdMaster")*/
//상품 마스터
public class GdMaster {
    private String gdcd; //상품코드
    private String gdname; //상품명
    private String unit; //단위
    private char divcd; //구분
    private char div1; //카테고리
    private BigDecimal price1; //가격
    private int point1; //포인트
    private String gdimg; //상품이미지1
    private String explain; //상품 설명
    private char priceyn; //가격표시
    private char useyn; //판매여부
    private char newyn; //신상품표시
    private Date indt; //입력일
    private Date updt; //최종수정
    private char recommendyn; //추천상품 표시
    private BigDecimal qprice;
    private BigDecimal rprice;
    private char vat; //과세여부
    private String div2; //하위 카테고리
    private String updid; //수정자
    private char deliverydtyn; //배송일자동지정
    private BigDecimal saleprice; // 할인지정가
    private char saleflag; //할인유형
    private int salepercent; //할인율
    private char soldoutyn; // 일시중지
    private String gdimg2; //상품이미지2
    private String gdimg3;//상품이미지3
    private String gdimg4;//상품이미지4
    private String subgdcd1; //연관상품1
    private String subgdcd2; //연관상품2
    private String subgdcd3; //연관상품3
    private String subgdcd4; //연관상품4
    private String subgdcd5; //연관상품5
    private String shortdesc; //간략설명
    private char qtysaleyn;  //수량구매할인
    private char favorteyn; //즐겨찾기
    private String expdt; //유효기간(최대)
    private String packaging; //상품구성및 포장(포장단위별 용량/중량,수량)
    private String handling; //보관 또는 취급방법
    private String precaution1; //주의사항(1)(원재료명 및 함량)
    private String precaution2; //주의사항(2) (영양성분)
    private String addinformation; //상품관련정보(가공품시+주의사항)
    private String importnote; //식품위생법 수입신고여부
    private int testidx; //안전성테스트 일련번호
    private String bestbeforedate; //유통기한 또는 품질유지기한(농축수산물만)
    private char easybreakyn; //배송주의상품
    private String plandate; //재판매예정일
    private char dispatchtype; //발송유형
    private char thedaysyn; //당일발송상품
    private char active; //사용여부
    private char optionp; //옵션상품여부
    private String mpcode; //메인상품코드
    private String mgdimg1; //M 이미지 1
    private String mgdimg2; //M 이미지 2
    private int minqty; //최소주문수량
    private int maxqty; //최대주문수량
    private String limitdelivery; //배송지역제한
    private char reserveyn; //예약주문상품
    private BigDecimal suprice; //공급가
    private String scode; // 공급자코드
    private BigDecimal suvat;
    private String exdiv1;
    private String exdiv2;

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

    public char getDivcd() {
        return divcd;
    }

    public void setDivcd(char divcd) {
        this.divcd = divcd;
    }

    public char getDiv1() {
        return div1;
    }

    public void setDiv1(char div1) {
        this.div1 = div1;
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1;
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

    public char getPriceyn() {
        return priceyn;
    }

    public void setPriceyn(char priceyn) {
        this.priceyn = priceyn;
    }

    public char getUseyn() {
        return useyn;
    }

    public void setUseyn(char useyn) {
        this.useyn = useyn;
    }

    public char getNewyn() {
        return newyn;
    }

    public void setNewyn(char newyn) {
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

    public char getRecommendyn() {
        return recommendyn;
    }

    public void setRecommendyn(char recommendyn) {
        this.recommendyn = recommendyn;
    }

    public BigDecimal getQprice() {
        return qprice;
    }

    public void setQprice(BigDecimal qprice) {
        this.qprice = qprice;
    }

    public BigDecimal getRprice() {
        return rprice;
    }

    public void setRprice(BigDecimal rprice) {
        this.rprice = rprice;
    }

    public char getVat() {
        return vat;
    }

    public void setVat(char vat) {
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

    public char getDeliverydtyn() {
        return deliverydtyn;
    }

    public void setDeliverydtyn(char deliverydtyn) {
        this.deliverydtyn = deliverydtyn;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public char getSaleflag() {
        return saleflag;
    }

    public void setSaleflag(char saleflag) {
        this.saleflag = saleflag;
    }

    public int getSalepercent() {
        return salepercent;
    }

    public void setSalepercent(int salepercent) {
        this.salepercent = salepercent;
    }

    public char getSoldoutyn() {
        return soldoutyn;
    }

    public void setSoldoutyn(char soldoutyn) {
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

    public char getQtysaleyn() {
        return qtysaleyn;
    }

    public void setQtysaleyn(char qtysaleyn) {
        this.qtysaleyn = qtysaleyn;
    }

    public char getFavorteyn() {
        return favorteyn;
    }

    public void setFavorteyn(char favorteyn) {
        this.favorteyn = favorteyn;
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

    public char getEasybreakyn() {
        return easybreakyn;
    }

    public void setEasybreakyn(char easybreakyn) {
        this.easybreakyn = easybreakyn;
    }

    public String getPlandate() {
        return plandate;
    }

    public void setPlandate(String plandate) {
        this.plandate = plandate;
    }

    public char getDispatchtype() {
        return dispatchtype;
    }

    public void setDispatchtype(char dispatchtype) {
        this.dispatchtype = dispatchtype;
    }

    public char getThedaysyn() {
        return thedaysyn;
    }

    public void setThedaysyn(char thedaysyn) {
        this.thedaysyn = thedaysyn;
    }

    public char getActive() {
        return active;
    }

    public void setActive(char active) {
        this.active = active;
    }

    public char getOptionp() {
        return optionp;
    }

    public void setOptionp(char optionp) {
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

    public char getReserveyn() {
        return reserveyn;
    }

    public void setReserveyn(char reserveyn) {
        this.reserveyn = reserveyn;
    }

    public BigDecimal getSuprice() {
        return suprice;
    }

    public void setSuprice(BigDecimal suprice) {
        this.suprice = suprice;
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
