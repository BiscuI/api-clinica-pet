package com.firstproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.firstproject.entities.Product;
import com.firstproject.repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductResource {
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = productRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product product = productRepository.findById(id).get();
		return ResponseEntity.ok().body(product);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@RequestBody Product product) {
		productRepository.save(product);
	}
}
