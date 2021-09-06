package com.lti.gcp.restfulwebservices.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.lti.gcp.restfulwebservices.model.ExceptionResponse;

@ControllerAdvice
@RestController
public class UserExceptionHandler extends ResponseEntityExceptionHandler {
	
	/*
	 * @ExceptionHandler(Exception.class) private final ResponseEntity<Object>
	 * AllException(Exception e){
	 * 
	 * ExceptionResponse eR=new ExceptionResponse(new Date(), e.getMessage());
	 * ResponseEntity<Object> rEntity=new ResponseEntity<Object>(eR,
	 * HttpStatus.INTERNAL_SERVER_ERROR );
	 * 
	 * return rEntity;
	 * 
	 * }
	 */
	@ExceptionHandler(UserUnderstoodException.class)
	public final ResponseEntity<Object> ResultNotFoundException(UserUnderstoodException e,WebRequest wb){
		System.out.println("=====================23456788990876543==78654345=67898897654=4566766554=");
		ExceptionResponse eR=new ExceptionResponse(new Date(), e.getMessage());
		ResponseEntity<Object> rEntity=new ResponseEntity<Object>(eR, HttpStatus.NOT_FOUND );
		
		return rEntity;
		
	}
	
}
