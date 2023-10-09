package com.shyam.test.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.test.entity.DBConfig;

@Component
public class TestDataRunner implements CommandLineRunner {
	@Autowired
	private DBConfig dbConfig;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(dbConfig);
	}

}
