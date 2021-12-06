package com.x62life.mo.controller.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {
    @Autowired
    CommonService commonService;

    @RequestMapping(value = "/testList")
    public ModelAndView testList (Model model, HttpServletRequest request, HttpServletResponse response) {
      ModelAndView modelAndView = new ModelAndView();

      List<Map<String,Object>> searchRank = new ArrayList<Map<String, Object>>();

      String periodDay = "7";
      searchRank = commonService.getSearchRank(periodDay);

      model.addAttribute("searchRank", searchRank);
      modelAndView.setViewName("/main/main");

      return modelAndView;
    }
}
