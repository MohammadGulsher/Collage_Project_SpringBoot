package com.collage.Collage_Project.Entity;

import org.springframework.stereotype.Component;

@Component
public class ResponseStructure<T> {
	
	private int statusCode;
	
	private String message;
	
	private T Data;

	public ResponseStructure() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseStructure(int statusCode, String message, T data) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		Data = data;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return Data;
	}

	public void setData(T data) {
		Data = data;
	}

	@Override
	public String toString() {
		return "ResponseStructure [statusCode=" + statusCode + ", message=" + message + ", Data=" + Data + "]";
	}

	
}
