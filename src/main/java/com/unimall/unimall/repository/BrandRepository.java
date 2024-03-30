package com.unimall.unimall.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unimall.unimall.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
   
    @Query("Select b from Brand b")
    List<Brand> getBrands();
    
}   
