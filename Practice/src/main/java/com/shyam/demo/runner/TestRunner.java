package com.shyam.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.demo.DatabaseCon;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private DatabaseCon con;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(con);
	}

}
