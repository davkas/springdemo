package com.davkas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by davkas on 16/3/10.
 */
@Controller
public class HomeController {
    @RequestMapping("test")
    public void test(ModelMap modelMap){
        System.out.println("test");
        modelMap.put("test","hello world!");
    }
}
