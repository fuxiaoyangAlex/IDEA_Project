package chapter03.Dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName Point
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 16:27
 * @Version 1.8
 **/
@Aspect
@Component
public class Point {

    @Pointcut("execution(* chapter03.Dao.*.*(..))")
    public void poinCut(){}

    @Before("poinCut()")
    public void myBefor(){
           System.out.println("前置");
    }

    @AfterReturning("poinCut()")
    public void myAfterReturning(){
           System.out.println("后置");
    }

    @Around("poinCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
           System.out.println("环绕前");
           Object obj = proceedingJoinPoint.proceed();
              System.out.println("环绕后");
              return obj;
    }

    @AfterThrowing(value = "poinCut()",throwing = "e")
    public void myAfterThrowing(Throwable e){
           System.out.println(e.getMessage());
    }

}
