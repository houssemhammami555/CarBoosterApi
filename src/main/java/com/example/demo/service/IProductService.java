package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface IProductService {
		List<Product> getProducts();
		void addProd(Product prod);
		void updateProd(Product prod);
		void deleteProd(Long id);

}
