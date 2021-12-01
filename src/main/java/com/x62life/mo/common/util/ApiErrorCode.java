package com.x62life.mo.common.util;


/**
 * 인터페이스 응답 결과
 */
public class ApiErrorCode {
	
	public static final String PREFIX = "error.api.";
	
	/* 인터페이스 응답 결과 코드 */
	// 성공
	public static final String ERROR_0000 = PREFIX+"0000";		
	// 헤더 정보가 잘못되었습니다.
	public static final String ERROR_E001 = PREFIX+"E001";		
	// 요청 정보가 잘못되었습니다.(xxx)
	public static final String ERROR_E002 = PREFIX+"E002";		
	// 서비스 중 오류가 발생하였습니다. (서버)
	public static final String ERROR_E003 = PREFIX+"E003";		
	// 서비스 중 오류가 발생하였습니다. (DB)
	public static final String ERROR_E004 = PREFIX+"E004";		
	// 요청하신 서비스가 없습니다.
	public static final String ERROR_E005 = PREFIX+"E005";		
	// Device ID 정보가 없습니다.
	public static final String ERROR_E006 = PREFIX+"E006";		
	// 사용자 정보가 없습니다.
	public static final String ERROR_E007 = PREFIX+"E007";		
	// 로그인이 필요한 서비스입니다.
	public static final String ERROR_E008 = PREFIX+"E008";		
	// 앱 구분(위변조방지)키가 일치하지 않습니다.
	public static final String ERROR_E009 = PREFIX+"E009";		
	// 요청 프로토콜이 잘못되었습니다.
	public static final String ERROR_E010 = PREFIX+"E010";		
}
