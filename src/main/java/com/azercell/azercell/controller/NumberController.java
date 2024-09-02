package com.azercell.azercell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azercell.azercell.model.NumberInputModel;
import com.azercell.azercell.service.NumberService;
import com.azercell.azercell.service.TransactionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/number")
@Tag(name = "Number", description = "the Number api")
public class NumberController {
    
    @Autowired
    NumberService numberService;

    @Autowired
    TransactionService transactionService;

    @Operation(summary = "Add  number", description = "there you can add number", tags = { "Number" })
    @PostMapping
    public String add(@RequestBody NumberInputModel numberInputModel) {
      
        numberService.add(numberInputModel);
        
        return "Number was successfully added!";
    }
    


     @Operation(summary = "Top up money", description = "there you can increase balance")
    @PutMapping("/{id}")
    public Object topUp(@PathVariable long id, @RequestBody Integer topUpAmount){
    
        
        return numberService.topUp(id, topUpAmount);

    }
    @Operation(summary = "Purchase", description = "there you can make apurchase")
    @PutMapping("purchase/{id}")
    public Object purchase(@PathVariable long id, @RequestBody Integer purchaseAmount){
        return numberService.purchase(id, purchaseAmount);
    
    }


}
