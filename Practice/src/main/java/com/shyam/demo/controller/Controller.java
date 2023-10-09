package com.shyam.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.demo.entity.Employee;
import com.shyam.demo.repo.EmployeeRepository;

@RestController
public class Controller {

	@Autowired
	private EmployeeRepository repo;

	@PostMapping("/save")
	public Employee saveEMp(@RequestBody Employee employee) {
		return repo.save(employee);
	}

	@GetMapping("/all")
	public List<Employee> name() {
		return repo.findAll();
	}

}
