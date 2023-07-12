package com.umair.spring.dao;

import com.umair.spring.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();
    Customer findById(Long id);
    Customer save(Customer customer);
    void delete(Long id);

}