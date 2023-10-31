package com.shyam.test.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.test.entity.Student;

@RestController
@RequestMapping("test")
public class StudentRestController {

	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		ResponseEntity<Student> response=new ResponseEntity<Student>(student,HttpStatus.OK);
		return response;
	}
}
