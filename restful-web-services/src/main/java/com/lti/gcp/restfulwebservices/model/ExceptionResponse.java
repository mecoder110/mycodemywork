package com.lti.gcp.restfulwebservices.model;

import java.util.Date;

public class ExceptionResponse {

	private Date date;
	private String message;
	
	
	
	public ExceptionResponse() {
		super();
	}


	public ExceptionResponse(Date date, String message) {
		super();
		this.date = date;
		this.message = message;
	}


	@Override
	public String toString() {
		return "ExceptionResponse [date=" + date + ", message=" + message + "]";
	}
	
	
}
