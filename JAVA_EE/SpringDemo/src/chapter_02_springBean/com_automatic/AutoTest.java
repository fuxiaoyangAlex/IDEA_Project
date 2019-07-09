package chapter_02_springBean.com_automatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {
    public static void main(String[] args){
        String xmlPath="chapter_02_springBean/com_automatic/Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        TextEditor te = (TextEditor) ac.getBean("textEditor");
        te.spellCheck();
}
}
