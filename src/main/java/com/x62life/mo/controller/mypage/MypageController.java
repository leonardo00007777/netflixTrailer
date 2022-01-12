package com.x62life.mo.controller.mypage;


import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.service.member.MemberService;

@Controller
@RequestMapping(value = "/mypage")
public class MypageController {

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
    
	//---------------------------------------------
	// 나의 주문
	//---------------------------------------------    
	/**
	 * 주문/배송 내역
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/myorderdelivery")
	public ModelAndView myorderdelivery(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/myorderdelivery");
		
		mv.setViewName("/mypage/myOrderDelivery");   		
		
		return mv;
	}    
	
	/**
	 * 취소/교환/반품 내역
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/mycancelrebate")
	public ModelAndView mycancelrebate(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/mycancelrebate");
		
		mv.setViewName("/mypage/myCancelRebate");   		
		
		return mv;
	}    
	
	/**
	 * 정기배송 관리
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/myregulardelivery")
	public ModelAndView myregulardelivery(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/myregulardelivery");
		
		mv.setViewName("/mypage/myRegularDelivery");   		
		
		return mv;
	}    
	
	//---------------------------------------------
	// 나의 정보
	//---------------------------------------------	
	/**
	 * 개인정보 관리
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/myinfo")
	public ModelAndView myinfo(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/myinfo");
		
		mv.setViewName("/mypage/myInfo");   		
		
		return mv;
	}    
	
	/**
	 * 배송지 관리
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/mydeliveryplace")
	public ModelAndView mydeliveryplace(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/mydeliveryplace");
		
		mv.setViewName("/mypage/myDeliveryPlace");   		
		
		return mv;
	}    
	
	//---------------------------------------------
	// 나의 활동 
	//---------------------------------------------	
	/**
	 * 작성 가능한 구매후기
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/myreview")
	public ModelAndView myreview(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/myreview");
		
		mv.setViewName("/mypage/myReview");   		
		
		return mv;
	}    
	
	/**
	 * 상품 문의 내역
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/mygoodsqna")
	public ModelAndView mygoodsqna(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/mygoodsqna");
		
		mv.setViewName("/mypage/myGoodsQna");   		
		
		return mv;
	}    
	
	/**
	 * 1:1 문의 내역
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/myqnalist")
	public ModelAndView myqnalist(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/myqnalist");
		
		mv.setViewName("/mypage/myQnaList");   		
		
		return mv;
	}    
	
	/**
	 * 1:1 문의 
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/myqna")
	public ModelAndView myqna(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/myqna");
		
		mv.setViewName("/mypage/myQna");   		
		
		return mv;
	}    
	
	/**
	 * 댓글 내역
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/myreply")
	public ModelAndView myreply(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/myreply");
		
		mv.setViewName("/mypage/myReply");   		
		
		return mv;
	}    
	
	/**
	 * 이벤트 참여 내역
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/myeventapply")
	public ModelAndView myeventapply(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/myeventapply");
		
		mv.setViewName("/mypage/myEventApply");   		
		
		return mv;
	}    
	
	/**
	 * 친구 추천하기
	 *
	 * @param memberInfo
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/myrecommend")
	public ModelAndView myrecommend(@RequestParam Map<String, Object> paramMap
			, HttpServletRequest request
			, HttpServletResponse response
			, Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		logger.info("/myrecommend");
		
		mv.setViewName("/mypage/myRecommend");   		
		
		return mv;
	}    
	
}
