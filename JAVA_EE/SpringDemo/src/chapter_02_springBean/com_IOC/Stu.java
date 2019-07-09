package chapter_02_springBean.com_IOC;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Stu {
    private Phone phone;
    private String name;
    private String gender;
    private List<String> hobby;

    public Stu(){

    }
    @Autowired
    Stu stu1;
    @Autowired
    Stu stu2;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }
//
//    public void say(){
//           System.out.println("你好我的名字是:"+this.name+
//                   "，性别"+this.gender+
//                   "，我使用的手机是"+phone.getBrand()+
//                   "，颜色是"+phone.getColor()+
//                   "，我的爱好是"+this.hobby);
//    }

    @Override
    public String toString() {
        return "Stu{" +
                "phone=" + phone +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", hobby=" + hobby +
                '}';
    }

}
