package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Car;

public interface ICarService {
	List<Car> getCars();
	void addProd(Car prod);
	void updateProd(Car prod);
	void deleteProd(Long id);


}
