package com.x62life.mo.controller.category;

import com.x62life.mo.model.category.CartRecipe;
import com.x62life.mo.model.category.CartRecipeEx;
import com.x62life.mo.model.category.SubCategory;
import com.x62life.mo.model.order.OdReserveGoodsEx;
import com.x62life.mo.model.product.BasicTagMap;
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
/*
    //업체직송상품 페이징, 업체직송상품 리스트
    @RequestMapping("/reserveItemList")
    public ModelAndView reserveItemList (Model model, @RequestParam Map<String, Object> paramMap) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        Map<String, Object> reserveGoodsPagingMap = categoryService.getReserveItemListPaging(paramMap);

        model.addAttribute("reserveGoodsPagingMap", reserveGoodsPagingMap);

        List<OdReserveGoodsEx> reserveGoodsList = categoryService.reserveGoodsList(paramMap);

        model.addAttribute("reserveGoodsList",reserveGoodsList);

        modelAndView.setViewName("/main/main");

        return modelAndView;
    }

    *//*getItemListPaging 일반 상품 페이징(업체직송X), 상품 리스트*//*
    @RequestMapping("/allItemList")
    public ModelAndView allItemList(Model model, @RequestParam Map<String, Object> paramMap) throws Exception {

        ModelAndView modelAndView = new ModelAndView();

        Map<String,Object> itemListPagingMap = categoryService.itemListPagingMap(paramMap);

        model.addAttribute("itemListPagingMap", itemListPagingMap);

        List<GdMasterEx> allItemList = categoryService.allItemList(paramMap);

        model.addAttribute("allItemList",allItemList);

        modelAndView.setViewName("/main/main");

        return modelAndView;
    }*/

    @RequestMapping("/custSetList")
    public ModelAndView custSetList(Model model, @RequestParam Map<String,Object> paramMap) {

        ModelAndView modelAndView = new ModelAndView();

        int intPagePerItem = 10;

        paramMap.put("intPagePerItem", intPagePerItem);

        Map<String, Object> custSetListPaging = categoryService.custSetListPaging(paramMap);

        model.addAttribute("custSetListPaging", custSetListPaging);

        List<CartRecipeEx> custSetProdList = categoryService.custSetProdList(paramMap);

        model.addAttribute("custSetProdList",custSetProdList);

        List<CartRecipeEx> custSetGoodsList = categoryService.custSetGoodsList(paramMap);

        model.addAttribute("custSetGoodsList", custSetGoodsList);

        modelAndView.setViewName("/custSet");

        return modelAndView;
    }

    @RequestMapping("/custSetDetail")
    public ModelAndView custSetDetail(Model model, @RequestParam Map<String, Object> paramMap) throws Exception{

       ModelAndView modelAndView = new ModelAndView();

       List<CartRecipe> cartRecipeList = categoryService.cartRecipeTitle(paramMap);

       model.addAttribute(cartRecipeList);

       if(!paramMap.get("strLoginMemCD").equals("") && !paramMap.get("rsMemcd").equals("strLoginMemCD")){
           categoryService.visitorCnt(paramMap);
       }

//       List<BasicTagMap> getTagList = categoryService.tagList(paramMap);

//       model.addAttribute("getTagList", getTagList);

       List<CartRecipeEx> cartRecipeProdList = categoryService.cartRecipeProdList(paramMap);

       model.addAttribute("cartRecipeProdList", cartRecipeProdList);

       modelAndView.setViewName("/main/main");

       return modelAndView;
    }

    @RequestMapping("/defProdOneProd")
    public ModelAndView defProdOneProd(Model model, @RequestParam Map<String, Object> paramMap) {
        ModelAndView modelAndView = new ModelAndView();

        String customFilterProduct[] = {"43042719","91073305","05020034","99701120","1010000011","1010000013", "1010000031"};
        paramMap.put("customFilterProduct",customFilterProduct);

        List<GdMasterEx> defProdOneProd = categoryService.defProdOneProd(paramMap);
        model.addAttribute("defProdOneProd", defProdOneProd);

        modelAndView.setViewName("/main/main");

        return modelAndView;

    }

    @RequestMapping("/discountProdList")
    public ModelAndView discountProdList(Model model, @RequestParam Map<String, Object> paramMap) {
        ModelAndView modelAndView = new ModelAndView();

        String customFilterProduct[] = {"43042719","91073305","05020034","99701120","1010000011","1010000013", "1010000031"};
        paramMap.put("customFilterProduct",customFilterProduct);

        Map<String, Object> discountListPaging = categoryService.discountListPaging(paramMap);

        model.addAttribute("discountListPaging", discountListPaging);

        List<GdMasterEx> discountProdList = categoryService.discountProdList(paramMap);

        model.addAttribute("discountProdList",discountProdList);

        modelAndView.setViewName("/discountProdList");

        return modelAndView;
    }

    @RequestMapping("/customFilterProduct")
    public ModelAndView firstBuyEventProductList(Model model, @RequestParam Map<String, Object> paramMap) {
        ModelAndView modelAndView = new ModelAndView();

        String customFilterProduct[] = {"43042719","91073305","05020034","99701120","1010000011","1010000013", "1010000031"};
        paramMap.put("customFilterProduct",customFilterProduct);

        int intPagePerItem = 20;

        paramMap.put("intPagePerItem",intPagePerItem);

        if(paramMap.get("odtype2").equals("")){
            paramMap.put("odtype2", "01");
        }

        Map<String, Object> directListPaging = categoryService.getDirectListPaging(paramMap);

        model.addAttribute("directListPaging",directListPaging);

        List<OdReserveGoodsEx> getDirectListHeader = categoryService.getDirectListHeader(paramMap);

        model.addAttribute("directListHeader",getDirectListHeader);

        modelAndView.setViewName("/customFilterProd");

        return modelAndView;
    }

    @RequestMapping("/hotProdList")
    public ModelAndView hotProdList(Model model) {
        String date[] = {"2020-06-18", "2020-06-27", "2020-06-26", "2020-07-06"};

        Map<String, Object> paramMap = new HashMap<>();
        for(int i = 0; i < date.length; i++){
           paramMap.put("targetDate" + i, date[i]);
        }
        System.out.println(paramMap.keySet() + "/" +paramMap.toString());
        return null;
    }
}
