package com.unimall.unimall.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String transactionType;
    @Column
    private Integer amount;
    @Column
    private String gsmNumber;
   
   
    public Transaction(Integer amount) {
        this.amount = amount;
    }



    public Transaction() {
    }



    public String getTransactionType() {
        return transactionType;
    }



    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }



    



    public Integer getAmount() {
        return amount;
    }



    public void setAmount(Integer amount) {
        this.amount = amount;
    }



    public String getGsmNumber() {
        return gsmNumber;
    }



    public void setGsmNumber(String gsmNumber) {
        this.gsmNumber = gsmNumber;
    }


    









}
