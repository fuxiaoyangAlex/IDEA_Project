package com.niit.dao;

import com.niit.domain.Orders;


public interface OrderDao {
    Orders findOrderWithProduct(Integer id)throws Exception;

    Orders findOrderWithProduct1(Integer id)throws Exception;
}
