package com.netflix.app.model.product;

import java.sql.Timestamp;
/*@Alias("eventCalendar")*/
//이벤트 달력
public class EventCalendar {
    private int idschedule; //순번
    private String vcdevid;
    private String vcevent; //이벤트 제목
    private String vcwhere;
    private String vctype; //이벤트 구분
    private String chopen;
    private Timestamp dtsdate; //이벤트 시작일시
    private Timestamp dtrdate; //이벤트 종료일시
    private String vcdesc; //이벤트 내용
    private String chrepeat;
    private String chrtype;
    private String chdtype;
    private int infortime;

    public int getIdschedule() {
        return idschedule;
    }

    public void setIdschedule(int idschedule) {
        this.idschedule = idschedule;
    }

    public String getVcdevid() {
        return vcdevid;
    }

    public void setVcdevid(String vcdevid) {
        this.vcdevid = vcdevid;
    }

    public String getVcevent() {
        return vcevent;
    }

    public void setVcevent(String vcevent) {
        this.vcevent = vcevent;
    }

    public String getVcwhere() {
        return vcwhere;
    }

    public void setVcwhere(String vcwhere) {
        this.vcwhere = vcwhere;
    }

    public String getVctype() {
        return vctype;
    }

    public void setVctype(String vctype) {
        this.vctype = vctype;
    }

    public String getChopen() {
        return chopen;
    }

    public void setChopen(String chopen) {
        this.chopen = chopen;
    }

    public Timestamp getDtsdate() {
        return dtsdate;
    }

    public void setDtsdate(Timestamp dtsdate) {
        this.dtsdate = dtsdate;
    }

    public Timestamp getDtrdate() {
        return dtrdate;
    }

    public void setDtrdate(Timestamp dtrdate) {
        this.dtrdate = dtrdate;
    }

    public String getVcdesc() {
        return vcdesc;
    }

    public void setVcdesc(String vcdesc) {
        this.vcdesc = vcdesc;
    }

    public String getChrepeat() {
        return chrepeat;
    }

    public void setChrepeat(String chrepeat) {
        this.chrepeat = chrepeat;
    }

    public String getChrtype() {
        return chrtype;
    }

    public void setChrtype(String chrtype) {
        this.chrtype = chrtype;
    }

    public String getChdtype() {
        return chdtype;
    }

    public void setChdtype(String chdtype) {
        this.chdtype = chdtype;
    }

    public int getInfortime() {
        return infortime;
    }

    public void setInfortime(int infortime) {
        this.infortime = infortime;
    }
}
