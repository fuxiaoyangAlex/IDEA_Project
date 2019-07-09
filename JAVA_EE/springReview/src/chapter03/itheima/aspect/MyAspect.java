package chapter03.itheima.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyAspect
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 13:09
 * @Version 1.8
 **/
@Aspect
@Component
public class MyAspect {
    //切入点表达式
    @Pointcut("execution(* chapter03.itheima.jdk.UserDao.addUser())")
//    使用一个返回值为void，方法体为空的方法名来定义切点名
    private void myPointCut(){}
//    前置
    @Before("myPointCut()")
    public void myBefore(){
        System.out.println("......前置通知.......");
    }
//    后置
    @AfterReturning("myPointCut()")
    public void myAfterReturning(){
           System.out.println("......后置通知......");
    }
/*环绕通知
* ProceedingJoinPoint是JoinPoint子接口，表示可以执行目标方法
* 必须是Object类型的返回值
* 必须接收一个参数
* 必须throws Throwable
* */
@Around("myPointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
           System.out.println("...环绕前...");
//           执行目标函数
        Object obj = proceedingJoinPoint.proceed();
           System.out.println(".....环绕后......");
           return obj;
    }
    @AfterThrowing(value = "myPointCut()",throwing = "e")
    public void myAfterThrowing(Throwable e){
           System.out.println("异常通知"+"出错了"+e.getMessage());
    }

    @After("myPointCut()")
    public void myAfter(){
           System.out.println("....最终通知.....");
    }
}
