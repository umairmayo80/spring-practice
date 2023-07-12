package com.umair.spring;

import com.umair.spring.dao.CustomerRepository;
import com.umair.spring.dao.impl.InMemoryCustomerRepository;
import com.umair.spring.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.umair.spring"})
public class AppConfig {

    @Bean
    public CustomerRepository customerRepository() {
        return new InMemoryCustomerRepository();
    }

    @Bean
    public CustomerService customerService() {
        return new CustomerService(customerRepository());
    }

}