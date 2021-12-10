package com.x62life.mo.controller.category;

import com.x62life.mo.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

}
