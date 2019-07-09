package work.com.niit.AOP;

        import org.springframework.aop.MethodBeforeAdvice;

        import java.lang.reflect.Method;

public class GreetBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        String name = (String)objects[0]; // 接收参数
        System.out.println("How are you! Mr"+name);
    }
}
