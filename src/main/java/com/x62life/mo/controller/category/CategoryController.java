package com.x62life.mo.controller.category;

import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

        modelAndView.setViewName("/category/newProdList");

        return modelAndView;
    }
}
