package work.concert;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


//切面类
public class Audience {
//@Pointcut("execution(* work.concert.*.*(..))")
//    private void audPointCut(){}

//    前置通知
public void before3(JoinPoint joinPoint ){
     System.out.println("Silencing cell phones");

}
//    后置通知
    public void after3(JoinPoint joinPoint){
       System.out.println("后置：退场");
    }

/*    环绕通知，
    必须是Object类型的返回值，
    必须接收一个参数，
    必须是throws Throwable
  */
    public Object round3(ProceedingJoinPoint joinPoint) throws Throwable{
                 System.out.println("环绕前:Taking seats");
                Object object = joinPoint.proceed();
               System.out.println("环绕后:Clap Clap");
               return object;
    }
//    异常通知
    public void afterThrowing3(JoinPoint joinPoint,Throwable e){
       System.out.println("出现异常，要求退款"+"Demanding   a refund"+e.getMessage());
          }

    //    最终通知
    public void myFinal(){
        System.out.println("表演结束");
    }
}
