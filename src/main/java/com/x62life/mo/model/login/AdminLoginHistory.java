package com.x62life.mo.model.login;

import java.sql.Timestamp;
//관리자 로그인 이력
/*@Alias("adminLoginHistory")*/
public class AdminLoginHistory {
    private int nox; //순번
    private String memid; //로그인id
    private String empno; //사용자코드
    private String memgroup; //부서코드
    private String memclass; //직무코드
    private String memname; //사용자명
    private Timestamp datex; //등록일시
    private String ipx; //로그인ip
    private String refererx; //연결url
    private String userAgent; //user agent(브라우져)

    public int getNox() {
        return nox;
    }

    public void setNox(int nox) {
        this.nox = nox;
    }

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getMemgroup() {
        return memgroup;
    }

    public void setMemgroup(String memgroup) {
        this.memgroup = memgroup;
    }

    public String getMemclass() {
        return memclass;
    }

    public void setMemclass(String memclass) {
        this.memclass = memclass;
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        this.memname = memname;
    }

    public Timestamp getDatex() {
        return datex;
    }

    public void setDatex(Timestamp datex) {
        this.datex = datex;
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

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
