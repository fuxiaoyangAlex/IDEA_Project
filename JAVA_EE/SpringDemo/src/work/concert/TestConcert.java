package work.concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConcert {
    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        performDao performDao = (performDao) ac.getBean("perfor3");
        performDao.perform("Tom");
    }
}
