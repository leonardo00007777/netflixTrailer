package com.x62life.mo.model.product;
//입고 상세정보
public class GdDetailInfo {
    private String glno; //입고번호
    private String glsuno; //구매공급자번호
    private String glcomp; //회사코드
    private String glartc; //상품코드
    private String glpono; //구매주문번호
    private int glqtdu; //발주수량
    private int glqtrc; //입고수량

    public String getGlno() {
        return glno;
    }

    public void setGlno(String glno) {
        this.glno = glno;
    }

    public String getGlsuno() {
        return glsuno;
    }

    public void setGlsuno(String glsuno) {
        this.glsuno = glsuno;
    }

    public String getGlcomp() {
        return glcomp;
    }

    public void setGlcomp(String glcomp) {
        this.glcomp = glcomp;
    }

    public String getGlartc() {
        return glartc;
    }

    public void setGlartc(String glartc) {
        this.glartc = glartc;
    }

    public String getGlpono() {
        return glpono;
    }

    public void setGlpono(String glpono) {
        this.glpono = glpono;
    }

    public int getGlqtdu() {
        return glqtdu;
    }

    public void setGlqtdu(int glqtdu) {
        this.glqtdu = glqtdu;
    }

    public int getGlqtrc() {
        return glqtrc;
    }

    public void setGlqtrc(int glqtrc) {
        this.glqtrc = glqtrc;
    }
}
