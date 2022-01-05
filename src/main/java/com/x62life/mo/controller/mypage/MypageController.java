package com.x62life.mo.controller.mypage;


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
public class MypageController
{
	private static final Logger logger = Logger.getLogger("MemberController.class");
	
	@Autowired
	private MemberService memberService;
	
    /**
     * mypage 페이지
     *
     * @param memberInfo
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/mypage")
	public ModelAndView mypage(@RequestParam Map<String, Object> paramMap, Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		logger.info("/mypage");
		paramMap.put("member", null);
	    paramMap.put("memstOut", "10");	// 회원상태
	    
		//-----------------------------------------------------
		// 로그인 회원정보
		//-----------------------------------------------------
    	LoginProcess memberInfo = memberService.selectMemberInfo(paramMap);
	    if(memberInfo != null) {
	    	
	    	String strRSMEMCD = memberInfo.getMemcd();  		   // 회원cd
	    	String strMEMstcd = memberInfo.getMemstcd();  		   // 회원상태
	    	String strRSIslocked = memberInfo.getIslocked(); 		   // 잠김여부
	    	String strRsPassYn = memberInfo.getPassyn(); 			   // 비번여부 (비밀번호 실패횟수)
	    	String strRSMEMID = memberInfo.getMemid(); 			   // 회원id
	    	String strRSMEMNAME = memberInfo.getMemname(); // 회원명
	    	String strRSNickn = memberInfo.getNickn(); 
	    	String strRSIdUrl = memberInfo.getIdurl();  
	    	String strRSMemLevel = memberInfo.getMemlevel();   
	    	String strRSJobType = memberInfo.getJobtype(); 
	    	String strRSJobName = memberInfo.getJobname();  
	    	String strRSIsblogger = memberInfo.getIsblogger();  
	    	int strRSLogin_failed_count = memberInfo.getLoginFailedCount();   
	    	
	    	
	    }
	    	

		model.addAttribute("loginuserid", (String) paramMap.get("loginuserid"));
		model.addAttribute("loginpassword", (String) paramMap.get("loginpassword"));
		
		mv.setViewName("/mypage/mypage");

		return mv;
    }
    
}
