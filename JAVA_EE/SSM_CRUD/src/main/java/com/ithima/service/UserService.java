package com.ithima.service;

import com.ithima.po.User;

public interface UserService {
    /**
     * 用户service层
     */
    public User findUser(String usercode,String password);
}
