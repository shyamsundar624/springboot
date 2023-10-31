package com.shyam.test.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class StudentRestController {

	@GetMapping("/get")
	public ResponseEntity<String> getMsg(){
		ResponseEntity<String> response=new ResponseEntity<String>("FROM GET METHOD",HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> getPost(){
		ResponseEntity<String> response=new ResponseEntity<String>("FROM POST METHOD",HttpStatus.OK);
		return response;
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(){
		ResponseEntity<String> response=new ResponseEntity<String>("FROM DELETE METHOD",HttpStatus.OK);
		return response;
	}
	
	@PutMapping("/put")
	public ResponseEntity<String> update(){
		ResponseEntity<String> response=new ResponseEntity<String>("FROM PUT METHOD",HttpStatus.OK);
		return response;
	}
	
	@PatchMapping("/patch")
	public ResponseEntity<String> patch(){
		ResponseEntity<String> response=new ResponseEntity<String>("FROM PATCH METHOD",HttpStatus.OK);
		return response;
	}
}
