package com.ivan.tkmybatis.controller;

import com.ivan.tkmybatis.bean.Customer;
import com.ivan.tkmybatis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Ivan
 * @Date 2020/3/26 18:51
 */
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/getAll")
    public List<Customer> getAll(){
        return customerService.selectAllCustomer();
    }

    @GetMapping("/get/{id}")
    public Customer getById(@PathVariable Long id){
        return customerService.getById(id);
    }
}
