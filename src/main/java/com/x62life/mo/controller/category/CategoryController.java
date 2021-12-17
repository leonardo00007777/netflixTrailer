package com.x62life.mo.controller.category;

import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.model.product.GdPipn;
import com.x62life.mo.model.product.GdSugar;
import com.x62life.mo.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/main/newProdList")
    public ModelAndView newProdList(Model model, @RequestParam Map<String, Object> paramMap) throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        List<GdMasterEx> categoryList = categoryService.categoryList(paramMap);
        model.addAttribute("categoryList", categoryList);

        String categoryDesc = categoryService.categoryDesc(paramMap);
        model.addAttribute("categoryDesc", categoryDesc);

        int prodListPaging = categoryService.prodListPaging(paramMap);
        model.addAttribute("prodListPaging", prodListPaging);

        List<GdMasterEx> prodListAll = categoryService.prodListAll(paramMap);
        model.addAttribute("prodListAll", prodListAll);

        return modelAndView;
    }

    @RequestMapping("/main/itemDetail")
    public ModelAndView itemDetail(Model model, @RequestParam Map<String, Object> paramMap) throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        if(paramMap.get("strOdtype2") == null  || paramMap.get("strOdtype2").equals("")){
            paramMap.put("strOdtype2", "%");
        }
        paramMap.put("minimumOrderPrice", "40000");
        paramMap.put("deliveryCharge", "3000");

        model.addAttribute("paramMap", paramMap);

        List<GdMasterEx> itemDetail = categoryService.itemDetail(paramMap);
        model.addAttribute("itemDetail", itemDetail);

        List<Map<String, Object>> itemDetailSetProdConfiguration = categoryService.itemDetailSetProdConfiguration(paramMap);
        model.addAttribute("itemDetailSetProdConfiguration", itemDetailSetProdConfiguration);

        Map<String, Object> itemDlvDeadlineMsg = categoryService.itemDlvDeadlineMsg(paramMap);
        model.addAttribute("itemDlvDeadlineMsg", itemDlvDeadlineMsg);

        List<GdSugar> fruitsSugarInfo = categoryService.fruitsSugarInfo((String)paramMap.get("strGDCD"));
        model.addAttribute("fruitsSugarInfo", fruitsSugarInfo);

        List<GdPipn> basicDetailInfo = categoryService.basicDetailInfo((String) paramMap.get("strGDCD"));
        model.addAttribute("basicDetailInfo", basicDetailInfo);

        List<GdPipn> usePpCode = categoryService.usePpCode((String)paramMap.get("strGDCD"));
        model.addAttribute("usePpCode", usePpCode);

        modelAndView.setViewName("category/itemDetail");

        return modelAndView;
    }

    @RequestMapping("/main/getCartOrderType")
    @ResponseBody
    public Map<String, Object> getCartOrderType(@RequestParam String gdcd) {
        Map<String, Object> getCartOrderType = categoryService.getCartOrderType(gdcd);

        return getCartOrderType;
    }

    @RequestMapping("/main/isRightAwayEnableDay")
    @ResponseBody
    public String isRightAwayEnableDay(@RequestParam String datex) {
        String isRightAwayEnableDay = categoryService.isRightAwayEnableDay(datex);

        return isRightAwayEnableDay;
    }
}
