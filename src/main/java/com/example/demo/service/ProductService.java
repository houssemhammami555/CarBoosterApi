package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
@Primary
public class ProductService implements ICrudService<Product, Long> {
	
	@Autowired
	private ProductRepository prodRep;
		
	@Override
	public List<Product> getAll() {
		return prodRep.findAll();
		
	}

	@Override
	public void add(Product prod) {
		prodRep.save(prod);
		
	}

	@Override
	public void update (Product prod) {
		prodRep.save(prod);
		
	}

	@Override
	public void delete(Long id) {
		Product prod = new Product();
		prod.setId(id);
		prodRep.delete(prod);
	}

}
