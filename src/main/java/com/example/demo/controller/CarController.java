package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Car;
import com.example.demo.service.ICarService;


@RestController
@RequestMapping("/api/car")
@CrossOrigin
public class CarController {

	@Autowired
	private ICarService carService;
	@GetMapping
	public List<Car> getCarss(){
		return carService.getCars();
		
	}
	@PostMapping
	public void addCar(@RequestBody Car car) {
		carService.addCar(car);;
	}
	
	@PutMapping
	public void updateCar(@RequestBody Car car) {
	
		carService.updateCar(car);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProd(@PathVariable Long id) {
		carService.deleteCar(id);
	}
		
}
