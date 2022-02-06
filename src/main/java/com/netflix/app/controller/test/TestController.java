package com.netflix.app.controller.test;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.netflix.app.common.constants.Constants62life;
import com.netflix.app.common.util.EncryptAES;
import com.netflix.app.common.util.MessageUtils;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value="/test1")
    public String testmessage(@RequestParam Map<String, Object> paramMap
    												, HttpServletRequest request
										            , Model model) throws Exception {
    	
    	System.out.println("=============== T E S T ==============");

    	// ------------------------------------------
    	// 메세지 테스트
    	// ------------------------------------------
    	System.out.println("error.common: "+MessageUtils.getMessage("error.common"));
    	System.out.println("error.minlength: "+MessageUtils.getMessage("error.minlength", new String[] {"테스트글자", "2"}));
    	
   		
   		return "test/test1";
    }
        
    
    @RequestMapping(value="/test2")
    public String test2(@RequestParam Map<String, Object> paramMap
    		, HttpServletRequest request
    		, Model model) throws Exception {
    	
    	String test = "";
    	String id = EncryptAES.Decrypt("ttochi37", Constants62life.ENC_KEY_NAME);
    	//String pw = EncryptAES.Decrypt("803F913F5DCB2038E06495EB1E42EA621136F4B54644E7DBAEFF2B5725756EFB", Constants62life.ENC_KEY_NAME);    
    	
    	System.out.println("id = " + id);
    	//System.out.println("pw = " + pw);
    	
    	return "test/test1";
    }
}
    
    
