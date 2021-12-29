package com.x62life.mo.common.util.request;

import com.x62life.mo.common.util.TextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Request Wapper...
 * 
 * @author dragonslam
 *
 */
public class RequestSearchWapper extends RequestWapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestSearchWapper.class);

    /**
     * @param request
     */
    public RequestSearchWapper(HttpServletRequest request) {
        super(request);
    }

    /**
     * getParameter()
     */
    @Override
    public String getParameter(String name) {
        String result = super.getOrginParameter(name);

        if (result == null) {
            return null;
        }
        return TextUtil.cleanXSS4(result);
    }

}