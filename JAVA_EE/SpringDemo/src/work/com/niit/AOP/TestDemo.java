package work.com.niit.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Waiter proxy =(Waiter)ac.getBean("proxy");
        proxy.greetTo("FXY");
    }
}
