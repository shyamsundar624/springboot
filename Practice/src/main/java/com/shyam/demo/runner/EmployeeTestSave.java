package com.shyam.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.shyam.demo.entity.Employee;
import com.shyam.demo.entity.IDCard;
import com.shyam.demo.repo.EmployeeRepository;

@Component
@Order(1)
public class EmployeeTestSave implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee();
		e1.setId(12);
		e1.setName("Pankaj");
		IDCard card = new IDCard();
		card.setNumber(324324324);
		e1.setIdCard(card);
		card.setEmployee(e1);
		repo.save(e1);
		
		
	}

}
