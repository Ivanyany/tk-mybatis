package com.ivan.tkmybatis.service.impl;

import com.ivan.tkmybatis.bean.Customer;
import com.ivan.tkmybatis.mapper.CustomerMapper;
import com.ivan.tkmybatis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Ivan
 * @Date 2020/3/26 18:49
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    public List<Customer> selectAllCustomer(){
        return customerMapper.selectAll();
    }

    @Override
    public Customer getById(Long id) {
        return customerMapper.selectById(id);
    }
}
