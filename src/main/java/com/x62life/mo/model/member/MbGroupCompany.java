package com.x62life.mo.model.member;

import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;

/*@Alias("mbGroupCompany")*/
//회원 그룹사
public class MbGroupCompany {
    private String grpcd; //그룹사코드
    private String grpid; //그룹사id
    private String grppw; //그룹사pw
    private String grpname; //그룹사명
    private String divcd; //그룹사구분코드
    private String emaildmn; //이메일도메인
    private String emaildmnyn; //이메일인증 여부
    private short bntrate01; //c등급지원금비율
    private BigDecimal bntmax01; //c등급최대지원금
    private short bntrate02; //b등급지원금비율
    private BigDecimal bntmax02; //b등급최대지원금
    private short bntrate03; //a등급지원금비율
    private BigDecimal bntmax03; //a등급최대지원금
    private short bntrate04; //s등급지원금비율
    private BigDecimal bntmax04; //s등급최대지원금
    private String dctyn01; //c등급급여공제 여부
    private String dctyn02; //b등급급여공제 여부
    private String dctyn03; //a등급급여공제 여부
    private String dctyn04; //s등급급여공제 여부
    private String useyn; //사용여부
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private String compnum; //사업자번호
    private String address; //주소
    private String bossname; //대표자
    private String worktype; //업태
    private String workkind; //업종
    private String dirname; //담당자
    private String dirphone; //전화번호
    private String dirfax; //fax번호
    private String diremail; //이메일
    private BigDecimal bnta01; //a등급 01월최대지원금
    private BigDecimal bnta02; //a등급 02월최대지원금
    private BigDecimal bnta03; //a등급 03월최대지원금
    private BigDecimal bnta04; //a등급 04월최대지원금
    private BigDecimal bnta05; //a등급 05월최대지원금
    private BigDecimal bnta06; //a등급 06월최대지원금
    private BigDecimal bnta07; //a등급 07월최대지원금
    private BigDecimal bnta08; //a등급 08월최대지원금
    private BigDecimal bnta09; //a등급 09월최대지원금
    private BigDecimal bnta10; //a등급 10월최대지원금
    private BigDecimal bnta11; //a등급 11월최대지원금
    private BigDecimal bnta12; //a등급 12월최대지원금
    private BigDecimal bntb01; //b등급 01월최대지원금
    private BigDecimal bntb02; //b등급 02월최대지원금
    private BigDecimal bntb03; //b등급 03월최대지원금
    private BigDecimal bntb04; //b등급 04월최대지원금
    private BigDecimal bntb05; //b등급 05월최대지원금
    private BigDecimal bntb06; //b등급 06월최대지원금
    private BigDecimal bntb07; //b등급 07월최대지원금
    private BigDecimal bntb08; //b등급 08월최대지원금
    private BigDecimal bntb09; //b등급 09월최대지원금
    private BigDecimal bntb10; //b등급 10월최대지원금
    private BigDecimal bntb11; //b등급 11월최대지원금
    private BigDecimal bntb12; //b등급 12월최대지원금
    private BigDecimal bntc01; //c등급 01월최대지원금
    private BigDecimal bntc02; //c등급 02월최대지원금
    private BigDecimal bntc03; //c등급 03월최대지원금
    private BigDecimal bntc04; //c등급 04월최대지원금
    private BigDecimal bntc05; //c등급 05월최대지원금
    private BigDecimal bntc06; //c등급 06월최대지원금
    private BigDecimal bntc07; //c등급 07월최대지원금
    private BigDecimal bntc08; //c등급 08월최대지원금
    private BigDecimal bntc09; //c등급 09월최대지원금
    private BigDecimal bntc10; //c등급 10월최대지원금
    private BigDecimal bntc11; //c등급 11월최대지원금
    private BigDecimal bntc12; //c등급 12월최대지원금
    private BigDecimal bnts01; //s등급 01월최대지원금
    private BigDecimal bnts02; //s등급 02월최대지원금
    private BigDecimal bnts03; //s등급 03월최대지원금
    private BigDecimal bnts04; //s등급 04월최대지원금
    private BigDecimal bnts05; //s등급 05월최대지원금
    private BigDecimal bnts06; //s등급 06월최대지원금
    private BigDecimal bnts07; //s등급 07월최대지원금
    private BigDecimal bnts08; //s등급 08월최대지원금
    private BigDecimal bnts09; //s등급 09월최대지원금
    private BigDecimal bnts10; //s등급 10월최대지원금
    private BigDecimal bnts11; //s등급 11월최대지원금
    private BigDecimal bnts12; //s등급 12월최대지원금
    private String salepolicy; //기본할인정책
    private String deductrcp; //급여공제 현금영수증 
    private BigDecimal pntmax01; //c등급 초기sk포인트
    private String pntyn01; //c등급 sk포인트 사용여부
    private BigDecimal pntmax02; //b등급 초기sk포인트
    private String pntyn02; //b등급 sk포인트 사용여부
    private BigDecimal pntmax03; //a등급 초기sk포인트
    private String pntyn03; //a등급 sk포인트 사용여부
    private BigDecimal pntmax04; //s등급 초기sk포인트
    private String pntyn04; //s등급 sk포인트 사용여부
    private String autobntoveryn01; //c등급 자동주문 지원금초과 주문생성여부(급여공제안하고 지원금으로만)
    private String autobntoveryn02; //b등급 자동주문 지원금초과 주문생성여부(급여공제안하고 지원금으로만)
    private String autobntoveryn03; //a등급 자동주문 지원금초과 주문생성여부(급여공제안하고 지원금으로만)
    private String autobntoveryn04; //s등급 자동주문 지원금초과 주문생성여부(급여공제안하고 지원금으로만)
    private int workforce; //직원수
    private String autodctyn01; //c등급 자동주문 급여공제가능 여부
    private String autodctyn02; //b등급 자동주문 급여공제가능 여부
    private String autodctyn03; //a등급 자동주문 급여공제가능 여부
    private String autodctyn04; //s등급 자동주문 급여공제가능 여부
    private String postsettleyn; //후불정산제 소속사여부
    private String notex; //메모
    private String skpointrcp; //sk포인트 현금영수증 
    private String upid; //수정id
    private String bnpyn01; //c등급 복지포인트 사용여부
    private String bnpyn02; //b등급 복지포인트 사용여부
    private String bnpyn03; //a등급 복지포인트 사용여부
    private String bnpyn04; //s등급 복지포인트 사용여부

    public String getGrpcd() {
        return grpcd;
    }

    public void setGrpcd(String grpcd) {
        this.grpcd = grpcd;
    }

    public String getGrpid() {
        return grpid;
    }

    public void setGrpid(String grpid) {
        this.grpid = grpid;
    }

    public String getGrppw() {
        return grppw;
    }

    public void setGrppw(String grppw) {
        this.grppw = grppw;
    }

    public String getGrpname() {
        return grpname;
    }

    public void setGrpname(String grpname) {
        this.grpname = grpname;
    }

    public String getDivcd() {
        return divcd;
    }

    public void setDivcd(String divcd) {
        this.divcd = divcd;
    }

    public String getEmaildmn() {
        return emaildmn;
    }

    public void setEmaildmn(String emaildmn) {
        this.emaildmn = emaildmn;
    }

    public String getEmaildmnyn() {
        return emaildmnyn;
    }

    public void setEmaildmnyn(String emaildmnyn) {
        this.emaildmnyn = emaildmnyn;
    }

    public short getBntrate01() {
        return bntrate01;
    }

    public void setBntrate01(short bntrate01) {
        this.bntrate01 = bntrate01;
    }

    public BigDecimal getBntmax01() {
        return bntmax01;
    }

    public void setBntmax01(BigDecimal bntmax01) {
        this.bntmax01 = bntmax01.setScale(0, RoundingMode.DOWN);
    }

    public short getBntrate02() {
        return bntrate02;
    }

    public void setBntrate02(short bntrate02) {
        this.bntrate02 = bntrate02;
    }

    public BigDecimal getBntmax02() {
        return bntmax02;
    }

    public void setBntmax02(BigDecimal bntmax02) {
        this.bntmax02 = bntmax02.setScale(0, RoundingMode.DOWN);
    }

    public short getBntrate03() {
        return bntrate03;
    }

    public void setBntrate03(short bntrate03) {
        this.bntrate03 = bntrate03;
    }

    public BigDecimal getBntmax03() {
        return bntmax03;
    }

    public void setBntmax03(BigDecimal bntmax03) {
        this.bntmax03 = bntmax03.setScale(0, RoundingMode.DOWN);
    }

    public short getBntrate04() {
        return bntrate04;
    }

    public void setBntrate04(short bntrate04) {
        this.bntrate04 = bntrate04;
    }

    public BigDecimal getBntmax04() {
        return bntmax04;
    }

    public void setBntmax04(BigDecimal bntmax04) {
        this.bntmax04 = bntmax04.setScale(0, RoundingMode.DOWN);
    }

    public String getDctyn01() {
        return dctyn01;
    }

    public void setDctyn01(String dctyn01) {
        this.dctyn01 = dctyn01;
    }

    public String getDctyn02() {
        return dctyn02;
    }

    public void setDctyn02(String dctyn02) {
        this.dctyn02 = dctyn02;
    }

    public String getDctyn03() {
        return dctyn03;
    }

    public void setDctyn03(String dctyn03) {
        this.dctyn03 = dctyn03;
    }

    public String getDctyn04() {
        return dctyn04;
    }

    public void setDctyn04(String dctyn04) {
        this.dctyn04 = dctyn04;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
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

    public String getCompnum() {
        return compnum;
    }

    public void setCompnum(String compnum) {
        this.compnum = compnum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBossname() {
        return bossname;
    }

    public void setBossname(String bossname) {
        this.bossname = bossname;
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }

    public String getWorkkind() {
        return workkind;
    }

    public void setWorkkind(String workkind) {
        this.workkind = workkind;
    }

    public String getDirname() {
        return dirname;
    }

    public void setDirname(String dirname) {
        this.dirname = dirname;
    }

    public String getDirphone() {
        return dirphone;
    }

    public void setDirphone(String dirphone) {
        this.dirphone = dirphone;
    }

    public String getDirfax() {
        return dirfax;
    }

    public void setDirfax(String dirfax) {
        this.dirfax = dirfax;
    }

    public String getDiremail() {
        return diremail;
    }

    public void setDiremail(String diremail) {
        this.diremail = diremail;
    }

    public BigDecimal getBnta01() {
        return bnta01;
    }

    public void setBnta01(BigDecimal bnta01) {
        this.bnta01 = bnta01.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnta02() {
        return bnta02;
    }

    public void setBnta02(BigDecimal bnta02) {
        this.bnta02 = bnta02.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnta03() {
        return bnta03;
    }

    public void setBnta03(BigDecimal bnta03) {
        this.bnta03 = bnta03.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnta04() {
        return bnta04;
    }

    public void setBnta04(BigDecimal bnta04) {
        this.bnta04 = bnta04.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnta05() {
        return bnta05;
    }

    public void setBnta05(BigDecimal bnta05) {
        this.bnta05 = bnta05.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnta06() {
        return bnta06;
    }

    public void setBnta06(BigDecimal bnta06) {
        this.bnta06 = bnta06.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnta07() {
        return bnta07;
    }

    public void setBnta07(BigDecimal bnta07) {
        this.bnta07 = bnta07.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnta08() {
        return bnta08;
    }

    public void setBnta08(BigDecimal bnta08) {
        this.bnta08 = bnta08.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnta09() {
        return bnta09;
    }

    public void setBnta09(BigDecimal bnta09) {
        this.bnta09 = bnta09.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnta10() {
        return bnta10;
    }

    public void setBnta10(BigDecimal bnta10) {
        this.bnta10 = bnta10.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnta11() {
        return bnta11;
    }

    public void setBnta11(BigDecimal bnta11) {
        this.bnta11 = bnta11.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnta12() {
        return bnta12;
    }

    public void setBnta12(BigDecimal bnta12) {
        this.bnta12 = bnta12.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb01() {
        return bntb01;
    }

    public void setBntb01(BigDecimal bntb01) {
        this.bntb01 = bntb01.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb02() {
        return bntb02;
    }

    public void setBntb02(BigDecimal bntb02) {
        this.bntb02 = bntb02.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb03() {
        return bntb03;
    }

    public void setBntb03(BigDecimal bntb03) {
        this.bntb03 = bntb03.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb04() {
        return bntb04;
    }

    public void setBntb04(BigDecimal bntb04) {
        this.bntb04 = bntb04.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb05() {
        return bntb05;
    }

    public void setBntb05(BigDecimal bntb05) {
        this.bntb05 = bntb05.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb06() {
        return bntb06;
    }

    public void setBntb06(BigDecimal bntb06) {
        this.bntb06 = bntb06.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb07() {
        return bntb07;
    }

    public void setBntb07(BigDecimal bntb07) {
        this.bntb07 = bntb07.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb08() {
        return bntb08;
    }

    public void setBntb08(BigDecimal bntb08) {
        this.bntb08 = bntb08.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb09() {
        return bntb09;
    }

    public void setBntb09(BigDecimal bntb09) {
        this.bntb09 = bntb09.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb10() {
        return bntb10;
    }

    public void setBntb10(BigDecimal bntb10) {
        this.bntb10 = bntb10.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb11() {
        return bntb11;
    }

    public void setBntb11(BigDecimal bntb11) {
        this.bntb11 = bntb11.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntb12() {
        return bntb12;
    }

    public void setBntb12(BigDecimal bntb12) {
        this.bntb12 = bntb12.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc01() {
        return bntc01;
    }

    public void setBntc01(BigDecimal bntc01) {
        this.bntc01 = bntc01.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc02() {
        return bntc02;
    }

    public void setBntc02(BigDecimal bntc02) {
        this.bntc02 = bntc02.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc03() {
        return bntc03;
    }

    public void setBntc03(BigDecimal bntc03) {
        this.bntc03 = bntc03.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc04() {
        return bntc04;
    }

    public void setBntc04(BigDecimal bntc04) {
        this.bntc04 = bntc04.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc05() {
        return bntc05;
    }

    public void setBntc05(BigDecimal bntc05) {
        this.bntc05 = bntc05.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc06() {
        return bntc06;
    }

    public void setBntc06(BigDecimal bntc06) {
        this.bntc06 = bntc06.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc07() {
        return bntc07;
    }

    public void setBntc07(BigDecimal bntc07) {
        this.bntc07 = bntc07.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc08() {
        return bntc08;
    }

    public void setBntc08(BigDecimal bntc08) {
        this.bntc08 = bntc08.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc09() {
        return bntc09;
    }

    public void setBntc09(BigDecimal bntc09) {
        this.bntc09 = bntc09.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc10() {
        return bntc10;
    }

    public void setBntc10(BigDecimal bntc10) {
        this.bntc10 = bntc10.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc11() {
        return bntc11;
    }

    public void setBntc11(BigDecimal bntc11) {
        this.bntc11 = bntc11.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBntc12() {
        return bntc12;
    }

    public void setBntc12(BigDecimal bntc12) {
        this.bntc12 = bntc12.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts01() {
        return bnts01;
    }

    public void setBnts01(BigDecimal bnts01) {
        this.bnts01 = bnts01.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts02() {
        return bnts02;
    }

    public void setBnts02(BigDecimal bnts02) {
        this.bnts02 = bnts02.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts03() {
        return bnts03;
    }

    public void setBnts03(BigDecimal bnts03) {
        this.bnts03 = bnts03.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts04() {
        return bnts04;
    }

    public void setBnts04(BigDecimal bnts04) {
        this.bnts04 = bnts04.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts05() {
        return bnts05;
    }

    public void setBnts05(BigDecimal bnts05) {
        this.bnts05 = bnts05.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts06() {
        return bnts06;
    }

    public void setBnts06(BigDecimal bnts06) {
        this.bnts06 = bnts06.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts07() {
        return bnts07;
    }

    public void setBnts07(BigDecimal bnts07) {
        this.bnts07 = bnts07.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts08() {
        return bnts08;
    }

    public void setBnts08(BigDecimal bnts08) {
        this.bnts08 = bnts08.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts09() {
        return bnts09;
    }

    public void setBnts09(BigDecimal bnts09) {
        this.bnts09 = bnts09.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts10() {
        return bnts10;
    }

    public void setBnts10(BigDecimal bnts10) {
        this.bnts10 = bnts10.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts11() {
        return bnts11;
    }

    public void setBnts11(BigDecimal bnts11) {
        this.bnts11 = bnts11.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getBnts12() {
        return bnts12;
    }

    public void setBnts12(BigDecimal bnts12) {
        this.bnts12 = bnts12.setScale(0, RoundingMode.DOWN);
    }

    public String getSalepolicy() {
        return salepolicy;
    }

    public void setSalepolicy(String salepolicy) {
        this.salepolicy = salepolicy;
    }

    public String getDeductrcp() {
        return deductrcp;
    }

    public void setDeductrcp(String deductrcp) {
        this.deductrcp = deductrcp;
    }

    public BigDecimal getPntmax01() {
        return pntmax01;
    }

    public void setPntmax01(BigDecimal pntmax01) {
        this.pntmax01 = pntmax01;
    }

    public String getPntyn01() {
        return pntyn01;
    }

    public void setPntyn01(String pntyn01) {
        this.pntyn01 = pntyn01;
    }

    public BigDecimal getPntmax02() {
        return pntmax02;
    }

    public void setPntmax02(BigDecimal pntmax02) {
        this.pntmax02 = pntmax02;
    }

    public String getPntyn02() {
        return pntyn02;
    }

    public void setPntyn02(String pntyn02) {
        this.pntyn02 = pntyn02;
    }

    public BigDecimal getPntmax03() {
        return pntmax03;
    }

    public void setPntmax03(BigDecimal pntmax03) {
        this.pntmax03 = pntmax03;
    }

    public String getPntyn03() {
        return pntyn03;
    }

    public void setPntyn03(String pntyn03) {
        this.pntyn03 = pntyn03;
    }

    public BigDecimal getPntmax04() {
        return pntmax04;
    }

    public void setPntmax04(BigDecimal pntmax04) {
        this.pntmax04 = pntmax04;
    }

    public String getPntyn04() {
        return pntyn04;
    }

    public void setPntyn04(String pntyn04) {
        this.pntyn04 = pntyn04;
    }

    public String getAutobntoveryn01() {
        return autobntoveryn01;
    }

    public void setAutobntoveryn01(String autobntoveryn01) {
        this.autobntoveryn01 = autobntoveryn01;
    }

    public String getAutobntoveryn02() {
        return autobntoveryn02;
    }

    public void setAutobntoveryn02(String autobntoveryn02) {
        this.autobntoveryn02 = autobntoveryn02;
    }

    public String getAutobntoveryn03() {
        return autobntoveryn03;
    }

    public void setAutobntoveryn03(String autobntoveryn03) {
        this.autobntoveryn03 = autobntoveryn03;
    }

    public String getAutobntoveryn04() {
        return autobntoveryn04;
    }

    public void setAutobntoveryn04(String autobntoveryn04) {
        this.autobntoveryn04 = autobntoveryn04;
    }

    public int getWorkforce() {
        return workforce;
    }

    public void setWorkforce(int workforce) {
        this.workforce = workforce;
    }

    public String getAutodctyn01() {
        return autodctyn01;
    }

    public void setAutodctyn01(String autodctyn01) {
        this.autodctyn01 = autodctyn01;
    }

    public String getAutodctyn02() {
        return autodctyn02;
    }

    public void setAutodctyn02(String autodctyn02) {
        this.autodctyn02 = autodctyn02;
    }

    public String getAutodctyn03() {
        return autodctyn03;
    }

    public void setAutodctyn03(String autodctyn03) {
        this.autodctyn03 = autodctyn03;
    }

    public String getAutodctyn04() {
        return autodctyn04;
    }

    public void setAutodctyn04(String autodctyn04) {
        this.autodctyn04 = autodctyn04;
    }

    public String getPostsettleyn() {
        return postsettleyn;
    }

    public void setPostsettleyn(String postsettleyn) {
        this.postsettleyn = postsettleyn;
    }

    public String getNotex() {
        return notex;
    }

    public void setNotex(String notex) {
        this.notex = notex;
    }

    public String getSkpointrcp() {
        return skpointrcp;
    }

    public void setSkpointrcp(String skpointrcp) {
        this.skpointrcp = skpointrcp;
    }

    public String getUpid() {
        return upid;
    }

    public void setUpid(String upid) {
        this.upid = upid;
    }

    public String getBnpyn01() {
        return bnpyn01;
    }

    public void setBnpyn01(String bnpyn01) {
        this.bnpyn01 = bnpyn01;
    }

    public String getBnpyn02() {
        return bnpyn02;
    }

    public void setBnpyn02(String bnpyn02) {
        this.bnpyn02 = bnpyn02;
    }

    public String getBnpyn03() {
        return bnpyn03;
    }

    public void setBnpyn03(String bnpyn03) {
        this.bnpyn03 = bnpyn03;
    }

    public String getBnpyn04() {
        return bnpyn04;
    }

    public void setBnpyn04(String bnpyn04) {
        this.bnpyn04 = bnpyn04;
    }
}
