package com.netflix.app.model.order;

/*@Alias("odMember")*/
//주문회원 정보
public class OdMember {
    private String paynum; //결제번호
    private String memcd; //회원번호
    private String grpcd; //그룹사코드
    private String gradecd; //등급
    private String empnum; //사번
    private String memname; //회원명
    private String telno; //전화번호
    private String hpno; //휴대전화
    private String email; //이메일
    private byte[] telnoenc; //전화번호 enc
    private byte[] hpnoenc; //휴대전화 enc
    private byte[] emailenc; //이메일 enc

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public String getGrpcd() {
        return grpcd;
    }

    public void setGrpcd(String grpcd) {
        this.grpcd = grpcd;
    }

    public String getGradecd() {
        return gradecd;
    }

    public void setGradecd(String gradecd) {
        this.gradecd = gradecd;
    }

    public String getEmpnum() {
        return empnum;
    }

    public void setEmpnum(String empnum) {
        this.empnum = empnum;
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        this.memname = memname;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getHpno() {
        return hpno;
    }

    public void setHpno(String hpno) {
        this.hpno = hpno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getTelnoenc() {
        return telnoenc;
    }

    public void setTelnoenc(byte[] telnoenc) {
        this.telnoenc = telnoenc;
    }

    public byte[] getHpnoenc() {
        return hpnoenc;
    }

    public void setHpnoenc(byte[] hpnoenc) {
        this.hpnoenc = hpnoenc;
    }

    public byte[] getEmailenc() {
        return emailenc;
    }

    public void setEmailenc(byte[] emailenc) {
        this.emailenc = emailenc;
    }
}
