package com.x62life.mo.model.product;

/*@Alias("blogGoods")*/
//블로그 연관상품
public class BlogGoods {
    private int seqno; //순번
    private String gdcd; //상품코드
    private int priority; //우선순위

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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
