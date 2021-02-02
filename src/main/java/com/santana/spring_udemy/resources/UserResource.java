package com.santana.spring_udemy.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santana.spring_udemy.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> buscar() {
		User user = new User(3L, "Eder", "edersana@gmail.com", "1980586008", "123456");
		return ResponseEntity.ok().body(user);
	}

}
