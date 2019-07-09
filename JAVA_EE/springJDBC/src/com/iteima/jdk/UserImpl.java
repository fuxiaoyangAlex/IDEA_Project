package com.iteima.jdk;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 15:09
 * @Version 1.8
 **/

@Repository("dao")
public class UserImpl implements UserDao {
    @Override
    public void addUser() {
           System.out.println("....添加用户....");
    }
}
