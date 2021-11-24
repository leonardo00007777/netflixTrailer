package com.x62life.mo.model.login;

import java.sql.Timestamp;
//sns로그인
public class SnsLoginMaster {
    private char snsType; //sns 유형
    private String snsId; //sns id
    private String snsEmail; //sns 이메일
    private String snsCmcd; //회원번호
    private char snsConn; //sns 연동여부
    private Timestamp snsConndt; //sns 연동일시
    private String snsInfo01; //회원명
    private String snsInfo02; //성별
    private String snsInfo03; //생일
    private String snsInfo04; //연령대
    private String snsInfo05; //sns info5
    private String snsInfo06; //sns info6
    private String snsInfo07; //sns info7
    private byte[] snsEmailEnc; //sns 이메일 enc

    public char getSnsType() {
        return snsType;
    }

    public void setSnsType(char snsType) {
        this.snsType = snsType;
    }

    public String getSnsId() {
        return snsId;
    }

    public void setSnsId(String snsId) {
        this.snsId = snsId;
    }

    public String getSnsEmail() {
        return snsEmail;
    }

    public void setSnsEmail(String snsEmail) {
        this.snsEmail = snsEmail;
    }

    public String getSnsCmcd() {
        return snsCmcd;
    }

    public void setSnsCmcd(String snsCmcd) {
        this.snsCmcd = snsCmcd;
    }

    public char getSnsConn() {
        return snsConn;
    }

    public void setSnsConn(char snsConn) {
        this.snsConn = snsConn;
    }

    public Timestamp getSnsConndt() {
        return snsConndt;
    }

    public void setSnsConndt(Timestamp snsConndt) {
        this.snsConndt = snsConndt;
    }

    public String getSnsInfo01() {
        return snsInfo01;
    }

    public void setSnsInfo01(String snsInfo01) {
        this.snsInfo01 = snsInfo01;
    }

    public String getSnsInfo02() {
        return snsInfo02;
    }

    public void setSnsInfo02(String snsInfo02) {
        this.snsInfo02 = snsInfo02;
    }

    public String getSnsInfo03() {
        return snsInfo03;
    }

    public void setSnsInfo03(String snsInfo03) {
        this.snsInfo03 = snsInfo03;
    }

    public String getSnsInfo04() {
        return snsInfo04;
    }

    public void setSnsInfo04(String snsInfo04) {
        this.snsInfo04 = snsInfo04;
    }

    public String getSnsInfo05() {
        return snsInfo05;
    }

    public void setSnsInfo05(String snsInfo05) {
        this.snsInfo05 = snsInfo05;
    }

    public String getSnsInfo06() {
        return snsInfo06;
    }

    public void setSnsInfo06(String snsInfo06) {
        this.snsInfo06 = snsInfo06;
    }

    public String getSnsInfo07() {
        return snsInfo07;
    }

    public void setSnsInfo07(String snsInfo07) {
        this.snsInfo07 = snsInfo07;
    }

    public byte[] getSnsEmailEnc() {
        return snsEmailEnc;
    }

    public void setSnsEmailEnc(byte[] snsEmailEnc) {
        this.snsEmailEnc = snsEmailEnc;
    }
}
