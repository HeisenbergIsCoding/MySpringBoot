package com.demo.myspringbootdemo.model;


import org.springframework.data.annotation.Id;

/**
 * @author ziv
 * @date 2022-07-22 2:59 下午
 * @description 給mongodb用的物件
 */
public class Customer {
    @Id
    public String id;
    public String name;
    public String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
