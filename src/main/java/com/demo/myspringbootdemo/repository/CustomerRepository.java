package com.demo.myspringbootdemo.repository;

import com.demo.myspringbootdemo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ziv
 * @date 2022-07-22 3:07 下午
 * @description 建立操作mongodb的接口
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

}

