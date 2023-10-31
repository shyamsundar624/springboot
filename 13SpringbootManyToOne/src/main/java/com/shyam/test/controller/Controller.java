package com.shyam.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.test.entity.Department;
import com.shyam.test.entity.Employee;
import com.shyam.test.repo.DepartmentRepository;
import com.shyam.test.repo.EmployeeRepository;

@RestController
public class Controller {
	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private DepartmentRepository deptRepo;

	@PostMapping("/save")
	public Employee saveEmp(@RequestBody Employee employee) {
		/*
		 * Employee emp = new Employee(); emp.setName("Sangam");
		 * 
		 * Department dept = new Department(); dept.setName("DEV");
		 * 
		 * emp.setDepartment(dept); //deptRepo.save(dept);
		 */		Employee save = empRepo.save(employee);

		return save;
	}
}
