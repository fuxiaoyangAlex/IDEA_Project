package com.niit.dao;

import com.niit.domain.User;
import com.niit.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/4/10 8:46
 * @Version 1.8
 **/
public class UserDaoImpl implements UserDao{
    SqlSession session;
    @Override
    public User findUserWithOrders(Integer id) throws Exception {
        session= MyBatisUtil.getSession();
        User user = session.getMapper(UserDao.class).findUserWithOrders(id);
        // 两个等价 User user1 = session.selectList("findUserWithOrders",id);
        session.commit();
        session.close();
        return user;
    }

    @Override
    public User findUserWithOrders1(Integer id) throws Exception {
        session = MyBatisUtil.getSession();
        User user = session.getMapper(UserDao.class).findUserWithOrders1(id);
        session.commit();
        session.close();
        return user;
    }
}
