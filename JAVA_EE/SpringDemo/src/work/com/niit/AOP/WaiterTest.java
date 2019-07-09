package work.com.niit.AOP;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WaiterTest {
    @Test
    public void test(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        Waiter waiter = (Waiter)ac.getBean("waiter");
        waiter.greetTo("Tony");
           System.out.println("-------------------");
           waiter.serveTo("Join");
    }
}
