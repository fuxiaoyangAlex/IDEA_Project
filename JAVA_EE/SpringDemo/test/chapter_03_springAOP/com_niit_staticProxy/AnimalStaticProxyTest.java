package chapter_03_springAOP.com_niit_staticProxy;

import org.junit.Test;

public class AnimalStaticProxyTest {
   Dog dog = new Dog();
   AnimalStaticProxy proxy = new AnimalStaticProxy(dog);

    @Test
    public void eat() {
        proxy.eat();
    }

//   @Test
//   public void play() {
//     proxy.play();
//   }
    @Test
    public void sleep(){
        proxy.sleep();
    }
}