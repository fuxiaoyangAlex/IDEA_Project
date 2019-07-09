package work.com.niit.Annotion;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/*创建一个切面，如果不传递参数，它只是一个普通的类
* 如果要传递参数，则参数使用JonitPoint来实现参数的传递
* */
@Aspect
@Component("greetingAdvice")
public class GreetingAdvice {
//    定义一个切点表达式
    @Pointcut("execution(* work.com.niit.Annotion.Waiter.*(..))")
//    使用一个为u返回值的，方法体为空的方法来命名切入点

    private  void myPointCut(){}

    //    前置增强
    @Before("myPointCut()")
    public void before(JoinPoint joinPoint ){
        Object[] object=joinPoint.getArgs();
        String name=(String)object[0];
           System.out.println("How are you! Mr."+name);

}
//        后置增强
    @AfterReturning("myPointCut()")
    public void after(JoinPoint joinPoint){
           System.out.println("被织入后置增强的方法："+joinPoint.getSignature());
    }
//    最终通知
    @After("myPointCut()")
    public void myFinal(){
           System.out.println("最终通知！！！");
    }

//    异常通知
    @AfterThrowing(value = "myPointCut()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Throwable e){
           System.out.println("出现异常："+e.getMessage());
    }

//    环绕通知
    @Around("myPointCut()")
    public Object round(ProceedingJoinPoint joinPoint)throws Throwable{
        /*相当于befor*/
           System.out.println("开始执行环绕增强！！");
           /*执行目标方法*/
           Object object =joinPoint.proceed();
           /*相当于afterReturning*/
              System.out.println("结束环绕增强");
              return object;
    }
}
