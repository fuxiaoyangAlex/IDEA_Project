package chapter_03_springAOP.com_niit_staticProxy;


import org.junit.Test;

public class AnimalJDKProxyTest {
//    创建代理对象
AnimalJDKProxy proxy = new AnimalJDKProxy();
//        创建目标类
    Animal dog = new Dog();

@Test
    public void Test(){
    Animal animal =(Animal)proxy.createProxy(dog);
//    执行方法
    animal.eat();
       System.out.println();
       animal.sleep();
}


}