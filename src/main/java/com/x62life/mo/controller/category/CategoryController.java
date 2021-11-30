package com.x62life.mo.controller.category;

import com.x62life.mo.model.category.SubCategory;
import com.x62life.mo.model.order.OdReserveGoodsEx;
import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    //서브카테고리 가져오기
    @RequestMapping("/categoryList")
    public ModelAndView subCategoryList (Model model, @RequestParam String strGDTYPE, @RequestParam String strSmenucd) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("strGDTYPE", strGDTYPE);
        paramMap.put("strSmenucd", strSmenucd);
        //서브카테고리 가져오기
        List<SubCategory> subCategoryList = categoryService.getSubCategoryList(paramMap);

        model.addAttribute("subCategoryList",subCategoryList);

        modelAndView.setViewName("/main/main");
        return modelAndView;
    }

    //업체직송상품 페이징
    @RequestMapping("/getReserveItemListPaging")
    public ModelAndView getReserveItemListPaging (Model model, @RequestParam Map<String, Object> paramMap) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        Map<String, Object> reserveGoodsPagingMap = categoryService.getReserveItemListPaging(paramMap);

        model.addAttribute("reserveGoodsPagingMap", reserveGoodsPagingMap);
        modelAndView.setViewName("/main/main");

        return modelAndView;
    }
    //업체직송상품 리스트
    @RequestMapping("/reserveItemList")
    public ModelAndView reserveItemList(Model model, @RequestParam Map<String, Object> paramMap) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        List<OdReserveGoodsEx> reserveGoodsList = categoryService.reserveGoodsList(paramMap);

        model.addAttribute("reserveGoodsList",reserveGoodsList);

        modelAndView.setViewName("/main/main");

        return modelAndView;
    }

    /*getItemListPaging 일반 상품 페이징(업체직송X)*/
    @RequestMapping("/normalItemListPaging")
    public ModelAndView itemListPaging(Model model, @RequestParam Map<String, Object> paramMap) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        Map<String,Object> itemListPagingMap = categoryService.itemListPagingMap(paramMap);

        model.addAttribute("itemListPagingMap", itemListPagingMap);

        modelAndView.setViewName("/main/main");

        return modelAndView;
    }
     //상품목록조회 (통합)
    @RequestMapping("/allItemList")
    public ModelAndView allItemList(Model model, @RequestParam Map<String, Object> paramMap) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        List<GdMasterEx> allItemList = categoryService.allItemList(paramMap);

        model.addAttribute("allItemList",allItemList);

        modelAndView.setViewName("/main/main");

        return modelAndView;

    }
}
