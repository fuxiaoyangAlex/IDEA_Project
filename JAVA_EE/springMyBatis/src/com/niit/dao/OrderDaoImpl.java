package com.niit.dao;

import com.niit.domain.Orders;
import com.niit.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;


/**
 * @ClassName OrderDaoImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/4/10 10:57
 * @Version 1.8
 **/
public class OrderDaoImpl implements OrderDao {
    SqlSession session;
    @Override
    public Orders findOrderWithProduct(Integer id) throws Exception {
        session= MyBatisUtil.getSession();
        Orders orders = session.getMapper(OrderDao.class).findOrderWithProduct(id);
        session.commit();
        session.close();
        return orders;
    }

    @Override
    public Orders findOrderWithProduct1(Integer id) throws Exception {
        session=MyBatisUtil.getSession();
         Orders orders = session.getMapper(OrderDao.class).findOrderWithProduct1(id);
        session.commit();
        session.commit();
        return orders;
    }
}
