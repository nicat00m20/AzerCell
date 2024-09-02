package com.unimall.unimall.service;

import java.util.List;

import com.unimall.unimall.entity.Transaction;

public interface TransactionService {
    List<Transaction> getAll();
    Object addTopUp(Integer amount, String gsmNumber);
    Object addPurchase(Integer amount, String gsmNumber);

}
