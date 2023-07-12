package com.umair.spring.dao.impl;


import com.umair.spring.dao.CustomerRepository;
import com.umair.spring.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

    private List<Customer> customers = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(Long id) {
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        if (customer.getId() == null) {
            customer.setId(nextId++);
        }
        customers.add(customer);
        return customer;
    }

    @Override
    public void delete(Long id) {
        customers.removeIf(customer -> customer.getId().equals(id));
    }

}