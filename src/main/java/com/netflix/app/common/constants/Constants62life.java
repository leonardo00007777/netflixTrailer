package com.netflix.app.common.constants;

/**
 * 프로그램 코드용 상수 클래스 (62life -asis)
 * @author User
 *
 */
public class Constants62life {

	//!이 파일은 누출되어서는 안됩니다! 각별히 보안에 주의하십시오!
    //20120919 hwkim 처음 복사 작성
    //20130114 hwkim
    //20130116 sykim MAIN_BANNER_IMAGE 위치 수정.
    //20130625 sykik KSNet > INICIS PG변경, 결제수단 추가.
    //20150507 sykim CTI 적용에 따른 콜 센터 전화번호 변경 CSCENTER_NUMBER_GENERAL = "02-512-0440";>> "02-3449-4865";변경.
    //20150625 sykim 하이닉스 및 하이웰 코드 추가.
    //20150713 hwkim 장바구니 담기 표시 메시지 코드 추가 (계속 추가 가능성 있음)
    //20151015 hwkim GOODS, COOKING 폴더 정의
    //20160120 sykim EXCEPT_GROUP 비용매출분 소속사 96(유비케어) > 70(자연이랑) 변경.
    //20160219 sykim 사무실 이전으로 콜 센터 전화번호 변경 CSCENTER_NUMBER_GENERAL = "02-512-0440";>> "02-6445-5500";변경.
    //20160623 sykim BENEPIA 설정추가.
    //20180723 hwkim DEFAULT_ORDER_GOODS_TYPE 추가.
    //20180918 sykim INICIS Mobile용 금액변조방지를 위한 Hash Key 추가.
    //20190118 sykim INICIS 웹표준결제를 위한 INICIS_SIGN_KEY, INICIS_JAVASCRIPT 추가.
    //20190321 sykim IPIN DLL Module Version 2 의 암호화키 적용.
    //20191024 sykim SK페이 Test와 Live URL 변경.

    //public static final String connectionString = "Provider=SQLOLEDB.1; Data source=211.238.10.166,1433; Initial Catalog=UGIWEB; User Id=ugisa; Password=xoghkqlfeld@11;"
    //public static final String connectionString = "Provider=SQLOLEDB.1; Data source=192.168.220.114\health,3727; Initial Catalog=UGIWEB; User Id=ugisa; Password=!dlqlwm@10;"
    //public static final String connectionString = "Provider=SQLOLEDB.1; Data source=WNSERVER1\WNDBTEST1,3727; Initial Catalog=UGIWEB_V2; User Id=ugisa; Password=!qjadid@612;"
   
	// 아래 주석 활성화필요 (2021. 12. 10)
	//public static final String connectionString = "Provider=MSOLEDBSQL; Data source=WNSERVER1\WNDBTEST1,3727; Initial Catalog=UGIWEB_V2; User Id=ugisa; Password=!qjadid@612;";

    public static final String ENC_KEY_NAME = "sym_enc_62";

    //public static final String NAS_PATH = "\\211.238.10.7\nature\";
    public static final String NAS_PATH = "/WithNatureFile1/";

    //public static final String L4_APPLY_PORT = "8860"

    //CDTYPE
    public static final String TYPE_GRADE = "01";       // 회원등급
    public static final String TYPE_MEMST = "02";       // 회원승인상태
    public static final String TYPE_PAYST = "03";       // 결제상태
    public static final String TYPE_DLVST = "04";       // 배송상태
    public static final String TYPE_CTSCD = "05";       // 컨텐츠
    public static final String TYPE_PAYCD = "06";       // 결제방법
    public static final String TYPE_DPSCD = "07";       // 예치금구분
    public static final String TYPE_DPSST = "08";       // 예치금상태
    public static final String TYPE_FARM = "09";       // 유기농구분
    public static final String TYPE_TCKST = "10";       // 상품권상태
    public static final String TYPE_GRPDIV = "11";       // 소속사분류
    public static final String TYPE_TLKDIV1 = "12";       // 상담분류
    public static final String TYPE_TLKDIV2 = "13";       // 상담구분
    public static final String TYPE_TLKST = "14";       // 상담상태
    public static final String TYPE_FAQ = "15";       // FAQ분류
    public static final String TYPE_GDSDIV = "16";       // 상품구분
    public static final String TYPE_RCPCD = "17";       // 현금영수증가입구분
    public static final String TYPE_RCPST = "18";       // 현금영수증상태

    public static final String TYPE_PNTCD = "53";       //SK포인트 구분
    public static final String TYPE_PGCD = "62";       //결제대행사(Payment Gateway) 구분
    public static final String TYPE_ACCCD = "63";       //적립포인트 구분

    // CDTYPE = 01 회원등급
    public static final String GRADE_C = "01";
    public static final String GRADE_B = "02";
    public static final String GRADE_A = "03";
    public static final String GRADE_S = "04";

    // CDTYPE = 02 승인상태
    public static final String MEMST_JOIN = "00";
    public static final String MEMST_UPREQ = "01";
    public static final String MEMST_LAYOFF = "02";       //소속사휴직
    public static final String MEMST_UP = "10";
    public static final String MEMST_OUTREQ = "91";
    public static final String MEMST_OUT = "99";

    // CDTYPE = 03 결제상태
    public static final String PAYST_STANDBY = "00";  //결제번호생성후 대기
    public static final String PAYST_INSTAY = "01";
    public static final String PAYST_CARDSTAY = "02";
    public static final String PAYST_PAY = "10";
    public static final String PAYST_FAIL = "90";
    public static final String PAYST_CANCELREQ = "91";
    public static final String PAYST_CANCEL = "99";

    // CDTYPE = 04 배송상태
    public static final String DLVST_PAYSTAY = "00";
    public static final String DLVST_RESERVE = "01";
    public static final String DLVST_READY = "10";
    public static final String DLVST_OUT = "20";
    public static final String DLVST_DLV = "30";
    public static final String DLVST_OUTER_DLV = "35";
    public static final String DLVST_COMPLETE = "40";
    public static final String DLVST_CANCEL = "99";

    // CDTYPE = 05 컨텐츠
    public static final String CTSCD_DISTRIBUTION = "01";
    public static final String CTSCD_ORGANIC = "02";
    public static final String CTSCD_SKWELLBEING = "03";
    //public static final String CTSCD_PRODINFO = "05"
    public static final String CTSCD_FARMER = "11";
    public static final String CTSCD_CUSTOMER = "12";
    public static final String CTSCD_FARMEXP = "20";
    public static final String CTSCD_FARMEXP_A = "21";
    //public static final String CTSCD_EVENT = "22"
    public static final String CTSCD_EVENT_A = "23";
    public static final String CTSCD_SHOW = "24";
    public static final String CTSCD_SHOW_A = "25";
    public static final String CTSCD_STOCKHOLDER = "30";

    public static final String CTSCD_STORY = "01";
    public static final String CTSCD_EVENT = "02";
    public static final String CTSCD_PARTNER = "03";
    public static final String CTSCD_PRODINFO = "05";
    public static final String CTSCD_HEALTHINFO = "06";

    // CDTYPE = 06 결제방법
    public static final String PAYCD_CARD = "01";       //카드결제
    public static final String PAYCD_BANK = "02";       //무통장입금
    public static final String PAYCD_DEDUCT = "03";       //급여공제
    public static final String PAYCD_WELLBEING = "04";       //SK건설 복리후생포인트
    public static final String PAYCD_TICKET = "05";       //상품권
    public static final String PAYCD_ZEROPAY = "06";       //기타결제(고객결제 0원)
    public static final String PAYCD_DIRECTBANK = "07";       //실시간 계좌이체
    public static final String PAYCD_VBANK = "08";       //가상계좌
    public static final String PAYCD_MOBILE = "09";       //휴대폰결제
    public static final String PAYCD_HYWELL = "10";       //하이닉스 하이웰포인트
    public static final String PAYCD_SYRUPPAY = "11";       //시럽페이
    public static final String PAYCD_NAVERPAY = "12";       //네이버페이 결제
    public static final String PAYCD_POINT = "13";       //포인트결제(PG)
    public static final String PAYCD_MULTI = "20";       //복합결제(PG포인트와 다른결제수단를 동시에 사용)

    // CDTYPE = 07 예치금구분
    public static final String DPSCD_TICKET = "07";
    public static final String DPSCD_RETURN_IN = "08";
    public static final String DPSCD_ETC_IN = "09";
    public static final String DPSCD_ORD_OUT = "10";
    public static final String DPSCD_CASH_OUT = "18";
    public static final String DPSCD_ETC_OUT = "19";

    // CDTYPE = 08 예치금상태
    public static final String DPSST_USE = "00";
    public static final String DPSST_STAY = "01";
    public static final String DPSST_CANCEL = "99";

    // 예치금 지급 상태 한계
    public static final int DPS_PLUS_LIMIT = 9;	// 09이하:입금, 10이상:출금

    // CDTYPE = 09 유기농구분
    public static final String FARM_UGI = "10";
    public static final String FARM_NODRUG = "20";
    public static final String FARM_CHGUGI = "30";
    public static final String FARM_LOWDRUG = "40";
    public static final String FARM_NORMAL = "50";
    public static final String FARM_MEAT = "60";
    public static final String FARM_PROCESSING = "70";
    public static final String FARM_AQUATIC = "80";

    // CDTYPE = 10 상품권상태
    public static final String TCKST_PRT = "10";
    public static final String TCKST_ISS = "20";
    public static final String TCKST_USE = "30";

    // CDTYPE = 11 소속사분류
    public static final String GRPDIV_GROUP = "10";
    public static final String GRPDIV_COLLECT = "11";
    public static final String GRPDIV_NORMAL = "20";
    public static final String GRPDIV_ETC = "90";

    // CDTYPE = 16 상품구분
    public static final String GDSDIV_PACK = "10";
    public static final String GDSDIV_SET = "20";
    public static final String GDSDIV_ITEM = "30";

    // CDTYPE = 17 현금영수증가입구분
    public static final String RCPCP_RESIDENT = "10";
    public static final String RCPCD_HP = "20";
    public static final String RCPCD_COMPANY = "30";

    // CDTYPE = 18 현금영수증상태
    public static final String RCPST_STANDBY = "00";
    public static final String RCPST_RCPREQ = "01";
    public static final String RCPST_ONPROC = "05";
    public static final String RCPST_RCPUP = "10";
    public static final String RCPST_CANCELREQ = "91";
    public static final String RCPST_CANCEL = "99";

    //CDTYPE = 62 결제대행사 구분
    public static final String PGCD_SELF = "00";
    public static final String PGCD_INICIS = "01";
    public static final String PGCD_SYRUPPAY = "02";
    public static final String PGCD_NAVERPAY = "03";
    public static final String PGCD_ETC = "99";

    // 비회원 코드
    public static final String MEMCD_NOMEMBER = "I0000000";

    //그림파일 표시 경로
    public static final String PATH_GOODSIMG = "/images/gdimg/";
    public static final String URL_GOODSIMG = "http://www.62life.com/images/gdimg/";

    public static final String PATH_COOKIMG = "/webzine/cookimg/";
    public static final String URL_COOKIMG = "http://www.62life.com/webzine/cookimg/";

    //이미지 저장 관련 정보
    //public static final String GOODS_IMAGE_ABSOLUTE_PATH = "\\211.238.10.7\nature\62LIFE_MAIN\images\gdimg\";WithNatureFile1\website
    //public static final String GOODS_IMAGE_ABSOLUTE_PATH = "\\WithNatureFile1\62LIFE_MAIN\images\gdimg\";
    public static final String GOODS_IMAGE_ABSOLUTE_PATH = "D:/appdata/WEBSITE/62LIFE_MAIN/images/gdimg/";
    //public static final String GOODS_IMAGE_RELATIVE_PATH = "http://www.62life.com/images/gdimg/";
    public static final String GOODS_IMAGE_RELATIVE_PATH = "http://192.168.0.10:8084/images/gdimg/";

    //public static final String COOKING_IMAGE_ABSOLUTE_PATH = "\\211.238.10.7\nature\62LIFE_MAIN\webzine\cookimg\";
    //public static final String COOKING_IMAGE_ABSOLUTE_PATH = "\\WithNatureFile1\62LIFE_MAIN\webzine\cookimg\";
    public static final String COOKING_IMAGE_ABSOLUTE_PATH = "D:/appdata/WEBSITE/62LIFE_MAIN/webzine/cookimg/";
    //public static final String COOKING_IMAGE_RELATIVE_PATH = "http://www.62life.com/webzine/cookimg/";
    public static final String COOKING_IMAGE_RELATIVE_PATH = "http://192.168.0.10:8084/webzine/cookimg/";

    //public static final String PROFILE_IMAGE_ABSOLUTE_PATH = "/images/profiles/";
    //public static final String PROFILE_IMAGE_ABSOLUTE_PATH = "\\211.238.10.7\nature\62LIFE_MAIN\images\profiles\";
    //public static final String PROFILE_IMAGE_ABSOLUTE_PATH = "\\WithNatureFile1\62LIFE_MAIN\images\profiles\";
    public static final String PROFILE_IMAGE_ABSOLUTE_PATH = "D:/appdata/WEBSITE/62LIFE_MAIN_V2/images/profiles/";
    public static final String PROFILE_IMAGE_RELATIVE_PATH = "/images/profiles/";

    //public static final String MAIN_BANNER_IMAGE_ABSOLUTE_PATH = "/images/banner/";
    //public static final String MAIN_BANNER_IMAGE_ABSOLUTE_PATH = "\\211.238.10.7\nature\62LIFE_MAIN\images\banner\";
    //public static final String MAIN_BANNER_IMAGE_ABSOLUTE_PATH = "\\WithNatureFile1\62LIFE_MAIN\images\banner\";
    public static final String MAIN_BANNER_IMAGE_ABSOLUTE_PATH = "D:/appdata/WEBSITE/62LIFE_MAIN_V2/images/banner/";
    
    public static final String MAIN_BANNER_IMAGE_RELATIVE_PATH = "/images/banner/";

    // public static final String QNA_IMAGE_ABSOLUTE_PATH = "/userfiles/qna/";
    // public static final String QNA_IMAGE_ABSOLUTE_PATH = "//211.238.10.7/nature/62LIFE_ADMIN/userfiles/qna/";
    // public static final String QNA_IMAGE_ABSOLUTE_PATH = "//WithNatureFile1/62LIFE_ADMIN/userfiles/qna/";
    public static final String QNA_IMAGE_ABSOLUTE_PATH = "D:/appdata/WEBSITE/62LIFE_ADMIN_V2/userfiles/qna/";
    public static final String QNA_IMAGE_RELATIVE_PATH = "/userfiles/qna/";

    //public static final String COMMUNITY_IMAGE_ABSOLUTE_PATH = "//211.238.10.7/nature/62LIFE_ADMIN/userfiles/community/";
    //public static final String COMMUNITY_IMAGE_ABSOLUTE_PATH = "//WithNatureFile1/62LIFE_ADMIN/userfiles/community/";
    public static final String COMMUNITY_IMAGE_ABSOLUTE_PATH = "D:/appdata/WEBSITE/62LIFE_ADMIN_V2/userfiles/community/";
    public static final String COMMUNITY_IMAGE_RELATIVE_PATH = "/userfiles/community/";

    //public static final String BOARD_IMAGE_ABSOLUTE_PATH = "D:/WEB/62LIFE_ADMIN/userfiles/image/";
    //public static final String BOARD_IMAGE_ABSOLUTE_PATH = "//WithNatureFile1/62LIFE_ADMIN/userfiles/image/";
    public static final String BOARD_IMAGE_ABSOLUTE_PATH = "D:/appdata/WEBSITE/62LIFE_ADMIN_V2/userfiles/image/";
    public static final String BOARD_IMAGE_RELATIVE_PATH = "/userfiles/image/";

    public static final String BLOG_THUMB_IMAGE_RELATIVE_PATH = "/userfiles/blog/thumbnail/";

    public static final int PAY_CANCEL_LIMIT = 0;				// 결제일 1일 후 까지 취소 가능
    public static final int RCP_GIVE_LIMIT = 1 ;				//	현금영수증 발행 최소금액
    public static final int ESC_SERVICE_LIMIT = 100000;  // 에스크로 제공 금액
    // PG사(KSNet)에 등록된 상점 ID
    // 라이브ID: 2001103703 (SK D&D)
    //         , 2001105156 (에버헬스케어: 2012-01-01 부터 적용.)
    //         , 2001105233 (유비케어: 2012-03-31 부터 적용.)
    // 테스트ID: 2999199998
    // PG사(INICIS)에 등록된 상점ID
    // 라이브ID: ubcare0022 (유비케어: 2013-06-26 부터 적용.)
    // 라이브ID: jayeon0000 (자연이랑: 2016-01-16 부터 적용.)
    // 테스트ID: INIpayTest
    public static final String PAY_STORE_ID = "INIpayTest";       //Test
    public static final String INICIS_SIGN_KEY = "SU5JTElURV9UUklQTEVERVNfS0VZU1RS";       //Test
    public static final String INICIS_JAVASCRIPT = "https://stgstdpay.inicis.com/stdjs/INIStdPay.js";       //Test
    //public static final String PAY_STORE_ID = "jayeon0000";       //Live
    //public static final String INICIS_SIGN_KEY = "Vkg1dlZCeVpqRVRUbk9ScE9xdUg4dz09";       //Live
    //public static final String INICIS_JAVASCRIPT = "https://stdpay.inicis.com/stdjs/INIStdPay.js";       //Live
    //이니시스모바일 금액위변조 방지를 위한 Hash-Key
    public static final String INICIS_MOBILE_HASH_KEY = "9D53182F470CF64FC98959241B402A63";

    // Usafe 보증보험 ID (라이브ID:62life/ap1234, 테스트ID:test00/1111)
    public static final String USAFE_ID = "62life";

    ////베네피아-KCP 설정.
    //public static final String g_conf_key_dir   = "C:\app\DLLOCX\BENEPIA_KCP\bin\pub.key"
    //public static final String g_conf_log_dir   = "C:\app\DLLOCX\BENEPIA_KCP\log"
    //public static final String g_conf_gw_port   = "8090";       //포트번호(변경불가)
    ////베네피아웹 테스트환경의 테스트계정 : testcp / ptn15669955ok
    //public static final String g_conf_gw_url    = "testpaygw.kcp.co.kr"
    //public static final String g_conf_site_cd   = "T0000"
    //public static final String g_conf_site_key  = "3grptw1.zW0GSo4PQdaGvsF__"
    //public static final String g_conf_site_name = "KCP TEST SHOP"
    ////베네피아웹 운영환경의 테스트계정 : test_alliance / skmns^1566
    //public static final String g_conf_gw_url    = "paygw.kcp.co.kr"
    //public static final String g_conf_site_cd   = "G7974"
    //public static final String g_conf_site_key  = "2JVrG7HkQicddgJqJrlUoWf__"
    //public static final String g_conf_site_name = "62LIFE"

    //SK페이 설정.
    public static final String SYRUPPAY_ISS = "SK_62life";       //가맹점ID.
    //Test 개발용, 자연이랑 개발환경과 시럽페이 개발환경과의 통신만 가능.
    public static final String SYRUPPAY_ENC_KEY = "vp77ssPePWC4ZLIhOfVfgYcLvi0w1n6M";       //발급받은 Secret Key.
    public static final String SYRUPPAY_AUTH_KEY = "U0tfNjJsaWZlOk1rcU1yOE94bGEwYXVMVEs0YUJhWlZQOUk4N1BpZzRU";       //발급받은 API Key.
    public static final String SYRUPPAY_AUTH_URL = "https://stg-pay.sk-pay.co.kr";       //SK페이 인증서버 URL
    public static final String SYRUPPAY_API_URL = "https://stg-fepapi.sk-pay.co.kr";       //SK페이 API 서버 URL
    public static final String SYRUPPAY_JAVASCRIPT = "https://stg-pay.sk-pay.co.kr/pages/js/skplanet.syruppay.common.js";
    //Live 상용환경, 자연이랑 Live와 시럽페이 상용환경과의 통신만 가능.
    //public static final String SYRUPPAY_ENC_KEY = "NtzwGwOKoBYanZ8j8AVei8sECcZNkxYz";       //발급받은 Secret Key.
    //public static final String SYRUPPAY_AUTH_KEY = "U0tfNjJsaWZlOnhiOXNRTVBSZHhlZFNHZHRHOUxRS2FGUVo2UGZWRG5t";       //발급받은 API Key.
    //public static final String SYRUPPAY_AUTH_URL = "https://pay-auth.sk-pay.co.kr";       //SK페이 인증서버 URL
    //public static final String SYRUPPAY_API_URL = "https://fepapi.sk-pay.co.kr";       //SK페이 API 서버 URL
    //public static final String SYRUPPAY_JAVASCRIPT = "https://pay-auth.sk-pay.co.kr/pages/js/skplanet.syruppay.common.js"

//===================================================================================================
    //네이버페이 설정.
    public static final String NPAY_STORE_ID = "withnaturex";       //네이버페이 가맹점 ID.
    public static final String NPAY_STORE_SECRET = "11F3D98B-7A90-43D0-BED1-3E1A6075805C";       //가맹점 인증키 (가맹점과 네이버페이 상품연동을 위한 고유값, 3자노출 주의)
    public static final String NPAY_STORE_BTN = "6E296DB9-D29A-40B7-B84B-406DB9E7DBC4";       //버튼 인증키 (가맹점 고유값, 버튼 삽입 시 필요)
    public static final String NPAY_STORE_COMMON = "s_51fd78c725b3";       //공통 인증키 (네이버공통 유입 스크립트 적용한 사이트 구분용, 추가발급 ID)
    public static final String NPAY_CLIENT_ID = "aIYXiaeJ4ZqOEOS9b4XA";
    public static final String NPAY_CLIENT_SECRET = "xq2zfAN133";

    //Test
    public static final String NPAY_API_DOMAIN = "https://dev.apis.naver.com";
    public static final String NPAY_SVC_DOMAIN_PC = "https://test-pay.naver.com";
    public static final String NPAY_SVC_DOMAIN_M = "https://test-m.pay.naver.com";
    //Live
    //public static final String NPAY_API_DOMAIN = "https://apis.naver.com"
    //public static final String NPAY_SVC_DOMAIN_PC = "https://pay.naver.com"
    //public static final String NPAY_SVC_DOMAIN_M = "https://m.pay.naver.com"
//===================================================================================================
    

    //본인인증 ID
    //public static final String PCERT_MOBILE_ID = "SVHU001";       //휴대폰 본인인증 ID, PWD: AA5077, ~ 20200407까지(회원사명 : (주)유기라이프).
    public static final String PCERT_MOBILE_ID = "SVHU002";       //휴대폰 본인인증 ID, PWD: AA5549, 20200408부터 ~ (회원사명 : (재)행복에프앤씨(자연이랑 분사무소))
    public static final String PCERT_IPIN_ID = "VHU002";  //아이핀 본인인증 ID, PWD: AA5082
    //public static final String PCERT_IPIN_ENCKEY = "5C159165D6A92E040296B7152DD88257";       //https://www.bizsiren.com/member/ipinInfoModulePwd.do 설정없이 Test할 수 있는 암호화키.
    public static final String PCERT_IPIN_ENCKEY = "3DDE667DAB457C809EF0DF046C2BC245";       //20190321 생성, 6개월마다 갱신권장.
    //https://www.bizsiren.com/login.do 페이지에 받은 위의 아이디와 비밀번호로 로그인,
    //회원사전용 > 본인확인 > 도메인관리 메뉴 선택,
    //서비스페이지 등록 후 나오는 서비스번호를 아래에 기술함.
    //아래는 www.62life.com 으로 수행할 경우.
    //public static final String PCERT_MOBILE_JOIN_SERVICENO = "001004";     //회원가입 휴대폰본인인증 서비스번호 (/member/join_cert.asp)
    //public static final String PCERT_MOBILE_JOIN_SERVICENO_V2 = "001009"; //회원가입 휴대폰본인인증 서비스번호 20180627 부터(/member/join_step1.asp)
    //public static final String PCERT_MOBILE_JOIN_SERVICENO_V3 = "001010"; //회원가입 휴대폰본인인증 서비스번호 20190213 부터(/member/jm_pcert.asp)
    //public static final String PCERT_MOBILE_SEARCHID_SERVICENO = "001002"; //아이디찾기 휴대폰본인인증 서비스번호
    //public static final String PCERT_MOBILE_SEARCHPWD_SERVICENO = "001008";       //비밀번호찾기 휴대폰본인인증 서비스번호 001003
    //public static final String PCERT_IPIN_JOIN_SERVICENO = "001004";       //회원가입 아이핀인증 서비스번호 (/member/join_cert.asp)
    //public static final String PCERT_IPIN_JOIN_SERVICENO_V2 = "001006";   //회원가입 아이핀인증 서비스번호 20180627부터(/member/join_step1.asp)
    //public static final String PCERT_IPIN_JOIN_SERVICENO_V3 = "001007";   //회원가입 아이핀인증 서비스번호 20190213부터(/member/jm_pcert.asp)
    //public static final String PCERT_IPIN_SEARCHID_SERVICENO = "001002";   //아이디찾기 아이핀인증 서비스번호
    //public static final String PCERT_IPIN_SEARCHPWD_SERVICENO = "001005";  //비밀번호찾기 아이핀인증 서비스번호 001003
    //아래는 localhost로 수행할 경우.
    public static final String PCERT_MOBILE_JOIN_SERVICENO_V3 = "003003"; //회원가입 휴대폰본인인증 서비스번호 20190213 부터(/member/jm_pcert.asp)
    public static final String PCERT_MOBILE_SEARCHID_SERVICENO = "003001"; //아이디찾기 휴대폰본인인증 서비스번호
    public static final String PCERT_MOBILE_SEARCHPWD_SERVICENO = "003002";       //비밀번호찾기 휴대폰본인인증 서비스번호
    public static final String PCERT_IPIN_JOIN_SERVICENO = "002004";       //회원가입 아이핀인증 서비스번호.
    public static final String PCERT_IPIN_JOIN_SERVICENO_V3 = "008001";   //회원가입 아이핀인증 서비스번호 20190213부터(/member/jm_pcert.asp)
    public static final String PCERT_IPIN_SEARCHID_SERVICENO = "008002";   //아이디찾기 아이핀인증 서비스번호
    public static final String PCERT_IPIN_SEARCHPWD_SERVICENO = "008003";  //비밀번호찾기 아이핀인증 서비스번호 

    //public static final String PCERT_MOBILE_JOIN_SERVICENO_M = "007001";     //모바일 회원가입 휴대폰본인인증 서비스번호 (/m/member/join_cert_m.asp)
    //public static final String PCERT_MOBILE_JOIN_SERVICENO_V2_M = "007004"; //모바일 회원가입 휴대폰본인인증 서비스번호 20180627부터(/m/member/join_step1_m.asp)
    //public static final String PCERT_MOBILE_JOIN_SERVICENO_V3_M = "007005"; //모바일 회원가입 휴대폰본인인증 서비스번호 20190222부터(/m/member/jm_pcert_m.asp)
    //public static final String PCERT_MOBILE_SEARCHID_SERVICENO_M = "007002"; //모바일 아이디찾기 휴대폰본인인증 서비스번호
    //public static final String PCERT_MOBILE_SEARCHPWD_SERVICENO_M = "007003";       //모바일 비밀번호찾기 휴대폰본인인증 서비스번호
    //public static final String PCERT_IPIN_JOIN_SERVICENO_M = "006001";       //모바일 회원가입 아이핀인증 서비스번호 (/m/member/join_cert_m.asp)
    //public static final String PCERT_IPIN_JOIN_SERVICENO_V2_M = "006004";   //모바일 회원가입 아이핀인증 서비스번호 20180627부터(/m/member/join_step1_m.asp)
    //public static final String PCERT_IPIN_JOIN_SERVICENO_V3_M = "006005";   //모바일 회원가입 아이핀인증 서비스번호 20190222부터(/m/member/jm_pcert_m.asp)
    //public static final String PCERT_IPIN_SEARCHID_SERVICENO_M = "006002";   //모바일 아이디찾기 아이핀인증 서비스번호
    //public static final String PCERT_IPIN_SEARCHPWD_SERVICENO_M = "006003";  //모바일 비밀번호찾기 아이핀인증 서비스번호
    //아래는 localhost로 수행할 경우.
    public static final String PCERT_MOBILE_JOIN_SERVICENO_V3_M = "003006"; //모바일 회원가입 휴대폰본인인증 서비스번호 20190222부터(/m/member/jm_pcert_m.asp)
    public static final String PCERT_MOBILE_SEARCHID_SERVICENO_M = "003004"; //모바일 아이디찾기 휴대폰본인인증 서비스번호
    public static final String PCERT_MOBILE_SEARCHPWD_SERVICENO_M = "003005";       //모바일 비밀번호찾기 휴대폰본인인증 서비스번호
    public static final String PCERT_IPIN_JOIN_SERVICENO_M = "006001";       //모바일 회원가입 아이핀인증 서비스번호.
    public static final String PCERT_IPIN_JOIN_SERVICENO_V2_M = "";   //모바일 회원가입 아이핀인증 서비스번호 20180627부터(/m/member/join_step1_m.asp)
    public static final String PCERT_IPIN_JOIN_SERVICENO_V3_M = "008005";   //모바일 회원가입 아이핀인증 서비스번호 20190222부터(/m/member/jm_pcert_m.asp)
    public static final String PCERT_IPIN_SEARCHID_SERVICENO_M = "008004";   //모바일 아이디찾기 아이핀인증 서비스번호
    public static final String PCERT_IPIN_SEARCHPWD_SERVICENO_M = "008006";  //모바일 비밀번호찾기 아이핀인증 서비스번호

    // MB_GROUP의 GRPCD 그룹사코드
    public static final String GROUP_NORMAL = "60";       // 일반
    public static final String GROUP_SKEC = "02";       // SK 건설

    // 자동주문 상품
    public static final String Goods25000 = "A3";
    public static final String Goods30000 = "C2";
    public static final String Goods40000 = "B2";

    //검색태그 수치
    public static final int COUNT_STAG05 = 45;
    public static final int COUNT_STAG04 = 30;
    public static final int COUNT_STAG03 = 12; //첫화면검색태그기준값
    public static final int COUNT_STAG02 = 7;

    //검색태그 30일과 한주간의차이 가중치
    public static final int sWeight = 3;

    //검색태그 제한단어
    public static final String SEARCHTAG_LIMIT_WORDS = "120|3Kg|10kg|5KG";

    //태그관련 상수 20090219
    //태그 클릭순위
    public static final int COUNT_TAG05 = 200;
    public static final int COUNT_TAG04 = 100;
    public static final int COUNT_TAG03 = 70;
    public static final int COUNT_TAG02 = 30;
    //태그 연결순위
    public static final int LINK_TAG05 = 10;
    public static final int LINK_TAG04 = 20;
    public static final int LINK_TAG03 = 30;
    public static final int LINK_TAG02 = 40;

    //태그 유형 테이블 ------------
    public static final String TAG_TYPE_WEBZINE = "WZ";
    public static final String TAG_TYPE_PRODUCT = "PR";
    public static final String TAG_TYPE_BOARD = "BD";
    public static final String TAG_TYPE_REPLOG = "RL";
    public static final String TAG_TYPE_DISCUSSION = "DC";
    public static final String TAG_TYPE_BLOG = "BL";
    public static final String TAG_TYPE_TRACKBACK = "TB";
    public static final String TAG_TYPE_MYSET = "MS";

    public static final String TAG_ID_WEBZINE = "bd_contents";
    public static final String TAG_ID_PRODUCT = "gd_master";
    public static final String TAG_ID_REPLOG = "basicomments";
    public static final String TAG_ID_DISCUSSION = "discussions";
    public static final String TAG_ID_BLOG = "blog";
    public static final String TAG_ID_TRACKBACK = "basicomments";

    public static final String CD_MASTER_TAG_CATEGORY = "50";
    //-----------------------------

    //WMSL URL
    public static final String WMS_URL_R = "http://210.91.239.73:8087";
    public static final String WMS_URL = "http://210.91.239.73:8087";
    //public static final String WMS_URL = "http://222.234.3.49:8087"; //해당 서버 중지 20160414
    public static final String WMSL_API_KEY = "e05f6b1b19f74b9f9b5b";
    public static final String APT_SERVICE_KEY = "L6H7MsVem50id5bLL15FoMgn0hQBzdfCVu08XJG9JMdNtjOBn%2Fv4JU3wznGhd68VrfymvTUxqtt61eTsjAwDGg%3D%3D";

    //댓글 제외 게시판
    public static final String NO_VIEW_BOARD_LIST = "'11_maniafreeboard'";

    //---------------------------------------
    //로그인 비밀번호 입력오류 허용횟수, 20101011.
    public static final int FAILED_LOGIN_LIMIT = 5;

    //public static final String MINIMUM_ORDER_PRICE = 25000 //2018-05-31 까지.
    public static final int MINIMUM_ORDER_PRICE = 40000; //2018-06-01 부터.
    public static final int DELIVERY_CHARGE = 3000;

    //고객만족센터 대표번호
    public static final String CSCENTER_NUMBER = "080-303-6262";
    public static final String CSCENTER_NUMBER_GENERAL = "02-6445-5500";

    public static final String SNS_PREFIX = "자연이랑 - ";

    public static final String SK_CHEMICALS = "'03','22','26','33','51','95','153','164','201','211','212','218'";       //20191112 yun 확인.
    public static final String SK_EC = "02";
    public static final String SK_CNC = "01";
    public static final String SK_TELECOM = "19";
    public static final String SK_PLANET = "31";
    public static final String SK_TEL_PLA = "'19','31'";
    public static final String SK_HYNIX = "154";
    public static final String SK_HYNIX_CD = "154";
    public static final String SK_TNS_CD = "168";
    public static final String SK_STOCK_CD = "113";
    public static final String CNTHOTH = "'109','145','146'";
    public static final String SK_HYNIXES = "'154','166','167','195'";
    public static final String SK_HYNIXES_A = "'154','166','167'";    


    public static final String USER_DEFINED_TARGET = "'59','101','03','19','15','31','16','216','68','212','211','158','09','26','33','95','164','163','218','149','181','153','70','210','196','01','154'";
    //public static final String USER_DEFINED_TARGET2 = "'01','02','03','09','10','14','15','16','18','19','26','31','33','35','53','59','68','70','95','97','101','149','153','154','158','163','164','166','167','168','181','195','196','210','211','212','216','218'";
    //public static final String USER_DEFINED_TARGET2 = "'01','03','09','15','16','19','26','31','33','59','68','70','95','101','149','153','154','158','163','164','181','196','210','211','212','216','218'";
    public static final String USER_DEFINED_TARGET2 = "'03','22','26','33','95','164','201','211','212','218'";
    public static final String USER_DEFINED_TARGET3 = "'59','101','03','19','15','31','16','216','68','212','211','158','09','26','33','95','164','218','163','149','181','153','70','210','196','154','01'" ;

    public static final String BIG5 = SK_CNC + "," + SK_EC+ "," + SK_CHEMICALS+ "," + SK_TEL_PLA;
    public static final String BIG6 = SK_CNC+ "," + SK_EC+ "," + SK_CHEMICALS+ "," + SK_TEL_PLA+ "," + SK_HYNIX;
    
    //정산관련 페이지에서 비용매출분에 속하는 그룹.
    // public static final  String EXCEPT_GROUP = "'65','96'";
    public static final String EXCEPT_GROUP = "70";
    
    //매출정산 주문유형(+자연이랑)
    public static final String N_SALES_ORDERTYPE = "'01','03','02','05','10','11','12','15','16'";
    //매출정산 주문유형(+WMSL)
    public static final String M_SALES_ORDERTYPE = "'01','03','HO'";
    //법인매출정산 주문유형(+WMSL,제휴주문)
    public static final String M_SALES_CORP_ORDERTYPE = "'01','03','16'";    
    
    //도시락주문 유형 그룹코드
    public static final String LUNCH_ORDER_TYPE_GROUP = "'15','16'";

    //업체배송 유형 그룹코드
    public static final String SUPPD_ORDER_TYPE_GROUP = "'15','16'";

    //재배송주문 유형코드
    public static final String REDELIVERY_ORDER_TYPE = "'06','07','08'";
    
    //기본 주문상품 유형
    public static final String DEFAULT_ORDER_GOODS_TYPE = "11";   

    //Twitter v1.1 oAuth
    public static final String TWITTER_API_CONSUMER_KEY =  "Iio3tLgX1UP8xZU9dmMp7g";
    public static final String TWITTER_API_CONSUMER_SECRET = "MB3VMsbmFiUatVvMB1PRvvQzEVhFxc5mOCbCrc";
    public static final String TWITTER_API_OAUTH_TOKEN = "229685739-lo5f3Hhlbj6IoDdKYlKARlKVFAAxKdIYwDpahutf";
    public static final String TWITTER_API_OAUTH_TOKEN_SECRET = "oZbQGGWnjyOZUoIyxKpGscxi66aUcSdpbjBMwBJLotJJE";

    //상품 유형, 특성에 따른 장바구니 메시지 지정
    public static final String MSG_GOODS_RESERVE = "<p>방금 장바구니에 담은 상품은 예약 상품으로,</p><p><span class=red>정해진 기간에 배송하는 상품</span>입니다.</p><p>배송기간을 확인하세요!</p>";
    public static final String MSG_GOODS_04 = "<p>친환경곡류는 방부제와 살충제를 사용하지 않아</p><p>한꺼번에 많이 구입하여 보관하시면 벌레가 생길 수 있습니다.</p><p>꼭 기억해주세요!</p>";


    //자동주문 전용 상품 - 일반고객에게는 판매하지 않을 세트상품 제외
    public static final String ONLY_AUTOORDER_SET = "'G9','H6','H9','P9','R6','R9','T1','T2','T3','Z02','Z21','Z22','Z25','Z26','Z94'";

    public static final String DAY_ORDER_DEADLINE_TIME = "13:00:00";
    public static final String DAY_PAY_DEADLINE_TIME = "13:10:00";
    public static final String PRODUCT_CHANGE_TIME = "오후1시";    
}