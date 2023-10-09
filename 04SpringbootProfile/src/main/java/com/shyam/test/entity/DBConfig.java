package com.shyam.test.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Component
@ToString
@ConfigurationProperties("my.db")
public class DBConfig {
	private String driver;
	private String url;
	private String username;
	private String password;
}
