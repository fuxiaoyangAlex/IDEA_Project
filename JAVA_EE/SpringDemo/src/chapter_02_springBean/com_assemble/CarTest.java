package chapter_02_springBean.com_assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    public static void main(String[] args){
//        chapter_02_springBean.com_assemble
    String xmlPath="chapter_02_springBean/com_assemble/Bean5.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
//       Car car1 = (Car)ac.getBean("car1");
//        System.out.println(car1);
        Car car2 =(Car)ac.getBean("car2");
        System.out.println(car2);
    }
}
