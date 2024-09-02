package com.azercell.azercell.service;

import java.util.List;

import com.azercell.azercell.entity.Transaction;

public interface TransactionService {
    List<Transaction> getAll();
    Object addTopUp(Integer amount, String gsmNumber);
    Object addPurchase(Integer amount, String gsmNumber);

}
