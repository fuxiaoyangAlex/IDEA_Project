package work.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository("user")
public class TestJDBC {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
               UserDao userDao = (UserDao)ac.getBean("user");
               userDao.insert("Join");
    }
}
