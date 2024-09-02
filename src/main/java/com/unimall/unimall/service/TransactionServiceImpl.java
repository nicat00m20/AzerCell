package com.unimall.unimall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unimall.unimall.entity.Transaction;
import com.unimall.unimall.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{

@Autowired
TransactionRepository transactionRepository;

    @Override
    public List<Transaction> getAll() {
    List<Transaction> transactionList = transactionRepository.getAll();
       return transactionList;
    }

    @Override
    public Object addTopUp(Integer amount,String gsmNumber) {
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setTransactionType("Top up");
        transaction.setGsmNumber(gsmNumber);
return transactionRepository.save(transaction);
    }

    @Override
    public Object addPurchase(Integer amount,String gsmNumber) {
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setTransactionType("Purchase");
        transaction.setGsmNumber(gsmNumber);
return transactionRepository.save(transaction);
    }
    
}
