package com.niit.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Admin
 * @Description TODO
 * @Author tree
 * @Date 2019/6/12 18:25
 * @Version 1.8
 **/
@Data
public class Admin {
    private Integer adminId;
    private String adminName;
    private String adminPhone;  //手机登陆
    private String adminPassword; //登陆密码
    private String adminEmail;
    private Integer adminPosition; //权限等级
    private Date adminUpadatetime;
    private String adminHeadurl; //头像路径
}
