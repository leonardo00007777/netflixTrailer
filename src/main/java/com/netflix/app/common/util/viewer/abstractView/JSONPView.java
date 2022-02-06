package com.netflix.app.common.util.viewer.abstractView;

import com.netflix.app.common.util.StringUtil;
import net.sf.json.JSONObject;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

public class JSONPView extends AbstractView {
    public JSONPView() {
        setContentType( "text/json; charset=utf-8");
    }


    @Override
    protected void renderMergedOutputModel(Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception {

        JSONObject jsonObject = JSONObject.fromObject(map);

        response.setContentType( "text/json; charset=utf-8");
        response.setHeader("Cache-Control", "no-cache");
        PrintWriter out = response.getWriter();

        String callback = StringUtil.getString(request.getParameter("request"), "");
        if ("".equals(callback)){
            out.write(callback+"("+jsonObject.toString()+")");
        } else {
            out.write(jsonObject.toString());
        }
        out.flush();

    }
}
