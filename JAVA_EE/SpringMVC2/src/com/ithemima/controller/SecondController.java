package com.ithemima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName SecondController
 * @Description TODO
 * @Author tree
 * @Date 2019/5/8 8:52
 * @Version 1.8
 **/


@Controller
@RequestMapping(value = "/hello")
public class SecondController {
    @RequestMapping(value = "/second")
    public String handleRequest(Model model){
        model.addAttribute("m","测试第二个SpringMVC");
        return "second";
    }
}
