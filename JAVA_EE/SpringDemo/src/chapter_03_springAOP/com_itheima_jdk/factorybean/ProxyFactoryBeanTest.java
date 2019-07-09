package chapter_03_springAOP.com_itheima_jdk.factorybean;

import chapter_03_springAOP.com_itheima_jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试类
public class ProxyFactoryBeanTest {
    public static void main(String[] args){
     String xmlPath = "chapter_03_springAOP/com_itheima_jdk/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao)ac.getBean("userDaoProxy");
        userDao.addUser();
        userDao.deleteUser();
    }
}
