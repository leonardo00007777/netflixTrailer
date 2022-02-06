package com.netflix.app.common.exception;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Controller
//@RestControllerAdvice
public class WebRestControllerAdvice {

	private Map resMap = new ConcurrentHashMap();

	@ExceptionHandler(DoubleEmailException.class)
	public Map handleDoubleEmailException(DoubleEmailException ex, HttpServletResponse response) throws IOException {
		response.setStatus(601, "이메일 중복");
//		return ex.getParamMap();
		// resMap.put("status", response.getStatus());
		resMap.put("error", "이메일 중복");
		return resMap;
	}

	@ExceptionHandler(DoubleNameException.class)
	public Map handleDoubleNameException(DoubleNameException ex, HttpServletResponse response) throws IOException {
		response.setStatus(602, "이름 중복");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "이름 중복");
		return resMap;
	}

	@ExceptionHandler(MailAuthException.class)
	public Map mailAuthException(MailAuthException ex, HttpServletResponse response) throws IOException {
		response.setStatus(603, "메일 인증 실패");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "메일 인증 실패");
		return resMap;
	}

	@ExceptionHandler(SocialAuthFailException.class)
	public Map socialAuthFailException(SocialAuthFailException ex, HttpServletResponse response) throws IOException {
		response.setStatus(604, "소셜 인증 실패");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "소셜 인증 실패");
		return resMap;
	}

	@ExceptionHandler(LoginCredentialFailException.class)
	public Map loginCredentialFailException(LoginCredentialFailException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(605, "로그인 인증 실패");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "로그인 인증 실패");
		return resMap;
	}

	@ExceptionHandler(NoMailAuthCheckException.class)
	public Map noMailAuthCheckException(NoMailAuthCheckException ex, HttpServletResponse response) throws IOException {
		response.setStatus(606, "메일 본인인증 미완료");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "메일 본인인증 미완료");
		return resMap;
	}

	@ExceptionHandler(NoExistNameException.class)
	public Map noExistNameException(NoExistNameException ex, HttpServletResponse response) throws IOException {
		response.setStatus(607, "존재 하지 않는 이름(메일 찾기)");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "존재 하지 않는 이름(메일 찾기)");
		return resMap;
	}

	@ExceptionHandler(NoExistEmailException.class)
	public Map noExistEmailException(NoExistEmailException ex, HttpServletResponse response) throws IOException {
		response.setStatus(608, "존재 하지 않는 이메일(비밀번호 재설정)");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "존재 하지 않는 이메일(비밀번호 재설정)");
		return resMap;
	}

	@ExceptionHandler(MisMatchMemberInfoException.class)
	public Map misMatchMemberInfoException(MisMatchMemberInfoException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(609, "사용자 정보 불일치(비밀번호 재설정)");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "사용자 정보 불일치(비밀번호 재설정)");
		return resMap;
	}

	@ExceptionHandler(UnauthorizedJwtException.class)
	public Map unauthorizedJwtException(UnauthorizedJwtException ex, HttpServletResponse response) throws IOException {
		response.setStatus(610, "Jwt 토큰 인증 실패");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "Jwt 토큰 인증 실패");
		return resMap;
	}

	@ExceptionHandler(MailSendException.class)
	public Map mailSendException(MailSendException ex, HttpServletResponse response) throws IOException {
		response.setStatus(611, "메일 발송 실패");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "메일 발송 실패");
		return resMap;
	}

	@ExceptionHandler(PasswordResetTimeExpiredException.class)
	public Map passwordResetTimeExpiredException(PasswordResetTimeExpiredException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(612, "비밀번호 재설정 메일발송후 10분 초과");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "비밀번호 재설정 메일발송후 10분 초과");
		return resMap;
	}

	@ExceptionHandler(NotYetAdminAuthException.class)
	public Map notYetAdminAuthException(NotYetAdminAuthException ex, HttpServletResponse response) throws IOException {
		response.setStatus(613, "관리자 권한 승인 미완료");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "관리자 권한 승인 미완료");
		return resMap;
	}

	@ExceptionHandler(EncrytException.class)
	public Map encrytException(EncrytException ex, HttpServletResponse response) throws IOException {
		response.setStatus(614, "메세지 암호화 처리 오류");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "메세지 암호화 처리 오류");
		return resMap;
	}

	@ExceptionHandler(AccessAuthException.class)
	public Map accessAuthException(AccessAuthException ex, HttpServletResponse response) throws IOException {
		response.setStatus(615, "접근 권한 오류");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "접근 권한 오류");
		return resMap;
	}

	@ExceptionHandler(NotPasswordSetTenantException.class)
	public Map notPasswordSetTenantException(NotPasswordSetTenantException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(616, "비밀번호 설정 미완료 입주인");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "비밀번호 설정 미완료 입주인");
		return resMap;
	}

	@ExceptionHandler(FailTenantApiCallException.class)
	public Map failTenantApiCallException(FailTenantApiCallException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(617, "입주사 회원 비밀번호 확인 외부 api요청 실패");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "입주사 회원 비밀번호 확인 외부 api요청 실패");
		return resMap;
	}
	
	@ExceptionHandler(NotExistMemberException.class)
	public Map notExistMemberException(NotExistMemberException ex, HttpServletResponse response) throws IOException {
		response.setStatus(618, "존재하지 않는 화원(회원탈퇴)");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "존재하지 않는 화원(회원탈퇴)");
		return resMap;
	}

	@ExceptionHandler(SamePasswordException.class)
	public Map samePasswordException(SamePasswordException ex, HttpServletResponse response) throws IOException {
		response.setStatus(619, "동일 패스워드 오류 (비밀번호 찾기)");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "동일 패스워드 오류 (비밀번호 찾기)");
		return resMap;
	}

	@ExceptionHandler(NotYetMemberException.class)
	public Map notYetMemberException(NotYetMemberException ex, HttpServletResponse response) throws IOException {
		response.setStatus(620, "이노베이션허브 미가입 사용자 (SSO)");
//		ex.getParamMap().put("status", 620);
//		ex.getParamMap().put("error", "이노베이션허브 미가입 사용자 (SSO)");
//
//		return ex.getParamMap();
		
		resMap.put("status", 620);
		resMap.put("error", "이노베이션허브 미가입 사용자 (SSO)");
		return resMap;
	}

	@ExceptionHandler(NotSsoAgreeMemberException.class)
	public Map notSsoAgreeMemberException(NotSsoAgreeMemberException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(621, "SSO 미동의 사용 (SSO)");
//		ex.getParamMap().put("status", 621);
//		ex.getParamMap().put("error", "SSO 미동의 사용 (SSO)");
//		return ex.getParamMap();
		
		resMap.put("status", 621);
		resMap.put("error", "SSO 미동의 사용 (SSO)");
		return resMap;
	}

	@ExceptionHandler(MisSsoAgreePassword.class)
	public Map misSsoAgreePassword(MisSsoAgreePassword ex, HttpServletResponse response) throws IOException {
		response.setStatus(622, "SSO 동의 비밀번호 불일치 (SSO)");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "SSO 동의 비밀번호 불일치 (SSO)");
		return resMap;
	}
	
	@ExceptionHandler(SocialEmailMemberException.class)
	public Map socialEmailMemberException(SocialEmailMemberException ex, HttpServletResponse response) throws IOException {
		response.setStatus(623, "소셜 로그인 오류 (이메일 회원)");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "소셜 로그인 오류 (이메일 회원)");
		return resMap;
	}

	@ExceptionHandler(FailBorrowPlaceApiCallException.class)
	public Map failBorrowPlaceApiCallException(FailBorrowPlaceApiCallException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(624, "대관신청 등록 외부 api요청 실패");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "대관신청 등록 외부 api요청 실패");
		return resMap;
	}
	
	@ExceptionHandler(ApplyEventNotmember.class)
	public Map applyEventNotmember(ApplyEventNotmember ex, HttpServletResponse response) throws IOException {
		response.setStatus(200, "이벤트등록성공 (비회원)");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "이벤트등록성공 (비회원)");
		return resMap;
	}
	
	@ExceptionHandler(AlreadyApplyEvent.class)
	public Map alreadyApplyEvent(AlreadyApplyEvent ex, HttpServletResponse response) throws IOException {
		response.setStatus(701, "이미 신청한 이벤트");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "이미 신청한 이벤트");
		return resMap;
	}
	
	@ExceptionHandler(FailApplyEvent.class)
	public Map failApplyEvent(FailApplyEvent ex, HttpServletResponse response) throws IOException {
		response.setStatus(702, "이벤트신청 실패 (모집정원초과)");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "이벤트신청 실패 (모집정원초과)");
		return resMap;
	}
	
	@ExceptionHandler(FailApplyEventNotmember.class)
	public Map failApplyEventNotmember(FailApplyEventNotmember ex, HttpServletResponse response) throws IOException {
		response.setStatus(703, "이벤트신청 실패 (비회원)");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "이벤트신청 실패 (비회원)");
		return resMap;
	}

	@ExceptionHandler(AlreadyTempSavePlayerDB.class)
	public Map alreadyTempSavePlayerDB(AlreadyTempSavePlayerDB ex, HttpServletResponse response) throws IOException {
		response.setStatus(731, "이미 신청 작성중인 playerdb 존재");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "이미 신청 작성중인 playerdb 존재");
		return resMap;
	}

	@ExceptionHandler(MismatchPlayerDBNo.class)
	public Map mismatchPlayerDBNo(MismatchPlayerDBNo ex, HttpServletResponse response) throws IOException {
		response.setStatus(732, "playerdb 고유번호 불일치");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "playerdb 고유번호 불일치");
		return resMap;
	}
	
	@ExceptionHandler(FailDoubleValueException.class)
	public Map failDoubleValueException(FailDoubleValueException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(733, "예약 시간대가 중복됩니다.");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "예약 시간대가 중복됩니다.");
		return resMap;
	}
	
	@ExceptionHandler(FailDeletePhotoException.class)
	public Map failDeletePhotoException(FailDeletePhotoException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(734, "삭제된 포토갤러리는 수정이 되지 않습니다.");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "삭제된 포토갤러리는 수정이 되지 않습니다.");
		return resMap;
	}

	@ExceptionHandler(DuplicatePostDateAccKindException.class)
	public Map DuplicatePostDateAccKindException(DuplicatePostDateAccKindException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(735, "동일한 종류의 acc는 게시기간이 중복이 되어선 않됩니다.");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "게시기간이 중복됩니다.동일한 종류의 acc는 게시기간이 중복이 되어선 않됩니다.");
		return resMap;
	}

	@ExceptionHandler(NoExistMemberIdException.class)
	public Map NoExistMemberIdException(NoExistMemberIdException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(736, "Member ID가 존재하지 않습니다.");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "Member ID가 존재하지 않습니다.");
		return resMap;
	}
	
	@ExceptionHandler(DuplicateApplicationException.class)
	public Map DuplicateApplicationException(DuplicateApplicationException ex, HttpServletResponse response)
			throws IOException {
		response.setStatus(737, "이미 지원한 내역이 있습니다.");
		// resMap.put("status", response.getStatus());
		resMap.put("error", "이미 지원한 내역이 잇습니다.");
		return resMap;
	}
	
    /**
     * global exception from server errors
     * @param response
     * @throws Exception
     */
    @ExceptionHandler(Exception.class)
    public void handleGlobalException(Exception ex, HttpServletResponse response) {
        response.setStatus(999);
        // resMap.put("error", ex.getLocalizedMessage());
        // return resMap;
    }
	
	@Getter
	public static class DoubleEmailException extends RuntimeException {

		private Map paramMap;

		public DoubleEmailException(Map paramMap) {
			this.paramMap = paramMap;
		}
	}

	@Getter
	public static class NotYetMemberException extends RuntimeException {

		private Map paramMap;

		public NotYetMemberException(Map paramMap) {
			this.paramMap = paramMap;
		}
	}

	@Getter
	public static class NotSsoAgreeMemberException extends RuntimeException {

		private Map paramMap;

		public NotSsoAgreeMemberException(Map paramMap) {
			this.paramMap = paramMap;
		}
	}

	public static class DoubleNameException extends RuntimeException {
	}

	public static class MailAuthException extends RuntimeException {
	}

	public static class SocialAuthFailException extends RuntimeException {
	}

	public static class LoginCredentialFailException extends RuntimeException {
	}

	public static class NoMailAuthCheckException extends RuntimeException {
	}

	public static class NoExistNameException extends RuntimeException {
	}

	public static class NoExistEmailException extends RuntimeException {
	}

	public static class MisMatchMemberInfoException extends RuntimeException {
	}

	public static class UnauthorizedJwtException extends RuntimeException {
	}

	public static class MailSendException extends RuntimeException {
	}

	public static class PasswordResetTimeExpiredException extends RuntimeException {
	}

	public static class NotYetAdminAuthException extends RuntimeException {
	}

	public static class EncrytException extends RuntimeException {
	}

	public static class AccessAuthException extends RuntimeException {
	}

	public static class NotPasswordSetTenantException extends RuntimeException {
	}

	public static class FailTenantApiCallException extends RuntimeException {
	}

	public static class FailBorrowPlaceApiCallException extends RuntimeException {
	}

	public static class NotExistMemberException extends RuntimeException {
	}

	public static class SamePasswordException extends RuntimeException {
	}

	public static class AlreadyApplyEvent extends RuntimeException {
	}

	public static class FailApplyEvent extends RuntimeException {
	}
	
	public static class ApplyEventNotmember extends RuntimeException {
	}
	
	public static class FailApplyEventNotmember extends RuntimeException {
	}
		
	public static class AlreadyTempSavePlayerDB extends RuntimeException {
	}

	public static class MismatchPlayerDBNo extends RuntimeException {
	}

	public static class MisSsoAgreePassword extends RuntimeException {
	}
	public static class SocialEmailMemberException extends RuntimeException {
	}
	
	public static class FailDoubleValueException extends RuntimeException {
	}
	
	public static class FailDeletePhotoException extends RuntimeException {
	}
	
	public static class DuplicatePostDateAccKindException extends RuntimeException {
	}
	public static class NoExistMemberIdException extends RuntimeException {
	}
	public static class DuplicateApplicationException extends RuntimeException {
	}	
	
}
