package com.santana.spring_udemy.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.santana.spring_udemy.services.exceptions.ResourceNotFoundException;

/*
 * Intercepta as exceções para que este objeto possa executar um
 * possível tratamento
 */
@ControllerAdvice
public class ResourceExceptionHandler {

	/*
	 * Tratamento exceção findById
	 */
	@ExceptionHandler
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
