package com.santana.spring_udemy.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santana.spring_udemy.entities.Category;
import com.santana.spring_udemy.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService orderService;
	
	@GetMapping
	public ResponseEntity<List<Category>> buscar() {
		List<Category> orders = orderService.findAll();
		return ResponseEntity.ok().body(orders);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category user = orderService.findById(id);
		return ResponseEntity.ok().body(user);
	}

}
