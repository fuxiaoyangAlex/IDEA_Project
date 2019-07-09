package chapter02.com.itheima.annotation;

import org.springframework.stereotype.Repository;

/**
 * @ClassName DaoImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 12:43
 * @Version 1.80
 **/
@Repository("userdao")
public class DaoImpl implements Dao{
    @Override
    public void save() {
           System.out.println("UserDao....save");
    }
}
