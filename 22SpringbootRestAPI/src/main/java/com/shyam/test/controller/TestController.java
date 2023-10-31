package com.shyam.test.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.test.entity.Student;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/wish")
	public String wish() {
		return "Hi! Good Morning";
	}

	@GetMapping("/show")
	public ResponseEntity<String> testInfo() {
		// Passing Status

		// ResponseEntity<String> response=new ResponseEntity<String>(HttpStatus.OK);

		// Passing Body + Status
		String body = "Hello Programmer";
		// ResponseEntity<String> response=new
		// ResponseEntity<String>(body,HttpStatus.OK);

		// Passing Header + Status
		HttpHeaders headers = new HttpHeaders();
		headers.add("Found", "Activated");
		// ResponseEntity<String> response=new
		// ResponseEntity<String>(headers,HttpStatus.OK);

		// Passing Body + Header + status
		ResponseEntity<String> response = new ResponseEntity<String>(body, headers, HttpStatus.OK);
		return response;
	}

	@GetMapping("/data/{id}")
	public ResponseEntity<?> getObj(@PathVariable int id) {
		ResponseEntity<?> response = null;
		HttpHeaders headers = new HttpHeaders();
		if (id == 12) {
			headers.add("Found", "Yes");
			response = new ResponseEntity<Student>(new Student(12, "SATYAM"), headers, HttpStatus.OK);
		} else {
			headers.add("Found", "No");
			response = new ResponseEntity<String>("Sorry! No Record Found", headers, HttpStatus.BAD_REQUEST);
		}
return response;
	}
}
