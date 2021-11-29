package com.educandoweb.cursomc.services.exceptions;

public class DataIntegrityExeception extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataIntegrityExeception(String msg) {
		super(msg);
	}
	
	public DataIntegrityExeception(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
