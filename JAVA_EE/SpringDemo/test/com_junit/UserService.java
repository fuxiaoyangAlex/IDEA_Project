package com_junit;

public class UserService {
    private User user;

    public UserService() {

    }

    public UserService(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean userLogin(User user) {

        if (user.getAccount().equals("admin") && user.getPassword().equals("1111")) {
            System.out.println("用户:" + user.getAccount());
            System.out.println("密码:" + user.getPassword());
            System.out.println("登陆成功");
            return true;
        } else
            System.out.println("用户:" + user.getAccount());
        System.out.println("密码:" + user.getPassword());
        System.out.println("登陆失败");
        return false;
    }

}
