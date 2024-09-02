package com.azercell.azercell.entity;

import com.azercell.azercell.model.NumberInputModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="number")
public class Number {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String gsmNumber;
    @Column
    private Integer balance;
    @Column
    private Integer user_id;
    @Column
    private int status;
    
    public Number(NumberInputModel numberInputModel) {
        this.gsmNumber = numberInputModel.gsmNumber();
        this.user_id = numberInputModel.user_id();
        this.balance=100;
        this.status = 1;
    }

    public Number(){

    }

  

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getGsmNumber() {
        return gsmNumber;
    }

    public void setGsmNumber(String gsmNumber) {
        this.gsmNumber = gsmNumber;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    




}
