package com.niit.dao;

import com.niit.domain.User;


import java.util.List;
public interface UserDao {
    int insertUser(User user);
    int deleteById(Integer id);
    int updateUser(User user);
    List<User> getAllUser();//获取所有实体
//    User getUserById(Integer id);
    List<User> getUserLike(String keywords);//模糊查询

    void batchInsert(List<User> users);//批量插入User
}
