package com.unimall.unimall.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "brands")
public class Brand {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id; 
    @Column
    private String name;
    @Column
    private int status;
    
    public Brand(String name) {
        this.name = name;
        this.status=1;
    }
    public Brand(){}
    
    public long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Brand [id=" + id + ", name=" + name + ", status=" + status + "]";
    }



}
