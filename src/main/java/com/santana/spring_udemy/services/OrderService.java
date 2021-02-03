package com.santana.spring_udemy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santana.spring_udemy.entities.Order;
import com.santana.spring_udemy.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		List<Order> list = orderRepository.findAll();
		 return list;
	}
	
	public Order findById(Long id){
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
}
