package com.msg.service;

import com.msg.entity.Customer;
import com.msg.entity.CustomerGroup;

import java.util.List;

/**
 * Created by wd on 2018/3/8.
 */
public interface CustomerService {
    Integer insertCustomer(Customer customer);
    Integer deleteCustomer(Customer customer);
    Integer updateCustomer(Customer customer);
    Customer selectCustomerById(Long customerId);
    List<Customer> selectAllCustomer();
    Integer insertCustomerGroup(CustomerGroup customerGroup);
    Integer deleteCustomerGroup(Customer customer);
    Integer updateCustomerGroup(CustomerGroup customerGroup);
    Customer selectCustomerGroupById(Long customerGroupId);
    List<CustomerGroup> selectAllCustomerGroup();
}
