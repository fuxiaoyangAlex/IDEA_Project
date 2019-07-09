package chapter_02_springBean.com_scope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTes2_类型为prototype {
    public static void main(String[] args){
        String xmlPath = "chapter_02_springBean/com_scope/Bean4.xml";
        AbstractApplicationContext container = new ClassPathXmlApplicationContext(xmlPath);
        LifeBean life2 = (LifeBean) container.getBean("life_prototype");
        System.out.println(life2);
        container.close();
    }
    /*如果bean的scope设为prototype时，当容器关闭时，
    destroy方法不会被调用。对于prototype作用域的bean，
    有一点非常重要，那就是Spring不能对一个prototype bean的整个生命周期负责：
    容器在初始化、配置、装饰或者是装配完一个prototype实例后，将它交给客户端，
    随后就对该prototype实例不闻不问了
     */

}
