package com.demo.myspringbootdemo.controller;

import com.demo.myspringbootdemo.model.Customer;
import com.demo.myspringbootdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ziv
 * @date 2022-07-22 3:10 下午
 * @description 設定controller 用來操作mongodb crud
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("")
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable String id) {
        return customerRepository.findById(id).orElse(new Customer());
    }

    @PostMapping("")
    public Customer addorUpdateNewCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerById(@PathVariable String id) {
        customerRepository.deleteById(id);
    }
}
