package com.netflix.app.controller.cscenter;


import com.netflix.app.common.constants.Constants62life;
import com.netflix.app.model.login.LoginProcess;
import com.netflix.app.model.member.MbMaster;
import com.netflix.app.service.member.MemberService;
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
	
	//---------------------------------------------
    // 고객 센터
    //---------------------------------------------	
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
    
    /**
     * 풍성한 가입 혜택
     *
     * @param memberInfo
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/joinbenefit")
    public ModelAndView joinbenefit(@RequestParam Map<String, Object> paramMap
    		, HttpServletRequest request
    		, HttpServletResponse response
    		, Model model) throws Exception {
    	ModelAndView mv = new ModelAndView();
    	logger.info("/joinbenefit");
    	
    	mv.setViewName("/cscenter/joinbenefit");   		
    	
    	return mv;
    }
        
    /**
     * 멤버십 안내
     *
     * @param memberInfo
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/joinguide")
    public ModelAndView joinguide(@RequestParam Map<String, Object> paramMap
    		, HttpServletRequest request
    		, HttpServletResponse response
    		, Model model) throws Exception {
    	ModelAndView mv = new ModelAndView();
    	logger.info("/joinguide");
    	
    	mv.setViewName("/cscenter/joinguide");   		
    	
    	return mv;
    }
    
}
