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
import com.example.demo.service.IProductService;

@RestController
@RequestMapping("/api/product")
@CrossOrigin
public class ProductController {
	@Autowired
	private IProductService prodService;
	@GetMapping
	public List<Product> getProducts(){
		return prodService.getProducts();
		
	}
	@PostMapping
	public void addProd(@RequestBody Product prod) {
		prodService.addProd(prod);
	}
	
	@PutMapping
	public void updatePRod(@RequestBody Product prod) {
		System.out.print(prod.getPname());
		prodService.updateProd(prod);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProd(@PathVariable Long id) {
		prodService.deleteProd(id);
	}

}
