package com.shyam.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
//http://localhost:9090/test/geta?id=10&name=shyam
	@GetMapping("/geta")
	public ResponseEntity<String> testA(@RequestParam("id") Integer id,@RequestParam("name") String name){
		return ResponseEntity.ok("Given Id "+id+" name : "+name);
		
	}
	//http://localhost:9090/test/getb/10
	@GetMapping("/getb/{id}/{name}")
	public ResponseEntity<String> testB(@PathVariable Integer id,@PathVariable String name){
		return ResponseEntity.ok("Given Id "+id+" Name : "+name);
		
	}
}
