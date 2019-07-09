package chapter_03_springAOP.com_niit_aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloTest {
    @Test
    public void test(){
        String xmlPath = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        Hello hello = (Hello)ac.getBean("hello");
           System.out.println(hello.sayHello());
    }
}