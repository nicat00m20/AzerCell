package com.unimall.unimall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unimall.unimall.entity.Customer;
import com.unimall.unimall.model.CustomerInputModel;
import com.unimall.unimall.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public List<Customer> getAll() {
        List<Customer> customerList  =  customerRepository.getAll();
    return customerList;
    }

    @Override
    public int add(CustomerInputModel customerInputModel) {
        Customer customer = new Customer(customerInputModel);
        customer.setName(customerInputModel.name());
        customer.setSurname(customerInputModel.surname());
        customer.setBirthDate(customerInputModel.birthDate());
        
    customerRepository.save(customer);

       return 1;
    }

 

    
}
