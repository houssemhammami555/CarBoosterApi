package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Car;

public interface ICarService {
	List<Car> getCars();
	void addCar(Car car);
	void updateCar(Car car);
	void deleteCar(Long id);


}
