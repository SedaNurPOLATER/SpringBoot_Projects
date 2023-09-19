package com.hoaxify.ws.error;
import java.util.Date;
import java.util.Map;

import lombok.Data;

@Data
public class ApiError {

	private int Status;
	
	private String message;
	
	private String path;
	
	private long timestamp = new Date().getTime();
	
	private Map<String, String> validationErrors;
	
	public ApiError(int status, String message, String path) {
		this.setStatus(status);
		this.setMessage(message);
		this.setPath(path);
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Map<String, String> getValidationErrors() {
		return validationErrors;
	}

	public void setValidationErrors(Map<String, String> validationErrors) {
		this.validationErrors = validationErrors;
	}
}
