package com.niit.service.serviceImpl;

import com.niit.dao.AdminDao;
import com.niit.pojo.Admin;
import com.niit.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName AdminServiceImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/6/12 19:02
 * @Version 1.8
 **/
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin findAdmin(String adminPhone, String adminPassword) {
        return adminDao.findAdmin(adminPhone,adminPassword);
    }
}
