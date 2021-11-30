package com.x62life.mo.model.login;

import java.sql.Timestamp;
//회원 로그인 이력
public class MemberLoginHistory {
    private int nox; //순번
    private String memcd; //회원번호
    private Timestamp datex; //등록일시
    private String daysx; //등록요일
    private short hourx; //등록시간
    private String ipx; //로그인ip
    private String refererx; //연결url
    private String device; //연결device유형
    private String userAgent; //user agent(브라우져)

    public int getNox() {
        return nox;
    }

    public void setNox(int nox) {
        this.nox = nox;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public Timestamp getDatex() {
        return datex;
    }

    public void setDatex(Timestamp datex) {
        this.datex = datex;
    }

    public String getDaysx() {
        return daysx;
    }

    public void setDaysx(String daysx) {
        this.daysx = daysx;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public short getHourx() {
        return hourx;
    }

    public void setHourx(short hourx) {
        this.hourx = hourx;
    }

    public String getIpx() {
        return ipx;
    }

    public void setIpx(String ipx) {
        this.ipx = ipx;
    }

    public String getRefererx() {
        return refererx;
    }

    public void setRefererx(String refererx) {
        this.refererx = refererx;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getuserAgent() {
        return userAgent;
    }

    public void setuserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
