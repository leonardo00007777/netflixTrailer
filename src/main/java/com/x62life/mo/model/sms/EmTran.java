package com.x62life.mo.model.sms;

import java.sql.Timestamp;
/*@Alias("emTran")*/
//문자전송
public class EmTran {
    private int tranPr;
    private String tranRefkey;
    private String tranId;
    private String tranPhone; //전송 전화번호
    private String tranCallback; //회신 번호
    private char tranStatus; //전송상태
    private Timestamp tranDate; //전송일시
    private Timestamp tranRsltdate;
    private Timestamp tranReportdate;
    private char tranRslt;
    private String tranNet;
    private String tranMsg; //전송 메세지
    private String tranEtc1;
    private String tranEtc2;
    private String tranEtc3;
    private int tranEtc4;
    private int tranType; //전송유형

    public int getTranPr() {
        return tranPr;
    }

    public void setTranPr(int tranPr) {
        this.tranPr = tranPr;
    }

    public String getTranRefkey() {
        return tranRefkey;
    }

    public void setTranRefkey(String tranRefkey) {
        this.tranRefkey = tranRefkey;
    }

    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public String getTranPhone() {
        return tranPhone;
    }

    public void setTranPhone(String tranPhone) {
        this.tranPhone = tranPhone;
    }

    public String getTranCallback() {
        return tranCallback;
    }

    public void setTranCallback(String tranCallback) {
        this.tranCallback = tranCallback;
    }

    public char getTranStatus() {
        return tranStatus;
    }

    public void setTranStatus(char tranStatus) {
        this.tranStatus = tranStatus;
    }

    public Timestamp getTranDate() {
        return tranDate;
    }

    public void setTranDate(Timestamp tranDate) {
        this.tranDate = tranDate;
    }

    public Timestamp getTranRsltdate() {
        return tranRsltdate;
    }

    public void setTranRsltdate(Timestamp tranRsltdate) {
        this.tranRsltdate = tranRsltdate;
    }

    public Timestamp getTranReportdate() {
        return tranReportdate;
    }

    public void setTranReportdate(Timestamp tranReportdate) {
        this.tranReportdate = tranReportdate;
    }

    public char getTranRslt() {
        return tranRslt;
    }

    public void setTranRslt(char tranRslt) {
        this.tranRslt = tranRslt;
    }

    public String getTranNet() {
        return tranNet;
    }

    public void setTranNet(String tranNet) {
        this.tranNet = tranNet;
    }

    public String getTranMsg() {
        return tranMsg;
    }

    public void setTranMsg(String tranMsg) {
        this.tranMsg = tranMsg;
    }

    public String getTranEtc1() {
        return tranEtc1;
    }

    public void setTranEtc1(String tranEtc1) {
        this.tranEtc1 = tranEtc1;
    }

    public String getTranEtc2() {
        return tranEtc2;
    }

    public void setTranEtc2(String tranEtc2) {
        this.tranEtc2 = tranEtc2;
    }

    public String getTranEtc3() {
        return tranEtc3;
    }

    public void setTranEtc3(String tranEtc3) {
        this.tranEtc3 = tranEtc3;
    }

    public int getTranEtc4() {
        return tranEtc4;
    }

    public void setTranEtc4(int tranEtc4) {
        this.tranEtc4 = tranEtc4;
    }

    public int getTranType() {
        return tranType;
    }

    public void setTranType(int tranType) {
        this.tranType = tranType;
    }
}
