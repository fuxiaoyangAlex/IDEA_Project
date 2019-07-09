package com_junit;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    @Test
    public void userLogin() {
        String xmlPath ="com_junit/beans.xml";
        ApplicationContext ac= new ClassPathXmlApplicationContext(xmlPath);
        User user1 = (User)ac.getBean("user");
        UserService userService = (UserService)ac.getBean("userService");
        userService.userLogin(user1);
    }
}
