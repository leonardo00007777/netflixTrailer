package com.x62life.mo.common.util.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class BrandTag extends TagSupport{

	private static final long serialVersionUID = 6828720489628497555L;
	private String brandCD = "";

    public String getBrandCD(){
    	return brandCD;
    }
    
    public void setBrandCD(String brandCD){
    	this.brandCD = brandCD;
    }

    public String resultView(String brandCD) throws JspException{
    	
    	String brand = "withnature";
    	return brand;
    }

    @Override
    public int doEndTag() throws JspException {
        // TODO Auto-generated method stub
        try{
            JspWriter out = pageContext.getOut();
            String contents = resultView(brandCD);
            out.println(contents);

            return EVAL_PAGE;
        }catch(IOException e){
            throw new JspException();
        }
    }	
	
}
