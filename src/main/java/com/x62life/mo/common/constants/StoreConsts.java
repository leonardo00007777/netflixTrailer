package com.x62life.mo.common.constants;

/**
 * 스토어 모듈 공통 상수
 *
 * @author User
 *
 */
public class StoreConsts {

    /** 사이트 번호 **/
    public static final String SITE_NO = "1";
    /** 몰번호 **/
    public static final String DPML_NO = "1";
    /** 브랜드코드 **/
    public static final String BRND_CD = "3000";
    /** 매장코드 **/
    public static final String MCHT_NO = "3000";
    /** 참여사코드 **/
    public static final String PARTNERS_CD = "7030";

    /** 시스템 등록자 **/
    public static final String SYS_REGR_ID = "COMMON";
    /** 페이지 타이틀 키 **/
    public static final String PAGE_TITLE = "PAGETITLE";
    /** 페이지 Description 키 **/
    public static final String PAGE_DESC = "PAGEDESC";
    /** 페이지 image 키 **/
    public static final String PAGE_IMAGE = "PAGEIMAGE";
    /** 채널 정보 키 **/
    public static final String CHL_INFO = "CHL_INFO";
    public static final String CHL_DTL_INFO = "CHL_DTL_INFO";

    /** 로그인 매체 코드 **/
    //PC
    public static final String LOGIN_MDM_CD_PC = "10";
    //MO WEB
    public static final String LOGIN_MDM_CD_MO_WEB = "11";
    //MO APP
    public static final String LOGIN_MDM_CD_MO_APP = "12";
    //CJONE APP에서 스마트영수증으로 인입된 경우
    public static final String LOGIN_MDM_CD_CJ_SMART_RECIPT = "13";

    /** 카테고리 구분 코드 **/
    // 일반 전시카테고리
    public static final String CAT_TP_CD_COMMON = "001";
    // 기획전 전시카테고리
    public static final String CAT_TP_CD_PLAN = "002";
    // 가상 전시카테고리
    public static final String CAT_TP_CD_VIRTUAL = "004";

    /** 코너 맵 구성 키 **/
    // 키 - 코너 번호
    public static final String KEY_CONR_NO = "conrNo";
    // 키 - 코너 명
    public static final String KEY_CONR_NM = "conrNm";
    // 키 - 코너 리스트
    public static final String KEY_CONR_LIST = "conrList";
    // 키 - 세트 사용 여부
    public static final String KEY_SET_USE_YN = "setUseYn";
    // 키 - 코너 컨텐츠 정보
    public static final String KEY_CONTS_INFO = "contsInfo";
    // 키 - 코너 전시 여부 - [3409501] 브랜드관 개발 요청(CHY)
    public static final String KEY_DISP_YN = "dispYn";
    // 키 - 코너 전시 순서 - [3409501] 브랜드관 개발 요청(CHY)
    public static final String KEY_DISP_SEQ = "dispSeq";

    /** 코너 타겟 유형 코드 키 **/
    // 이미지
    public static final String KEY_CONR_TGT_CD_IMG = "001";
    // 텍스트
    public static final String KEY_CONR_TGT_CD_TXT = "002";
    // html
    public static final String KEY_CONR_TGT_CD_HTML = "003";
    // 상품
    public static final String KEY_CONR_TGT_CD_GOOD = "005";
    // 기획전
    public static final String KEY_CONR_TGT_CD_PLAN = "006";
    // 브랜드
    public static final String KEY_CONR_TGT_CD_BRND = "007";
    // 영상
    public static final String KEY_CONR_TGT_CD_VOD = "008";
    // 카테고리
    public static final String KEY_CONR_TGT_CD_CAT = "009";
    // 배경이미지
    public static final String KEY_CONR_TGT_CD_BIMG = "010";
    // 세트 상품  - [3383769] (메인 페이지 개편) 올알랭 신규 건 (CSH) - 14 or 15
    public static final String KEY_CONR_TGT_CD_SETGOOD = "014";
    // 브랜드
    public static final String KEY_CONR_TGT_CD_NBRND = "011";
    // 리뷰
    public static final String KEY_CONR_TGT_CD_RVW = "012";
    // 타이틀
    public static final String KEY_CONR_TGT_CD_TIT = "013";
    // 아밴트 - [3409501] 브랜드관 개발 요청(CHY)
    public static final String KEY_CONR_TGT_CD_EVENT = "015";
    // HTML(상품)
    public static final String KEY_CONR_TGT_CD_HTML_GOODS = "016";

    // css, js dummy
    public static final String KEY_DUMMY = "dummy";

    /** FO/MO 페이징 처리 상수값 **/
    public static final int TOTAL_COUNT_NO_DATA = 0;

    public static final int DEFAULT_BLOCK_COUNT = 10;
    public static final int BLOCK_COUNT_5 = 5;

    public static final int DEFAULT_PAGE_INDEX = 1;
    public static final int ROWS_PER_PAGE_2 = 2;
    public static final int ROWS_PER_PAGE_3 = 3;
    public static final int ROWS_PER_PAGE_4 = 4;
    public static final int ROWS_PER_PAGE_5 = 5;
    public static final int ROWS_PER_PAGE_6 = 6;//## 리뷰 고도화 1차 ## 추가
    public static final int ROWS_PER_PAGE_8 = 8;
    public static final int ROWS_PER_PAGE_10 = 10;
    public static final int ROWS_PER_PAGE_12 = 12;
    public static final int ROWS_PER_PAGE_20 = 20;
    public static final int ROWS_PER_PAGE_24 = 24;
    public static final int ROWS_PER_PAGE_30 = 30;
    public static final int ROWS_PER_PAGE_32 = 32;
    public static final int ROWS_PER_PAGE_36 = 36;
    public static final int ROWS_PER_PAGE_40 = 40;
    public static final int ROWS_PER_PAGE_48 = 48;
    public static final int ROWS_PER_PAGE_50 = 50;
    public static final int ROWS_PER_PAGE_52 = 52;
    public static final int ROWS_PER_PAGE_60 = 60;
    public static final int ROWS_PER_PAGE_70 = 70;
    public static final int ROWS_PER_PAGE_72 = 72;
    public static final int ROWS_PER_PAGE_100 = 100;
    public static final int ROWS_PER_PAGE_300 = 300;
    public static final int ROWS_PER_PAGE_ALL = 999;

    /** FO기간 조회 **/
    public static final String DEFAULT_SEARCH_MONTH = "-1";

    /** DB VALUE **/
    public static final String DB_V_Y = "Y";
    public static final String DB_V_N = "N";
    public static final String DB_V_ALL = "ALL";
    public static final int DB_V_MINUS_1 = -1;

    /** FAQ **/
    // TOP10 코드
    public static final String FAQ_lRCL_CD_TOP10 = "99";
    public static final String FAQ_lRCL_CD_ONLINE = "200";

    /** EMPTY */
    public static final String V_EMPTY = "";

    /** 전시구분코드 **/
    public static final String DISP_SCT_CD_FO = "01";
    public static final String DISP_SCT_CD_MO = "02";
    public static final String DISP_SCT_CD_ALL = "03";

    /** 공지 사항 **/
    public static final String NTC_SCT_CD_RE = "01";
    public static final String NTC_SCT_CD_ST = "02";
    public static final String NTC_SCT_CD_EV = "03";
    public static final String NTC_SCT_CD_BT = "04";

    /** 상품평구분코드 **/
    public static final String GDAS_SCT_CD_GDAS = "10";
    public static final String GDAS_SCT_CD_QNA = "20";
    public static final String GDAS_SCT_CD_BTT = "30";
    public static final String GDAS_SCT_CD_GDAS_GIFT = "70";
    
    public static final String GDAS_SHRT_CONT_POINT = "10";
    public static final String GDAS_CONT_POINT = "100";
    public static final String GDAS_PHOTO_POINT = "30";
    public static final String GDAS_SCR_VAL_POINT = "5";
    public static final String GDAS_EVAL_POINT = "5";
    public static final String OFFLINE_GOODS_NO = "A000000000000";
    
    /** 2019.11.18 오프라인리뷰관련 추가 **/
    public static final String START_OFFLINE_ORD_DATE = "20190927";
 // 프로모션 1+1, 2+1 코드 (수량행사에대한코드들)  // R51 => 증정 ( 이외는 세일 프로모션 ) = 판초오퍼구분코드 CD0662
    public static final String[] PROM_OFFR_SP_CDS_FOR_QTY = {"R01","R02","R03","R04","R05","R06","R07","R08","R09","R10","R52","R53","R54","R55","R56","R57","R58","R59","R60","R61", "R51"};	
    /////////////////////////////////////////////////\    
    
    /** 오프라인 리뷰 API 호출 제어 코드 [PRD900] **/
    public static final String CALL_REVIEW_POSSIBLE_CHECK_PC_CD = "100";                       // [PC] 주문/배송/취소/반품 리스트
    public static final String CALL_STORE_ORDER_API_POSSIBLE_PC_CD = "101";  // [PC] 주문/배송/취소/반품/리뷰 리스트
    public static final String CALL_REVIEW_POSSIBLE_CHECK_MC_CD = "200";      //[MC] 알림배너/리뷰작성카운트
    public static final String CALL_STORE_ORDER_API_POSSIBLE_MC_CD = "201";                      //[MC] 주문/배송/취소/반품/리뷰 리스트
    public static final String CALL_EVENT_AVAIL_PC_CD = "301";   //[PC] 이벤트 사용 유무
    public static final String CALL_EVENT_AVAIL_MC_CD = "302";   //[MC] 이벤트 사용 유무

    /** 회원 상태코드 [MEM005] **/
    // 정상
    public static final String MBR_STS_CD_NORMAL = "10";
    // 탈퇴신청
    public static final String MBR_STS_CD_DROP_REQ = "11";
    // 탈퇴영구
    public static final String MBR_STS_CD_DROP = "12";
    // 잠금
    public static final String MBR_STS_CD_LOCK = "15";
    // 휴면
    public static final String MBR_STS_CD_REST = "16";
    // 약관철회
    public static final String MBR_STS_CD_SVC_CANCEL = "21";

    /**  약관동의유형코드[MEM037] **/
    public static final String SVC_AGR_TP_CD_10 = "10";
    public static final String SVC_AGR_TP_CD_20 = "20";
    //개인정보3자동의 마케팅관련약관
    public static final String SVC_AGR_TP_CD_30 = "30";
    // 서비스이벤트 정보 수신 동의(선택)
    public static final String SVC_AGR_TP_CD_40 = "40";
    // 개인화 맞춤형 큐레이션 서비스 이용 동의(선택)
    public static final String SVC_AGR_TP_CD_50 = "50";

    /** 회원 정보 변경 이력 코드 [MEM035] **/
    // 회원가입
    public static final String MBR_INFO_CHG_HIST_JOIN = "00";
    // 회원정보변경
    public static final String MBR_INFO_CHG_HIST_CHG = "01";
    // 비밀번호변경
    public static final String MBR_INFO_CHG_HIST_PW = "02";
    // 임시비밀번호발급
    public static final String MBR_INFO_CHG_HIST_TMP_PW = "03";
    // 회원등급변경
    public static final String MBR_INFO_CHG_HIST_GRADE = "04";
    // 약관철회
    public static final String MBR_INFO_CHG_HIST_SVC_CANCEL = "05";
    // 회원탈퇴신청
    public static final String MBR_INFO_CHG_HIST_DROP_REQ = "06";
    // 회원탈퇴
    public static final String MBR_INFO_CHG_HIST_DROP = "07";
    // 회원정보변경(updatePerson?)
    public static final String MBR_INFO_CHG_HIST_UDT_PSN = "08";
    // 휴면설정
    public static final String MBR_INFO_CHG_HIST_REST_Y = "09";
    // 휴면해제
    public static final String MBR_INFO_CHG_HIST_REST_N = "10";
    // 회원재가입
    public static final String MBR_INFO_CHG_HIST_RE_JOIN = "11";
    // 회원탈퇴신청복구
    public static final String MBR_INFO_CHG_HIST_DROP_RESTORE = "12";
    // 회원환불계좌인증 등록/수정
    public static final String MBR_INFO_CHG_HIST_RFD_ACTN_REG = "14";
    // 회원환불계좌인증 삭제
    public static final String MBR_INFO_CHG_HIST_RFD_ACTN_DEL = "15";
    
    /** 회원 비밀번호 구분 코드 **/
    //정상비밀번호 구분코드
    public static final String MBR_PWD_TYP_10 = "10";
    //비밀번호초기화 및 임시비밀번호 구분코드
    public static final String MBR_PWD_TYP_20 = "20";


    /** 이벤트 **/
    // 구매자 이벤트
    public static final String EVT_CLSS_CD_BUY = "10";
    // 영수증 이벤트
    public static final String EVT_CLSS_CD_BL = "30";
    // 응모(참여) 이벤트
    public static final String EVT_CLSS_CD_JI = "40";
    // 댓글 이벤트
    public static final String EVT_CLSS_CD_CM = "60";
    // 일반 이벤트
    public static final String EVT_CLSS_CD_RE = "70";
    // 뷰티 테스터
    public static final String EVT_CLSS_CD_BT = "90";
    // 구매 회원 이벤트
    public static final String EVT_LST_BUY = "10";
    // 모든 회원 이벤트
    public static final String EVT_LST_ALL = "20";
    // 뷰티 테스터
    public static final String EVT_LST_BT = "90";
    // 올영 체험단
    public static final String EVT_LST_OY = "100";
    // 응모수제한코드(1일 1회)
    public static final String EVT_LMT_DAY_ONE = "10";
    // 응모수제한코드(행사기간 1회)
    public static final String EVT_LMT_TERM_ONE = "20";
    // 응모수제한코드(제한없음)
    public static final String EVT_LMT_NO = "30";
    // 응모수제한코드(기타)
    public static final String EVT_LMT_ETC = "99";
    // 구매자이벤트 구매금액 제한
    public static final String EVT_BUY_LMT_AMOUNT = "10";
    // 구매자이벤트 구매횟수 제한
    public static final String EVT_BUY_LMT_COUNT = "20";
    // 전체 댓글
    public static final String EVT_CMT_ALL = "10";
    // 내 댓글
    public static final String EVT_CMT_MY = "20";

    /** 장바구니, 주문 (10:Call, 20:Web, 30:제휴, 40:모바일, 50:마트온, 99:대량) **/
    public static final String ORD_MDMCD_CALL = "10";
    public static final String ORD_MDMCD_WEB = "20";
    public static final String ORD_MDMCD_PAT = "30";
    public static final String ORD_MDMCD_MOB = "40";
    public static final String ORD_MDMCD_MRT = "50";
    public static final String ORD_MDMCD_MUL = "99";

    /**
     * 상품 목록 유형([모바일] M10: 1x1, M20: 1x2, [PC웹] P10: 1x3, P20: 1x4, P30: 상품평)
     **/
    public static final String GOODS_LST_TP_M1X1 = "M10";
    public static final String GOODS_LST_TP_M1X2 = "M20";
    public static final String GOODS_LST_TP_P1X3 = "P10";
    public static final String GOODS_LST_TP_P1X4 = "P20";
    public static final String GOODS_LST_TP_PCOMMENT = "P30";
    /** 결과 코드 **/
    /** 성공 **/
    public static final String R_CD_SUCCESS = "000";
    /** 실패 **/
    public static final String R_CD_FAIL = "999";
    /** 로그인 실패 **/
    public static final String R_CD_FAIL_LOGIN = "100";
    /** 성인인증 필요 **/
    public static final String R_CD_FAIL_ADULT = "200";

    /** 상품평 결과 코드 **/
    public static final String R_CD_FAIL_GDAS_PARAM = "500";
    public static final String R_CD_FAIL_BEAUTY_PARAM = "501";
    public static final String R_CD_FAIL_BAD_WORD = "510";
    public static final String R_CD_FAIL_CATEGORY_BAD_WORD = "5107";
    public static final String R_CD_FAIL_DUPLICATE_BAD_WORD = "5108";

    // 이미 상품평이 등록되었습니다.
    public static final String R_CD_FAIL_GDAS_EXIST = "540";
    public static final String R_CD_FAIL_BEAUTY_EXIST = "511";

    // 작성 가능한 리뷰가 아닙니다.
    public static final String R_CD_FAIL_GDAS_ORD = "520";
    // 하루에 10개의 상품만 상품평 등록이 가능합니다.
    public static final String R_CD_FAIL_GDAS_OVER_CNT = "530";
    // 포인트 지급 전 3일 까지 수정가능합니다.
    public static final String R_CD_FAIL_GDAS_MOD = "550";

    /** 재입고 알림 결과 코드 **/

    // 재입고 알림은 최대10개 까지 가능합니다.
    public static final String R_CD_FAIL_STOCK_ALERT_10_OVER = "600";
    // 해당 상품은 이미 재입고알림 신청되었습니다.
    public static final String R_CD_FAIL_STOCK_ALERT_EXIST = "601";
    // 재입고 알림에 실패하였습니다.
    public static final String R_CD_FAIL_STOCK_ALERT = "602";

    /** 찜 개수 초과 **/
    public static final String R_CD_FAIL_WISH_OVER_CNT = "500";
    // 찜 이미 등록
    public static final String R_CD_FAIL_WISH_ARD_REG = "600";

    /** COOKIE **/
    public static final String COOKIE_JSESSION_ID = "JSESSIONID";
    public static final String COOKIE_CUST_INFO = "custInfo";
    public static final String COOKIE_CUST_YN = "custYn";
    public static final String COOKIE_QUICK_ADDR_YN = "quickAddrYn";
    
    // LIVE COMMERCE 라이브커머스
    public static final String COOKIE_LIVE_COMMERCE = "liveCommerce";
    
    //웹로그 사용자 아이디
    public static final String COOKIE_WL_ID = "wl_id";
    //웹로그 채널번호 쿠키
    public static final String COOKIE_WL_CHL_ID = "wl_chlId";
    //웹로그 채널번호 쿠키
    public static final String COOKIE_WL_CHL_NO = "wl_chlNo";
    //웹로그 채널번호 쿠키
    public static final String COOKIE_WL_CHL_DTL_NO = "wl_chlDtlNo";

    /** 밸리데이터용 message properties **/
    public static final String UPR_DISP_CAT_NO_EMP_ERROR = "uprDispCatNo";
    public static final String ONL_BRND_CD_EMPTY_ERROR = "onlBrndCd";
    /** 전시 출력 **/
    public static final String GET_SET_CONR_CONTS_INFO_PAGING = "getSetConrContsInfoPaging";

    /** 유입경로( 상품상세 화면에서 프로모션, 쿠폰 조회시 필요 ) **/
    public static final String INFO_PATH_GOODS_DETAIL = "goodsdetail";

    /** 단말 연동 **/
    // http json body
    public static final String API_REQUEST_EX = "requestEx";
    public static final String API_REQUEST_TIME = "requestTime";
    public static final String API_REQUEST_UPDATE = "update";
    public static final String API_REQUEST_SELECT = "select";
    // 로그인여부
    public static final String API_LOGIN_YN = "loginYn";
    // 로그인아이디
    public static final String API_LOGIN_ID = "loginId";
    // 서버에서 발행한 Device ID
    public static final String API_DEVICE_ID = "deviceId";
    // 푸시전송 여부(Y:동의, N:미동의)
    public static final String API_PUSH_MSG_RCV_YN = "pushMsgRcvYn";
    // SMS 수신동의여부
    public static final String API_SMS_RCV_AGR_YN = "smsRcvAgrYn";
    // 서비스·이벤트수신동의여부 
    public static final String API_SVC_EVT_RCV_AGR_YN = "svcEvtRcvAgrInfo";
    // 서비스·이벤트수신동의여부 
    public static final String API_SVC_EVT_ENTR_POP_URL = "apiSvcEvtEntrPopUrl";
    // 수신정보변경메시지(SMS/PUSH) 
    public static final String API_RCV_INFO_CHG_MSG = "rcvInfoChgMsg";
    // 자동로그인여부
    public static final String API_AUTO_LOGIN_AGR_YN = "autoLoginAgrYn";
    // 관심매장 공지알림 여부
    public static final String API_STR_NTC_RCV_AGR_YN = "strNtcRcvAgrYn";
    // 관심상품할인 수신동의여부
    public static final String API_GOODS_EVENT_RCV_AGR_YN = "goodsDscntRcvAgrYn";
    // 최신 App 버전
    public static final String API_APP_VER = "appVer";
    // 업데이트 구분(F:강제, S:선택, N:없음)
    public static final String API_APP_UPDATE_CD = "appUpdateCd";
    // 앱 업데이트 마켓 URL
    public static final String API_APP_UPDATE_MARKET_URL = "appUpdateMarketUrl";
    // 공지사항 URI
    public static final String API_NOTICE_URL = "ntcUrl";
    // 공지사항 URI
    public static final String API_NOTICE_SCT_CD = "ntcSctCd";
    // 스플레쉬 목록
    public static final String API_SPLASH_LIST = "splashList";
    // 스플레쉬 목록
    public static final String API_SPLASH_IMG_URL = "imgUrl";
    // 스플레쉬 게시 시작 일시
    public static final String API_SPLASH_STRT_DTIME = "strtDtime";
    // 스플레쉬 게시 종료 일시
    public static final String API_SPLASH_END_DTIME = "endDtime";
    //터치 아이디 로그인 사용
    public static final String API_TOUCH_ID_LOGIN_YN = "touchIdLoginYn";
    //바이오로그인사용여부
    public static final String API_BIOMETRICS_USE_YN = "biometricsUseYn";
    // 웹 캐쉬 삭제일
    public static final String API_DEL_CACHE_DT = "delCacheDt";
    // setPushId.do 중단 여부
    public static final String API_SET_PUSH_ID_STOP_YN = "setPushIdStopYn";


    // 숏텃 목록
    public static final String API_SHORTCUT_LIST = "shortCutList";
    // 숏텃 URL
    public static final String API_SHORTCUT_URL = "shortCutUrl";
    

    /** UserAgent 관련 파라미터 상수 **/
    public static final String USER_AGENT = "User-Agent";
    public static final String APP_VER = "appVer";
    public static final String APP_SCT_KEY = "appSctKey";
    public static final String APP_MARKET_CD = "appMarketCd";
    public static final String OS_TYPE = "osType";
    public static final String OS_VER = "osVer";
    public static final String DEVICE_MODEL = "deviceModel";
    public static final String DEVICE_ID = "deviceId";
    public static final String MODE = "mode";
    public static final String INFW_PATH = "infwPath";
    public static final String MBR_NO = "mbrNo";
    public static final String MBR_ID = "mbrId";
    public static final String APP_KEY = "appKey";
    public static final String MAC_ADDR = "macAddr";
    public static final String DEVICE_SEQ = "deviceSeq";
    public static final String PUSH_ID = "pushId";
    public static final String SCT_CD = "sctCd";
    public static final String DEFAULT_AUTO_LOGIN_EXP_DTIME = "29991231235959"; // yyyyMMddhhmmss
    public static final String DEFAULT_INFW_PATH = "000";
    public static final String OS_TYPE_I = "10";
    public static final String OS_TYPE_A = "20";
    public static final String CUST_INFO = "custInfo";
    

    /** 캐시 키 값 **/
    // 공통 부분 캐시
    public static final String CACHE_COMMON = "commonCache";

    /** HTTPS **/
    public static final String PROTOCOL_HTTPS = "https";

    /** 카페테리아 **/
    public static final String IF_CAFETERIA_COMP_CD = "E10";

    /** 재고보유 **/
    public static final String INV_CD_EXIST = "01";
    /** 품절 **/
    public static final String INV_CD_SOLDOUT = "02";
    /** 미입고 **/
    public static final String INV_CD_NOTIN = "03";

    /** 마이페이지 헤더 세션 **/
    public static final String MY_HEADER_INFO_SESS_NM = "myHeaderInfo";

    /** CJPAY 계좌주 성명 조회 연동 성공 코드 **/
    public static final String CJPAY_RES_R_CD_SUCCESS = "0000";

    /** 이미지 사이즈 **/
    public static final String GOODS_IMG_550 = "550";
    public static final String GOODS_IMG_400 = "400";
    public static final String GOODS_IMG_320 = "320";
    public static final String GOODS_IMG_220 = "220";
    public static final String GOODS_IMG_215 = "215";
    public static final String GOODS_IMG_175 = "175";
    public static final String GOODS_IMG_150 = "150";
    public static final String GOODS_IMG_140 = "140";
    public static final String GOODS_IMG_85 = "85";

    /** 택배 배송 정보 연동 CUST ID **/
    public static final String IF_TRACKING_CUST_ID = "30232182";

    /** 주문 구분 코드 **/
    public static final String ORD_SCT_CD_ORDER = "order";
    public static final String ORD_SCT_CD_CANCEL = "cancel";

    /** 결제 구분 코드 **/
    public static final String PAY_SCT_CD_PAY = "10";
    public static final String PAY_SCT_CD_REFUND = "20";

    /** 클레임 사유 코드 : CCT006 **/
    public static final String CLM_CAUS_CD_CANCEL = "200";
    public static final String CLM_CAUS_CD_RETURN = "300";
    public static final String CLM_CAUS_CD_CHANGE = "400";

    /** 변경접수구분코드 : ORD003 **/
    public static final String CHG_ACCP_SCT_CD_CANCEL = "20";
    public static final String CHG_ACCP_SCT_CD_RETURN = "30";
    public static final String CHG_ACCP_SCT_CD_CHANGE = "40";

    /** 주소 구분 코드 10:배송지, 20:회수지 **/
    public static final String ADDR_SCT_CD_10 = "10";
    public static final String ADDR_SCT_CD_20 = "20";

    /** 상담등록코드 : CCT009 **/
    public static final String CNSL_REG_CD_10 = "10";
    public static final String CNSL_REG_CD_11 = "11"; // 교환반품 접수 자동화 코드추가(취교반 처리) choi.j.h 2019.09.02
    public static final String CNSL_REG_CD_12 = "12"; // 교환반품 접수 자동화 코드추가(취교반 신청 자동접수) choi.j.h 2019.09.02
    public static final String CNSL_REG_CD_20 = "20";
    public static final String CNSL_REG_CD_21 = "21";

    public static final String SYS_REGR_ID_PC = "PC";
    public static final String SYS_REGR_ID_MOBILE = "MOBILE";

    public static final String SP_CS_CNSL_BASE_REGIST_SUCCESS = "0";

    /** 검색API **/
    public static final String SEARCHAPI_COLLNAME_BRAND_GROUP = "BRAND_GROUP";
    public static final String SEARCHAPI_COLLNAME_OLIVE_GOODS = "OLIVE_GOODS";
    public static final String SEARCHAPI_COLLNAME_OLIVE_HOTDEAL = "OLIVE_HOTDEAL";
    public static final String SEARCHAPI_COLLNAME_OLIVE_HOTDEAL_CATE = "OLIVE_HOTDEAL_CATE";
    public static final String SEARCHAPI_COLLNAME_OLIVE_BRAND = "OLIVE_BRAND";
    public static final String SEARCHAPI_COLLNAME_OLIVE_BEST = "OLIVE_BEST";
    public static final String SEARCHAPI_COLLNAME_OLIVE_COMMENTS = "OLIVE_COMMENTS";
    public static final String SEARCHAPI_COLLNAME_OLIVE_BEST_COMMENTS = "OLIVE_BEST_COMMENTS";
    public static final String SEARCHAPI_GOODS_SORT_RANK = "01";
    public static final String SEARCHAPI_GOODS_SORT_DATE = "02";
    public static final String SEARCHAPI_GOODS_SORT_SALE_QTY = "03";
    public static final String SEARCHAPI_GOODS_SORT_GDAS_TOT_CNT = "04";
    public static final String SEARCHAPI_GOODS_SORT_ONE_SALE_PRC_ASC = "05";
    public static final String SEARCHAPI_GOODS_SORT_ONE_SALE_PRC_DESC = "06";
    public static final String SEARCHAPI_HOTDEAL_SORT_DISP_SEQ_ASC = "07";

    /** PUSH 발송대상구분 코드[PSH012] **/
    public static final String PUSH_SND_SCT_CD_BAT = "10";
    public static final String PUSH_SND_SCT_CD_INDIV = "20";

    /** PUSH 링크 프로토콜 코드[PSH005] **/
    public static final String PUSH_LNK_PRTCL_CD_GOODS = "10";
    public static final String PUSH_LNK_PRTCL_CD_COUNSEL = "20";
    public static final String PUSH_LNK_PRTCL_CD_MAIN = "30";
    public static final String PUSH_LNK_PRTCL_CD_CUSTOM = "90";

    /** 상품 기술서 구분코드  **/
    public static final String GOODS_DETAIL_HTML = "10";
    public static final String GOODS_DETAIL_IMG = "20";

    /** 상품상세 코너(19) 조회시 전체(ALL) 변수 **/
    public static final String GOODS_DETAIL_DISP_CONR_ALL = "ALL";

    /** 상품상세 코너(19) 조회시 전시 순번 변수 **/
    public static final String DISP_CONR_DISP_SEQ_ALL = "1";
    public static final String DISP_CONR_DISP_SEQ_TRADE = "2";
    public static final String DISP_CONR_DISP_SEQ_STDCAT = "3";
    public static final String DISP_CONR_DISP_SEQ_DISPCAT = "4";
    public static final String DISP_CONR_DISP_SEQ_ENTR = "5";
    public static final String DISP_CONR_DISP_SEQ_BRND = "6";
    public static final String DISP_CONR_DISP_SEQ_GOODS = "7";
    public static final String DISP_CONR_DISP_SEQ_DERMO = "8";

    /** 제주도 우편번호 구분값 */
    public static final String POST_NO_SCT_CD_JEJU = "63";


    /** 오픈 이벤트 **/
    // APP PUSH동의 이벤트
    public static final String EVT_CLSS_CD_PUSH = "01";
    // 스템프응모이벤트
    public static final String EVT_CLSS_CD_WISH = "02";
    // 매일출석이벤트
    public static final String EVT_CLSS_CD_EVERYDAY = "03";
    // 출석왕이벤트
    public static final String EVT_CLSS_CD_EVERY_KING = "04";
    // 구매이벤트
    public static final String EVT_CLSS_CD_JAJU = "05";
    // 리뷰 개인정보 수집 동의
    public static final String EVT_CLSS_CD_REVIEW = "06";

    /** EP 랜딩 TYPE **/ 
    //  메인
    public static final String EP_LANDING_MAIN = "main";
    //  상품상세
    public static final String EP_LANDING_GOODS = "goods";
    //  일반 카테고리
    public static final String EP_LANDING_CATEGORY = "category";
    //  기획전
    public static final String EP_LANDING_PLANSHOP = "planshop";
    //  이벤트
    public static final String EP_LANDING_EVENT = "event";
    //  뷰티테스터
    public static final String EP_LANDING_BEAUTY = "beauty";
    //  온니원
    public static final String EP_LANDING_ONLYONE = "onlyone";
    //  신상
    public static final String EP_LANDING_NEW = "new";
    //  세일
    public static final String EP_LANDING_SALE = "sale";
    //  베스트
    public static final String EP_LANDING_BEST = "best";
    //  오특
    public static final String EP_LANDING_TODAY = "today";
    //  쿠폰존
    public static final String EP_LANDING_COUPON = "coupon";
    //  검색페이지
    public static final String EP_LANDING_SEARCH = "search";
    //  브랜드리스트
    public static final String EP_LANDING_BRAND_LIST = "brandList";
    //  브랜드상세
    public static final String EP_LANDING_BRAND_DETAIL = "brandDetail";
    //  트렌드
    public static final String EP_LANDING_THEME_LIST = "themeList";
    //  기획전리스트
    public static final String EP_LANDING_PLANSHOP_LIST = "planshopList";
    //  이벤트리스트
    public static final String EP_LANDING_EVENT_LIST = "eventList";
    //  전문관. SR.3142554
    public static final String EP_LANDING_SPCSHOP = "spcshop";
    //  프리미엄관 카테고리 상품리스트. SR.3142554
    public static final String EP_LANDING_LUXURY_GOODS_LIST = "luxuryGoodsList";
    //  오늘드림 메인 상품리스트 SR.3334332
    public static final String EP_LANDING_O2O_QUICK_LIST = "o2oquicklist";
    //  기프트관 메인 상품리스트 SR.3334332
    public static final String EP_LANDING_GIFT_LIST = "giftlist";
    // 어워즈 메인 SR.3442950
    public static final String EP_LANDING_AWARDS_MAIN = "awardsMain";
    // 어워즈 수상관
    public static final String EP_LANDING_AWARDS_LIST = "awardsList";
    // 어워즈 수상관 히스토리
    public static final String EP_LANDING_AWARDS_HISTORY = "awardsHistory";
    // 어워즈 수상관 소개
    public static final String EP_LANDING_AWARDS_STORY = "awardsStory";
    // 어워즈 수상관 소개
    public static final String EP_LANDING_MEMBER_SHIP = "memberShip";
    
    
    /** 접속 가능 IP 공통 코드 번호 **/
    public static final String CODE_MNG_002 = "MNG002";
    
    // 관심매장쿠폰등록코드 [EVT103]
    public static final String CODE_STORE_COUPON   = "EVT103";
    
 // 관심매장쿠폰등록코드 [EVT109]
    public static final String CODE_STORE_EVENT   = "EVT109";
    
    // SNS 공유 공통 코드
    public static final String CODE_SNS_SHARE   = "EVT104";
    public static final String CODE_SNS_SHARE_10   = "10";
    
    // 기획전 SNS 공유 공통 코드
    public static final String CODE_SNS_PLAN   = "EVT105";
    
    // CSS, JS DUMMY 공통 코드
    public static final String CODE_DUMMY           = "COM115";
    public static final String CODE_DUMMY_10    = "10";
    
    // 20180110 댕댕이스탬프이벤트 스탬프노출 전시 카테고리번호 
    public static final String CODE_LUCKEY_EVENT   = "EVT106";
    public static final String CODE_LUCKEY_EVENT_DOG   = "10";
    public static final String CODE_LUCKEY_EVENT_CAT   = "20";
    public static final String CODE_LUCKEY_EVENT_PET   = "30";
   
    //2018.3월 올롸잇 위크 프로모션 스탬프이벤트
    public static final String CODE_STAMP_EVENT   = "EVT107";
    
    //2018.6월 브랜드세일 스탬프이벤트
    public static final String CODE_STAMP_BRANDSALE   = "EVT108";
    
    /**
     * 관심매장 등록 후 쿠폰 발급 결과 코드
     * 10 : 관심매장 등록 쿠폰 목록이 존재하지않음. (default)
     * 20 : 관심매장 등록 쿠폰 목록 중 한개라도 이미 발급받음.
     * 30 : 관심매장 등록 쿠폰 목록이 존재하나, 발급 실패.
     * 40 : 관심매장 등록 쿠폰 목록 중 한개라도 현재 발급받음.
     */
    public static final String ISSU_TYPE_10 = "10";
    public static final String ISSU_TYPE_20 = "20";
    public static final String ISSU_TYPE_30 = "30";
    public static final String ISSU_TYPE_40 = "40";


    /**
     * 난수쿠폰 생성
     * 10 : 해당 사용자가 이미 난수쿠폰 생성함(1회만 가능)
     * 20 : 난수쿠폰이 더 이상 존재하지 않음
     * 30 : 난수쿠폰이 존재하지 않거나, 동시 접근 시 발생
     */
    public static final String CPN_ERR_10 = "CPN_ERR_10";
    public static final String CPN_ERR_20 = "CPN_ERR_20";
    public static final String CPN_ERR_30 = "CPN_ERR_30";
    
    /**
     * 확률 분모
     */
    public static final double DENOMINATOR = 10000.0D;

    public static final String CODE_MEM_041 = "MEM041";
    
    //KIOSK 무료배송 쿠폰  QA : C000000006074
//    public static final String CODE_KIOSK_COUPON = "C000000006074";
    //KIOSK 무료배송 쿠폰 운영 : C000000010027
    public static final String CODE_KIOSK_COUPON = "C000000010027";
    
    public static final String CODE_MEMBERSHIP_CALCULATE   = "MBS001";

    public static final String CODE_MEMBERSHIP_MBR_DISP   = "MBS002";
    
    /** 기타 **/
    // web cache ston
    public static final String STON_USE_YN_PARAM = "stonUseYn";
    
    /**
     * 영상제공사이트 코드
     */
    public static final String CODE_VOD_SUP_SITE = "DSP054";
    
    /**
     * 기프트카드 검색어
     */
    public static final String CODE_GIFT_CARD_SEARCH_CODE   = "GIF006";
    
    //  브랜드 코너 번호 
    public static final int BRND_CONR_NO = 18;
    // 브랜드관 새로운 코너 번호 - [3448771] 온라인몰 마이페이지>좋아요>브랜드 목록 배너 노출 수정(CHY)
    public static final int BRND_NEW_CONR_NO = 263;

    //  local 환경 nginx 여부
    public static final String IS_NGINX = System.setProperty("isNginx","N");

    // 상품평 필터 코드
    public static final String GDAS_SKIN_TYPE		= "MEM043";		// 피부타입
    public static final String GDAS_SKIN_TONE		= "MEM044";		// 피부톤
    public static final String GDAS_SKIN_TROUBLE	= "MEM045";		// 피부고민
    public static final String GDAS_GEN_SCT		 	= "PRD094";		// 성별
    public static final String GDAS_AGE 			= "PRD093";		// 연령대

    /**
     * GNB 개편 - 오특
     */
    public static final String TODAY_DEAL_SEARCH_DATE_PATTERN = "yyyyMMdd";
    public static final int TODAY_DEAL_GENERAL_ROWS_PER_PAGE = 10;
    public static final String TODAY_DEAL_GENERAL_SORT = "rank";
    public static final Long TODAY_DEAL_GENERAL_START_DISP_SEQ = 4L;


    /**
     *
     * constructor
     */
    private StoreConsts() {

    }
}
