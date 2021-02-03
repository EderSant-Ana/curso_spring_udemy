package com.santana.spring_udemy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santana.spring_udemy.entities.User;
import com.santana.spring_udemy.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		List<User> list = userRepository.findAll();
		 return list;
	}
	
	public User findById(Long id){
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
}
