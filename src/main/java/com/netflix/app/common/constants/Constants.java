package com.netflix.app.common.constants;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 프로그램 코드용 상수 클래스
 * @author User
 *
 */
public class Constants {
	
    public static final String sMobileTextLogo = "AlexStudio";
    public static final String sProgramTitle = "";
    public static final String loginUrl = "";    
    public static final String topRightMenuUrl = "/m/menum.asp";
    public static final String topRightMenu = "";
    public static final String P62LIFECOM = "http://www.62life.com";
    public static final String M62LIFECOM = "http://m.62life.com";
	public static final String bodyBackgroundColor = "#ecf0f1";
	
	
    public static final String DEFAULT_SYSTEM_LANGUAGE = "defaultSystemLanguage";
    public static final String DEFAULT_COUNTRY_CD = "defaultCntryCd";
    public static final String DEFAULT_LOGGER_CATEGORY = "default.cat";
    public static final String LOGGER_PUSH_SEND_JOB = "pushSendJob";
    public static final String LOGGER_CUSTOMER_INFO = "customer.info";
    public static final String CHARSET_ISO_8859_1 = "ISO-8859-1";
    public static final String DEFAULT_CHARSET = "UTF-8";
    public static final String DEFAULT_EUC_KR = "EUC-KR";
    public static final String DEFAULT_CONTENTTYPE = "application/x-www-form-urlencoded";
    public static final String CONTENTTYPE_JSON = "application/json";
    public static final String CONTENTTYPE_XML = "application/xml";
    public static final String NEW_LINE = "\n";
    public static final String COMMA = ",";
    public static final String PERIOD = ".";
    public static final String HYPHEN = "-";
    public static final String EMPTY = "";
    public static final String SPACE = " ";
    public static final String SLASH = "/";
    public static final String ASTERISK = "*";
    public static final String PIPE = "|";
    public static final String ZERO = "0";
    public static final String CHECK_YES = "1";
    public static final String CHECK_NO = "0";
    public static final String CHECK_FALSE = "-1";
    public static final String BOOLEAN_TRUE = "T";
    public static final String BOOLEAN_FALSE = "F";
    public static final String DOUBLE_BACK_SLASH = "\\";
    public static final String DOUBLE_COLON = "::";

    public static final String COOKIE_JSESSION_ID = "JSESSIONID";
    public static final String SAMESITE_VALUE = "None";

    //ABCDE....
    public static final String A = "A";
    public static final String B = "B";
    public static final String C = "C";
    public static final String D = "D";
    public static final String N = "N";
    public static final String P = "P";
    public static final String T = "T";
    public static final String Y = "Y";

    //int num
    public static final int INT_0 = 0;
    public static final int INT_126 = 126;

    //String num
    public static final String STR_0 = "0";
    public static final String STR_1 = "1";
    public static final String STR_2 = "2";
    public static final String STR_3 = "3";
    public static final String STR_05 = "05";
    public static final String STR_10 = "10";
    public static final String STR_11 = "11";
    public static final String STR_13 = "13";
    public static final String STR_20 = "20";
    public static final String STR_24 = "24";
    public static final String STR_30 = "30";
    public static final String STR_50 = "50";
    public static final String STR_60 = "60";

    public static final String IF_RESULT_CODE = "returnCd";
    public static final String IF_RESULT_MSG = "errorMsg";
    public static final String IF_RESULT_CNT = "resultCnt";

    //for redirect.jsp
    public static final String JSP_FOR_REDIRECT = "common/redirect";
    public static final String REDIRECT_URL = "redirectUrl";
    public static final String SHOW_MESSAGE = "showMessage";

    //for JSP Page Type
    public static final String JSP_PAGE_LIST = "list";
    public static final String JSP_PAGE_FORM = "form";
    public static final String JSP_PAGE_VIEW = "view";
    public static final String JSP_MASTER_FORM = "masterForm";

    //for GUEST Group
    public static final int GROUP_GUEST = 3;

    //SITE_NO
    public static final Long SITE_NO_MALL = 1L;

    //Patterns for HTML Elements
    public static final String SELECT_PATTERN = "<select name=\"{0}\" id=\"{0}\">{1}</select>";
    public static final String OPTION_PATTERN = "<option value=\"{0}\" {1}>{2}</option>";
    public static final String RADIO_PATTERN = "<input type=\"radio\" name=\"{0}\" id=\"{0}\" value=\"{1}\" {3}/> {2} &nbsp;";
    public static final String CHECKBOX_PATTERN = "<input type=\"checkbox\" name=\"{0}\" id=\"{0}\" value=\"{1}\" {3}/> {2} &nbsp;";
    // 201912 BO 매장목록 취급카테고리, 제공서비스 체크박스 포맷
    public static final String CHECKBOX_PATTERN2 = "<input type=\"checkbox\" name=\"{0}\" id=\"{0}\" value=\"{1}\" {3} disabled=\"disabled\"/> {2} &nbsp;";

    // 201912 매장검색옵션 버튼 패턴
    public static final String BUTTON_PATTERN = "<li><button>{2}</button><input type=\"hidden\" name=\"{0}\" value=\"{1}\"></li>";

    public static final String JSON_PATTERN = "\"{0}\" : \"{1}\"";

    //common message properties
    public static final String MSG_COMMON_PARAMETER_EMPTY_ERROR = "common.parameter.empty.error";

    //CodeRepository의 기타코드콤보(getSelectEtc2ComboList())에서 사용하는 queryId
    public static final String QRY_DISP_LRG_CAT = "getDispLrgCatList";
    public static final String QRY_AEMP_USER = "getAempUserList";
    public static final String QRY_STD_LRG_CAT = "getStdLrgCatList";
    public static final String QRY_CHANNEL_INFO = "getEtChlBaseList";
    public static final String QRY_ENTR_INFO = "getEntrBaseList";

    //CONR TYPE
    public static final String CONR_TGT_CD_IMG = "001";
    public static final String CONR_TGT_CD_TXT = "002";
    public static final String CONR_TGT_CD_HTML = "003";
    public static final String CONR_TGT_CD_GOODSS = "005";
    //추가 - 기획전
    public static final String CONR_TGT_CD_PLAN = "006";
    //추가 - 브랜드
    public static final String CONR_TGT_CD_BRND = "007";
    //추가 - 영상
    public static final String CONR_TGT_CD_VOD = "008";
    //추가 - 일반 카테고리
    public static final String CONR_TGT_CD_GEN_CAT = "009";
    //추가 - Parallax Scroll
    public static final String CONR_TGT_CD_PRLX_SCROLL = "010";

    public static final String CONR_TGT_CD_SET_GOODSS = "014"; // [3383769] (메인 페이지 개편) 올알랭 신규 건 (CSH)  14 or 15

    public static final String CONR_TGT_CD_EVENT_NO = "015"; // 브랜드관 개편 2020.10 추가 015

    //category tp code
    //일반 전시카테고리
    public static final String CAT_TP_CD_COMMON = "001";
    //기획전 전시카테고리
    public static final String CAT_TP_CD_PLAN = "002";
    //가상 전시카테고리
    public static final String CAT_TP_CD_VIRTUAL = "004";

    // 상품 구분 코드 (PRD010, 10:일반상품, 20:세트상품, 30:옵션상품, 40:무배송상품, 50:이쿠폰상품)
    public static final String PR_GOODS_SCT_NORMAL = "10";
    public static final String PR_GOODS_SCT_SET = "20";
    public static final String PR_GOODS_SCT_OPTION = "30";
    public static final String PR_GOODS_SCT_INTAN = "40";
    public static final String PR_GOODS_SCT_ECOUPON = "50";

    // 상품 이미지 구분코드 (PRD028, 10:기본이미지, 20:추가이미지, 30:전시이미지, 40:상품기술서)
    public static final String PR_GOODS_IMG_SCT_BSE = "10";
    public static final String PR_GOODS_IMG_SCT_REL = "20";
    public static final String PR_GOODS_IMG_SCT_DSP = "30";
    public static final String PR_GOODS_IMG_SCT_DTL = "40";

    // 상품 기술서 저장 방식.
    public static final String PR_GOODS_CONT_HTML = "10";
    public static final String PR_GOODS_CONT_IMAGE = "20";

    // 상품 판매상태 코드(PRD032, 10:승인전, 20:판매중, 30:일시중지, 40:영구중지)
    public static final String PR_GOODS_PRGS_APPL = "10";
    public static final String PR_GOODS_PRGS_DISP = "20";
    public static final String PR_GOODS_PRGS_STAY = "30";
    public static final String PR_GOODS_PRGS_STOP = "40";

    // 상품 관리상태 코드 (PRD050, 10:임시저장, 20:승인요청, 30:반려, 40:승인, 50:MD승인)
    public static final String PR_GOODS_MNG_TSAVE = "10";
    public static final String PR_GOODS_MNG_APPLY = "20";
    public static final String PR_GOODS_MNG_CMPLY = "30";
    public static final String PR_GOODS_MNG_COMFM = "40";
    public static final String PR_GOODS_MNG_MD_COMFM = "50";

    // 상품옵션 구분코드 (PRD052, 10:공통 상품옵션, 20:업체등록 옵션)
    public static final String PR_GOODS_OPT_DV_STD = "10";
    public static final String PR_GOODS_OPT_DV_BRH = "20";

    // 클레임코드(CLM_CD) (20:취소, 30:반품, 31:반품취소, 40:교환, 41:교환배송취소, 46:교환회수취소, 80:반품결제취소)
    public static final String CLM_CD_CANCEL = "20";
    public static final String CLM_CD_RETURN = "30";
    public static final String CLM_CD_RETURN_CANCEL = "31";
    public static final String CLM_CD_EXCHANGE = "40";
    public static final String CLM_CD_CHANGE_DELI_CANCEL = "41";
    public static final String CLM_CD_CHANGE_RETURN_CANCEL = "46";
    public static final String CLM_CD_RTGS_CANCEL = "80";

    // File Upload Type
    public static final String FILE_INNER_BOARD = "innerBoard/";
    public static final String FILE_NOTICE_MGMT = "noticeMgmt/";
    public static final String FILE_POPUIP_MGMT = "popupMgmt/";
    public static final String FILE_STORE_NOTICE_MGMT = "storeNoticeMgmt/";
    public static final String FILE_ONLINE_BRAND_MGMT = "onlBrandMgmt/";
    public static final String FILE_MBR_PROFILE = "mbrProfile/";
    public static final String FILE_QNA_MGMT = "qnaMgmt/";
    public static final String FILE_GOODS_MGMT = "goodsMgmt/";
    public static final String FILE_ITEM = "item/";
    public static final String FILE_REFUND_RETURN_CAUSE = "refundReturnCause/";
    public static final String FILE_CYBER_AUDIT_MGMT = "cyberAuditMgmt/";
    public static final String FILE_OYPT_AUDIT_MGMT = "CJOYPTMgmt/";
    public static final String FILE_CHANGE_ACCEPT = "changeAccept/";

    // 이벤트 관리 - 이벤트 정보 CRUD
    /** 이벤트게시판정보 전시여부 변경 */
    public static final String CONST_REPLY_DISP_YN_UPDATE = "REPLY_DISP_YN_UPDATE";
    /** 이벤트기본정보 변경 */
    public static final String CONST_EVENT_LIST_UPDATE = "EVENT_LIST_UPDATE";
    /** 이벤트기본정보 전시여부 변경 */
    public static final String CONST_EVENT_LIST_DISP_UPDATE = "EVENT_LIST_DISP_UPDATE";
    /** 이벤트FAQ기본, 이벤트FAQ세트관계정보, 이벤트FAQ정보 삭제 */
    public static final String CONST_FAQ_LIST_DELETE = "FAQ_LIST_DELETE";
    /** 이벤트FAQ세트기본, 이벤트FAQ세트관계정보 삭제 */
    public static final String CONST_FAQ_SET_LIST_DELETE = "FAQ_SET_LIST_DELETE";
    /** 이벤트대상자구분코드 변경 */
    public static final String CONST_CHANGE_TGTR_SCT = "CHANGE_TGTR_SCT";
    /** 이벤트당첨취소, 이벤트당첨자혜택관계정보 삭제 */
    public static final String CONST_WIN_BY_LOTS_CANCEL = "WIN_BY_LOTS_CANCEL";
    /** 이벤트당첨자변경 */
    public static final String CONST_WIN_BY_LOTS_SAVE = "WIN_BY_LOTS_SAVE";
    /** 이벤트SMS발송, 이벤트SMS발송정보 변경 */
    public static final String CONST_SEND_SMS = "SEND_SMS";

    // 이벤트관리 - dataMode
    //등록
    public static final String CONST_DATA_MODE_C = "C";
    //수정
    public static final String CONST_DATA_MODE_U = "U";
    //복사
    public static final String CONST_DATA_MODE_CP = "CP";

    /* 주문 정상 코드 */
    public static final String ORDER_SUCESS = "0000";
    public static final String ORDER_FAIL = "9999";
    public static final String ORDER_FAIL_ALLAT = "9900";

    //주문취소 할수 없는 상태
    public static final String ORDER_FAIL_CANCEL_STATE = "9800";
    //옵션변경 할수 없는 상태
    public static final String ORDER_FAIL_OPTION_CHANGE_STATE = "9801";

    /* 배송비정책 구분 코드 */
    //출하
    public static final String DLEX_POLC_TP_CD_SHIP = "10";
    //회수
    public static final String DLEX_POLC_TP_CD_RECOVERY = "20";

    /* 배송비지역 그룹코드 */
    //국내
    public static final String DLEX_LOC_GRP_CD_DOMESTIC = "10";
    //해외
    public static final String DLEX_LOC_GRP_CD_ABROAD = "20";

    /* 퀵배송 배송비정책번호 */
    public static final String DLEX_POLC_NO_QUICK = "0";
    //오늘드림 고도화 3!4/미드나잇 배송비 2019-12-24 QA
    public static final String DLEX_POLC_NO_QUICK2_QA = "206";
    //오늘드림 고도화 3!4/미드나잇 배송비 2019-12-24 운영
    public static final String DLEX_POLC_NO_QUICK2_PROD = "206";
    
    //오늘드림 24시 배송비정책 추가
    public static final String DLEX_POLC_NO_QUICK3_QA = "350";
    //오늘드림 24시 배송비정책 추가
    public static final String DLEX_POLC_NO_QUICK3_PROD = "350";
    
    //픽업 배송비정책 추가
    public static final String DLEX_POLC_NO_PICKUP_QA = "462";
    //픽업 배송비정책 추가
    public static final String DLEX_POLC_NO_PICKUP_PROD = "462";

    /*CUD TYPE*/
    public static final String CRUD_CREATE = "C";
    public static final String CRUD_UPDATE = "U";
    public static final String CRUD_DELETE = "D";

    //  푸시 길이제한
    public static final int PUSH_IOS_MAX_LENGTH = 200;
    public static final int PUSH_ANDROID_MAX_LENGTH = 300;

    public static final String FILE_PUSH = "push/";

    //시스템 ID
    public static final String MEMBER_ID_BATCH = "BATCH";
    public static final String MEMBER_ID_ADMIN = "ADMIN";
    public static final String MEMBER_ID_FRONT = "FRONT";
    public static final String MEMBER_ID_API = "API_ADMIN";
    public static final String MEMBER_ID_BATCH_AGENT = "BATCHAGENT";

    // 온라인몰 고객센터 CALLBACK 번호(임시!! 수정필요 사이트 풋터 고객센터번호 입니다)
    public static final String CC_CALLBACK_NUMBER = "1522-0882";
    // 매장 고객센터 번호(사이트 풋터 고객센터번호 입니다)
    public static final String CC_STORE_NUMBER = "1577-4887";

    // 포인트 유효기간
    //# - 상품 구매 적립 포인트 : 적립일로부터 24개월
    //# - 상품평 등록 적립 포인트 : 적립일로부터 12개월
    //# - 데이 배수 적립 포인트 : 적립일로부터 24개월
    //# - 기타 프로모션 수기 적립 포인트 : 유효기간이 정해져 있지 않아, 프로모션 마다 설정할 수 있어야 합니다.
    public static final String PNT_EXP_MM_BUY = "24";
    public static final String PNT_EXP_MM_REPLY = "12";
    public static final String PNT_EXP_MM_MULTI_PNT_EVENT = "24";

    /** CJGMS REQ 정보 **/
    //공통 : 전문버전
    public static final String CJCMS_REQ_IFVER = "V100";
    //공통 : 응답코드
    public static final String CJCMS_REQ_RSCD = "00000";
    //공통 : 제휴사코드
    public static final String CJCMS_REQ_PARTNERSCD = "7030";
    //공통 : 채널유형   > ‘OFF’: 오프라인 거래, ‘ONL’: 온라인거래,‘MOB’: 모바일 거래
    public static final String CJCMS_REQ_CHTP_OFF = "OFF";
    public static final String CJCMS_REQ_CHTP_ONL = "ONL";
    public static final String CJCMS_REQ_CHTP_MOB = "MOB";
    //공통 : 브랜드코드
    public static final String CJCMS_REQ_BRDCD = "3000";
    //공통 : 가맹점코드
    public static final String CJCMS_REQ_STORECD = StringUtils.leftPad("S023", 20, " ");
    //공통 : 카드매체구분 > ‘1’-MS, ‘2’-모바일, ‘3’-OTHER
    public static final String CJCMS_REQ_CARDMEDIAGB_MS = "1";
    public static final String CJCMS_REQ_CARDMEDIAGB_MOB = "2";
    public static final String CJCMS_REQ_CARDMEDIAGB_ETC = "3";
    //공통 : 조회구분  > ‘C’-카드번호, ‘T’-전화번호, ‘M’-멤버십ID, ‘I’-회원번호, ‘P’-IPIN_CI, ‘N’-법정생년월일6자리+휴대폰번호8자리(국번제외)
    public static final String CJCMS_REQ_SEARCHGB_C = "C";
    public static final String CJCMS_REQ_SEARCHGB_T = "T";
    public static final String CJCMS_REQ_SEARCHGB_M = "M";
    public static final String CJCMS_REQ_SEARCHGB_I = "I";
    public static final String CJCMS_REQ_SEARCHGB_P = "P";
    public static final String CJCMS_REQ_SEARCHGB_N = "N";
    // 회원식별구분코드(1: 맴버십카드No, 2: 회원No, 3: 맴버십ID)
    public static final String CJGMS_REQ_MEMB_AUTH_GBN_MEMBERSHIPCARDNO = "1";
    public static final String CJGMS_REQ_MEMB_AUTH_GBN_MEMBERNO = "2";
    public static final String CJGMS_REQ_MEMB_AUTH_GBN_MEMBERSHIPID = "3";
    // 본인인증구분 > P: 비밀번호, A: 본인인증
    public static final String CJGMS_REQ_AUTH_PW = "P";
    public static final String CJGMS_REQ_AUTH_SELF = "A";

    //정상카드내역 정보 : 전문유형
    public static final String CJCMS_REQ_CARD_INFO_IFTP = "880";
    //정상카드내역 정보 : 엄부구분
    public static final String CJCMS_REQ_CARD_INFO_JOBGB = "88";

    //포인트 정보 : 전문유형
    public static final String CJCMS_REQ_PNT_INFO_IFTP = "800";
    //포인트 정보 : 엄부구분
    public static final String CJCMS_REQ_PNT_INFO_JOBGB = "81";
    //포이트 정보 : 필터
    public static final String CJCMS_REQ_PNT_INFO_BFILLTER = StringUtils.rightPad("", 774, " ");
    // 당월소멸예정포인트 정보 : 전문유형
    public static final String CJCMS_REQ_PNT_MONT_EXTIN_INFO_IFTP = "803";

    //쿠폰 정보 : 전문유형
    public static final String CJCMS_REQ_CPN_INFO_IFTP = "700";
    //쿠폰 정보 : 엄부구분
    public static final String CJCMS_REQ_CPN_INFO_JOBGB = "71";

    //쿠폰 사용 : 전문유형
    public static final String CJCMS_REQ_CPN_USER_IFTP = "720";
    //쿠폰 사용 : 엄부구분(72 : 쿠폰 사용 요청, 73 : 쿠폰 사용 취소 요청)
    public static final String CJCMS_REQ_CPN_USE_JOBGB = "72";
    //쿠폰 정보 : 엄부구분
    public static final String CJCMS_REQ_CPN_USECANCE_JOBGB = "73";

    // 포인트 정보 : 전문유형
    // 포인트 혼합/혼합취소 : 전문유형
    public static final String CJCMS_REQ_PNT_MULTI_IFTP = "400";
    // 포인트 혼합/혼합취소 : 혼합거래( 사용 후 적립 )
    public static final String CJCMS_REQ_PNT_MULTI_JOBGB = "41";
    // 포인트 혼합/혼합취소 : 혼합거래취소
    public static final String CJCMS_REQ_PNT_MULTI_CANCEL_JOBGB = "42";

    // 포인트 혼합/혼합취소 : 전문유형
    public static final String CJCMS_REQ_PNT_USE_IFTP = "300";
    // 포인트 혼합/혼합취소 : 혼합거래( 사용 후 적립 )
    public static final String CJCMS_REQ_PNT_USE_JOBGB = "31";
    // 포인트 혼합/혼합취소 : 혼합거래취소
    public static final String CJCMS_REQ_PNT_USE_CANCEL_JOBGB = "32";

    // 포인트 적립 : 전문유형
    public static final String CJCMS_REQ_PNT_SAVE_IFTP = "200";
    // 포인트 적립 : 적립
    public static final String CJCMS_REQ_PNT_SAVE_JOBGB = "21";
    // 포인트 적립 : 적립 취소
    public static final String CJCMS_REQ_PNT_SAVE_CANCEL_JOBGB = "22";
    // 포인트 적립 : 적립 취소 취소
    public static final String CJCMS_REQ_PNT_SAVE_CANCEL_CANCEL_JOBGB = "23";
    //쿠폰 정보 : 총매출금액
    public static final String CJCMS_REQ_CPN_INFO_TTSALESPRC = "0000000000";
    //쿠폰 정보 : 결제금액
    public static final String CJCMS_REQ_CPN_INFO_PAYPRC = "0000000000";
    //쿠폰 정보 : 필터
    public static final String CJCMS_REQ_CPN_INFO_BFILLTER = StringUtils.rightPad("", 839, " ");

    // 포인트유형 11-구매, 18-기부금차감
    public static final String CJGMS_REQ_PNT_TYPE_BUY = "11";
    public static final String CJGMS_REQ_PNT_TYPE_GIVE = "18";

    // 포인트유형(10:일반, 20:Event, 30:클레임, 60:변제, 80:일반(삼성제휴), 81:일반(신한제휴))
    public static final String CJGMS_REQ_PNT_SAVE_PNTGBN_NORMAL = "10";
    public static final String CJGMS_REQ_PNT_SAVE_PNTGBN_EVENT = "20";
    public static final String CJGMS_REQ_PNT_SAVE_PNTGBN_CLAIM = "30";
    public static final String CJGMS_REQ_PNT_SAVE_PNTGBN_PAYMENT = "60";
    public static final String CJGMS_REQ_PNT_SAVE_PNTGBN_NORMAL_ALI_SAMSUNG = "80";
    public static final String CJGMS_REQ_PNT_SAVE_PNTGBN_NORMAL_ALI_SINHAN = "81";

    // 가용화처리구분(1:즉시[당일셋팅], 2:배치[매출일+1일])
    public static final String CJGMS_REQ_PNT_ACTIVE_GBN_NOW = "1";
    public static final String CJGMS_REQ_PNT_ACTIVE_GBN_BATCH = "2";

    // 포인트유효기간구분(1:개월수, 2:일수(오프라인은 개월수)
    public static final String CJGMS_REQ_PNT_EXPIRE_GBN_MONTH = "1";
    public static final String CJGMS_REQ_PNT_EXPIRE_GBN_DAYS = "2";

    // 상품정보 적재 : 전문유형
    public static final String CJCMS_REQ_GOODS_SEND_IFTP = "500";
    // 상품정보 적재 : 적재
    public static final String CJCMS_REQ_GOODS_SEND_JOBGB = "51";
    // 상품정보 적재 : 적재 취소
    public static final String CJCMS_REQ_GOODS_SEND_CANCEL_JOBGB = "52";

    // 거래사유 코드
    // 1001 상품/서비스 구매
    // 1002 상품/서비스 구매취소
    // 1003 상품/서비스 구매반품
    // 1004 상품/서비스 구매누락
    // 1005 이벤트적립
    // 1006 이벤트적립취소
    // 1007 이벤트적립누락
    // 1008 클레임적립
    // 1009 클레임적립취소
    // 1010 상품권포인트교환
    // 1011 포인트변제
    // 1012 포인트변제취소
    // 1013 보너스적립
    // 1014 보너스적립취소
    // 1015 보너스적립누락
    // 1016 포인트선물
    // 1017 포인트차감
    // 1018 포인트조정
    // 1019 쿠폰추가적립
    // 1020 쿠폰추가적립취소
    // 1021 GiftCard포인트교환
    // 1022 MMS카드발급
    // 1023 상품권구매
    // 1024 MMS카드발급취소
    // 1025 이벤트차감
    public static final String CJGMS_REQ_DEAL_REASONCD_BUY = "1001";
    public static final String CJGMS_REQ_DEAL_REASONCD_BUY_CANCEL = "1002";
    public static final String CJGMS_REQ_DEAL_REASONCD_BUY_REFUSE = "1003";
    public static final String CJGMS_REQ_DEAL_REASONCD_BUY_MISS = "1004";
    public static final String CJGMS_REQ_DEAL_REASONCD_EVENT = "1005";
    public static final String CJGMS_REQ_DEAL_REASONCD_EVENT_CANCEL = "1006";
    public static final String CJGMS_REQ_DEAL_REASONCD_EVENT_MISS = "1007";
    public static final String CJGMS_REQ_DEAL_REASONCD_CLAIM = "1008";
    public static final String CJGMS_REQ_DEAL_REASONCD_CLAIM_CANCEL = "1009";
    public static final String CJGMS_REQ_DEAL_REASONCD_GIFT_EXCHANGE = "1010";
    public static final String CJGMS_REQ_DEAL_REASONCD_PNT_PAYMENT = "1011";
    public static final String CJGMS_REQ_DEAL_REASONCD_PNT_PAYMENT_CANCEL = "1012";
    public static final String CJGMS_REQ_DEAL_REASONCD_BONUS = "1013";
    public static final String CJGMS_REQ_DEAL_REASONCD_BONUS_CANCEL = "1014";
    public static final String CJGMS_REQ_DEAL_REASONCD_BONUS_MISS = "1014";
    public static final String CJGMS_REQ_DEAL_REASONCD_PNT_GIFT = "1016";
    public static final String CJGMS_REQ_DEAL_REASONCD_PNT_MINUS = "1017";
    public static final String CJGMS_REQ_DEAL_REASONCD_PNT_FIX = "1018";
    public static final String CJGMS_REQ_DEAL_REASONCD_CPN = "1019";
    public static final String CJGMS_REQ_DEAL_REASONCD_PNT_CPN_CANCEL = "1020";
    public static final String CJGMS_REQ_DEAL_REASONCD_PNT_GIFTCARD_EXCHANGE = "1021";
    public static final String CJGMS_REQ_DEAL_REASONCD_PNT_MMSCARD = "1022";
    public static final String CJGMS_REQ_DEAL_REASONCD_PNT_GIFT_BUY = "1023";
    public static final String CJGMS_REQ_DEAL_REASONCD_PNT_MMSCARD_CANCEL = "1024";
    public static final String CJGMS_REQ_DEAL_REASONCD_PNT_EVENT_MINUS = "1025";

    // CAFETERIA
    // 카페테리아 처리 구분(주문 : '1',취소/반품 : '2')
    public static final String CAFETERIA_PROC_GBN_BUY = "1";
    public static final String CAFETERIA_PROC_GBN_CANCEL = "2";

    //회원 서비스동의유형코드
    public static final String ET_MBR_SVC_AGR_TP_CD_EMAIL = "10";
    public static final String ET_MBR_SVC_AGR_TP_CD_SMS = "11";

    //회원 IM올리브원연동상태코드
    public static final String IM_OYONE_API_R = "10";
    public static final String IM_OYONE_API_C = "20";
    public static final String IM_OYONE_API_E = "30";

    //메인 - 베스트탭
    public static final String CAT_NO_MAIN_BEST_SELL = "900000100100001";
    //메인 - 베스트탭
    public static final String CAT_NO_MAIN_BEST_GDAS = "900000100100002";
    //메인 - 세일탭 - 핫인기세일
    public static final String CAT_NO_MAIN_SALE_HOT = "900000100090001";
    //메인 - 세일탭 - +1탭
    public static final String CAT_NO_MAIN_SALE_PLUS = "900000100090002";

    /** CJPay 결제 연동 정보 **/
    // 디바이스 구분 코드
    public static final String CJPAY_REQ_DEVICE_PC = "PC";
    public static final String CJPAY_REQ_DEVICE_MOBILE = "MOBILE";
    public static final String CJPAY_REQ_DEVICE_FRONT = "FRONT";

    /** CJPay 결제 취소 연동 구분값을 위한 변수 선언 **/
    public static final Set<String> CJPAY_REQ_CUSTOMER = new HashSet<String>(
        Arrays.asList(CJPAY_REQ_DEVICE_PC, CJPAY_REQ_DEVICE_MOBILE, CJPAY_REQ_DEVICE_FRONT));
    public static final String CJPAY_CANCEL_BY_USER = "1";
    public static final String CJPAY_CANCEL_BY_ADMIN = "2";

    // 결제 구분 코드
    public static final String CJPAY_REQ_PAY_METHOD_CREDITCARD = "Creditcard";
    public static final String CJPAY_REQ_PAY_METHOD_ACCOUNT = "Account";
    public static final String CJPAY_REQ_PAY_METHOD_CASH = "VirtualAccount";
    public static final String CJPAY_REQ_PAY_METHOD_MOBILE = "Mobile";
    public static final String CJPAY_REQ_PAY_METHOD_CULTURELAND = "CultureLand";
    public static final String CJPAY_REQ_PAY_METHOD_BOOKANDLIFE = "BookAndLife";
    public static final String CJPAY_REQ_PAY_METHOD_PAYCO = "PCO";
    public static final String CJPAY_REQ_PAY_METHOD_KAKAO = "KKO";  // 카카오페이 추가 2017.12.15
    public static final String CJPAY_REQ_PAY_METHOD_NAVER = "NVP";  // 네이버페이 추가 2020.08.15

    /** CJPay 계좌주 성명조회 연동 정보 **/
    // 가맹점 ID
    public static final String CJPAY_REQ_ACCOUNT_NOTE_SHOP_ID = "ShopID";
    public static final String CJPAY_REQ_ACCOUNT_NOTE_SHOP_ID_V = "CJ1610130001";
    // 구분 > 2 : 계좌주명 확인
    public static final String CJPAY_REQ_ACCOUNT_NOTE_WORK_FLAG = "WorkFlg";
    public static final String CJPAY_REQ_ACCOUNT_NOTE_WORK_FLAG_V = "2";
    // 은행코드
    public static final String CJPAY_REQ_ACCOUNT_NOTE_BANK_CODE = "BankCode";
    // 운향계좌번호
    public static final String CJPAY_REQ_ACCOUNT_NOTE_ACCOUNT_NO = "AccountNo";
    // 성명(예금주명)
    public static final String CJPAY_REQ_ACCOUNT_NOTE_USER_NAME = "UserName";
    // 생년월일
    public static final String CJPAY_REQ_ACCOUNT_NOTE_USER_BIRTH = "UserBirth";
    // 인증결과 응답코드
    public static final String CJPAY_RES_ACCOUNT_NOTE_RESULT_CODE = "CJSResultCode";
    // 인증결과 메시지
    public static final String CJPAY_RES_ACCOUNT_NOTE_RESULT_MSG = "CJSResultMessage";
    // CJPAY 계좌주 성명 조회 연동 성공 코드
    public static final String CJPAY_RES_R_CD_SUCCESS = "0000";
    public static final String CJPAY_RES_R_CD_FAIL = "6100";

    //CJPAY 무통장 거래 채번결과 콜백 전송 입금
    public static final String CJPAY_CALLBACK_FLG_DEPOSIT = "DEPOSIT";
    // CJPAY 무통장 거래 채번결과 콜백 전송 채번
    public static final String CJPAY_CALLBACK_FLG_ISSUE = "ISSUE";

    /** CJPG 상품권(문화상품권 / 도서상품권) 관련 연동 정보 **/
    // 구분(0 : 인증-잔액조회요청, 1:승인-결제승인요청)
    public static final String CJPAY_REQ_GIFT_PAY_FLAG_SCH = "0";
    public static final String CJPAY_REQ_GIFT_PAY_FLAG_PAYMENT = "1";

    /** 기프트카드 관련 상수값 **/
    // 기프트카드  제휴사코드 ( 추가정보값 )
    public static final String GIFTCARD_COMPANY_INFO = "7030";
    // 기프트카드  브랜드코드 ( 추가정보값 )
    public static final String GIFTCARD_COMPANY_INFO_BRAND = "3000";
    // 기프트카드  매장코드 ( 추가정보값 )
    public static final String GIFTCARD_COMPANY_INFO_STORE = "S023";
    //기프트카드 연동 성공 코드
    public static final String GIFTCARD_RES_R_CD_SUCCESS = "0000";
    // 기프트카드 점포코드
    public static final String GIFTCARD_STORE_CD = "O1056";
    // 기프트카드 CAT-ID
    public static final String GIFTCARD_MERCHANT_ID = "6515934001";
    // 기프트카드 가맹점번호
    public static final String GIFTCARD_AFF_NO = "A000000560";
    // 기프트카드 VANCODE
    public static final String GIFTCARD_VAN_CODE = "01";
    // 기프트카드 잔액조회
    public static final String GIFTCARD_REST_AMOUNT = "000000000001";
    // 기프트카드 발급사코드
    public static final String GIFTCARD_CJ_ISSCD = "A3";
    public static final String GIFTCARD_OY_ISSCD = "AA";
    // 기프트카드 사용가능 여부 ( "Y" - 사용가능, "N" - 사용불가 , "D" - 폐기 )
    public static final String GIFTCARD_BL_Y = "Y";
    public static final String GIFTCARD_BL_N = "N";
    public static final String GIFTCARD_BL_D = "D";
    // 기프트카드 전문TEXT
    public static final String GIFTCARD_MESSAGE_TEXT = "NICE000";
    // 기프트카드 요청/응답 MESSAGE TYPE (‘0200’- 기명선불카드조회/기명인증/기명회수, ‘0420’- 기명회수망취소/기명회수취소 )
    public static final String GIFTCARD_REQ_USE_TYPE = "0200";
    public static final String GIFTCARD_REQ_CANCEL_TYPE = "0420";
    // 기프트카드 서비스코드 (‘S3’- 기명선불카드조회, ‘S6 - 기명인증하기 , ‘AB’- 기명회수(사용),기명회수망취소(사용), ‘CC’- 기명회수취소(사용) )
    public static final String GIFTCARD_SERVICE_CODE_INFO = "S3";

    /************************************************************************************************************************
     ***** 기프트카드 판매 신규 개발 ****************************************************************************************
     ************************************************************************************************************************/

    // 거래내역조회
    public static final String GIFTCARD_SERVICE_CODE_PRICE = "S1";
    // 거래내역조회
    public static final String GIFTCARD_SERVICE_CODE_TRADE = "S4";
    // 기명 등록
    public static final String GIFTCARD_SERVICE_CODE_REG = "A1";
    // 기명 등록 취소
    public static final String GIFTCARD_SERVICE_CODE_REG_CNCL = "C1";
    // 분실 등록
    public static final String GIFTCARD_SERVICE_CODE_LOST_REG = "V0";
    // 분실 등록 취소 
    public static final String GIFTCARD_SERVICE_CODE_LOST_CNCL = "V4";
    // 폐기 
    public static final String GIFTCARD_SERVICE_CODE_WASTE = "V3";
    // 판매대행
    public static final String GIFTCARD_SERVICE_CODE_SALE_AGNC = "A2";
    // 판매대행 취소
    public static final String GIFTCARD_SERVICE_CODE_SALE_AGNC_CNCL = "C2";
    // 기명인증하기
    public static final String GIFTCARD_SERVICE_CODE_OTP_SINGLE = "S5";

    // 기프트카드 상품종류 구분 (‘01’: B2C판매, ‘02’: B2B판매, ‘03’: B2B(B2C) )
    public static final String GIFTCARD_SALE_KIND = "01";

    // "01":수신자 환불, "02":구매사, "03":환불불가
    public static final String GIFTCARD_CANCEL_ORDER_CODE = "02";
    // 거래유형 판매|충전 
    public static final String GIFTCARD_TRADE_GUBUN_SALE = "7";
    //거래유형 판매|충전 취소
    public static final String GIFTCARD_TRADE_GUBUN_SALE_CANCEL = "8";
    // 결제수단
    public static final String GIFTCARD_PAY_GUBUN_GIFTCARD = "51";

    // 기프트카드 결제수단('현금')
    public static final String GIFTCARD_PAY_CODE_CASH = "00";
    // 기프트카드 결제수단('신용카드')
    public static final String GIFTCARD_PAY_CODE_CREDIT_CARD = "01";

    /************************************************************************************************************************
     ************************************************************************************************************************
     ************************************************************************************************************************/

    // 기명인증하기
    public static final String GIFTCARD_SERVICE_CODE_OTP = "S6";
    // 기명회수(사용),기명회수망취소(사용)
    public static final String GIFTCARD_SERVICE_CODE_USE_AND_USE_CANCEL = "AB";
    // 기명회수취소(사용)
    public static final String GIFTCARD_SERVICE_CODE_CANCEL = "CC";
    // 기프트카드 상품종류 구분 (‘01’- 지류상품권, ‘03’ - 선불카드 , ‘04’- 모바일 상품권, ‘05’- 쿠폰 )
    public static final String GIFTCARD_KIND = "03";
    // 기프트카드 상품종류 구분 판매용 (‘1’- 지류상품권, ‘03’ - 선불카드 , ‘04’- 모바일 상품권, ‘05’- 쿠폰 )
    public static final String GIFTCARD_KIND_MAX1 = "3";
    // 기프트카드 거래 방법 ( ‘@(H40)’- Manual, ‘A(H41)’- Swipe or Scan ,‘W’- 인터넷 거래 )
    public static final String GIFTCARD_REQUEST_METHOD_CODE = "W";
    // 기프트카드 사용구분 ( ‘1’- 기본값 )
    public static final String GIFTCARD_EXCHANGE_CODE = "1";
    // 기프트카드 포스번호 ( 임의의 고정값 )
    public static final String GIFTCARD_POS_NO = "1004";
    // 기프트카드 상세서비스코드 ( ‘1’- 일반회수 , ‘2’- 교환, ‘4’- 잔액환불, ‘B’- 낙전)
    public static final String GIFTCARD_EXCHAGE_CODE = "1";
    // 기프트카드 브랜드전용사용
    public static final String GIFTCARD_RCV_FLAG = "Y";
    // 기프트카드 회수실적 - 전문구분
    public static final String GIFTCARD_PROTO_GB = "D";
    // 기프트카드 회수실적 - 업데이트 구분 ( ‘01’- 신규 , ‘02’- 변경)
    public static final String GIFTCARD_UPDATE_CODE = "01";
    // 기프트카드 회수실적 - 파일 네이밍 순번
    public static final String GIFTCARD_FILE_NUMBER = "02";

    /** KAKAO Talk Message 관련 상수 값 **/
    // 발송상태 (1:발생대기, 6:메시지 큐에 입력, 2:전송완료, 3:결과수신완료)
    public static final String KKOMSG_STATUS_READY = "1";
    // 메시지 템플릿 코드
    public static final String KKOMSG_TEMPLETE_A001_01 = "A001_01";
    // 메시지 발송 실패시 전송할 메시지 타입
    public static final String KKOMSG_FAILEDTYPE_SMS = "SMS";
    public static final String KKOMSG_FAILEDTYPE_LMS = "LMS";

    /** 개인정보 관련 **/
    // 개인정보를 확인할 수 있도록 SESSION에 담는 정보
    public static final String SKIP_PERSONAL_INFORMATION_MASKING = "_SKIP_PERSONAL_INFORMATION_MASKING";

    /** batch push 사용 */
    public static final String IS_SKIP_JOB = "isSkipJob";
    public static final String TARGET_LIST = "targetList";

    /** PUSH 발송대상구분 코드[PSH012] **/
    public static final String PUSH_SND_SCT_CD_BAT = "10";
    public static final String PUSH_SND_SCT_CD_INDIV = "20";

    /** PUSH 링크 프로토콜 코드[PSH005] **/
    public static final String PUSH_LNK_PRTCL_CD_GOODS = "10";
    public static final String PUSH_LNK_PRTCL_CD_COUNSEL = "20";
    public static final String PUSH_LNK_PRTCL_CD_INQUIRY = "21";
    public static final String PUSH_LNK_PRTCL_CD_MAIN = "30";
    public static final String PUSH_LNK_PRTCL_CD_NOTICE = "40";
    public static final String PUSH_LNK_PRTCL_CD_CUSTOM = "90";

    /****통계****/
    //구매금액대 분석 필드
    public static final String STATISTICS_CUSTOMER_ORDER_AMT_PRICE = "객단가";
    public static final String STATISTICS_CUSTOMER_ORDER_AMT_MBR_CNT = "회원수";
    public static final String STATISTICS_CUSTOMER_ORDER_AMT_TOT_SALES = "총매출";

    //구매횟수별 분석 필드
    public static final String STATISTICS_CUSTOMER_ORDER_CNT_COMMON = "회";
    public static final String STATISTICS_CUSTOMER_ORDER_CNT_16_19 = "16~19회";
    public static final String STATISTICS_CUSTOMER_ORDER_CNT_20 = "20회 이상";
    public static final String STATISTICS_CUSTOMER_ORDER_CNT_AVERAGE = "평균구매횟수";

    //성연령별 분석 필드
    public static final String STATISTICS_CUSTOMER_MEMBER_ETC = "기타";

    //임직원구매 분석 필드
    public static final String STATISTICS_CUSTOMER_EMPLOYEE_TOTAL_ORDER = "총주문건수";
    public static final String STATISTICS_CUSTOMER_EMPLOYEE_TOTAL_AMT = "총구매금액";
    public static final String STATISTICS_CUSTOMER_EMPLOYEE_TOTAL_CUSTOMER = "주문고객수";
    public static final String STATISTICS_CUSTOMER_EMPLOYEE_REDUCED_PRICE = "할인금액";

    //신규재구매 분석 필드
    public static final String STATISTICS_CUSTOMER_ORDER_COUNT = "주문건수";
    public static final String STATISTICS_CUSTOMER_ORDER_AMOUNT = "매출금액";
    public static final String STATISTICS_CUSTOMER_ORDER_COUNT_SUM = "주문 SUM";
    public static final String STATISTICS_CUSTOMER_ORDER_AMT_SUM = "매출 SUM";
    public static final String STATISTICS_CUSTOMER_ORDER_NEWORD = "신규";
    public static final String STATISTICS_CUSTOMER_ORDER_REORD = "재구매";
    public static final String STATISTICS_CUSTOMER_ORDER_OSHOPPING = "오쇼핑";

    //우편번호 지번주소 상세 구분값
    public static final String ZIPCODE_DTL_ADDR_DELIMITER = "-";

    //네이버 쇼핑 파일명
    public static final String NAVER_SHOPPING_ALL_ENGINE_PAGE = "allEnginePage";
    public static final String NAVER_SHOPPING_SUMMARY_ENGINE_PAGE = "summaryEnginePage";

    //구글 쇼핑 파일명
    public static final String GOOGLE_SHOPPING_ALL_ENGINE_PAGE = "allEnginePage";

    //Recobell 쇼핑 파일명
    public static final String RECOBELL_SHOPPING_ALL_ENGINE_PAGE = "allEnginePage_recobell";
    public static final String RECOBELL_SHOPPING_PRD_MASTER_PAGE = "allEnginePage_eigene";
    public static final String RECOBELL_SHOPPING_SUMMARY_ENGINE_PAGE = "summaryEnginePage";
    public static final String RECOBELL_PRD_CTG_PAGE = "prdCtgInfoPage";
    public static final String RECOBELL_PRD_BRND_PAGE = "prdBrndInfoPage";
    public static final String RECOBELL_REVIEW_ONLINE_PAGE = "onlineReviewPage";
    public static final String RECOBELL_REVIEW_OFFLINE_PAGE = "offlineReviewPage";
    public static final String RECOBELL_REVIEW_OY_TESTER_PAGE = "oyTesterReviewPage";
    public static final String RECOBELL_REVIEW_SHOPPING_SUPPORT_PAGE = "reviewShoppingSupportPage";
    public static final String RECOBELL_REVIEW_GRADE_PAGE = "reviewGradePage";
    public static final String RECOBELL_PLAN_SHOP_PAGE = "planShopInfoPage";
    public static final String RECOBELL_USR_INFO_PAGE = "userInfoPage";
    public static final String RECOBELL_USR_ADD_INFO_PAGE = "userAddInfoPage";
    public static final String RECOBELL_USR_INTR_STR_INFO_PAGE = "userIntrStrInfoPage";
    public static final String RECOBELL_USR_ALARM_INFO_PAGE = "userStockAlarmInfoPage";

    public static final String RECOBELL_ST_BW_INFO_PAGE = "stBwInfoPage";

    //페이스북 쇼핑 파일명
    public static final String FACEBOOK_ENGINE_PAGE = "enginePage_faceBook";

    //크리테오 쇼핑 파일명
    public static final String CRITEO_ENGINE_PAGE = "enginePage_criteo";
    
    //에피어 쇼핑 파일명
    public static final String APPIER_ENGINE_PAGE = "enginePage_appier";

    // 푸시 메시지 목록 상수
    public static final String RESULT_MSG_LIST = "resultMsgList";
    // 푸시 성공 목록 상수
    public static final String RESULT_TARGET_SUCS_LIST = "resultTargetSucsList";
    // 푸시 실패 목록 상수
    public static final String RESULT_TARGET_FAIL_LIST = "resultTargetFailList";
    // 푸시 android 목록 상수
    public static final String ANDROID_LIST = "androidList";
    // 푸시 ios 목록 상수
    public static final String IOS_LIST = "iosList";
    // 푸시 메시지 상수
    public static final String MESSAGE = "message";
    // 푸시ID 목록 상수
    public static final String PUSH_ID_LIST = "pushIdList";
    // 오류 메시지 max size 상수
    public static final int ERROR_MSG_MAX_SIZE = 90;
    // 오류메시지 substring idx 상수
    public static final int ERROR_MSG_SIZE = 85;

    /** 주문 구분 코드 **/
    public static final String ORD_SCT_CD_ORDER = "order";
    public static final String ORD_SCT_CD_CANCEL = "cancel";

    /* 메시지 발송 유형 */
    public static final String MSG_SCT_SMS = "SMS";
    public static final String MSG_SCT_LMS = "LMS";

    /* 카카오비즈톡 메시지 템플릿 코드 */
    /**
     * 예금주- 무통장입금시 예금주 안내
     */
    public static final String KAKAOBIZ_DEPOSIT_ACCOUNT_NAME = "씨제이올리브네트웍스";

    /**
     * 주문 완료- 무통장입금 요청 안내 (카카오 알림톡 문구개선 2차 메시지) oym006 -> nwmsg05
     */
    //public static final String KAKAOBIZ_TEMPLET_CODE_ORDER_REG_CASH = "withnature01";
    //public static final String KAKAOBIZ_TEMPLET_CODE_ORDER_REG_CASH = "oym001";
    public static final String KAKAOBIZ_TEMPLET_CODE_ORDER_REG_CASH = "nwmsg05";

    /**
     * 주문 완료 안내 - 문구 변경으로 withnature02->withnature76->nwmsg01 변경
     */
    public static final String KAKAOBIZ_TEMP_CODE_ORDER_REG = "nwmsg01";
    /**
     * 주문 접수 후 취소 완료 안내 - nwmsg16변경
     */
    public static final String KAKAOBIZ_TEMP_CODE_ORDER_CANCEL_NO_MONEY = "nwmsg16";
    /**
     * 주문 취소 완료 안내 - 문구 변경으로 withnature62->withnature77-> nwmsg02변경
     */
    public static final String KAKAOBIZ_TEMP_CODE_ORDER_CANCEL = "nwmsg02";
    /**
     * 주문취소 - 무통장입금 주문 취소 안내(기한내 미입금) (카카오 알림톡 문구개선 2차 메시지) nwmsg06
     */
    //public static final String KAKAOBIZ_TEMP_CODE_ORDER_CANCEL_CASH = "withnature04";
    public static final String KAKAOBIZ_TEMP_CODE_ORDER_CANCEL_CASH = "nwmsg06";

    /**
     * 주문 배송 안내 - 문구 변경으로 withnature05->withnature75->nwmsg03 변경
     */
    public static final String KAKAOBIZ_TEMP_CODE_ORDER_DELI_END = "nwmsg03";
    /**
     * 선물하기 교환 상품 배송 안내 - 문구 변경으로 withnature79 -> nwmsg04 변경
     */
    public static final String KAKAOBIZ_TEMP_CODE_CHANGE_GIFT_REG = "nwmsg04";
    /**
     * 교환 상품 배송 안내 - 문구 변경으로 withnature06->withnature79->nwmsg04 변경
     */
    public static final String KAKAOBIZ_TEMP_CODE_CHANGE_REG = "nwmsg04";
    /**
     * 반품 완료 안내 - 문구 변경으로 withnature63->withnature80->nwmsg07 변경
     */
    public static final String KAKAOBIZ_TEMP_CODE_RETURN_END = "nwmsg07";

    /**
     * 배송시작 안내: withnature05->withnature56 변경(기존 배송시작 안내 알림톡 문구 수정) (2019.11.27)
     */
    public static final String KAKAOBIZ_TEMP_CODE_ORDER_DELI_END2 = "withnature56";

    /**
     * 배송지연 안내(위수탁) (카카오 알림톡 문구개선 2021.01.28) oym008
     */
    //public static final String KAKAOBIZ_TEMP_CODE_DELIVERY_DELAY_BRH = "withnature14";
    public static final String KAKAOBIZ_TEMP_CODE_DELIVERY_DELAY_BRH = "nwmsg12";

    /**
     * 배송지연 안내(매입) (카카오 알림톡 문구개선 2차 메시지) oym003 --> nwmsg11
     */
    //public static final String KAKAOBIZ_TEMP_CODE_DELIVERY_DELAY_STD = "withnature15";
    public static final String KAKAOBIZ_TEMP_CODE_DELIVERY_DELAY_STD = "nwmsg11";

    /**
     * 결품 안내(위수탁)
     */
    public static final String KAKAOBIZ_TEMP_CODE_DELIVERY_SHORTAGE_BRH = "withnature16";
    /**
     * 결품 안내(매입) withnature18 --> nwmsg14
     */
    public static final String KAKAOBIZ_TEMP_CODE_DELIVERY_SHORTAGE_STD = "nwmsg14";
    /**
     * 결품철회 안내(매입/ 위수탁) withnature22 --> nwmsg10
     */
    public static final String KAKAOBIZ_TEMP_CODE_DELIVERY_SHORTAGE_CN_BRH = "nwmsg10";
    /**
     * 배송지연 보상 안내 (카카오 알림톡 문구개선 2차 메시지) (카카오 알림톡 문구개선 2차 메시지)
     */
    //public static final String KAKAOBIZ_TEMP_CODE_DELIVERY_DELAY_REWARD = "withnature21";
    public static final String KAKAOBIZ_TEMP_CODE_DELIVERY_DELAY_REWARD = "nwmsg15";

    /**
     * 오늘드림 배송지연 보상 안내
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_DELIVERY_DELAY_REWARD = "withnature32";    // 오늘드림 배송지연 알림톡 추가 2019.06
    /**
     * 오늘드림 주문 취소 안내 withnature98 -> today04 변경
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_ORD_CANCEL = "poday04"; // withnature68 에서 withnature98로 변경
    /**
     * 퀵배송 주문 배송 안내
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_ORD_DELIV = "withnature26"; // withnature24 에서 withnature26로 변경
    /**
     * 오늘드림 일반주문 전환 안내 withnature09->today07 
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_ORD_TRANSE = "today07"; // 2020.09.15     
    /**
     *  [] 매장반품 접수 안내
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_STR_RET_RCPT = "o2o001";

    /**
     *  [] 매장반품 안내 o2o002 --> goday09
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_STR_RET_ALARM = "goday09";

    /**
     *  [] 매장반품 철회 안내 o2o003 --> today08
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_STR_RET_AUTO_CANCEL = "today08";

    /**
     * 회수 안내 - 문구 변경으로 withnature53->withnature78->nwmsg08 변경
     */
    // 회수지시 후 운송장 등록 시 알림톡 발송 추가 - 배송조회 UI 개선(CHY) - withnature34 에서 withnature53->nwmsg08로 변경
    public static final String KAKAOBIZ_TEMP_CODE_DELEVERY_RETURN_REG = "nwmsg08";

    //    /**
    //     *  [] 선물하기 주문완료
    //     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_ORD_COMPLETE = "withnature45";
    //    /**
    //     *  [] 선물하기 선물수락
    //     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_PRE_ACCEPT = "withnature46";
    //    /**
    //     *  [] 선물하기 주문취소/선물거절/자동취소
    //     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_ORD_PRE_AUTO_CANCLE = "withnature47";
    //    /**
    //     *  [] 선물하기 배송안내
    //     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_DELIVERY_INFO = "withnature48";
    //    /**
    //     *  [] 선물하기 선물수락 (수령인)
    //     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_PRE_ACCEPT_RECIPIENT = "withnature49";
    //    /**
    //     *  [] 선물하기 배송안내(수령인)
    //     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_DELIVERY_INFO_RECIPIENT = "withnature50";
    //    /**
    //     *  [] 선물하기 선물도착
    //     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_PRE_ARRIVAL = "withnature52";
    //    /**
    //     *  [] 선물하기 주문취소/선물거절/자동취소 (수령인)
    //     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_ORD_PRE_AUTO_CANCLE_RECIPIENT = "withnature70";

    /**
     *  [] 선물하기 주문완료 1 prsnt14 --> nprn01
     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_ORD_COMPLETE = "prsnt01";
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_ORD_COMPLETE = "nprn01";
    /**
     *  [] 선물하기 선물수락 3 prsnt15 --> nprn02
     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_PRE_ACCEPT = "prsnt03";
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_PRE_ACCEPT = "nprn02";
    /**
     *  [] 선물하기 선물수락 4 prsnt16 -> nprn03
     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_PRE_ACCEPT_GIFTBOX_REFUND = "prsnt04";
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_PRE_ACCEPT_GIFTBOX_REFUND = "nprn03";
    /**
     *  [] 선물하기 주문취소/선물거절/자동취소  7 prsnt18 -> nprn04
     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_ORD_PRE_AUTO_CANCLE = "prsnt07";
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_ORD_PRE_AUTO_CANCLE = "nprn04";
    /**
     *  [] 선물하기 배송안내  9 prsnt19 -> nprn10
     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_DELIVERY_INFO = "prsnt09";
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_DELIVERY_INFO = "nprn10";
    /**
     *  [] 선물하기 배송안내  10
     */
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_DELIVERY_INFO_O2O = "prsnt10";
    /**
     *  [] 선물하기 선물수락 (수령인) 5 prsnt17 --> nprn06
     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_PRE_ACCEPT_RECIPIENT = "prsnt05";
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_PRE_ACCEPT_RECIPIENT = "nprn06";
    /**
     *  [] 선물하기 배송변경 (수령인) 6
     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_DELIVERY_METH_CHANGE_RECIPIENT = "prsnt06";
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_DELIVERY_METH_CHANGE_RECIPIENT = "prsnt13";
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_DELIVERY_METH_CHANGE_RECIPIENT = "prsnt21";
    /**
     *  [] 선물하기 배송안내(수령인) 11 prsnt20 -> nprn11
     */
    //    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_DELIVERY_INFO_RECIPIENT = "prsnt11";
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_DELIVERY_INFO_RECIPIENT = "nprn11";
    /**
     *  [] 선물하기 배송안내(수령인) 12 prsnt12 -> nprn09
     */
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_DELIVERY_INFO_O2O_RECIPIENT = "nprn09";
    /**
     *  [] 선물하기 선물도착 2 prsnt02
     */
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_PRE_ARRIVAL = "prsnt02";
    /**
     *  [] 선물하기 주문취소/선물거절/자동취소 (수령인) 8
     */
    public static final String KAKAOBIZ_TEMP_CODE_PRESENT_ORD_PRE_AUTO_CANCLE_RECIPIENT = "prsnt08";

    /**
     *  [] 오늘드림 주문취소 안내 - 콜백 API 20210309  -> today02로 변경(210309) 
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_CALLBACK_API_CANCEL = "today02";
    /**
     *  [] 오늘드림 배송 시작 withnature65 -> today05
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_DELIVERY_START = "today05";
    /**
     *  [] 오늘드림 배송 완료
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_DELIVERY_COMPLETE = "withnature66";
    /**
     *  [] 오늘드림 배송 완료 - 배송완료 이미지 버튼 포함 withnature74 -> today10
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_DELIVERY_COMPLETE_IMAGE = "today10";
    /**
     *  [] 오늘드림 배송 완료 - 결제금액 제외 withnature73 -> today06
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_DELIVERY_COMPLETE_PAYMENT = "today06";
    /**
     *  [] 오늘드림 주문 완료 - [3306826] 온라인몰 주문 알림톡 문구 및 UI 개선 요청의 건(오늘드림) withnature95로 변경 -> today01로 변경(210309)
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_ORDER_REG = "today01";
    /**
     *  [] 오늘드림 주문 취소 - 부릉호출실패 withnature69-> today03로 변경(210309)
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_ORD_CANCEL_VROONG = "today03";
    /**
     *  [] 기프트카드 주문완료(구매) withnature81 → withnature57 -> ngift02
     */
    public static final String KAKAOBIZ_TEMP_CODE_GIFTCARD_ORDER = "ngift02";
    /**
     *  [] 기프트카드 주문완료(선물) gift01 -> ngift01
     */
    public static final String KAKAOBIZ_TEMP_CODE_GIFTCARD_ORDER_P = "ngift01";
    /**
     *  [] 기프트카드 선물 취소(거절) 보낸사람 withnature88 → withnature96 -> ngift03
     */
    public static final String KAKAOBIZ_TEMP_CODE_GIFTCARD_ORDER_GIFT_REFUSE_SENDER = "ngift03";
    /**
     *  [] 기프트카드 선물 취소 받는사람 withnature91 → gift02
     */
    public static final String KAKAOBIZ_TEMP_CODE_GIFTCARD_ORDER_GIFT_CANCEL_RECEIVER = "gift02";
    /**
     *  [] 기프트카드 선물 취소(회수) 보낸사람  withnature92 → withnature97 -> ngift04
     */
    public static final String KAKAOBIZ_TEMP_CODE_GIFTCARD_ORDER_GIFT_CANCEL_SENDER = "ngift04";
    /**
     *  [] 기프트카드 선물 거절 받는사람 withnature93 → withnature99
     */
    public static final String KAKAOBIZ_TEMP_CODE_GIFTCARD_ORDER_GIFT_REFUSE_RECEIVER2 = "withnature99";
    /**
     *  [] 기프트카드 구매 취소 withnature94 → withnature58
     */
    public static final String KAKAOBIZ_TEMP_CODE_GIFTCARD_ORDER_CANCEL = "withnature58";

    /**
     *  [] 구매하신 상품의 후기를 기다리고 있어요!
     */
    public static final String KAKAOBIZ_TEMP_CODE_REVIEW = "review8";

    /**
     *  [] 선물 받으신 상품의 후기를 기다리고 있어요!
     */
    public static final String KAKAOBIZ_TEMP_CODE_PRSENT_REVIEW = "review9";

    /***
     * [ 오늘드림] 픽업 안내 (주문완료) pick01 -> pick13 
     */
    public static final String KAKAOBIZ_TEMP_CODE_STORE_PICKUP_ORDER = "pick13";
    
    /***
     * [ 오늘드림] 픽업 안내 (주문완료) 드라이브인 가능 매장 pick14 
     */
    public static final String KAKAOBIZ_TEMP_CODE_STORE_PICKUP_DRIVE_ORDER = "pick14";
    
    /***
     * [ 오늘드림] 픽업 안내 (픽업 대기중)
     */
    public static final String KAKAOBIZ_TEMP_CODE_STORE_PICKUP_WAIT = "pick10";
    /**
     * [ 오늘드림] 픽업 완료
     */
    public static final String KAKAOBIZ_TEMP_CODE_STORE_PICKUP_COMPLETE = "pick11";
    /***
     * [ 오늘드림] 픽업 안내 (픽업 대기 마지막 날)
     */
    public static final String KAKAOBIZ_TEMP_CODE_STORE_PICKUP_BEFORE_END = "pick12";
    /***
     * [ 오늘드림] 주문취소 완료 (미픽업으로 인한 자동취소)
     */
    public static final String KAKAOBIZ_TEMP_CODE_STORE_PICKUP_NOT_PICKUP = "pick05";
    /***
     * [ 오늘드림] 결품 안내 (취소시간연장)
     */
    public static final String KAKAOBIZ_TEMP_CODE_STORE_PICKUP_LCK_EXT = "pick07";
    /***
     * [ 오늘드림] 결품 안내 (재고부족 자동취소)
     */
    public static final String KAKAOBIZ_TEMP_CODE_STORE_PICKUP_LCK_ITMS = "pick08";
    /***
     * [ 오늘드림] 주문취소 완료 (상품이슈 자동취소)
     */
    public static final String KAKAOBIZ_TEMP_CODE_STORE_PICKUP_NOT_ACCP = "pick09";
    
    
    //다음 쇼핑 파일명
    public static final String DAUM_SHOPPING_ALL_ENGINE_PAGE = "allEnginePage";
    public static final String DAUM_SHOPPING_SUMMARY_ENGINE_PAGE = "summaryEnginePage";

    // 제휴 배송비 하드 코딩
    public static final long IF_ALGN_SSG_DELIVERY_COST = 2500L;

    /**
     * 연동 사이트 순번 (SSG 이후 사용안함)
     * 2 : CJO
     * 3 : SSG
     *
     * ConstCode 참조
     * GS : SITE_NO_GS
     * Hmall : SITE_NO_HM
     */
    public static final String IF_ALGN_SITE_NO_CJO = "2";
    public static final String IF_ALGN_SITE_NO_SSG = "3";

    // 제휴 주문 취소 구분 코드
    public static final String IF_ALGN_ORD_CNCL_SCT_CD_ALL = "Acncl";
    public static final String IF_ALGN_ORD_CNCL_SCT_CD_PART = "Pcncl";

    // 당일배송 최대구매 수량
    public static final int QUICK_ORD_PSB_MAX_QTY = 999;

    // 당일배송 최대구매 건수
    public static final int QUICK_ORD_PSB_MAX_CNT = 20;

    //메인 - 당일 배송 주문 가능 시간
    public static final int QUICK_ORD_PSB_TIME_FROM = 0;
    public static final int QUICK_ORD_PSB_TIME_TO = 24;

    // 당일배송 안전재고 율
    public static final double QUICK_ORD_SFT_STOCK_RATE = 0.8;

    public static final int QUICK_FOR_DEPLOY = 1; // 아무의미없는값이지만 오늘드림 컴파일을 위해추가

    // OKCashBag 연동 성공 코드
    public static final String OCB_RES_R_CD_SUCCESS = "200";

    //매출데이터 연동 구분 - 장바구니 1
    public static final String GOODS_SALES_CART = "1";
    //매출데이터 연동 구분 - 주문결제2
    public static final String GOODS_SALES_APLY = "2";

    // O2O 안전재고 율
    public static final double O2O_ORD_SFT_STOCK_RATE = 0.8;

    private Constants() {

    }

    // 에필로그 관리 - 에필로그 정보 CRUD
    /** 에필로그 관리 리스트 Grid 정보변경 */
    public static final String CONST_EPILOGUE_LIST_UPDATE = "EPILOGUE_LIST_UPDATE";

    // 에필로그 관리 댓글리스트 - 에필로그 댓글리스트 정보 CRUD
    /** 에필로그 관리 댓글 리스트 Grid 정보변경 */
    public static final String CONST_EPLG_COMT_LIST_UPDATE = "EPLG_COMT_LIST_UPDATE";

    /*
     * AJAX 결과 코드
     */
    public static final String RESULT_SUCCESS = "0";
    public static final String RESULT_ERROR = "-1";

    /** 투표 관리 리스트 Grid 정보변경 */
    public static final String CONST_VOTE_LIST_UPDATE = "VOTE_LIST_UPDATE";

    /** 투표 Grid 저장 */
    public static final String CONST_VOTE_INFO_SAVE = "VOTE_INFO_SAVE";
    /** 투표 Grid 수정 */
    public static final String CONST_VOTE_INFO_UPDATE = "VOTE_INFO_UPDATE";


    /*
     */

    /** 에필로그 관리 리스트 Grid 정보변경 *//*
    public static final String CONST_EVENT_LIST_UPDATE = "EVENT_LIST_UPDATE";
    *//** 에필로그 관리 리스트 Grid 정보변경 *//*
    public static final String CONST_EVENT_LIST_DISP_UPDATE = "EVENT_LIST_DISP_UPDATE";
    
    public static final String CONST_FAQ_LIST_DELETE = "FAQ_LIST_DELETE";
    
    public static final String CONST_FAQ_SET_LIST_DELETE = "FAQ_SET_LIST_DELETE";
    *//** 이벤트대상자구분코드 변경 *//*
    public static final String CONST_CHANGE_TGTR_SCT = "CHANGE_TGTR_SCT";
    *//** 이벤트당첨취소, 이벤트당첨자혜택관계정보 삭제 *//*
    public static final String CONST_WIN_BY_LOTS_CANCEL = "WIN_BY_LOTS_CANCEL";
    *//** 이벤트당첨자변경 *//*
    public static final String CONST_WIN_BY_LOTS_SAVE = "WIN_BY_LOTS_SAVE";
    */
    /** 이벤트SMS발송, 이벤트SMS발송정보 변경 *//*
    public static final String CONST_SEND_SMS = "SEND_SMS";
    
    */

    /* [추가 시작] / [QMS 연계] / [2020.03.11] / [junydad] / QC변경상태코드 추가 */
    //QC변경상태 코드(PRD301, 10:QC재요청, 20:QC재승인반려, 30:QC재승인완료)
    public static final String PR_GOODS_QC_RE_REQ = "10";
    public static final String PR_GOODS_QC_RE_REJT = "20";
    public static final String PR_GOODS_QC_RE_APPL = "30";

    public static final String PR_GOODS_QC_APPL_CMPL = "30";
    public static final String PR_GOODS_QC_REJECT = "40";
    /* [추가 종료] / [QMS 연계] / [2020.03.11] / [junydad] / QC변경상태코드 추가 */

    //## 리뷰고도화 Abusing 리턴 코드 ##
    public static final String PR_GDAS_RV_ABUSNG_5101 = "5101";
    public static final String PR_GDAS_RV_ABUSNG_5102 = "5102";
    public static final String PR_GDAS_RV_ABUSNG_5103 = "5103";
    public static final String PR_GDAS_RV_ABUSNG_5104 = "5104";
    public static final String PR_GDAS_RV_ABUSNG_5105 = "5105";
    public static final String PR_GDAS_RV_ABUSNG_5106 = "5106";
    public static final String PR_GDAS_RV_ABUSNG_5109 = "5109";	// 동일음절 갯수 체크
    public static final String PR_GDAS_RV_ABUSNG_5110 = "5110";	// 특수문자 갯수 체크

    // 네이버페이 페이지 전환방식
    public static final String NAVER_PAY_OPEN_TYPE_PAGE = "page";

    /* 간편로그인 상수 */
    public static final String EASYLOGIN_GUBUN_MC_WEB = "mcWeb";
    public static final String EASYLOGIN_GUBUN_MC_APP = "mcApp";
    public static final String EASYLOGIN_GUBUN_PC = "pc";
    public static final String EASYLOGIN_TYPE_KAKAO = "kakao";
    public static final String EASYLOGIN_TYPE_APPLE = "apple";

    /* 로그인 상수 */
    public static final String LOGIN_TYPE_BIO = "bio";
    public static final String LOGIN_TYPE_AUTO = "auto";
    
    /**
     *  [] 기프트카드 유효기간만료 예정 알림톡
     */
    public static final String KAKAOBIZ_TEMP_CODE_GIFTCARD_RE_MIND_EXP = "gift04";
    
    public static final String KAKAOBIZ_TEMP_CODE_GIFTCARD_RE_MIND = "gift06";

    public static final String COLON_DELIMITER = ":";
    
    // 1:1문의 대분류
    public static final String COUNSEL_LRG_ONLINE = "200";
    public static final String COUNSEL_LRG_O2O = "300";
    public static final String COUNSEL_LRG_OFFLINE = "400";

    /***
     * [ 오늘드림] 매장회송
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_DELIVERY_RETURN = "today11";

    /**
     *  [] 오늘드림 24H 주문 완료
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_24H_ORDER_REG = "today12";
    /**
     *  [] 오늘드림 24H  배송시작
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_24H_DELIVERY_START = "today13";
    /**
     *  [] 오늘드림 24H 택배변경
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_24H_ORD_TRANSE = "today14";
    /**
     *  [] 오늘드림 24H 배송 완료
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_24H_DELIVERY_COMPLETE_PAYMENT = "today15";
    /**
     *  [] 오늘드림 24H 배송 완료(배송완료 이미지 포함)
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_24H_DELIVERY_COMPLETE_IMAGE = "today16";
    /**
     *  [] 오늘드림 24H 자동취소
     */
    public static final String KAKAOBIZ_TEMP_CODE_O2O_24H_ORD_CANCEL_VROONG = "today17";

}    
