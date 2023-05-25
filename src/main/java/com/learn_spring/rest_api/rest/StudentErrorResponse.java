package com.learn_spring.rest_api.rest;

public class StudentErrorResponse {
	private int statusCode;

	private boolean status;

	private String message;

	private long timeStamp;


	public StudentErrorResponse() {
	}

	public StudentErrorResponse(int statusCode, boolean status, String message, long timeStamp) {
		this.statusCode = statusCode;
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}

	public int getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public boolean isStatus() {
		return this.status;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
