package com.niit.controller;

import com.niit.pojo.User;
import com.niit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
/**
 * @ClassName UserController
 * @Description TODO
 * @Author tree
 * @Date 2019/6/13 13:55
 * @Version 1.8
 **/

@Controller
public class UserController {

    @Autowired
   private UserService userService;

    /**
     *    增加新的用户
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/insert.action")
    @ResponseBody
    public String insertUser(User user)throws Exception{
      int i = userService.insertUser(user);
        if(i>0){
             return "OK";
        }else{
            return "FAIL";
        }
    }

    /**
     *  根据ID删除User
     * @param id
     * @return
     * @throws Exception
     */

    @RequestMapping("/delete.action")
    @ResponseBody
    public String deleteUser(Integer id)throws Exception{
           System.out.println("id"+id);
        int row = userService.deleteUser(id);
        if(row>0){
            return "OK";
        }else{
            return "FAIL";
        }
    }

    /**
     *  根据Id 获取用户,用于前端页面的修改信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/findUserById.action")
    @ResponseBody
    public User findUserById(Integer id){
        User user = userService.findUserById(id);
        return user;
    }

    /**
     * 当前思路，在参数里面接收 admin的position的值，然后进行判断，跳转
     * @param model
     * @return
     */

    @RequestMapping("/findAllUser.action")
    public String findAllUser(Model model){
        List<User> userList = userService.findAllUser();
        model.addAttribute("userList",userList);
        return "authoOne";
    }
}
