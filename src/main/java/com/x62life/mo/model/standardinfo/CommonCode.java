package com.x62life.mo.model.standardinfo;
//공통코드
public class CommonCode {
    private char cdtype; //코드유형
    private char cdcode; //코드
    private String cdname; //코드명
    private char useyn; //사용여부
    private String cdval1; //추가값1
    private String cdval2; //추가값2

    public char getCdtype() {
        return cdtype;
    }

    public void setCdtype(char cdtype) {
        this.cdtype = cdtype;
    }

    public char getCdcode() {
        return cdcode;
    }

    public void setCdcode(char cdcode) {
        this.cdcode = cdcode;
    }

    public String getCdname() {
        return cdname;
    }

    public void setCdname(String cdname) {
        this.cdname = cdname;
    }

    public char getUseyn() {
        return useyn;
    }

    public void setUseyn(char useyn) {
        this.useyn = useyn;
    }

    public String getCdval1() {
        return cdval1;
    }

    public void setCdval1(String cdval1) {
        this.cdval1 = cdval1;
    }

    public String getCdval2() {
        return cdval2;
    }

    public void setCdval2(String cdval2) {
        this.cdval2 = cdval2;
    }
}
