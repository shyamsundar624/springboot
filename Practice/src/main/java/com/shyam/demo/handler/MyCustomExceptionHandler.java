package com.shyam.demo.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.shyam.demo.ErrorResponse;
import com.shyam.demo.exception.StudentNotFoundException;

@RestControllerAdvice
public class MyCustomExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorResponse> showErrorMsg(StudentNotFoundException snfe) {
		return new ResponseEntity<ErrorResponse>(new ErrorResponse(new Date().toString(),"Exception In Process",500,snfe.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
