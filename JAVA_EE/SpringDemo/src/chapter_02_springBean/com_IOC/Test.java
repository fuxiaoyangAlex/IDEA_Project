package chapter_02_springBean.com_IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
    String xmlPath = "chapter_02_springBean/com_IOC/Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        Group group = (Group) ac.getBean("group");
        System.out.println(group);
}
}
