package com.ithima.dao;

import com.ithima.po.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author tree
 * @Date 2019/6/10 13:36
 * @Version 1.8
 **/

public interface UserDao {
    /**
     * 通过账号和密码查询用户
     */
    public User findUser(@Param("usercode")String usercode, @Param("password") String password);
}
