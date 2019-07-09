package com.niit.entity;

import lombok.Data;

/**
 * @ClassName Items
 * @Description TODO
 * @Author tree
 * @Date 2019/5/24 8:08
 * @Version 1.8
 **/

@Data
public class Items {
    private Integer id;
    private String name;
    private String city;
    private Integer price;
    private Integer number;
    private String  picture;

}
