package com.niit.service.serviceImpl;

import com.niit.dao.UserDao;
import com.niit.pojo.User;
import com.niit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/6/12 18:28
 * @Version 1.8
 **/

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public int insertUser(User user) throws Exception{
        return userDao.insertUser(user);
    }

    public int deleteUser(int id) throws Exception{
        return userDao.deleteUser(id);
    }

    public int updateUser(User user) throws Exception{
        return userDao.updateUser(user);
    }

    @Override
    public User findUser(String userPhone, String userPassword) {
        return userDao.findUser(userPhone,userPassword);
    }

    public User findUserById(Integer id){
        return userDao.findUserById(id);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
