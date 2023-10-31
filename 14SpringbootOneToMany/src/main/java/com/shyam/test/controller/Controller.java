package com.shyam.test.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.test.entity.Car;
import com.shyam.test.entity.Model;
import com.shyam.test.repo.Repository;

@RestController
public class Controller {

	@Autowired
	private Repository repo;
	
	@PostMapping("/save")
	public Car saveCar() {
		Model m1 = new Model();
		m1.setColor("white");
		m1.setModelName("ZXI");
		Model m2 = new Model();
		m2.setColor("Silver");
		m2.setModelName("ZXI Plus");
		
		Car car=new Car();
		car.setName("CELERIO");
		car.setModels(Arrays.asList(m1,m2));
		
		
		Car save = repo.save(car);
		
		return save;
		
	}
}
