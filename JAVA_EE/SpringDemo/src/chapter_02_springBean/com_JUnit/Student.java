package chapter_02_springBean.com_JUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component("student1")
public class Student {
private Pet pet;
private String name;
private Integer age;

//如果Pet有多个Bean时，就要用Resource(name="")来确定是哪一个
  @Autowired
    public void setPet(Pet pet){
        this.pet=pet;
    }

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
                "pet=" + pet +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
