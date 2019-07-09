package work.com.niit.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class GreetingAdvice {

    //    前置增强
    public void before(JoinPoint joinPoint ){
        Object[] object=joinPoint.getArgs();
        String name=(String)object[0];
           System.out.println("How are you! Mr."+name);

}
//        后置增强
    public void after(JoinPoint joinPoint){
           System.out.println("被织入后置增强的方法："+joinPoint.getSignature());
    }
//    最终通知
    public void myFinal(){
           System.out.println("最终通知！！！");
    }

//    异常通知
    public void afterThrowing(JoinPoint joinPoint,Throwable e){
           System.out.println("出现异常："+e.getMessage());
    }

//    环绕通知
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
