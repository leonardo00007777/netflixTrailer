package com.x62life.mo.controller.main;

import com.x62life.mo.service.BoardService;
import com.x62life.mo.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpResponse;
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
    public ModelAndView testList (Model model, HttpRequest request, HttpResponse response) {
      ModelAndView modelAndView = new ModelAndView();

      List<Map<String,Object>> searchRank = new ArrayList<Map<String, Object>>();

      String periodDay = "7";
      searchRank = commonService.getSearchRank(periodDay);

      model.addAttribute("searchRank", searchRank);
      modelAndView.setViewName("/main/main");

      return modelAndView;
    }
}
