package com.x62life.mo.model.product;

import org.apache.ibatis.type.Alias;

@Alias("basicTagMap")
public class BasicTagMap {
    private String bttype; //태그타입
    private String bid; //태그아이디
    private String bidx; // 상품코드
    private int btidx; //태그인덱스
    private short bpriority; //태그우선순위
    private String tagTypeCartrecipe;

    public String getBttype() {
        return bttype;
    }

    public void setBttype(String bttype) {
        this.bttype = bttype;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBidx() {
        return bidx;
    }

    public void setBidx(String bidx) {
        this.bidx = bidx;
    }

    public int getBtidx() {
        return btidx;
    }

    public void setBtidx(int btidx) {
        this.btidx = btidx;
    }

    public short getBpriority() {
        return bpriority;
    }

    public void setBpriority(short bpriority) {
        this.bpriority = bpriority;
    }

    public String getTagTypeCartrecipe() {
        return tagTypeCartrecipe;
    }

    public void setTagTypeCartrecipe(String tagTypeCartrecipe) {
        this.tagTypeCartrecipe = tagTypeCartrecipe;
    }
}
