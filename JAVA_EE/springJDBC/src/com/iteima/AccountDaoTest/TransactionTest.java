package com.iteima.AccountDaoTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TransactionTest
 * @Description TODO
 * @Author tree
 * @Date 2019/3/25 10:54
 * @Version 1.8
 **/
public class TransactionTest {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = (AccountDao) ac.getBean("accountDao");
        accountDao.transfer("Jack","Rose",200.0);
    }
}
