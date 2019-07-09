package com.itheima.controller;

import com.itheima.po.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName CustomerController
 * @Description TODO
 * @Author tree
 * @Date 2019/6/4 11:32
 * @Version 1.8
 **/

@Controller
public class CustomerController {
    /**
     *
     * 接收页面JSON数据，并返回JSON格式结果
     */

    @RequestMapping("/testJson")
    @ResponseBody
    public Customer testJson(@RequestBody  Customer customer){
         System.out.println(customer);
         return customer;
    }

}
