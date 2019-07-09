package com.niit.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Author tree
 * @Date 2019/6/12 18:26
 * @Version 1.8
 **/
@Data
public class User {
    private Integer userId;
    private String userName;
    private Integer userPhone;
    private String userPassword;
    private String userEmail;
    private String userSignature;
    private String userHeadurl;
    private Date userUpdatetime;
}
