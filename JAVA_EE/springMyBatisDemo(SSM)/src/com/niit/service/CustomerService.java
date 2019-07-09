package com.niit.service;

import com.niit.domain.Customer;

import java.util.List;

/**
 * @ClassName CustomerService
 * @Description TODO
 * @Author tree
 * @Date 2019/4/15 9:21
 * @Version 1.8
 **/
public interface CustomerService {
    int insertCustomer(Customer customer) throws Exception;
    int deleteCustomer(int id) throws Exception;
    int updateCustomer(Customer customer) throws Exception;

    Customer getCustomerById(int id) throws Exception;
    List<Customer> getAllCustomer() throws Exception;
    List<Customer> getCustomerByNameLike(String keyword)throws Exception;

    List<Customer> findCustomerByNameAndJobs(Customer customer) throws Exception;
    List<Customer> findCustomerByNameOrJobs(Customer customer) throws Exception;
    List<Customer> getCustomerByIds(List<Integer> ids) throws Exception;
}
