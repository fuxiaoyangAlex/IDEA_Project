package chapter_03_springAOP.com_itheima_jdk;

//切面类：可以存在多个通知Advice
public class MyAspect {
 public void check_Permissions(){
       System.out.println("模拟检查权限...");
  }
  public void log(){
     System.out.println("模拟记录日志...");
  }
}
