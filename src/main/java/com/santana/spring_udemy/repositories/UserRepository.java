package com.santana.spring_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santana.spring_udemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
