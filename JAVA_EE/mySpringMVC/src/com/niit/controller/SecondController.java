package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName SecondController
 * @Description TODO
 * @Author tree
 * @Date 2019/4/17 10:43
 * @Version 1.8
 **/
@Controller
@RequestMapping("/a")
public class SecondController{
    @RequestMapping("/SecondController")
    public String handleRequest(Model model){
        model.addAttribute("msg","HelloWorld!");
       return "first";
    }
}