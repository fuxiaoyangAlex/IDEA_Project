package chapter_02_springBean.com_scope;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTest {


    public static void main(String[] args) {
        /* AbstractApplicationContext前面加上  Abstract
        责读取bean配置文档，管理bean的加载，实例化，维护bean之间的依赖关系，负责bean的声明周期。*/
        String xmlPath = "chapter_02_springBean/com_scope/Bean4.xml";
        AbstractApplicationContext container = new ClassPathXmlApplicationContext(xmlPath);
        LifeBean life1 = (LifeBean) container.getBean("life_singleton");
        System.out.println(life1);
        container.close();
//        LifeBean life2 = (LifeBean) container.getBean("life_prototype");
//        System.out.println("非单例模式测试");
//        System.out.println(life2);

    }
}
