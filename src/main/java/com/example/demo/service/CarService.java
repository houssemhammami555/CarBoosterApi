package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.ProductRepository;

public class CarService implements ICarService {
	
	@Autowired
	private CarRepository carRep;
		

	@Override
	public List<Car> getCars() {
		return carRep.findAll();
	}

	@Override
	public void addProd(Car car) {
		carRep.save(car);
		
	}

	@Override
	public void updateProd(Car car) {
		carRep.save(car);
		
	}

	@Override
	public void deleteProd(Long id) {
		Car car = new Car();
		car.setId(id);
		carRep.delete(car);
		
	}

}
