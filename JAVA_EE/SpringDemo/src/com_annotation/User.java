package com_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import java.util.Random;

public class User {
    private int id;
    private String name;
    private String psd;
//    使用@Autowired注解加@Qualifier注解时间按Bean实例化装配

    @Qualifier("random")
    @Autowired
    Random rnd;

    public User() {
    }

    /*因为对象 user 依赖于 random，将 random 注入到 user 中时，
必须先得生成对象 random 和 user，然后才能进行注入。
如果想在生成对象时完成某些初始化操作，而偏偏这些初始化操作又依赖于依赖注入，
那么就无法在构造函数中实现，为此，可以使用@PostConstruct 注解一个方法来完成初始化，
@Postconstruct 注解的方法将会在依赖注入完成候自动被调用*/
    @PostConstruct  //指定初始化调用方法
    public void initUser() {
        this.id = rnd.nextInt(1000);
        this.name = "用户" + this.id;
        this.psd = "123";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public Random getRnd() {
        return rnd;
    }

    public void setRnd(Random rnd) {
        this.rnd = rnd;
    }
}
