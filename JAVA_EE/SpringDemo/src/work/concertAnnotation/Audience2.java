package work.concertAnnotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//切面类
@Aspect
@Component
public class Audience2 {

//    定义切入点表达式
    @Pointcut("execution(* work.concertAnnotation.*.*(..))")
    private void myPointCat(){}

//    前置通知
    @Before("myPointCat()")
public void before2(){
     System.out.println("Silencing cell phones");

}
//    后置通知
    @AfterReturning("myPointCat()")
    public void after2(JoinPoint joinPoint){
       System.out.println("后置：退场");
    }

/*    环绕通知，
    必须是Object类型的返回值，
    必须接收一个参数，
    必须是throws Throwable
  */
@Around("myPointCat()")
    public Object round2(ProceedingJoinPoint joinPoint) throws Throwable{
                 System.out.println("环绕前:Taking seats");
                Object object = joinPoint.proceed();
               System.out.println("环绕后:Clap Clap");
               return object;
    }
//    异常通知
    @AfterThrowing(value = "myPointCat()",throwing = "e")
    public void afterThrowing2(JoinPoint joinPoint,Throwable e){
       System.out.println("出现异常，要求退款"+"Demanding   a refund"+e.getMessage());
          }

    //    最终通知
    @After("myPointCat()")
    public void myFinal(){
        System.out.println("表演结束");
    }
}
