package com.x62life.mo.model.login;

import java.sql.Timestamp;
//관리자 로그인 정보

/*@Alias("adminLoginInfo")*/
public class AdminLoginInfo {
    private String memid; //로그인id
    private Timestamp lastLogin; //최근로그인일시
    private Timestamp lastLogout; //최근로그아웃일시
    private boolean islogin; //로그인여부
    private int loginCount; //로그인수
    private int loginFailedCount; //로그인실패수
    private int islocked; //잠금여부
    private String ipx; //로그인ip

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Timestamp getLastLogout() {
        return lastLogout;
    }

    public void setLastLogout(Timestamp lastLogout) {
        this.lastLogout = lastLogout;
    }

    public boolean isIslogin() {
        return islogin;
    }

    public void setIslogin(boolean islogin) {
        this.islogin = islogin;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public int getLoginFailedCount() {
        return loginFailedCount;
    }

    public void setLoginFailedCount(int loginFailedCount) {
        this.loginFailedCount = loginFailedCount;
    }

    public int getIslocked() {
        return islocked;
    }

    public void setIslocked(int islocked) {
        this.islocked = islocked;
    }

    public String getIpx() {
        return ipx;
    }

    public void setIpx(String ipx) {
        this.ipx = ipx;
    }
}
