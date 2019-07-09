package com.aiyun.springmvc_demo2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MyController
 * @Description TODO
 * @Author tree
 * @Date 2019/7/6 13:23
 * @Version 1.8
 **/
@RestController
@Api(value = "用户控制类")
public class MyController {

    @ApiOperation(value = "获取信息")
    @RequestMapping("/")
    public String hello(){
        return "hello World";
    }
}
