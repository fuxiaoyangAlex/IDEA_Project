package work.concertAnnotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerform2 {
    public static void main(String[] args){
        String xmlPath = "work/concertAnnotation/annot.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
//        从容器中获得内容
   performDao2 performDao2 = (performDao2)ac.getBean("per");
   performDao2.perform("Alex");
    }
}
