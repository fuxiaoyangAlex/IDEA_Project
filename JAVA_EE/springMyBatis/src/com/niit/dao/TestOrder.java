package com.niit.dao;

import com.niit.domain.Orders;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @ClassName TestOrder
 * @Description TODO
 * @Author tree
 * @Date 2019/4/10 11:06
 * @Version 1.8
 **/
public class TestOrder {
  private OrderDao orderDao = new OrderDaoImpl();
    private final Logger logger = LoggerFactory.getLogger(TestPerson.class);

    @Test
    public void findOrderWithProduct()throws Exception{
        int result =1;
        try{
           Orders order = orderDao.findOrderWithProduct1(result);
            logger.info("查询"+order);
        }catch (Exception e){
            logger.error("错误"+e.getMessage());
        }
    }
}
