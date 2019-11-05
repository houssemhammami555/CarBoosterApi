package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;

@Service
public class CarService implements ICarService {
	
	@Autowired
	private CarRepository carRep;
		

	@Override
	public List<Car> getCars() {
		return carRep.findAll();
	}

	@Override
	public void addCar(Car car) {
		carRep.save(car);
		
	}

	@Override
	public void updateCar(Car car) {
		carRep.save(car);
		
	}

	@Override
	public void deleteCar(Long id) {
		Car car = new Car();
		car.setId(id);
		carRep.delete(car);
		
	}

}
