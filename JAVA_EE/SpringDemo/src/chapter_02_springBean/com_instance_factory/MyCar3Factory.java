package chapter_02_springBean.com_instance_factory;


public class MyCar3Factory {
    public MyCar3Factory() {
        System.out.println("Car3工厂实例化中");
    }

    public Car3 createCar3() {
        return new Car3();
    }
}
