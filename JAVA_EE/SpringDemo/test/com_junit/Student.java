package com_junit;


import myself.testJUnit.Pet;

public class Student {
    private Pet pet;
    private String name;
    private Integer age;

    public Student(Pet pet){
        this.pet=pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
