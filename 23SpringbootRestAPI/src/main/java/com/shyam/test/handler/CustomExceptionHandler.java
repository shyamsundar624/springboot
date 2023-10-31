package com.shyam.test.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.shyam.test.exception.StudentNotFoundException;
import com.shyam.test.response.ErrorResponse;

@RestControllerAdvice
public class CustomExceptionHandler {

	/*
	 * @ExceptionHandler(StudentNotFoundException.class) public
	 * ResponseEntity<String> getErrorMsg(StudentNotFoundException snfe){ return new
	 * ResponseEntity<String>(snfe.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR); }
	 */
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorResponse> getErrorMsg(StudentNotFoundException snfe){
		return new ResponseEntity<ErrorResponse>(new ErrorResponse(new Date().toString(),"Some Exception Occured",500,snfe.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
