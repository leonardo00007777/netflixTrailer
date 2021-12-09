package com.x62life.mo.controller.member;


import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.x62life.mo.model.member.MbMaster;
import com.x62life.mo.service.member.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController
{
	private static final Logger logger = Logger.getLogger("MemberController.class");
	
	@Autowired
	private MemberService memberService;
	
	
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
