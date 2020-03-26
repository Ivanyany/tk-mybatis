package com.ivan.tkmybatis.service;

import com.ivan.tkmybatis.bean.Customer;

import java.util.List;

/**
 * @Author Ivan
 * @Date 2020/3/26 18:49
 */
public interface CustomerService {

    //利用tk.mybatis查询
    List<Customer> selectAllCustomer();

    //自定义查询
    Customer getById(Long id);
}
