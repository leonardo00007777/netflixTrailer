package com.x62life.mo.controller.main;

import com.x62life.mo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CommonController {

    @Autowired
    BoardService boardService;

    public String testList () {


        return null;
    }
}
