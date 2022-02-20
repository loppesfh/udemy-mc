package com.udemy.mc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.mc.domain.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
