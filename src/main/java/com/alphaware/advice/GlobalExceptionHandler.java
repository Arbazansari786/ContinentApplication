package com.alphaware.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lti.dto.ApiResponse;
import com.lti.exception.ContinentSaveException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ContinentSaveException.class)
	public ResponseEntity<ApiResponse<Void>> handleContinentSaveException(ContinentSaveException ex) {

	    ApiResponse<Void> apiResponse = new ApiResponse<>();
	    apiResponse.setMessage(ex.getMessage());
	    apiResponse.setSuccess(false);
	    
	    return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}


}
