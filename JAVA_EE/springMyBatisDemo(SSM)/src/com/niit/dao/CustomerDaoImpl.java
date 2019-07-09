package com.niit.dao;

import com.niit.domain.Customer;

import java.util.List;

/**
 * @ClassName CustomerDaoImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/4/15 9:16
 * @Version 1.8
 **/
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public int insertCustomer(Customer customer) throws Exception {
        return 0;
    }

    @Override
    public int deleteCustomer(int id) throws Exception {
        return 0;
    }

    @Override
    public int updateCustomer(Customer customer) throws Exception {
        return 0;
    }

    @Override
    public Customer getCustomerById(int id) throws Exception {
        return null;
    }

    @Override
    public List<Customer> getAllCustomer() throws Exception {
        return null;
    }

    @Override
    public List<Customer> getCustomerByNameLike(String keyword) throws Exception {
        return null;
    }

    @Override
    public List<Customer> findCustomerByNameAndJobs(Customer customer) throws Exception {
        return null;
    }

    @Override
    public List<Customer> findCustomerByNameOrJobs(Customer customer) throws Exception {
        return null;
    }

    @Override
    public List<Customer> getCustomerByIds(List<Integer> ids) throws Exception {
        return null;
    }
}
