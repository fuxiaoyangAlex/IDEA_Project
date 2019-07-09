package chapter_03_springAOP.com_itheima_jdk.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//      切面类 需要实现该接口，并实现接口中的invoke()方法
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
            check_Permissions();
//            执行目标方法
        Object obj = methodInvocation.proceed();
        log();
        return obj;
    }
    public void check_Permissions(){
           System.out.println("模拟检查权限...");
    }
    public void log(){
           System.out.println("模拟记录日志...");
    }
}