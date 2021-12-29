package com.x62life.mo.common.util.request;

import com.x62life.mo.common.constants.Constants;
import com.x62life.mo.common.util.TextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.*;

/**
 * Request Wapper...
 * 
 * @author dragonslam
 *
 */
public class RequestWapper extends HttpServletRequestWrapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestWapper.class);
    private HttpServletResponse response = null;

    /**
     * @param request
     */
    public RequestWapper(HttpServletRequest request) {
        super(request);
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public HttpSession getSession() {
        HttpSession session = super.getSession();
        processSessionCookie(session);
        return session;
    }

    public HttpSession getSession(boolean create) {
        HttpSession session = super.getSession(create);
        processSessionCookie(session);
        return session;
    }

    /**
     * getParameterValues()
     */
    @Override
    public String[] getParameterValues(String parameter) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(">>>> getParameterValues({}) ", parameter);
        }

        String[] results = super.getParameterValues(parameter);

        if (results == null) {
            return null;
        }

        int count = results.length;
        String[] trimReqults = new String[count];

        for (int i = 0; i < count; i++) {
            trimReqults[i] = results[i].trim();
            trimReqults[i] = TextUtil.cleanXSS(trimReqults[i]);
        }

        return trimReqults;
    }

    /**
     * getParameter()
     */
    @Override
    public String getParameter(String name) {
        String result = super.getParameter(name);

        if (result == null) {
            return null;
        }
        return TextUtil.cleanXSS(result);
    }

    /**
     * getOrginParameter()
     */
    public String getOrginParameter(String name) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(">>>> getOrginParameter({}) ", name);
        }

        return super.getParameter(name);
    }

    /**
     * getHeader()
     */
    @Override
    public String getHeader(String name) {
        String result = super.getHeader(name);

        if (result == null) {
            return null;
        }
        return TextUtil.cleanXSS(result);
    }

    private void processSessionCookie(HttpSession session) {
        if (session == null || response == null) {
            return;
        }

        Object cookieOverWritten = getAttribute("COOKIE_OVERWRITTEN_FLAG");
        String contextPath = getContextPath();
        if (cookieOverWritten == null && isSecure() && isRequestedSessionIdFromCookie() &&contextPath != null && (contextPath.contains("store") || contextPath.contains("m")) ) {

            //Cookie baseCookie = new Cookie("JSESSIONID", null);
            Cookie cookie = new Cookie(Constants.COOKIE_JSESSION_ID, session.getId());
            
            //baseCookie.setMaxAge(0);
            cookie.setMaxAge(-1);

            
            if (contextPath.length() > 0) {
                //baseCookie.setPath(contextPath+"/");
                cookie.setPath(contextPath);
            }
            
//           cookie.setHttpOnly(true);
            cookie.setSecure(false);
            //response.addCookie(baseCookie);
            response.addCookie(cookie);


//    		SameSiteUtil sameSiteUtil = new SameSiteUtil((HttpServletRequest)this.getRequest());
//    		if(sameSiteUtil.isAddSameSiteCookies()) {
//    			sameSiteUtil.addSameSiteOption(response);
//    		}
            
            setAttribute("COOKIE_OVERWRITTEN_FLAG", "true");

        }

    }

}