package com.niit.domain;

import lombok.Data;

import java.util.List;


/**
 * @ClassName User
 * @Description User和Orders关联
 * @Author tree
 * @Date 2019/4/10 8:22
 * @Version 1.8
 **/
@Data
public class User {
    private Integer user_id;
    private String username;
    private String address;
    private List<Orders> orders;
}
