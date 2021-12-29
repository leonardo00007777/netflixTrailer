package com.x62life.mo.controller.member;


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
@RequestMapping("/member")
public class MemberController
{
	private static final Logger logger = Logger.getLogger("MemberController.class");
	
	@Autowired
	private MemberService memberService;
	
    /**
     * 회원가입 페이지
     *
     * @param memberInfo
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/joinmember")
	public ModelAndView joinmember(@RequestParam Map<String, Object> paramMap, Model model) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		logger.info("/member/joinMember");

		paramMap.put("test", null);
		
		mv.setViewName("/member/joinMember");

		return mv;
    }
    
    /**
     * 회원가입 페이지 (일반가입 / 간편가입 선택화면)
     *
     * @param memberInfo
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/joinmemberchoice")
    public ModelAndView joinmemberchoice(@RequestParam Map<String, Object> paramMap, Model model) throws Exception{
    	ModelAndView mv = new ModelAndView();
    	
    	logger.info("/member/joinMemberChoice");
    	
    	paramMap.put("test", null);
    	
    	mv.setViewName("/member/joinMemberChoice");
    	
    	return mv;
    }
    
    /**
     * 회원가입 폼
     *
     * @param memberInfo
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/joinmemberform")
    public ModelAndView joinmemberform(@RequestParam Map<String, Object> paramMap, Model model) throws Exception{
    	ModelAndView mv = new ModelAndView();
    	
    	logger.info("/member/joinMemberForm");
    	
    	paramMap.put("test", null);
    	
    	mv.setViewName("/member/joinMemberForm");
    	
    	return mv;
    }
    
    /**
     * 회원가입 폼 (SK)
     *
     * @param memberInfo
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/joinmemberformsk")
    public ModelAndView joinMemberFormSK(@RequestParam Map<String, Object> paramMap, Model model) throws Exception{
    	ModelAndView mv = new ModelAndView();
    	
    	logger.info("/member/joinMemberFormSK");
    	
    	paramMap.put("test", null);
    	
    	mv.setViewName("/member/joinMemberFormSK");
    	
    	return mv;
    }
	
	@RequestMapping(value="/list", method={RequestMethod.GET, RequestMethod.POST})
	public String list(ModelMap model, HttpServletRequest request, HttpServletResponse response, MbMaster memberParam)
	{
		logger.info("/member/list");
		
		
		return "memberList";
	}
	
	
	/*
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String registerView(ModelMap model, HttpServletRequest request, HttpServletResponse response, MbMaster memberParam)
	{
		logger.info("[GET] /member/register");

		return "memberRegister";
	}
	
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String  register(ModelMap model, HttpServletRequest request, MbMaster memberParam)
	{
		logger.info("[POST] /member/register");
    	
    	return "jsonView";
	}
	
	
	@RequestMapping(value="/modify/{memberseqno}", method=RequestMethod.GET)
	public String modifyView(ModelMap model, HttpServletRequest request, HttpServletResponse response, MbMaster memberParam, @PathVariable long MbMasterseqno)
	{
		logger.info("[GET] /member/modify");
		
		if (!hasAuthority(request)) {
			try {
				response.sendRedirect("/recallportal/index.jsp");
			} catch (IOException e) {
				return "error_403";
			}
		}
		
		model.addAttribute("memberTypeList", "");
		model.addAttribute("statusList", "");
		
		return "memberModify";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(ModelMap model, HttpServletRequest request, MbMaster memberParam) throws Exception
	{
		logger.info("[POST] /member/modify");
		
		model.addAttribute("key1", "value1");
		
		return "jsonView";
	}
	
	
	
	@RequestMapping(value="/resetPassword", method=RequestMethod.POST)
	public String  resetPassword(ModelMap model, HttpServletRequest request, MbMaster memberParam)
	{
		model.addAttribute("key1", "value1");
    	
    	return "jsonView";
	}
	
	
	
	@RequestMapping(value="/changePassword", method=RequestMethod.POST)
	public String  changePassword(ModelMap model, HttpServletRequest request, MbMaster memberParam) throws Exception
	{
		logger.info("[POST] /member/modify");
		
		model.addAttribute("key1", "value1");
		
    	return "jsonView";
	}
	*/
	
	
	/*
	 * ADM only
	 */
	private boolean hasAuthority(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		if (session == null) {
			return false;
		}
		
//		SSOMbMaster ssoMbMaster = (SSOMbMaster) session.getAttribute("ssoMbMaster");
//		if (ssoMbMaster == null) {
//			return false;
//		}
//		
//		String MbMasterType = ssoMbMaster.getMbMasterType();
		
//		if (!"ADM".equals(MbMasterType)) {
//			return false;
//		}
		
		return true;
	}
	
}
