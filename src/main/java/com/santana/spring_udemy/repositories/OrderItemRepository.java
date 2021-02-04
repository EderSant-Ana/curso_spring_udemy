package com.santana.spring_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santana.spring_udemy.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
