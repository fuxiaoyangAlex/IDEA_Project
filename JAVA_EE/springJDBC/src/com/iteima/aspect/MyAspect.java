package com.iteima.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyAspect
 * @Description TODO
 * @Author tree
 * @Date 2019/3/20 16:54
 * @Version 1.8
 **/


@Aspect
@Component
public class MyAspect {
    // 切入点
    @Pointcut("execution(* com.iteima.AccountDaoTest.*.*(..))")
    private void myponitcut(){
    }

    //    环绕通知
    @Around("myponitcut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
           System.out.println("环绕****数据插入操作开始执行*****");
//           目标函数执行
           Object obj = proceedingJoinPoint.proceed();
//           后置环绕
           System.out.println("环绕*****数据插入操作执行结束*****");
           return  obj;
    }
    @AfterThrowing(value = "myponitcut()",throwing="e")
        public void myAfterThrowing( JoinPoint joinPoint,Throwable e){
        System.out.println("*******测试是否执行******");
           System.out.println("异常通知"+e.getMessage());

    }

}
