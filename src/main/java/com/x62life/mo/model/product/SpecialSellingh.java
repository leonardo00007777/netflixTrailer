package com.x62life.mo.model.product;

import java.sql.Timestamp;
//기획전
public class SpecialSellingh {

    private int shidx; //기획전 순번
    private String shtitle; //기획전명
    private String shimg1; //기획전 배너1 이미지명
    private String shimg2; //기획전 배너2 이미지명
    private String shimgm1; //메뉴1 이미지명
    private String shimgm2; //메뉴2 이미지명
    private String shimgm3; //메뉴3 이미지명
    private String shimgm4; //메뉴4 이미지명
    private String shimgm5; //메뉴5 이미지명
    private String shimgm6; //메뉴6 이미지명
    private String shimgm7; //메뉴7 이미지명
    private String shimgm8; //메뉴8 이미지명
    private String shimgm9; //메뉴9 이미지명
    private String shimgm10; //메뉴10 이미지명
    private Timestamp shstartdt; //기획전 시작일시
    private Timestamp shenddt; //기획전 종료일자
    private String shnote; //기획전 설명
    private String shrtype; //기획전 유형
    private String shcat1; //카테고리1
    private String shcat2; //카테고리2
    private Timestamp shindt; //등록일시
    private String shmcd; //등록자
    private String shurlm1; //메뉴1 링크 url
    private String shurlm2; //메뉴2 링크 url
    private String shurlm3; //메뉴3 링크 url
    private String shurlm4; //메뉴4 링크 url
    private String shurlm5; //메뉴5 링크 url
    private String shurlm6; //메뉴6 링크 url
    private String shurlm7; //메뉴7 링크 url
    private String shurlm8; //메뉴8 링크 url
    private String shurlm9; //메뉴9 링크 url
    private String shurlm10; //메뉴10 링크 url
    private String shltoty; //주문유형
    private char isud; //사용자정의 카테고리 
    private String udcat01; //사용자정의 카테고리1
    private String udcat02; //사용자정의 카테고리2
    private String udcat03; //사용자정의 카테고리3
    private String udcat04; //사용자정의 카테고리4
    private String udcat05; //사용자정의 카테고리5
    private String udcat06; //사용자정의 카테고리6
    private String udcat07; //사용자정의 카테고리7
    private String udcat08; //사용자정의 카테고리8
    private String udcat09; //사용자정의 카테고리9
    private String udcat10; //사용자정의 카테고리10
    private String udcatc01; //사용자정의 카테고리1 링크 url
    private String udcatc02; //사용자정의 카테고리2 링크 url
    private String udcatc03; //사용자정의 카테고리1 링크 url
    private String udcatc04; //사용자정의 카테고리2 링크 url
    private String udcatc05; //사용자정의 카테고리1 링크 url
    private String udcatc06; //사용자정의 카테고리2 링크 url
    private String udcatc07; //사용자정의 카테고리1 링크 url
    private String udcatc08; //사용자정의 카테고리2 링크 url
    private String udcatc09; //사용자정의 카테고리1 링크 url
    private String udcatc10; //사용자정의 카테고리2 링크 url
    private char isusecat; //카테고리분류
    private String grpcd; //적용고객
    private String shimg1url; //기획전 배너1 링크 url
    private String shimg2url; //기획전 배너2 링크 url
    private int shrcp1seq; //레시피1블로그 순번
    private int shrcp2seq; //레시피2블로그 순번
    private int shrcp3seq; //레시피3블로그 순번
    private int shrcp4seq; //레시피4블로그 순번
    private char shrcptype; //레시피 표시유형
    private char shhideyn; //목록숨김여부
    private String mhimg1; //모바일용 기획전 배너1 이미지명
    private String mhimg2; //모바일용 기획전 배너2 이미지명
    private String mhimg1url; //모바일용 기획전 배너1 링크 url
    private String mhimg2url; //모바일용 기획전 배너2 링크url
    private short shlevel; //표시레벨
    private int shrelidx; //연관기획전idx
    private int page;

    public int getShidx() {
        return shidx;
    }

    public void setShidx(int shidx) {
        this.shidx = shidx;
    }

    public String getShtitle() {
        return shtitle;
    }

    public void setShtitle(String shtitle) {
        this.shtitle = shtitle;
    }

    public String getShimg1() {
        return shimg1;
    }

    public void setShimg1(String shimg1) {
        this.shimg1 = shimg1;
    }

    public String getShimg2() {
        return shimg2;
    }

    public void setShimg2(String shimg2) {
        this.shimg2 = shimg2;
    }

    public String getShimgm1() {
        return shimgm1;
    }

    public void setShimgm1(String shimgm1) {
        this.shimgm1 = shimgm1;
    }

    public String getShimgm2() {
        return shimgm2;
    }

    public void setShimgm2(String shimgm2) {
        this.shimgm2 = shimgm2;
    }

    public String getShimgm3() {
        return shimgm3;
    }

    public void setShimgm3(String shimgm3) {
        this.shimgm3 = shimgm3;
    }

    public String getShimgm4() {
        return shimgm4;
    }

    public void setShimgm4(String shimgm4) {
        this.shimgm4 = shimgm4;
    }

    public String getShimgm5() {
        return shimgm5;
    }

    public void setShimgm5(String shimgm5) {
        this.shimgm5 = shimgm5;
    }

    public String getShimgm6() {
        return shimgm6;
    }

    public void setShimgm6(String shimgm6) {
        this.shimgm6 = shimgm6;
    }

    public String getShimgm7() {
        return shimgm7;
    }

    public void setShimgm7(String shimgm7) {
        this.shimgm7 = shimgm7;
    }

    public String getShimgm8() {
        return shimgm8;
    }

    public void setShimgm8(String shimgm8) {
        this.shimgm8 = shimgm8;
    }

    public String getShimgm9() {
        return shimgm9;
    }

    public void setShimgm9(String shimgm9) {
        this.shimgm9 = shimgm9;
    }

    public String getShimgm10() {
        return shimgm10;
    }

    public void setShimgm10(String shimgm10) {
        this.shimgm10 = shimgm10;
    }

    public Timestamp getShstartdt() {
        return shstartdt;
    }

    public void setShstartdt(Timestamp shstartdt) {
        this.shstartdt = shstartdt;
    }

    public Timestamp getShenddt() {
        return shenddt;
    }

    public void setShenddt(Timestamp shenddt) {
        this.shenddt = shenddt;
    }

    public String getShnote() {
        return shnote;
    }

    public void setShnote(String shnote) {
        this.shnote = shnote;
    }

    public String getShrtype() {
        return shrtype;
    }

    public void setShrtype(String shrtype) {
        this.shrtype = shrtype;
    }

    public String getShcat1() {
        return shcat1;
    }

    public void setShcat1(String shcat1) {
        this.shcat1 = shcat1;
    }

    public String getShcat2() {
        return shcat2;
    }

    public void setShcat2(String shcat2) {
        this.shcat2 = shcat2;
    }

    public Timestamp getShindt() {
        return shindt;
    }

    public void setShindt(Timestamp shindt) {
        this.shindt = shindt;
    }

    public String getShmcd() {
        return shmcd;
    }

    public void setShmcd(String shmcd) {
        this.shmcd = shmcd;
    }

    public String getShurlm1() {
        return shurlm1;
    }

    public void setShurlm1(String shurlm1) {
        this.shurlm1 = shurlm1;
    }

    public String getShurlm2() {
        return shurlm2;
    }

    public void setShurlm2(String shurlm2) {
        this.shurlm2 = shurlm2;
    }

    public String getShurlm3() {
        return shurlm3;
    }

    public void setShurlm3(String shurlm3) {
        this.shurlm3 = shurlm3;
    }

    public String getShurlm4() {
        return shurlm4;
    }

    public void setShurlm4(String shurlm4) {
        this.shurlm4 = shurlm4;
    }

    public String getShurlm5() {
        return shurlm5;
    }

    public void setShurlm5(String shurlm5) {
        this.shurlm5 = shurlm5;
    }

    public String getShurlm6() {
        return shurlm6;
    }

    public void setShurlm6(String shurlm6) {
        this.shurlm6 = shurlm6;
    }

    public String getShurlm7() {
        return shurlm7;
    }

    public void setShurlm7(String shurlm7) {
        this.shurlm7 = shurlm7;
    }

    public String getShurlm8() {
        return shurlm8;
    }

    public void setShurlm8(String shurlm8) {
        this.shurlm8 = shurlm8;
    }

    public String getShurlm9() {
        return shurlm9;
    }

    public void setShurlm9(String shurlm9) {
        this.shurlm9 = shurlm9;
    }

    public String getShurlm10() {
        return shurlm10;
    }

    public void setShurlm10(String shurlm10) {
        this.shurlm10 = shurlm10;
    }

    public String getShltoty() {
        return shltoty;
    }

    public void setShltoty(String shltoty) {
        this.shltoty = shltoty;
    }

    public char getIsud() {
        return isud;
    }

    public void setIsud(char isud) {
        this.isud = isud;
    }

    public String getUdcat01() {
        return udcat01;
    }

    public void setUdcat01(String udcat01) {
        this.udcat01 = udcat01;
    }

    public String getUdcat02() {
        return udcat02;
    }

    public void setUdcat02(String udcat02) {
        this.udcat02 = udcat02;
    }

    public String getUdcat03() {
        return udcat03;
    }

    public void setUdcat03(String udcat03) {
        this.udcat03 = udcat03;
    }

    public String getUdcat04() {
        return udcat04;
    }

    public void setUdcat04(String udcat04) {
        this.udcat04 = udcat04;
    }

    public String getUdcat05() {
        return udcat05;
    }

    public void setUdcat05(String udcat05) {
        this.udcat05 = udcat05;
    }

    public String getUdcat06() {
        return udcat06;
    }

    public void setUdcat06(String udcat06) {
        this.udcat06 = udcat06;
    }

    public String getUdcat07() {
        return udcat07;
    }

    public void setUdcat07(String udcat07) {
        this.udcat07 = udcat07;
    }

    public String getUdcat08() {
        return udcat08;
    }

    public void setUdcat08(String udcat08) {
        this.udcat08 = udcat08;
    }

    public String getUdcat09() {
        return udcat09;
    }

    public void setUdcat09(String udcat09) {
        this.udcat09 = udcat09;
    }

    public String getUdcat10() {
        return udcat10;
    }

    public void setUdcat10(String udcat10) {
        this.udcat10 = udcat10;
    }

    public String getUdcatc01() {
        return udcatc01;
    }

    public void setUdcatc01(String udcatc01) {
        this.udcatc01 = udcatc01;
    }

    public String getUdcatc02() {
        return udcatc02;
    }

    public void setUdcatc02(String udcatc02) {
        this.udcatc02 = udcatc02;
    }

    public String getUdcatc03() {
        return udcatc03;
    }

    public void setUdcatc03(String udcatc03) {
        this.udcatc03 = udcatc03;
    }

    public String getUdcatc04() {
        return udcatc04;
    }

    public void setUdcatc04(String udcatc04) {
        this.udcatc04 = udcatc04;
    }

    public String getUdcatc05() {
        return udcatc05;
    }

    public void setUdcatc05(String udcatc05) {
        this.udcatc05 = udcatc05;
    }

    public String getUdcatc06() {
        return udcatc06;
    }

    public void setUdcatc06(String udcatc06) {
        this.udcatc06 = udcatc06;
    }

    public String getUdcatc07() {
        return udcatc07;
    }

    public void setUdcatc07(String udcatc07) {
        this.udcatc07 = udcatc07;
    }

    public String getUdcatc08() {
        return udcatc08;
    }

    public void setUdcatc08(String udcatc08) {
        this.udcatc08 = udcatc08;
    }

    public String getUdcatc09() {
        return udcatc09;
    }

    public void setUdcatc09(String udcatc09) {
        this.udcatc09 = udcatc09;
    }

    public String getUdcatc10() {
        return udcatc10;
    }

    public void setUdcatc10(String udcatc10) {
        this.udcatc10 = udcatc10;
    }

    public char getIsusecat() {
        return isusecat;
    }

    public void setIsusecat(char isusecat) {
        this.isusecat = isusecat;
    }

    public String getGrpcd() {
        return grpcd;
    }

    public void setGrpcd(String grpcd) {
        this.grpcd = grpcd;
    }

    public String getShimg1url() {
        return shimg1url;
    }

    public void setShimg1url(String shimg1url) {
        this.shimg1url = shimg1url;
    }

    public String getShimg2url() {
        return shimg2url;
    }

    public void setShimg2url(String shimg2url) {
        this.shimg2url = shimg2url;
    }

    public int getShrcp1seq() {
        return shrcp1seq;
    }

    public void setShrcp1seq(int shrcp1seq) {
        this.shrcp1seq = shrcp1seq;
    }

    public int getShrcp2seq() {
        return shrcp2seq;
    }

    public void setShrcp2seq(int shrcp2seq) {
        this.shrcp2seq = shrcp2seq;
    }

    public int getShrcp3seq() {
        return shrcp3seq;
    }

    public void setShrcp3seq(int shrcp3seq) {
        this.shrcp3seq = shrcp3seq;
    }

    public int getShrcp4seq() {
        return shrcp4seq;
    }

    public void setShrcp4seq(int shrcp4seq) {
        this.shrcp4seq = shrcp4seq;
    }

    public char getShrcptype() {
        return shrcptype;
    }

    public void setShrcptype(char shrcptype) {
        this.shrcptype = shrcptype;
    }

    public char getShhideyn() {
        return shhideyn;
    }

    public void setShhideyn(char shhideyn) {
        this.shhideyn = shhideyn;
    }

    public String getMhimg1() {
        return mhimg1;
    }

    public void setMhimg1(String mhimg1) {
        this.mhimg1 = mhimg1;
    }

    public String getMhimg2() {
        return mhimg2;
    }

    public void setMhimg2(String mhimg2) {
        this.mhimg2 = mhimg2;
    }

    public String getMhimg1url() {
        return mhimg1url;
    }

    public void setMhimg1url(String mhimg1url) {
        this.mhimg1url = mhimg1url;
    }

    public String getMhimg2url() {
        return mhimg2url;
    }

    public void setMhimg2url(String mhimg2url) {
        this.mhimg2url = mhimg2url;
    }

    public short getShlevel() {
        return shlevel;
    }

    public void setShlevel(short shlevel) {
        this.shlevel = shlevel;
    }

    public int getShrelidx() {
        return shrelidx;
    }

    public void setShrelidx(int shrelidx) {
        this.shrelidx = shrelidx;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
