package com.demo.myspringbootdemo.controller;

import com.demo.myspringbootdemo.dao.CustomerDao;
import com.demo.myspringbootdemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ziv
 * @date 2022-07-22 4:29 下午
 * @description 使用mongodb的mongotemplate
 */
@RestController
@RequestMapping("/ct")
public class CustomerMongoTempController {
    @Autowired
    private CustomerDao customerDao;

    @GetMapping("")
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable String id) {
        return customerDao.getCustomerById(id);
    }

    @PostMapping("")
    public Customer addorUpdateNewCustomer(@RequestBody Customer customer) {
        return customerDao.addorUpdateNewCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerById(@PathVariable String id) {
        customerDao.deleteCustomerById(id);
    }
}
