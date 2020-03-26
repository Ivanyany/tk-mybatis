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

    /**
     * @Author Ivan
     * @Description 利用tk.mybatis查询
     * @Date 2020/3/26 19:15
     * @Param
     * @return
     */
    public List<Customer> selectAllCustomer(){
        return customerMapper.selectAll();
    }

    /**
     * @Author Ivan
     * @Description 自定义查询
     * @Date 2020/3/26 19:16
     * @Param
     * @return
     */
    @Override
    public Customer getById(Long id) {
        return customerMapper.selectById(id);
    }

    public void otherMethod(){
        //插入一条数据,所有的字段都会添加一遍,即使没有值
//        customerMapper.insert(T);

        //插入一条数据,只给有值的字段赋值（会对传进来的值做非空判断）
//        customerMapper.insertSelective(T);

        //*****************************************************

        //根据对象删除数据
//        customerMapper.delete(T)

        //根据主键删除数据
//        customerMapper.deleteByPrimaryKey(id);

        //*****************************************************

        //根据主键修改数据,所有字段都修改
//        customerMapper.updateByPrimaryKey(T);

        //根据主键修改数据,只修改有值得字段
//        customerMapper.updateByPrimaryKeySelective(T);

        //*****************************************************

        //根据对象查询
//        customerMapper.select(T);

        //查询所有
//        customerMapper.selectAll();

        //根据主键查询
//        customerMapper.selectByPrimaryKey(id);

        //查询数据个数
//        customerMapper.selectCount(T);

        //查询一条数据
//        customerMapper.selectOne(T);
    }
}
