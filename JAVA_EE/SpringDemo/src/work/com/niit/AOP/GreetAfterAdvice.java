package work.com.niit.AOP;


import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class GreetAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        String name=(String)objects[0];
           System.out.println("...Please Like YouSelf...Mr."+name);
    }
}
