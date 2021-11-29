package com.x62life.mo.controller.category;

import com.x62life.mo.model.product.BestProduct;
import com.x62life.mo.model.product.GdMasterEx;
import com.x62life.mo.service.main.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CategoryController {
    @Autowired
    MainService mainService;

    @ResponseBody
    @RequestMapping("/newProdList")
    public List<GdMasterEx> newProdList(@RequestBody Map<String,Object> paramMap) throws Exception {

        List<GdMasterEx> newProdList = mainService.newProdList(paramMap);

        return newProdList;
    }

    @ResponseBody
    @RequestMapping("/discountProdList")
    public List<GdMasterEx> discountProdList(@RequestBody @Nullable String strMEMGRPCD) throws Exception {
        strMEMGRPCD = null;
        List<GdMasterEx> discountProdList = mainService.discountProdList(strMEMGRPCD);

        return discountProdList;
    }

    @ResponseBody
    @RequestMapping("/bestProdList")
    public List<BestProduct> bestProductList(@RequestBody Map<String, Object> paramMap) throws Exception {
        List<BestProduct> bestProductList = mainService.bestProductList(paramMap);
        return  bestProductList;
    }
}
