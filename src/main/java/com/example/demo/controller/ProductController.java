package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ICrudService;


@RestController
@RequestMapping("/api/product")
@CrossOrigin
public class ProductController {
	@Autowired
	private ICrudService<Product, Long> prodService;
	@GetMapping
	public List<Product> getAll(){
		return prodService.getAll();
		
	}
	@PostMapping
	public void add(@RequestBody Product prod) {
		prodService.add(prod);
	}
	
	@PutMapping
	public void update(@RequestBody Product prod) {
		System.out.print(prod.getPname());
		prodService.update(prod);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		prodService.delete(id);
	}

}
