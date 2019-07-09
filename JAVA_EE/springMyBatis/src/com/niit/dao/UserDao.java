package com.niit.dao;

import com.niit.domain.User;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author tree
 * @Date 2019/4/10 8:28
 * @Version 1.8
 **/
public interface UserDao {
//    嵌套结果
    User findUserWithOrders(Integer id)throws Exception;
//    嵌套查询
    User findUserWithOrders1(Integer id)throws Exception;
}
