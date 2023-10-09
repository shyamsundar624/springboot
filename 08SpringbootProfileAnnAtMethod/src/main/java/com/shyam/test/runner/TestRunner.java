package com.shyam.test.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.test.entity.Address;
import com.shyam.test.entity.Student;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private Student student;
	
	@Autowired(required = false)
	private Address address;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(student);
System.out.println(address);
	}

}
