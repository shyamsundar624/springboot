package com.shyam.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.shyam.test.entity.Address;

@Configuration
public class AppConfig {
	@Bean
	@Profile({ "qa", "prod" })
	public Address address() {
		Address address = new Address();
		address.setPincode("322444");
		address.setStateName("Bihar");
		return address;
	}
}
