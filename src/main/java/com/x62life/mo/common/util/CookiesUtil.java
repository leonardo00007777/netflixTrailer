package com.x62life.mo.common.util;
import java.util.HashMap;

/**
 * 
 */
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.x62life.mo.model.member.MbMaster;
/**
 * @author shanth
 *
 */
public abstract class CookiesUtil {
	
    public CookiesUtil() {
    	super();
    }

	//----------------------------------------------------------------------------------------------------------------
    // Cookie 가져오기
    //----------------------------------------------------------------------------------------------------------------
    public static Cookie getCookie(HttpServletRequest request, String name) {
        Cookie cookies[] = request.getCookies();
        Cookie returnCookie = null;
        
        if(cookies != null)
        {
            for(int i = 0; i < cookies.length; i++)
            {
                if(!cookies[i].getName().equals(name))
                    continue;
                returnCookie = cookies[i];
                break;
            }
        }
        return returnCookie;
    }

    public static String getCookieValue(HttpServletRequest request, String name) {
    	
        String rtnValue = null;
        Cookie returnCookie = null;
        returnCookie = getCookie(request, name);
        if(returnCookie != null)
            rtnValue = returnCookie.getValue();
        return rtnValue;
    }

    //------------------------------------------
    // Cookie 가져오기 (회원정보)
    //------------------------------------------
	public static MbMaster getMemberCookie(HttpServletRequest request) throws Exception {
		
		try {
			Cookie cookie = getCookie(request, "cookieMemberInfo");	// 회원 cookie 값
			if (cookie != null) {
				return getFormatMemberInfo(cookie.getValue());				// 회원 cookie 값 --> 객체 return 
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}
	

	// 저장되었던 회원 cookie 값  -->  회원객체로  return
	public static MbMaster getFormatMemberInfo(String memberInfo) throws Exception {

		MbMaster member = new MbMaster();
		HashMap<String, String> memberMap = new HashMap<>();
		
		// 쿠키에 저장된 회원정보 --> Map에 담기
		if (!"".equals(memberInfo)) {
			String[] memInfoArray = TextUtil.split(memberInfo, "||");
			
			if (memInfoArray != null && memInfoArray.length > 0) {
				for (int i = 0; i < memInfoArray.length; i++) {
					memberMap.put("cookieMemberInfo" + i, memInfoArray[i]);
				}
			}
		}
		
		// 회원정보  (Map에 담긴 회원정보 --> 객체에 저장)
		member.setMemcd(TextUtil.nullToSpace((String)memberMap.get("cookieMemberInfo" + 0)));
		member.setMemid(TextUtil.nullToSpace((String)memberMap.get("cookieMemberInfo" + 1)));
		member.setMemname(TextUtil.nvl((String)memberMap.get("cookieMemberInfo" + 2), ""));
		member.setMemstcd(TextUtil.nvl((String)memberMap.get("cookieMemberInfo" + 3), "N"));
		member.setJointype(TextUtil.nvl((String)memberMap.get("cookieMemberInfo" + 4), "N"));
		member.setSnsId(TextUtil.nullToSpace((String)memberMap.get("cookieMemberInfo" + 5)));

		return member;
	}
	
	
	//----------------------------------------------------------------------------------------------------------------	
    // Cookie 설정
	//----------------------------------------------------------------------------------------------------------------	
    public static void setCookie(HttpServletRequest request, HttpServletResponse response, String name, String value, int expire) {
        Cookie cookie = getCookie(request, name);
        if(cookie == null) {
            cookie = new Cookie(name, value);
        }else {
            cookie.setValue(value);
        }
        cookie.setMaxAge(expire * 24 * 60 * 60);
        response.addCookie(cookie);
    }

    // path 추가
    public static void setCookie(HttpServletRequest request, HttpServletResponse response, String name, String value, int expire, String path) {
        Cookie cookie = getCookie(request, name);
        if(cookie == null) {
            cookie = new Cookie(name, value);
        }else {
            cookie.setValue(value);
        }
        cookie.setMaxAge(expire * 24 * 60 * 60);
        cookie.setPath(path);
        
        response.addCookie(cookie);
    }

    // path, domain 추가
    public static void setCookie(HttpServletRequest request, HttpServletResponse response, String name, String value, int expire, String path, String domain) {
        Cookie cookie = getCookie(request, name);
        if(cookie == null)
            cookie = new Cookie(name, value);
        else
            cookie.setValue(value);
        cookie.setMaxAge(expire * 24 * 60 * 60);
        cookie.setPath(path);
        cookie.setDomain(domain);
        response.addCookie(cookie);
    }

    // path, domain, secure 추가
    public static void setCookie(HttpServletRequest request, HttpServletResponse response, String name, String value
    										, int expire, String path, String domain,Boolean isSecure) {
        Cookie cookie = getCookie(request, name);
        if(cookie == null)
            cookie = new Cookie(name, value);
        else
            cookie.setValue(value);
        cookie.setMaxAge(expire * 24 * 60 * 60);
        cookie.setPath(path);
        cookie.setDomain(domain);
        cookie.setSecure(isSecure);
        response.addCookie(cookie);
    }
    
    //-------------------------
    // Cookie 설정  (회원정보)
    //-------------------------
	public static void setMemberInfoCookie(HttpServletRequest request, HttpServletResponse response, MbMaster member,int age, String domain) throws Exception {
		// 회원정보 값 (문자열 변환후, 저장)
		setCookie(request, response, "cookieMemberInfo", setFormatMemberInfo(member)
													, age, "/",domain, true);
	}
    

	// 회원정보 값 --> 문자열 변환
	public static String setFormatMemberInfo(MbMaster member) throws Exception {
		// 회원정보
		String memberInfo = addSeparatorPipe(TextUtil.nullToSpace(member.getMemcd()))
										+ addSeparatorPipe(TextUtil.nullToSpace(member.getMemid()))
										+ addSeparatorPipe(TextUtil.nvl(member.getMemname(), ""))
										+ addSeparatorPipe(TextUtil.nullToSpace(member.getMemstcd()))
										+ addSeparatorPipe(TextUtil.nullToSpace(member.getJointype()))
										+ addSeparatorPipe(TextUtil.nvl(member.getSnsId(), ""));

		return memberInfo;
	}
    
    
    //----------------------------------------------------------------------------------------------------------------
    // Cookie 삭제
	//----------------------------------------------------------------------------------------------------------------
    public static void deleteCookie(HttpServletRequest request, HttpServletResponse response, String name) {
        Cookie cookie = getCookie(request, name);
        if(cookie != null)
        {
            
        	cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
    }

    public static void deleteAllCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookies[] = request.getCookies();
        Cookie returnCookie = null;
        if(cookies != null)
        {
            for(int i = 0; i < cookies.length; i++)
            {
                returnCookie = cookies[i];
                returnCookie.setMaxAge(0);
                response.addCookie(returnCookie);
            }

        }
    }
    
    //------------------------------------------
    // 파이프 구분자 연결 형태 반환(param + '||')
    //------------------------------------------
	private static String addSeparatorPipe(Object param) {
		return param + "||";
	}    

}

