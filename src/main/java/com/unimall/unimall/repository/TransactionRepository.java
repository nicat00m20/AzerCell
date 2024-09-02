package com.unimall.unimall.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.unimall.unimall.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
    
@Query("Select t from Transaction t")
List<Transaction> getAll();

}
