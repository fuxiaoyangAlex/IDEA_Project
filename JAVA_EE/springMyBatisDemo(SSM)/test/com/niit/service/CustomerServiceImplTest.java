package com.niit.service;

import com.niit.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class CustomerServiceImplTest {
//自动注入
    @Autowired
    private  CustomerService customerService;
//    日志
    private final Logger logger = LoggerFactory.getLogger(CustomerServiceImplTest.class);
    @Test
    public void insertCustomer() {
        Customer customer = new Customer();
        customer.setJobs("worker");
        customer.setUsername("汤姆猫");
        customer.setPhone("8615109");
        try{
            customerService.insertCustomer(customer);
            logger.info("插入成功"+customer);
        }catch (Exception e){
            logger.error("插入失败"+e.getMessage());
        }

    }

    @Test
    public void deleteCustomer() {

    }

    @Test
    public void updateCustomer() {
    }

    @Test
    public void getCustomerById() {
    }

    @Test
    public void getAllCustomer() {
    }

    @Test
    public void getCustomerByNameLike() {
    }

    @Test
    public void findCustomerByNameAndJobs() {
    }

    @Test
    public void findCustomerByNameOrJobs() {
    }

    @Test
    public void getCustomerByIds() {
    }
}