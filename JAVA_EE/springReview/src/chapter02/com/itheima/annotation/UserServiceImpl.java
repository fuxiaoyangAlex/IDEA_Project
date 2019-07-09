package chapter02.com.itheima.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 12:45
 * @Version 1.8
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
//    有一个Dao时，可以用Autowired 有多个时，用Resource
    @Autowired
    private Dao dao;
    @Override
    public void save() {
        dao.save();
           System.out.println("UserService.....save");
    }
}
