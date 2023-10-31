package com.shyam.test.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

	@GetMapping("/show")
	public String helloMsgGet() {
		return "Hello From GET";
	}
	
	@PostMapping("/show")
	public String helloMsgPost() {
		return "Hello From POST";
	}
	
	@DeleteMapping("/show")
	public String helloMsgDelete() {
		return "Hello From DELETE";
	}
	
	@PatchMapping("/show")
	public String helloMsgPatch() {
		return "Hello From PATCH";
	}
	
	@PostMapping("/head")
	public String readHead(@RequestHeader(required = false) String dept,@RequestHeader("Content-Type") String type,@RequestBody String myData) {
		return "Hello Head "+dept+", "+type+" , Body "+myData;
		
	}
}
