package com.x62life.mo.model.order;

import java.math.BigDecimal;
import java.sql.Timestamp;

/*@Alias("odCooperativeGoods")*/
//공동구매상품 기준정보
public class OdCooperativeGoods {
    private int seqno; //순번
    private String gdcd; //상품코드
    private String gdname; //상품명
    private String shortdesc; //간략설명
    private String unit; //단위
    private String divcd; //상품구분
    private String div1; //카테고리
    private String div2; //하위카테고리
    private BigDecimal price; //판매가격
    private BigDecimal saleprice; //할인판매가격
    private String saleflag; //할인유형
    private short salepercent; //할인율
    private int point; //구매포인트
    private int deposit; //구매예치금
    private int totalstock; //재고
    private Timestamp fromorder; //주문시작일시
    private Timestamp toorder; //주문종료일시
    private Timestamp fromdelive; //배송예정시작일시
    private Timestamp todelive; //배송예정종료일시
    private String pausesale; //일시판매중지여부
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private String memid; //수정id
    private String explain; //상품설명
    private String newflag; //신규상품여부
    private String recomflag; //추천상품여부
    private String shipfee; //배송비부과여부
    private String useyn; //사용여부
    private String picture1; //이미지1
    private String picture2; //이미지2
    private String picture3; //이미지3
    private String picture4; //이미지4
    private String option1; //옵션1
    private short optqty1; //옵션수량1
    private String option2; //옵션2
    private short optqty2; //옵션수량2
    private String option3; //옵션3
    private short optqty3; //옵션수량3

    public int getSeqno() {
        return seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

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

    public String getShortdesc() {
        return shortdesc;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
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

    public String getDiv2() {
        return div2;
    }

    public void setDiv2(String div2) {
        this.div2 = div2;
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

    public String getSaleflag() {
        return saleflag;
    }

    public void setSaleflag(String saleflag) {
        this.saleflag = saleflag;
    }

    public short getSalepercent() {
        return salepercent;
    }

    public void setSalepercent(short salepercent) {
        this.salepercent = salepercent;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalstock() {
        return totalstock;
    }

    public void setTotalstock(int totalstock) {
        this.totalstock = totalstock;
    }

    public Timestamp getFromorder() {
        return fromorder;
    }

    public void setFromorder(Timestamp fromorder) {
        this.fromorder = fromorder;
    }

    public Timestamp getToorder() {
        return toorder;
    }

    public void setToorder(Timestamp toorder) {
        this.toorder = toorder;
    }

    public Timestamp getFromdelive() {
        return fromdelive;
    }

    public void setFromdelive(Timestamp fromdelive) {
        this.fromdelive = fromdelive;
    }

    public Timestamp getTodelive() {
        return todelive;
    }

    public void setTodelive(Timestamp todelive) {
        this.todelive = todelive;
    }

    public String getPausesale() {
        return pausesale;
    }

    public void setPausesale(String pausesale) {
        this.pausesale = pausesale;
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

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getNewflag() {
        return newflag;
    }

    public void setNewflag(String newflag) {
        this.newflag = newflag;
    }

    public String getRecomflag() {
        return recomflag;
    }

    public void setRecomflag(String recomflag) {
        this.recomflag = recomflag;
    }

    public String getShipfee() {
        return shipfee;
    }

    public void setShipfee(String shipfee) {
        this.shipfee = shipfee;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3;
    }

    public String getPicture4() {
        return picture4;
    }

    public void setPicture4(String picture4) {
        this.picture4 = picture4;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public short getOptqty1() {
        return optqty1;
    }

    public void setOptqty1(short optqty1) {
        this.optqty1 = optqty1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public short getOptqty2() {
        return optqty2;
    }

    public void setOptqty2(short optqty2) {
        this.optqty2 = optqty2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public short getOptqty3() {
        return optqty3;
    }

    public void setOptqty3(short optqty3) {
        this.optqty3 = optqty3;
    }
}
