package com.x62life.mo.controller.mypage;


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
		
		mv.setViewName("/mypage/mypage");

		return mv;
    }
    
}
