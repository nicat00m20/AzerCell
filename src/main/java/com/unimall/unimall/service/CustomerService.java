package com.unimall.unimall.service;

import java.util.List;

import com.unimall.unimall.entity.Customer;
import com.unimall.unimall.model.CustomerInputModel;

public interface CustomerService {

    List<Customer> getAll();
    int add(CustomerInputModel customerInputModel);
}
