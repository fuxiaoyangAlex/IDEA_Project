package com.ithima.service.impl;

import com.ithima.dao.UserDao;
import com.ithima.po.User;
import com.ithima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/6/10 14:11
 * @Version 1.8
 **/

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User findUser(String usercode, String password) {
      return userDao.findUser(usercode,password);
    }
}
