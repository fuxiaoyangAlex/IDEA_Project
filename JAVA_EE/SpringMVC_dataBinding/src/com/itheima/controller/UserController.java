package com.itheima.controller;

import com.itheima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author tree
 * @Date 2019/5/13 0:40
 * @Version 1.8
 **/


@Controller
public class UserController {
    /**
     * 向用户页面跳转
     */

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    /**
     * 接收用户注册信息
     *
     * @param
     * @return
     */
    @RequestMapping("/registerUser")
    public String registerUser(HttpServletRequest request, User user) {
        String username = user.getUsername();
        Integer password = user.getPassword();
        request.setAttribute("username",username);
        request.setAttribute("password",password);
        System.out.println(username);
        System.out.println(password);
        return "success";
    }


    @RequestMapping("/selectUser")
    public String selectUser(@RequestParam(value = "user_id") Integer id) {
        System.out.println("id=" + id);
        return "success";
    }

}
