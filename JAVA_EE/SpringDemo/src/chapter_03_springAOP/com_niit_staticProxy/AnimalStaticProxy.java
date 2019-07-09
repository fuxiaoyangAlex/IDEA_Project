package chapter_03_springAOP.com_niit_staticProxy;

public class AnimalStaticProxy implements Animal {

    private Animal dog;

    public AnimalStaticProxy(Animal dog) {
        this.dog = dog;
    }

    @Override
    public void eat() {
        MyAspect.call();
        dog.eat();
        Master.leave();
    }

    @Override
    public void play() {
        Master.come();
        dog.play();
        Master.leave();
    }

    @Override
    public void sleep() {
        MyAspect.call();
        dog.sleep();
        Master.leave();

    }
}
