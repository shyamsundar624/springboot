package com.shyam.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.db")
public class DatabbaseConfig {
	private String driver;

	private String url;

	private String username;

	private int password;

	
	
	
public String getDriver() {
		return driver;
	}




	public void setDriver(String driver) {
		this.driver = driver;
	}




	public String getUrl() {
		return url;
	}




	public void setUrl(String url) {
		this.url = url;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public int getPassword() {
		return password;
	}




	public void setPassword(int password) {
		this.password = password;
	}




@Override
public String toString() {
	return "DatabbaseConfig [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
			+ "]";
}


}
