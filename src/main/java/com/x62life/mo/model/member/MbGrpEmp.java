package com.x62life.mo.model.member;

import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Alias("mbGrpEmp")
//회원 그룹사 직원
public class MbGrpEmp {
    private String grpcd; //그룹사코드
    private String empnum; //사번
    private String empname; //사원명
    private char gradecd; //등급코드
    private String email; //이메일
    private String hpno; //전화번호
    private Timestamp retiredt; //가입일시
    private String retireip; //수정코드
    private char joinyn; //승인이력
    private byte[] emailEnc; //이메일 enc
    private byte[] hpnoEnc; //전화번호 enc
    private BigDecimal initpoint; //초기부여포인트
    private char nodeductpay; //급여공제여부
    private Timestamp indt; //등록일시
    private String upid; //수정id
    private Timestamp updt; //수정일시
    private char joinmailyn; //메일가입여부
    private Timestamp joinmaildt; //메일등록일시

    public String getGrpcd() {
        return grpcd;
    }

    public void setGrpcd(String grpcd) {
        this.grpcd = grpcd;
    }

    public String getEmpnum() {
        return empnum;
    }

    public void setEmpnum(String empnum) {
        this.empnum = empnum;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public char getGradecd() {
        return gradecd;
    }

    public void setGradecd(char gradecd) {
        this.gradecd = gradecd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHpno() {
        return hpno;
    }

    public void setHpno(String hpno) {
        this.hpno = hpno;
    }

    public Timestamp getRetiredt() {
        return retiredt;
    }

    public void setRetiredt(Timestamp retiredt) {
        this.retiredt = retiredt;
    }

    public String getRetireip() {
        return retireip;
    }

    public void setRetireip(String retireip) {
        this.retireip = retireip;
    }

    public char getJoinyn() {
        return joinyn;
    }

    public void setJoinyn(char joinyn) {
        this.joinyn = joinyn;
    }

    public byte[] getEmailEnc() {
        return emailEnc;
    }

    public void setEmailEnc(byte[] emailEnc) {
        this.emailEnc = emailEnc;
    }

    public byte[] getHpnoEnc() {
        return hpnoEnc;
    }

    public void setHpnoEnc(byte[] hpnoEnc) {
        this.hpnoEnc = hpnoEnc;
    }

    public BigDecimal getInitpoint() {
        return initpoint;
    }

    public void setInitpoint(BigDecimal initpoint) {
        this.initpoint = initpoint;
    }

    public char getNodeductpay() {
        return nodeductpay;
    }

    public void setNodeductpay(char nodeductpay) {
        this.nodeductpay = nodeductpay;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public String getUpid() {
        return upid;
    }

    public void setUpid(String upid) {
        this.upid = upid;
    }

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }

    public char getJoinmailyn() {
        return joinmailyn;
    }

    public void setJoinmailyn(char joinmailyn) {
        this.joinmailyn = joinmailyn;
    }

    public Timestamp getJoinmaildt() {
        return joinmaildt;
    }

    public void setJoinmaildt(Timestamp joinmaildt) {
        this.joinmaildt = joinmaildt;
    }
}
