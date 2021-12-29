package com.x62life.mo.model.product;

/*@Alias("productReview")*/
public class ProductReviewEx extends ProductReview {
   private String nickn;
   private String ppath;
   private String smemo;
   private String isblogger;
   private String memname;
   private String memlevel;
   private String orddt;

    public String getNickn() {
        return nickn;
    }

    public void setNickn(String nickn) {
        this.nickn = nickn;
    }

    public String getPpath() {
        return ppath;
    }

    public void setPpath(String ppath) {
        this.ppath = ppath;
    }

    public String getSmemo() {
        return smemo;
    }

    public void setSmemo(String smemo) {
        this.smemo = smemo;
    }

    public String getIsblogger() {
        return isblogger;
    }

    public void setIsblogger(String isblogger) {
        this.isblogger = isblogger;
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        this.memname = memname;
    }

    public String getMemlevel() {
        return memlevel;
    }

    public void setMemlevel(String memlevel) {
        this.memlevel = memlevel;
    }

    public String getOrddt() {
        return orddt;
    }

    public void setOrddt(String orddt) {
        this.orddt = orddt;
    }
}
