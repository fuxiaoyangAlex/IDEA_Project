package com.iteima.AccountDaoTest;

import com.iteima.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName addAccountTest
 * @Description TODO
 * @Author tree
 * @Date 2019/3/20 15:40
 * @Version 1.8
 **/
public class addAccountTest {
    @Test
    public void addAccountTest(){
//        加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取AccountDao实例
        AccountDao accountDao1 = (AccountDao)ac.getBean("accountDao");
//            int n = 3/0;
//        创建Account实例
        Account account = new Account();
        account.setUsername("Rose");
        account.setBalance(2000.0);
//        执行addAccount()方法，并获取返回结果
         int num = accountDao1.addAccount(account);

         if(num>0)
                System.out.println("成功插入"+num+"条数据");
         else
                System.out.println("插入数据操作失败");
    }


}
