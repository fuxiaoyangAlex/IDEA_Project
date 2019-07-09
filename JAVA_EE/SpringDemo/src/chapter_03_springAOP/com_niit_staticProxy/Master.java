package chapter_03_springAOP.com_niit_staticProxy;

//这个Master类就是属于切面
public class Master {

    public static void come(){
           System.out.println("......Master来了......");
    }
    public static void leave(){
           System.out.println("......Master离开了.......");
    }
}
