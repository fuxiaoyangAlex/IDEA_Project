package com.iteima.jdk;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName Join
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 17:19
 * @Version 1.8
 **/
@Aspect
@Component
public class Join {
    @Pointcut("execution(* com.iteima.*.*(..))")
    private void point(){}

    @Before("point()")
    public void myBefor(){
           System.out.println("jdk前置");
    }
}
