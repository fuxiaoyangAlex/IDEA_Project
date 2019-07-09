package chapter02.com.itheima.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 12:50
 * @Version 1.8
 **/
@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;
    public void save(){
        userService.save();
           System.out.println("userController....save");
    }
}
