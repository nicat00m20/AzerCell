package com.azercell.azercell.service;

import java.util.List;

import com.azercell.azercell.entity.Customer;
import com.azercell.azercell.model.CustomerInputModel;

public interface CustomerService {

    List<Customer> getAll();
    int add(CustomerInputModel customerInputModel);
}
