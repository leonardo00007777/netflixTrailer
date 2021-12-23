package com.x62life.mo.controller.test;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.x62life.mo.common.util.MessageUtils;

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
        
	
}
