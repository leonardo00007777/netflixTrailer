package com.netflix.app.model.boardcontents;

import java.sql.Timestamp;
//Qna 게시판
/*@Alias("bdQna")*/
public class BdQna {
    private int qnaidx; //순번
    private int pidx; //답글순번
    private short relevel; //답글존재여부
    private String memcd; //회원코드
    private String memname; //회원명
    private String email; //이메일
    private String phone; //전화번호
    private String title; //(문의/답변)제목
    private String content; //(문의/답변)내용
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private String useyn; //사용여부
    private String openyn; //공개여부
    private String onpid; //진행담당자
    private String updid; //수정자id
    private String categoryCode; //문의분류
    private String subcategoryCode; //문의분류
    private String paynum; //결제번호
    private String keyword; //키워드
    private String attachpath; //첨부파일1
    private String attachpath2; //첨부파일2
    private String attachpath3; //첨부파일3
    private String ordnum; //주문번호

    public int getQnaidx() {
        return qnaidx;
    }

    public void setQnaidx(int qnaidx) {
        this.qnaidx = qnaidx;
    }

    public int getPidx() {
        return pidx;
    }

    public void setPidx(int pidx) {
        this.pidx = pidx;
    }

    public short getRelevel() {
        return relevel;
    }

    public void setRelevel(short relevel) {
        this.relevel = relevel;
    }

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        this.memname = memname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }

    public String getOpenyn() {
        return openyn;
    }

    public void setOpenyn(String openyn) {
        this.openyn = openyn;
    }

    public String getOnpid() {
        return onpid;
    }

    public void setOnpid(String onpid) {
        this.onpid = onpid;
    }

    public String getUpdid() {
        return updid;
    }

    public void setUpdid(String updid) {
        this.updid = updid;
    }

    public String getcategoryCode() {
        return categoryCode;
    }

    public void setcategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getSubcategoryCode() {
        return subcategoryCode;
    }

    public void setSubcategoryCode(String subcategoryCode) {
        this.subcategoryCode = subcategoryCode;
    }

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getAttachpath() {
        return attachpath;
    }

    public void setAttachpath(String attachpath) {
        this.attachpath = attachpath;
    }

    public String getAttachpath2() {
        return attachpath2;
    }

    public void setAttachpath2(String attachpath2) {
        this.attachpath2 = attachpath2;
    }

    public String getAttachpath3() {
        return attachpath3;
    }

    public void setAttachpath3(String attachpath3) {
        this.attachpath3 = attachpath3;
    }

    public String getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(String ordnum) {
        this.ordnum = ordnum;
    }
}
