package com.x62life.mo.controller.main;

import com.x62life.mo.service.BoardService;
import com.x62life.mo.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class CommonController {

    @Autowired
    BoardService boardService;

    @Autowired
    CommonService commonService;

    @RequestMapping(value = "/testList")
    public ModelAndView testList (Model model) {
      ModelAndView modelAndView = new ModelAndView();
      List<Map<String,Object>> rsltList = new ArrayList<Map<String, Object>>();
      List<Map<String,Object>> rsltList2 = new ArrayList<Map<String, Object>>();
      rsltList = commonService.cList();

      rsltList2 = commonService.commonList();

     model.addAttribute("rsltList", rsltList);
     model.addAttribute("rsltList2", rsltList2);
     modelAndView.setViewName("/main/main");

     return modelAndView;
    }
}
