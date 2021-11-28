package com.x62life.mo.model.boardcontents;

public class BdNoticeEx extends BdFaq{
    private char cdtype;
    private char cdcode;
    private String cdname;
    private char useyn;
    private String cdval1;
    private String cdval2;

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

    @Override
    public char getUseyn() {
        return useyn;
    }

    @Override
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
