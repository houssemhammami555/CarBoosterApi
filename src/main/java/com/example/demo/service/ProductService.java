package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
@Primary
public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepository prodRep;
		
	@Override
	public List<Product> getProducts() {
		return prodRep.findAll();
		
	}

	@Override
	public void addProd(Product prod) {
		prodRep.save(prod);
		
	}

	@Override
	public void updateProd(Product prod) {
		prodRep.save(prod);
		
	}

	@Override
	public void deleteProd(Long id) {
		Product prod = new Product();
		prod.setId(id);
		prodRep.delete(prod);
	}

}
