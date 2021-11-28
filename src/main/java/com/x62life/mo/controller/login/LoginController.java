package com.x62life.mo.controller.login;

import com.x62life.mo.model.login.LoginProcess;
import com.x62life.mo.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/loginProcess")
    public ModelAndView userLoginInfo(Model model, HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();

        String strPassword = "ckdgysl1";
        String strUserId = "test";
        String memstOut = "10";

        Map<String, Object> pramMap  = new HashMap<>();

        pramMap.put("strPassword",strPassword);
        pramMap.put("strUserId",strUserId);
        pramMap.put("memstOut",memstOut);

        List<LoginProcess> loginUserInfoList = loginService.loginInfo(pramMap);

        model.addAttribute("loginUserInfo", loginUserInfoList);

        modelAndView.setViewName("/main/main");
        return modelAndView;
    }
}
