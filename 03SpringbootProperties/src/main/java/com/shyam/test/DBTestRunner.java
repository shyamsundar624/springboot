package com.shyam.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBTestRunner implements CommandLineRunner {
	@Autowired
	private DatabbaseConfig config;

	@Override
	public void run(String... args) throws Exception {
System.out.println(config);
	}

}
