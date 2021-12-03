package com.x62life.mo.model.sms;

import org.apache.ibatis.type.Alias;

@Alias("emTranMMS")
//장문 템플릿
public class EmTranMMS {
    private int mmsSeq; //순번
    private int fileCnt; //
    private char buildYn; //
    private String mmsBody; //내용
    private String mmsSubject; //제목
    private String fileType1;
    private String fileType2;
    private String fileType3;
    private String fileType4;
    private String fileType5;
    private String fileName1;
    private String fileName2;
    private String fileName3;
    private String fileName4;
    private String fileName5;
    private String serviceDep1;
    private String serviceDep2;
    private String serviceDep3;
    private String serviceDep4;
    private String serviceDep5;
    private String sknFileName;

    public int getMmsSeq() {
        return mmsSeq;
    }

    public void setMmsSeq(int mmsSeq) {
        this.mmsSeq = mmsSeq;
    }

    public int getFileCnt() {
        return fileCnt;
    }

    public void setFileCnt(int fileCnt) {
        this.fileCnt = fileCnt;
    }

    public char getBuildYn() {
        return buildYn;
    }

    public void setBuildYn(char buildYn) {
        this.buildYn = buildYn;
    }

    public String getMmsBody() {
        return mmsBody;
    }

    public void setMmsBody(String mmsBody) {
        this.mmsBody = mmsBody;
    }

    public String getMmsSubject() {
        return mmsSubject;
    }

    public void setMmsSubject(String mmsSubject) {
        this.mmsSubject = mmsSubject;
    }

    public String getFileType1() {
        return fileType1;
    }

    public void setFileType1(String fileType1) {
        this.fileType1 = fileType1;
    }

    public String getFileType2() {
        return fileType2;
    }

    public void setFileType2(String fileType2) {
        this.fileType2 = fileType2;
    }

    public String getFileType3() {
        return fileType3;
    }

    public void setFileType3(String fileType3) {
        this.fileType3 = fileType3;
    }

    public String getFileType4() {
        return fileType4;
    }

    public void setFileType4(String fileType4) {
        this.fileType4 = fileType4;
    }

    public String getFileType5() {
        return fileType5;
    }

    public void setFileType5(String fileType5) {
        this.fileType5 = fileType5;
    }

    public String getFileName1() {
        return fileName1;
    }

    public void setFileName1(String fileName1) {
        this.fileName1 = fileName1;
    }

    public String getFileName2() {
        return fileName2;
    }

    public void setFileName2(String fileName2) {
        this.fileName2 = fileName2;
    }

    public String getFileName3() {
        return fileName3;
    }

    public void setFileName3(String fileName3) {
        this.fileName3 = fileName3;
    }

    public String getFileName4() {
        return fileName4;
    }

    public void setFileName4(String fileName4) {
        this.fileName4 = fileName4;
    }

    public String getFileName5() {
        return fileName5;
    }

    public void setFileName5(String fileName5) {
        this.fileName5 = fileName5;
    }

    public String getServiceDep1() {
        return serviceDep1;
    }

    public void setServiceDep1(String serviceDep1) {
        this.serviceDep1 = serviceDep1;
    }

    public String getServiceDep2() {
        return serviceDep2;
    }

    public void setServiceDep2(String serviceDep2) {
        this.serviceDep2 = serviceDep2;
    }

    public String getServiceDep3() {
        return serviceDep3;
    }

    public void setServiceDep3(String serviceDep3) {
        this.serviceDep3 = serviceDep3;
    }

    public String getServiceDep4() {
        return serviceDep4;
    }

    public void setServiceDep4(String serviceDep4) {
        this.serviceDep4 = serviceDep4;
    }

    public String getServiceDep5() {
        return serviceDep5;
    }

    public void setServiceDep5(String serviceDep5) {
        this.serviceDep5 = serviceDep5;
    }

    public String getSknFileName() {
        return sknFileName;
    }

    public void setSknFileName(String sknFileName) {
        this.sknFileName = sknFileName;
    }
}
