package com.iteima.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @ClassName JdbcTemplateTest
 * @Description 该类使用execute(String sql)方法执行SLQ语句
 * @Author tree
 * @Date 2019/3/20 14:49
 * @Version 1.8
 **/
public class JdbcTemplateTest {
    /*
    使用 execute（）方法创建表
     */
    @Test
    public void mianTest(){
//        加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取JdbcTemplate实例
        JdbcTemplate jdbcTemplate = (JdbcTemplate)ac.getBean("jdbcTemplate");
//        使用execute()方法执行SQL语句，创建用户账户管理表account
        jdbcTemplate.execute("create table account(" +
                "id int primary key auto_increment," +
                "username varchar (20)," +
                "balance double) ");
           System.out.println("账户表account创建成功");
    }
}
