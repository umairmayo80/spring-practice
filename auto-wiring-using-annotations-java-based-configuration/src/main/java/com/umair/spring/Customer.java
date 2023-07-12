package com.umair.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Customer {
    private String name;

    private Address address;


    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }


    @PostConstruct
    public void init(){
        name = "John";
        System.out.println("init-method");
    }


    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method called");
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
