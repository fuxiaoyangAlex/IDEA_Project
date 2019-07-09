package com.niit.dao;

import com.niit.domain.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName TestUser
 * @Description TODO
 * @Author tree
 * @Date 2019/4/10 8:50
 * @Version 1.8
 **/
public class TestUser {
    private UserDao userDao = new UserDaoImpl();
    private final Logger logger = LoggerFactory.getLogger(TestPerson.class);
    @Test
    public void findUserWithOrders(){
        int id=1;
        try{
            User user = userDao.findUserWithOrders(id);
            logger.info("嵌套结果查询成功"+user);
        }catch (Exception e){
            logger.error("嵌套结果查询失败"+e.getMessage());
        }
    }
    @Test
    public void findUserWithOrders1(){
        int id=2;
        try{
            User user = userDao.findUserWithOrders1(id);
            logger.info("嵌套查询成功"+user);
        }catch (Exception e){
            logger.error("查询失败"+e.getMessage());
        }
    }
}
