package com.shyam.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCon {
	private int driver;
	private String url;
	private String username;
	private String password;

	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}

}
