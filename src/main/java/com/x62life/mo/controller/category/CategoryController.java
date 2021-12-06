package com.x62life.mo.controller.category;

import com.x62life.mo.model.category.CartRecipe;
import com.x62life.mo.model.category.CartRecipeEx;
import com.x62life.mo.model.category.SubCategory;
import com.x62life.mo.model.order.OdReserveGoodsEx;
import com.x62life.mo.model.product.*;
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

    //할인상품 리스트
    @RequestMapping("/discountProd")
    public ModelAndView discountProd(Model model, @RequestParam Map<String, Object> paramMap) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        int specialExhibitionProdCnt = categoryService.specialExhibitionProdCnt(paramMap);
        model.addAttribute("specialExhibitionProdCnt", specialExhibitionProdCnt);

        List<GdMasterEx> specialExhibitionProdList = categoryService.specialExhibitionProdList(paramMap);
        model.addAttribute("specialExhibitionProdList",specialExhibitionProdList);

        // 자연이랑모바일 - 할인, 추천 상품 (기본 단품 상품 리스트 )
        List<GdMasterEx> defProdOneProd = categoryService.defSetOneProd(paramMap);
        model.addAttribute("defProdOneProd", defProdOneProd);

        //할인 상품 페이징
        Map<String, Object> discountListPaging = categoryService.discountListPaging(paramMap);
        model.addAttribute("discountListPaging",discountListPaging);

        //할인 상품 리스트
        List<GdMasterEx> discountSetProdList = categoryService.discountSetProdList(paramMap);
        model.addAttribute("discountSetProdList", discountSetProdList);

        modelAndView.setViewName("/discountProd");
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

    //고객이 만드는 상품 세트
    @RequestMapping("/custSetList")
    public ModelAndView custSetList(Model model, @RequestParam Map<String,Object> paramMap) {

        ModelAndView modelAndView = new ModelAndView();

        int intPagePerItem = 10;

        paramMap.put("intPagePerItem", intPagePerItem);

        //고객이 만드는 상품 리스트 페이징
        Map<String, Object> custSetListPaging = categoryService.custSetListPaging(paramMap);

        model.addAttribute("custSetListPaging", custSetListPaging);

        //고객이 만드는 상품 리스트
        List<CartRecipeEx> custSetProdList = categoryService.custSetProdList(paramMap);

        model.addAttribute("custSetProdList",custSetProdList);

        //custSetGoodsList 상품 리스트
        List<CartRecipeEx> custSetGoodsList = categoryService.custSetGoodsList(paramMap);

        model.addAttribute("custSetGoodsList", custSetGoodsList);

        modelAndView.setViewName("/custSet");

        return modelAndView;
    }

    //고객이 만드는 상품 상세
    @RequestMapping("/custSetDetail")
    public ModelAndView custSetDetail(Model model, @RequestParam Map<String, Object> paramMap) throws Exception{

       ModelAndView modelAndView = new ModelAndView();

        //장바구니 레시피 리스트
       List<CartRecipe> cartRecipeList = categoryService.cartRecipeTitle(paramMap);

       model.addAttribute(cartRecipeList);

       if(!paramMap.get("strLoginMemCD").equals("") && !paramMap.get("rsMemcd").equals("strLoginMemCD")){
           categoryService.visitorCnt(paramMap);
       }

//       List<BasicTagMap> getTagList = categoryService.tagList(paramMap);

//       model.addAttribute("getTagList", getTagList);

        //장바구니 레시피 상품 리스트
       List<CartRecipeEx> cartRecipeProdList = categoryService.cartRecipeProdList(paramMap);

       model.addAttribute("cartRecipeProdList", cartRecipeProdList);

       modelAndView.setViewName("/main/main");

       return modelAndView;
    }

    
    //사용자 정의 필터링 상품 
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
        
        //사용자 정의 필터링 상품 페이징 
        Map<String, Object> directListPaging = categoryService.getDirectListPaging(paramMap);

        model.addAttribute("directListPaging",directListPaging);

        //사용자 정의 필터링 상품 헤더 & 상품 리스트
        List<OdReserveGoodsEx> getDirectListHeader = categoryService.getDirectListHeader(paramMap);

        model.addAttribute("directListHeader",getDirectListHeader);

        modelAndView.setViewName("/customFilterProd");

        return modelAndView;
    }
    
    //인기상품 페이지 
    @RequestMapping("/hotProdList")
    public ModelAndView hotProdList(Model model, @RequestParam Map<String, Object> paramMap) {
        ModelAndView modelAndView = new ModelAndView();

        String date1 = "2020-06-18";
        String date2 = "2020-06-27";
        String date3 = "2020-06-26";
        String date4 = "2020-07-06";

        int targetDate1 = categoryService.getTargetDate(date1);
        int targetDate2 = categoryService.getTargetDate(date2);
        int targetDate3 = categoryService.getTargetDate(date3);
        int targetDate4 = categoryService.getTargetDate(date4);

        paramMap.put("targetDate1",targetDate1);
        paramMap.put("targetDate2",targetDate2);
        paramMap.put("targetDate3",targetDate3);
        paramMap.put("targetDate4",targetDate4);

        //인기상품 페이지 (아이센스 필터링)
        List<String> isenseFilteringProdGdcd = categoryService.isenseFilteringProdGdcd(paramMap);

        paramMap.put("isenseFilteringProdGdcd",isenseFilteringProdGdcd);

        //인기상품 페이지 (아이센스 베스트 상품 리스트)
        List<GdMasterEx> isenseBestProd = categoryService.isenseBestProd(paramMap);

        model.addAttribute("isenseBestProd",isenseBestProd);

        modelAndView.setViewName("/hotProdList");

        return modelAndView;
    }

    //상품 페이지 단위로 가져오기
    @RequestMapping("/getItemList")
    public ModelAndView getItemList(Model model, @RequestParam Map<String, Object> paramMap){
        ModelAndView modelAndView = new ModelAndView();

        String date1 = "2020-06-18";
        String date2 = "2020-06-27";
        String date3 = "2020-06-26";
        String date4 = "2020-07-06";

        int targetDate1 = categoryService.getTargetDate(date1);
        int targetDate2 = categoryService.getTargetDate(date2);
        int targetDate3 = categoryService.getTargetDate(date3);
        int targetDate4 = categoryService.getTargetDate(date4);

        paramMap.put("targetDate1",targetDate1);
        paramMap.put("targetDate2",targetDate2);
        paramMap.put("targetDate3",targetDate3);
        paramMap.put("targetDate4",targetDate4);

        ////상품 페이지 단위로 가져오기 - 페이징 갯수
        int itemListPaging = categoryService.itemListPaging(paramMap);

        model.addAttribute("itemListPaging",itemListPaging);

        //상품 페이지 단위로 가져오기 - 서브메뉴명
        List<String> getItemListSubmenu = categoryService.subCategoryList(paramMap);

        model.addAttribute("getItemListSubmenu",getItemListSubmenu);

        //상품 페이지 단위로 가져오기 상품 리스트
        List<GdMasterEx> getItemList = categoryService.getItemList(paramMap);

        model.addAttribute("getItemList",getItemList);

        modelAndView.setViewName("/itemList");
        return modelAndView;
    }

    //상품 페이지 단위로 가져오기 (신규)
    @RequestMapping("/getNewItemList")
    public ModelAndView getNewItemList(Model model, @RequestParam Map<String, Object> paramMap){
        ModelAndView modelAndView = new ModelAndView();

        //상품 페이지 단위로 가져오기 (신규) 페이징
        Map<String, Object> getNewItemListPaging = categoryService.getNewItemListPaging(paramMap);
        
        model.addAttribute("getNewItemListPaging", getNewItemListPaging);

        //상품 페이지 단위로 가져오기 (신규) 상품 리스트
        List<GdMasterEx> getNewItemListStatistics = categoryService.getNewItemListStatistics(paramMap);

        model.addAttribute("getNewItemListStatistics", getNewItemListStatistics);

        modelAndView.setViewName("/getNewItemList");

        return modelAndView;
    }

    //세트상품 리스트
    @RequestMapping("/getSetProdList")
    public ModelAndView getSetProdList(Model model, @RequestParam Map<String, Object> paramMap){
        ModelAndView modelAndView = new ModelAndView();

        //세트상품 리스트 페이징
        Map<String, Object> setListPaging = categoryService.setListPaging(paramMap);

        model.addAttribute("setListPaging",setListPaging);

        //세트상품 리스트
        List<GdMasterEx> setProdList = categoryService.setProdList(paramMap);

        model.addAttribute("setProdList",setProdList);

        modelAndView.setViewName("/setProdList");

        return modelAndView;
    }

    //전문관 정보 가져오기
    @RequestMapping("/getSpecialSellingBrandList")
    public ModelAndView getSpecialSellingBrandList(Model model, @RequestParam Map<String, Object> paramMap) {
        ModelAndView modelAndView = new ModelAndView();

        //전문관 상품 페이징
        Map<String, Object> getSpecialSellingBrandListPaging = categoryService.getSpecialSellingBrandListPaging(paramMap);

        model.addAttribute("getSpecialSellingBrandListPaging",getSpecialSellingBrandListPaging);

        //전문관 상품 리스트 & 헤더 정보
        List<SpecialSellingh> getSpecialSellingBrandHeader = categoryService.getSpecialSellingBrandHeader(paramMap);

        model.addAttribute("getSpecialSellingBrandHeader", getSpecialSellingBrandHeader);

        modelAndView.setViewName("/specialBrand");

        return modelAndView;
    }

    @RequestMapping("/itemDetail")
    public ModelAndView itemDetail(Model model, @RequestParam Map<String, Object> paramMap) {
        ModelAndView modelAndView = new ModelAndView();

        //상품목록조회 (일반상품, 패키지 상품은 제외)
        List<GdMasterEx> searchReserveProdDetail = categoryService.searchReserveProdDetail(paramMap);
        model.addAttribute("searchReserveProdDetail",searchReserveProdDetail);

        //옵션 상품 표시 여부 처리
        List<GdMasterEx> optionProductViewYn = categoryService.optionProductViewYn(paramMap);
        model.addAttribute("optionProductViewYn",optionProductViewYn);

        //세트아이템 정보
        List<Map<String,Object>> setItemInfoOnlySetProd = categoryService.setItemInfoOnlySetProd(paramMap);
        model.addAttribute("setItemInfoOnlySetProd", setItemInfoOnlySetProd);

        //방사능 검사 정보 img 경로
        String testPathInfo = categoryService.testPathInfo((String)paramMap.get("strTestidx"));
        model.addAttribute("testPathInfo", testPathInfo);

        //과일 상품 당도 표시
        List<GdSugar> fruitsSugarInfo = categoryService.fruitsSugarInfo((String)paramMap.get("strGdcd"));
        model.addAttribute("fruitsSugarInfo",fruitsSugarInfo);

        //기존방식으로 기본 상품 표시
        List<String> defProdInfoList = categoryService.defProdInfoList((String)paramMap.get("strGdcd"));
        model.addAttribute("defProdInfoList", defProdInfoList);

        //신규방식으로 기본 상품 표시
        List<GdPipnRef> defProdInfoListNew = categoryService.defProdInfoListNew((String)paramMap.get("strGdcd"));
        model.addAttribute("defProdInfoListNew",defProdInfoListNew);

        modelAndView.setViewName("/itemDetail");

        return modelAndView;
    }

    @RequestMapping("/itemDetailBar")
    public ModelAndView itemDetailBar(Model model, @RequestParam Map<String, Object> paramMap) {
        ModelAndView modelAndView = new ModelAndView();

        //아이템 상세 바
        List<GdMasterEx> itemDetailBar = categoryService.itemDetailBar(paramMap);
        model.addAttribute("itemDetailBar", itemDetailBar);

        //아이템 상세 바 세트아이템
        List<GdMasterEx> itemDetailBarSetItem = categoryService.itemDetailBarSetItem(paramMap);
        model.addAttribute("itemDetailBarSetItem", itemDetailBarSetItem);

        //아이템 상세 바 옵션상품 표시 여부
        List<GdMasterEx> itemDetailBarOptionYN = categoryService.itemDetailBarOptionYN(paramMap);
        model.addAttribute("itemDetailBarOptionYN",itemDetailBarOptionYN);

        //아이템 상세 바 방사능 정보
        String itemDetailBarTestPathInfo = categoryService.itemDetailBarTestPathInfo(paramMap);
        model.addAttribute("itemDetailBarTestPathInfo", itemDetailBarTestPathInfo);

        List<GdSugar> itemBarDetailFruitsSugarInfo = categoryService.itemBarDetailFruitsSugarInfo(paramMap);


        //기본상품정보 신규방식
        List<GdPipn> itemBarDetailBasicInfoNew = categoryService.itemBarDetailBasicInfoNew(paramMap);
        model.addAttribute("itemBarDetailBasicInfoNew", itemBarDetailBasicInfoNew);

        modelAndView.setViewName("itemDetailBar");

        return modelAndView;
    }
}
