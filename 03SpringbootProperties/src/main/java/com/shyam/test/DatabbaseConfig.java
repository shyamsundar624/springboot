package com.shyam.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabbaseConfig {
@Value("${my.db.driver}")
	private String driver;

@Value("${my.db.url}")
	private String url;

@Value("${my.db.username}")
	private String username;

@Value("${my.db.password}")
	private int password;

@Override
public String toString() {
	return "DatabbaseConfig [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
			+ "]";
}


}
