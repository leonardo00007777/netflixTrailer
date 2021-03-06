package com.netflix.app.model.member;

import java.sql.Timestamp;

/*@Alias("mbMaster")*/
//회원 정보
public class MbMaster {

	//---------------------------------------------------------
	// MB_MASTER 
	//---------------------------------------------------------
    private String memcd; //회원코드
    private String memid; //회원id
    private String mempw; //회원pw
    private String memname; //회원명
    private String grpcd; //그룹사코드
    private String gradecd; //등급
    private String empnum; //사번
    private String memstcd; //회원상태코드
    private Timestamp upgradedt; //승급일시
    private String residentno1; //생년월일
    private String gender; //성별
    private String email; //이메일
    private String emailyn; //이메일 수신여부
    private String zipcd; //우편번호
    private String addr1; //주소1
    private String addr2; //주소2
    private String telno; //전화
    private String hpno; //휴대전화
    private String retiremsg; //탈퇴사유
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private String smsyn; //sms수신
    private String telyn; //전화수신
    private int reputation; //평점
    private String updid; //수정id
    private byte[] residentno1Enc; //생년월일 enc
    private byte[] mempwEnc; //회원pw enc
    private byte[] emailEnc; //이메일 enc
    private byte[] addr1Enc; //주소1 enc
    private byte[] addr2Enc; //주소2 enc
    private byte[] telnoEnc; //전화 enc
    private byte[] hpnoEnc; //휴대전화 enc
    private String mempwHash; //회원pw hash
    private String contractAgree; //이용약관에 대한 동의
    private String policyAgree; //개인정보 수집 및 이용에 대한 동의
    private String entrustAgree; //개인정보 취급 위탁에 대한 동의
    private String thirdpartyAgree; //개인정보 제3자제공 동의
    private String pcertReqno; //본인인증 요청번호(시간정보+랜덤번호)
    private String pcertDi; //중복가입확인정보(di=64byte), 본인인증주체의 주민번호를 대신한 내부 key
    private String nodeductpay; //회원별 급여공제 결제불가 옵션
    private Timestamp emailynupdt; //이메일수신여부 수정일시
    private Timestamp smsynupdt; //sms수신여부 수정일시
    private String jointype; //가입유형
    private String snsId; //sns id
	private String mempw_hash; //비번 hash
    private Boolean  isLoggedIn; // 로그인 유무
	
	public Boolean getIsLoggedIn() {
		return isLoggedIn;
	}
	
	public void setIsLoggedIn(Boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}
    public String getMempw_hash() {
		return mempw_hash;
	}

	public void setMempw_hash(String mempw_hash) {
		this.mempw_hash = mempw_hash;
	}

	public String getSnsId() {
		return snsId;
	}

	public void setSnsId(String snsId) {
		this.snsId = snsId;
	}

    public String getJointype() {
		return jointype;
	}

	public void setJointype(String jointype) {
		this.jointype = jointype;
	}

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public String getMempw() {
        return mempw;
    }

    public void setMempw(String mempw) {
        this.mempw = mempw;
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        this.memname = memname;
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

    public String getMemstcd() {
        return memstcd;
    }

    public void setMemstcd(String memstcd) {
        this.memstcd = memstcd;
    }

    public Timestamp getUpgradedt() {
        return upgradedt;
    }

    public void setUpgradedt(Timestamp upgradedt) {
        this.upgradedt = upgradedt;
    }

    public String getResidentno1() {
        return residentno1;
    }

    public void setResidentno1(String residentno1) {
        this.residentno1 = residentno1;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailyn() {
        return emailyn;
    }

    public void setEmailyn(String emailyn) {
        this.emailyn = emailyn;
    }

    public String getZipcd() {
        return zipcd;
    }

    public void setZipcd(String zipcd) {
        this.zipcd = zipcd;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
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

    public String getRetiremsg() {
        return retiremsg;
    }

    public void setRetiremsg(String retiremsg) {
        this.retiremsg = retiremsg;
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

    public String getSmsyn() {
        return smsyn;
    }

    public void setSmsyn(String smsyn) {
        this.smsyn = smsyn;
    }

    public String getTelyn() {
        return telyn;
    }

    public void setTelyn(String telyn) {
        this.telyn = telyn;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public String getUpdid() {
        return updid;
    }

    public void setUpdid(String updid) {
        this.updid = updid;
    }

    public byte[] getResidentno1Enc() {
        return residentno1Enc;
    }

    public void setResidentno1Enc(byte[] residentno1Enc) {
        this.residentno1Enc = residentno1Enc;
    }

    public byte[] getMempwEnc() {
        return mempwEnc;
    }

    public void setMempwEnc(byte[] mempwEnc) {
        this.mempwEnc = mempwEnc;
    }

    public byte[] getEmailEnc() {
        return emailEnc;
    }

    public void setEmailEnc(byte[] emailEnc) {
        this.emailEnc = emailEnc;
    }

    public byte[] getAddr1Enc() {
        return addr1Enc;
    }

    public void setAddr1Enc(byte[] addr1Enc) {
        this.addr1Enc = addr1Enc;
    }

    public byte[] getAddr2Enc() {
        return addr2Enc;
    }

    public void setAddr2Enc(byte[] addr2Enc) {
        this.addr2Enc = addr2Enc;
    }

    public byte[] getTelnoEnc() {
        return telnoEnc;
    }

    public void setTelnoEnc(byte[] telnoEnc) {
        this.telnoEnc = telnoEnc;
    }

    public byte[] getHpnoEnc() {
        return hpnoEnc;
    }

    public void setHpnoEnc(byte[] hpnoEnc) {
        this.hpnoEnc = hpnoEnc;
    }

    public String getMempwHash() {
        return mempwHash;
    }

    public void setMempwHash(String mempwHash) {
        this.mempwHash = mempwHash;
    }

    public String getContractAgree() {
        return contractAgree;
    }

    public void setContractAgree(String contractAgree) {
        this.contractAgree = contractAgree;
    }

    public String getPolicyAgree() {
        return policyAgree;
    }

    public void setPolicyAgree(String policyAgree) {
        this.policyAgree = policyAgree;
    }

    public String getEntrustAgree() {
        return entrustAgree;
    }

    public void setEntrustAgree(String entrustAgree) {
        this.entrustAgree = entrustAgree;
    }

    public String getThirdpartyAgree() {
        return thirdpartyAgree;
    }

    public void setThirdpartyAgree(String thirdpartyAgree) {
        this.thirdpartyAgree = thirdpartyAgree;
    }

    public String getPcertReqno() {
        return pcertReqno;
    }

    public void setPcertReqno(String pcertReqno) {
        this.pcertReqno = pcertReqno;
    }

    public String getPcertDi() {
        return pcertDi;
    }

    public void setPcertDi(String pcertDi) {
        this.pcertDi = pcertDi;
    }

    public String getNodeductpay() {
        return nodeductpay;
    }

    public void setNodeductpay(String nodeductpay) {
        this.nodeductpay = nodeductpay;
    }

    public Timestamp getEmailynupdt() {
        return emailynupdt;
    }

    public void setEmailynupdt(Timestamp emailynupdt) {
        this.emailynupdt = emailynupdt;
    }

    public Timestamp getSmsynupdt() {
        return smsynupdt;
    }

    public void setSmsynupdt(Timestamp smsynupdt) {
        this.smsynupdt = smsynupdt;
    }
}
