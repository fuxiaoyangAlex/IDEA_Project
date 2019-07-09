package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName SecondController
 * @Description TODO
 * @Author tree
 * @Date 2019/5/24 10:24
 * @Version 1.8
 **/


@Controller
@RequestMapping("/hello")
public class SecondController {
    @RequestMapping(value = "/second")
    public String handleRequest(Model model){
        model.addAttribute("h","返回测试");
       return "second";
    }
}
