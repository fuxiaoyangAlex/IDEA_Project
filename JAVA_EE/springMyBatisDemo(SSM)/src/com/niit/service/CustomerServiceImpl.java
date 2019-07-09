package com.niit.service;

import com.niit.dao.CustomerDao;
import com.niit.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName CustomerServiceImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/4/15 9:23
 * @Version 1.8
 **/
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerDao customerDao;
    @Override
    public int insertCustomer(Customer customer) throws Exception {
        int result = customerDao.insertCustomer(customer);
        return result;
    }

    @Override
    public int deleteCustomer(int id) throws Exception {
        int result = customerDao.deleteCustomer(id);
        return result;
    }

    @Override
    public int updateCustomer(Customer customer) throws Exception {
        int result = customerDao.updateCustomer(customer);
        return result;
    }

    @Override
    public Customer getCustomerById(int id) throws Exception {
        Customer customer = customerDao.getCustomerById(id);
        return customer;
    }

    @Override
    public List<Customer> getAllCustomer() throws Exception {
       List<Customer> customerList = customerDao.getAllCustomer();
        return customerList;
    }

    @Override
    public List<Customer> getCustomerByNameLike(String keyword) throws Exception {
        List<Customer> customerList = customerDao.getCustomerByNameLike(keyword);
        return customerList;
    }

    @Override
    public List<Customer> findCustomerByNameAndJobs(Customer customer) throws Exception {
        List<Customer> customerList = customerDao.findCustomerByNameOrJobs(customer);
        return customerList;
    }

    @Override
    public List<Customer> findCustomerByNameOrJobs(Customer customer) throws Exception {
        List<Customer> customerList = customerDao.findCustomerByNameOrJobs(customer);
        return customerList;
    }

    @Override
    public List<Customer> getCustomerByIds(List<Integer> ids) throws Exception {
        List<Customer> customerList = customerDao.getCustomerByIds(ids);
        return customerList;
    }
}
