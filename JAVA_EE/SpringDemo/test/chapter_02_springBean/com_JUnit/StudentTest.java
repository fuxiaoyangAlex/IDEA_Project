package chapter_02_springBean.com_JUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:chapter_02_springBean/com_JUnit/Beans.xml")

public class StudentTest {
    private Student student;
 @Test
public void test(){
       student.toString();
}
}