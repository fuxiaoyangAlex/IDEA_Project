package com_junit;

import myself.testJUnit.Pet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)//使用JUnit进行测试，帮我们创建容器
@ContextConfiguration("classpath:com_junit/beans.xml")//读取配置文件
public class Test_Junit {

    @Resource(name="dog")
    private Pet p;
    @Test
    public void Test(){
           System.out.println(p);
    }
}
