package com.iteima.jdk;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName test
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 17:23
 * @Version 1.8
 **/
public class test {
    @Test
    public void test(){
        String xmlPath="applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao1 = (UserDao)ac.getBean("dao");
        userDao1.addUser();
    }
}
