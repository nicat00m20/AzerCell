package com.unimall.unimall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unimall.unimall.model.NumberInputModel;
import com.unimall.unimall.service.NumberService;
import com.unimall.unimall.service.TransactionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/number/v2")
@Tag(name = "Number V2", description = "the Number api")
public class NumberControllerV2 {
    
    @Autowired
    NumberService numberService;

    @Autowired
    TransactionService transactionService;

    @Operation(summary = "Add  number", description = "there you can add number", tags = { "Number V2" })
    @PostMapping
    public String add(@RequestBody NumberInputModel numberInputModel) {
      
        int status =numberService.add(numberInputModel);
        try{
            if (status==1){
                return "{\"success\": true, \"message\": \"Number was successfully added!\" \"Code: 200\"}";

            }
        }catch (Exception e) {
            return "{\"success\": false, \"message\": \"Internal Server Error!\" \"Code: 500\"}";
        }
        return "{\"success\": false, \"message\": \"Unexpected Error Occured!\"}";
    }
    


     @Operation(summary = "Top up money", description = "there you can increase balance")
    @PutMapping("/{id}")
    public Object topUp(@PathVariable long id, @RequestBody Integer topUpAmount){
       
        try{ 
            int status = numberService.topUp(id, topUpAmount);
            if(status == 1){
            return "{\"success\": true, \"message\": \"Top up was successfully completed!\" \"Code: 200\"}";
          }else if(status == 0){
            return "{\"success\": false, \"message\": \"Account with an Id of "+id+" could not be found!\" \"Code: 404\"}";
          }
        }catch (Exception e) {
            return "{\"success\": false, \"message\": \"Internal Server Error!\" \"Code: 500\"}";
        }
        return "{\"success\": false, \"message\": \"Unexpected Error Occured!\"}";
     
      

    }
    @Operation(summary = "Purchase", description = "there you can make apurchase")
    @PutMapping("purchase/{id}")
    public Object purchase(@PathVariable long id, @RequestBody Integer purchaseAmount){
        try {
            int status = numberService.purchase(id, purchaseAmount);
            if (status == 0) {
                return "{\"success\": false, \"message\": \"Account with an Id of " + id + " could not be found!\" \"Code: 404\"}";
            } else if (status == 2) {
                return "{\"success\": false, \"message\": \"Not enough balance to complete the purchase!\" \"Code: 400\"}";
            } else if (status == 1) {
                return "{\"success\": true, \"message\": \"Purchase was successfully completed!\" \"Code: 200\"}";
            }
        } catch (Exception e) {
            return "{\"success\": false, \"message\": \"Internal Server Error!\" \"Code: 500\"}";
        }
        return "{\"success\": false, \"message\": \"Unexpected Error Occured!\"}";


    }


}
