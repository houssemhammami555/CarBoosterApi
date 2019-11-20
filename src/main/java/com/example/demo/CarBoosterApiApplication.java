package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Car;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;

@SpringBootApplication
public class CarBoosterApiApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext ctx	=SpringApplication.run(CarBoosterApiApplication.class, args);
	ProductRepository prodRep =  ctx.getBean(ProductRepository.class) ;
	 CategoryRepository catProd =  ctx.getBean(CategoryRepository.class) ;
	//catProd.save(new Category("Category1"));
	// prodRep.save(new Product("oil", "test", "descrip", 15, 10.5f,(new Category("Category1"))));

	
	
	
	}

}
