package com.x62life.mo.model.order;

import java.sql.Timestamp;

//주문 기본정보
public class OdHeader {
    private char ordnum; //주문번호
    private char memcd; //회원번호
    private char dlvdt; //배송일자
    private char dlvstcd; //배송상태 cd_master.cdtype[04] 00:결제대기 01:결제완료 05:상품준비중 10:출고작업중 20:출고됨 25:출고작업중(직) 30:배송중
                                                      // 40:배송완료 50:반품접수 51:반품완료 52:부분취소 53:교환등록 54:교환완료 99:배송취소"
    private Timestamp orddt; //주문일시
    private Timestamp updt; //수정일시
    private char sendyn; //전송여부
    private String wmsordnum; //wmsl주문번호
    private char wmsstcd; //wmsl출고상태(?)
    private Timestamp wmsupdt; //wmsl출고일시
    private String invoicenum; //운송장번호
    private char odgubun; //주문유형 "cd_master.cdtype[21] 01:법인판매 02:지정일 03:법인직배 05:자동 06:재배송
                                                      // 07:업체직송(재)08:직거래(재) 09:판촉마케팅 10:(구)업체직송
                                                      // 11:신속 12:예약 13:공동구매 14:사내재고 15:업체직송 16:제휴판매
                                                      // 17:제휴판매(재) 18:판촉마케팅(업) 19:판촉마케팅(직) 20:상품확인(업)
                                                      //21:상품확인(직) 22:고객접대 23:고객접대(직) 24:복리후생 25:복리후생(직) 91:테스트주문 HO:명절"

    private char paystcd; //결제상태 cd_master.cdtype[03] 00:결제준비 01:입금대기 02:카드결제대기
                                                     // 10:결제완료 90:결제실패 91:결제취소신청 95:카드결제중단 99:결제취소
    private String paynum; //결제번호
    private char hideyn; //주문내역숨김
    private char linkordnum; //연관주문번호
    private String comments; //기타사항
    private String batchdacd; //일괄배송지정보
    private Timestamp outdt; //출고일시
    private Timestamp shipdt; //출고작업(예정)일시
    private String odsuno; //공급자코드

    public char getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(char ordnum) {
        this.ordnum = ordnum;
    }

    public char getMemcd() {
        return memcd;
    }

    public void setMemcd(char memcd) {
        this.memcd = memcd;
    }

    public char getDlvdt() {
        return dlvdt;
    }

    public void setDlvdt(char dlvdt) {
        this.dlvdt = dlvdt;
    }

    public char getDlvstcd() {
        return dlvstcd;
    }

    public void setDlvstcd(char dlvstcd) {
        this.dlvstcd = dlvstcd;
    }

    public Timestamp getOrddt() {
        return orddt;
    }

    public void setOrddt(Timestamp orddt) {
        this.orddt = orddt;
    }

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }

    public char getSendyn() {
        return sendyn;
    }

    public void setSendyn(char sendyn) {
        this.sendyn = sendyn;
    }

    public String getWmsordnum() {
        return wmsordnum;
    }

    public void setWmsordnum(String wmsordnum) {
        this.wmsordnum = wmsordnum;
    }

    public char getWmsstcd() {
        return wmsstcd;
    }

    public void setWmsstcd(char wmsstcd) {
        this.wmsstcd = wmsstcd;
    }

    public Timestamp getWmsupdt() {
        return wmsupdt;
    }

    public void setWmsupdt(Timestamp wmsupdt) {
        this.wmsupdt = wmsupdt;
    }

    public String getInvoicenum() {
        return invoicenum;
    }

    public void setInvoicenum(String invoicenum) {
        this.invoicenum = invoicenum;
    }

    public char getOdgubun() {
        return odgubun;
    }

    public void setOdgubun(char odgubun) {
        this.odgubun = odgubun;
    }

    public char getPaystcd() {
        return paystcd;
    }

    public void setPaystcd(char paystcd) {
        this.paystcd = paystcd;
    }

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public char getHideyn() {
        return hideyn;
    }

    public void setHideyn(char hideyn) {
        this.hideyn = hideyn;
    }

    public char getLinkordnum() {
        return linkordnum;
    }

    public void setLinkordnum(char linkordnum) {
        this.linkordnum = linkordnum;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBatchdacd() {
        return batchdacd;
    }

    public void setBatchdacd(String batchdacd) {
        this.batchdacd = batchdacd;
    }

    public Timestamp getOutdt() {
        return outdt;
    }

    public void setOutdt(Timestamp outdt) {
        this.outdt = outdt;
    }

    public Timestamp getShipdt() {
        return shipdt;
    }

    public void setShipdt(Timestamp shipdt) {
        this.shipdt = shipdt;
    }

    public String getOdsuno() {
        return odsuno;
    }

    public void setOdsuno(String odsuno) {
        this.odsuno = odsuno;
    }
}
