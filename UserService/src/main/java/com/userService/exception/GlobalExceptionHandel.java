package com.userService.exception;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.userService.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandel {
	
	@ExceptionHandler
	public ResponseEntity<String> handlerResorceNotFounException(ConfigDataResourceNotFoundException ex){
		
		String message = ex.getMessage();
			
		return ResponseEntity.ok(message);
		
	}

}
