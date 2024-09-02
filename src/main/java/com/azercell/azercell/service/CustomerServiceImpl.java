package com.azercell.azercell.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azercell.azercell.entity.Customer;
import com.azercell.azercell.model.CustomerInputModel;
import com.azercell.azercell.repository.CustomerRepository;
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
