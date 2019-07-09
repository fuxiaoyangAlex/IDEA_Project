package com.niit.dao;

import com.niit.pojo.User;

import java.util.List;

public interface UserDao {

    public int insertUser(User user) throws Exception;

    public int deleteUser(int id) throws Exception;

    public int updateUser(User user) throws Exception;

    public User findUser(String userPhone, String userPassword);

    public  User findUserById(Integer id)throws Exception;

    public List<User> findAllUser();
}
