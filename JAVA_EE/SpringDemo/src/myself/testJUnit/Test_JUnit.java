package myself.testJUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//@RunWith(SpringJUnit4ClassRunner.class)//使用JUnit进行测试，帮我们创建容器
//@ContextConfiguration("classpath:myself/mainBeans.xml")//读取配置文件
public class Test_JUnit {
    ApplicationContext ac = new ClassPathXmlApplicationContext("myself/mainBeans.xml");
Pet  pet = (Pet)ac.getBean("dog");
@Test
   public void print(){
           System.out.println(pet);
    }
}
