package com.niit.daoImpl;

import com.niit.dao.UserDao;
import com.niit.domain.User;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class UserDaoImplTest {

    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDao userDao = (UserDao)ac.getBean("userDao");

    @Test
    public void insertUser(){
        User user = new User("王五","1213");
        int n = userDao.insertUser(user);
        Assert.assertEquals(1,n);
}
    @Test
    public void batchInsertUser(){
    List<User> userList = new ArrayList<>();
    User user1 = new User("ddddd","123");
    User user2 = new User("ffff","3345");
    userList.add(user1);
    userList.add(user2);
    userDao.batchInsert(userList);
    }
}
