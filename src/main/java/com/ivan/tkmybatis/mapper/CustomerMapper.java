package com.ivan.tkmybatis.mapper;

import com.ivan.tkmybatis.bean.Customer;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @Author Ivan
 * @Date 2020/3/26 18:44
 */
public interface CustomerMapper extends BaseMapper<Customer> {

    Customer selectById(Long id);
}
