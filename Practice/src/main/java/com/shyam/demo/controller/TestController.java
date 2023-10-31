package com.shyam.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.demo.exception.StudentNotFoundException;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/one/{id}")
	public ResponseEntity<String> getInfo(@PathVariable int id) {
		if (id == 150) {
			return new ResponseEntity<String>("Product Exists", HttpStatus.OK);
		} else {
			throw new StudentNotFoundException("Student Not FOund " + id);
		}
	}
}
