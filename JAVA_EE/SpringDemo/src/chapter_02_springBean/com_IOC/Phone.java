package chapter_02_springBean.com_IOC;

public class Phone {

    private String brand;
    private String color;

    public Phone(){

    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand=" + brand +
                ", color='" + color + '\'' +
                '}';
    }
}
