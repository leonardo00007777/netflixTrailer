package com.x62life.mo.controller.cscenter;


import com.x62life.mo.common.constants.Constants62life;
import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.model.member.MbMaster;
import com.x62life.mo.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/cscenter")
public class CscenterController
{
	private static final Logger logger = Logger.getLogger("CscenterController.class");
	
	@Autowired
	private MemberService memberService;
	
    /**
     * 공지사항
     *
     * @param memberInfo
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/csnotice")
	public ModelAndView csnotice(@RequestParam Map<String, Object> paramMap
												, HttpServletRequest request
												, HttpServletResponse response
												, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/csnotice");
	    
		mv.setViewName("/cscenter/csNotice");   		
		
		return mv;
    }
    
    /**
     * 자주찾는 질문
     *
     * @param memberInfo
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/csfaq")
    public ModelAndView csfaq(@RequestParam Map<String, Object> paramMap
    		, HttpServletRequest request
    		, HttpServletResponse response
    		, Model model) throws Exception {
    	ModelAndView mv = new ModelAndView();
    	logger.info("/csfaq");
    	
    	mv.setViewName("/cscenter/csFaq");   		
    	
    	return mv;
    }
    
}
