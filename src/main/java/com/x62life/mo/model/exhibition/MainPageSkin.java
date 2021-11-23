package com.x62life.mo.model.exhibition;

import java.sql.Timestamp;
//메인페이지 컨텐츠
public class MainPageSkin {

    private String csspath;
    private String title; 
    private String logopath; //하단고정배너1(좌) 이미지경로
    private String logotarget; //하단고정배너1(좌)  링크연결방법
    private String logourl; //하단고정배너1(좌) 링크url
    private String logotitle; //하단고정배너유형
    private String tbnpath01; //하단고정배너2(우) 이미지경로
    private String tbntarget01; //하단고정배너2(우) 링크연결방법
    private String tbnurl01; //하단고정배너2(우) 링크url
    private String tbntitle01; 
    private String tbnpath02; //모바일 고정배너3 이미지경로
    private String tbntarget02; //모바일 고정배너3 연결방법
    private String tbnurl02; //모바일 고정배너3 링크url
    private String tbntitle02; 
    private String tbnpath03; //모바일 고정배너4 이미지경로
    private String tbntarget03; //모바일 고정배너4 연결방법
    private String tbnurl03; //모바일 고정배너4 링크url
    private String tbntitle03; 
    private String lbnpath01; //자연이랑new1 이미지경로
    private String lbntarget01; //자연이랑new1 링크연결방법
    private String lbnurl01; //자연이랑new1 링크url
    private String lbntitle01; //자연이랑new1 설명
    private String lbnpath02; //자연이랑new2 이미지경로
    private String lbntarget02; //자연이랑new2 링크연결방법
    private String lbnurl02; //자연이랑new2 링크url
    private String lbntitle02; //자연이랑new2 설명
    private String lbnpath03; //자연이랑new3 이미지경로
    private String lbntarget03; //자연이랑new3 링크연결방법
    private String lbnurl03; //자연이랑new3 링크url
    private String lbntitle03; //자연이랑new3 설명
    private String lbnpath04; //상단고정배너1(우상) 이미지경로
    private String lbntarget04; //상단고정배너1(우상) 링크연결방법
    private String lbnurl04; //상단고정배너1(우상) 링크url
    private String lbntitle04; 
    private String lbnpath05; //상단고정배너2(우하) 이미지경로
    private String lbntarget05; //상단고정배너2(우하)  링크연결방법
    private String lbnurl05; //상단고정배너2(우하)  링크url
    private String lbntitle05; 
    private String cbnpath01; //모바일 자연이랑new1 이미지경로
    private String cbntarget01; //모바일 자연이랑new1 링크연결방법
    private String cbnurl01; //모바일 자연이랑new1 링크url
    private String cbntitle01; 
    private String cbnpath02; //모바일 자연이랑new2 이미지경로
    private String cbntarget02; //모바일 자연이랑new2 링크연결방법
    private String cbnurl02; //모바일 자연이랑new2 링크url
    private String cbntitle02; 
    private String cbnpath03; //모바일 자연이랑new2 이미지경로
    private String cbntarget03; //모바일 자연이랑new3 링크연결방법
    private String cbnurl03; //모바일 자연이랑new3 링크url
    private String cbntitle03; 
    private String cbnpath04; //모바일 고정배너1 이미지경로
    private String cbntarget04; //모바일 고정배너1 링크연결방법
    private String cbnurl04; //모바일 고정배너1 링크url
    private String cbntitle04; 
    private String cbnpath05; //모바일 고정배너2 이미지경로
    private String cbntarget05; //모바일 고정배너2 연결방법
    private String cbnurl05; //모바일 고정배너2 링크url
    private String cbntitle05; //
    private String rbnpath01; //모바일 고정배너3 이미지경로
    private String rbntarget01; //모바일 고정배너3 연결방법
    private String rbnurl01; //모바일 고정배너3 링크url
    private String rbntitle01; 
    private String rbnpath02; 
    private String rbntarget02; 
    private String rbnurl02; 
    private String rbntitle02; 
    private String rbnpath03; 
    private String rbntarget03; 
    private String rbnurl03; 
    private String rbntitle03; 
    private String rbnpath04; 
    private String rbntarget04;
    private String rbnurl04; 
    private String rbntitle04;
    private String rbnpath05; 
    private String rbntarget05;
    private String rbnurl05; 
    private String rbntitle05;
    private String rbnpath06;
    private String rbntarget06;
    private String rbnurl06; 
    private String rbntitle06;
    private String rbnpath07;
    private String rbntarget07;
    private String rbnurl07; 
    private String rbntitle07;
    private String rbnpath08;
    private String rbntarget08;
    private String rbnurl08; 
    private String rbntitle08;
    private String rbnpath09; 
    private String rbntarget09;
    private String rbnurl09; 
    private String rbntitle09;
    private String rbnpath10;
    private String rbntarget10;
    private String rbnurl10; 
    private String rbntitle10;
    private String reservet01; //자연이랑new1 타이틀
    private String reserveb01; //자연이랑new1 본문
    private String reservet02; //자연이랑new2 타이틀
    private String reserveb02; //자연이랑new2 본문
    private String reservet03; //자연이랑new3 타이틀
    private String reserveb03; //자연이랑new3 본문
    private String rbnpath11; 
    private String rbntarget11;
    private String rbnurl11;
    private String rbntitle11;
    private String dLogopath; 
    private String dLogotitle;
    private String mLogopath; 
    private String mLogotitle;
    private Timestamp logopostdt;

    public String getCsspath() {
        return csspath;
    }

    public void setCsspath(String csspath) {
        this.csspath = csspath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogopath() {
        return logopath;
    }

    public void setLogopath(String logopath) {
        this.logopath = logopath;
    }

    public String getLogotarget() {
        return logotarget;
    }

    public void setLogotarget(String logotarget) {
        this.logotarget = logotarget;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    public String getLogotitle() {
        return logotitle;
    }

    public void setLogotitle(String logotitle) {
        this.logotitle = logotitle;
    }

    public String getTbnpath01() {
        return tbnpath01;
    }

    public void setTbnpath01(String tbnpath01) {
        this.tbnpath01 = tbnpath01;
    }

    public String getTbntarget01() {
        return tbntarget01;
    }

    public void setTbntarget01(String tbntarget01) {
        this.tbntarget01 = tbntarget01;
    }

    public String getTbnurl01() {
        return tbnurl01;
    }

    public void setTbnurl01(String tbnurl01) {
        this.tbnurl01 = tbnurl01;
    }

    public String getTbntitle01() {
        return tbntitle01;
    }

    public void setTbntitle01(String tbntitle01) {
        this.tbntitle01 = tbntitle01;
    }

    public String getTbnpath02() {
        return tbnpath02;
    }

    public void setTbnpath02(String tbnpath02) {
        this.tbnpath02 = tbnpath02;
    }

    public String getTbntarget02() {
        return tbntarget02;
    }

    public void setTbntarget02(String tbntarget02) {
        this.tbntarget02 = tbntarget02;
    }

    public String getTbnurl02() {
        return tbnurl02;
    }

    public void setTbnurl02(String tbnurl02) {
        this.tbnurl02 = tbnurl02;
    }

    public String getTbntitle02() {
        return tbntitle02;
    }

    public void setTbntitle02(String tbntitle02) {
        this.tbntitle02 = tbntitle02;
    }

    public String getTbnpath03() {
        return tbnpath03;
    }

    public void setTbnpath03(String tbnpath03) {
        this.tbnpath03 = tbnpath03;
    }

    public String getTbntarget03() {
        return tbntarget03;
    }

    public void setTbntarget03(String tbntarget03) {
        this.tbntarget03 = tbntarget03;
    }

    public String getTbnurl03() {
        return tbnurl03;
    }

    public void setTbnurl03(String tbnurl03) {
        this.tbnurl03 = tbnurl03;
    }

    public String getTbntitle03() {
        return tbntitle03;
    }

    public void setTbntitle03(String tbntitle03) {
        this.tbntitle03 = tbntitle03;
    }

    public String getLbnpath01() {
        return lbnpath01;
    }

    public void setLbnpath01(String lbnpath01) {
        this.lbnpath01 = lbnpath01;
    }

    public String getLbntarget01() {
        return lbntarget01;
    }

    public void setLbntarget01(String lbntarget01) {
        this.lbntarget01 = lbntarget01;
    }

    public String getLbnurl01() {
        return lbnurl01;
    }

    public void setLbnurl01(String lbnurl01) {
        this.lbnurl01 = lbnurl01;
    }

    public String getLbntitle01() {
        return lbntitle01;
    }

    public void setLbntitle01(String lbntitle01) {
        this.lbntitle01 = lbntitle01;
    }

    public String getLbnpath02() {
        return lbnpath02;
    }

    public void setLbnpath02(String lbnpath02) {
        this.lbnpath02 = lbnpath02;
    }

    public String getLbntarget02() {
        return lbntarget02;
    }

    public void setLbntarget02(String lbntarget02) {
        this.lbntarget02 = lbntarget02;
    }

    public String getLbnurl02() {
        return lbnurl02;
    }

    public void setLbnurl02(String lbnurl02) {
        this.lbnurl02 = lbnurl02;
    }

    public String getLbntitle02() {
        return lbntitle02;
    }

    public void setLbntitle02(String lbntitle02) {
        this.lbntitle02 = lbntitle02;
    }

    public String getLbnpath03() {
        return lbnpath03;
    }

    public void setLbnpath03(String lbnpath03) {
        this.lbnpath03 = lbnpath03;
    }

    public String getLbntarget03() {
        return lbntarget03;
    }

    public void setLbntarget03(String lbntarget03) {
        this.lbntarget03 = lbntarget03;
    }

    public String getLbnurl03() {
        return lbnurl03;
    }

    public void setLbnurl03(String lbnurl03) {
        this.lbnurl03 = lbnurl03;
    }

    public String getLbntitle03() {
        return lbntitle03;
    }

    public void setLbntitle03(String lbntitle03) {
        this.lbntitle03 = lbntitle03;
    }

    public String getLbnpath04() {
        return lbnpath04;
    }

    public void setLbnpath04(String lbnpath04) {
        this.lbnpath04 = lbnpath04;
    }

    public String getLbntarget04() {
        return lbntarget04;
    }

    public void setLbntarget04(String lbntarget04) {
        this.lbntarget04 = lbntarget04;
    }

    public String getLbnurl04() {
        return lbnurl04;
    }

    public void setLbnurl04(String lbnurl04) {
        this.lbnurl04 = lbnurl04;
    }

    public String getLbntitle04() {
        return lbntitle04;
    }

    public void setLbntitle04(String lbntitle04) {
        this.lbntitle04 = lbntitle04;
    }

    public String getLbnpath05() {
        return lbnpath05;
    }

    public void setLbnpath05(String lbnpath05) {
        this.lbnpath05 = lbnpath05;
    }

    public String getLbntarget05() {
        return lbntarget05;
    }

    public void setLbntarget05(String lbntarget05) {
        this.lbntarget05 = lbntarget05;
    }

    public String getLbnurl05() {
        return lbnurl05;
    }

    public void setLbnurl05(String lbnurl05) {
        this.lbnurl05 = lbnurl05;
    }

    public String getLbntitle05() {
        return lbntitle05;
    }

    public void setLbntitle05(String lbntitle05) {
        this.lbntitle05 = lbntitle05;
    }

    public String getCbnpath01() {
        return cbnpath01;
    }

    public void setCbnpath01(String cbnpath01) {
        this.cbnpath01 = cbnpath01;
    }

    public String getCbntarget01() {
        return cbntarget01;
    }

    public void setCbntarget01(String cbntarget01) {
        this.cbntarget01 = cbntarget01;
    }

    public String getCbnurl01() {
        return cbnurl01;
    }

    public void setCbnurl01(String cbnurl01) {
        this.cbnurl01 = cbnurl01;
    }

    public String getCbntitle01() {
        return cbntitle01;
    }

    public void setCbntitle01(String cbntitle01) {
        this.cbntitle01 = cbntitle01;
    }

    public String getCbnpath02() {
        return cbnpath02;
    }

    public void setCbnpath02(String cbnpath02) {
        this.cbnpath02 = cbnpath02;
    }

    public String getCbntarget02() {
        return cbntarget02;
    }

    public void setCbntarget02(String cbntarget02) {
        this.cbntarget02 = cbntarget02;
    }

    public String getCbnurl02() {
        return cbnurl02;
    }

    public void setCbnurl02(String cbnurl02) {
        this.cbnurl02 = cbnurl02;
    }

    public String getCbntitle02() {
        return cbntitle02;
    }

    public void setCbntitle02(String cbntitle02) {
        this.cbntitle02 = cbntitle02;
    }

    public String getCbnpath03() {
        return cbnpath03;
    }

    public void setCbnpath03(String cbnpath03) {
        this.cbnpath03 = cbnpath03;
    }

    public String getCbntarget03() {
        return cbntarget03;
    }

    public void setCbntarget03(String cbntarget03) {
        this.cbntarget03 = cbntarget03;
    }

    public String getCbnurl03() {
        return cbnurl03;
    }

    public void setCbnurl03(String cbnurl03) {
        this.cbnurl03 = cbnurl03;
    }

    public String getCbntitle03() {
        return cbntitle03;
    }

    public void setCbntitle03(String cbntitle03) {
        this.cbntitle03 = cbntitle03;
    }

    public String getCbnpath04() {
        return cbnpath04;
    }

    public void setCbnpath04(String cbnpath04) {
        this.cbnpath04 = cbnpath04;
    }

    public String getCbntarget04() {
        return cbntarget04;
    }

    public void setCbntarget04(String cbntarget04) {
        this.cbntarget04 = cbntarget04;
    }

    public String getCbnurl04() {
        return cbnurl04;
    }

    public void setCbnurl04(String cbnurl04) {
        this.cbnurl04 = cbnurl04;
    }

    public String getCbntitle04() {
        return cbntitle04;
    }

    public void setCbntitle04(String cbntitle04) {
        this.cbntitle04 = cbntitle04;
    }

    public String getCbnpath05() {
        return cbnpath05;
    }

    public void setCbnpath05(String cbnpath05) {
        this.cbnpath05 = cbnpath05;
    }

    public String getCbntarget05() {
        return cbntarget05;
    }

    public void setCbntarget05(String cbntarget05) {
        this.cbntarget05 = cbntarget05;
    }

    public String getCbnurl05() {
        return cbnurl05;
    }

    public void setCbnurl05(String cbnurl05) {
        this.cbnurl05 = cbnurl05;
    }

    public String getCbntitle05() {
        return cbntitle05;
    }

    public void setCbntitle05(String cbntitle05) {
        this.cbntitle05 = cbntitle05;
    }

    public String getRbnpath01() {
        return rbnpath01;
    }

    public void setRbnpath01(String rbnpath01) {
        this.rbnpath01 = rbnpath01;
    }

    public String getRbntarget01() {
        return rbntarget01;
    }

    public void setRbntarget01(String rbntarget01) {
        this.rbntarget01 = rbntarget01;
    }

    public String getRbnurl01() {
        return rbnurl01;
    }

    public void setRbnurl01(String rbnurl01) {
        this.rbnurl01 = rbnurl01;
    }

    public String getRbntitle01() {
        return rbntitle01;
    }

    public void setRbntitle01(String rbntitle01) {
        this.rbntitle01 = rbntitle01;
    }

    public String getRbnpath02() {
        return rbnpath02;
    }

    public void setRbnpath02(String rbnpath02) {
        this.rbnpath02 = rbnpath02;
    }

    public String getRbntarget02() {
        return rbntarget02;
    }

    public void setRbntarget02(String rbntarget02) {
        this.rbntarget02 = rbntarget02;
    }

    public String getRbnurl02() {
        return rbnurl02;
    }

    public void setRbnurl02(String rbnurl02) {
        this.rbnurl02 = rbnurl02;
    }

    public String getRbntitle02() {
        return rbntitle02;
    }

    public void setRbntitle02(String rbntitle02) {
        this.rbntitle02 = rbntitle02;
    }

    public String getRbnpath03() {
        return rbnpath03;
    }

    public void setRbnpath03(String rbnpath03) {
        this.rbnpath03 = rbnpath03;
    }

    public String getRbntarget03() {
        return rbntarget03;
    }

    public void setRbntarget03(String rbntarget03) {
        this.rbntarget03 = rbntarget03;
    }

    public String getRbnurl03() {
        return rbnurl03;
    }

    public void setRbnurl03(String rbnurl03) {
        this.rbnurl03 = rbnurl03;
    }

    public String getRbntitle03() {
        return rbntitle03;
    }

    public void setRbntitle03(String rbntitle03) {
        this.rbntitle03 = rbntitle03;
    }

    public String getRbnpath04() {
        return rbnpath04;
    }

    public void setRbnpath04(String rbnpath04) {
        this.rbnpath04 = rbnpath04;
    }

    public String getRbntarget04() {
        return rbntarget04;
    }

    public void setRbntarget04(String rbntarget04) {
        this.rbntarget04 = rbntarget04;
    }

    public String getRbnurl04() {
        return rbnurl04;
    }

    public void setRbnurl04(String rbnurl04) {
        this.rbnurl04 = rbnurl04;
    }

    public String getRbntitle04() {
        return rbntitle04;
    }

    public void setRbntitle04(String rbntitle04) {
        this.rbntitle04 = rbntitle04;
    }

    public String getRbnpath05() {
        return rbnpath05;
    }

    public void setRbnpath05(String rbnpath05) {
        this.rbnpath05 = rbnpath05;
    }

    public String getRbntarget05() {
        return rbntarget05;
    }

    public void setRbntarget05(String rbntarget05) {
        this.rbntarget05 = rbntarget05;
    }

    public String getRbnurl05() {
        return rbnurl05;
    }

    public void setRbnurl05(String rbnurl05) {
        this.rbnurl05 = rbnurl05;
    }

    public String getRbntitle05() {
        return rbntitle05;
    }

    public void setRbntitle05(String rbntitle05) {
        this.rbntitle05 = rbntitle05;
    }

    public String getRbnpath06() {
        return rbnpath06;
    }

    public void setRbnpath06(String rbnpath06) {
        this.rbnpath06 = rbnpath06;
    }

    public String getRbntarget06() {
        return rbntarget06;
    }

    public void setRbntarget06(String rbntarget06) {
        this.rbntarget06 = rbntarget06;
    }

    public String getRbnurl06() {
        return rbnurl06;
    }

    public void setRbnurl06(String rbnurl06) {
        this.rbnurl06 = rbnurl06;
    }

    public String getRbntitle06() {
        return rbntitle06;
    }

    public void setRbntitle06(String rbntitle06) {
        this.rbntitle06 = rbntitle06;
    }

    public String getRbnpath07() {
        return rbnpath07;
    }

    public void setRbnpath07(String rbnpath07) {
        this.rbnpath07 = rbnpath07;
    }

    public String getRbntarget07() {
        return rbntarget07;
    }

    public void setRbntarget07(String rbntarget07) {
        this.rbntarget07 = rbntarget07;
    }

    public String getRbnurl07() {
        return rbnurl07;
    }

    public void setRbnurl07(String rbnurl07) {
        this.rbnurl07 = rbnurl07;
    }

    public String getRbntitle07() {
        return rbntitle07;
    }

    public void setRbntitle07(String rbntitle07) {
        this.rbntitle07 = rbntitle07;
    }

    public String getRbnpath08() {
        return rbnpath08;
    }

    public void setRbnpath08(String rbnpath08) {
        this.rbnpath08 = rbnpath08;
    }

    public String getRbntarget08() {
        return rbntarget08;
    }

    public void setRbntarget08(String rbntarget08) {
        this.rbntarget08 = rbntarget08;
    }

    public String getRbnurl08() {
        return rbnurl08;
    }

    public void setRbnurl08(String rbnurl08) {
        this.rbnurl08 = rbnurl08;
    }

    public String getRbntitle08() {
        return rbntitle08;
    }

    public void setRbntitle08(String rbntitle08) {
        this.rbntitle08 = rbntitle08;
    }

    public String getRbnpath09() {
        return rbnpath09;
    }

    public void setRbnpath09(String rbnpath09) {
        this.rbnpath09 = rbnpath09;
    }

    public String getRbntarget09() {
        return rbntarget09;
    }

    public void setRbntarget09(String rbntarget09) {
        this.rbntarget09 = rbntarget09;
    }

    public String getRbnurl09() {
        return rbnurl09;
    }

    public void setRbnurl09(String rbnurl09) {
        this.rbnurl09 = rbnurl09;
    }

    public String getRbntitle09() {
        return rbntitle09;
    }

    public void setRbntitle09(String rbntitle09) {
        this.rbntitle09 = rbntitle09;
    }

    public String getRbnpath10() {
        return rbnpath10;
    }

    public void setRbnpath10(String rbnpath10) {
        this.rbnpath10 = rbnpath10;
    }

    public String getRbntarget10() {
        return rbntarget10;
    }

    public void setRbntarget10(String rbntarget10) {
        this.rbntarget10 = rbntarget10;
    }

    public String getRbnurl10() {
        return rbnurl10;
    }

    public void setRbnurl10(String rbnurl10) {
        this.rbnurl10 = rbnurl10;
    }

    public String getRbntitle10() {
        return rbntitle10;
    }

    public void setRbntitle10(String rbntitle10) {
        this.rbntitle10 = rbntitle10;
    }

    public String getReservet01() {
        return reservet01;
    }

    public void setReservet01(String reservet01) {
        this.reservet01 = reservet01;
    }

    public String getReserveb01() {
        return reserveb01;
    }

    public void setReserveb01(String reserveb01) {
        this.reserveb01 = reserveb01;
    }

    public String getReservet02() {
        return reservet02;
    }

    public void setReservet02(String reservet02) {
        this.reservet02 = reservet02;
    }

    public String getReserveb02() {
        return reserveb02;
    }

    public void setReserveb02(String reserveb02) {
        this.reserveb02 = reserveb02;
    }

    public String getReservet03() {
        return reservet03;
    }

    public void setReservet03(String reservet03) {
        this.reservet03 = reservet03;
    }

    public String getReserveb03() {
        return reserveb03;
    }

    public void setReserveb03(String reserveb03) {
        this.reserveb03 = reserveb03;
    }

    public String getRbnpath11() {
        return rbnpath11;
    }

    public void setRbnpath11(String rbnpath11) {
        this.rbnpath11 = rbnpath11;
    }

    public String getRbntarget11() {
        return rbntarget11;
    }

    public void setRbntarget11(String rbntarget11) {
        this.rbntarget11 = rbntarget11;
    }

    public String getRbnurl11() {
        return rbnurl11;
    }

    public void setRbnurl11(String rbnurl11) {
        this.rbnurl11 = rbnurl11;
    }

    public String getRbntitle11() {
        return rbntitle11;
    }

    public void setRbntitle11(String rbntitle11) {
        this.rbntitle11 = rbntitle11;
    }

    public String getdLogopath() {
        return dLogopath;
    }

    public void setdLogopath(String dLogopath) {
        this.dLogopath = dLogopath;
    }

    public String getdLogotitle() {
        return dLogotitle;
    }

    public void setdLogotitle(String dLogotitle) {
        this.dLogotitle = dLogotitle;
    }

    public String getmLogopath() {
        return mLogopath;
    }

    public void setmLogopath(String mLogopath) {
        this.mLogopath = mLogopath;
    }

    public String getmLogotitle() {
        return mLogotitle;
    }

    public void setmLogotitle(String mLogotitle) {
        this.mLogotitle = mLogotitle;
    }

    public Timestamp getLogopostdt() {
        return logopostdt;
    }

    public void setLogopostdt(Timestamp logopostdt) {
        this.logopostdt = logopostdt;
    }
}
