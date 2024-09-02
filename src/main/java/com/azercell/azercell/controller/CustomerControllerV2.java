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
@RequestMapping("/customer/v2")
@Tag(name = "Customer V2", description = "the Customer api")
public class CustomerControllerV2 {

    @Autowired
    CustomerService customerService;

    @Operation(summary = "Add  customer", description = "there you can add customer", tags = { "Customer V2" })
    @PostMapping
    public Object add(@RequestBody CustomerInputModel customerInputModel) {
        int status = customerService.add(customerInputModel);
        try{
            if (status==1){
                return "{\"success\": true, \"message\": \"Number was successfully added!\" \"Code: 200\"}";

            }
        }catch (Exception e) {
            return "{\"success\": false, \"message\": \"Internal Server Error!\" \"Code: 500\"}";
        }
        return "{\"success\": false, \"message\": \"Unexpected Error Occured!\"}";
    }
   
}
