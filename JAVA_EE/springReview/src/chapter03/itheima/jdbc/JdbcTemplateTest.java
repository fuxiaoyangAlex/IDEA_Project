package chapter03.itheima.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @ClassName JdbcTemplateTest
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 13:45
 * @Version 1.8
 **/
public class JdbcTemplateTest {
//    使用execute()方法创建表
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取 JdbcTemplate实例
        JdbcTemplate jdbcTemplate = (JdbcTemplate)ac.getBean("jdbcTemplate");
//        使用execute()方法执行SQL语句,创建表
        jdbcTemplate.execute("create table acc(" +
                "id int primary key auto_increment," +
                "username varchar (20)," +
                "balance double) ");
           System.out.println("创建成功");
    }
}
