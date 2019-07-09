package chapter02.com.itheima.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserTest
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 12:55
 * @Version 1.8
 **/
public class UserTest {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserController userController =(UserController) ac.getBean("userController");
        userController.save();
    }
}
