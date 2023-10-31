package com.shyam.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.test.exception.StudentNotFoundException;

@RestController
@RequestMapping("/test")
public class TestRestContronller {

	@GetMapping("/one/{id}")
	public ResponseEntity<String> getInfo(@PathVariable int id) {
		if (id == 12) {
			return new ResponseEntity<String>("Student Found", HttpStatus.OK);
		} else {
			throw new StudentNotFoundException("Student Not Found");
		}

	}
}
