package com.niit.service;

import com.niit.pojo.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author tree
 * @Date 2019/6/12 18:27
 * @Version 1.8
 **/
public interface UserService {
    public int insertUser(User user) throws Exception;

    public int deleteUser(int id) throws Exception;

    public int updateUser(User user) throws Exception;

    public User findUser(String userPhone, String userPassword);

    public  User findUserById(Integer id);

    public List<User> findAllUser();
}
