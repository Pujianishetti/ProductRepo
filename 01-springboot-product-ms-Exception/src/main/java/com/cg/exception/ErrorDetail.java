package com.cg.exception;

import java.util.Date;

public class ErrorDetail {
	private Date timeStamp;
	private String message;
	private String details;
	public ErrorDetail(Date timeStamp, String message, String details) {
		super();
		timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getDetails() {
		return details;
	}
	

}
