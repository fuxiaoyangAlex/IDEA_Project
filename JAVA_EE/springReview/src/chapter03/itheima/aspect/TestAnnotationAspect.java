package chapter03.itheima.aspect;

import chapter03.itheima.jdk.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestAnnotationAspect
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 13:26
 * @Version 1.8
 **/

public class TestAnnotationAspect {
@Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter03/itheima/applicationContext.xml");
        UserDao userDao = (UserDao)ac.getBean("userDao");
        userDao.addUser();
    }
}
