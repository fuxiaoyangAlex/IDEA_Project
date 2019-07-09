package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

    public static void main(String[] args) {
        //初始化spring容器,加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com_annotation/beans.xml");
        //通过容器获得UserService实例
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.say();
    }
}

