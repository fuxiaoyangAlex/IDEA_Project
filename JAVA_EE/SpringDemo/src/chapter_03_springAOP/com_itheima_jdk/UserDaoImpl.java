package chapter_03_springAOP.com_itheima_jdk;

//目标类

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
