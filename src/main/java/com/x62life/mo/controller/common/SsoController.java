package com.x62life.mo.controller.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.x62life.mo.service.category.CategoryService;

@Controller
@RequestMapping(value = "/login")
public class SsoController {
	
	@Autowired
	CategoryService categoryService;

		
}
