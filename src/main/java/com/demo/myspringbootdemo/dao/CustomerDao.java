package com.demo.myspringbootdemo.dao;

import com.demo.myspringbootdemo.model.Customer;

import java.util.List;

/**
 * @author ziv
 * @date 2022-07-22 4:10 下午
 * @description
 */
public interface CustomerDao {
    List<Customer> getAll();

    Customer getCustomerById(String id);

    Customer addorUpdateNewCustomer(Customer customer);

    void deleteCustomerById(String id);
}
