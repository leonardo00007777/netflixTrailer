package com.netflix.app.model.login;

import com.netflix.app.model.member.MbMaster;

/*@Alias("loginProcess")*/
public class LoginProcess extends MbMaster {
    private String nickn;
    private String idurl;
    private String memlevel;
    private String jobtype;
    private String jobname;
    private String  isblogger;
    private String islocked;
    private int loginFailedCount;

	private String passyn;
    private String idx;
    private String points;
    private String memo;    
    
    
    public int getLoginFailedCount() {
    	return loginFailedCount;
    }
    public void setLoginFailedCount(int loginFailedCount) {
    	this.loginFailedCount = loginFailedCount;
    }
	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

    public String getPassyn() {
		return passyn;
	}

	public void setPassyn(String passyn) {
		this.passyn = passyn;
	}

    public String getNickn() {
        return nickn;
    }

    public void setNickn(String nickn) {
        this.nickn = nickn;
    }

    public String getIdurl() {
        return idurl;
    }

    public void setIdurl(String idurl) {
        this.idurl = idurl;
    }

    public String getMemlevel() {
        return memlevel;
    }

    public void setMemlevel(String memlevel) {
        this.memlevel = memlevel;
    }

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getIsblogger() {
        return isblogger;
    }

    public void setIsblogger(String isblogger) {
        this.isblogger = isblogger;
    }

    public String getIslocked() {
        return islocked;
    }

    public void setIslocked(String islocked) {
        this.islocked = islocked;
    }

}
