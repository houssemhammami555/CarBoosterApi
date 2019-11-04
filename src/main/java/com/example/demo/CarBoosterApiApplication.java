package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Car;
import com.example.demo.entity.Product;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.ProductRepository;

@SpringBootApplication
public class CarBoosterApiApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext ctx	=SpringApplication.run(CarBoosterApiApplication.class, args);
	CarRepository prodRep =  ctx.getBean(CarRepository.class) ;
	
	 prodRep.save(new Car("212TN456",10825684,false,0,"BMW","problem de volant"));
	}

}
