package com.niit.domain;

import lombok.Data;

/**
 * @ClassName Orders
 * @Description TODO
 * @Author tree
 * @Date 2019/4/10 8:21
 * @Version 1.8
 **/
@Data
public class Orders {
    private Integer order_id;
    private String number;
    private Integer user_id;
}
