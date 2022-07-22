package com.demo.myspringbootdemo.dao;

import com.demo.myspringbootdemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

/**
 * @author ziv
 * @date 2022-07-22 4:14 下午
 * @description 使用mongotemplate
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
    //目前會紅的原因是因為intellj的問題
    //https://stackoverflow.com/questions/26889970/intellij-incorrectly-saying-no-beans-of-type-found-for-autowired-repository
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Customer> getAll() {
        return mongoTemplate.findAll(Customer.class);
    }

    @Override
    public Customer getCustomerById(String id) {
        return mongoTemplate.findById(id, Customer.class);
    }

    @Override
    public Customer addorUpdateNewCustomer(Customer customer) {
        return mongoTemplate.save(customer);
    }

    @Override
    public void deleteCustomerById(String id) {
        mongoTemplate.remove(Objects.requireNonNull(mongoTemplate.findById(id, Customer.class)));
    }
}
