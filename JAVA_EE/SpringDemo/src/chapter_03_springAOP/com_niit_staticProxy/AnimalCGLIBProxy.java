package chapter_03_springAOP.com_niit_staticProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AnimalCGLIBProxy implements MethodInterceptor {
    private  Object target;

    public Object createProxy(Object target){
//        创建一个动态类对象
        Enhancer enhancer = new Enhancer();
//        需要增强的类
        enhancer.setSuperclass(target.getClass());
//        创建回调函数
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        创建切面
        //前增强
        Master.come();
//        目标执行方法
        Object obj = methodProxy.invokeSuper(o,objects);
        //后增强
        Master.leave();

        return obj;
    }
}
