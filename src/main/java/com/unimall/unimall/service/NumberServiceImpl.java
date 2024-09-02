package com.unimall.unimall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unimall.unimall.entity.Number;
import com.unimall.unimall.model.NumberInputModel;
import com.unimall.unimall.repository.NumberRepository;



@Service
public class NumberServiceImpl implements NumberService{

@Autowired
NumberRepository numberRepository;

@Autowired
TransactionService transactionService;

    @Override
    public List<Number> getAll() {
List<Number> numberList = numberRepository.getAll();

return numberList;
    }

    @Override
    public int add(NumberInputModel numberInputModel) {
        Number number = new Number(numberInputModel);
        number.setBalance(100);
        number.setGsmNumber(numberInputModel.gsmNumber());
        number.setStatus(1);
        number.setUser_id(numberInputModel.user_id());

        numberRepository.save(number);
        return 1;
    }

      @Override
    public int topUp(long id, Integer topUpAmount) {
        Number number = numberRepository.findById(id).orElse(null);
        if(number == null){
            return 0;
        }else{
            number.setBalance(number.getBalance()+topUpAmount);
            numberRepository.save(number);
           
            transactionService.addTopUp(topUpAmount,number.getGsmNumber());

            return 1;
        }
    }

   @Override
    public int purchase(long id, Integer purchaseAmount) {
        Number number = numberRepository.findById(id).orElse(null);
        if(number == null){
            return 0;
        }else if(number.getBalance() < purchaseAmount){
        return 2;
        }else{
            number.setBalance(number.getBalance()-purchaseAmount);
            transactionService.addPurchase(purchaseAmount,number.getGsmNumber());
            numberRepository.save(number);
            return 1;
        }
    }
    
}
