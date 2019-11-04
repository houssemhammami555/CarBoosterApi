package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;

@Service

public class ProductMockService implements IProductService {
		private List<Product> products;	
	public ProductMockService() {
		products = new ArrayList<Product>();
		//products.add(new Product("car","bmw","car to fix",1,400.0f));
		products.add(new Product("wheel","black","wheel to fix",4,50.0f));
		products.add(new Product("oil","olibia","oil to sell",15,20.0f));
	}
	

		
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public void addProd(Product prod) {
		products.add(prod);
		
	}

	@Override
	public void updateProd(Product prod) {
		products.remove(prod);
		products.add(prod);
		
	}

	@Override
	public void deleteProd(Long id) {
		Product prod = new Product();
		prod.setId(id);
		products.remove(prod);
		
	}

}
