package chapter_02_springBean.com_scope;

/*默认情况下，Spring在读取xml文件的时候，就会创建对象。
在创建对象的时候先调用构造器，
然后调用init-method属性值中所指定的方法。
对象在被销毁的时候，会调用destroy-method属性值中所指定的方法
（例如调用Container.destroy()方法的时候）。写一个测试类，代码如下：
---------------------
作者：fuzhongmin05
来源：CSDN
原文：https://blog.csdn.net/fuzhongmin05/article/details/73389779
*/

public class LifeBean {
    private String name;

    public LifeBean() {
        System.out.println("LifeBean()构造函数");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void init() {
        System.out.println("this is init of lifeBean");
    }

    public void destory() {
        System.out.println("this is destory of lifeBean" + this);
    }
}
