package chapter03.Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @ClassName AnimalImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/3/22 16:25
 * @Version 1.8
 **/
@Repository("dog")
public class AnimalImpl implements Animal {
    @Override
    public void eat() {
           System.out.println("吃骨头");
    }
}
