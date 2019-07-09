package chapter_03_springAOP.com_niit_staticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AnimalJDKProxy implements InvocationHandler {
//    目标类型不确定，定义为Object
    private Object target;

//    给一个委托类，返回一个代理对象（创建一个代理）
    public Object createProxy(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        定义切面   切面中方法都是静态的就不需要定义，可直接使用
        //前增强
        Master.come();
//        在目标类上调用方法，并传入参数
        Object obj = method.invoke(target,args);
        //后增强
        Master.leave();

        return obj;
    }
}
