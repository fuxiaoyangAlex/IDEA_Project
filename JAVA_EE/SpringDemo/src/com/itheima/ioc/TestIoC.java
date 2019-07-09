package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {
    public static void main(String[] args){
        //初始化spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com_annotation/beans.xml");
        //获取实例
       UserDao userDao=(UserDao)applicationContext.getBean("userDao");
       UserDaoImpl userDao1 = new UserDaoImpl();
       userDao.say();
       userDao1.doWork();

    }
}
