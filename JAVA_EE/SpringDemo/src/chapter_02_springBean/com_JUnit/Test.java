package chapter_02_springBean.com_JUnit;

import org.junit.runner.RunWith;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:chapter_02_springBean/com_JUnit/Beans.xml")

public class Test {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter_02_springBean/com_JUnit/Beans.xml");
           Student student = (Student)ac.getBean("student1");
           System.out.println(student);

    }
}
