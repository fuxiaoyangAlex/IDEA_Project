package com.niit.domain;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Product
 * @Description TODO
 * @Author tree
 * @Date 2019/4/10 10:30
 * @Version 1.8
 **/
@Data
public class Product {
    private Integer product_id;
    private String name;
    private Integer price;
    private List<Orders> ordersList;
}
