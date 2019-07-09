package work.com.niit.AOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GreeAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
//        前增强
        singSong();
        Object proceed =methodInvocation.proceed();
//       后增强
       ask();
        return proceed;
    }
    public void singSong(){
           System.out.println("Mr.Fu will sing...");
           try {
               for (int i = 0; i < 4; i++)
                   Thread.sleep(1000);
               System.out.println("...");
           }catch (InterruptedException e){
               e.printStackTrace();
           }
    }
    public void ask(){
               System.out.println("Are you satisfied with?");
    }

}
