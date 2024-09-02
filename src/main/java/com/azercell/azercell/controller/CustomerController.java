package com.azercell.azercell.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.azercell.azercell.model.CustomerInputModel;
import com.azercell.azercell.service.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/customer")
@Tag(name = "Customer", description = "the Customer api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Operation(summary = "Add  customer", description = "there you can add customer", tags = { "Customer" })
    @PostMapping
    public Object add(@RequestBody CustomerInputModel customerInputModel) {
        customerService.add(customerInputModel);
        return "Product was successfully added!";
    }
   
}
