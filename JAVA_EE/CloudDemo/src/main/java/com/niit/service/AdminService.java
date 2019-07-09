package com.niit.service;

import com.niit.pojo.Admin;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author tree
 * @Date 2019/6/12 19:01
 * @Version 1.8
 **/
public interface AdminService {
    public Admin findAdmin(String adminPhone, String adminPassword );
}
