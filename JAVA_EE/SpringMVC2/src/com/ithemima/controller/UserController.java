package com.ithemima.controller;

import com.ithemima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author tree
 * @Date 2019/5/15 8:50
 * @Version 1.8
 **/
@Controller
public class UserController {
/**用户登录页面跳转
 *
 * */
@RequestMapping(value = "/login",method = RequestMethod.GET)
  public String toLogin(){
      return "login";
  }
  /**
  *   用户登录
  * */
  @RequestMapping(value = "/login",method = RequestMethod.POST)
  public String login(User user, Model model, HttpSession session){
      String username = user.getUsername();
      String password = user.getPassword();
//      此处模拟从数据库中获取用户名和密码后进行判断
      if(username !=null && username.equals("fuxiaoyang")
      && password !=null && password.equals("123456")){
          //添加到session中
          session.setAttribute("USER_SESSION",user);
          //重定向到主页面的跳转方法
          return "redirect:main";
      }
      model.addAttribute("msg","用户名或密码错误，请重新登陆!");
      return "login";
  }
  /**
   * 向用户主页跳转
   * */
  @RequestMapping(value = "/main")
    public String toMain(){
        return "main";
    }
    /**
     *  退出登陆
     * */
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        //清除session;
        session.invalidate();
        return "redirect:login";
    }

}
