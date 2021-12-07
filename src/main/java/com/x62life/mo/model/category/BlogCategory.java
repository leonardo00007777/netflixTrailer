package com.x62life.mo.model.category;

//블로그 카테고리

/*@Alias("blogCategory")*/
public class BlogCategory {
    private String memid; //회원아이디
    private String cgroup; //블로그 그룹코드
    private String cgroupname; //블로그 그룹코드명
    private short csort; //정렬순번

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public String getCgroup() {
        return cgroup;
    }

    public void setCgroup(String cgroup) {
        this.cgroup = cgroup;
    }

    public String getCgroupname() {
        return cgroupname;
    }

    public void setCgroupname(String cgroupname) {
        this.cgroupname = cgroupname;
    }

    public short getCsort() {
        return csort;
    }

    public void setCsort(short csort) {
        this.csort = csort;
    }
}
