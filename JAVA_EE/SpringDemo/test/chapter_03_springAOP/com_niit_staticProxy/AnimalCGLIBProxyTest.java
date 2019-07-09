package chapter_03_springAOP.com_niit_staticProxy;

import org.junit.Test;


public class AnimalCGLIBProxyTest {
    AnimalCGLIBProxy proxy = new AnimalCGLIBProxy();
    Animal dog1 = new Dog();

@Test
    public void test(){
  Animal animal = (Animal) proxy.createProxy(dog1);
   animal.eat();
      System.out.println();
      animal.sleep();
}
}