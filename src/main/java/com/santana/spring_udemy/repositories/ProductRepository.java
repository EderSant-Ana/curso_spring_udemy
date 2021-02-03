package com.santana.spring_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santana.spring_udemy.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
