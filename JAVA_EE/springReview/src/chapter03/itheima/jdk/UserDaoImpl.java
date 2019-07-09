package chapter03.itheima.jdk;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 13:07
 * @Version 1.8
 **/
@Repository("userDao")
public class UserDaoImpl implements UserDao{
    @Override
    public void addUser() {
           System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
               System.out.println("删除用户");
    }
}
