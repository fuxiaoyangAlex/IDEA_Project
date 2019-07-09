package com.niit.dao;

import com.niit.pojo.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName AdminDao
 * @Description TODO
 * @Author tree
 * @Date 2019/6/12 18:16
 * @Version 1.8
 **/
public interface AdminDao {
    public Admin findAdmin(@Param("adminPhone") String adminPhone,
                           @Param("adminPassword") String adminPassword);
}
