package com.x62life.mo.model.product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
//상품 예외 입고 임시저장
/*@Alias("gdTemp")*/
public class GdTemp {
    private String tUsid; //등록id
    private short tSeq; //순번
    private String tSuno; //공급자번호
    private Timestamp tDddt; //납기일시
    private String tPlac; //창고코드
    private String tArtc; //상품코드
    private int tGtor; //발주수량
    private BigDecimal tUcost; //단가
    private BigDecimal tCost; //공급가
    private BigDecimal tVat; //부가세
    private Timestamp tUpdt; //수정일시
    private String tNote; //요청사항(메모)

    public String gettUsid() {
        return tUsid;
    }

    public void settUsid(String tUsid) {
        this.tUsid = tUsid;
    }

    public short gettSeq() {
        return tSeq;
    }

    public void settSeq(short tSeq) {
        this.tSeq = tSeq;
    }

    public String gettSuno() {
        return tSuno;
    }

    public void settSuno(String tSuno) {
        this.tSuno = tSuno;
    }

    public Timestamp gettDddt() {
        return tDddt;
    }

    public void settDddt(Timestamp tDddt) {
        this.tDddt = tDddt;
    }

    public String gettPlac() {
        return tPlac;
    }

    public void settPlac(String tPlac) {
        this.tPlac = tPlac;
    }

    public String gettArtc() {
        return tArtc;
    }

    public void settArtc(String tArtc) {
        this.tArtc = tArtc;
    }

    public int gettGtor() {
        return tGtor;
    }

    public void settGtor(int tGtor) {
        this.tGtor = tGtor;
    }

    public BigDecimal gettUcost() {
        return tUcost;
    }

    public void settUcost(BigDecimal tUcost) {
        this.tUcost = tUcost.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal gettCost() {
        return tCost;
    }

    public void settCost(BigDecimal tCost) {
        this.tCost = tCost.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal gettVat() {
        return tVat;
    }

    public void settVat(BigDecimal tVat) {
        this.tVat = tVat.setScale(0, RoundingMode.DOWN);
    }

    public Timestamp gettUpdt() {
        return tUpdt;
    }

    public void settUpdt(Timestamp tUpdt) {
        this.tUpdt = tUpdt;
    }

    public String gettNote() {
        return tNote;
    }

    public void settNote(String tNote) {
        this.tNote = tNote;
    }
}
