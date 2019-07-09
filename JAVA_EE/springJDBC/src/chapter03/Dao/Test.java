package chapter03.Dao;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 16:37
 * @Version 1.8
 **/
public class Test {
    @org.junit.Test
    public void test(){
        String xmlPath="chapter03/application.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        Animal dog = (Animal)ac.getBean("dog");
        dog.eat();
    }


}
