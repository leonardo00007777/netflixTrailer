package com.x62life.mo.model.standardinfo;

/*@Alias("commonCode")*/
//공통코드
public class CommonCode {
    private String cdtype; //코드유형
    private String cdcode; //코드
    private String cdname; //코드명
    private String useyn; //사용여부
    private String cdval1; //추가값1
    private String cdval2; //추가값2

    public String getCdtype() {
        return cdtype;
    }

    public void setCdtype(String cdtype) {
        this.cdtype = cdtype;
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

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
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
