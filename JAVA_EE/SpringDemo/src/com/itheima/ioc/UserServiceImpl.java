package com.itheima.ioc;

public class UserServiceImpl implements UserService {
    //声明UserDao属性
    private UserDao userDao;
    //添加UserDao属性的setter方法，用于实现依赖注入
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    //实现接口
    public void say(){
        this.userDao.say();
        System.out.println("userService say Hello World!");
    }
}
