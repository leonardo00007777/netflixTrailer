package com.netflix.app.model.purchase;

import java.sql.Timestamp;
/*@Alias("purchasingBasicInfo")*/
//구매 기본정보 (POHeader)
public class PurchasingBasicInfo {
    private String pocomp; //회사코드
    private String ponmor; //구매주문번호
    private String pocdpo; //구매주문유형
    private String pocdst; //구매주문상태
    private String posuno; //공급자코드
    private Timestamp podtpo; //발주일시
    private Timestamp podtdl; //최종납품일시
    private Timestamp podudt; //납기일시
    private Timestamp popudt; //입고예정일시
    private String poplac; //창고코드
    private short ponmli; //라인
    private String ponote; //요청사항(메모)
    private String pousid; //수정id
    private Timestamp poupdt; //수정일시
    private String poexfl; //추출여부
    private Timestamp poexdt; //추출여부등록일시
    private String portno; //구매주문번호(반품처리)

    public String getPocomp() {
        return pocomp;
    }

    public void setPocomp(String pocomp) {
        this.pocomp = pocomp;
    }

    public String getPonmor() {
        return ponmor;
    }

    public void setPonmor(String ponmor) {
        this.ponmor = ponmor;
    }

    public String getPocdpo() {
        return pocdpo;
    }

    public void setPocdpo(String pocdpo) {
        this.pocdpo = pocdpo;
    }

    public String getPocdst() {
        return pocdst;
    }

    public void setPocdst(String pocdst) {
        this.pocdst = pocdst;
    }

    public String getPosuno() {
        return posuno;
    }

    public void setPosuno(String posuno) {
        this.posuno = posuno;
    }

    public Timestamp getPodtpo() {
        return podtpo;
    }

    public void setPodtpo(Timestamp podtpo) {
        this.podtpo = podtpo;
    }

    public Timestamp getPodtdl() {
        return podtdl;
    }

    public void setPodtdl(Timestamp podtdl) {
        this.podtdl = podtdl;
    }

    public Timestamp getPodudt() {
        return podudt;
    }

    public void setPodudt(Timestamp podudt) {
        this.podudt = podudt;
    }

    public Timestamp getPopudt() {
        return popudt;
    }

    public void setPopudt(Timestamp popudt) {
        this.popudt = popudt;
    }

    public String getPoplac() {
        return poplac;
    }

    public void setPoplac(String poplac) {
        this.poplac = poplac;
    }

    public short getPonmli() {
        return ponmli;
    }

    public void setPonmli(short ponmli) {
        this.ponmli = ponmli;
    }

    public String getPonote() {
        return ponote;
    }

    public void setPonote(String ponote) {
        this.ponote = ponote;
    }

    public String getPousid() {
        return pousid;
    }

    public void setPousid(String pousid) {
        this.pousid = pousid;
    }

    public Timestamp getPoupdt() {
        return poupdt;
    }

    public void setPoupdt(Timestamp poupdt) {
        this.poupdt = poupdt;
    }

    public String getPoexfl() {
        return poexfl;
    }

    public void setPoexfl(String poexfl) {
        this.poexfl = poexfl;
    }

    public Timestamp getPoexdt() {
        return poexdt;
    }

    public void setPoexdt(Timestamp poexdt) {
        this.poexdt = poexdt;
    }

    public String getPortno() {
        return portno;
    }

    public void setPortno(String portno) {
        this.portno = portno;
    }
}
