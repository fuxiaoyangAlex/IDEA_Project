import com.iteima.AccountDaoTest.AccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TransactionTest
 * @Description TODO
 * @Author tree
 * @Date 2019/3/25 10:45
 * @Version 1.8
 **/
public class TransactionTest {
    @Test
    public void xmlTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取AccountDao实例
        AccountDao accountDao = (AccountDao)ac.getBean("accountDao");
//        调用实例中的转账方法
        accountDao.transfer("Jack","Rose",100.0);
//        输出提示信息
           System.out.println("转账成功");
    }
}
