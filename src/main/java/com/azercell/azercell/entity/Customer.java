package com.azercell.azercell.entity;

import com.azercell.azercell.model.CustomerInputModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
    @Table(name = "customers")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String birthDate;
   
    
    public Customer(CustomerInputModel customerInputModel) {
        this.name = customerInputModel.name();
        this.surname = customerInputModel.surname();
        this.birthDate = customerInputModel.birthDate();
        
    }

    public Customer(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
   
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
   
    @Override
    public String toString() {
        return "Customer [name=" + name + ", surname=" + surname + ", birthDate="
                + birthDate +"]";
    }


}
