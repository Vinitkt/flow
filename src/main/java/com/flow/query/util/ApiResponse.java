package com.flow.query.util;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ApiResponse {

	@ApiModelProperty(required = true)
	private int status;
	private String message;
	private Object data;

	public ApiResponse() {
	}

	public ApiResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public ApiResponse(int status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}
}
