package chapter_03_springAOP.com_niit_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello)ac.getBean("hello");
           System.out.println(hello.sayHello());
    }
}
