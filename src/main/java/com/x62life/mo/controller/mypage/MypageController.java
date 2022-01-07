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
	public ModelAndView mypage(@RequestParam Map<String, Object> paramMap
												, HttpServletRequest request
												, HttpServletResponse response
												, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/mypage");
	    
		// 세션 o
		HttpSession session = request.getSession(); 
		if(session != null && session.getAttribute("isLogin") != null && !session.getAttribute("isLogin").equals("")){
			String sessionMemid =  (String) request.getSession().getAttribute("memid62");
			String sessionMemcd =  (String) request.getSession().getAttribute("memcd");
			String sessionMemstcd =  (String) request.getSession().getAttribute("memstcd");
			
			//-----------------------------------------------------
			// 로그인 회원정보
			//-----------------------------------------------------
			paramMap.put("strUserId", sessionMemid);	
			paramMap.put("strRSMEMCD", sessionMemcd);	
			paramMap.put("memstOut",  "00");			//TEST "00"	
			paramMap.put("strPassword", "");	
			
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
		    	
		    	model.addAttribute("loginuserid", strRSMEMID);
		    	model.addAttribute("loginUserNm", strRSMEMNAME);

		    	mv.setViewName("/mypage/mypage");
		    	
		    }else {
		    	mv.setViewName("/login/loginForm");   		
		    }

		// 세션 x
		}else{
			mv.setViewName("/login/loginForm");   		
		}

		return mv;
    }
    
}
