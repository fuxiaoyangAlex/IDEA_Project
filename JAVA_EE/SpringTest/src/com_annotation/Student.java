package com_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu1")
public class Student {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    @Value("fxy")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    @Value("21")
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
