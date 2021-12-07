package com.x62life.mo.model.sms;

//카카오 문자전송
/*@Alias("emTranKaKao")*/
public class EmTranKaKao {
    private int kkoSeq; //순번
    private String senderKey; //카카오key
    private String templateCode; //카카오템플릿 코드
    private String nationCode; //국가코드
    private String message; //메세지
    private String rePart;
    private String reType; //문자유형
    private String reBody; //내용
    private String reSubject;
    private String userKey;
    private String adFlag;
    private String responseMethod;
    private int timeout;
    private String attachedFile1; //연결url
    private String attachedFile2;
    private String attachedFile3;
    private String attachedFile4;
    private String attachedFile5;

    public int getKkoSeq() {
        return kkoSeq;
    }

    public void setKkoSeq(int kkoSeq) {
        this.kkoSeq = kkoSeq;
    }

    public String getSenderKey() {
        return senderKey;
    }

    public void setSenderKey(String senderKey) {
        this.senderKey = senderKey;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRePart() {
        return rePart;
    }

    public void setRePart(String rePart) {
        this.rePart = rePart;
    }

    public String getReType() {
        return reType;
    }

    public void setReType(String reType) {
        this.reType = reType;
    }

    public String getReBody() {
        return reBody;
    }

    public void setReBody(String reBody) {
        this.reBody = reBody;
    }

    public String getReSubject() {
        return reSubject;
    }

    public void setReSubject(String reSubject) {
        this.reSubject = reSubject;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getAdFlag() {
        return adFlag;
    }

    public void setAdFlag(String adFlag) {
        this.adFlag = adFlag;
    }

    public String getResponseMethod() {
        return responseMethod;
    }

    public void setResponseMethod(String responseMethod) {
        this.responseMethod = responseMethod;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getAttachedFile1() {
        return attachedFile1;
    }

    public void setAttachedFile1(String attachedFile1) {
        this.attachedFile1 = attachedFile1;
    }

    public String getAttachedFile2() {
        return attachedFile2;
    }

    public void setAttachedFile2(String attachedFile2) {
        this.attachedFile2 = attachedFile2;
    }

    public String getAttachedFile3() {
        return attachedFile3;
    }

    public void setAttachedFile3(String attachedFile3) {
        this.attachedFile3 = attachedFile3;
    }

    public String getAttachedFile4() {
        return attachedFile4;
    }

    public void setAttachedFile4(String attachedFile4) {
        this.attachedFile4 = attachedFile4;
    }

    public String getAttachedFile5() {
        return attachedFile5;
    }

    public void setAttachedFile5(String attachedFile5) {
        this.attachedFile5 = attachedFile5;
    }
}
