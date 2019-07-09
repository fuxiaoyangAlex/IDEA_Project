package com.iteima.AccountDaoTest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName deleteAccountTest
 * @Description TODO
 * @Author tree
 * @Date 2019/3/20 16:17
 * @Version 1.8
 **/
public class deleteAccountTest {
    @Test
    public void deleteAccountTest(){
        //    加载配置文件
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//    获取AccountDao的实例
        AccountDao accountDao3 = (AccountDao)ac.getBean("accountDao");
//     执行accountDelete方法，并获取返回结果
        int num = accountDao3.deleteAccount(20);
        if(num>0)
               System.out.println("成功删除了"+num+"条数据");
        else
               System.out.println("删除操作执行失败");
    }


}
