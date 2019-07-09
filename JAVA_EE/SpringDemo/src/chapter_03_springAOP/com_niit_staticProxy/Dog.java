package chapter_03_springAOP.com_niit_staticProxy;

public class Dog implements Animal {
    @Override
    public void eat() {
           System.out.println("...狗在吃骨头...");
    }

    @Override
    public void play() {
           System.out.println("狗和主人在一起玩");
    }

    @Override
    public void sleep() {
           System.out.println("....狗狗在午休...");
    }
}
