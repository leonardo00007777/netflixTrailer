package com.netflix.app.model.order;

/*@Alias("odItemIdx")*/
//주문 item Index
public class OdItemIdx {
    private int odcnt;
    private int odidx;

    public int getOdcnt() {
        return odcnt;
    }

    public void setOdcnt(int odcnt) {
        this.odcnt = odcnt;
    }

    public int getOdidx() {
        return odidx;
    }

    public void setOdidx(int odidx) {
        this.odidx = odidx;
    }
}
