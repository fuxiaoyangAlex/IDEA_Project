package com.niit.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName FirstController
 * @Description 控制器类
 * @Author tree
 * @Date 2019/4/17 9:04
 * @Version 1.8
 **/
public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        创建ModelAndView对象
        ModelAndView mav = new ModelAndView();
//        向模型中添加数据
        mav.addObject("msg","我的第一个Spring MVC程序");
//        设置逻辑视图名
        mav.setViewName("/WEB-INF/jsp/first.jsp");
        return mav;
    }
}
