package com.x62life.mo.model.common;

/**
 * @FileName      : Code.java
 * @Date        : 2021. 3. 22.
 * @프로그램 설명     :
 */
public class Code {
    
    /**
     *  고객센터 전화번호
     */
    static public final String CALL_CENTER_TEL = ""; // 고객센터 전화번호
    
    /**
     * 이메일 관련 세팅 
     */
    static public final String EMAIL_SENDER_EMAIL = ""; // 발신자 이메일
    static public final String EMAIL_SENDER_NAME  = "";         // 발신자 이름
    static public final String EMAIL_RETURN_EMAIL = ""; // 리턴 이메일
    
    /**
     *  로그인
     */
    static public final int LOGIN_SUCCESS = 00; // 로그인 성공
    static public final int LOGIN_OVERLAP_LOGIN = 01; // 중복로그인 
    static public final int LOGIN_ID_LOCK = 02; // 계정 잠김 
    static public final int LOGIN_PW_INCORRECT = 03; // 비밀번호와 로그인 비밀번호가 일치하지 않음
    static public final int LOGIN_OTP_INCORRECT = 04; // OTP가 일치하지 않음    
    static public final int LOGIN_ID_NULL = 05;// 등록되지 않은 아이디
        
    static public final int LOGIN_FAIL = 10;// 로그인 아이디 필요
    static public final int LOGIN_ID_INVALID = 11;// 로그인 아이디 필요
    static public final int LOGIN_PW_INVALID = 12;// 로그인 비밀번호 필요
    
    
    /**
     *  공통코드 시작
     */
    
    public static final int COMMON_MEMBER_TYPE = 79;    // 회원구분코드(개인회원 , 기업회원 , 간편회원, SNS회원)
    public static final int MEMBER_TYPE_SIMPLE = 1961;  // 이메일 간편회원
    public static final int MEMBER_TYPE_SNS = 2952;     // SNS 회원
    public static final int SNS_MEMBER_NAVER_GRADE = 2953;  // SNS 회원 - NAVER
    public static final int SNS_MEMBER_KAKAOTALK_GRADE = 2954;  // SNS 회원 - KAKAOTALK
    public static final int SNS_MEMBER_FACEBOOK_GRADE = 2955;  // SNS 회원 - FACEBOOK
    
    // 로고 타입
    public static final int LOGO_TYPE = 2932;
    public static final int LOGO_TYPE_ADMIN_LOGIN = 2933;
    public static final int LOGO_TYPE_ADMIN = 2934;
    public static final int LOGO_TYPE_WEB = 2935;
    public static final int LOGO_TYPE_MOBILE = 2936;
    
    // 상품 제목 길이
    public static final int PRODUCT_TITLE_LENGTH_MAX = 20;
    
}
