package com.ithemima.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName FirstController
 * @Description TODO
 * @Author tree
 * @Date 2019/5/6 10:49
 * @Version 1.8
 **/
public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //创建MOdelAndView对象
        ModelAndView mav = new ModelAndView();
        //向模型对象中添加数据
        mav.addObject("msg","MyFirst MVC 程序");
        mav.addObject("f","是否自己部署");
        //设置逻辑视图名
        mav.setViewName("first");
        //返回ModelAndView
        return mav;
    }
}
