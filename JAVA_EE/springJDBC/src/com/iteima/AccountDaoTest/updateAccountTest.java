package com.iteima.AccountDaoTest;

import com.iteima.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName updateAccountTest
 * @Description TODO
 * @Author tree
 * @Date 2019/3/20 15:56
 * @Version 1.8
 **/
public class updateAccountTest {
    @Test
    public void updateAccountTest(){
//        加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      获取AccountDao属性
        AccountDao accountDao2 =(AccountDao)ac.getBean("accountDao");
//        创建Account对象，并添加数据
        Account account2 = new Account();
        account2.setId(1);
        account2.setUsername("Alex");
        account2.setBalance(9999.0);
//        执行updateAccount（）方法，并获取返回结果
        int num = accountDao2.updateAccount(account2);
        if(num>0)
               System.out.println("成功修改了"+num+"条数据");
        else
               System.out.println("修改操作执行失败");
    }
}
