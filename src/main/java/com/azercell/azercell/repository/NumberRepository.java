package com.azercell.azercell.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.azercell.azercell.entity.Number;


@Repository
public interface NumberRepository extends  JpaRepository<Number, Long> {
    
    @Query("Select n from Number n")
    List<Number> getAll();
}
