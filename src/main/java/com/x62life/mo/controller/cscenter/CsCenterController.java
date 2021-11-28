package com.x62life.mo.controller.cscenter;

import com.x62life.mo.model.boardcontents.BdFaq;
import com.x62life.mo.model.boardcontents.BdNotice;
import com.x62life.mo.model.boardcontents.BdNoticeEx;
import com.x62life.mo.service.cscenter.CsCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Blob;
import java.sql.Clob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CsCenterController {
    @Autowired
    CsCenterService csCenterService;

    @RequestMapping("/csCenter/recentNoticeFive")
    public ModelAndView recentNoticeFive(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        List<BdNotice> recentNoticeFiveList = new ArrayList<>();
        recentNoticeFiveList = csCenterService.recentNoticeFiveList();

        model.addAttribute("recentNoticeList", recentNoticeFiveList);
        modelAndView.setViewName("main/main");

        return modelAndView;
    }

    @RequestMapping("/csCenter/recnetNoticeTen")
    public ModelAndView recentNoticeTen(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        String typeFaq = ""; // 파라미터 필요
        List<BdNoticeEx> recentNoticeTenList = csCenterService.recentNoticeTenList(typeFaq);

        model.addAttribute("recentNoticeTenList", recentNoticeTenList);
        modelAndView.setViewName("main/main");

        return modelAndView;
    }

    @RequestMapping("/csCenter/faqPaging")
    public ModelAndView faqPaging(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        String crx = "2"; //파라미터 작업 필요
        List<String> win = new ArrayList<>();

        if (crx.equals("1")) {
            win.add("10");
        } else if (crx.equals("2")){
            win.add("20");
            win.add("21");
            win.add("22");
        }
        else if(crx.equals("3")) {
            win.add("30");
        }
        else if (crx.equals("4")){
            win.add("40");
            win.add("90");
        }else {
            crx = "0";
        }

        String sfaq = null; //파라미터 작업 필요

        int intPagePerItem = 10;

        Map<String, Object> paramMap = new HashMap<>();

        paramMap.put("intPagePerItem",intPagePerItem);

        paramMap.put("win",win);

        paramMap.put("sfaq",sfaq);

        List<BdFaq> faqPaging = csCenterService.faqPaging(paramMap);

        if(faqPaging.size() > 0) {
            int pageSize = 5;

            model.addAttribute("faqPaging", faqPaging);
            model.addAttribute("pageSize", pageSize);

            modelAndView.setViewName("main/main");
        } else{
            modelAndView.setViewName("main/main");
        }

        return modelAndView;
    }

    @RequestMapping("/csCenter/faqList")
    public ModelAndView faqList(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        String crx = "2"; //파라미터 작업 필요
        List<String> win = new ArrayList<>();

        if (crx.equals("1")) {
            win.add("10");
        } else if (crx.equals("2")){
            win.add("20");
            win.add("21");
            win.add("22");
        }
        else if(crx.equals("3")) {
            win.add("30");
        }
        else if (crx.equals("4")){
            win.add("40");
            win.add("90");
        }else {
            crx = "0";
        }

        String sfaq = null; //파라미터 작업 필요

        int intPagePerItem = 10;//파라미터 작업 필요

        int page = 1;//파라미터 작업 필요

        Map<String, Object> paramMap = new HashMap<>();

        paramMap.put("intPagePerItem",intPagePerItem);

        paramMap.put("win",win);

        paramMap.put("sfaq",sfaq);

        paramMap.put("page",page);

        List<BdFaq> faqList = csCenterService.faqList(paramMap);

        if(faqList.size() > 0) {

            model.addAttribute("faqPaging", faqList);

            modelAndView.setViewName("main/main");
        } else{
            modelAndView.setViewName("main/main");
        }

        return modelAndView;
    }
    @RequestMapping("/csCenter/faqDetail")
    public ModelAndView faqDetail(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        Map<String, Object> faqContent = csCenterService.faqContent();

        modelAndView.setViewName("main/main");
        return modelAndView;
    }

}
