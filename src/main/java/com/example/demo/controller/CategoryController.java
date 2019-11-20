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

import com.example.demo.entity.Category;
import com.example.demo.service.ICrudService;

@RestController
@RequestMapping("/api/category")
@CrossOrigin
public class CategoryController {
	
	@Autowired
	private ICrudService<Category, Long> cateService;
	
	@GetMapping
	public List<Category> getAll(){
		return cateService.getAll();
		
	}
	@PostMapping
	public void add(@RequestBody Category prod) {
		cateService.add(prod);
	}
	
	@PutMapping
	public void update(@RequestBody Category prod) {
		System.out.print(prod.getName());
		cateService.update(prod);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		cateService.delete(id);
	}
}
