package com.x62life.mo.model.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.dom4j.tree.AbstractEntity;

@org.apache.ibatis.type.Alias("customer")
public class Customer extends AbstractEntity implements Serializable {
/*@org.apache.ibatis.type.Alias("customer")
public class Customer extends BaseCommonEntity implements CurrentUser {*/
    private static final long serialVersionUID = 2628130007155303469L;

    private long customerId = Long.MIN_VALUE;
    
    private String mbrNo;
    
    private String ssoMbrNo;
    
    private String mbrId;
    
    private String mbrNm;

    private String maskMbrNm;   // 마스킹 처리한 고객명

    private String passwd;
    
    //법정생일일자
    private String leglBdayDt;
    
    //생일일자
    private String bdayDt;
    
    private String genSctCd;
    
    //실명확인여부
    private String nmCnfmYn;
    
    //성인인증여부
    private String authenticYn;
    
    //성인인증일
    private String authenticDt;
    
    //14세미만여부
    private String y14LtYn;
    
    private String ciLnkVal;
    
    private String cellSctNo;
    
    private String cellTxnoNo;
    
    private String cellEndNo;
    
    private String hpNo;
    
    private String emailAddr;
    
    //통합멤버십탈퇴일자
    private String secssReqDy;

    //패스워드 최종 수정일
    private String pwdUpdDy;
    
    //10:정상 20:임시or초기비밀번호
    private String pwdTyp;
    
    //회원상태코드[MEM005]
    private String mbrStsCd;
    
    //회원등급코드[MEM024]
    private String mbrGradeCd;
    
    private String mbrGradeCdNm;
    
    private String staffYn;
    
    //회원구분코드[MEM004]
    private String mbrSctCd;
    
    private String emailRcvYn;
    
    private String smsRcvAgrYn;
    
    //앱푸시수신동의여부
    private String pushMsgRcvYn;
    
    //앱푸시수신동의변경일시
    private String pushMsgRcvDtime;
    
    private String addInfoAgrYn;
    
    //매장공지알람수신여부
    private String strNtcRcvAgrYn;
    
    //매장공지알람 수신일자
    private String strNtcRcvAgrDtime;
    
    //스마트영수증동의여부
    private String smartRecptAgrYn;
    
    //모바일영수증동의여부?
    private String mblRecptAgrYn;
    
    //모바일이벤트 수신동의여부
    private String mblEventAgrYn;
    
    //모바일기기순번
    private String mblMachSeq;
    
    private String tmRcvYn;
    
    //최초로그인일시
    private String frstLoginDtime;
    
    //최종로그인일시
    private String lastLoginDtime;
    
    //최종로그인IP
    private String lastLoginIpAddr;
    
    private String langCd;
    
    //약관동의일자
    private String agrDy;
    
    private String agrYn;
    
    //신규약관동의여부
    private String newAgrmAgrYn;
    
    //신규약관동의일자
    private String newAgrmAgrDtime;
    
    //서비스동의유형코드[MBL003]10, 20, 필수 30, 마케팅 선택?
    private String svcAgrTpCd;
    
    private String autoLoginAgrYn;
    
    private String saveLoginIdYn;

    private String sessionId;
    
    private String failMsg;
    
    private String password;
    
    private int passwdErrCnt;
    
    //스마트영수증여부
    private String smartYn;
    
    //탈퇴여부
    private String scsnYn;

    //통합 업체코드
    private String afcoCd;
    //통합 사원번호
    private String empNo;
    
    private boolean isApp = false;
    
    private boolean isMobile = false;
    
    private String apiType;
    
    private String apiProperty;
    
    private String loginId;
    
    //접속기기정보 로그인 매체 코드와 동일. 10: PC 11:mo Web 12: moApp
    private String deviceType;
    
    //디바이스아이디
    private String deviceId;
    
    //로그아웃버튼을 클릭하여 로그아웃여부
    private boolean logoutChk = false;
    
    private boolean loggedIn = false;
    
    private String remoteAddr;
    
    private long lastAccessTime;
    
    //바이오 인증 여부
    private String biometricYn;

    private List<Group> customerGroupNo = new ArrayList<Group>();
    
    private String mbrNickNm;
    
    private String choTermAgrYn;

    //간편로그인 타입
    private String easyLoginType;
    
    // [3465768] 휴면복구 요청 시 수신하는 정보
    Map<String, Object> cjoneImRcvInfoMap = null;
    
    // [3465768] 최신 회원정보
    //CjoneMbrInfoRcv cjoneMbrMstrInfoRcv = null;
    
    // [3465768] 최신 약관동의정보
    //List<CjoneMbrAgrInfoRcv> cjoneMbrAgrInfoRcvList = null;
    
    // [3465768] 휴면회원정보
    //private SleepInfo sleepInfo = null;

    public Customer() {
        //Default Constructor
    }
    public List<Group> getCustomerGroupNo() {
        return customerGroupNo;
    }

    public void setCustomerGroupNo(List<Group> customerGroupNo) {
        this.customerGroupNo = customerGroupNo;
    }
    
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    public String getMbrNo() {
        return mbrNo;
    }

    public void setMbrNo(String mbrNo) {
        this.mbrNo = mbrNo;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId;
        this.loginId=mbrId;
    }

    @Override
    public String getName() {
        return mbrNm;
    }

    public void setMbrNm(String mbrNm) {
        this.mbrNm = mbrNm;
    }

    public String getMaskMbrNm() {
        return maskMbrNm;
    }

    public void setMaskMbrNm(String maskMbrNm) {
        this.maskMbrNm = maskMbrNm;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getLeglBdayDt() {
        return leglBdayDt;
    }        

    public void setLeglBdayDt(String leglBdayDt) {
        this.leglBdayDt = leglBdayDt;
    }
    
    public String getBdayDt() {
        return bdayDt;
    }
    
    public void setBdayDt(String bdayDt) {
        this.bdayDt = bdayDt;
    }

    public String getGenSctCd() {
        return genSctCd;
    }
    public void setGenSctCd(String genSctCd) {
        this.genSctCd = genSctCd;
    }
    public String getNmCnfmYn() {
        return nmCnfmYn;
    }

    public void setNmCnfmYn(String nmCnfmYn) {
        this.nmCnfmYn = nmCnfmYn;
    }

    public String getAuthenticYn() {
        return authenticYn;
    }

    public void setAuthenticYn(String authenticYn) {
        this.authenticYn = authenticYn;
    }

    public String getAuthenticDt() {
        return authenticDt;
    }

    public void setAuthenticDt(String authenticDt) {
        this.authenticDt = authenticDt;
    }

    public String getY14LtYn() {
        return y14LtYn;
    }

    public void setY14LtYn(String y14LtYn) {
        this.y14LtYn = y14LtYn;
    }

    public String getCiLnkVal() {
        return ciLnkVal;
    }
    public void setCiLnkVal(String ciLnkVal) {
        this.ciLnkVal = ciLnkVal;
    }
    public String getCellSctNo() {
        return cellSctNo;
    }
    
    public void setCellSctNo(String cellSctNo) {
        this.cellSctNo = cellSctNo;
    }
    
    public String getCellTxnoNo() {
        return cellTxnoNo;
    }
    
    public void setCellTxnoNo(String cellTxnoNo) {
        this.cellTxnoNo = cellTxnoNo;
    }
    
    public String getCellEndNo() {
        return cellEndNo;
    }
    
    public void setCellEndNo(String cellEndNo) {
        this.cellEndNo = cellEndNo;
    }
    
    public String getHpNo() {
        return hpNo;
    }
    
    public void setHpNo(String hpNo) {
        this.hpNo = hpNo;
    }
    
    public String getEmailAddr() {
        return emailAddr;
    }
    
    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }
    
    public String getSecssReqDy() {
        return secssReqDy;
    }

    public void setSecssReqDy(String secssReqDy) {
        this.secssReqDy = secssReqDy;
    }

    public String getPwdUpdDy() {
        return pwdUpdDy;
    }

    public void setPwdUpdDy(String pwdUpdDy) {
        this.pwdUpdDy = pwdUpdDy;
    }

    public String getPwdTyp() {
        return pwdTyp;
    }
    
    public void setPwdTyp(String pwdTyp) {
        this.pwdTyp = pwdTyp;
    }
    
    public String getMbrStsCd() {
        return mbrStsCd;
    }

    public void setMbrStsCd(String mbrStsCd) {
        this.mbrStsCd = mbrStsCd;
    }

    public String getMbrGradeCd() {
        return mbrGradeCd;
    }

    public void setMbrGradeCd(String mbrGradeCd) {
        this.mbrGradeCd = mbrGradeCd;
    }

    public String getMbrGradeCdNm() {
        return mbrGradeCdNm;
    }

    public void setMbrGradeCdNm(String mbrGradeCdNm) {
        this.mbrGradeCdNm = mbrGradeCdNm;
    }

    public String getStaffYn() {
        return staffYn;
    }

    public void setStaffYn(String staffYn) {
        this.staffYn = staffYn;
    }

    public String getMbrSctCd() {
        return mbrSctCd;
    }

    public void setMbrSctCd(String mbrSctCd) {
        this.mbrSctCd = mbrSctCd;
    }

    public String getStrNtcRcvAgrYn() {
        return strNtcRcvAgrYn;
    }
    
    public void setStrNtcRcvAgrYn(String strNtcRcvAgrYn) {
        this.strNtcRcvAgrYn = strNtcRcvAgrYn;
    }
    
    public String getStrNtcRcvAgrDtime() {
        return strNtcRcvAgrDtime;
    }
    
    public void setStrNtcRcvAgrDtime(String strNtcRcvAgrDtime) {
        this.strNtcRcvAgrDtime = strNtcRcvAgrDtime;
    }
    
    public String getEmailRcvYn() {
        return emailRcvYn;
    }

    public void setEmailRcvYn(String emailRcvYn) {
        this.emailRcvYn = emailRcvYn;
    }

    public String getSmsRcvAgrYn() {
        return smsRcvAgrYn;
    }

    public void setSmsRcvAgrYn(String smsRcvAgrYn) {
        this.smsRcvAgrYn = smsRcvAgrYn;
    }

    public String getPushMsgRcvYn() {
        return pushMsgRcvYn;
    }

    public void setPushMsgRcvYn(String pushMsgRcvYn) {
        this.pushMsgRcvYn = pushMsgRcvYn;
    }
    
    public String getPushMsgRcvDtime() {
        return pushMsgRcvDtime;
    }

    public void setPushMsgRcvDtime(String pushMsgRcvDtime) {
        this.pushMsgRcvDtime = pushMsgRcvDtime;
    }    

    public String getAddInfoAgrYn() {
        return addInfoAgrYn;
    }
    public void setAddInfoAgrYn(String addInfoAgrYn) {
        this.addInfoAgrYn = addInfoAgrYn;
    }
    public String getSmartRecptAgrYn() {
        return smartRecptAgrYn;
    }

    public void setSmartRecptAgrYn(String smartRecptAgrYn) {
        this.smartRecptAgrYn = smartRecptAgrYn;
    }

    public String getMblRecptAgrYn() {
        return mblRecptAgrYn;
    }
    public void setMblRecptAgrYn(String mblRecptAgrYn) {
        this.mblRecptAgrYn = mblRecptAgrYn;
    }

    public String getMblEventAgrYn() {
        return mblEventAgrYn;
    }

    public void setMblEventAgrYn(String mblEventAgrYn) {
        this.mblEventAgrYn = mblEventAgrYn;
    }
    public String getMblMachSeq() {
        return mblMachSeq;
    }
    public void setMblMachSeq(String mblMachSeq) {
        this.mblMachSeq = mblMachSeq;
    }
    public String getTmRcvYn() {
        return tmRcvYn;
    }
    
    public void setTmRcvYn(String tmRcvYn) {
        this.tmRcvYn = tmRcvYn;
    }
    
    public String getFrstLoginDtime() {
        return frstLoginDtime;
    }

    public void setFrstLoginDtime(String frstLoginDtime) {
        this.frstLoginDtime = frstLoginDtime;
    }

    public String getLastLoginDtime() {
        return lastLoginDtime;
    }

    public void setLastLoginDtime(String lastLoginDtime) {
        this.lastLoginDtime = lastLoginDtime;
    }

    public String getLastLoginIpAddr() {
        return lastLoginIpAddr;
    }

    public void setLastLoginIpAddr(String lastLoginIpAddr) {
        this.lastLoginIpAddr = lastLoginIpAddr;
    }
    
    public String getLangCd() {
        return langCd;
    }

    public void setLangCd(String langCd) {
        this.langCd = langCd;
    }

    public String getAgrDy() {
        return agrDy;
    }

    public void setAgrDy(String agrDy) {
        this.agrDy = agrDy;
    }

    public String getAgrYn() {
        return agrYn;
    }

    public void setAgrYn(String agrYn) {
        this.agrYn = agrYn;
    }

    public String getNewAgrmAgrYn() {
        return newAgrmAgrYn;
    }

    public void setNewAgrmAgrYn(String newAgrmAgrYn) {
        this.newAgrmAgrYn = newAgrmAgrYn;
    }

    public String getNewAgrmAgrDtime() {
        return newAgrmAgrDtime;
    }

    public void setNewAgrmAgrDtime(String newAgrmAgrDtime) {
        this.newAgrmAgrDtime = newAgrmAgrDtime;
    }

    public String getSvcAgrTpCd() {
        return svcAgrTpCd;
    }

    public void setSvcAgrTpCd(String svcAgrTpCd) {
        this.svcAgrTpCd = svcAgrTpCd;
    }

    public String getAutoLoginAgrYn() {
        return autoLoginAgrYn;
    }

    public void setAutoLoginAgrYn(String autoLoginAgrYn) {
        this.autoLoginAgrYn = autoLoginAgrYn;
    }

    public String getSaveLoginIdYn() {
        return saveLoginIdYn;
    }

    public void setSaveLoginIdYn(String saveLoginIdYn) {
        this.saveLoginIdYn = saveLoginIdYn;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getFailMsg() {
        return failMsg;
    }

    public void setFailMsg(String failMsg) {
        this.failMsg = failMsg;
    }

    public String getMbrNm() {
        return mbrNm;
    }

    public String getScsnYn() {
        return scsnYn;
    }

    public void setScsnYn(String scsnYn) {
        this.scsnYn = scsnYn;
    }
    
    public String getAfcoCd() {
        return afcoCd;
    }

    public void setAfcoCd(String afcoCd) {
        this.afcoCd = afcoCd;
    }
    
    public String getEmpNo() {
        return empNo;
    }
    
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
    
    public boolean isApp() {
        return isApp;
    }
    
    public void setApp(boolean isApp) {
        this.isApp = isApp;
    }
    public boolean isMobile() {
        return isMobile;
    }
    public void setMobile(boolean isMobile) {
        this.isMobile = isMobile;
    }
//    @UnescapeHtml
//    public String getPassword() {
//        return password;
//    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getPasswdErrCnt() {
        return passwdErrCnt;
    }
    
    public void setPasswdErrCnt(int passwdErrCnt) {
        this.passwdErrCnt = passwdErrCnt;
    }

    public String getSmartYn() {
        return smartYn;
    }

    public void setSmartYn(String smartYn) {
        this.smartYn = smartYn;
    }
//    @Override
//    public String getLoginId() {
//        return loginId;
//    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public boolean isLogoutChk() {
        return logoutChk;
    }

    public void setLogoutChk(boolean logoutChk) {
        this.logoutChk = logoutChk;
    }
//    @Override
//    public long getSeq() {
//        return customerId;
//    }
//    
//    @Override
//    public boolean isLoggedIn() {
//        return loggedIn;
//    }
//    
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public long getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public String getSsoMbrNo() {
        return ssoMbrNo;
    }

    public void setSsoMbrNo(String ssoMbrNo) {
        this.ssoMbrNo = ssoMbrNo;
    }
    
    public String getApiType() {
        return apiType;
    }
    
    public void setApiType(String apiType) {
        this.apiType = apiType;
    }
    
    public String getApiProperty() {
        return apiProperty;
    }
    public void setApiProperty(String apiProperty) {
        this.apiProperty = apiProperty;
    }
    
    public String getBiometricYn() {
        return biometricYn;
    }
    
    public void setBiometricYn(String biometricYn) {
        this.biometricYn = biometricYn;
	}

	public String getMbrNickNm() {
		return mbrNickNm;
	}

	public void setMbrNickNm(String mbrNickNm) {
		this.mbrNickNm = mbrNickNm;
	}

	public String getChoTermAgrYn() {
		return choTermAgrYn;
	}

	public void setChoTermAgrYn(String choTermAgrYn) {
		this.choTermAgrYn = choTermAgrYn;
	}

	public void copyFromPersistCustomer(Customer customer){
        this.mbrNo = customer.mbrNo;
        this.mbrId = customer.mbrId;
        this.mbrNm = customer.mbrNm;
        this.ssoMbrNo = customer.ssoMbrNo;
        this.customerId = customer.customerId;
        this.loginId = customer.loginId;
        this.password = customer.password;
        this.passwdErrCnt = customer.passwdErrCnt;
        this.pwdTyp = customer.pwdTyp;
        this.autoLoginAgrYn = customer.autoLoginAgrYn;
        this.saveLoginIdYn = customer.saveLoginIdYn;
        this.leglBdayDt = customer.leglBdayDt;
        this.genSctCd = customer.genSctCd;
        this.nmCnfmYn = customer.nmCnfmYn;
        this.authenticYn = customer.authenticYn;
        this.authenticDt = customer.authenticDt;
        this.y14LtYn = customer.y14LtYn;
        this.ciLnkVal = customer.ciLnkVal;
        this.cellSctNo = customer.cellSctNo;
        this.cellTxnoNo = customer.cellTxnoNo;
        this.cellEndNo = customer.cellEndNo;
        this.hpNo = customer.hpNo;
        this.emailAddr = customer.emailAddr;
        this.secssReqDy = customer.secssReqDy;
        this.pwdUpdDy = customer.pwdUpdDy;
        this.mbrStsCd = customer.mbrStsCd;
        this.mbrGradeCd = customer.mbrGradeCd;
        this.mbrGradeCdNm = customer.mbrGradeCdNm;
        this.staffYn = customer.staffYn;
        this.mbrSctCd = customer.mbrSctCd;
        this.emailRcvYn = customer.emailRcvYn;
        this.smsRcvAgrYn = customer.smsRcvAgrYn;
        this.pushMsgRcvYn = customer.pushMsgRcvYn;
        this.addInfoAgrYn = customer.addInfoAgrYn;
        this.smartRecptAgrYn = customer.smartRecptAgrYn;
        this.scsnYn = customer.scsnYn;
        this.afcoCd = customer.afcoCd;
        this.empNo = customer.empNo;
        this.strNtcRcvAgrYn = customer.strNtcRcvAgrYn;
        this.strNtcRcvAgrDtime = customer.strNtcRcvAgrDtime;
        this.mblRecptAgrYn = customer.mblRecptAgrYn;
        this.mblEventAgrYn = customer.mblEventAgrYn;
        this.frstLoginDtime = customer.frstLoginDtime;
        this.lastLoginDtime = customer.lastLoginDtime;
        this.lastLoginIpAddr= customer.lastLoginIpAddr;
        this.langCd = customer.langCd;
        this.agrDy = customer.agrDy;
        this.agrYn = customer.agrYn;
        this.isApp = customer.isApp;
        this.isMobile = customer.isMobile;
        this.sessionId = customer.sessionId;
        this.deviceType = customer.deviceType;
        this.deviceId = customer.deviceId;
        this.mblMachSeq = customer.mblMachSeq;
        this.biometricYn = customer.biometricYn;
        this.mbrNickNm = customer.mbrNickNm;
        this.pushMsgRcvDtime = customer.pushMsgRcvDtime;
    }
	public String getEasyLoginType() {
		return easyLoginType;
	}
	public void setEasyLoginType(String easyLoginType) {
		this.easyLoginType = easyLoginType;
	}
//    public SleepInfo getSleepInfo() {
//        return sleepInfo;
//    }
//    public void setSleepInfo(SleepInfo sleepInfo) {
//        this.sleepInfo = sleepInfo;
//    }
    public Map<String, Object> getCjoneImRcvInfoMap() {
        return cjoneImRcvInfoMap;
    }
    public void setCjoneImRcvInfoMap(Map<String, Object> cjoneImRcvInfoMap) {
        this.cjoneImRcvInfoMap = cjoneImRcvInfoMap;
    }
//    public CjoneMbrInfoRcv getCjoneMbrMstrInfoRcv() {
//        return cjoneMbrMstrInfoRcv;
//    }
//    public void setCjoneMbrMstrInfoRcv(CjoneMbrInfoRcv cjoneMbrMstrInfoRcv) {
//        this.cjoneMbrMstrInfoRcv = cjoneMbrMstrInfoRcv;
//    }
//    public List<CjoneMbrAgrInfoRcv> getCjoneMbrAgrInfoRcvList() {
//        return cjoneMbrAgrInfoRcvList;
//    }
//    public void setCjoneMbrAgrInfoRcvList(List<CjoneMbrAgrInfoRcv> cjoneMbrAgrInfoRcvList) {
//        this.cjoneMbrAgrInfoRcvList = cjoneMbrAgrInfoRcvList;
//    }
    
}