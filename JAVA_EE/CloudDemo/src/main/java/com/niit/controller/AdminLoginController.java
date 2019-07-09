package com.niit.controller;
import com.niit.pojo.Admin;
import com.niit.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author tree
 * @Date 2019/6/12 19:22
 * @Version 1.8
 **/

@Controller
public class AdminLoginController {

    @Autowired
    private AdminService adminService;
    /**
     * 管理员登陆
     */
    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public String toLogin(String adminPhone, String adminPassword, Model model,
                          HttpSession session) {
        //通过手机号和密码查询
        Admin admin = adminService.findAdmin(adminPhone,adminPassword);
        if (admin != null) {
            session.setAttribute("ADMIN_SESSION", admin);
            if(admin.getAdminPosition()==1){
                return "authoOne";
            }
            return "authoTwo";
        }else{
            model.addAttribute("msg","账号或密码有错");
            return "adminLogin";
        }
    }
    /**
     * 退出登陆
     */
    @RequestMapping(value = "logout.action")
    public String logout(HttpSession session){
        //清除session
        session.invalidate();
        //重定向到登录页面的跳转方法
        return "redirect:login.action";
    }
    /**
     * 向用户登陆页面跳转
     */
    @RequestMapping(value = "/login.action",method = RequestMethod.GET)
    public String toLogin(){
        return "adminLogin";
    }

}
