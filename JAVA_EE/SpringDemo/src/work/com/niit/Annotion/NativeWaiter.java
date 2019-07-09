package work.com.niit.Annotion;

import work.com.niit.AOP.Waiter;

public class NativeWaiter implements Waiter{
    @Override
    public void greetTo(String name) {
           System.out.println("Greet to"+name);
    }

    @Override
    public void serveTo(String name) {
               System.out.println("Server to"+name);
    }
}
