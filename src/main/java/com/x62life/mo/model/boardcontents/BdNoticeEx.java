package com.x62life.mo.model.boardcontents;


/*@Alias("bdNoticeEx")*/
public class BdNoticeEx extends BdFaq{
    private String cdtype;
    private String cdcode;
    private String cdname;
    private String useyn;
    private String cdval1;
    private String cdval2;

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

    @Override
    public String getUseyn() {
        return useyn;
    }

    @Override
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
