package com.santana.spring_udemy.services.exceptions;

/*
 * Classe para criar uma mensagem personalizada
 * na camada de serviço
 */
public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id: " + id);
	}
}
